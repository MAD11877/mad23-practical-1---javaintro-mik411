import java.util.Scanner;
import java.util.*;
import java.util.function.Supplier;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int mode = 0;
    int highest_occurences = 0;
    int number = in.nextInt();
    String str = "*";
    List<Integer> list = new ArrayList<Integer>();
    while (number-- > 0)
      {
        int input_number = in.nextInt();
        int occurences = 0;
        list.add(input_number);
        for ( int i : list){
          if (input_number == i){
            occurences++;
          }
        }
        if ( occurences > highest_occurences){
          mode = input_number;
        }
        
      }
    System.out.println(mode);
    
  }
}
