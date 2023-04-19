package net.salesianos.lacuesta.menu;

import net.salesianos.lacuesta.mapas.Mapa;
import net.salesianos.lacuesta.personaje.Personaje;

public class MenuDeJuego {
    private String[][] mapa;
    private Personaje personaje;

    public MenuDeJuego(int tamanioMapa, String nombre) {
        this.mapa = new Mapa(tamanioMapa).getMapa();
        this.personaje = new Personaje(nombre);
    }

    public void montarBici() {
        if (!personaje.enBici()) {
            personaje.montarBici();
        } else {
            System.out.println("El personaje ya está sobre la bicicleta");
        }
    }

    public void desmontarBici() {
        if (personaje.enBici()) {
            personaje.desmontarBici();
        } else {
            System.out.println("El personaje ya está caminando");
        }
    }

    public void mostrarMenu() {
        for (int i = 0; i < this.mapa.length; i++) {
            for (int j = 0; j < this.mapa.length; j++) {
                System.out.print(this.mapa[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void mostrarMapa() {
        for (int i = 0; i < this.mapa.length; i++) {
            for (int j = 0; j < this.mapa.length; j++) {
                if (i == personaje.getCoordenadaY() && j == personaje.getCoordenadaX()) {
                    if (personaje.enBici()) {
                        mapa[i][j] = "8";
                    } else {
                        mapa[i][j] = "O";
                    }
                }
                System.out.print(this.mapa[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void moverArriba() {
        if (personaje.getCoordenadaY() == 2) {
            System.out.println("No se puede subir más");
            return;
        }
        this.mapa[personaje.getCoordenadaY()][personaje.getCoordenadaX()] = "X";
        if (personaje.enBici())
            if (personaje.getCoordenadaY() == 3)
                personaje.setCoordenadaY(personaje.getCoordenadaY() - 1);
            else
                personaje.setCoordenadaY(personaje.getCoordenadaY() - 2);
        else
            personaje.setCoordenadaY(personaje.getCoordenadaY() - 1);
    }

    public void moverAbajo() {
        if (personaje.getCoordenadaY() == mapa.length - 2) {
            System.out.println("No se puede bajar más");
            return;
        }
        this.mapa[personaje.getCoordenadaY()][personaje.getCoordenadaX()] = "X";
        if (personaje.enBici())
            if (personaje.getCoordenadaY() == mapa.length - 3)
                personaje.setCoordenadaY(personaje.getCoordenadaY() + 1);
            else
                personaje.setCoordenadaY(personaje.getCoordenadaY() + 2);
        else
            personaje.setCoordenadaY(personaje.getCoordenadaY() + 1);
    }

    public void moverDcha() {
        if (personaje.getCoordenadaX() == mapa.length - 2) {
            System.out.println("No se puede ir más a la derecha");
            return;
        }
        this.mapa[personaje.getCoordenadaY()][personaje.getCoordenadaX()] = "X";
        if (personaje.enBici())
            if (personaje.getCoordenadaX() == mapa.length - 3)
                personaje.setCoordenadaX(personaje.getCoordenadaX() + 1);
            else
                personaje.setCoordenadaX(personaje.getCoordenadaX() + 2);

        else
            personaje.setCoordenadaX(personaje.getCoordenadaX() + 1);
    }


    public void moverIzda() {
        if (personaje.getCoordenadaX() == 2) {
            System.out.println("No se puede ir más a la izquierda");
            return;
        }
        this.mapa[personaje.getCoordenadaY()][personaje.getCoordenadaX()] = "X";
        if (personaje.enBici())
            if (personaje.getCoordenadaX() == 3)
                personaje.setCoordenadaX(personaje.getCoordenadaX() - 1);
            else
                personaje.setCoordenadaX(personaje.getCoordenadaX() - 2);
        else
            personaje.setCoordenadaX(personaje.getCoordenadaX() - 1);
    }

    public String mostrarLeyenda() {
        return "\n #->Borde del mapa(no accesible)" +
                "\n X->Suelo del mapa(accesible)" +
                "\n O->Posición del personaje(caminando)" +
                "\n 8->Posición del personaje(en bici)";
    }
}
