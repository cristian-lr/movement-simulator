import net.salesianos.lacuesta.menu.MenuDeJuego;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        System.out.print("Escribe el tamaño del mapa: ");
        int tamanioMapa = scanner.nextInt();
        scanner.nextLine();
        MenuDeJuego menuDeJuego = new MenuDeJuego(tamanioMapa, "usuario");

    }
}
