public class TestCircle {
    public static void main(String[] args) {
        Circle c1 =new Circle();
        System.out.println("The Circle has radius of " + c1.getRadius() + " The Circle has area of " + c1.area());
        Circle c2 =new Circle(2.0);
        System.out.println("The Circle has radius of " + c2.getRadius() + " The Circle has area of " + c2.area());



    }
}
