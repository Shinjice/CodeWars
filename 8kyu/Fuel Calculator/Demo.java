public class Kata{
  public static double fuelPrice(int litres, double pricePerLiter) {
    return 
          litres <2 ? (double)litres * pricePerLiter:
          litres >= 2 && litres <4 ? litres * (pricePerLiter - 0.05):
          litres >= 4 && litres <6 ? litres * (pricePerLiter - 0.10):
          litres >= 6 && litres <8 ? litres * (pricePerLiter - 0.15):
          litres >= 8 && litres <10 ? litres * (pricePerLiter - 0.20):
          litres * (pricePerLiter - 0.25);
  }
}

//https://www.codewars.com/kata/57b58827d2a31c57720012e8/train/java