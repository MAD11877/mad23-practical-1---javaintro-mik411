import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner myHeight = new Scanner(System.in);
    double height;
    height = myHeight.nextDouble();
    Scanner myWeight = new Scanner(System.in);
    double weight;
    weight = myWeight.nextDouble();
   // System.out.println("Enter Height in M");
    double bmi = weight / ( height * height);
    System.out.println(bmi);
  }
}
