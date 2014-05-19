package com.javarush.test.level05.lesson12.bonus01;

import java.io.*;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа вводит два числа с клавиатуры и выводит их сумму на экран.
*/

public class Solution
{
   public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber1 = reader.readLine();
        int iNumber1 = Integer.parseInt(sNumber1);
        String sNumber2 = reader.readLine();
        int iNumber2 = Integer.parseInt(sNumber2);

        int sum = iNumber1 + iNumber2;
        System.out.println("Sum = " + sum);
    }
}
