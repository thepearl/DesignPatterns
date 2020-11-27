package Composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{

    //Collection of Shapes
    private List<Shape> shapes = new ArrayList<Shape>();

    @Override
    public void draw(String fillColor) {
        for(Shape sh : shapes)
        {
            sh.draw(fillColor);
        }
    }

    public void add(Shape sh){
        shapes.add(sh);
    }

    public void remove(Shape sh){
        shapes.remove(sh);
    }

    public void clear(){
        System.out.println("Clearing all the shapes from drawing");
        shapes.clear();
    }
}
