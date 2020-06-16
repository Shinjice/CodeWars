public class Kata 
{
    public static String buildString(String... args)
    {
      StringBuffer sb = new StringBuffer();
      sb.append("I like ");
      for(int i = 0; i < args.length; i++) {
         sb.append(args[i]);
         if(i < args.length -1){
         sb.append(", ");
         }
      }
      sb.append("!");
      return sb.toString();
    }
}

//https://www.codewars.com/kata/55c90cad4b0fe31a7200001f/train/java