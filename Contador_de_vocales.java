import java.util.Scanner;


final class Vocales {

    public static void main(String[] args) {

        final Scanner cadenaInput = new Scanner(System.in);
        final String vocales = "aeiou";
        int count = 0;

        System.out.print("Introduce your string: ");

        final String cadena = cadenaInput.next();

        for (int i = 0; i<cadena.length(); i++){

            if(vocales.contains(Character.toString(cadena.charAt(i)))){
                count += 1;
            }

        }           
        cadenaInput.close();
        System.out.println("Number of vowels: " + count);
    }

}