import java.time.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class equipo {

    protected String nombreEquipo;
    protected String estadio; 
    protected LocalDate fechaFundacion;
    protected dt directorTecnico;
    protected LinkedList<jugador> plantilla;
    protected int cantidadPuntos; 
    
    public equipo(String nombreEquipo, String estadio){

        this.nombreEquipo = nombreEquipo; 
        this.estadio = estadio;
        this.plantilla = new LinkedList<>();
        this.directorTecnico = null;
        cantidadPuntos = 0;

    }

    public void agregarJugador(jugador p){

        plantilla.add(p);

    }

    public void contratarDT(String nombre, String dni, int edad, String estilo){

        dt nuevo = new dt(nombre, dni, edad, estilo);

        this.directorTecnico = nuevo;

    }

    public void echarDT(){

        this.directorTecnico = null;

    }

    public String getNombreEquipo(){

        return nombreEquipo;

    } 

    public String getEstadio(){

        return estadio;

    }
    

    public void mostrarPlantilla(){
        System.out.println("=============================================");
        System.out.println("Esta es la plantilla de " + nombreEquipo);
        System.out.println("=============================================");

         for (jugador p : plantilla) {
            System.out.println("-");
            System.out.print("#" + p.getDorsal() + " || ");
            System.out.print(p.getNombre() + " || ");
            p.obtenerRol();
            System.out.println(" || "+ p.getEdad() + " age");
        
            }
            
        System.out.println("===================================================");
        System.out.println("Dirige tecnicamente: " + directorTecnico.nombreYApe + "|| " + directorTecnico.getEdad() + " age"); 
        System.out.println("===================================================");
   
        System.out.println("----------------------------------------------");


    } 
    
private String definirPosGoleador(){

        
        Random random = new Random();
        int numeroRandom;
        String posicionGol;

        numeroRandom = random.nextInt(100);

        if(numeroRandom >= 50){

            posicionGol = "Delantero";

        }else if (numeroRandom >= 25){

            posicionGol = "Mediocampista";

        }else if (numeroRandom >= 2){


            posicionGol = "Defensor";

        }else{ 

            posicionGol = "Arquero";


        }

        return posicionGol;

    }
    
    private jugador[] listarPosicion(String posicionListar){

        jugador[] lista = new jugador[plantilla.size()];
        int j = 0;

        for (int i = 0; i<plantilla.size(); i++) {
            
            if (plantilla.get(i).posicion.equals(posicionListar)){

                lista[j] = plantilla.get(i);
                j++;
            }


        }

        if(j==0){ //si ningun jugador fue agregado a la lista 
            System.out.println("===========================");
            System.out.println("No existen jugadores en la posicion pedida, devolviendo lista vacia");
            System.out.println("===========================");

        }

        return Arrays.copyOf(lista, j); //devuelve la lista del tamanio de j 
    }

    public jugador definirGoleador(){

        String posGoleador = definirPosGoleador();

        jugador[] listaDeLaPosicion = listarPosicion(posGoleador);

        if (listaDeLaPosicion.length == 0) {
            
            System.out.println("No hay jugadores disponibles en la posición seleccionada para anotar el gol.");
            
            return null;
        }

        Random random = new Random();

        int numeroRandom; 

        numeroRandom = random.nextInt(listaDeLaPosicion.length);

        System.out.println("El GOL FUE DE " + listaDeLaPosicion[numeroRandom]);

        return listaDeLaPosicion[numeroRandom];

    }


      public static void main(String[] args) {
        jugador j1 = new jugador("Lionel Messi", "12345678", 36, "Delantero",10);
        jugador j2 = new jugador("Emiliano Martínez", "87654321", 32, "Arquero",1);

        equipo equipo1 = new equipo("paris", "estadio grande");

        equipo1.agregarJugador(j1);
        equipo1.agregarJugador(j2);
        equipo1.contratarDT("Marcelo Gallardo", "9876543", 40, "Agresivo");
        equipo1.mostrarPlantilla();

    }

    
}
