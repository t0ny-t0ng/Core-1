package task.oop;

public class Rectangle extends Figure {

    public Rectangle (double x, double y) {
        super(x,y);
            }

    public double getFigureArea () {
        return x * y;
    }

    public double getFigurePerimeter () {
        return (x + y) * 2;
            }

}
