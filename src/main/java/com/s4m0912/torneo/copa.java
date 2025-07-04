import java.util.LinkedList;
import java.util.Scanner;

public class copa extends competitionAbs implements Competition {

    int cantidadGrupos;
    LinkedList<grupo> faseDeGrupos = new LinkedList<>();
        public static final Scanner scanner = new Scanner(System.in); // único scanner compartido

    public copa(){

        super();

        definirParticipantes();

        System.out.println("COPA " + mostrarNombre() + "CREADA");

        mostrarPremio();

        if(!trofeoAscci.isEmpty()){

            verTrofeo();

        }
    }

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
        System.out.println("Este es el trofeo de la competicion: ");
        System.out.println(trofeoAscci);
        System.out.println("Quien no se moriria por semejante belleza?");

    }

    @Override
    public void listarParticipantes() {
        for(int i = 0; i < faseDeGrupos.size();i++){

            char letraGrupo = (char) ('A' + i);

            System.out.println("Participantes del grupo " + letraGrupo);

            System.out.println("[-------------------------]");

                for (equipo equipoActual : faseDeGrupos.get(i).equipos) {
                
                System.err.println(equipoActual.nombreEquipo);
                System.out.println(". . . . . . . . . . . . . .");


                }

            System.out.println("[-------------------------]");


        }
    }

    @Override
    protected void definirParticipantes(){ //sera usado en el constructor de copa 

        System.out.println("Por favor indique una cantidad de participantes igual a 8, 16 o 32");
        Scanner scanner = new Scanner(System.in);
        int cantidad = scanner.nextInt();

        while (cantidad != 8 && cantidad != 16 && cantidad != 32) {

            System.out.println("Por favor indique una cantidad de participantes igual a 8, 16 o 32");
            cantidad = scanner.nextInt();
            scanner.nextLine();


        }

        cantidadParticipantes = cantidad;

        cantidadGrupos = cantidadParticipantes / 4;

        System.out.println("Vamos a cargar los " + cantidadParticipantes +
         " competidores de " + nameCompetition + " por grupos");

         for(int i = 0; i < cantidadGrupos; i++){

            char letraGrupo = (char) ('A' + i);

            System.out.println("Equipos del grupo " + letraGrupo);

            grupo nuevo = new grupo( "Grupo " + letraGrupo);

            faseDeGrupos.add(nuevo);

            System.out.println(nuevo.nombreGrupo + " Agregado correctamente");
         }
        
         scanner.close();
    }


    public static void main(String[] args) {
        copa copa = new copa();
        copa.listarParticipantes();
    }
    
}
