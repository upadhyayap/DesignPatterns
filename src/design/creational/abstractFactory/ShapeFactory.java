package design.creational.abstractFactory;

/**
 * Created by anandu on 14/6/16.
 */
public class ShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape(String name) {
        Shape shape;
        switch (name) {
            case "Circle": {
                shape =  new Circle();
                break;
            }
            case "rectangle" :{
                shape =  new Rectangle();
                break;
            }
            default:{
                shape =  null;
                break;
            }
        }
        return shape;
    }

    @Override
    public Color getColor(String name) {
        return null;
    }
}
