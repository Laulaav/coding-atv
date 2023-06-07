package Model;

public class Produto {
	private int codigo;
	private String nome;
	private float valor;
	private Fornecedor fornecedor;
	
	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produto(int codigo, String nome, float valor, Fornecedor fornecedor) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		this.fornecedor = fornecedor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public float atualizarPreco (float porcentagem) {
		valor = (valor * (100 + porcentagem))/100;
		return valor;
		
	}
	
	
}
