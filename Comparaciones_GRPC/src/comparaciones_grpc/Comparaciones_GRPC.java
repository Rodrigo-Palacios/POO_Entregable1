/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparaciones_grpc;

import javax.swing.JOptionPane;


/**** @author rodri */
public class Comparaciones_GRPC {

    /*** @param args the command line arguments */
    public static void main(String[] args) {
        
        //Envia el mensaje al usuario y almacena el primer numero como string
        String primera_entrada = JOptionPane.showInputDialog(null, "Ingresa el primer numero.");
        
        //Quita espacios y lo conviete en num
        int primer_num = Integer.parseInt(primera_entrada.trim());
        
        /*Prueba que se convierta en numero
        //Muestra primer num
        JOptionPane.showMessageDialog(null, "El primer numero es: " + primer_num);
        */
        String segunda_entrada = JOptionPane.showInputDialog(null, "Ingresa el segundo numero.");
        
        int segundo_num = Integer.parseInt(segunda_entrada.trim());
        
        /*Prueba que se convierta en numero
        //Muestra el segundo num
        JOptionPane.showMessageDialog(null, "El segundo numero es: " + segundo_num);
        */

        //Crea el objeto StringBuilder para armar el texto
        StringBuilder comparaciones = new StringBuilder();
        
        comparaciones.append("Comparaciones entre ").append(primer_num).append(" y ").append(segundo_num).append(":\n");
        comparaciones.append("¿Son iguales? ").append(primer_num == segundo_num ? "Si" : "No").append("\n");
        comparaciones.append("¿Son diferentes? ").append(primer_num != segundo_num ? "Si" : "No").append("\n");
        comparaciones.append("¿Primer > Segundo? ").append(primer_num > segundo_num ? "Si" : "No").append("\n");
        comparaciones.append("¿Primer < Segundo? ").append(primer_num < segundo_num ? "Si" : "No").append("\n");
        comparaciones.append("¿Primero >= Segundo? ").append(primer_num >= segundo_num ? "Si" : "No").append("\n");
        comparaciones.append("¿Primero <= Segundo? ").append(primer_num <= segundo_num ? "Si" : "No").append("\n");
        
        //Muestra las comparaciones en el cuadro de dialogo
        JOptionPane.showMessageDialog(null, comparaciones.toString());
        
    }
    
}
