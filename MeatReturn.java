import java.util.Scanner;

public class MeatReturn {
  
  
  public static void main(String[] args) { 
    
 Scanner input = new Scanner(System.in);
  
  double HngWgt;
  double LveWgt;
  double BnlsWgt;
  double FstBchr = .6;
  double ScdBchr = .7;
  double Remainder;
  
  Scanner in = new Scanner(System.in);
  System.out.println("Enter Live Weight");
  LveWgt = in.nextDouble();
  
  HngWgt = LveWgt*FstBchr;
    BnlsWgt = HngWgt*ScdBchr;
   
    System.out.println("You will recieve " + BnlsWgt);
    

  
  
  
  }
  
  /* ADD YOUR CODE HERE */
  
}
