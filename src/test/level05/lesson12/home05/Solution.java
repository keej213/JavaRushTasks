package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{



        public static void main(String[] args) throws Exception
        {
            BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

            String symbol;
            int number;
            int sum = 0;

            while(true)
            {
                symbol = rd.readLine();
                if(symbol.equals("сумма"))
                {
                    break;
                }

                number = Integer.parseInt(symbol);
                sum = sum + number;

            }
            System.out.println(sum);

        }
    }