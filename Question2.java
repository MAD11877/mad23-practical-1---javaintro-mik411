import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    System.out.println("Enter Weight in KG");
    Scanner myWeight = new Scanner(System.in);
    double weight;
    weight = myWeight.nextDouble();
    System.out.println("Enter Height in M");
    Scanner myHeight = new Scanner(System.in);
    double height;
    height = myHeight.nextDouble();
    double bmi = height / ( weight * weight);
    System.out.println(bmi);
  }
}
