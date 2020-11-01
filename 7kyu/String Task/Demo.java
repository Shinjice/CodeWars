public class StringTask {
  public static String perform(String word) {
		String temp = word.toLowerCase().replaceAll("[aeiouy]", "");
    String[] seperate = temp.split("");
    String result = "";
    if(temp.equals(""))
      return "";
    for(int i = 0; i < seperate.length; i++){
      result += "." + seperate[i];
    }
	return result;
  }
}

//https://www.codewars.com/kata/598ab63c7367483c890000f4/train/java