import java.util.*;
public class liga extends competitionAbs implements Competition{

    protected equipo[] posiciones;
    protected int puestosLibertadores = -1;
    protected int puestosSudamericana = -1;
    protected int puestosDescensos = -1;
    protected int cantidadFechas;
    protected LinkedList<String> encuentrosFinalizados = new LinkedList<>();

    public static final Scanner scanner = new Scanner(System.in); // único scanner compartido
    
    public liga(){
        
        super(); //usa el metodo establecido para construir una competition 

        System.out.println("indique cuantos participantes va a tener la nueva liga, debe ser un numero par: ");

        int numero;

        while (cantidadParticipantes <= 0 || cantidadParticipantes % 2 != 0) {

        numero = scanner.nextInt();
        scanner.nextLine(); // LIMPIA el \n pendiente
        cantidadParticipantes = numero;
            
        }

        posiciones = new equipo[cantidadParticipantes]; //creo la tabla de posiciones 
                                        //segun cuantos equipos van a participar
        
        cantidadFechas = cantidadParticipantes - 1; //ver tambien caso de liga ida y vuelta

        System.out.println("indique cuantos puestos tendra la nueva liga segun correspoda:");


        while ((puestosLibertadores < 0 || puestosLibertadores>cantidadParticipantes) 
        || (puestosSudamericana < 0 || puestosSudamericana>cantidadParticipantes - puestosLibertadores) 
        || (puestosDescensos < 0 || puestosDescensos > ((cantidadParticipantes - puestosLibertadores) - puestosSudamericana))){


            System.out.println("las cantidades deben ser consecuentes con la cantidad de participantes elegida:\n");


            System.out.println("puestos de libertadores:");
            numero = scanner.nextInt();
            scanner.nextLine();
            puestosLibertadores = numero;
            
            System.out.println("------------------------------------------");
            System.out.println("puestos de sudamericana:");
            numero = scanner.nextInt();
            scanner.nextLine();
            puestosSudamericana = numero;

            System.out.println("------------------------------------------");
            System.out.println("puestos de descenso:");
            numero = scanner.nextInt();
            scanner.nextLine();
            puestosDescensos = numero;
            System.out.println("------------------------------------------");


        }

        if(puestosDescensos >= 0){System.out.println("tabla creada");}

        definirParticipantes();

        mostrarPremio();

        if (!trofeoAscci.isEmpty()) {
            verTrofeo();
        }

    }

    
    @Override
    public void startCompetition(){

        System.out.println("========================================");
        System.out.println("COMIENZA LA LIGA " + nameCompetition);
        System.out.println("========================================");


    }

    @Override
    public void mostrarPremio() {
        
        System.out.println("El premio para la liga " + nameCompetition + " es de $" + moneyReward);

    }

    @Override
    public String mostrarNombre() {
        return nameCompetition;
    }

    @Override
    public void cambiarPremio() {

        System.out.println("Establezca el nuevo premio monetario: ");

        int nuevoPremio = 0; 
        
        while (nuevoPremio <= 0) {
            
        nuevoPremio = scanner.nextInt();
        moneyReward = nuevoPremio;

        }

        if (moneyReward == nuevoPremio) {

            System.out.println("Premio cambiado exitosamente a " + moneyReward);;
            
        }

        
    }

    @Override
    public void cambiarNombre() {
        System.out.println("Establezca el nuevo nombre: ");
        
        String nuevo = "";

        while (nuevo.isEmpty()) {
            
        nuevo = scanner.nextLine();
        nameCompetition = nuevo;

        }

            if (nameCompetition.equals(nuevo)) {

                System.out.println("nombre cambiado exitosamente a " + nameCompetition);

            }else{
                
                System.out.println("error al cambiar el nombre");
        }

    }

    @Override
    public void verTrofeo() {
        
        System.out.println(trofeoAscci);

    }

    @Override
    public void listarParticipantes() {
        System.out.println("=-=-=-=-=-=-=-==-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        for(int i = 0; i<=cantidadParticipantes - 1; i++){
            System.out.println("...............................................................................................................");
            System.out.println("pos: " + (i + 1)  + " || " + posiciones[i].nombreEquipo + " || puntos: " + posiciones[i].cantidadPuntos);
            System.out.println("...............................................................................................................");
        }
        System.out.println("=-=-=-=-=-=-=-==-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    @Override
    protected void definirParticipantes() {
        
        System.out.println("Ahora vamos a llenar la tabla con equipos en principio tendran 0 puntos");
        System.out.println("y estaran ordenados por orden alfabetico");
        System.out.println("Vamos a agregar " + cantidadParticipantes + " a continuacion: ");

        for(int i = 0; i<=cantidadParticipantes - 1; i++){

            System.out.println("ingrese el nombre del equipo " + i);

            String nombreEquipoAux = scanner.nextLine();

            System.out.println("ingrese el nombre del estadio del equipo " + i);

            String nombreEstadioAux = scanner.nextLine();

            equipo nuevo = new equipo(nombreEquipoAux, nombreEstadioAux);

            posiciones[i] = nuevo;

            System.out.println("Equipo " + nombreEquipoAux +" agregado con exito");

        }


        Arrays.sort(posiciones, Comparator.comparing(equipo::getNombreEquipo)); //esto ordena alfabeticamente


    }
    

}