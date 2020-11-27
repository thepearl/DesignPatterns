package Composite;

public class CircleLeaf implements Shape {

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing CircleLeaf with color " +fillColor);
    }
}
