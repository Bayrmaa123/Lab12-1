class Quadrate extends Shape {
    private int a;

    Quadrate(String color, int a) {
        super(color);
        this.a = a;
    }

    @Override
    void square() {
        this.s = a * a;
    }

    @Override
    void show(String t) {
        System.out.println(t + " [" + color + "] talbai: " + s);
    }
}