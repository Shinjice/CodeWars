import java.util.*;

public class Kata13December {

    public static List <Integer> filterOddNumber(List <Integer> listOfNumbers) {

        for (Iterator <Integer> iterator = listOfNumbers.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        return listOfNumbers;
    }
}

//https://www.codewars.com/kata/566dc566f6ea9a14b500007b/train/java