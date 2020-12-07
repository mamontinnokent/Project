import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CRuD {
    public static void createString(String[] args, String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int id;
        int max = Integer.parseInt(args[1]);

//        while (reader.ready()) {
//            id = Integer.parseInt(reader.readLine().substring(0, 7).trim());
//            if (id > max) max = id;
//        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

        writer.newLine();
        writer.write(String.format("%-8d%-30s%-8.2f%-4d", max, args[2], Double.parseDouble(args[3]), Integer.parseInt(args[4])));

        reader.close();
        writer.close();
    }

    public static void updateString(String[] args, String fileName) throws IOException {
        int id = Integer.parseInt(args[1]);
        ArrayList<String> stringsList = new ArrayList<>();

        Scanner scanner = new Scanner(new File(fileName));


        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            int searchingId = Integer.parseInt(str.substring(0, 7).trim());
            if (searchingId == id) str = String.format("%-8d%-30s%-8.2f%-4d", id, args[2], Double.parseDouble(args[3]), Integer.parseInt(args[4]));

            stringsList.add(str);
        }

        FileWriter fileWriter = new FileWriter(fileName, false);
        PrintWriter printWriter = new PrintWriter(fileWriter, true);

        for (String s : stringsList) {
            printWriter.println(s);
        }

        fileWriter.close();
        scanner.close();
    }

    public static void deleteString(String[] args, String fileName) throws IOException {
        int id = Integer.parseInt(args[1]);
        ArrayList<String> stringsList = new ArrayList<>();


        Scanner scanner = new Scanner(new File(fileName));

        while (scanner.hasNext()) {
            String str = scanner.nextLine();

            int searchingId = Integer.parseInt(str.substring(0, 7).trim());
            if (searchingId != id) stringsList.add(str);
        }


        FileWriter fileWriter = new FileWriter(fileName, false);

        PrintWriter printWriter = new PrintWriter(fileWriter, true);
        printWriter.flush();

        for (String s : stringsList) {
            printWriter.println(s);
        }

        fileWriter.close();
        scanner.close();
    }
}
