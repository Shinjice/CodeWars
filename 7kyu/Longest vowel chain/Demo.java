class Solution{
  public static int solve(String s){
        String[]word = s.split("");
        int counter = 0;
        int counterHigh = 0;
        for(int i = 0; i < word.length; i++){
            if(word[i].equals("a") ||
                    word[i].equals("e") ||
                    word[i].equals("i") ||
                    word[i].equals("o") ||
                    word[i].equals("u")){
                counter++;
                if(counter > counterHigh) {
                    counterHigh = counter;
                }
            } else {
                counter = 0;
            }
            //System.out.println(word[i] + " " + counter + " " + counterHigh);
        }
        return counterHigh;
    }
}

//https://www.codewars.com/kata/59c5f4e9d751df43cf000035/train/java