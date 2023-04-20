import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner myWeight = new Scanner(System.in);
    double weight;
    weight = myWeight.nextDouble();
    Scanner myHeight = new Scanner(System.in);
    double height;
    height = myHeight.nextDouble();
    double bmi = height / ( weight * weight);
    System.out.println(bmi);
  }
}
