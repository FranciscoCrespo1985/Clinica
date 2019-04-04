import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class HistoriaClinica {
	private String nombre,apellido,documento,telefono;
	private Calendar feNac;
	private char sexo;
	private boolean oSocial;
	private List <Programa> programas = new ArrayList<Programa>();
	private List <Visita> visitas = new ArrayList<Visita>();
	public List<Visita> getVisitas() {
		return visitas;
	}
	public void setVisitas(List<Visita> visitas) {
		this.visitas = visitas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Calendar getFeNac() {
		return feNac;
	}
	public void setFeNac(Calendar feNac) {
		this.feNac = feNac;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public boolean isoSocial() {
		return oSocial;
	}
	public void setoSocial(boolean oSocial) {
		this.oSocial = oSocial;
	}
	public List<Programa> getProgramas() {
		return programas;
	}
	public void setProgramas(List<Programa> programas) {
		this.programas = programas;
	}
	
	
	
	
	
	
	
}
