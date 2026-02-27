package spring;

import java.io.*;

public class CopyDataThread extends Thread {

    FileInputStream fin;
    FileOutputStream fout;

    public CopyDataThread(FileInputStream fin, FileOutputStream fout) {
        this.fin = fin;
        this.fout = fout;
    }

    public void run() {
        try {
            int ch;
            int count = 0;

            while ((ch = fin.read()) != -1) {
                fout.write(ch);
                count++;

                if (count == 10) {
                    System.out.println("10 characters are copied");
                    Thread.sleep(5000);   
                    count = 0;           
                }
            }

            fin.close();
            fout.close();
            System.out.println("File copied successfully");

        } catch (Exception e) {
        	System.out.println(e);
        }
    }
}