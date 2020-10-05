class Solution{
    public static String[] capitalize(String s){
        String[] wordSplittedA = s.split("");
        String[] wordSplittedB = s.split("");
        String a = "", b = "";
        for (int i = 0; i < wordSplittedA.length; i++) {
            if (i % 2 == 0){
                wordSplittedA[i] = wordSplittedA[i].toUpperCase();
            }
            if (i % 2 != 0){
                wordSplittedB[i] = wordSplittedB[i].toUpperCase();
            }
            a+=wordSplittedA[i];
            b+=wordSplittedB[i];
        }
        return new String[]{a,b};
    }
}

//https://www.codewars.com/kata/59cfc000aeb2844d16000075/train/java