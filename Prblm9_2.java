import java.util.Scanner;
public class Prblm9_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lineAmount = sc.nextInt();
        
        for(int lineCount=1; lineCount<=lineAmount; lineCount++){
            for(int spCount=1; spCount<= (lineAmount-lineCount);spCount++){
                System.out.print(" ");
            }
            for(int strCount=1; strCount<= lineCount*2-1; strCount++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        
    }
}
