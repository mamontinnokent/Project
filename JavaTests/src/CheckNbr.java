import java.io.*;
import java.util.Scanner;

public class CheckNbr {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader fileReader = new BufferedReader(new FileReader(consoleReader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(consoleReader.readLine()));

        while (fileReader.ready()) {
            String[] arrStr = fileReader.readLine().split(" ");

            for (String s : arrStr) if (isItNbr(s)) fileWriter.write(s + " ");
        }

        consoleReader.close();
        fileReader.close();
        fileWriter.close();
}

    private static boolean isItNbr(String str) {
        boolean flag = false;

        try {
            int x = Integer.parseInt(str);
            flag = true;
        } catch (Exception e) {}

        return flag;
    }
}
