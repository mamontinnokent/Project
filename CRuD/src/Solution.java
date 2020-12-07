import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        HashSet<Character> set = new HashSet<>();
        InputStreamReader input = new InputStreamReader(new FileInputStream(args[0]));

        while (input.ready()) {
            char c = (char) input.read();
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
                set.add(c);
        }

        System.out.println(set.size());
        input.close();
    }

//    public static void main(String[] args) throws IOException {
//        Scanner scannerName = new Scanner(System.in);
//        String fileName = scannerName.nextLine();
//        scannerName.close();
//
//        Scanner scanner = new Scanner(new File(fileName));
//        ArrayList<String> arr = new ArrayList<>();
//
//
//        while (scanner.hasNext()) {
//            arr.add(scanner.nextLine());
//        }
//
//        scanner.close();
//
//        if (args.length != 0 && args[0].equals("-u")) {
//            FileWriter fileWriter = new FileWriter(fileName, false);
//            PrintWriter printWriter = new PrintWriter(fileWriter, false);
//
//
//            for (int i = 0; i < arr.size(); i++) {
//                String index = arr.get(i).substring(0, 7).trim();
//
//                if (index.equals(args[1])) arr.set(i, String.format("%-8s%-30s%-8s%-4s", args[1], args[2], args[3], args[4]));
//            }
//
//            for (String s : arr) {
//                printWriter.println(s);
//            }
//
//            fileWriter.close();
//            printWriter.close();
//        } else if (args.length != 0 && args[0].equals("-d")) {
//            FileWriter fileWriter = new FileWriter(fileName, false);
//            PrintWriter printWriter = new PrintWriter(fileWriter, false);
//
//
//            for (String s : arr) {
//                String index = s.substring(0, 7).trim();
//
//                if (!index.equals(args[1]))
//                    printWriter.println(s);
//            }
//
//            fileWriter.close();
//            printWriter.close();
//        }
//    }

//    public static void main(String[] args) throws IOException {
//        Scanner scannerName = new Scanner(System.in);
//        String fileName = scannerName.nextLine();
//        scannerName.close();
//
//
//        if      (args.length != 0 && args[0].equals("-c"))  CRuD.createString(args, fileName);
//        else if (args.length != 0 && args[0].equals("-u"))  CRuD.updateString(args, fileName);
//        else if (args.length != 0 && args[0].equals("-d"))  CRuD.deleteString(args, fileName);
//    }
}
