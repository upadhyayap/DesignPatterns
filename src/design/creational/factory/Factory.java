package design.creational.factory;

import design.creational.abstractFactory.Shape;

/**This pattern provides an interface for creating objects
 * but let subclass decide which object to create.
 * Created by anandu on 14/6/16.
 */
public interface Factory {
    Shape getShape(String name);
}
