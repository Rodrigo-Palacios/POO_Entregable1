/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estatus_grpc;

import javax.swing.JOptionPane;

/**** @author rodri */
public class Estatus_GRPC {
    
    //Declara el arreglo
    double[] calificaciones;
    
    //Crea el constructor
    public Estatus_GRPC(){
    calificaciones = new double[5];//Le asigna 5 espacios
    }
    
    /**
     *
     */
    public double calcularPromedio() {
        double suma = 0;//Esta variable almacenara la suma de calificaciones
        
        //Ciclo for crea una variable temporal calificacion e itera el arreglo calificaciones
        for (double calificacion : calificaciones) {
            suma += calificacion;//suma cada elemento y actualiza la variable suma
        }
        return suma / calificaciones.length;
    }
    
    

    /*** @param args the command line arguments     */
    public static void main(String[] args) {
        
        Estatus_GRPC alumno = new Estatus_GRPC();//crea el objeto alumno
             
        //recorre el arreglo y guarda las calificaciones
        for ( int i = 0; i < alumno.calificaciones.length; i++) {
            
            String entrada = JOptionPane.showInputDialog(null, "Ingresa la calificación " + (i + 1) + ": ");
            alumno.calificaciones[i] =  Double.parseDouble(entrada.trim());
        }
        
        double promedio = alumno.calcularPromedio();
        
        String mensaje = (promedio >= 6) ? "Felicidades, aprobaste con promedio: " + promedio 
                : "No aprobaste, sigue esforzándote. Tu promedio: " + promedio;
        
        JOptionPane.showMessageDialog(null, mensaje);
        
        
    }
    
}
