package classroom;

public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
	
	private int codigo;
	private String nombre;
	private Tipo(int codigo,String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	//El constructor de un enum debe de ser privado para que no se puedan crear nuevos objetos.
	//Además, los objetos que se están creando no pasan ningún dato de tipo String, 
	//por lo que hay tener un método que solo acepte números.
	
	private Tipo(int codigo) {
		this.codigo = codigo;
	}
}
