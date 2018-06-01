package design.creational.abstractFactory;

/**
 * Created by anandu on 14/6/16.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String name) {
        AbstractFactory factory;
        switch (name) {
            case "shape": {
                factory =  new ShapeFactory();
                break;
            }
            case "color" :{
                factory =  new ColorFactory();
                break;
            }
            default:{
                factory =  null;
                break;
            }
        }

        return factory;
    }

}
