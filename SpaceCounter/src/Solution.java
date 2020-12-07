import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        int count = 0;
        int countAllChar = 0;

        Scanner scanner = new Scanner(new FileInputStream(args[0]));
        while (scanner.hasNext()) {
            String str = scanner.nextLine();

            countAllChar += str.toCharArray().length;
            for (char c : str.toCharArray()) {
                if (c == ' ')
                    count++;
            }
        }

        float result = ((float) count / (float) countAllChar) * 100;
        System.out.printf("%.2f\n", result);
    }
}

