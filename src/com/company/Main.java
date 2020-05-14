package com.company;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите размерность массива");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        Random random = new Random();

        int [] array = new int [n];
        for (int i=0; i<array.length; i++){
            array[i]=random.nextInt(n);
        }

        System.out.println(Arrays.toString(array));

        int sum=0; // сумма нечетных элементов массива
        int x=0; // кол-во нечетных элементов

            for (int i=0; i<array.length; i++){
                if (i % 2 !=0 && i!=0){
                    sum+=array[i];
                    x++;
                }
            }

        System.out.print("Среднее арифметическое нечетных элементов равно ");
        System.out.printf("%.2f",(double)sum/x);
    }
}
