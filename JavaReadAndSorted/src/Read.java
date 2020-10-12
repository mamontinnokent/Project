import java.io.*;
import java.util.ArrayList;

public class Read {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Привет! Это программа сортирует строчки из твоего файлика!\n\nВведи имя файла: ");

        String nameFile = reader.readLine();

        BufferedReader file = new BufferedReader(new FileReader(nameFile));
        String str;
        ArrayList<String> arr = new ArrayList<>();

        while ((str = file.readLine()) != null)
            arr.add(str);

        do {
            System.out.print("\n\nВыбери способ сортировки:\n1. По алфавиту.\n" +
                    "2. По количеству символов в строке.\n" +
                    "3. По слову в строке заданному аргументом программы в виде порядкового номера." +
                    "\n\nВведи число: ");
            Integer nbr = Integer.parseInt(reader.readLine());
            System.out.println("\n");
            ArrayList<String> newArr = Sort.choiceOfSort(nbr, arr, reader);

            if (newArr != null) {
                System.out.print("\nВведите имя файла, в который мы запише отсортированные строки: ");
                BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));

                for (String text : newArr) {
                    writer.write(text + "\n");
                    writer.flush();
                }
            }
            System.out.print("\nПовторить? (y / n) ");
        } while ((str = reader.readLine()).equals("y"));

        reader.close();
        file.close();
    }
}