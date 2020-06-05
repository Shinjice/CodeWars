public class GrassHopper {

    public static char getGrade(int s1, int s2, int s3) {
        int s4 = (s1 + s2 + s3)/3;
        if(s4 >89){
        return 'A';
        }
        else if(s4 >79 && s4 <91){
        return 'B';
        }
        else if(s4 >69 && s4 <81){
        return 'C';
        }
        else if(s4 >59 && s4 <71){
        return 'D';
        }
        else if(s4 < 61){
        return 'F';
        }
        return 'A';
    }
}

//https://www.codewars.com/kata/55cbd4ba903825f7970000f5/train/java