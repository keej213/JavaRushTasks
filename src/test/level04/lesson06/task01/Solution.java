package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int intname1 = Integer.parseInt(name);
        String name2 = reader.readLine();
        int intname2 = Integer.parseInt(name2);

        if (intname1 < intname2)
            System.out.println(intname1);
        else
            System.out.println(intname2);


    }
}