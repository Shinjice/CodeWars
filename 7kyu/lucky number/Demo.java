public class LuckyNumber {
  
public static boolean isLucky(long n) {
    long tmp = 0;
    String a = String.valueOf(n);
    System.out.println(a);
    for(int i = 0; i < a.length(); i++){
        System.out.println(Integer.valueOf(String.valueOf(a.charAt(i))));
        tmp += Integer.valueOf(String.valueOf(a.charAt(i)));
    }
    return tmp % 9 == 0;
    }
}

//https://www.codewars.com/kata/55afed09237df73343000042/train/java