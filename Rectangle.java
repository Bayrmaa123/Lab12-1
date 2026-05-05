class Rectangle extends Shape {
    private int w, h;

    Rectangle(String color, int w, int h) {
        super(color);
        this.w = w;
        this.h = h;
    }

    @Override
    void square() {
        this.s = w * h;
    }

    // Тэгш өнцөгтөд зориулсан нэмэлт функц
    void calculatePerimeter() {
        System.out.println("Perimeter: " + (2 * (w + h)));
    }

    @Override
    void show(String t) {
        System.out.println(t + " [" + color + "] talbai: " + s);
    }
}