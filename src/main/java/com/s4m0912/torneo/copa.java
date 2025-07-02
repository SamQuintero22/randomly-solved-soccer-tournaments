import java.util.LinkedList;
import java.util.Scanner;

public class copa extends competitionAbs implements Competition {

    protected equipo[] grupo;
    LinkedList<equipo[]> faseDeGrupos = new LinkedList<>();


    @Override
    public void startCompetition() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'definirGanador'");
    }

    @Override
    public void mostrarPremio() {
        
        System.out.println("El premio para la copa " + nameCompetition + " es de $" + moneyReward);

    }

    @Override
    public String mostrarNombre() {
        return nameCompetition;
    }

    @Override
    public void cambiarPremio() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Igrese cual es el nuevo premio monetario para la copa " + nameCompetition);

        int nuevo = scanner.nextInt();

        moneyReward = nuevo;

        scanner.close();

        System.out.println("Listo! premio monetario cambiado a " + moneyReward);

    }

    @Override
    public void cambiarNombre() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nuevo nombre de la copa " + nameCompetition);

        String nuevoNombre = scanner.nextLine();
    
        nameCompetition = nuevoNombre;

        scanner.close();

        System.out.println("Listo! nombre de la copa cambiado a " + nameCompetition);
        
    }

    @Override
    public void verTrofeo() {
        System.out.println(trofeoAscci);
    }

    @Override
    public void listarParticipantes() {
        for(int i = 0; i < faseDeGrupos.size();i++){

            System.out.println("Participantes del grupo " + (i+1));
            System.out.println("[-------------------------]");

                for (equipo equipoActual : faseDeGrupos.get(i)) {
                
                System.err.println(equipoActual.nombreEquipo);
                System.out.println(". . . . . . . . . . . . . .");


                }

            System.out.println("[-------------------------]");


        }
    }
    
}
