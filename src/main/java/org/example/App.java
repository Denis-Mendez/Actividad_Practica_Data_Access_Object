package org.example;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("------------DAO Persona-------------");
        System.out.println();

        int cuenta = DAOPersona.cuentaPersonas();

        if(cuenta > 0) {
            System.out.println("Hay "+ cuenta + " registros en la tabla PERSONA");


        }else {
            System.out.println("No hay registros en la tabla PERSONA");
        }
    }
}