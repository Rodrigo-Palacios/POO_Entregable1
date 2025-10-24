/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_grpc;

/**** @author rodri*/
public class Clases_GRPC {
    
    String compañia;
    int sumaAsegurada;
    String plan;
    int deducible;
    int coaseguro;
    boolean coberturaExtranjero;

    /*** @param args the command line arguments*/
    public static void main(String[] args) {
        // Primer objeto
        Clases_GRPC seguro_1 = new Clases_GRPC();
        
        seguro_1.compañia = "Atlas";
        seguro_1.sumaAsegurada = 8000000;
        seguro_1.plan = "Platinum";
        seguro_1.deducible = 10;
        seguro_1.coaseguro = 90000;
        seguro_1.coberturaExtranjero = true;
        
        System.out.println("Compañia: " + seguro_1.compañia);
        System.out.println("Suma asegurada: " + seguro_1.sumaAsegurada);
        System.out.println("Plan: " + seguro_1.plan);
        System.out.println("Deducible: " + seguro_1.deducible + "%");
        System.out.println("Coaseguro: Topado a " + seguro_1.coaseguro);
        System.out.println("Cobertura en el extranjero: " + seguro_1.coberturaExtranjero);
        System.out.println("________________________________");
        
        Clases_GRPC seguro_2 = new Clases_GRPC();
        
        seguro_2.compañia = "GNP Seguros";
        seguro_2.sumaAsegurada = 7500000;
        seguro_2.plan = "Cobalto";
        seguro_2.deducible = 10;
        seguro_2.coaseguro = 85000;
        seguro_2.coberturaExtranjero = false;
        
        System.out.println("Compañia: " + seguro_2.compañia);
        System.out.println("Suma asegurada: " + seguro_2.sumaAsegurada);
        System.out.println("Plan: " + seguro_2.plan);
        System.out.println("Deducible: " + seguro_2.deducible + "%");
        System.out.println("Coaseguro: Topado a " + seguro_2.coaseguro);
        System.out.println("Cobertura en el extranjero: " + seguro_2.coberturaExtranjero);
        System.out.println("________________________________");
        
        Clases_GRPC seguro_3 = new Clases_GRPC();
        
        seguro_3.compañia = "MedLife";
        seguro_3.sumaAsegurada = 7500000;
        seguro_3.plan = "Azul";
        seguro_3.deducible = 15;
        seguro_3.coaseguro = 90000;
        seguro_3.coberturaExtranjero = true;
        
        System.out.println("Compañia: " + seguro_3.compañia);
        System.out.println("Suma asegurada: " + seguro_3.sumaAsegurada);
        System.out.println("Plan: " + seguro_3.plan);
        System.out.println("Deducible: " + seguro_3.deducible + "%");
        System.out.println("Coaseguro: Topado a " + seguro_3.coaseguro);
        System.out.println("Cobertura en el extranjero: " + seguro_3.coberturaExtranjero);
        System.out.println("________________________________");
        
        Clases_GRPC seguro_4 = new Clases_GRPC();
        
        seguro_4.compañia = "Mapfre";
        seguro_4.sumaAsegurada = 10000000;
        seguro_4.plan = "Paladium";
        seguro_4.deducible = 10;
        seguro_4.coaseguro = 70000;
        seguro_4.coberturaExtranjero = true;
        
        System.out.println("Compañia: " + seguro_4.compañia);
        System.out.println("Suma asegurada: " + seguro_4.sumaAsegurada);
        System.out.println("Plan: " + seguro_4.plan);
        System.out.println("Deducible: " + seguro_4.deducible + "%");
        System.out.println("Coaseguro: Topado a " + seguro_4.coaseguro);
        System.out.println("Cobertura en el extranjero: " + seguro_4.coberturaExtranjero);
        System.out.println("________________________________");
        
        
    }
    
}
