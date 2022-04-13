public class Main {
    public static void main(String[] args) {
        double[][] sensorSismos = matrizSismos();
        lecturaSismos(sensorSismos);
        menuSismos();




    }

    public static void menuSismos() {
        mostrarMenu();
    }

    public static void lecturaSismos(double[][] sensorSismos) {
        double numeroAleatorio = (Math.random()*8.5)+1;
        for (int i = 0; i < sensorSismos.length; i++) {
            for (int j = 0; j < sensorSismos[0].length; j++) {
                sensorSismos[i][j] = numeroAleatorio;
                System.out.print("["+sensorSismos[i][j]+"]");
            }
            System.out.println();
        }
    }

    public static double[][] matrizSismos() {
        return new double[10][24];
    }
}
