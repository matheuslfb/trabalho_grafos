import java.io.Serializable;
import java.util.ArrayList;

public class Aeroporto implements Serializable {

	private static final long serialVersionUID = 6748342554146454296L;

	// c�digo do aeroporto,
	//latitude e longitude, nome do aeroporto e c�digo do pa�s.
	
	String codAero;
	 double latitude;
	 double longitude;
	 String nome;
	 String codPais;
	
	public Aeroporto(){
		this.codAero = codAero;
		this.latitude = latitude;
		this.longitude = longitude;
		this.nome = nome;
		this.codPais = codPais;
	}
	
	public String getCodAero() {
		return codAero;
	}
	public void setCodAero(String codAero) {
		this.codAero = codAero;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodPais() {
		return codPais;
	}
	public void setCodPais(String codPais) {
		this.codPais = codPais;
	}

	@Override
	public String toString() {
		return "C�digo (" + codAero + "), latitude = " + latitude + ", longitude = " + longitude + ", nome = "
				+ nome + ", codPais = " + codPais + "]";
	}
	
	
	
	
	
}
