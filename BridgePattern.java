/** "Client" */
public class BridgePattern {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new CircleShape(1, 2, 3, new DrawingAPI1());
        shapes[1] = new CircleShape(5, 7, 11, new DrawingAPI2());
        shapes[2] = new CircleShape(3, 4, 5, new DrawingAPI3()); // New Circle with DrawingAPI3
        shapes[3] = new RectangleShape(1, 1, 2, 3, new DrawingAPI1()); // New Rectangle

        for (Shape shape : shapes) {
            shape.resizeByPercentage(2.5);
            shape.draw();
        }
    }
}
