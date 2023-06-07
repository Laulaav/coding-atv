package Model;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ConjuntoProdutos {
	private List<Produto> produtos;

	public ConjuntoProdutos() {
		super();
		this.produtos = new ArrayList<Produto>();
	}
	
	private boolean verificaCodigo(int codigo) {
		for(int i=0;i<produtos.size(); i++) {
		Produto produto = produtos.get(i);
		if (produto.getCodigo() == codigo) {
            return true;
        }
		}
		return false;
	}
	
	public boolean inserirProduto (Produto produto){
		if(verificaCodigo(produto.getCodigo()) == false) {
			produtos.add(produto);
			System.out.println("Adicionado com sucesso!");
			return true;
		}else {
			System.out.println("Este código de produto já está cadastrado. Insira um novo!");
			return false;
		}	
	}
	
	public void removerProduto(int codigo) {
		Iterator<Produto> produtosIterator = produtos.iterator();
		while(produtosIterator.hasNext()) {
			Produto produto = produtosIterator.next();
			if (produto.getCodigo() == codigo) {
	            produtosIterator.remove();
	            System.out.println("Produto removido com sucesso!");
	            return;
	        }else {
	    		System.out.println("Este produto não está registrado!");

	        }
		}
	}
	
	public void alterarProduto(int codigo, float percentual) {
		for(int i=0; i<produtos.size();i++) {
			Produto produto = produtos.get(i);
			if(produto.getCodigo()==codigo) {
				produto.atualizarPreco(percentual);
				System.out.println("O preço foi atualizado para: " + produto.getValor());
				
			}else {
				System.out.println("Produto não encontrado!");

			}
		}
	}
	
	public void mostrarProdutos() {
        System.out.println("***********************");
		System.out.println("Produtos cadastrados:");
        System.out.println("***********************");
		for(int i=0; i<produtos.size();i++) {
			Produto produto = produtos.get(i);
            System.out.println("Nome do produto: " + produto.getNome());
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Valor: " + produto.getValor());
            System.out.println("Fornecedor: " + produto.getFornecedor().getNome());
            System.out.println("CNPJ: " + produto.getFornecedor().getCnpj());
            System.out.println("Telefone: " + produto.getFornecedor().getTelefone());
            System.out.println("***********************");
		}
	}
	
	
	
	

}
