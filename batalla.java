import java.util.Scanner;

public class batalla {
    public static void main(String[] args) {
        //juego de batalla naval con matrices
        //le preguntamos al usuario el tamaño de la matriz
        System.out.println("Ingrese el tamaño de la matriz");
        Scanner sc = new Scanner(System.in);
        int tamaño = sc.nextInt();
        //preguntamos al usuario el numero de barcos
        System.out.println("Ingrese el numero de barcos");
        int barcos = sc.nextInt();
        //creamos las matrices
        int[][] matriz1 = new int[tamaño][tamaño];
        int[][] matriz2 = new int[tamaño][tamaño];
        //llenamoos las matrices con asteriscos y que ponga un 0 cuando el usuario ingrese esa coordenada salga un 0 en la matriz
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                matriz1[i][j] = '*';
                matriz2[i][j] = 0;
            }
        }
        //llenamos la matriz con los barcos que el usuario ingrese
        for (int i = 0; i < barcos; i++) {
            System.out.println("Ingrese la coordenada de la fila del barco " + (i + 1));
            int fila = sc.nextInt();
            System.out.println("Ingrese la coordenada de la columna del barco " + (i + 1));
            int columna = sc.nextInt();
            System.out.println("Ingrese la orientacion del barco " + (i + 1));
            String orientacion = sc.next();
            //pedimos la orientacion del barco con un if para saber si es horizontal o vertical ingresando una letra
            if (orientacion.equals("h")) {
                for (int j = 0; j < tamaño; j++) {
                    matriz1[fila][j] = 'B';
                }
            } else {
                for (int j = 0; j < tamaño; j++) {
                    matriz1[j][columna] = 'B';
                }
            }
            
            }
            
        //llenamos la matriz con los barcos que el usuario ingrese
        for (int i = 0; i < barcos; i++) {
            System.out.println("Ingrese la coordenada de la fila del barco " + (i + 1));
            int fila = sc.nextInt();
            System.out.println("Ingrese la coordenada de la columna del barco " + (i + 1));
            int columna = sc.nextInt();
            System.out.println("Ingrese la orientacion del barco " + (i + 1));
            String orientacion = sc.next();
            //pedimos la orientacion del barco con un if para saber si es horizontal o vertical ingresando una letra
            if (orientacion.equals("h")) {
                for (int j = 0; j < tamaño; j++) {
                    matriz2[fila][j] = 'B';
                }
            } else {
                for (int j = 0; j < tamaño; j++) {
                    matriz2[j][columna] = 'B';
                }
            }
            
            }
        
       /* //imprimimos la matriz
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }*/
        //el juego terminara cuando el usuario haya acertado todos los barcos
        int aciertos = 0;
        while (aciertos < barcos) {
            System.out.println("Ingrese la coordenada de la fila");
            int fila = sc.nextInt();
            System.out.println("Ingrese la coordenada de la columna");
            int columna = sc.nextInt();
            if (matriz1[fila][columna] == 'B') {
                matriz2[fila][columna] = 'X';
                aciertos++;
            } else {
                matriz2[fila][columna] = 'O';
            }
            //imprimimos la matriz
            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {
                    System.out.print(matriz2[i][j] + " ");
                }
                System.out.println();
            }
        }
        System.out.println("Felicidades, has ganado");


}
}
