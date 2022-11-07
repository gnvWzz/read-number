import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number:");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a <= 10 && a >= 0) {
            switch (a) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
                default:
                    System.out.println("Out of ability");
                    break;
            }
        } else if (a < 20 && a > 10) {
            switch (a) {
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
            }
        } else if (a < 100 && a >= 20) {
            int tens = a / 10;
            double c = (a / 10.0 - tens) * 10;
            int ones = (int)c;

            switch (tens) {
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("forty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
            }
            switch (ones) {
                case 1:
                    System.out.print(" one");
                    break;
                case 2:
                    System.out.print(" two");
                    break;
                case 3:
                    System.out.print(" three");
                    break;
                case 4:
                    System.out.print(" four");
                    break;
                case 5:
                    System.out.print(" five");
                    break;
                case 6:
                    System.out.print(" six");
                    break;
                case 7:
                    System.out.print(" seven");
                    break;
                case 8:
                    System.out.print(" eight");
                    break;
                case 9:
                    System.out.print(" nine");
                    break;
            }
        } else if (a >= 100 && a < 1000) {
            int hundreds = a / 100;
            int Tens = (a % 100) / 10;
            int Ones = (a % 100) % 10;

            switch (hundreds) {
                case 1:
                    System.out.print("one hundred");
                    break;
                case 2:
                    System.out.print("two hundred");
                    break;
                case 3:
                    System.out.print("three hundred");
                    break;
                case 4:
                    System.out.print("four hundred");
                    break;
                case 5:
                    System.out.print("five hundred");
                    break;
                case 6:
                    System.out.print("six hundred");
                    break;
                case 7:
                    System.out.print("seven hundred");
                    break;
                case 8:
                    System.out.print("eight hundred");
                    break;
                case 9:
                    System.out.print("nine hundred");
                    break;
            }

            if (Tens == 1) {
                switch (Ones) {
                    case 1:
                        System.out.print(" eleven");
                        break;
                    case 2:
                        System.out.print(" twelve");
                        break;
                    case 3:
                        System.out.print(" thirteen");
                        break;
                    case 4:
                        System.out.print(" fourteen");
                        break;
                    case 5:
                        System.out.print(" fifteen");
                        break;
                    case 6:
                        System.out.print(" sixteen");
                        break;
                    case 7:
                        System.out.print(" seventeen");
                        break;
                    case 8:
                        System.out.print(" eighteen");
                        break;
                    case 9:
                        System.out.print(" nineteen");
                        break;
                }
            } else if (Tens >= 2) {
                switch (Tens) {
                    case 2:
                        System.out.print(" twenty");
                        break;
                    case 3:
                        System.out.print(" thirty");
                        break;
                    case 4:
                        System.out.print(" forty");
                        break;
                    case 5:
                        System.out.print(" fifty");
                        break;
                    case 6:
                        System.out.print(" sixty");
                        break;
                    case 7:
                        System.out.print(" seventy");
                        break;
                    case 8:
                        System.out.print(" eighty");
                        break;
                    case 9:
                        System.out.print(" ninety");
                        break;
                }

                switch (Ones) {
                    case 0:
                        System.out.print("");
                    case 1:
                        System.out.print(" one");
                        break;
                    case 2:
                        System.out.print(" two");
                        break;
                    case 3:
                        System.out.print(" three");
                        break;
                    case 4:
                        System.out.print(" four");
                        break;
                    case 5:
                        System.out.print(" five");
                        break;
                    case 6:
                        System.out.print(" six");
                        break;
                    case 7:
                        System.out.print(" seven");
                        break;
                    case 8:
                        System.out.print(" eight");
                        break;
                    case 9:
                        System.out.print(" nine");
                        break;
                }
            }
        }
    }
}