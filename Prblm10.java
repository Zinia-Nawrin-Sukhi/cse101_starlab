import java.util.Scanner;
public class Prblm10{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int str;
    
    for(int i = 1; i<=row; i++){
      for(int j = 1; j<=(row-i);j++){
        System.out.print(" ");
      }
      for(int k=1; k<=(2*i-1);k++){
        System.out.print(k);
      }
      System.out.println();  
    }
    
  }
}

