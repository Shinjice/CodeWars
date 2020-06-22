import java.util.List;
import java.util.Collections;
class sorter {
  public static List<String> sort(List<String> textbooks) {
    //use sort() from Collections with the static field of String class to ensure case insensitivity
    Collections.sort(textbooks, String.CASE_INSENSITIVE_ORDER);
    return textbooks;
  }
}

//https://www.codewars.com/kata/5a07e5b7ffe75fd049000051/train/java