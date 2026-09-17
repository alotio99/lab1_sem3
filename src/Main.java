import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Список команд:\n" +
                "fizzbuzz\n" +
                "reverse \"строка\"\n" +
                "quadratic a b c\n" +
                "series\n" +
                "palindrome \"строка\"\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите команду: ");
        String first_word = scanner.next();
        switch (first_word){
            case "fizzbuzz":
                FizzBuzz.runFizzBuzz();
                break;
            case "reverse":
                Reverse.reverse(scanner.nextLine());
                break;
            case "quadratic":
                Quadratic.runQuadratic(scanner.next(), scanner.next(), scanner.next());
                break;
            case "series":
                Series.runseries();
                break;
            case "palindrome":
                System.out.println(Palindrome.runpalindrome(scanner.nextLine()));
                break;
            default:
                System.out.println("Команда введена неверно, список команд:\n" +
                        "fizzbuzz\n" +
                        "reverse \"строка\"\n" +
                        "quadratic a b c\n" +
                        "series\n" +
                        "palindrome \"строка\"");
        }
    }
}