package task.oop;

import java.sql.SQLOutput;

// TODO: Создайте класс Parent(Родитель) и создайте для него 5 методов.
//  1. Метод, принимающий 2 числа и возвращающий их сумму.
//  2. Метод, принимающий строку, в которой передано число, и число, а возвращающий сумму в виде числа.
//  3. Метод, принимающий строку и возвращающий ее.
//  4. Метод, не принимающий и не возвращающий ничего, лишь выводящий на экран "I am Parent".
//  5. Метод, возвращающий конкатенацию (сумму двух строк), принимающий 2 строки.
public class Parent {

    public static void main(String[] args) {
        System.out.println();
        System.out.println(new Parent().summ(1, 9));
        System.out.println();

        System.out.println(new Parent().summIntString("14", 6));
        System.out.println();

        System.out.println(new Parent().stringReturner("Ваша строка вернулась"));
        System.out.println();

        System.out.println(new Parent().parentGreetings());
        System.out.println();

        System.out.println(new Parent().stringConcatenation("Строка к строке ", "присоединилась вдруг"));
        System.out.println();
        System.out.println("______________________");
        System.out.println();

        System.out.println(new Child1().summ (6,6));
        System.out.println();

        System.out.println(new Child1().summIntString("10", 11));
        System.out.println();

        System.out.println(new Child1().stringReturner("Ваша строка вернулась"));
        System.out.println();

        System.out.println(new Child1().parentGreetings());
        System.out.println();

        System.out.println(new Child1().stringConcatenation("Строка к строке ", "присоединилась вдруг"));

        System.out.println();
        System.out.println("______________________");
        System.out.println();

        System.out.println(new Child2().summ (6,6, 6));
        System.out.println();

        System.out.println(new Child2().summIntString("10", "10" , "10"));
        System.out.println();

        System.out.println(new Child2().stringReturner("Ваша строка вернулась", " и не одна"));
        System.out.println();

        System.out.println(new Child2().parentGreetings(", greetings!"));
        System.out.println();

        System.out.println(new Child2().stringConcatenation("Строка к строке ","ожидаемо ","присоединилась вдруг"));
        System.out.println("______________________");

    }

    //  1. Метод, принимающий 2 числа и возвращающий их сумму.
    public int summ(int first, int second) {
        return first + second;
    }

    //  2. Метод, принимающий строку, в которой передано число, и число, а возвращающий сумму в виде числа.
    public int summIntString(String numberString, int numberInt) {
        return Integer.parseInt(numberString) + numberInt;
    }

    //  3. Метод, принимающий строку и возвращающий ее.
    public String stringReturner(String enterYourString) {
        return enterYourString;
    }

    //  4. Метод, не принимающий и не возвращающий ничего, лишь выводящий на экран "I am Parent".
    public String parentGreetings() {
        return "I am Parent";
    }

    //  5. Метод, возвращающий конкатенацию (сумму двух строк), принимающий 2 строки.
    public String stringConcatenation(String stringOne, String stringTwo) {
        return stringOne + stringTwo;
    }


}







