/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio3.ejercicio3_dam117;

/**
 *
 * @author DAM117
 */
public class Ejercicio3_DAM117 {

    public static void main(String[] args) {
    String frase="Me llamo Samuel Gonzalez Trueba";
    int conEspacios=frase.length();
        System.out.println("Longitud de la frase con espacios: "+conEspacios);
        int sinEspacios=frase.replace(" "," ").length();
        System.out.println("La frase tiene: "+sinEspacios+" letras");
    }
}
