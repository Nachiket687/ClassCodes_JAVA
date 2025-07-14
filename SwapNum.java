class SwapNum {
  public static void main (String args []){
    int a = 10;
    int b = 20;
    int c = 0;

    System.out.println("A before swap" + a);
    System.out.println("B before swap" + b);
    
    c = a ;
    a = b ;
    b = c ;

    System.out.println("A before swap" + a);
    System.out.println("B before swap" + b);

  }
}
