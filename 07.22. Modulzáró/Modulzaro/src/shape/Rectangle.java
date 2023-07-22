package shape;

public class Rectangle {
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void sizeOfRectangle() {
        double perimeter = 2 * (this.a + this.b);
        System.out.println("Egy " + this.a + " 'a' oldal hosszú és egy " + this.b + " 'b' oldal hosszú téglalap kerülete= " + perimeter);
        double area = this.a * this.b;
        System.out.println("Egy " + this.a + " 'a' oldal hosszú és egy " + this.b + " 'b' oldal hosszú téglalap területe= " + area);

    }
}
