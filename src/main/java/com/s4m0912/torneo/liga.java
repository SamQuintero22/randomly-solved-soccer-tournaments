import java.util.*;
import java.time.*;
public class liga extends competitionAbs implements Competition{

    protected int cantidadParticipantes; 
    protected equipo[] posiciones;
    protected int puestosLibertadores = -1;
    protected int puestosSudamericana = -1;
    protected int puestosDescensos = -1;

    public liga(){

        super();

        Scanner scanner = new Scanner(System.in);

        System.out.println("indique cuantos participantes va a tener la nueva liga");
        int numero = scanner.nextInt();
        cantidadParticipantes = numero;

        posiciones = new equipo[numero]; //creo la tabla de posiciones 
                                        //segun cuantos equipos van a participar
        
        System.out.println("indique cuantos puestos tendra la nueva liga segun correspoda:");


        while ((puestosLibertadores < 0 || puestosLibertadores>cantidadParticipantes) 
        || (puestosSudamericana < 0 || puestosSudamericana>cantidadParticipantes - puestosLibertadores) 
        || (puestosDescensos < 0 || puestosDescensos > ((cantidadParticipantes - puestosLibertadores) - puestosSudamericana))){


            System.out.println("las cantidades deben ser consecuentes con la cantidad de participantes elegida:\n");


            System.out.println("puestos de libertadores:");
            numero = scanner.nextInt();
            puestosLibertadores = numero;
            
            System.out.println("------------------------------------------");
            System.out.println("puestos de sudamericana:");
            numero = scanner.nextInt();
            puestosSudamericana = numero;

            System.out.println("------------------------------------------");
            System.out.println("puestos de descenso:");
            numero = scanner.nextInt();
            puestosDescensos = numero;
            System.out.println("------------------------------------------");


        }

        if(puestosDescensos >= 0){System.out.println("tabla creada");}

        System.out.println("Ahora vamos a llenar la tabla con equipos en principio tendran 0 puntos");
        System.out.println("y estaran ordenados por orden alfabetico");
        System.out.println("Vamos a agregar " + cantidadParticipantes + " a continuacion: ");

        for(int i = 0; i<=cantidadParticipantes - 1; i++){

            System.out.println("ingrese el nombre del equipo " + i);

            String nombreEquipoAux = scanner.nextLine();

            System.out.println("ingrese el nombre del estadio del equipo " + i);

            String nombreEstadioAux = scanner.nextLine();

            System.out.println("ingrese la fecha de fundacion del equipo " + i + " formato yyyy-mm-dd");

            String fechaFundacionAux = scanner.nextLine();

            LocalDate fecha = LocalDate.parse(fechaFundacionAux);


            equipo nuevo = new equipo(nombreEquipoAux, nombreEstadioAux, fecha);

            posiciones[i] = nuevo;

            System.out.println("Equipo " + nombreEquipoAux +" agregado con exito");

        }


        scanner.close();

        Arrays.sort(posiciones, Comparator.comparing(equipo::getNombreEquipo)); //esto ordena alfabeticamente

    }
    
    @Override
    public void definirGanador() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'definirGanador'");
    }

    @Override
    public void mostrarPremio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarPremio'");
    }

    @Override
    public void mostrarNombre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarNombre'");
    }

    @Override
    public void cambiarPremio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cambiarPremio'");
    }

    @Override
    public void cambiarNombre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cambiarNombre'");
    }

    @Override
    public void verTrofeo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verTrofeo'");
    }

    @Override
    public void listarParticipantes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarParticipantes'");
    }
    
}
