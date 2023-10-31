package src.java.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Streams {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6};

        int count = array.length;

        while (count != 0) {
            System.out.println(array[count - 1]);
            count --;
        }
    }
}
