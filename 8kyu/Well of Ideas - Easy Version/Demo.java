public class Kata {

  public static String well(String[] x) {
    int counterGood = 0;
    for(int i = 0; i < x.length; i++){
      if(x[i].equals("good")){
      counterGood++;
      } 
    }
    if(counterGood == 0){
    return "Fail!";
    }
    if(counterGood < 3){
    return "Publish!";
    }
    else{
    return "I smell a series!";
    }
  }
}

//https://www.codewars.com/kata/57f222ce69e09c3630000212/train/java