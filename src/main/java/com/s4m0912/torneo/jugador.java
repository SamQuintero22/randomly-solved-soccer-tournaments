public class jugador extends persona {

    protected String posicion;
    protected int dorsal;

    public jugador(String nombre, String dni, int edad, String posicion, int dorsal){

        super(nombre, dni, edad);
        if (dorsal < 0) { throw new IllegalArgumentException("El dorsal debe tener un numero mayor o igual a 0 ");}
        this.posicion = posicion;
        this.dorsal = dorsal;

    }

    public int getDorsal(){

        return dorsal; 

    }

    public void obtenerRol() {
     
                System.out.print(posicion);

    }
    
}
