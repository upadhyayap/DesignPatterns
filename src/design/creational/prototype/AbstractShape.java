package design.creational.prototype;

import design.creational.abstractFactory.Shape;

/**
 * Created by anandu on 14/6/16.
 */
public abstract class AbstractShape implements Shape, Cloneable {

    protected int type;
    protected String name;

    public void setType(int type){
        this.type = type;
    }

    public int getTypes(){
        return type;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getname(){
        return name;
    }

    public AbstractShape clone() throws CloneNotSupportedException {
        Object shape = null;
        shape =  super.clone();
        return (AbstractShape)shape;
    }

}
