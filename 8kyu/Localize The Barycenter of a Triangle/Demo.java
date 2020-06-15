class Barycenter {
    
    public static double[] barTriang(double[] x, double[] y, double[] z)
    {
        double x1 = (x[0] + y[0] + z[0]) / 3; 
        double y1 = (x[1] + y[1] + z[1]) / 3; 
        x1 = x1 * 10000;
        x1 = Math.round(x1);
        x1 = x1 /10000;
        y1 = y1 * 10000;
        y1 = Math.round(y1);
        y1 = y1 /10000;
        return new double[] {x1, y1};
    }
}

//https://www.codewars.com/kata/5601c5f6ba804403c7000004/train/java