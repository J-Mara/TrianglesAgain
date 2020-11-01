public class Triangle{
  private Point v1;
  private Point v2;
  private Point v3;

  public Triangle(Point a, Point b, Point c){
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1,double x2, double y2,double x3, double y3){
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }

  public double getPerimeter(){
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }

  public double getArea(){
    double S = getPerimeter()/2;
    return Math.sqrt(S * (S - v1.distanceTo(v2)) *
    (S - v2.distanceTo(v3)) *
    (S - v3.distanceTo(v1)));
  }

  public String classify(){
    if(Math.round(10000 * v1.distanceTo(v2)) == Math.round(10000 * v2.distanceTo(v3)) &&
    Math.round(10000 * v2.distanceTo(v3)) == Math.round(10000 * v3.distanceTo(v1)) &&
    Math.round(10000 * v3.distanceTo(v1)) == Math.round(10000 * v1.distanceTo(v2))){
      return "equilateral";
    }
    if(Math.round(10000 * v1.distanceTo(v2)) != Math.round(10000 * v2.distanceTo(v3)) &&
    Math.round(10000 * v2.distanceTo(v3)) != Math.round(10000 * v3.distanceTo(v1)) &&
    Math.round(10000 * v3.distanceTo(v1)) != Math.round(10000 * v1.distanceTo(v2))){
      return "scalene";
    }
    return "isosceles";
  }

  public String toString(){
    return "v1(" + v1.getX() + "," + v1.getY() + ") v2(" + v2.getX() + "," + v2.getY() + ") v3(" + v3.getX() + "," + v3.getY() + ")";
  }

}
