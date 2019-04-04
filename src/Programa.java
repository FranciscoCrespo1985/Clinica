import java.util.ArrayList;
import java.util.List;

public class Programa {
	private int numero;
	private String nombre;
	List<Medicamentos> medicamentos = new ArrayList<Medicamentos>();
	private double precio;
	
	
	
	
	
	
	
	
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Medicamentos> getMedicamentos() {
		return medicamentos;
	}
	public void setMedicamentos(List<Medicamentos> medicamentos) {
		this.medicamentos = medicamentos;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
