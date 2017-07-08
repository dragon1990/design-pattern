package com.dragon.learn.decorator.io;

import java.io.*;

/**
 * Created by dragon on 17-7-8.
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("/home/dragon/Desktop/text.txt")));
            while ((c = in.read())>=0){
                System.out.print((char)c);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
