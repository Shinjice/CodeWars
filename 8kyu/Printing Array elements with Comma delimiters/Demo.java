public class ArrayPrinter {

    public static String printArray(Object array[]) {
      StringBuffer sb = new StringBuffer();
      for(int i=0;i<array.length;i++){
        sb.append(array[i]);
        if(i<array.length-1)
          sb.append(",");
      }

      return sb.toString();
    }
}

//https://www.codewars.com/kata/56e2f59fb2ed128081001328/train/java