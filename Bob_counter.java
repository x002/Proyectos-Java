import java.util.Scanner;

final class BobCounter {
    public static void main(String[] args){
        int count = 0;
        final Scanner cadenaInput = new Scanner(System.in);
        
        System.out.print("Introduce your Bobs: ");
        final String cadena = cadenaInput.next();

        for(int i = 0; i< (cadena.length()-2); i++){
            if (cadena.charAt(i) == 'b'){

                if(cadena.charAt(i +1) == 'o'){

                    if(cadena.charAt(i + 2) == 'b'){
                       count += 1;
                    }
                }
            }
        }
            
        cadenaInput.close();
        System.out.println("Number of times bob occurs is: " + count);
    }
}