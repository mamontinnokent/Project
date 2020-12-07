package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class day1 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int x = Integer.parseInt(scan.nextLine()) + 4;
        double y = Double.parseDouble(scan.nextLine()) + 4.0;
        String str = "HakerRank " + scan.nextLine();

        System.out.println(x + "\n" + y + "\n" + str);

        scan.close();
    }
}
