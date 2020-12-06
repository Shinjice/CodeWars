public class Calculator{
  public static Double calculate(final double numberOne, final String operation, final double numberTwo){
    switch (operation) {
      case "+": return numberOne + numberTwo;
      case "-": return numberOne - numberTwo;
      case "*": return numberOne * numberTwo + 0.0;
      case "/": return numberTwo != 0 ? numberOne / numberTwo : null;
      default: return null;
    }
  }
}

//https://www.codewars.com/kata/5296455e4fe0cdf2e000059f/train/java