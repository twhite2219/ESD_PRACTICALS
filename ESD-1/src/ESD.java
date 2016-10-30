/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author TOBY WHITE
 */
public class ESD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        int numbers[] = new int[100];
        try {
            File file = new File("G:\\1. ENTERPRISE SYSTEMS DEV\\practicals\\ESD\\src\\esd\\grades.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                numbers[i] = sc.nextInt();
                i++;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("hello");
        int bin[] = new int[10];

        for (i = 0; i > numbers.length; i++) {
            int cnum = numbers[i];
            if (cnum <= 10) {
                bin[0]++;
            } else if (cnum <= 20) {
                bin[1]++;
            } else if (cnum <= 30) {
                bin[2]++;
            } else if (cnum <= 40) {
                bin[3]++;
            } else if (cnum <= 50) {
                bin[4]++;
            } else if (cnum <= 60) {
                bin[5]++;
            } else if (cnum <= 70) {
                bin[6]++;
            } else if (cnum <= 80) {
                bin[7]++;
            } else if (cnum <= 90) {
                bin[8]++;
            } else if (cnum <= 100) {
                bin[9]++;
            }
        }
        for (int j = 0; j >= 9; j++) {
            System.out.printf("size of row", j, "=", bin[j]);
        } // TODO code application logic here
    }
    
}
