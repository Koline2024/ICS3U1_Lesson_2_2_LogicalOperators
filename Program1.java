class Program1 extends ConsoleProgram {


  /**
  * Demonstration of logical operators `&&`, `||`, `!`
  * @author:
  */
  
  public void run() {
    
    Integer intEntered = readInt("Enter the PIN. ");
    Integer intPassword = 1234;
    Boolean blnPasswordTrue = (intEntered == intPassword);
    if (blnPasswordTrue == true) {

      System.out.println("Nice");
      
    } else {
      System.out.println("Bruh mistake");
    }
    
  }
}
