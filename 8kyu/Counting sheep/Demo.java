public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    int scheepCounter = 0;
    for(int i = 0; i < arrayOfSheeps.length; i++){
        if(arrayOfSheeps[i]==null){
          continue;
        }
        if(arrayOfSheeps[i]==true){
          ++scheepCounter;
        }
      
    }
    return scheepCounter;
  }
}

//https://www.codewars.com/kata/54edbc7200b811e956000556/train/java