import java.io.Serializable;

public class Rota implements Serializable {

	private static final long serialVersionUID = 7686714783256478043L;
	
	private CiaAerea cia;
	private Aeroporto origem;
	private Aeroporto destino;
	private String ciaa, orig, dest;

	public Rota(CiaAerea cia, Aeroporto origem, Aeroporto destino) {
		this.cia = cia;
		this.origem = origem;
		this.destino = destino;
		
	}
	public Rota(String ciaa, String orig, String dest){
		this.ciaa = ciaa;
		this.orig = orig;
		this.dest = dest;
		
	}

	@Override
	public String toString() {
		return cia.getCodigo() + ": " + origem.getCodAero() + " -> " + destino.getCodAero() ;
	}

	public CiaAerea getCia() {
		return cia;
	}

	public Aeroporto getDestino() {
		return destino;
	}

	public Aeroporto getOrigem() {
		return origem;
	}
	
	public String getCiaa() {
		return ciaa;
	}
	public String getOrig() {
		return orig;
	}
	public String getDest() {
		return dest;
	}
	
	
}
