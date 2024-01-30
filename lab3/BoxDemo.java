
public class BoxDemo {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.setDim(10, 2, 15.5);
        System.out.println(box1.volume());

        Box box2 = new Box();
        box2.setDim(100, 3, 10);
        System.out.println(box2.volume());

    }
}

class Box {
    double length;
    double breadth;
    double depth;

    void setDim(double l, double b, double d) {
        length = l;
        breadth = b;
        depth = d;
    }

    double volume() {
        return length * breadth * depth;
    }
}
