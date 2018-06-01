package design.creational.factory;

import design.creational.abstractFactory.Circle;
import design.creational.abstractFactory.Rectangle;
import design.creational.abstractFactory.Shape;

/**
 * Created by anandu on 14/6/16.
 */
public class ShapeFactory implements Factory{
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
}
