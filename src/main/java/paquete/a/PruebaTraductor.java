/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.a;

import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class PruebaTraductor {

    public static void main(String[] args) {
        Traductor prueba = new Traductor();

        prueba.insertarNuevaPalabra("Hello", "Hola");
        prueba.insertarNuevaPalabra("bike", "coche");
        prueba.insertarNuevaPalabra("men", "hombre");
        prueba.insertarNuevaPalabra("phone", "telef");
        prueba.insertarNuevaPalabra("put", "poner");
        
        prueba.insertarNuevaPalabra("boat", "barco");
        prueba.insertarNuevaPalabra("drive", "conducir");
        prueba.insertarNuevaPalabra("forget", "olvidar");
        prueba.insertarNuevaPalabra("screen", "pantalla");
        prueba.insertarNuevaPalabra("mouse", "raton");

        prueba.imprmirMap();
        System.out.println("Modificando la palabra bike por bici");
        prueba.modificarPalabra("bike", "bici");
        prueba.imprmirMap();

        ArrayList<String> listaPalabrasIngles = prueba.pasarMapArrayListPalabrasIngles();
        System.out.println("---------Lista de palabras en ingles-----------");
        for (String listaPalabrasIngle : listaPalabrasIngles) {
            System.out.println(listaPalabrasIngle);
        }
        ArrayList<String> listaPalabrasEspanyol = prueba.pasarMapArrayListPalabrasEspanyol();
        System.out.println("----------Lista de palabras en español-------------");
        for (String listaPalabrasEsp : listaPalabrasEspanyol) {
            System.out.println(listaPalabrasEsp);
        }
    }
}
