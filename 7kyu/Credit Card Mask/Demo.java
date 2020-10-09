public class Maskify {
    public static String maskify(String str) {
        //throw new UnsupportedOperationException("Unimplemented");
        String[] mask = str.split("");
        String masked = "";
        for(int i = 0 ; i < str.length(); i++){
            if(i < str.length() - 4){
                mask[i] = "#";
            }
            masked += mask[i];
        }
        return masked;
    }
}

//https://www.codewars.com/kata/5412509bd436bd33920011bc/train/java