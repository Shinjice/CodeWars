public class Dinglemouse {

  public static final Dinglemouse INST = new Dinglemouse();
      
  private static int ONE_HUNDRED = 100;

  private static int value = ONE_HUNDRED; 

  private Dinglemouse() {
    value = ONE_HUNDRED;
  }
  
  public int plus100(int n) {
    return value + n;
  }
  
}

//https://www.codewars.com/kata/596c55fc7bd5476bf60000d5/train/java