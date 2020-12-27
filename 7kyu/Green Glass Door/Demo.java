public class GreenGlassDoor {
  boolean stepThroughWith(String s) {
    return s.matches(".*(\\w)\\1.*");
  }
}

//https://www.codewars.com/kata/5642bf07a586135a6f000004/train/java