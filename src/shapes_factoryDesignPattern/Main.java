package shapes_factoryDesignPattern;

public class Main {
    public static void main(String[] args) {
//        ShapeFactory shapeGenerator = new Factory_ShapeGenerator();
        ShapeFactory shapeGenerator = new ShapeFactory();

        Shape shape1 = shapeGenerator.getShape("rectangle");
        shape1.draw();

        Shape shape2 = shapeGenerator.getShape("circle");
        shape2.draw();

        Shape shape3 = shapeGenerator.getShape("square");
        shape3.draw();
    }
}
