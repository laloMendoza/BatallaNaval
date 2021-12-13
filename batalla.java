import java.util.Scanner;
public class batalla {
// jose antonio aguilar vega, rafael eduardo mendoza acuña
    public static double aciertos1=0;
    public static double aciertos2=0;
    public static double barcos=0;
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
     
        System.out.println("Ingrese el tamaño de la matriz");
        int tamaño = sc.nextInt();
        
        barcos =Math.round(((tamaño*tamaño)*0.20));
        
        int[][] matriz1 = new int[tamaño][tamaño];
        int[][] matriz2 = new int[tamaño][tamaño];
        int[][] matriz11 = new int[tamaño][tamaño];
        int[][] matriz21 = new int[tamaño][tamaño];
        
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                matriz1[i][j] = 0;
                matriz2[i][j] = 0;
            }
        }
        for (int i = 0; i < barcos; i++) {
            System.out.println("jugador 1");
            System.out.println("Ingrese la coordenada de la fila del barco " + (i + 1));
            int fila = sc.nextInt();
            System.out.println("Ingrese la coordenada de la columna del barco " + (i + 1));
            int columna = sc.nextInt();
            matriz1[fila][columna]=1;
           }
            
       
        for (int i = 0; i < barcos; i++) {
            System.out.println("jugador 2");
            System.out.println("Ingrese la coordenada de la fila del barco " + (i + 1));
            int fila = sc.nextInt();
            System.out.println("Ingrese la coordenada de la columna del barco " + (i + 1));
            int columna = sc.nextInt();
            matriz2[fila][columna]=1;
            }
      
         while (true) {
            System.out.println("---------------------------------------------------");
            System.out.println("jugador 1");
             int aciertost1=1;
            while(aciertost1==1){
                
                
                System.out.println("---------------------------------------------------");
            System.out.println("Ingrese la coordenada x del area enemiga");
            int fila =( sc.nextInt());
            System.out.println("Ingrese la coordenada  y de la fila enemiga ");
            int columna = sc.nextInt();
            if (matriz2[fila][columna] == 1) {
                System.out.println("barco enemigo eliminado");
                matriz21[fila][columna] =1; aciertos1++;} 
            if(matriz2[fila][columna]==0) {matriz21[fila][columna] =0; aciertost1=2; }
            //imprimimos la matriz
            System.out.println("mapeo de el area del jugador 2");
            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {
                    System.out.print(matriz21[i][j] + " ");}
                System.out.println();
            }
            System.out.println("---------------------------------------------------");
            if(aciertos1==barcos){System.out.println("felicidades jugador 1 "); System.exit(0);}
        }    
            
            
         System.out.println("---------------------------------------------------");  
            int  aciertost2=0;
            while(aciertost2==0){
                
              System.out.println("jugador 2");
              System.out.println("---------------------------------------------------");          
            System.out.println("Ingrese la coordenada x del area enemiga");
            int fila = sc.nextInt();
            System.out.println("Ingrese la coordenada  y de la fila enemiga ");
            int columna = sc.nextInt();
            if (matriz1[fila][columna] ==1) {
                matriz11[fila][columna]=1;
                System.out.println("barco enemigo eliminado");
               aciertos2++;}
            if(matriz1[fila][columna]==0) {matriz11[fila][columna] =0; aciertost2=1;
            }
            //imprimimos la matriz
            System.out.println("mapeo de el area del jugador 1");
            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {
                    System.out.print(matriz11[i][j] + " ");}
                System.out.println();
            }System.out.println("---------------------------------------------------");
            if(aciertos2==barcos){System.out.println("felicidades jugador 2 "); System.exit(0);}
        }
        
        }
        


}
    }
