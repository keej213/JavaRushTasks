package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("I", 1, "Jek");
        Man man2 = new Man("Y", 2, "Sasha");

        Woman woman1 = new Woman("Mama", 1, "Lilya");
        Woman woman2 = new Woman("Tetya", 2, "Ira");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);

    }

    // Напиши тут свои классы
    public static class Man
    {
        String name, address;
        int age;

        Man(String newName){
        }
        Man(String newName, int newAge){
        }
        Man(String newName, int newAge, String newAddress){
        }
    }
    public static class Woman
    {
        String name, address;
        int age;

        Woman(String newName){
        }
        Woman(String newName, int newAge){
        }
        Woman(String newName, int newAge, String newAddress){
        }

    }
}
