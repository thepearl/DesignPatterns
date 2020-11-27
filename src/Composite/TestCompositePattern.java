package Composite;

public class TestCompositePattern {

    public static void main(String[] args) {
        Shape tri = new TriangleLeaf();
        Shape tri1 = new TriangleLeaf();
        Shape cir = new CircleLeaf();

        Drawing drawing = new Drawing();
        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(cir);

        drawing.draw("Red");

        drawing.clear();

        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("Green");
    }
}
