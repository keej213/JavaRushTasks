package com.javarush.test.level05.lesson05.task03;

/* Геттеры и сеттеры для класса Dog
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.
*/

public class Dog {

    String name = "fd";
    int age = 2;

    public void setName(String newname)
    {
        this.name = newname;


    }
    public String getName()
    {
        return name;
    }



    public void setAge(int  newAge)
    {
        this.age = newAge;


    }
    public int getAge()
    {
        return age;
    }

}
