package Tugas;

import java.util.Scanner;
public class ArrayLoop {
    public void arrayLoop (){
        int [] arrayLoop = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai Yang Ingin Ditambahkan Ke Array");
        for (int i = 0 ; i < arrayLoop.length ; i++){
            arrayLoop[i] = input.nextInt();
        }
        for (int i = 0; i < arrayLoop.length; i++)
        {
            System.out.println(arrayLoop[i]);
        }

        System.out.println("Nilai di atas adalah isi array loop");
    }
}

