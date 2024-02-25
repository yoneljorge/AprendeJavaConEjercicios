package Test;

import java.io.FileInputStream;
import java.io.IOException;

public class Ejemplo01 {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("a.txt");
            System.out.println(f.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
