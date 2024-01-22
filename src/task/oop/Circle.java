package task.oop;

public class Circle extends Figure {

    private double radius;

    public Circle (int x, int y, double radius) {
        super(x,y);
        this.radius = radius;
    }

    public double getFigureArea () {
        return radius * radius * Math.PI;
    }

    public double getFigurePerimeter () {
        return radius * Math.PI * 2;
    }

}
