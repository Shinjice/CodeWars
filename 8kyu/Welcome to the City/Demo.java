public class Hello{
  public String sayHello(String [] name, String city, String state){
    return "Hello, " + String.join(" ", name)+"! Welcome to " + city + ", " + state+"!";
  }
}

//https://www.codewars.com/kata/5302d846be2a9189af0001e4/train/java