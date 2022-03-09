/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.c;

/**
 *
 * @author MSI
 */
public class PruebaEjercito {

    public static void main(String[] args) {
        ListaEjercito prueba = new ListaEjercito();

        prueba.rellenarDeEjercitos(new Ejercito("Ruso"));
        prueba.rellenarDeEjercitos(new Ejercito("Chino"));
        prueba.rellenarDeEjercitos(new Ejercito("Frances"));
        prueba.rellenarDeEjercitos(new Ejercito("Americano"));
        prueba.rellenarDeEjercitos(new Ejercito("Aleman"));
        prueba.rellenarDeEjercitos(new Ejercito("Español"));

        prueba.imprmirMap();
        System.out.println("------buscando ejercito--------------");
        Ejercito prueba1 = prueba.buscarPorNombre("Aleman");

        System.out.println(prueba1);
    }
}
