
class CircleShape implements Shape {
    private double x, y, radius;
    private DrawingAPI drawingAPI;

    public CircleShape(double x, double y, double radius, DrawingAPI drawingAPI) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.drawingAPI = drawingAPI;
    }

    // Low-level implementation-specific
    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }

    // High-level abstraction-specific
    @Override
    public void resizeByPercentage(double pct) {
        radius *= pct;
    }
}
