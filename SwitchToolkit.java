import java.util.Scanner;

public class SwitchToolkit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Switch Toolkit (Java) ===");

        while (running) {
            System.out.println("\n-- Main Menu --");
            System.out.println("1) Calculator");
            System.out.println("2) Temperature Converter");
            System.out.println("3) Day Mapper (1-7)");
            System.out.println("4) Grade from Score (0-100)");
            System.out.println("5) Exit");
            System.out.print("Choose option: ");

            int choice = readInt(scanner);

            switch (choice) {
                case 1:
                    calculator(scanner);
                    break;
                case 2:
                    temperatureConverter(scanner);
                    break;
                case 3:
                    dayMapper(scanner);
                    break;
                case 4:
                    gradeFromScore(scanner);
                    break;
                case 5:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }

    // 1) Calculator using switch
    private static void calculator(Scanner scanner) {
        System.out.print("Enter first number: ");
        double a = readDouble(scanner);
        System.out.print("Enter second number: ");
        double b = readDouble(scanner);

        System.out.println("Operation:");
        System.out.println("1) +  2) -  3) *  4) /");
        System.out.print("Choose: ");
        int op = readInt(scanner);

        switch (op) {
            case 1:
                System.out.println("Result: " + (a + b));
                break;
            case 2:
                System.out.println("Result: " + (a - b));
                break;
            case 3:
                System.out.println("Result: " + (a * b));
                break;
            case 4:
                switch ((b == 0) ? 0 : 1) {
                    case 0:
                        System.out.println("Cannot divide by zero.");
                        break;
                    case 1:
                        System.out.println("Result: " + (a / b));
                        break;
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }

    // 2) Temperature converter using switch
    private static void temperatureConverter(Scanner scanner) {
        System.out.println("Convert:");
        System.out.println("1) C -> F");
        System.out.println("2) F -> C");
        System.out.println("3) C -> K");
        System.out.println("4) K -> C");
        System.out.print("Choose: ");
        int c = readInt(scanner);

        System.out.print("Enter value: ");
        double t = readDouble(scanner);

        switch (c) {
            case 1:
                System.out.println(t + "°C = " + ((t * 9 / 5) + 32) + "°F");
                break;
            case 2:
                System.out.println(t + "°F = " + ((t - 32) * 5 / 9) + "°C");
                break;
            case 3:
                System.out.println(t + "°C = " + (t + 273.15) + " K");
                break;
            case 4:
                System.out.println(t + " K = " + (t - 273.15) + "°C");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    // 3) Day mapper using switch
    private static void dayMapper(Scanner scanner) {
        System.out.print("Enter number (1-7): ");
        int d = readInt(scanner);

        switch (d) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day.");
        }
    }

    // 4) Grade from score using switch
    private static void gradeFromScore(Scanner scanner) {
        System.out.print("Enter score (0-100): ");
        int s = readInt(scanner);
        if (s < 0) s = 0;
        if (s > 100) s = 100;

        char grade;
        switch (s / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        System.out.println("Grade: " + grade);
    }

    // Helpers
    private static int readInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Enter a number: ");
            sc.next();
        }
        return sc.nextInt();
    }

    private static double readDouble(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.print("Enter a number: ");
            sc.next();
        }
        return sc.nextDouble();
    }
}