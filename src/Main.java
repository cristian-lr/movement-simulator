import net.salesianos.lacuesta.menu.MenuDeJuego;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        String direccion;
        String montar;
        System.out.print("Escribe el tamaño del mapa: ");
        int tamanioMapa = scanner.nextInt();
        scanner.nextLine();
        MenuDeJuego menuDeJuego = new MenuDeJuego(tamanioMapa, "usuario");

        do {
            System.out.println(
                    "\nMenú:" +
                            "\n0-Salir del juego\n" +
                            "1-Desplazar al jugador en las cuatro direcciones\n" +
                            "2-Montar o desmontar al jugador de la bicicleta" +
                            "\n3-Mostrar el mapa incluyendo al jugador\n" +
                            "4-Mostrar la leyenda del mapa de juego"
            );
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {

                case 0:
                    System.out.println("Fin del juego...");
                    salir = true;
                    break;

                case 1:
                    menuDeJuego.mostrarMapa();
                    System.out.println("Desplazar al jugador en 4 direcciones:" +
                            "\nw:arriba" +
                            "\nd:derecha" +
                            "\na:izquierda" +
                            "\ns:abajo");
                    direccion = scanner.nextLine().toLowerCase();

                    switch (direccion) {
                        case "w":
                            menuDeJuego.moverArriba();
                            break;
                        case "a":
                            menuDeJuego.moverIzda();
                            break;
                        case "d":
                            menuDeJuego.moverDcha();
                            break;
                        case "s":
                            menuDeJuego.moverAbajo();
                            break;
                    }
                    menuDeJuego.mostrarMapa();
                    break;

                case 2:
                    System.out.println("Pon \"montar\" si quieres montar o \"desmontar\" si quieres desmontar la bicicleta");
                    montar = scanner.nextLine();
                    if (montar.equalsIgnoreCase("montar")) {
                        menuDeJuego.montarBici();
                        menuDeJuego.mostrarMapa();
                    } else if (montar.equalsIgnoreCase("desmontar")) {
                        menuDeJuego.desmontarBici();
                        menuDeJuego.mostrarMapa();
                    } else {
                        System.out.println("Comando incorrecto");
                    }

                    break;
                case 3:
                    menuDeJuego.mostrarMapa();
                    break;
                case 4:
                    System.out.println(menuDeJuego.mostrarLeyenda());
                    break;
                default:
                    System.out.println("Número de opción incorrecto");
            }
        } while (salir == false);
    }
}
