public class Author{

  private String name;
  private String email;
  private char gender;

  public Author(String name, String email, char gender){
    this.name = name;
    this.email = email;
    this.gender = gender;
  }

  public String toString(){
    return "(" + this.name + " , " + this.gender + " , " + this.email + ")";
  }

}