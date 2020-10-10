public class BattleOfTheCharacters {
    public static String battle(final String x, final String y) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabetArray = alphabet.split("");
        String[] xArray = x.split("");
        String[] yArray = y.split("");
        int opponent1 = 0;
        int opponent2 = 0;
        for(int i = 0; i < alphabet.length(); i++){
            for(int j = 0; j < x.length(); j++){
                if(xArray[j].toLowerCase().equals(alphabetArray[i])){
                    opponent1 += (i+1);
                    //System.out.println(xArray[j]+ " x hit with = " + opponent1);
                }
            }
            for(int k = 0; k < y.length(); k++){
                if(yArray[k].toLowerCase().equals(alphabetArray[i])){
                    opponent2 += (i+1);
                    //System.out.println(yArray[k]+ " y hit with = " + opponent2);
                }
            }

        }
        //System.out.println("scorex="+ opponent1);
        //System.out.println("scorey="+ opponent2);
        return (opponent1 > opponent2) ? x: (opponent1 < opponent2) ? y : "Tie!"; // Let the battle begin!
    }
}

//https://www.codewars.com/kata/595519279be6c575b5000016/train/java