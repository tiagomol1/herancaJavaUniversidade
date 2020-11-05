public class Test {
  
  public static void main(String[] args) {
    
    Circle circle = new Circle("red", true, 3.2);
    System.out.println("Circle: ");
    System.out.println(circle);
    System.out.println("Perimetro: " + circle.getPerimeter());
    System.out.println("Area: " + circle.getArea());
    System.out.println("-------------------------------------");
    
    Rectangle rectangle = new Rectangle("blue", false, 10.2, 21.4);
    System.out.println("Rectangle: ");
    System.out.println(rectangle);
    System.out.println("Perimetro: " + rectangle.getPerimeter());
    System.out.println("Area: " + rectangle.getArea());
    System.out.println("-------------------------------------");
    
    Square square = new Square("green", true, 10.2);
    System.out.println("Square: ");
    System.out.println(square);
    System.out.println("-------------------------------------");
  }

}