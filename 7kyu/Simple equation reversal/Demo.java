
import java.util.ArrayList;

class Solution{    
public static String solve(String eq){
        char[]a=eq.toCharArray();
        ArrayList<String> list=new ArrayList<String>();
        String number = "";
        for (int i = 0; i < a.length; i++) {
            if(Character.isDigit(a[i])){
               number+=a[i];
               if(i == a.length-1){
                   list.add(number);
               }
            } else {
                //System.out.println(number);
                //System.out.println(a[i]);
                list.add(number);
                number = "";
                list.add(String.valueOf(a[i]));
            }
        }
        //System.out.println(Arrays.toString(list.toArray()));
        String temp = "";
        for (int j = list.size()-1; j >= 0; j--) {
            temp+=list.get(j);
        }
        return temp;
    }
}

//https://www.codewars.com/kata/5aa3af22ba1bb5209f000037/train/java