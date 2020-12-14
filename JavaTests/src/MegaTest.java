import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MegaTest {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader firstFileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader secondFileReader = new BufferedReader(new FileReader(reader.readLine()));

        reader.close();

        ArrayList<String> firstFile = new ArrayList<>();
        ArrayList<String> secondFile = new ArrayList<>();

        while (firstFileReader.ready()) firstFile.add(firstFileReader.readLine());
        while (secondFileReader.ready()) secondFile.add(secondFileReader.readLine());

        firstFileReader.close();
        secondFileReader.close();

        List<LineItem> remOrAdd = new ArrayList<LineItem>();
        List<LineItem> same = new ArrayList<LineItem>();


//  - ПОПАРНО сравниваем значения  (т.е. list1.get(0) сравниваем с list2.get(0))
//  - если equals, то это тип SAME
//      - иначе сравниваем: list1.get(1) совпадает ли с list2.get(0) , если да - REMOVED
//      - иначе: list1.get(0) совпадает ли с list2.get(1) , если да - ADDED
//      - удаляем значения, которые уже проверили и внесли в lines
//
//  В конце проверяем не осталось ли в list1 и list2 значений, если да:
//      - все из list1 - REMOVED
//      - все из list2 - ADDED

        for (int i = 0; i < firstFile.size() && i < secondFile.size(); i++) {
            if (firstFile.get(i).equals(secondFile.get(i))) {
                remOrAdd.add(new LineItem(Type.SAME, firstFile.remove(i))); secondFile.remove(i);
            } if (secondFile.size() - 1 >= i + 1) {
                if (firstFile.get(i).equals(secondFile.get(i + 1))) {
                    remOrAdd.add(new LineItem(Type.ADDED, secondFile.remove(i)));
                }
            } if (firstFile.size() - 1 >= i + 1) {
                if (firstFile.get(i + 1).equals(secondFile.get(i))) {
                    same.add(new LineItem(Type.REMOVED, firstFile.remove(i)));
                }
            }
            i--;
        }

        if (!firstFile.isEmpty()) for (String str : firstFile) remOrAdd.add(new LineItem(Type.REMOVED, str));
        if (!secondFile.isEmpty()) for (String str : secondFile) remOrAdd.add(new LineItem(Type.ADDED, str));


        for (LineItem l : remOrAdd) {
            lines.add(same.remove(0));
            lines.add(l);
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}