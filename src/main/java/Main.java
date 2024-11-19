

import java.util.Scanner;

class Figma{
  int age;
 public void show(int input){
   age = input;
   System.out.println(input);
 }
}


public class Main {


  static void multiplicationTable(){
    int rows, I, j, columns =10;
    Scanner input = new Scanner(System.in);
    I = 1;
    rows = input.nextInt();
    do{
      j = 1;
      do{
        System.out.print(I * j + " ");
        j++;
      }while(j<=columns);
      
      System.out.println();
      I++;
    }while(I <= rows);
  }



  
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Figma manager = new Figma();
    manager.show(54);

    multiplicationTable();
  }


}