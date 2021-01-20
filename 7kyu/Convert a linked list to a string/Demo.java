public class Kata {
  public static String stringify(Node list) {
      return list == null ? "null" : list.getData() + " -> " + stringify(list.getNext());
  }
}

//https://www.codewars.com/kata/582c297e56373f0426000098/train/java