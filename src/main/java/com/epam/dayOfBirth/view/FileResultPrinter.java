package com.epam.dayOfBirth.view;

import java.io.*;

public class FileResultPrinter implements ResultPrinter {
    private final static String FILE_NAME = "src/main/resources/input.txt";

    @Override
    public void print(String message) {
        try(FileReader reader = new FileReader(FILE_NAME))
        {
            // читаем посимвольно
            int buffer;
            while((buffer=reader.read())!=-1){

                ;
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
