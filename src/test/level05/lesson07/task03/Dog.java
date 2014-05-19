package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
   String name;
   int height;
   String color;

    public void initialize(String newName)
    {
        newName = name;

    }

    public void initialize(String newName, int newHeight)
    {
        newName = name;
        newHeight = height;
    }

    public void initialize(String newName, int newHeight, String newColor)
    {
        newName = name;
        newHeight = height;
        newColor = color;
    }
}
