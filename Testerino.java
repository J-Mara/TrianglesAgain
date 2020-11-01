public class Testerino{
  public static void main(String[] args) {
    Point p1 = new Point(2, 5);
    Point p2 = new Point(6, 2);
    Point p3 = new Point(6, 5);
    Point p4 = new Point(6, 8);
    Point p5 = new Point(3, 3);
    Triangle t1 = new Triangle(p1, p2, p3);
    Triangle t2 = new Triangle(p1, p2, p4);

    System.out.println(p1.distanceTo(p2));

    System.out.println(p1.equals(p2));

    System.out.println(t1.getPerimeter());

    System.out.println(t1.getArea());

    System.out.println(t1.classify());
    System.out.println(t2.classify());

    System.out.println(t1.toString());
    System.out.println(t2.toString());

    t1.setVertex(0, p5);
    t2.setVertex(2, p5);

    System.out.println(t1.toString());
    System.out.println(t2.toString());
  }
}
