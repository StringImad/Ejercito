/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.b;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/**
 *
 * @author MSI
 */
public class Loteria {

    private Map<Integer, String> bonoLoto;

    public Loteria() {
        bonoLoto = new TreeMap<>();
        rellenarDePremios(bonoLoto);
    }

    private void rellenarDePremios(Map<Integer, String> reci) {
        int aleatorio;
        String ale;
        for (int i = 0; i < 1000; i++) {
            do {
                aleatorio = generadorNumeroAleatorioEntreDosRangos(0, 99999);
                ale = aleatorio + "";
                switch (ale.length()) {
                    case 1:
                        ale = "0000" + aleatorio;
                        break;

                    case 2:
                        ale = "000" + aleatorio;
                        break;

                    case 3:
                        ale = "00" + aleatorio;
                        break;

                    case 4:
                        ale = "0" + aleatorio;
                        break;
                }
            } while (ale.length() < 5);
            reci.put(i, generadorDePremios());

        }
    }
private String generadorDePremios(){
    String premio = "no";    
    if (generadorNumeroAleatorioEntreDosRangos(0, 200)==50) {
        premio = "100000000 €";
    }
    return premio;
}
    private static int generadorNumeroAleatorioEntreDosRangos(int RANGO_MIN, int RANGO_MAX) {
        Random aleatorio = new Random();
        return aleatorio.nextInt(RANGO_MAX - RANGO_MIN + 1) + RANGO_MIN;
    }
    
     public void imprmirMap(){
         for (Integer key : bonoLoto.keySet()) {
            System.out.printf("boleto %s -- premio %s %n", key,bonoLoto.get(key));
        }

    }
}
