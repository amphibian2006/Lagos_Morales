import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[][] sensorSismos = matrizSismos();
        lecturaSismos(sensorSismos);
        menuSismos(sensorSismos);
    }

    public static double[][] matrizSismos() {
        Scanner leer = new Scanner(System.in);
        int dias = 0;
        try{
            do{
                System.out.println("Cuantos días: ");
                dias = leer.nextInt();
            }while (dias < 2 || dias > 31);
        }catch (Exception e){
            System.out.println("Ingrese un número válido");
        }
        return new double[dias][24];
    }

    public static void lecturaSismos(double[][] sensorSismos) {
        for (int i = 0; i < sensorSismos.length; i++) {
            for (int j = 0; j < sensorSismos[0].length; j++) {
                double numeroAleatorio = (Math.random()*8.5)+1;
                sensorSismos[i][j] = numeroAleatorio;
                System.out.print("["+sensorSismos[i][j]+"]");
            }
            System.out.println();
        }
    }

    public static void menuSismos(double[][] sensorSismos) {
        mostrarMenu();
        elegirOpcion(sensorSismos);
    }

    public static void mostrarMenu() {
        System.out.println("[1] Mostrar sismo más intenso");
        System.out.println("[2] Mostrar sismos ≥ 4.0 grados Richter");
        System.out.println("[3] Reiniciar el arreglo con nuevos valores");
        System.out.println("[4] Salir");
    }

    public static void elegirOpcion(double[][] sensorSismos) {
        int eleccion=0;
        switch (eleccion){
            case 1:
                //MaxSismo(sensorSismos);
                break;
            case 2:
                sismosMayores(sensorSismos);
                break;
            case 3:
                lecturaSismos(sensorSismos);
                break;
            case 4:
                break;
        }

    }

    public static void sismosMayores(double[][] sensorSismos) {
        int[] sismosPorDia = contarSismosMayores(sensorSismos);
        mostrarSismosMayores(sismosPorDia);
    }

    public static int[] contarSismosMayores(double[][] sensorSismos) {
        int[] sismosPorDia = new int[sensorSismos.length];
        for (int i = 0; i < sensorSismos.length; i++) {
            int contador = 0;
            for (int j = 0; j < sensorSismos[0].length; j++) {
                if(sensorSismos[i][j] >= 4.0){
                    contador++;
                }
            }
            sismosPorDia[i] = contador;
        }
        return sismosPorDia;
    }

    public static void mostrarSismosMayores(int[] sismosPorDia) {
        for (int i = 0; i < sismosPorDia.length; i++) {
            System.out.println("Día "+(i+1)+" = "+sismosPorDia[i]+" veces");
        }
    }

}
