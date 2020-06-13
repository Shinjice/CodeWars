public class Kata {
    public static int[] getSize(int w,int h,int d) {
        int[]temp = {2*(w*h+w*d+h*d),w*h*d};
        return temp;
    }
}

//https://www.codewars.com/kata/565f5825379664a26b00007c/train/java