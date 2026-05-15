import java.util.Scanner;

public class userinput {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a, b, sum;

        // Taking input from user
        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        // Adding numbers
        sum = a + b;

        // Display result
        System.out.println("Sum = " + sum);

        sc.close();
    }
}