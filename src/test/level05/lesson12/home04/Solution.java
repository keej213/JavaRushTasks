package com.javarush.test.level05.lesson12.home04;


/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 12 2012".
*/
import java.text.SimpleDateFormat;
import java.util.Date;
public class Solution
{
    public static void main(String[] args)
    {


                Date d = new Date();
                SimpleDateFormat format1 = new SimpleDateFormat("dd MM yyyy");

                System.out.println(format1.format(d)); //25.02.2013 09:03


    }
}

