import java.util.Scanner;
 public class StudentLoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctUsername = "Ram";
        String correctPassword = "123";
        int attempts = 3;

        while (attempts > 0) {
        System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful");
                break;
    } else {
                attempts--;
                System.out.println("Wrong Passwords! Attempts left: " + attempts); } }

        if (attempts == 0) {
            System.out.println("Account locked "); }  }  }