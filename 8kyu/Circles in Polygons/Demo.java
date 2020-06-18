public class Polygon {
    int sides;
    int sideLength;

    public Polygon(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }
    
    public double circleDiameter(){
      double div = Math.toRadians(180.0/sides);
      double den = Math.tan(div);
      return sideLength / den;
    }
    
}

//https://www.codewars.com/kata/5a026a9cffe75fbace00007f/train/java