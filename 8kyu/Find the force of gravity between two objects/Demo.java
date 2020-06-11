public class Solution {

public static double solution(double[] arrVal, String[] arrUnit) {
        double[] values = arrVal;
        String[] units = arrUnit;
        
        double kg = 1;
        double gram = 0.001;
        double microgram = 0.000000001;
        double lb =  0.453592;
        double miligram = 0.000001;

        double meter = 1;
        double centimeter = 0.01;
        double milimeter = 0.001;
        double micrometer = 0.000001;
        double ft = 0.3048;

        double mass1 =  units[0] == "g" ? values[0] * gram:
                        units[0] == "mg" ? values[0] * miligram:
                        units[0] == "μg" ? values[0] * microgram:
                        units[0] == "lb" ? values[0] * lb: arrVal[0];
        double mass2 =  units[1] == "g" ? values[1] * gram:
                        units[1] == "mg" ? values[1] * miligram:
                        units[1] == "μg" ? values[1] * microgram:
                        units[1] == "lb" ? values[1] * lb: arrVal[1];
        double distance = units[2] =="cm" ? values[2] * centimeter:
                          units[2] =="mm" ? values[2] * milimeter:
                          units[2] == "ft" ? values[2] * ft:
                          units[2] =="μm" ? values[2] * micrometer: arrVal[2];

        System.out.println(mass1);
        System.out.println(mass2);
        System.out.println(distance);


        double massMultiply = (mass1 * mass2);
        double distanceSquare = Math.pow(distance, 2);


        return 6.67e-11 * (massMultiply / distanceSquare);
    }
  
}

//https://www.codewars.com/kata/5b609ebc8f47bd595e000627/train/java