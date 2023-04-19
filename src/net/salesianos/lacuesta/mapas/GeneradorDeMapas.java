package net.salesianos.lacuesta.mapas;

public class GeneradorDeMapas {

    public static String[][] generaMapas(int n) {
        String[][] mapa = new String[n + 1][n + 1];
        String casilla;

        for (int i = 0; i < (mapa.length); i++) {
            for (int j = 0; j < (mapa.length); j++) {
                if ((i == 1 && j > 0) || (i == mapa.length - 1 && j > 0) || (j == 1 && i > 0) || (j == mapa.length - 1 && i > 0)) {
                    mapa[i][j] = "#";
                } else {
                    if (i == 0 && j > 0) {
                        casilla = String.valueOf(j - 1);
                        mapa[i][j] = casilla;
                    } else {
                        if (j == 0 && i > 0) {
                            casilla = String.valueOf(i - 1);
                            mapa[i][j] = casilla;
                        } else {
                            if (i == 0 && i == 0) {
                                mapa[i][j] = " ";

                            } else {
                                mapa[i][j] = "X";
                            }

                        }
                    }

                }
            }

        }

        return mapa;
    }


    public static String muestraLeyenda() {
        return "# -> Borde del mapa(no accesible)\nX -> Suelo del mapa\nNúmeros -> Casillas del mapa";
    }
}



