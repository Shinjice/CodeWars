public class Dinglemouse {

  public static int[] humanYearsCatYearsDogYears(final int humanYears) {
    int catYears = 0;
    int dogYears = 0;
    int[] temp = new int[3];
    temp[0]=humanYears;
    
    if(humanYears == 1){
      temp[1]=15;
      temp[2]=15;
    }
    else if(humanYears == 2){
      temp[1]=24;
      temp[2]=24;
    }
    else {
      temp[1]= 24 + (humanYears - 2) * 4;
      temp[2]= 24 + (humanYears - 2) * 5;
    }
    return temp;
  }

//https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b/train/java