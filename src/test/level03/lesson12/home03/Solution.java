package com.javarush.test.level03.lesson12.home03;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.io.PrintWriter;
        import java.io.BufferedInputStream;
        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

/* Я буду зарабатывать $50 в час
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час
*/

        public class Solution
        {
            public static void main(String[] args)   throws Exception
            {
                BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
                String money = b.readLine();
                int a = Integer.parseInt(money);
                System.out.println("Я буду зарабатывать $" + a + " в час");
    }
}