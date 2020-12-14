import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner consoleReader = new Scanner(System.in);
        Scanner fileReader = new Scanner(new FileInputStream(consoleReader.nextLine()));

        PersonScannerAdapter personScannerAdapter = new PersonScannerAdapter(fileReader);

        System.out.println(personScannerAdapter.read().toString());

        consoleReader.close();
        fileReader.close();
        personScannerAdapter.close();
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        @Override
        public Person read() throws IOException, ParseException {
            String people = fileScanner.nextLine();
            String[] arr = people.split(" ", 4);

            SimpleDateFormat dateFormat = new SimpleDateFormat("d M y", Locale.ENGLISH);
            String d = arr[3];
            String first = arr[1];
            String middleName = arr[2];
            String lastName = arr [0];
            Date date = dateFormat.parse(d);

            return new Person(first, middleName, lastName, date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }
    }
}


