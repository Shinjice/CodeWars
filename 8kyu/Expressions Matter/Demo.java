public class Kata {
    public static int expressionsMatter(int a, int b, int c) {
        // Your Code here... Happy Coding!
        int d = a * (b + c);
        int e = a * b * c;
        int f = a + b * c;
        int g = (a + b) * c;
        int h = a + b + c;
        
        if(d>=e && d>=f && d>=g && d>=h){
        return d;
        }
        if(e>=d && e>=f && e>=g && e>=h){
        return e;
        }
        if(f>=d && f>=e && f>=g && f>=h){
        return f;
        }
        if(g>=d && g>=e && g>=f && g>=h){
        return g;
        } 
        if(h>=d && h>=e && h>=f && h>=g){
        return h;
        } 
        return 0;
    }
}

//https://www.codewars.com/kata/5ae62fcf252e66d44d00008e/train/java