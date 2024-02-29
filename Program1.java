class Program1 extends ConsoleProgram {


  /**
  * Demonstration of logical operators `&&`, `||`, `!`
  * @author:
  */
  
  public void run() {
    
    int intEntered = readInt("Enter the PIN. ");
    int intPassword = 12345;
    Boolean blnPasswordTrue = (intEntered == intPassword);
    if (blnPasswordTrue == true) {

      System.out.println("Access Granted. What would you like to calculate? ");
      
      double dblOne = readDouble("Enter number one: ");
      double dblTwo = readDouble ("Enter number two: ");
      double dblThree = readDouble ("Enter number three: ");
      double dblFour = readDouble ("Enter number four:");

      double dblSum = dblOne + dblTwo + dblThree + dblFour;
      double dblDifference = dblOne - dblTwo - dblThree - dblFour;
      double dblProduct = dblOne * dblTwo *  dblThree * dblFour;
      double dblDivide = dblOne / dblTwo / dblThree / dblFour;
      double dblAverage = (dblOne + dblTwo + dblThree + dblFour)/4;


      System.out.println("Sum is " + dblSum);
      System.out.println("Difference is " + dblDifference);
      System.out.println("Product is " + dblProduct);
      System.out.println("Division is " + dblDivide);
      System.out.println("Average is " + dblAverage);
      


    } else {
      System.out.println("Wrong!");
    }
    
  }
}
