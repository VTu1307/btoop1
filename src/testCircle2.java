public class testCircle2 {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2(1.1);
        System.out.println(c1);

        Circle2 c2 = new Circle2();
        System.out.println(c2);


        c1.SetRadius(2.2);
        System.out.println(c1);
        System.out.println("radius is: " + c1.getRadius());


        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());
    }
}
