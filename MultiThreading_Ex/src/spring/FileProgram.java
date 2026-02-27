package spring;

import java.io.*;

public class FileProgram {

    public static void main(String[] args) {

        try {
            // Create source file	
            File source = new File("source.txt");
            if (!source.exists()) {
                source.createNewFile();
                FileWriter fw = new FileWriter(source);
                fw.write("This is a sample text file for thread program.");
                fw.close();
                System.out.println("Source file created.");
            }

            // Create target file
            File target = new File("target.txt");
            if (!target.exists()) {
                target.createNewFile();
                System.out.println("Target file created.");
            }

            // Create file streams
            FileInputStream fin = new FileInputStream(source);
            FileOutputStream fout = new FileOutputStream(target);

            // Start thread
            CopyDataThread t = new CopyDataThread(fin, fout);
            t.start();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}