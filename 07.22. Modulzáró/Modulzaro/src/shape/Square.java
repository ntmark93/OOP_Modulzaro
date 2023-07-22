package shape;

public class Square {
    private final double a;

    public Square(double a) {
        this.a = a;
    }
    public void sizeOfSquare() {
        double perimater = 4 * this.a;
        System.out.println("Egy " + this.a + " hosszú oldalú négyzet kerülete= " + perimater);
        double area = this.a * this.a;
        System.out.println("Egy " + this.a + " hosszú oldalú négyzet területe= " + area);
    }
}
