public class dt extends persona{

    protected String estilo;

    public dt(String nombre, String dni, int edad, String estilo){

        super(nombre, dni, edad);
        this.estilo = estilo;

    }

    public void obtenerRol() {
     
                System.out.print("DT: " + estilo);

    }

    
}
