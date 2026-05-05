abstract class Shape {
    String color;
    double s;

    Shape(String color) {
        this.color = color;
    }

    abstract void square();
    abstract void show(String t);
}
