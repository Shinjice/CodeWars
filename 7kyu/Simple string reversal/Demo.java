class Solution{
    public static String solve(String s){  
      char[] inputArray = s.toCharArray();
      char[] result = new char[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                result[i] = ' ';
            }
        }
        int j = result.length - 1;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != ' ') {
                if (result[j] == ' ') {
                   j--;
                }
                result[j] = inputArray[i];
                j--;
            }
        }
        return String.valueOf(result);
    }
}

//https://www.codewars.com/kata/5a71939d373c2e634200008e/train/java