/*
Name: Rachel Shindelus
Due: 09.18.2022
Purpose: This program should produce the word "TENESSEE"
4. provide your grade with an explanation
*/

public class PrintTennesseeShindelus
{
  public static void main(String[] args)
  {
     //your code , call other methods you wrote to create the output
      printWordTenessee();
  }
  
  /* Prints the Two T's side by side */
  public static void printDoubleT()   {
   // Prints the top of the T's the number of times initialized as numOfT
   for(int numOfT = 0; numOfT < 2; numOfT++) {
      // Prints top of T. Width of 10 T's
     for(int i = 0; i < 10; i++) {
       System.out.print("T");
     }
     System.out.print("\t\t\t");
    }
      // Prints the two stems of the T's. Height of 5 T's
     for(int i = 0; i < 5; i++) {
      System.out.print("\n\t TT\t\t\t\t\t TT");
     }
  }
  
  /* Prints two t's side by side*/
  public static void printDoubleE()    {
   // Printing the top portion of the two E's
    for(int y = 0; y < 2; y++) {
       for(int z = 0; z < 2; z++) {
          for(int i = 0; i < 10; i++) {
          System.out.print("E");
          }
        System.out.print("\t\t\t");
        }
       System.out.print("\nE\t\t\t\t\t\tE\n");
    }
    // Bottom lines of the E's
     for(int z = 0; z < 2; z++) {
      for(int i = 0; i < 10; i++) {
       System.out.print("E");
      }
      System.out.print("\t\t\t");
      }
  }
  /*add block commnet here*/
  public static void printDoubleN()//should display 2 N side by side
  {
   for(int i = 0; i < 2; i++) {
    System.out.print("NN \t\tN\t\t\t");
   }
   System.out.println(" ");
   for(int i = 0; i < 2; i++) {
      System.out.print("N\tN\t\tN\t\t\t");
   }
      System.out.println(" ");
   for(int i = 0; i < 2; i++) {
      System.out.print("N\t\tN\tN\t\t\t");
   }
      System.out.println(" ");
   for(int i = 0; i < 2; i++) {
      System.out.print("N\t\t  NN\t\t\t");
   }
  }
  /*add block commnet here*/ 
  public static void printDoubleS()//should display 2 s side by side
  {
    for(int i = 0; i < 2; i++) {
      System.out.print(" SSSSSSSS \t\t\t");
    }            
    System.out.println("\nS\t\t\tS\t\t\tS\t\t\tS");
    for(int z = 0; z < 2; z++) {
      System.out.println("S\t\t\t \t\t\tS");
    }
    for(int i = 0; i < 2; i++) {
      System.out.print(" SSSSSSSS \t\t\t");
    } 
        for(int i = 0; i < 2; i++) {
    System.out.print("\n \t\t\tS\t\t\t \t\t\tS");
    }
    System.out.println("\nS\t\t\tS\t\t\tS\t\t\tS");
    for(int i = 0; i < 2; i++) {
      System.out.print(" SSSSSSSS \t\t\t");
    }  
  }
  public static void printWordTenessee()  {
   printDoubleT();
   System.out.println("\n");
   printDoubleE();
   System.out.println("\n");
   printDoubleN();
   System.out.println("\n");
   printDoubleE();
      for(int i = 0; i < 2; i++) {
         System.out.println("\n");
         printDoubleS();
      }
       for(int i = 0; i < 2; i++) {
         System.out.println("\n");
         printDoubleE();
      }
  }
}