package com.javarush.test.level04.lesson13.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
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

        int m, n;
        for(m = iNumber1; m > 0; m-- ){
            for(n = iNumber2; n > 0; n-- ){
                System.out.print(8);
               }
            System.out.println();}




    }
}
