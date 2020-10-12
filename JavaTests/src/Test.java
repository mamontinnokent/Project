import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;



public class Test {
    public static void main(String[] args) throws IOException {
        String name;
        BufferedReader nameRead = new BufferedReader(new InputStreamReader(System.in));
        name = nameRead.readLine();
        nameRead.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(name));
        String str;
        ArrayList<Integer> arrInt = new ArrayList<Integer>();
        while ((str = fileReader.readLine()) != null)
            if (Integer.parseInt(str) % 2 == 0)
                arrInt.add(Integer.parseInt(str));

        for (int x : bubbleSort(arrInt))
            System.out.println(x);
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> nbr) {
        ArrayList<Integer> cur = (ArrayList<Integer>) nbr.clone();

        for (int i = 0; i < cur.size() - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < cur.size() - 1 - i; j++)
                if (cur.get(j) > cur.get(j + 1)) {
                    int min = cur.get(j + 1);
                    cur.set(j + 1, cur.get(j));
                    cur.set(j, min);
                    flag = true;
                }
            if (flag == false)
                break;
        }
        return cur;
    }
}


//public class Test {
//    public static void main(String[] args) throws IOException {
//        BufferedReader inputReader = new BufferedReader (new InputStreamReader(System.in));
//        String name = inputReader.readLine();
//
//
//        try(BufferedWriter inputWriter = new BufferedWriter(new FileWriter(name))) {
//            //запись построчно
//            String text;
//            do {
//                text = inputReader.readLine();
//                inputWriter.write(text + "\n");
//                inputWriter.flush();
//            } while(!((text.toLowerCase()).equals("exit")));
//        }
//        catch(IOException ex){}
//
//        inputReader.close();
//    }
//}
//
//public class Test {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
//        ArrayList<String> arrStr = new ArrayList<>();
//        String name = br.readLine();
//
//        try(BufferedWriter bw = new BufferedWriter(new FileWriter(name))) {
//            //Запи построчно
//            String text;
//            while(!(text = br.readLine()).equals("exit")) {
//                bw.write(text + "\n");
//                arrStr.add(text + "\n");
//                bw.flush();
//            }
//        }
//        catch(IOException ex){
//            System.out.println(ex.getMessage());
//        }
//
//        try(BufferedReader xr = new BufferedReader(new FileReader(name))) {
//            //чтение построчно
//            String s;
//            while((s = xr.readLine()) != null) {
//                System.out.println(s);
//            }
//        }
//        catch(IOException ex){
//            System.out.println(ex.getMessage());
//        }
//    }
//}
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String fileName = br.readLine();
//
//        Integer nbr;
//        String str;
//        ArrayList<Integer> arr = new ArrayList<>();
//        try(BufferedReader xr = new BufferedReader(new FileReader(fileName))) {
//            //чтение построчно
//            while((str = xr.readLine()) != null) {
//                nbr = Integer.parseInt(str);
//                if (nbr % 2 == 0)
//                    arr.add(nbr);
//            }
//        }
//        catch(IOException ex){
//            System.out.println(ex.getMessage());
//        }
//
//        ArrayList<Integer> newArr = bubbleSort(arr);
//
//        for (Integer x : arr) {
//            System.out.println(x);
//        }
//    }
//

