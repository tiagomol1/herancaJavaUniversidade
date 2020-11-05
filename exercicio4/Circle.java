public class Circle extends Shape{

  private Double radius;

  public Circle(String color, boolean filled, Double radius){
    super(color, filled);
    this.radius = radius;
  }

  public Double getRadius(){
    return this.radius;
  }

  public void setRadius(Double radius){
    this.radius = radius;
  }

  public Double getArea(){
    return 3.14 * (this.radius * this.radius);
  }

  public Double getPerimeter(){
    return 2 * 3.14 * this.radius;
  }

  public String toString(){
    return super.toString() + ", " + Double.toString(this.radius);
  }

}