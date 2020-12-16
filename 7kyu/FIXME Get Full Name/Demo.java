public class Dinglemouse {
  private final String fullName;

  Dinglemouse(String firstName, String lastName) {
    fullName = (firstName + " " + lastName).trim();
  }

  String getFullName() {
    return fullName;
  }
}

//https://www.codewars.com/kata/597c684822bc9388f600010f/train/java