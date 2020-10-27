public class Kata {

    public static double[] mapVector(double[] vector, double[] circle1, double[] circle2) {
        double circleOne = circle2[0] - (circle1[0] - vector[0]) * (circle2[2] / circle1[2]);
        double circleTwo = circle2[1] - (circle1[1] - vector[1]) * (circle2[2] / circle1[2]);
        return new double[] { circleOne, circleTwo };
    }
    
}

//https://www.codewars.com/kata/5da995d583326300293ce4cb/train/java