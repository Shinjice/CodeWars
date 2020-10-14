import java.util.List;

public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        String binaryString = "";
        for(int i = 0; i < binary.size() ; i++){
            binaryString += "" + binary.get(i);
        }
    return Integer.parseInt(binaryString,2);
    }
}

//https://www.codewars.com/kata/578553c3a1b8d5c40300037c/train/java