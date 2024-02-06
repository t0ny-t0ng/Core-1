package task.methods;

import java.sql.SQLOutput;

public class Methods {
    public static void main(String[] args) {
        // Пример вызова метода
        String string = getString("HELLO");
        // Ожидаемый результат hello System.out.println(string);
        System.out.println(getString( "HELLO"));
        // Вызовы ваших методов
        System.out.println(twoIntsSum (13, 14));

        System.out.println(twoStringsSum("Testing ", "Lines"));

        System.out.println(todo3("5", 65));

        System.out.println(todo4("9", 7));
        System.out.println(todo4("10", 12));

        System.out.println(todo5(true, true));
        System.out.println(todo5(true, false));
        System.out.println(todo5(false, false));

        System.out.println(evenOrOddNumb(5));
        System.out.println(evenOrOddNumb(4));


    }

    // Метод принимающий строку и преобразующий ее в нижний регистр
    public static String getString(String example) {
        return example.toLowerCase();
    }

// Реализуйте функциональность согласно описанию

// TODO: Создайте метод который вернет сумму двух чисел
public static int twoIntsSum (int first, int second){
        return first + second;
}
// TODO: Создайте метод который вернет сумму двух переданных строк
public static String twoStringsSum (String firstStr, String secondStr){
        return firstStr + secondStr;
}

// TODO: создайте метод который примет строку внутри которой передается число , а также принимает число . Метод должен суммировать числа
//  обернуть их в строку и вернуть результат строкой

public static String todo3 (String num1, int num2){
      String num3 = Integer.toString(Integer.parseInt(num1) + num2);
return num3;
}

//    public static String todo3 (String num1, int num2){
//        int num3 = Integer.parseInt(num1);
//        int num4 = num3 + num2;
//        String total = Integer.toString(num4);
//        return total;


// TODO: Создайте метод который принимает строку , число . Внутри строки передается число . Проверить , что если число внутри строки больше чем
//  число которое передается как int , то пусть метод вернет false , а если меньше , то true

    public static boolean todo4 (String num10, int num20) {
        int num30 = Integer.parseInt(num10);
        boolean answer = num30<num20;
        return answer;
    }
// TODO: Создайте метод который принимает 2 булевые переменные . Если обе true , верни true , если хоть одна из них true верни true ,
//  если обе false верни false

    public static boolean todo5 (boolean answer1, boolean answer2){
        boolean todo5result = answer1||answer2;
        return todo5result;
    }
// TODO: Создайте метод который принимает число и вернет true если оно четное , и false если оно не четное

public static boolean evenOrOddNumb (int number){
if ((number & 1) == 0) {
        return true;
    } else{
        return false;
    }

    }

// TODO: Создайте метод который проверят числа в массиве , если все они четные верни "Массив четных чисел" , если есть и четные и не
//  четные верни "Массив четных и не четных чисел" и если в массиве только нечетные числа верни "Массив не четных чисел"






// TODO: Создайте метод который принимает массив чисел и возвращает новый массив чисел . Внутри метода пройдитесь по элементам
//  массива который подается в аргументы  и сложите все элементы в новый массив и верните его


// TODO: Создайте метод который принимает массив чисел и возвращает число . Внутри метода пройдитесь по элементам массива который подается в
//  аргументы сложите все числа который переданы в массиве и верните сумму всех чисел


// TODO: Создайте методы в которые можно будет передавать свой возраст , а возвращаться сколько полных месяцев в этом возрасте ,
//  тоесть если человек прожил 10 лет , это 120 месяцевтак же сделайте перевод возраста в минуты и метод который расчетает возраст в часах


// TODO: Создайте метод которому передаю имена , а он проверяет одинаковые ли они , причем не зависимо от регистра


// TODO: Создайте метод которому можно передать массив элементов , а он вернет последний элемент


// TODO: Создайте метод счетчик букв А . Подается строка и метод посчитает сколько букв А в строке


// TODO: Создайте метод кошелек , у него есть началная сумма и можно вычитать пока деньги не кончатся или сумма не будет слишком велика
}