import java.io.Serializable;

public class Rota implements Serializable {

	private static final long serialVersionUID = 7686714783256478043L;
	
	 
	 String  origem, destino, codCiaa;
	 double distancia;

	 
	 //c�digodo aeroporto origem, c�digo do aeroporto destino, dist�ncia e c�digo da
	 //companhia a�rea.
	public Rota() {
		this.origem = origem;
		this.destino = destino;
		this.distancia = distancia;
		this.codCiaa = codCiaa;
		
		
	}


	@Override
	public String toString() {

		return "Rota [origem=" + origem + ", destino=" + destino + ", codCiaa=" + codCiaa + ", distancia=" + distancia
				+ "]";

	}


	public String getOrigem() {
		return origem;
	}


	public void setOrigem(String origem) {
		this.origem = origem;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public String getCodCiaa() {
		return codCiaa;
	}


	public void setCodCiaa(String codCiaa) {
		this.codCiaa = codCiaa;
	}


	public double getDistancia() {
		return distancia;
	}


	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}s