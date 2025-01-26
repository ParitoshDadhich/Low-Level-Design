package shapes_factoryDesignPattern;

import java.util.HashMap;
import java.util.Map;

/*
2. Use Reflection for Better Scalability (Optional):
Instead of hardcoding shape creation, you can use a registry pattern or reflection to dynamically instantiate shapes. This makes adding new shapes easier.

Hardcoding in switch: Adding new shapes requires modifying the factory, which violates the Open-Closed Principle.
 */

public class ShapeFactory {
    private static final Map<String, Class<? extends Shape>> shapeRegistry = new HashMap<>();

    static {
        // Register shapes
        shapeRegistry.put("rectangle", Rectangle.class);
        shapeRegistry.put("square", Square.class);
        shapeRegistry.put("circle", Circle.class);
    }

    public Shape getShape(String shapeType){
        Class<? extends Shape> shapeClass = shapeRegistry.get(shapeType.toLowerCase());

        if(shapeClass == null){
            throw new IllegalArgumentException("Provide valid shape type!");
        }

        try {
            return shapeClass.getDeclaredConstructor().newInstance();
        } catch (Exception e){
            throw new RuntimeException("Error while creating shape: " + e);
        }
    }
}
