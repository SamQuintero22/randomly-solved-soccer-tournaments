import java.util.LinkedList;
import java.util.Scanner;

public abstract class competitionAbs {

    protected String nameCompetition;
    protected String trofeoAscci;
    protected int moneyReward;
    protected String qualificationAchievement;
    protected int cantidadParticipantes = -1; 


    protected LinkedList<equipo> historialCampeones;

    public competitionAbs(){

        Scanner scanner = liga.scanner;
        System.out.println("Ingrese el nombre de la competicion:");
        String palabra = scanner.nextLine(); 
        nameCompetition = palabra;

        System.out.println("Ingrese el ascci del trofeo si lo tuviese:");
        System.out.println("(Cuando termine deje la linea vacia)");

        String construyendoAscci = "";

        while (true) {

        String linea = scanner.nextLine(); 
        if (linea.isEmpty()) {

            break; //se acabo el ascci;
            
        }
        
        construyendoAscci = construyendoAscci + linea + "\n";
            
        }

        trofeoAscci = construyendoAscci;

        System.out.println("En el caso de que ganar la competicion habilite a jugar otra indique cuales");
        System.out.println("con un enter de por medio:");
        System.out.println("(Cuando termine deje la linea vacia)");
        String construyendoArchi = "";

        while (true) {

        String linea = scanner.nextLine(); 
        if (linea.isEmpty()) {

            break; //se acabo el ascci;
            
        }

        construyendoArchi = construyendoArchi + linea + "\n";

    }

        qualificationAchievement = construyendoArchi;


        System.out.println("Ingrese el premio monetario de la competicion:");
        int numero = scanner.nextInt();
        moneyReward = numero;


        historialCampeones = new LinkedList<>();
    }
    
    public void verTrofeo() {
        System.out.println("Este es el trofeo de la competicion: ");
        System.out.println(trofeoAscci);
        System.out.println("Quien no se moriria por semejante belleza?");

    }

    protected abstract void definirParticipantes();

    public void listarCampeones(){

        if (!historialCampeones.isEmpty()){
            
            System.out.println("Listando todo los campeones de la competencia" + nameCompetition);

            for (equipo equipoActual : historialCampeones){
                System.out.println(equipoActual.nombreEquipo);
            }

        }else{

            System.out.println("La competicion " + nameCompetition + " aun no ah sido ganada por ningun equipo... ");;
            System.out.println("QUIEN SERA EL PRIMERO?");
        }

    }

}
