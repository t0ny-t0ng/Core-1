# Задания для выполнения 
 
Добро пожаловать! В этом репозитории вы найдете задания, которые помогут вам практиковаться в Java разработке. Ниже представлено описание каждого задания. 
 
## Задание 1: Класс Parent 
 
Вам необходимо создать класс  Parent  и реализовать в нем следующие методы: 
 
1.  sum(int a, int b) : метод, принимающий два числа и возвращающий их сумму. 
2.  sumFromString(String str, int num) : метод, принимающий строку, в которой передано число, и число, а возвращающий сумму в виде числа. 
3.  returnString(String str) : метод, принимающий строку и возвращающий ее. 
4.  printParent() : метод, не принимающий и не возвращающий ничего, лишь выводящий на экран "I am Parent". 
5.  concatenateStrings(String str1, String str2) : метод, возвращающий конкатенацию (сумму двух строк), принимающий две строки. 
 
## Задание 2: Класс Child1 
 
Создайте класс  Child1 , который наследуется от класса  Parent , и переопределите все 5 методов: 
 
1.  sum(int a, int b) : переопределите метод так, чтобы он перемножал числа, а не складывал. 
2.  sumFromString(String str, int num) : переопределите метод так, чтобы получившееся число после суммирования умножалось на 2. 
3.  returnString(String str) : переопределите метод так, чтобы он возвращал только первую букву из строки. 
4.  printParent() : переопределите метод так, чтобы он выводил на экран "I am Child1". 
5.  concatenateStrings(String str1, String str2) : переопределите метод так, чтобы после слияния двух строк он обрезал строку и возвращал только ее половину. 
 
## Задание 3: Класс Child2 
 
Создайте класс  Child2 , который наследуется от класса  Parent , и перегрузите все 5 методов: 
 
1.  sum(int a, int b, int c) : перегрузите метод так, чтобы он принимал 3 числа и возвращал их сумму. 
2.  sumFromString(String str1, String str2, String str3) : перегрузите метод так, чтобы он принимал 3 строки, внутри которых лежат числа, и возвращал их сумму. 
3.  concatenateStrings(String str1, String str2) : перегрузите метод так, чтобы он принимал две строки и возвращал их конкатенацию. 
4.  printChild2(String str) : перегрузите метод так, чтобы он принимал аргумент строку и выводил на экран "I am Child2" + переданную строку. 
5.  concatenateStrings(String str1, String str2, String str3) : перегрузите метод так, чтобы он принимал 3 строки и возвращал их конкатенацию. 
 
## Задание 4: Абстрактный класс "Фигура" 
 
Создайте абстрактный класс  Фигура , в котором определены общие свойства и методы для всех геометрических фигур. Например, вы можете определить метод для расчета площади. Затем унаследуйте классы  Круг ,  Прямоугольник  и  Треугольник  от абстрактного класса  Фигура  и переопределите специфичные методы для каждой фигуры. 
 
## Задание 5: Абстрактный класс "Сотрудник" 
 
Создайте абстрактный класс  Сотрудник , в котором определены общие характеристики для всех сотрудников, например, имя и возраст. Затем создайте подклассы для различных типов сотрудников, таких как  Менеджер  и  Работник склада , и опишите в них специфичные методы и свойства. 
 
## Завершение 
 
Мы надеемся, что эти задания помогут вам практиковаться в Java разработке и улучшить ваши навыки. Удачи в выполнении заданий!

  ![](../../../materials/core-1-oop.png)
