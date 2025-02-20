package Bridgelabz_2113100011.Assignment20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class LearningFileHandling {
    public static void main(String[] args) {
        FileOutputStream fos;
        try (FileInputStream fis = new FileInputStream("D:\\Bridge\\Bridgelabz_2113100011\\Assignment20\\message.txt")) {
            fos = new FileOutputStream("D:\\Bridge\\Bridgelabz_2113100011\\Assignment20\\copyfile.txt");
            int c;
            while ((c = fis.read()) != -1) {
                fos.write((char) c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());


        }
    }
}
