package com.epam.dayOfBirth.data;

import java.util.Scanner;

public class ConsoleDataAcquirer implements DataAcquirer{
    private  static final Scanner scanner = new Scanner(System.in);

    @Override
    public int inputIn(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }


}
