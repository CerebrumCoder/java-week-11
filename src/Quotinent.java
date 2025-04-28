import java.util.Scanner;

public class Quotinent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        input.close();

        System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
        System.out.println("Terima kasih sudah menggunakan calculator ini!");

    }
}
