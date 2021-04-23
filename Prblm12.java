import java.util.Scanner;
public class Prblm12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lineAmount = sc.nextInt();
        
        for(int lineCount=1; lineCount<=lineAmount*2-1; lineCount++){
            if(lineCount<=lineAmount){
            for(int spCount=1; spCount<= (lineAmount-lineCount);spCount++){
                System.out.print(" ");
            }
            for(int strCount=1; strCount<= lineCount*2-1; strCount++){
                System.out.print("*");
            }
            }else{
            for(int spCount=(lineCount-lineAmount); spCount>=1 ;spCount--){
                System.out.print(" ");
            }
            int sp = (lineCount-lineAmount); //number of space
            for(int strCount=(lineAmount-sp)*2-1; strCount>=1 ; strCount--){
                System.out.print("*");
            }
            }
            
            System.out.println();
        }
        
    }
}
