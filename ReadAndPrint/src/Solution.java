import java.io.*;

/*
Последовательный вывод файлов
*/

public class Solution {
    public static String firstFileName = "a.txt";
    public static String secondFileName = "b.txt";


    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fileName = "";
        private String content = "";


        @Override
        public void setFileName(String fullFileName) {
            fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return content;
        }

        @Override
        public void run() {
            BufferedReader bf = null;
            try { bf = new BufferedReader(new FileReader(fileName)); }
            catch (FileNotFoundException e) { e.printStackTrace(); }

            String str;
            String mainStr = "";

            while (true) {
                try {
                    if (!((str = bf.readLine()) != null)) break;
                    else mainStr += str + " ";
                } catch (IOException e) { e.printStackTrace(); }
            }

            try { bf.close(); }
            catch (IOException e) { e.printStackTrace(); }

            content = mainStr;
        }
    }
}
