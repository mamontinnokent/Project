import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        int nbr;
        HashSet<Integer> notSortedChar = new HashSet<>();
        ArrayList<Integer> allChar = new ArrayList<>();
        FileInputStream reader = new FileInputStream(args[0]);

        while ((nbr = reader.read()) > -1) {
            notSortedChar.add(nbr);
            allChar.add(nbr);
        }

        reader.close();

        ArrayList<Integer> sortedChar = new ArrayList<>(notSortedChar);
        Collections.sort(sortedChar);

        for (int i : sortedChar) {
            int counter = 0;
            for (int i1 : allChar) {
                if (i1 == i)
                    counter++;
            }

            System.out.printf("%c %d\n", (char) i, counter);
        }

    }
}
