public class Dt extends Persona{

    protected String estilo;

    public Dt(String nombre, String dni, int edad, String estilo){

        super(nombre, dni, edad);
        this.estilo = estilo;

    }

    public String obtenerRol(){

        return "DT";

    }

    public void estiloDT() {
     
        System.out.print("DT: " + estilo);

    }

    
}
