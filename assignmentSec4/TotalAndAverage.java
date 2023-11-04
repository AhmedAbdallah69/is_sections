import java.util.Scanner;
/**
 *Author: Ahmed Abdallah
 */
public class TotalAndAverage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0, count = 0;
        float avg;
        System.out.println("enter a number that is not 0: ");
        int x = input.nextInt();
        while (x != 0){
            sum += x;
            count++;
            System.out.printf("enter number %d: ", count+1);
            x = input.nextInt();
        }
        avg = sum / count;
        System.out.println("avg: " + avg + " sum: " + sum);
    }
}
