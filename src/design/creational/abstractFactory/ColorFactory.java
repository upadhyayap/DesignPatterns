package design.creational.abstractFactory;

/**
 * Created by anandu on 14/6/16.
 */
public class ColorFactory implements AbstractFactory {
    @Override
    public Shape getShape(String name) {
        return null;
    }

    @Override
    public Color getColor(String name) {
        Color color;
        switch (name) {
            case "Red": {
                color =  new Red();
                break;
            }
            case "green" :{
                color =  new Green();
                break;
            }
            default:{
                color =  null;
                break;
            }
        }
        return color;
    }
}
