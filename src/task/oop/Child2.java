package task.oop;

// TODO: Создайте класс Child2 и перегрузите методы.
//  1. Первый метод примет 3 числа и сложит их.
//  2. Второй метод примет 3 строки, внутри которых лежат числа, и вернет их сумму.
//  3. Третий метод примет две строки и вернет их конкатенацию.
//  4. Четвертый метод примет аргумент строку и выведет на экран "I am Child2" + переданная строка.
//  5. Пятый метод принимает 3 строки и возвращает их конкатенацию.

public class Child2 {

    //  1. Первый метод примет 3 числа и сложит их.
    public int summ(int first, int second, int third) {
        return first + second + third;
    }
    public double summ (double first, double second, double third) {return first + second + third;}

//  2. Второй метод примет 3 строки, внутри которых лежат числа, и вернет их сумму.
    public int summIntString(String numberString, String numberString2, String numberString3) {
        return Integer.parseInt(numberString) + Integer.parseInt(numberString2) + Integer.parseInt(numberString3);
    }

        //  3. Третий метод примет две строки и вернет их конкатенацию.
        public String stringReturner (String enterYourString, String enterYourString2) {
            return enterYourString + enterYourString2;
        }

//  4. Четвертый метод примет аргумент строку и выведет на экран "I am Child2" + переданная строка.
        public String parentGreetings(String enterYourText) {
    return "I am Child2 " + enterYourText;
}

//  5. Пятый метод принимает 3 строки и возвращает их конкатенацию.

    public String stringConcatenation(String stringOne, String stringTwo, String stringThree) {
        return stringOne + stringTwo + stringThree;
    }

}
