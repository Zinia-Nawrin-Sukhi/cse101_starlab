import java.util.Scanner;
public class Prblm3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x, y;
    x = sc.nextInt();
    y = sc.nextInt();
    for(int i=1; i<=x;i++){
      for(int j=1; j<=y; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    
  }
}

