import java.io.Serializable;

public class Pais implements Serializable {

	private static final long serialVersionUID = 7968808410731767025L;
	
	 String codigo;
	 String nome;

	public Pais() {
		this.codigo = codigo;
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return  nome+" ("  + codigo +")" ;
	}

}
