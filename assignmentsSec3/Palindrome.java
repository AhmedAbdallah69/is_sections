import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int x;

        System.out.println("enter a three-digit number: ");
        x =  input.nextInt();

        if ((x / 100) == (x % 10))
            System.out.println(x + " is a palindrome");

        else
            System.out.println(x + " isn't a palindrome");


    }
}
