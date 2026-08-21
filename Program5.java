import java.util.Scanner;

class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        int length = password.length();

        if (length < 8)
            System.out.println("Password is less than 8 characters.");
        else if (length < 12)
            System.out.println("Password is acceptable.");
        else
            System.out.println("Password is strong.");
    }
}
