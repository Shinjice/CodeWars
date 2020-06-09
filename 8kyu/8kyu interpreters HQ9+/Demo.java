public class HQ {
    public static String HQ9(char code) {
        if(code == 'H'){
            return "Hello World!";
        }
        if(code == 'Q'){
            return Character.toString(code);
        }
        String lyric = "";
        if(code == '9'){
            for(int i = 99; i > 1; i--){
                lyric += (i+" bottles of beer on the wall, "+i+" bottles of beer.\n");

                if(i <= 99 && i > 2){
                    lyric += ("Take one down and pass it around, "+(i-1)+" bottles of beer on the wall.\n");
                }
                if(i == 2){
                    lyric += ("Take one down and pass it around, 1 bottle of beer on the wall.\n");
                    lyric += ("1 bottle of beer on the wall, 1 bottle of beer.\n");
                    lyric += ("Take one down and pass it around, no more bottles of beer on the wall.\n");
                    lyric += ("No more bottles of beer on the wall, no more bottles of beer.\n");
                    lyric += ("Go to the store and buy some more, 99 bottles of beer on the wall.");
                }
            }
            return lyric;
        }
        return null;
     }
}

//https://www.codewars.com/kata/591588d49f4056e13f000001/train/java