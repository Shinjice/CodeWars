public class AbbreviateTwoWords {

 public static String abbrevName(String name) {
      String[] parts = name.split(" ");
      char part1 = parts[0].charAt(0);
      char part2 = parts[1].charAt(0);
      return Character.toUpperCase(part1) + "." + Character.toUpperCase(part2);
    }
}

//https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java