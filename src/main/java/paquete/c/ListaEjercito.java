/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.c;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author MSI
 */
public class ListaEjercito {

    private Map<String, Ejercito> peloton;

    public ListaEjercito() {
        peloton = new TreeMap<>();
    }

    public void rellenarDeEjercitos(Ejercito nombreEjercito) {
        String identificador = RandomStringUtils.randomNumeric(5);
        peloton.put(identificador, nombreEjercito);
    }

    public void imprmirMap() {
        for (String key : peloton.keySet()) {
            System.out.printf("Identificador %s -- Ejercito %s %n", key, peloton.get(key).getNombre());
        }

    }

    public Ejercito buscarPorNombre(String nombre) {
        for (String key : peloton.keySet()) {
            if (peloton.get(key).getNombre().equals(nombre)) {
                return peloton.get(key);
            }
        }
        return null;
    }

}
