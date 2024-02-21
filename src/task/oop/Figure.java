package task.oop;

// TODO: Создайте абстрактный класс "Фигура", в котором определены общие свойства и методы для всех геометрических фигур
//  (например, метод для расчета площади).
//  От него унаследуйте классы "Круг", "Прямоугольник" и "Треугольник", переопределив специфичные методы для каждой фигуры.


public abstract class Figure {
    protected double x, y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double getFigurePerimeter();

    public abstract double getFigureArea();


    public static void main(String[] args) {
        Figure f1 = new Circle(3, 5, 8);
        System.out.println(f1.getFigureArea());

    }

}
