import java.util.Arrays;

public class PythagoreanTriple {
  
  public int pythagoreanTriple(int[] triple)
  {
      if(Math.pow(triple[2],2) == (Math.pow(triple[0],2) + Math.pow(triple[1],2) ))
        return 1;
      return 0;
    
  }

  
}

//https://www.codewars.com/kata/5951d30ce99cf2467e000013/train/java