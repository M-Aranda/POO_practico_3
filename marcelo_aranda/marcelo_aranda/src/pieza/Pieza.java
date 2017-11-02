package pieza;

import java.util.Scanner;

public class Pieza {

    public Pieza() {
    }

    ;
    
    

    public static int[] tomarMedidas() {
        //el ancho son las filas y el alto las columnas

        int ancho;
        int alto;
        int ancho_para_matriz_enumerada;
        int alto_para_matriz_enumerada;

        while (true) {
            try {
                int maximo = 20;
                Scanner input = new Scanner(System.in);
                System.out.print("Ingrese ancho y alto de la pieza: ");
                String dimension = input.nextLine();

                String[] valores = dimension.split(",");
                String filas = valores[0];
                String columnas = valores[1];

                ancho = Integer.parseInt(filas);
                alto = Integer.parseInt(columnas);

                if (ancho > 0 && alto > 0 && ancho <= maximo && alto <= maximo) {
                    break;
                } else if (ancho < 0 || alto < 0) {
                    System.out.println("Ninguna de las 2 medidas puede ser negativa");
                } else if (ancho > maximo || alto > maximo) {
                    System.out.println("Niguna de las 2 medidas puede ser mayor a 20");
                }

            } catch (Exception e) {
                System.out.println("Eso no es valido.");
            }
        }

// Se podria usar esto pero, me complica para el tema de las validaciones
//        Scanner dis = new Scanner(System.in);
//        dis.useDelimiter("\\,?"); //despues de las barras va el caracter delimitador, y luego hay que poner un?
//        int a, b, c;
//        a = dis.nextInt();
//        b = dis.nextInt();
//        c = dis.nextInt();
//        System.out.println(a + " " + b + " " + c);
//        dis.close(); //aparentemente es necesario cerrar el scanner

        ancho_para_matriz_enumerada = ancho + 1;
        alto_para_matriz_enumerada = alto + 1;
        return new int[]{ancho_para_matriz_enumerada, alto_para_matriz_enumerada};

    }
    


    



    
       
    

}
