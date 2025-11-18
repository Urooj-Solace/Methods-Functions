import java.util.Scanner;

public class Lab8Task1 {

    // (a) Method to compute sum of digits
    public static long sumDigits(long n) {
        long sum = 0;
        while (n > 0) {
            sum += n % 10;  // add last digit
            n /= 10;        // remove last digit
        }
        return sum;
    }

    // (b) Method to display an integer in reverse order
    public static void reverse(int number) {
        while (number != 0) {
            System.out.print(number % 10); // print last digit
            number /= 10;                  // remove last digit
        }
        System.out.println();
    }

    // MAIN PROGRAM (test program)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ----- Part (a) -----
        System.out.print("Enter a number for sumDigits: ");
        long n = input.nextLong();
        System.out.println("Sum of digits = " + sumDigits(n));

        // ----- Part (b) -----
        System.out.print("Enter a number to reverse: ");
        int num = input.nextInt();

        System.out.print("Reversed number: ");
        reverse(num);
    }
}
