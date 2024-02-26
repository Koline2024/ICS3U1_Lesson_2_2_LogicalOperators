class Program1 extends ConsoleProgram {

  /**
  * Demonstration of logical operators `&&`, `||`, `!`
  * @author:
  */
  
  public void run() {
    
    // start coding here
    int a = 5;
    System.out.println(((1 < a) && (a < 10)));
    System.out.println((1 < a) && (a < 4));

    System.out.println((a == 4) || (a == 5));
    System.out.println((a > 2) || (a < 10));
    System.out.println ((a >= 6) || (a <=4));
    
  }
}
