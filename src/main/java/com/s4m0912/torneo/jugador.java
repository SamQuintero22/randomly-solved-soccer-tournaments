public class jugador extends persona {

    protected String posicion;

    public jugador(String nombre, String dni, int edad, String posicion){

        super(nombre, dni, edad);
        this.posicion = posicion;

    }

    public void obtenerRol() {
     
                System.out.print(posicion);

    }
    
}
