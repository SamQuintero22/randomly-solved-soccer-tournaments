import java.time.*;
import java.util.LinkedList;

public class equipo {

    protected String nombreEquipo;
    protected String estadio; 
    protected LocalDate fechaFundacion;
    protected dt directorTecnico;
    protected LinkedList<jugador> plantilla; 
    
    public equipo(String nombreEquipo, String estadio, LocalDate fechaFundacion){

        this.nombreEquipo = nombreEquipo; 
        this.estadio = estadio;
        this.fechaFundacion = fechaFundacion;
        this.plantilla = new LinkedList<>();
        this.directorTecnico = null;

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
    
      public static void main(String[] args) {
        jugador j1 = new jugador("Lionel Messi", "12345678", 36, "Delantero",10);
        jugador j2 = new jugador("Emiliano Martínez", "87654321", 32, "Arquero",1);

        equipo equipo1 = new equipo("paris", "estadio grande", LocalDate.of(2004, 5, 16));

        equipo1.agregarJugador(j1);
        equipo1.agregarJugador(j2);
        equipo1.contratarDT("Marcelo Gallardo", "9876543", 40, "Agresivo");
        equipo1.mostrarPlantilla();

    }

    

}
