
package spinasantiago.practica3;
import java.util.Scanner;

public class SpinaSantiagoPractica3 {

    
    public static void main(String[] args) {
        
        //Scanner
        Scanner sc = new Scanner(System.in);
        
        // Creacion de los 22 jugadores
        Jugador j1 = new Jugador("Lionel Andres Messi Cuccitini", "Delantero", 6000000);
        Jugador j2 = new Jugador("Julian Alvarez", "Delantero", 9000000);
        Jugador j3 = new Jugador("Lautaro Martinez", "Delantero", 8500000);
        Jugador j4 = new Jugador("Angel Di Maria", "Delantero", 1000000);
        Jugador j5 = new Jugador("Alexis Macallister", "Centrocampista", 9000000);
        Jugador j6 = new Jugador("Enzo Fernandez", "Centrocampista", 1200000);
        Jugador j7 = new Jugador("Rodrigo De Paul", "Centrocampista", 4000000);
        Jugador j8 = new Jugador("Leandro Paredes", "Centrocampista", 3000000);
        Jugador j9 = new Jugador("Guido Rodriguez", "Centrocampista", 4000000);
        Jugador j10 = new Jugador("Lisandro Martinez", "Defensor", 5500000);
        Jugador j11 = new Jugador("Cuti Romero", "Defensor", 8500000);
        Jugador j12 = new Jugador("Nicolas Otamendi", "Defensor", 1500000);
        Jugador j13 = new Jugador("Nahuel Molina", "Defensor", 6500000);
        Jugador j14 = new Jugador("Huevo Acuña", "Defensor", 2500000);
        Jugador j15 = new Jugador("Nicolas Tagliafico", "Defensor", 3500000);
        Jugador j16 = new Jugador("Pepe Sand", "Delantero", 90000);
        Jugador j17 = new Jugador("Alejandro Garnacho", "Delantero", 3500000);
        Jugador j18 = new Jugador("Pedro De La Vega", "Delantero", 1500000);
        Jugador j19 = new Jugador("Giovanni Lo Celso", "Centrocampista", 3000000);
        Jugador j20 = new Jugador("Dibu Martinez", "Portero", 6000000);
        Jugador j21 = new Jugador("Geronimo Rulli", "Portero", 2500000);
        Jugador j22 = new Jugador("Franco Armani", "Portero", 100000);
        
        // Lista jugadores
        Jugador [] jugadores = {j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11,j12,j13,j14,j15,j16,j17,j18,j19,j20,j21,j22};
        
        boolean jugar = true;
        
        
        System.out.println("Bienvenido a Argentina Fantasy!");
        Jugador [] plantilla = new Jugador [11];
            
        //Rellenamos la plantilla con jugadores
        rellenarPlantilla(plantilla, jugadores);
        
        // Empieza el programa
        do {
            
            //Menu
            System.out.println("Elige que queres hacer: 1. Mostrar plantilla, 2. Cambiar jugador, 3. Valor del equipo, 4.Salir");
            
            int opcion = sc.nextInt();
            
            switch (opcion) {
                case 1: // Mostramos la plantilla
                    System.out.println("--------------------Plantilla--------------------");
                    mostrarJugadores(plantilla);
                    break;
                    
                case 2: // Cambiar jugador
                    
                    System.out.println("--------------------Jugadores disponibles--------------------");
                    mostrarJugadores(jugadores);
                    
                    System.out.println("");
                    
                    System.out.println("--------------------Plantilla--------------------");
                    mostrarJugadores(plantilla);
                    System.out.println("");
                    System.out.println("Que jugador queres fichar? (numero)");
                    int numFichar = sc.nextInt();
                    System.out.println("Por cual jugador lo queres intercambiar? (numero)");
                    int numCambiar = sc.nextInt();
                    
                    System.out.println(plantilla[numCambiar].getNombre() + " cambiado por " + jugadores[numFichar].getNombre());
                    Jugador jAux = plantilla[numCambiar];
                    plantilla[numCambiar] = jugadores[numFichar];
                    jugadores[numFichar] = jAux;
                    
                    break;
                case 3: // Suma total de todos los jugadores de la plantilla
                    
                    System.out.println("Valor total de la plantilla: " + calcularValorTotal(plantilla));
                    
                    
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    jugar = false;
                    break;
                default:
                    System.out.println("El numero introducido no esta entre el 1 y el 4, saliendo...");
                    jugar = false;
            }
            
            
        } while (jugar);   
    }
    
    
    
    public static void rellenarPlantilla(Jugador [] plantilla, Jugador [] jugadores){
        
        //Posicion random
        int posRandom = (int) (Math.random() * 22) ;
        
        
        //Contador por posicion para verificar que no sobrepase el limite que puede tener la plantilla
        int contadorPorteros = 0, contadorDefensores = 0, contadorCentrocampistas = 0, contadorDelanteros = 0;
        
        
        for (int i = 0; i < plantilla.length; i++) {
            
            // Verificamos que no sea null
            if(jugadores[posRandom] != null){
                
                // Dependiendo de la posicion del jugador, verificamos que no se pase del limite de esta misma 
                if(jugadores[posRandom].getPosicion().equalsIgnoreCase("Portero")){
                    contadorPorteros++;
                    if(contadorPorteros < 2){
                        // Insertar jugador en la plantilla
                        plantilla[i] = jugadores[posRandom];

                        // Borrar jugador de la lista de jugadores
                        jugadores[posRandom] = null;
                    }
                    else{
                        i--;
                    }
                    
                }
                else if(jugadores[posRandom].getPosicion().equalsIgnoreCase("Defensor")){
                    contadorDefensores++;
                    if(contadorDefensores < 6){
                        // Insertar jugador en la plantilla
                       plantilla[i] = jugadores[posRandom];

                       // Borrar jugador de la lista de jugadores
                       jugadores[posRandom] = null;
                    }
                    else{
                        i--;
                    }
                }
                else if(jugadores[posRandom].getPosicion().equalsIgnoreCase("Centrocampista")){
                    contadorCentrocampistas++;
                    if(contadorCentrocampistas < 6){
                        // Insertar jugador en la plantilla
                       plantilla[i] = jugadores[posRandom];

                       // Borrar jugador de la lista de jugadores
                       jugadores[posRandom] = null;
                    }
                    else{
                        i--;
                    }
                }
                else if(jugadores[posRandom].getPosicion().equalsIgnoreCase("Delantero")){
                    contadorDelanteros++;
                    if(contadorDelanteros < 5){
                        // Insertar jugador en la plantilla
                       plantilla[i] = jugadores[posRandom];

                       // Borrar jugador de la lista de jugadores
                       jugadores[posRandom] = null;
                    }
                    else{
                        i--;
                    }
                }
            }
            else{
                i--;
            }
            posRandom = (int) (Math.random() * 22);

        }
        
    }
    
    public static void mostrarJugadores(Jugador [] jugadores){
        
        // Verificamos que si es null, no lo muestre (para la lista de jugadores)
        
        for (int i = 0; i < jugadores.length; i++) {
            if(jugadores[i] != null){
                System.out.println( "pos = "+ i + " " + jugadores[i]);
            }
        }
        
    }
    
    public static double calcularValorTotal(Jugador [] plantilla){
        int suma = 0;
        for (int i = 0; i < plantilla.length; i++) {
            suma += plantilla[i].getPrecioFichaje();
        }
        return suma;
    }
        
}
