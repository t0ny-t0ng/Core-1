package task.oop;

// TODO: Создайте класс Child1 и переопределите все 5 методов.

public class Child1 extends Parent {
    public static void maim(String[] args) {
    }

//  1. Первый метод переопределите так, что вместо суммы первый метод перемножает числа, а не складывает.
    @Override
    public int summ(int first, int second) {
        return first * second;
    }

    //  2. Второй метод переопределите, чтобы получившееся число после суммирования умножалось на 2.
    @Override
    public int summIntString(String numberString, int numberInt) {
        return (Integer.parseInt(numberString) + numberInt) * 2;
    }

//  3. Третий метод переопределите, чтобы возвращал только первую букву из строки.
    @Override
    public String stringReturner(String enterYourString) {
        return enterYourString.substring(0,1);
    }

//  4. Четвертый метод выводит на экран "I am Child1".
    @Override
    public String parentGreetings() {
        return "I am Child1";
    }

//  5. Пятый метод после слияния двух строк должен обрезать строку и вернуть только ее половину.
@Override
public String stringConcatenation(String stringOne, String stringTwo) {
        int charsIndexes = (stringOne + stringTwo).length();
            return (stringOne + stringTwo).substring(0,charsIndexes/2);
}



}