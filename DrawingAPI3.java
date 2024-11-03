
class DrawingAPI3 implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("API3.circle at %f:%f radius %f%n", x, y, radius);
    }
}
