package design.creational.prototype;

import design.creational.abstractFactory.Shape;

/**specifies a prototypical instance and creates new instances by cloning the prototypical
 * instance. It reduces the amount of subclass in the system dramatically because .
 * This gets used when the object creation is heavy and instances are almost similer.
 * if you want to hide the complexity of object creation.
 * Created by anandu on 14/6/16.
 */
public class Demo {

    public static void main(String args[]) {
        try{
            Shape rectangle = ShapeCache.getShape("rectangle");
            rectangle.draw();

            // Another way of doing it
            AbstractShape circle = ShapeCache.getShape();
            circle.setName("circle");
            circle.draw();

        }catch(CloneNotSupportedException cns){
            cns.printStackTrace();
        }
    }

}
