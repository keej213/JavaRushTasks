package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber1 = reader.readLine();
        int iNumber1 = Integer.parseInt(sNumber1);
        String sNumber2 = reader.readLine();
        int iNumber2 = Integer.parseInt(sNumber2);
        String sNumber3 = reader.readLine();
        int iNumber3 = Integer.parseInt(sNumber3);

        if (iNumber1 < iNumber2)
        {
            if ((iNumber2 < iNumber3)&&(iNumber1 < iNumber2))
                System.out.println(iNumber2);
            else if ((iNumber1 < iNumber3)&&(iNumber2 < iNumber1))
                System.out.println(iNumber1);
        }
        else
            System.out.println(iNumber3);



        }
}
