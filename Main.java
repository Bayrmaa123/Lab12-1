public class Main {
    public static void main(String[] args) {
        Quadrate q = new Quadrate("Red", 5);
        q.square();
        q.show("Kvadrat");

        Rectangle r = new Rectangle("Blue", 4, 8);
        r.square();
        r.show("Tegsh untsugt");
        r.calculatePerimeter();
    }
}