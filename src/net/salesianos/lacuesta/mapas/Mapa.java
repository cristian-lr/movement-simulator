package net.salesianos.lacuesta.mapas;

public class Mapa {
    private int tamanioMapa;
    private String[][] mapaGenerado;

    public Mapa(int tamanioMapa) {
        this.tamanioMapa = tamanioMapa;
        this.mapaGenerado = GeneradorDeMapas.generaMapas(tamanioMapa);
    }

    public String[][] getMapa() {
        return mapaGenerado;
    }

}
