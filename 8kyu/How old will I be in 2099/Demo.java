public class AgeDiff 
{
  public static String CalculateAge(int birth, int yearTo) 
  {
    return  birth == yearTo ? "You were born this very year!":
            birth - yearTo == 1 ? "You will be born in "+ (birth-yearTo) +" year.":
            yearTo - birth == 1 ? "You are "+ (yearTo-birth) +" year old." :
            birth < yearTo ? "You are "+ (yearTo-birth) +" years old." :
            "You will be born in "+ (birth-yearTo) +" years.";
  }
}

//https://www.codewars.com/kata/5761a717780f8950ce001473/train/java