import java.util.Scanner;

class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positive");

            if (num % 2 == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }
        else if (num < 0) {
            System.out.println("Negative");

            if (num % 2 == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }
        else {
            System.out.println("Zero");
        }
    }
}
