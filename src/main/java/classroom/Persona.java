package classroom;

public class Persona {
	
	
    final long cedula;
    String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;
        //cedula = 3;
        //porque no tendría sentido poner al atributo cedula como estático 
        //y para poder accederlo desde aquí tendría que hacerse eso. 
    }
    
    //La linea 8 genera error porque no hay constructor sin parámetros
    public Persona () {
    	totalPersonas++;
    	this.cedula=0;
    	//Porque al imprimir cedula para el objeto que entra a este método debe dar 0 
    	//y si lo dejamos con el valor por default imprimiría 0.0
    }
    
    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    public Persona(String nombre) {
        this.nombre = "";
        totalPersonas++;
        this.cedula=1;
      //Porque al imprimir cedula para el objeto que entra a este método debe dar 1 
    	//y si lo dejamos con el valor por default imprimiría 0.0
    }
    
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
