package set.OperacoesBasicas;

public class Convidados {
	private String nome;
	private int codigoConvite;

	public Convidados() {
	}

	public Convidados(String nome, int codigoConvite) {
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigoConvite() {
		return codigoConvite;
	}

	public void setCodigoConvite(int codigoConvite) {
		this.codigoConvite = codigoConvite;
	}

}
