import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

final class AlphaChar{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String guardado = "";

        System.out.println("Introduzca la cadena: ");
        String cadena = input.nextLine();
        for(int i = 0; i<(cadena.length()-1);i++){
            char val1 = cadena.charAt(i);
            char val2 = cadena.charAt(i+1);
            if(i == (cadena.length()-2)){
                if(val1 <= val2){
                    guardado = guardado + val1;
                    if(val2 >= val1){
                        guardado = guardado + val2;
                    }
                }
            }else if(val1 <= val2){
                guardado = guardado + val1;
            }else{
                guardado = guardado + val1 + " ";
            }

        }
        String result[] = guardado.split(" ");
        String indexS= Collections.max(Arrays.asList(result));
      
        
        input.close();
        System.out.println(indexS);

    }





}