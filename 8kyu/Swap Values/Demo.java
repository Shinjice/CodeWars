class Swapper{

  public Object[] arguments;
  
  public Swapper(final Object[] args){
    arguments=args;
  }
  
  public void swapValues() {
    Object[] args = new Object[]{arguments[0],arguments[1]};
    Object temp = args[0];
    arguments[0] = args[1];
    arguments[1] = temp;
  }
}

//https://www.codewars.com/kata/5388f0e00b24c5635e000fc6/train/java