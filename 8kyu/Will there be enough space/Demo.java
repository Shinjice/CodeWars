public class Bob {
  public static int enough(int cap, int on, int wait){
    return cap >= (on+wait) ? 0 : (on+wait)-cap ;
  }
}

//https://www.codewars.com/kata/5875b200d520904a04000003/train/java