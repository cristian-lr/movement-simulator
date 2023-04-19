"# movement-simulator" 
Clase GeneradorDeMapas: se implementa en el método estático generamapas con un parametro de tamaño del mapa y
genera un mapa de ese tamaño mediante un array bidimensional.Se implementa otro método muestraleyenda 
que muestra la leyenda del mapa.

Clase Mapa: se crea un constructor que inicializa el atributo tamaño de mapa y mapa, este último a partir del
del método estático generamapas de la clase GeneradorDeMapas.

Clase personaje:Se añaden los getter y setter y funcionalidades de montar y desmontar en bici, se inicializa
la coordenada X e Y en 2,2 para que se sitúe el jugador en el inicio del mapa al empezar

Clase MenuDeJuego:Se implementan los métodos necesarios para interactuar con el usuario.

Main: Se implementa un menú para jugar y utilizar las diferentes funcionalidades de MenuDeJuego


