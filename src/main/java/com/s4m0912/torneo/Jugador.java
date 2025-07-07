public class jugador extends persona {

    protected String posicion;
    protected int dorsal;
    protected int cantidadGoles; 
    protected equipo equipoJuega;

    public jugador(String nombre, String dni, int edad, String posicion, int dorsal){

        super(nombre, dni, edad);
        if (dorsal < 0) { throw new IllegalArgumentException("El dorsal debe tener un numero mayor o igual a 0 ");}
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.cantidadGoles = 0;
        equipoJuega = null;

    }

    public void setEquipoJuega(equipo equipo){

        this.equipoJuega = equipo;

    }

    public equipo getEquipoJuega(){

        return equipoJuega;

    }

    public int getCantidadGoles(){

        return cantidadGoles;

    }

    public void anotarGol(){

        cantidadGoles++;

    }

    public int getDorsal(){

        return dorsal; 

    }

    public String obtenerRol(){
     
        return posicion;

    }
    
}
