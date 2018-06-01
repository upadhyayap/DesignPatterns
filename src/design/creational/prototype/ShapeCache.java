package design.creational.prototype;

import design.creational.abstractFactory.Shape;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by anandu on 14/6/16.
 */
public class ShapeCache {

    private static Map<String,Shape> cache = new HashMap<String,Shape>();

    static {
        cache.put("shape",new RawShape());
    }

    public static AbstractShape getShape(String name) throws CloneNotSupportedException{
        AbstractShape shape = null;
        AbstractShape prototype = null;
        prototype = (AbstractShape)cache.get("shape");
        shape = prototype.clone();
        shape.name = name;
        return shape;
    }

    public static RawShape getShape() throws CloneNotSupportedException {
        RawShape shape = null;
        RawShape prototype = null;
        prototype = (RawShape)cache.get("shape");
        shape = prototype.clone();
        return shape;
    }

}
