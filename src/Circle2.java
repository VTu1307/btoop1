public class Circle2 {
    private double radius;

    public Circle2() {
        radius =1.0;

    }
    public Circle2(double r) {
        radius = r;
    }

    public void SetRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    public double getArea () {
        return radius * radius * Math.PI;
    }
    public double getCircumference () {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString () {
        return "Circle [Radius= " + radius + "]";
    }
}
