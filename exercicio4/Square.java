public class Square extends Rectangle{

  private Double side;

  public Square(String color, boolean filled, Double side) {
    super(color, filled, side, side);
    this.side = side;
  }

  public Double getSide(){
    return this.side;
  }

  public void setSide(Double side){
    this.side = side;
  }

  public String toString(){
    return super.toString();
  }

}