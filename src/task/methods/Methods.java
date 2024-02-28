package task.methods;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Methods {


    static double walletValue = 3000.00;

    public static void main(String[] args) {
        // Пример вызова метода
        String string = getString("HELLO");
        // Ожидаемый результат hello System.out.println(string);
        System.out.println(getString("HELLO"));
        System.out.println();
        // Вызовы ваших методов
        System.out.println(twoIntsSum(13, 14));
        System.out.println();

        System.out.println(twoStringsSum("Testing ", "Lines"));
        System.out.println();

        System.out.println(stringToNumSumm("5", 65));
        System.out.println();

        System.out.println(isIntGreater("9", 7));
        System.out.println(isIntGreater("10", 12));
        System.out.println();

        System.out.println(booleanTesting(true, true));
        System.out.println(booleanTesting(true, false));
        System.out.println(booleanTesting(false, false));
        System.out.println();

        System.out.println(evenOrOddNumb(5));
        System.out.println(evenOrOddNumb(4));
        System.out.println();

        int[] massive1 = {1, 2, 3, 4, 5};
        System.out.println(evenOrOddMassive(massive1));
        int[] massive2 = {2, 4, 6, 8};
        System.out.println(evenOrOddMassive(massive2));
        int[] massive3 = {1, 3, 5, 7};
        System.out.println(evenOrOddMassive(massive3));
        System.out.println();

        int[] massive82 = {22, 33, 15, 27};
        System.out.println(massiveToMassive(massive82));
        System.out.println();

        int[] testmassive9 = {10, 20, 30, 40};
        System.out.println(massiveSumm(testmassive9));
        System.out.println();

        System.out.println(ageConverter(34));
        System.out.println();

        System.out.println(isNamesEquals("Пётр", "пётр"));
        System.out.println(isNamesEquals("Иван", "пётр"));
        System.out.println();

        int[] testmassive12 = {1, 5, 25, 21, 12, 3, 5, 6};
        System.out.println(lastFromMassive(testmassive12));
        System.out.println();

        System.out.println(A_counter("Гуантанамо"));
        System.out.println();

        System.out.println(wallet(1200.00));
        System.out.println();
        System.out.println(wallet(500.00));
        System.out.println();
        System.out.println(wallet(2000.00));
    }


    // Метод принимающий строку и преобразующий ее в нижний регистр
    public static String getString(String example) {
        return example.toLowerCase();
    }

// Реализуйте функциональность согласно описанию

    // TODO: Создайте метод который вернет сумму двух чисел
    public static int twoIntsSum(int first, int second) {
        return first + second;
    }

    // TODO: Создайте метод который вернет сумму двух переданных строк
    public static String twoStringsSum(String firstStr, String secondStr) {
        return firstStr + secondStr;
    }

// TODO: создайте метод который примет строку внутри которой передается число , а также принимает число . Метод должен суммировать числа
//  обернуть их в строку и вернуть результат строкой

    public static String stringToNumSumm(String num1, int num2) {
        return Integer.toString(Integer.parseInt(num1) + num2);

    }

// TODO: Создайте метод который принимает строку , число . Внутри строки передается число . Проверить , что если число внутри строки больше чем
//  число которое передается как int , то пусть метод вернет false , а если меньше , то true

    public static boolean isIntGreater(String num10, int num20) {
        return Integer.parseInt(num10) < num20;
    }

// TODO: Создайте метод который принимает 2 булевые переменные . Если обе true , верни true , если хоть одна из них true верни true ,
//  если обе false верни false

    public static boolean booleanTesting(boolean answer1, boolean answer2) {
        return answer1 || answer2;

    }
// TODO: Создайте метод который принимает число и вернет true если оно четное , и false если оно не четное

    public static boolean evenOrOddNumb(int number) {
        return number % 2 == 0;
    }


// TODO: Создайте метод который проверят числа в массиве , если все они четные верни "Массив четных чисел" , если есть и четные и не
//  четные верни "Массив четных и не четных чисел" и если в массиве только нечетные числа верни "Массив не четных чисел"

    public static String evenOrOddMassive(int[] testmassive) {
        int counter = 0;
        for (int i : testmassive) {
            if (i % 2 == 0) {
                counter++;
            }
        }
//
        return (counter == testmassive.length) ? "Массив четных чисел" : (counter == 0) ? "Массив не четных чисел" : "Массив четных и не четных чисел";
    }

// TODO: Создайте метод который принимает массив чисел и возвращает новый массив чисел . Внутри метода пройдитесь по элементам
//  массива который подается в аргументы  и сложите все элементы в новый массив и верните его

    public static String massiveToMassive(int[] testmassive8) {
        int[] testmassive81;
        testmassive81 = new int[testmassive8.length];
        System.arraycopy(testmassive8, 0, testmassive81, 0, testmassive8.length);
        return Arrays.toString(testmassive81);
    }

// TODO: Создайте метод который принимает массив чисел и возвращает число . Внутри метода пройдитесь по элементам массива который подается в
//  аргументы сложите все числа который переданы в массиве и верните сумму всех чисел

    public static int massiveSumm(int[] testmassive9) {
        int summ = 0;
        for (int i = 0; testmassive9.length > i; i++) {
            summ = summ + testmassive9[i];
        }
        return summ;
    }

// TODO: Создайте методы в которые можно будет передавать свой возраст , а возвращаться сколько полных месяцев в этом возрасте ,
//  то есть если человек прожил 10 лет , это 120 месяцев, так же сделайте перевод возраста в минуты и метод который рассчитает возраст в часах

    public static String ageConverter(int age1) {
        return "Конвертация возраста в месяцы: " + age1 * 12 + "\n" + "Конвертация возраста в часы: " + age1 * 8640 + "\n" + "Конвертация возраста в минуты: " + age1 * 518400;
    }

// TODO: Создайте метод которому передаю имена , а он проверяет одинаковые ли они , причем не зависимо от регистра

    public static String isNamesEquals(String name1, String name2) {
        if (name2.equalsIgnoreCase(name1)) {
            return "Повтор имени: " + name1;
        } else {
            return "Нет повторов";
        }
    }

// TODO: Создайте метод которому можно передать массив элементов , а он вернет последний элемент

    public static int lastFromMassive(int[] testmassive12) {
        int lastint = testmassive12[testmassive12.length - 1];
        return lastint;
    }

// TODO: Создайте метод счетчик букв А . Подается строка и метод посчитает сколько букв А в строке

    public static String A_counter(String enterYourWord) {
        char l = 'а';
        int counter = 0;
        for (int i = 0; enterYourWord.length() > i; i++) {
            if (enterYourWord.charAt(i) == l)
                counter++;
        }
        return "Количество букв " + l + " - " + counter;
    }

// TODO: Создайте метод кошелек , у него есть начальная сумма и можно вычитать пока деньги не кончатся или сумма не будет слишком велика

    public static String wallet(double enterYourValue) {
        double min = 0.00;
        double result = walletValue - enterYourValue;
        if (result < min) {
            return "Недостаточно средств для выполнения операции";
        } else {
            walletValue = result;
            return "Остаток средств на счёте (руб.) = " + result;
        }

    }

}