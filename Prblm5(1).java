import java.util.Scanner;
public class Prblm5{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    for(int rowC = 1; rowC<=row; rowC++){
      for(int colC = 1; colC<=rowC; colC++){
        System.out.print("*");
      }
      System.out.println();
    }
    
  }
}

