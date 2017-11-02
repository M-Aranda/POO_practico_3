package matriz;

public class Matriz {

    public int ancho_de_la_matriz;
    public int alto_de_la_matriz;

    public Matriz() {
    }

    ;

    public Matriz(int ancho_de_la_matriz, int alto_de_la_matriz) {
        this.ancho_de_la_matriz = ancho_de_la_matriz;
        this.alto_de_la_matriz = alto_de_la_matriz;
    }

    public int getAncho_de_la_matriz() {
        return ancho_de_la_matriz;
    }

    public void setAncho_de_la_matriz(int ancho_de_la_matriz) {
        this.ancho_de_la_matriz = ancho_de_la_matriz;
    }

    public int getAlto_de_la_matriz() {
        return alto_de_la_matriz;
    }

    public void setAlto_de_la_matriz(int alto_de_la_matriz) {
        this.alto_de_la_matriz = alto_de_la_matriz;
    }

    public String[][] crearMatriz() {
        String matriz[][] = new String[getAncho_de_la_matriz()][getAlto_de_la_matriz()];
        for (int i = 0; i < +getAncho_de_la_matriz(); i++) {
            for (int j = 0; j < getAlto_de_la_matriz(); j++) {
                matriz[i][j] = " - ";

            }

        }

        //lineas 52 a 70 son para poner los numeros al lado
        for (int i = 0; i < getAlto_de_la_matriz(); i++) {
            if (i <= 10) {
                matriz[0][i] = " 0" + (i - 1);
            } else if (i >= 11) {
                matriz[0][i] = " " + (i - 1);
            }
        }

        for (int i = 0; i < getAncho_de_la_matriz(); i++) {
            if (i <= 10) {
                matriz[i][0] = " 0" + (i - 1);

            } else if (i >= 11) {
                matriz[i][0] = " " + (i - 1);
            }
        }

        matriz[0][0] = " fc";
        
        return matriz;
    }
    
    public int obtenerLimiteDeGatos(){
        int area=(getAlto_de_la_matriz())*(getAncho_de_la_matriz());
        int PORCENTAJE_GATOS = 10;//
        int maximo_de_gatos = (area * PORCENTAJE_GATOS) / 100;
        
        return maximo_de_gatos;
    
    
    }
    
        public int obtenerLimiteDeRatones(){
        int area=(getAlto_de_la_matriz())*(getAncho_de_la_matriz());
        int PORCENTAJE_RATONES = 25;//
        int maximo_de_ratones = (area * PORCENTAJE_RATONES) / 100;
        
        return maximo_de_ratones;
    
    
    }

}
