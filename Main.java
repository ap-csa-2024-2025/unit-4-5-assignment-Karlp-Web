import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Make sure to test your methods here
    starTree();
  }

  public static void printNTimes(String word, int N)
  {
    for (int i = 0; i < word.length(); i++)
    {
      String L = word.substring(i, i+1);//extracts a single charatcer from word

//loop that runs N times
      for (int n = 0; n < N; n++)
      {
        System.out.println(L); //prints the extracted character N times
      }
    }
  }

  public static void printNums()
  {
    for (int num = 10; num > 0; num--) //current number down till it reaches 0
    {
     for (int num1 = 0; num1 < num; num1++) //makes sure that the number of times to repeat are less than the current number and keeps adding until it reaches <10
     {
      System.out.print(num + " "); //prints the current number with a new line
     } 
     System.out.println(); //new line
    }
    

  }

  public static void uprightNumberTriangle(int N)
  {
    for (int row = 1; row <= N; row++)
    {
      for (int num = 1; num <= row; num++)
      {
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }

  public static void starTree()
  {
    for (int starRow = 9; starRow <= 1; starRow--)//for each row
    {
      for(int starCol = 9; starCol <= 1; starCol--)
      {
        System.out.print((starRow * starCol) + "\t");
      }
      System.out.println();
    }
  }

  public static void multTable()
  {
    for (int rowTens = 1; rowTens <= 10; rowTens ++)
    {
      for (int tens = 1; tens <= 10; tens++)
      {
        System.out.print((rowTens * tens) + "\t");
      }
      System.out.println();
    }
  }
}
