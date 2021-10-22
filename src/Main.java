import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] barcode = new int[12];
        System.out.println("Input each barcode character on a new line");
        for (int i = 0; i < barcode.length; i++) {
            barcode[i] = input.nextInt();
        }
        int part1 = 0;
        int part2 = 0;
        for (int i = 1; i < barcode.length; i = i + 2) {
            int temp = barcode[i];
            part1 = part1 + temp;
        }
        part1 = part1 * 3;
        for (int i = 0; i < barcode.length; i = i + 2) {
            int temp = barcode[i];
            part2 = part2 + temp;
        }

        System.out.println(((((part1+part2)/10)+1)*10)-(part1+part2));
    }
}
