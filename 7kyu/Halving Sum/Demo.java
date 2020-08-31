public class HalvingSum {
  int halvingSum(int n) {
      double temp = n / 2.0;
      int sum = n;
      while(temp > 1.0){
        sum = (int) (sum + temp);
        temp = temp / 2.0;
      }
  return (int)sum;
  }
}

//https://www.codewars.com/kata/5a58d46cfd56cb4e8600009d/train/java