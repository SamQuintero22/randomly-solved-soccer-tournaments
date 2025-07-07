import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Grupo{
    
    protected String nombreGrupo;
    protected Equipo[] equipos = new Equipo[4]; 

    public Grupo(String nombreGrupo){

        this.nombreGrupo = nombreGrupo;

        Scanner scanner = Copa.scanner;

        for(int i = 0; i<4; i++){

            System.out.println("\n[ creando el equipo " + (i+1) + " del grupo " + nombreGrupo + " ]\n");

            System.out.println("Indique nombre del equipo: ");
            String nombreEquipo = scanner.nextLine();            


            System.out.println("Indique nombre del estadio: ");
            String nombreEstadio = scanner.nextLine();
            

            Equipo nuevo = new Equipo(nombreEquipo, nombreEstadio);

            equipos[i] = nuevo;

        }
        Arrays.sort(equipos, Comparator.comparing(Equipo::getNombreEquipo)); //esto ordena alfabeticamente

        System.out.println("Grupo " + nombreGrupo + " creado con exito \n");

    }

    
}
