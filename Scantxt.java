package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Scantxt {

    private Scanner scanner;


    public Scantxt(File file) {
        this.scanner = new Scanner(System.in);
        try {
            this.scanner = new Scanner(file);
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }

    public ArrayList<String> readFile() {
        ArrayList<String> list = new ArrayList<>();
        while (this.scanner.hasNext()) {
            String line = this.scanner.nextLine();
            list.add(line);
        }
        return list;
    }
}

