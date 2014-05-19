package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    double left = 1.2;
    double top = 2.4;
    double width = 1.3;
    double height = 7.2;


    public void initialize(double newLeft, double newTop, double newWidth, double newHeight)
    {
        newLeft = left;
        newTop = top;
        newWidth = width;
        newHeight = height;

    }

    public void initialize(double newLeft, double newTop)
    {
        newLeft = left;
        newTop = top;
    }

    public void initialize(double newLeft, double newTop, double newWidth)
    {
        newLeft = left;
        newTop = top;
        newWidth = width;
        newWidth = height;
    }

    public void initialize(Rectangle rectangle)
    {

    }
}
