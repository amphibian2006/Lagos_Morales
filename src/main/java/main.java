import java.util.NoSuchElementException;
import java.util.Scanner;

public class main {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        try{
        menuSismos();
        }catch (Exception e){
            System.out.println("Valor no valido");
        }
    }

    private static void menuSismos() {
        int n;
            do {
                System.out.println("¿Cuantos dias quiere ver? ");
                n = leer.nextInt();
            }while (n < 2 || n > 31);
                double[][] sensorSismos = new double[n][(int) 24];
                lecturaSismos(sensorSismos);
                mostrarSismos(sensorSismos);
                try{
                Menu(sensorSismos);
                }catch (Exception e){
                    System.out.println("Valor no valido");
                }

    }

    private static void Menu(double[][] sensorSismos) {
        int eleccion;
        do {
            System.out.println("===== MENÚ =====");
            System.out.println("[1] Mostrar sismo más intenso");
            System.out.println("[2] Mostrar sismos ≥ 4.0 grados Richter");
            System.out.println("[3] Reiniciar el arreglo con nuevos valores");
            System.out.println("[4] Salir");
            eleccion = leer.nextInt();
            switch (eleccion) {
                case 1:
                    MaxSismo(sensorSismos);
                    break;
                case 2:
                    sismosMayores(sensorSismos);
                    break;
                case 3:
                    lecturaSismos(sensorSismos);
                    mostrarSismos(sensorSismos);
                    break;
                case 4:
                    break;
            }
        }while (eleccion!=4);
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

    public static void MaxSismo(double[][] sensorSismos) {
        double Max=0;
        int dia=0;
        int hora=0;
        for(int i=0;i<sensorSismos.length;i++ ){
            for (int j = 0; j < sensorSismos[i].length; j++) {
                if(sensorSismos[i][j]>Max){
                    Max=sensorSismos[i][j];
                    if(Max==sensorSismos[i][j]){
                      dia=i+1;
                      hora=j+1;
                    }
                }
                 }
            }
        System.out.println("El dia "+dia+" a las: "+hora+":00");
        System.out.println("El mayor sismo es: "+Max);
        }

    public static void mostrarSismos(double[][] sensorSismos) {
        for (int i = 0; i < sensorSismos.length; i++) {
            for (int j = 0; j < sensorSismos[i].length; j++) {
                System.out.print("["+sensorSismos[i][j]+"]");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    public static void lecturaSismos(double[][] sensorSismos) {
        for (int i = 0; i < sensorSismos.length; i++) {
            for (int j = 0; j < sensorSismos[0].length; j++) {
                double numeroAleatorio = (Math.random() * 8.5) + 1;
                sensorSismos[i][j] = numeroAleatorio;
            }
        }
    }
}
