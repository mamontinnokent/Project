import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import java.io.*;

/*
Разделение файла
*/

public class Test {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream(new File((new BufferedReader(new InputStreamReader(System.in))).readLine()));
        FileOutputStream out1 =  new FileOutputStream(new File((new BufferedReader(new InputStreamReader(System.in))).readLine()));
        FileOutputStream out2 =  new FileOutputStream(new File((new BufferedReader(new InputStreamReader(System.in))).readLine()));

        int iter = 0;
        System.out.println(in.available());
        int range = in.available() / 2 == 0 ? in.available() / 2 : in.available() / 2 + 1;
        byte[] buffer = new byte[range];

        while (iter != 2) {
            int count = in.read(buffer);
            if (iter == 0) {
                out1.write(buffer, 0, count);
            } else {
                out2.write(buffer, 0, count);
            }

            iter++;
        }

        out1.close();
        out2.close();
        in.close();
    }
}

//public class Test {
//    public static void main(String[] args) throws Exception {
//        int nbr;
//        int nbrRepeat;
//        int maxRepeat = 0;
//        String str = "";
//        String fileName = "";
//        ArrayList<Integer> arr = new ArrayList<>();
//        HashSet<Integer> set = new HashSet<>();
//        InputStreamReader in = new InputStreamReader(System.in);
//
//        while ((nbr = in.read()) > 0)
//            fileName += (char) nbr;
//
//        FileInputStream inFile = new FileInputStream(fileName);
//        while ((nbr = inFile.read()) > 0)
//            arr.add(nbr);
//
//        Collections.sort(arr);
//
//        for (int n : arr) {
//            nbrRepeat = 0;
//            for (int i = 0; i < arr.size(); i++) {
//                if (n == arr.get(i))
//                    nbrRepeat++;
//            } if (nbrRepeat > maxRepeat) {
//                maxRepeat = nbrRepeat;
//            }
//        }
//
//        for (int n : arr) {
//            if (nbrCount(n, arr) == maxRepeat) {
//                set.add(n);
//            }
//        }
//
//        for (int x : set) {
//            str += x + " ";
//        }
//
//        System.out.print(str);
//
//        in.close();
//        inFile.close();
//    }
//
//    private static int nbrCount(int nbr, ArrayList<Integer> arr) {
//        int count = 0;
//        for (int i = 0; i < arr.size(); i++) {
//            if (nbr == arr.get(i))
//                count++;
//        }
//        return count;
//    }
//}




//import java.io.*;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//// Почитатать про BigInteger
//
//public class Test {
//    public static void main(String[] args) throws IOException {
//        String name;
//        BufferedReader nameRead = new BufferedReader(new InputStreamReader(System.in));
//        name = nameRead.readLine();
//        nameRead.close();
//
//        BufferedReader fileReader = new BufferedReader(new FileReader(name));
//        String str;
//        ArrayList<Integer> arrInt = new ArrayList<Integer>();
//        while ((str = fileReader.readLine()) != null)
//            if (Integer.parseInt(str) % 2 == 0)
//                arrInt.add(Integer.parseInt(str));
//
//        for (int x : bubbleSort(arrInt))
//            System.out.println(x);
//    }
//
//    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> nbr) {
//        ArrayList<Integer> cur = (ArrayList<Integer>) nbr.clone();
//
//        for (int i = 0; i < cur.size() - 1; i++) {
//            boolean flag = false;
//            for (int j = 0; j < cur.size() - 1 - i; j++)
//                if (cur.get(j) > cur.get(j + 1)) {
//                    int min = cur.get(j + 1);
//                    cur.set(j + 1, cur.get(j));
//                    cur.set(j, min);
//                    flag = true;
//                }
//            if (flag == false)
//                break;
//        }
//        return cur;
//    }
//}


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

