package shapes_factoryDesignPattern;

public class Factory_ShapeGenerator {
    Shape shape;

    Shape getShape(String shapeType){
        if(shapeType == null || shapeType.isEmpty()){
            throw new IllegalArgumentException("Shape can't be empty");
        }


        switch (shapeType.toLowerCase()){
            case "rectangle":
                shape = new Rectangle();
                break;

            case "square":
                shape = new Square();
                break;

            case "circle":
                shape = new Circle();
                break;

            default:
                throw new IllegalArgumentException("Pass a valid shape type!");
        }

        return shape;
    }
}
