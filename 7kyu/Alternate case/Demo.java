class Kata {
    static String alternateCase(final String string) {
        String tmp = "";
        for(int i = 0; i<string.length(); i++){
            if(Character.isUpperCase(string.charAt(i))){
                tmp+= Character.toLowerCase(string.charAt(i));
            } else {
                tmp+= Character.toUpperCase(string.charAt(i));
            }
        }
    return tmp;
    }
}

//https://www.codewars.com/kata/57a62154cf1fa5b25200031e/train/java