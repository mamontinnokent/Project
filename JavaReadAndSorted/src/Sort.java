import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class Sort {
    public static ArrayList<String> choiceOfSort(Integer x, ArrayList<String> arr, BufferedReader reader) throws IOException {
        if (x.equals(1)) {
            ArrayList<String> newArr = bubbleSortChar(arr);
            for (String str : newArr) {
                int i = 0;
                for (int j = 0; j < arr.size() - 1; j++) {
                    if (arr.get(j).equals(str))
                        i++;
                }
                System.out.println(str + " " + i);
            }
            return newArr;
        }
        else if (x.equals(2)) {
            ArrayList<String> newArr = bubbleSortLength(arr);
            for (String str : newArr) {
                int i = 0;
                for (int j = 0; j < arr.size() - 1; j++)
                    if (arr.get(j).equals(str))
                        i++;
                System.out.println(str + " " + i);
            }
            return newArr;
        }
        else if (x.equals(3)) {
            System.out.print("Введите номер слова: ");
            int nbr = Integer.parseInt(reader.readLine());

            ArrayList<String> newArr = bubbleSortWord(1, arr);
            for (String str : newArr) {
                int i = 0;
                for (int j = 0; j < arr.size() - 1; j++)
                    if (arr.get(j).equals(str))
                        i++;
                System.out.println(str + " " + i);
            }
            return newArr;
        }
        else
            System.out.println("Ты ввёл какое-то говно.");

        return null;
    }



    public static ArrayList<String> bubbleSortWord(int nbr, ArrayList<String> arr) {
        ArrayList<String> newArr = (ArrayList<String>) arr.clone();

        for (int i = 0; i < newArr.size() - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < newArr.size() - 1 - j; j++) {
                if (newArr.get(j).toLowerCase().charAt(countChar(nbr, newArr.get(j).toLowerCase())) > newArr.get(j + 1).toLowerCase().charAt(countChar(nbr, newArr.get(j + 1).toLowerCase()))) {
                    String min = newArr.get(j + 1);
                    newArr.set(j + 1, newArr.get(j));
                    newArr.set(j, min);
                }
            } if (flag == false)
                break;
        }

        return newArr;
    }

    private static int countChar(int nbr, String str) {
        int word = 1;
        if (word == nbr) return 0;

        for (int i = 0; i < str.length() - 1; i++) {
            Character c1 = str.charAt(i);
            Character c2 = str.charAt(i + 1);

            if ((c1.equals(" ")) && !(c2.equals(" "))) {
                word++;
                if (word == nbr) return i + 1;
            }
        }

        return 0;
    }

    public static ArrayList<String> bubbleSortChar(ArrayList<String> arr) {
        ArrayList<String> newArr = (ArrayList<String>) arr.clone();


        for (int i = 0; i < newArr.size() - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < newArr.size() - 1 - j; j++) {
                if (newArr.get(j).toLowerCase().charAt(0) > newArr.get(j + 1).toLowerCase().charAt(0)) {
                    String min = newArr.get(j + 1);
                    newArr.set(j + 1, newArr.get(j));
                    newArr.set(j, min);
                }
            } if (flag == false)
                break;
        }

        return newArr;
    }

    public static ArrayList<String> bubbleSortLength(ArrayList<String> arr) {
        ArrayList<String> newArr = (ArrayList<String>) arr.clone();

        for (int i = 0; i < newArr.size() - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < newArr.size() - 1 - j; j++) {
                if (newArr.get(j).length() > newArr.get(j + 1).length()) {
                    String min = newArr.get(j + 1);
                    newArr.set(j + 1, newArr.get(j));
                    newArr.set(j, min);
                }
            } if (flag == false)
                break;
        }

        return newArr;
    }
}

