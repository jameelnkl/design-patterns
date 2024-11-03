/** "Refined Abstraction" for Rectangle */
class RectangleShape implements Shape {
    private double x, y, width, height;
    private DrawingAPI drawingAPI;

    public RectangleShape(double x, double y, double width, double height, DrawingAPI drawingAPI) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.drawingAPI = drawingAPI;
    }

    // Low-level implementation-specific
    @Override
    public void draw() {
        System.out.printf("Rectangle at (%f, %f) with width %f and height %f%n", x, y, width, height);
        // You can call the drawingAPI here for rectangle if needed
    }

    // High-level abstraction-specific
    @Override
    public void resizeByPercentage(double pct) {
        width *= pct;
        height *= pct;
    }
}
