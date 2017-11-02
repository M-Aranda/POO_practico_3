package marcelo_aranda;
//version orientada a objetos

import mensaje_de_inicio.Mensaje;
import pieza.Pieza;
import matriz.Matriz;

public class Marcelo_aranda {

    public static void main(String[] args) {

        Mensaje m = new Mensaje();
        m.mostrarMSG();

        Pieza p = new Pieza();

        int medidas[] = Pieza.tomarMedidas();
        int anMatriz = medidas[0];
        int alMatriz = medidas[1];

        Matriz mat = new Matriz(anMatriz, alMatriz);
        String matriz[][] = mat.crearMatriz();

        for (int i = 0; i < mat.getAlto_de_la_matriz(); i++) {
            System.out.printf("---");

        }
        System.out.println("");
        for (int j = 0; j < mat.getAncho_de_la_matriz(); j++) {
            for (int k = 0; k < mat.getAlto_de_la_matriz(); k++) {
                System.out.print(matriz[j][k]);
            }
            System.out.println();

        }
        for (int i = 0; i < mat.getAncho_de_la_matriz(); i++) {
            System.out.printf("---");

        }

        System.out.println();

        
        System.out.println("Solo puede ingresar un maximo de "+mat.obtenerLimiteDeGatos()+" gatos");
        
    }

}
