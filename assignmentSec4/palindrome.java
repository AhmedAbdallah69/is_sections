import java.util.Scanner;
/**
 *Author: Ahmed Abdallah
 */
public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str;
        boolean f = true;
        int size;
        System.out.println("enter a text");
        str = input.next();
        size = str.length();
        for (int i = 0; i < size / 2; i++){
            if (str.charAt(i) != str.charAt(size-i-1)) {
                f = false;
                break;
            }
        }
        if(f)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");


    }
}
