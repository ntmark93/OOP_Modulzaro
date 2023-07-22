package shape;

public class Circle {
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    public void sizeOfCircle() {
        double perimeter = 2 * this.r * Math.PI;
        System.out.println("Egy " + this.r + " sugarú kör kerülete= " + perimeter);
        double area = (this.r * this.r) * Math.PI;
        System.out.println("Egy " + this.r + " sugarú kör területe= " + area);
    }
}
