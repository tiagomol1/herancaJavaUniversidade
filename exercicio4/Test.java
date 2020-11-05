public class Test {
  
  public static void main(String[] args) {
    
    Circle circle = new Circle("red", true, 3.2);
    System.out.println("Circle: ");
    System.out.println(circle);
    System.out.println(circle.getPerimeter());
    System.out.println(circle.getArea());
    System.out.println("-------------------------------------");
    
    Rectangle rectangle = new Rectangle("blue", false, 10.2, 21.4);
    System.out.println("Rectangle: ");
    System.out.println(rectangle);
    System.out.println(rectangle.getPerimeter());
    System.out.println(rectangle.getArea());
    System.out.println("-------------------------------------");
    
    Rectangle rectangle = new Rectangle("blue", false, 10.2, 21.4);
    System.out.println("Rectangle: ");
    System.out.println(rectangle);
    System.out.println(rectangle.getPerimeter());
    System.out.println(rectangle.getArea());
    System.out.println("-------------------------------------");
  }

}