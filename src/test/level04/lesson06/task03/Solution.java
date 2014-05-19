package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        int nameint1 = Integer.parseInt(name1);
        String name2 = reader.readLine();
        int nameint2 = Integer.parseInt(name2);
        String name3 = reader.readLine();
        int nameint3 = Integer.parseInt(name3);


        if (nameint1 > nameint2)
        {
            if (nameint2 > nameint3)
            {
                System.out.println(nameint1);
                System.out.println(nameint2);
                System.out.println(nameint3);
            } else
            {
                if (nameint3 > nameint1)
                {
                    System.out.println(nameint3);
                    System.out.println(nameint1);
                    System.out.println(nameint2);
                } else
                {
                    System.out.println(nameint1);
                    System.out.println(nameint3);
                    System.out.println(nameint2);
                }

            }

        } else
        {
            if (nameint1 > nameint3)
            {
                System.out.println(nameint2);
                System.out.println(nameint1);
                System.out.println(nameint3);
            } else
            {
                if (nameint3 > nameint2)
                {
                    System.out.println(nameint3);
                    System.out.println(nameint2);
                    System.out.println(nameint1);
                } else
                {
                    System.out.println(nameint2);
                    System.out.println(nameint3);
                    System.out.println(nameint1);
                }
            }
        }
    }
}
