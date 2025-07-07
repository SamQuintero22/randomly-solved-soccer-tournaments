import java.util.Random;
import java.util.LinkedList;

public class LlaveCopa{

    protected String nombreLlave; 
    
    protected Equipo equipo1;
    protected Equipo equipo2;
    protected Equipo ganadorLlave; 
    protected LinkedList <Jugador> listaGoles;

    public LlaveCopa(Equipo equipoLocal, Equipo equipoVisitante){

        equipo1 = equipoLocal; 
        equipo2 = equipoVisitante;

        nombreLlave = equipo1.getNombreEquipo() + " vs " + equipo2.getNombreEquipo();
        listaGoles = new LinkedList<>();
    }

    public void definirGanadorLlave(){

        System.out.println("Ya se juega la llave " + nombreLlave);

        int puntos1 = 0, puntos2 = 0;
        int goles1 = 0, goles2 = 0;
        int desempenio1, desempenio2;
        Random random = new Random();
        int turnos = 0;

        Jugador jugadorGOL; 

        while(Math.abs(puntos1 - puntos2) <= 2 && turnos < 20){ //mientras haya cierta paridad 
            desempenio1 = random.nextInt(100);
            desempenio2 = random.nextInt(100);

            if (desempenio1 > desempenio2) {

                puntos1 ++; 


                if (desempenio1 - desempenio2 > 30) { 
                    
                    System.out.println("GOL DE " + equipo1.getNombreEquipo() + " || Resultado parcial: " + goles1 + "-" + goles2);
                    goles1 ++;
                    jugadorGOL = equipo1.definirGoleador();
                    agregarAGoleadores(jugadorGOL);

                } 
            }else if(desempenio2 > desempenio1){

                puntos2 ++; 

                if (desempenio2 - desempenio1 > 30){
                
                    goles2 ++;
                    System.out.println("GOL DE " + equipo2.getNombreEquipo() + " || Resultado parcial: " + goles1 + "-" + goles2);
                    jugadorGOL = equipo2.definirGoleador();
                    agregarAGoleadores(jugadorGOL);

                }
            }//si es el mismo numero se podria decir que el partido sigue como viene transcurriendo

            turnos ++;
        }

        System.out.println("Resultado final del encuentro " + equipo1.getNombreEquipo() + " VS " + equipo2.getNombreEquipo());
        System.out.println(equipo1.getNombreEquipo() + " " + goles1 + " - " + goles2 + " " + equipo2.getNombreEquipo());
        


        if (goles1 > goles2) {
            
            System.out.println("GANADOR: " + equipo1.getNombreEquipo());
            ganadorLlave = equipo1;

        }else if (goles2 > goles1){

            System.out.println("GANADOR: " + equipo2.getNombreEquipo());
            ganadorLlave = equipo2;

            }else{

               System.out.println("PARTIDO EMPATADO! SE DECIDE IR A PENALES"); 

                int calidadDisparo;

                int sorteoEquipo1 = 0, sorteoEquipo2 = 0;


                while(sorteoEquipo1 == sorteoEquipo2){
                sorteoEquipo1 = random.nextInt(100);
                sorteoEquipo2 = random.nextInt(100);
                }

                    Equipo comienzaPateando;
                    Equipo comienzaAtajando;



                if (sorteoEquipo1 > sorteoEquipo2) {

                    comienzaPateando = equipo1;
                    comienzaAtajando = equipo2;

                }else{

                    comienzaPateando = equipo2;
                    comienzaAtajando = equipo1;

                }

                int golesPenal1 = 0, golesPenal2 = 0;

               for(int i = 0; i <= 4 ; i++){

                    System.out.println("Turno de patear: " + comienzaPateando.getNombreEquipo());
                    calidadDisparo = random.nextInt(11);

                    if(calidadDisparo > 4){
                        golesPenal1++;
                    }

                    System.out.println("Turno de patear: " + comienzaAtajando.getNombreEquipo());
                    calidadDisparo = random.nextInt(11);

                    if(calidadDisparo > 4){
                        golesPenal2++;
                    }
                    

               }

               if(golesPenal1 > golesPenal2){

                System.out.println("GANADOR POR PENALES: " + comienzaPateando.getNombreEquipo());

               }else if(golesPenal2 > golesPenal1){

                System.out.println("GANADOR POR PENALES: " + comienzaAtajando.getNombreEquipo());


               }else{

                while (golesPenal1 == golesPenal2){ //patearan uno y uno hasta que se rompa la igualdad
                    
                    System.out.println("Turno de patear: " + comienzaPateando.getNombreEquipo());
                    calidadDisparo = random.nextInt(11);

                    if(calidadDisparo > 4){
                        golesPenal1++;
                    }

                    System.out.println("Turno de patear: " + comienzaAtajando.getNombreEquipo());
                    calidadDisparo = random.nextInt(11);

                    if(calidadDisparo > 4){
                        golesPenal2++;
                    }

                }

                if (golesPenal1 > golesPenal2) {

                    System.out.println("GANADOR POR PENALES: " + comienzaPateando.getNombreEquipo());

                }else{

                System.out.println("GANADOR POR PENALES: " + comienzaAtajando.getNombreEquipo());

                }

                System.out.println("RESULTADO POR PENALES: " + comienzaPateando.getNombreEquipo() + " " + golesPenal1 + " - " + golesPenal2 + " " + comienzaAtajando.getNombreEquipo());

               }



            }

        }

    public void agregarAGoleadores(Jugador jugadorGOl){

        listaGoles.add(jugadorGOl);

    }
    
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Boca Juniors", "La Bombonera");
        Equipo equipo2 = new Equipo("River Plate", "El Monumental");

        equipo1.contratarDT("Diego Martínez", "11111111", 42, "Ofensivo");
        equipo2.contratarDT("Martín Demichelis", "22222222", 43, "Equilibrado");

        equipo1.agregarJugador(new Jugador("Jugador 1", "33333333", 28, "Delantero", 9));
        equipo2.agregarJugador(new Jugador("Jugador 2", "44444444", 29, "Arquero", 1));

        LlaveCopa llave = new LlaveCopa(equipo1, equipo2);
        llave.definirGanadorLlave();
    }

}
