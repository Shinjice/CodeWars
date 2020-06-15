public class Ghost {
   public String getColor() {
        double rand = (int) (Math.random() * 4) + 1;
        return rand == 1 ? "white" : rand == 2 ? "red" : rand == 3 ? "yellow": "purple";
    }
}

//https://www.codewars.com/kata/53f1015fa9fe02cbda00111a/train/java