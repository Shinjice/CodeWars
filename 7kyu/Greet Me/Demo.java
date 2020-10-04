import java.util.Arrays; 
public class GreetMe{
  public static String greet(String name){
    String toLow = name.toLowerCase();
    String[] temp = toLow.split("");
    temp[0] = temp[0].toUpperCase();
    String newName = "";
    for(String letter : temp){
      newName += letter;
    }
    return "Hello " + newName + "!" ;
  }
}

//https://www.codewars.com/kata/535474308bb336c9980006f2/train/java