import java.util.Random;
import java.util.Scanner;

public class Login_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "Sumit";
        String password = "1234";

        System.out.println("Username:");
        String Username = sc.nextLine();
        System.out.println("Password:");
        String Password = sc.nextLine();

        if (username.equals(Username)) {
            if (password.equals(Password)) {
                System.out.println("Login successful!");
                System.out.println("Chose the program:");
                System.out.println("1:Calculator");
                System.out.println("2:Guessing Game");
                System.out.println("3:SI Calculator");
                System.out.println("4:Check if entered char is volwel or Constant");

                System.out.println("Enter number: ");
                int num = sc.nextInt();

                if (num == 1) {
                    System.out.println("Welcome to Calculator!!!");

                    System.out.print("Enter First Number: ");
                    double num1 = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    double num2 = sc.nextDouble();

                    System.out.print("Enter Operation: ");
                    String operation = sc.next();

                    switch (operation) {

                        case "+":
                            System.out.println(num1 + num2);
                            break;
                        case "-":
                            System.out.println(num1 - num2);
                            break;
                        case "*":
                            System.out.println(num1 * num2);
                            break;
                        case "/":
                            System.out.println(num1 / num2);

                        default:
                            System.out.println("invalid");
                    }
                } else if (num == 2) {
                    System.out.println("Welcome to Guessing Game!!!");
                    Random random = new Random();
                    int number = random.nextInt(6);

                    System.out.println("You Choose Guessing Game!");
                    while (true) {
                        System.out.print("Enter your guess (1-5): ");
                        int guess = sc.nextInt();
                        if (guess == number) {
                            System.out.println("Your Guess is Correct");
                            break;
                        } else if (guess < number) {
                            System.out.println("Try High.");
                        } else {
                            System.out.println("Try Low.");
                        }
                    }
                } else if (num == 3) {
                    System.out.println("Welcome to SI Calculator!!!");

                    System.out.println("Enter Principal: ");
                    double principal = sc.nextDouble();
                    System.out.println("Enter Time:");
                    double time = sc.nextDouble();
                    System.out.println("Enter Rate:");
                    double rate = sc.nextDouble();

                    double SI = (principal * time * rate) / 100;

                    System.out.println("si =" + SI);

                } else if (num == 4) {
                    System.out.println("Check if the Char is Vowel or Consonant!!! ");
                    System.out.println("Enter Char:");
                    String Character = sc.next();

                    switch (Character) {

                        case "a":
                        case "e":
                        case "i":
                        case "o":
                        case "u":
                        case "A":
                        case "E":
                        case "I":
                        case "O":
                        case "U":
                            System.out.println("The char is Vowel");
                            break;
                        default:
                            System.out.println("The char is Consonant");
                    }
                } else {
                    System.out.println("Invalid Input");
                }
            } else {
                System.out.println("Invalid Password.");
            }
        }else {
            System.out.println("Invalid Email.");
        }
    }
}

