package design.creational.abstractFactory;

/**
 * Created by anandu on 14/6/16.
 */
public interface AbstractFactory {
    Shape getShape(String name);
    Color getColor(String name);
}
