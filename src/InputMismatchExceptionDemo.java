
import java.util.*;


public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        do {
            try {
                System.out.print("Enter an integer: ");

                int number = input.nextInt();

                System.out.println("The number entered is " + number);

                continueInput = false;
            } catch (InputMismatchException e) {
                System.out.print("Try again. (" + "Incorrect input: an integer is required)");
                input.nextInt();
            } catch (IllegalStateException e) {
                System.out.println("Scanner has been closed");
                continueInput = false;
            }

        } while (continueInput);

        System.out.println("Terima kasih sudah menggunakan program kami!");

    }


}
