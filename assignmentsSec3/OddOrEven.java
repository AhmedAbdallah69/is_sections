import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double l1, l2, l3, perimeter;

        System.out.print("enter an edge length: ");
        l1 = input.nextInt();
        System.out.print("enter an edge length: ");
        l2 = input.nextInt();
        System.out.print("enter an edge length: ");
        l3 = input.nextInt();

        if (l1 + l2 > l3 && l2 + l3 > l1 && l1 + l3 > l2)
        {
            perimeter = l1 + l2 + l3;
            System.out.println("the perimeter is " + perimeter);
        }
        else
            System.out.println("input is not valid");


    }
}
