public abstract class persona {

    protected String nombreYApe;
    protected String DNI;
    protected int edad;
    
    public persona(String nombre, String dni, int edad){

        this.nombreYApe = nombre;
        this.DNI = dni;
        this.edad = edad;
        

    }

    public String getNombre(){

        return nombreYApe;

    }
    public int getEdad(){
        
        return edad;

    }

    public abstract String obtenerRol();
    
}
