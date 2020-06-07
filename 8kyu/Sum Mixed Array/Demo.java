import java.util.List;

public class MixedSum {

  public int sum(List<?> mixed) { 
    
    int sum = 0;
    
    for(int i = 0; i < mixed.size(); i++){
      if (mixed.get(i) instanceof String){
        String temp = String.valueOf(mixed.get(i));
        sum += Integer.parseInt(temp);
      } else {
        sum += ((Integer) mixed.get(i)).intValue();
      }
    }
    return sum;
  }
}

//https://www.codewars.com/kata/57eaeb9578748ff92a000009/train/java