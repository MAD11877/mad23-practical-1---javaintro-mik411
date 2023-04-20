import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int number = in.nextInt() + 1;
    String str = "*";
    while (number-- > 0)
      {
        
        System.out.println(str.repeat(number));
      }
    
  }
}
