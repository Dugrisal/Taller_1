package com.company;

import clases.CapacidadEndedudamiento;
import clases.Constantes;

import java.util.Scanner;

public class Main {
    //Recuerda que aca empieza todo
    public static void main(String[] args) {
        //Con este objeto de la clase Scanner puedes capturar informacion por consola cada ves que lo uses
        // recuerda cerrar el flujo de consulta cada ves lo uses sobre para que los uses in.close()
        Scanner in = new Scanner(System.in);

        // Crear objeto de la clase CapacidadEndedudamiento
        CapacidadEndedudamiento capacidadED = new CapacidadEndedudamiento();

        // Crear objeto de la clase Constanstes para mensajes en consola
        Constantes constantes = new Constantes();

        // Declarar variables de trabajo
        String valores;
        int ingMesuales;
        int gastosFijos;
        int gastosVaria;


        //Ciclo para ingresar *N usuarios
        String entrada = "SI";
        while (entrada.equals(constantes.getConSI())) {

                //Esto te dara la primera entrada al proceso de solicitar los datos para instancir nuestro objeto
                // CapacidadEndedudamiento()
                //Valida las entradas de los usuarios que no vayas a convertir una "A" numero y el calculo no te funcione
                //Utiliza el metodo is numeric para vada entrada de ser necesarios

                // Ingresar Ingresos Totales
                System.out.println(constantes.getIngresarIngreTo());
                valores = in.nextLine();
                // validar si es numerico
                if (isNumeric(valores)){
                    ingMesuales = Integer.parseInt(valores);
                    capacidadED.setIngresosTotales(ingMesuales);

                    // Ingresar Gastos Fijos
                    System.out.println(constantes.getIngresarGastoFi());
                    valores = in.nextLine();
                    //Validar si es numerico
                    if (isNumeric(valores)){
                        gastosFijos = Integer.parseInt(valores);
                        capacidadED.setGastosFijos(gastosFijos);

                        // Ingresar Gastos Variables
                        System.out.println(constantes.getIngresarGastoVa());
                        valores = in.nextLine();
                        //validar si es numerico
                        if (isNumeric(valores)){

                            gastosVaria = Integer.parseInt(valores);
                            capacidadED.setGastoVaribales(gastosVaria);

                            // Mostrar en consola capacidad de endeudamiento
                            System.out.println(constantes.getCapacidadEnduda() + capacidadED.getCapacidadEndeudamiento());

                        }
                        else{
                            System.out.println(constantes.getErrorGastoVa());
                        }
                    }
                    else{
                        System.out.println(constantes.getErrorGastoFi());
                    }

                } else{
                    System.out.println(constantes.getErrorIngreTo());
                }

                // Solicitar al usuario si desea continuar
                System.out.println(constantes.getContinuar());
                entrada = in.nextLine();
                while (ValContinuar(entrada) ){
                    // Solicitar al usuario si desea continuar
                    System.out.println(constantes.getContinuar());
                    entrada = in.nextLine();
                }
        }
    }

    public static boolean isNumeric(String value) {

        try {
            // implementa un bloque try catch aca
            Double.parseDouble(value);

            return true;

        }catch (Exception e){

            return false;
        }
    }

    public static boolean ValContinuar(String value){
        Constantes constantes2 = new Constantes();

        if(value.equals(constantes2.getConSI())){
            return false;
        }
        else if(value.equals(constantes2.getConNO())){
            return false;
        }
        else {
            return true;
        }

    }
}

