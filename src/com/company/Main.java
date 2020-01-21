package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList <Integer> arrayList = new ArrayList <>();
        Random random = new Random();
        for (int i = 0; i <= 50 ; i++){
            arrayList.add(random.nextInt(100 - 1) + 1);
          //  System.out.println("Random array list numbers: " + arrayList.get(i) +" : "+ i);
        }
        ArrayList <Integer> nechet = new ArrayList<>();
        for (int a = 0; a < random.nextInt(50); a++){
            if (a % 2 !=0 ){
                nechet.add(a);
                System.out.println("Odd numbers: " + a);
            }
        }
        ArrayList <Integer> chet = new ArrayList<>();
        for (int b = 1 ; b < random.nextInt(50); b++){
            if(b % 2 ==0){
                chet.add(b);
                System.out.println("Even numbers: "+b);
            }
        }
        FileWriter fileWriter = new FileWriter("Answers34.txt");
        fileWriter.write("1/Массив это ячейка который хранит адрес либо какойто номер");
        fileWriter.write("\n2/ArrayList может менять свой размер во время реализации программы");
        fileWriter.write("\n3/ArrayList - это типа  как массив но массив не может расти а ArrayList может");
        fileWriter.write("\n5/Метод set заменяет a add - добавляет!!! + НЕ ОЧЕНЬ ПОНЕЛА 4-ТЫЙ ВОПРОС");
        fileWriter.close();
    }
}
