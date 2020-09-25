package com.epam.dayOfBirth.data;

import java.io.File.*;
import java.io.FileWriter;
import java.io.IOException;

public class FileDataAcquirer implements DataAcquirer {
    private final static String FILE_NAME = "src/main/resources/input.txt";

    @Override
    public int inputIn(String message) {
        try (FileWriter writer = new FileWriter(FILE_NAME, false)) {
            writer.write(message);
            writer.append('\n');

            writer.flush();
        } catch (IOException ioException) {
            System.out.print(ioException.getMessage());
        }
        return 0;
    }
}
