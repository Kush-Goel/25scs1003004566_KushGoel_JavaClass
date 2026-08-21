import java.util.Scanner;

class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();

        if (day >= 1 && day <= 5)
            System.out.println("It is a working day.");
        else if (day == 6 || day == 7)
            System.out.println("It is a weekend.");
        else
            System.out.println("Invalid day number.");
    }
}
