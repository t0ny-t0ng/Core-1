package task.oop;

public class Triangle extends Figure {
protected double z;

    public Triangle(double x, double y) {
        super(x, y);
    }

    public Triangle(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getFigurePerimeter () {
        return x + y + z;
    }

        public double getFigureArea() {
            return (x * y) /2;
        }

    }




