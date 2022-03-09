/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.a;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author MSI
 */
public class Traductor {

    private Map<String, String> translate;

    public Traductor() {
        translate = new TreeMap<>();
        
        
    }
    //Existirá un método
    //que servirá para guardar una entrada y 
    //recibirá dos palabras (palabraIngles, palabraEspañol)

    public void insertarNuevaPalabra(String palabraIngles, String palabraEspanol) {
        translate.put(palabraIngles, palabraEspanol);
    }
    
     public void borrarPalabra(String palabraIngles) {
        translate.remove(palabraIngles);
    }

    public void modificarPalabra(String palabraIngles, String palabraActualizadaEspanol) {
        translate.replace(palabraIngles, palabraActualizadaEspanol);
    }
    public String traduccionPalabra(String palabraIngles) {
        return translate.get(palabraIngles);
    }
    public void imprmirMap(){
         for (String key : translate.keySet()) {
            System.out.printf("Palabra %s -- Traduccion %s %n", key, translate.get(key));
        }

    }
    
    public void imprimir(){
        for (Map.Entry<String, String> au : translate.entrySet()) {
            Object key = au.getKey();
            Object val = au.getValue();
            
        }
    }
    
    public ArrayList pasarMapArrayListPalabrasIngles(){
        ArrayList <String> listaPalabrasIngles= new ArrayList<>(translate.keySet());
        return listaPalabrasIngles;
        
    }
    
    public ArrayList pasarMapArrayListPalabrasEspanyol(){
        ArrayList <String> listaPalabrasEspanyol= new ArrayList<>(translate.values());
        return listaPalabrasEspanyol;
        
    }
}
