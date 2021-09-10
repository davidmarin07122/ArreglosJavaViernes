
package arrays;

import java.util.Scanner;
import packagetwo.Class1;


public class Arrays {

    
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner (System.in);
        
        int []numbers = new int[6];
       
        for(int i = 0 ; i < numbers.length;i ++){
            System.out.println("Digite un numero");
            numbers[i]=entrada.nextInt();
        }
        
        for(int i = 0 ; i < numbers.length;i ++){
            System.out.println(numbers[i]);
        }
    }
  
}
