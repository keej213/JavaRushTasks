package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
void readLn() – ждет нажатия enter [использовать readString()]
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        return  n;


    }

    public static int readInt() throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sn = reader.readLine();
        int in = Integer.parseInt(sn);
        return  in;
    }

    public static double readDouble() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sn = reader.readLine();
        double in = Double.parseDouble(sn);
        return  in;

    }

    public static void readLn() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = readString();
        while ("".equals(s))
        {
            s = readString();
        }
    }


    public static void main(String[] args){

    }
    }
