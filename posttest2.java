import java.util.*;
class whites {
   void getchar(String input) {
    StringBuffer inputbuff = new StringBuffer(input);
    int buuff_length = inputbuff.length();
    for (int i = 0; i < buuff_length; i++) {
        if (inputbuff.charAt(i) == ' ') {  
          inputbuff.deleteCharAt(i);
          buuff_length--;
       
      }
    }
    System.out.println("String without Space is: "+inputbuff);

  }
  public static void main(String[] args)
  {
	  whites w=new whites();
	  Scanner scan = new Scanner(System.in);
      System.out.println("Enter the String to reduce white spaces:");
      String input = scan.nextLine();
      w.getchar(input);
 }
}