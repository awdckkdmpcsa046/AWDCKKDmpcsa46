import java.util.*;
class Main2
{
  public static void main (String[]args)
  {
    int year = 2000;
    if (year % 400 == 0)
      System.out.println ("LEAP YEAR");
    else if (year % 4 == 0 && year % 100 != 0)
      System.out.println ("LEAP YEAR");
    else
        System.out.println ("NOT A LEAP YEAR");
  }
}

OUTPUT:
LEAP YEAR