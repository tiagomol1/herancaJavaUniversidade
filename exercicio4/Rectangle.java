public class Rectangle extends Shape{
  
  private Double width;
  private Double length;

  public Rectangle(String color, boolean filled, Double width, Double length){
    super(color, filled);
    this.width = width;
    this.length = length;
  }

  public Double getWidth(){
    return this.width;
  }

  public Double getLength(){
    return this.length;
  }

  public void setWidth(Double width){
    this.width = width;
  }
  
  public void setLength(Double length){
    this.length = length;
  }

  public Double getArea(){
    return this.length * this.width;
  }

  public Double getPerimeter(){
    return 2 * (this.length + this.width);
  }

  public String toString(){
    return super.toString() + ", " + this.width + ", " + this.length;
  }

}