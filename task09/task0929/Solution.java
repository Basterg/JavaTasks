package com.javarush.task.task09.task0929;

import java.io.*;

/* 
Обогатим код функциональностью!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName;
        String destinationFileName;

        FileInputStream fileInputStream;
        while (true) {
            sourceFileName = reader.readLine();
            try
            {
                fileInputStream = new FileInputStream(sourceFileName);
                break;
            }
            catch (FileNotFoundException e)
            {
                System.out.println("Файл не существует.");
            }
        }

        destinationFileName = reader.readLine();
        FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}

