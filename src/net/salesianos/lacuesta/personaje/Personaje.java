package net.salesianos.lacuesta.personaje;

public class Personaje {
    private String nombre;
    private int coordenadaX = 2;
    private int coordenadaY = 2;
    private int velocidad = 1;
    private boolean montaBici;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public boolean enBici() {
        return this.montaBici;
    }

    public void montarBici() {
        this.montaBici = true;
        this.velocidad = 2;
    }

    public void desmontarBici() {
        this.montaBici = false;
        this.velocidad = 1;
    }


}
