public class DnaStrand {
  public static String makeComplement(String dna) {
   String[] temp = dna.split("");//Your code
        String reverse = "";

        for(int i = 0; i < temp.length; i++){
            if(temp[i].equals("T")){
                temp[i] = "A";
            }
            else if(temp[i].equals("A")){
                temp[i] = "T";
            }
            else if(temp[i].equals("C")){
                temp[i] = "G";
            }
            else if(temp[i].equals("G")){
                temp[i] = "C";
            }
            reverse += temp[i];
        }
        return reverse;
  }
}

//https://www.codewars.com/kata/554e4a2f232cdd87d9000038/train/java