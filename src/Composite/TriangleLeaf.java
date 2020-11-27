package Composite;

public class TriangleLeaf implements Shape {

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color " +fillColor );
    }
}
