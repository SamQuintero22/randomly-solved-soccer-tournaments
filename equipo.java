import java.time.*;
import java.util.LinkedList;

public class equipo {

    protected String nombreEquipo;
    protected String estadio; 
    protected LocalDate fechaFundacion;
    protected LinkedList<persona> plantilla; 

    public equipo(String nombreEquipo, String estadio, LocalDate fechaFundacion){

        this.nombreEquipo = nombreEquipo; 
        this.estadio = estadio;
        this.fechaFundacion = fechaFundacion;
        this.plantilla = new LinkedList<>();

    }

    public void agregarPersona(persona p){

        plantilla.add(p);

    }


    public String getNombreEquipo(){

        return nombreEquipo;

    } 

    public String getEstadio(){

        return estadio;

    } 

    public void mostrarPlantilla(){
        System.out.println("----------------------------------------------");
        System.out.println("Esta es la plantilla de " + nombreEquipo);
         for (persona p : plantilla) {
            System.out.println("-");
            if (p.esDT) {
                System.out.println("DT:");
            }
            System.out.print(p.getNombre() + " || ");
            p.obtenerRol();
            System.out.println(" || "+p.getEdad() + " age");
        
            }
        System.out.println("----------------------------------------------");


    } 
    
      public static void main(String[] args) {
        jugador j1 = new jugador("Lionel Messi", "12345678", 36, "Delantero");
        jugador j2 = new jugador("Emiliano Martínez", "87654321", 32, "Arquero");
        dt dt1 = new dt("Marcelo Gallardo","678954321",40,"Agresivo");
        

        System.out.println("Jugadores en el sistema:");
        System.out.println(j1.getNombre() + " - Edad: " + j1.getEdad());
        j1.obtenerRol();

        System.out.println(j2.getNombre() + " - Edad: " + j2.getEdad());
        j2.obtenerRol();

        equipo equipo1 = new equipo("paris", "estadio grande", LocalDate.of(2004, 5, 16));

        equipo1.agregarPersona(j1);
        equipo1.agregarPersona(j2);
        equipo1.agregarPersona(dt1);

        equipo1.mostrarPlantilla();

    }

    

}
