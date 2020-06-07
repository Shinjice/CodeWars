public class TipCalculator {

  public static Integer calculateTip(double amount, String rating) {
    // tip tap
    if(rating.equalsIgnoreCase("terrible")){
      return (int)(Math.ceil(amount * 0.00));
    }
    if(rating.equalsIgnoreCase("poor")){
      return (int)(Math.ceil(amount * 0.05));
    }
    if(rating.equalsIgnoreCase("good")){
      return (int)(Math.ceil(amount * 0.10));
    }
    if(rating.equalsIgnoreCase("great")){
      return (int)(Math.ceil(amount * 0.15));
    }
    if(rating.equalsIgnoreCase("excellent")){
      return (int)(Math.ceil(amount * 0.20));
    }
    if(rating.isEmpty()){
    return null;
    }
    return null;
  }
}

//https://www.codewars.com/kata/56598d8076ee7a0759000087/train/java