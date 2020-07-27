class BlueAndRedMarbles {
  public static double guessBlue(double blueStart, double redStart, int bluePulled, int redPulled) {
    return (blueStart -= bluePulled) / (blueStart + redStart - redPulled);
  }
}

//https://www.codewars.com/kata/5862f663b4e9d6f12b00003b/train/java