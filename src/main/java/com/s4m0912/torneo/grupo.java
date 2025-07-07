import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class grupo{
    
    protected String nombreGrupo;
    protected equipo[] equipos = new equipo[4]; 

    public grupo(String nombreGrupo){

        this.nombreGrupo = nombreGrupo;

        Scanner scanner = copa.scanner;

        for(int i = 0; i<4; i++){

            System.out.println("\n[ creando el equipo " + (i+1) + " del grupo " + nombreGrupo + " ]\n");

            System.out.println("Indique nombre del equipo: ");
            String nombreEquipo = scanner.nextLine();            


            System.out.println("Indique nombre del estadio: ");
            String nombreEstadio = scanner.nextLine();
            

            equipo nuevo = new equipo(nombreEquipo, nombreEstadio);

            equipos[i] = nuevo;

        }
        Arrays.sort(equipos, Comparator.comparing(equipo::getNombreEquipo)); //esto ordena alfabeticamente

        System.out.println("Grupo " + nombreGrupo + " creado con exito \n");

    }

    
}
