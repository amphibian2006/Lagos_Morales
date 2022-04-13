import java.util.Scanner;

public class main {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        menuSismos();
    }

    private static void menuSismos() {
        int n=0;
        do{
        System.out.println("¿Cuantos dias quiere ver? ");
        n=leer.nextInt();
        }while (n<2 || n>24);
        double[][] sensorSismos = new double[n][(int) 24];
        lecturaSismos(sensorSismos);
        mostrarSismos(sensorSismos);
        Menu(sensorSismos);
    }

    private static void Menu(double[][] sensorSismos) {
        int eleccion=0;
        System.out.println("===== MENÚ =====");
        System.out.println("[1] Mostrar sismo más intenso");
        System.out.println("[2] Mostrar sismos ≥ 4.0 grados Richter");
        System.out.println("[3] Reiniciar el arreglo con nuevos valores");
        System.out.println("[4] Salir");
        eleccion=leer.nextInt();
        switch (eleccion){
            case 1:
                MaxSismo(sensorSismos);
                break;
            case 2:
                MayoresSismos(sensorSismos);
                break;
            case 3:
                lecturaSismos(sensorSismos);
                break;
            case 4:
                break;
        }
    }

    private static void MayoresSismos(double[][] sensorSismos) {

    }

    public static void MaxSismo(double[][] sensorSismos) {
        double Max=0;
        for(int i=0;i<sensorSismos.length;i++ ){
            for (int j = 0; j < sensorSismos[i].length; j++) {
                if(sensorSismos[i][j]>Max){
                    Max=sensorSismos[i][j];
                }
                 }
            }
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
