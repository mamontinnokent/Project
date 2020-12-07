import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException { ;
        int counter = -1;
        Scanner scan = new Scanner(System.in);
        int nbr = Integer.parseInt(scan.nextLine());
        String[] input = new String[nbr];

        while(++counter < nbr) {
            input[counter] = scan.nextLine();
        }

        for (String str: input) {
            if (containLink(str)) {
                str = str.replaceAll("^.*(href=\")", "");
                str = str.replaceFirst("\"(.*?)>", ",");
                str = str.replaceFirst("<.*$", "");

                System.out.println(str);
            }
        }
    }

    private static boolean containLink(String str) {
        Pattern p = Pattern.compile("^.*href=\"");
        Matcher m = p.matcher(str);
        if (m.find())
            return true;
        return false;
    }
}
