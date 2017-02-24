package pkg10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Downloads\\123.txt";
        File file = new File(filePath);
        file.createNewFile();
        writeToFile("Привет Файл", filePath);

    }

    public static void writeToFile(String content, String filepath) {

        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            fw = new FileWriter(filepath);
            bw = new BufferedWriter(fw);
            bw.write(content);

            System.out.println("Done");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bw != null) {
                    bw.close();
                }

                if (fw != null) {
                    fw.close();
                }

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

    }

}
