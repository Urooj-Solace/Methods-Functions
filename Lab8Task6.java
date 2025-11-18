import java.util.Scanner;

public class Lab8Task6 {

    public static String capitalize(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter lowercase words: ");
        String line = input.nextLine();

        String[] words = line.split(" ");

        for (String w : words) {
            System.out.print(capitalize(w) + " ");
        }
    }
}
