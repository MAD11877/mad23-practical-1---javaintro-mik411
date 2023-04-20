import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double height;
    height = in.nextDouble();
    //Scanner myWeight = new Scanner(System.in);
    double weight;
    weight = in.nextDouble();
   // System.out.println("Enter Height in M");
    double bmi = weight / ( height * height);
    System.out.println(bmi);
  }
}
