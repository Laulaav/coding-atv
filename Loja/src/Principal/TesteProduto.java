package Principal;

import Model.Produto;
import Model.Fornecedor;
import Model.ConjuntoProdutos;

public class TesteProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fornecedor fornecedor1 = new Fornecedor("1234321","992346789","Zé Maria");
		Fornecedor fornecedor2 = new Fornecedor("543212345","992196385","Cláudio");
		
		ConjuntoProdutos conjuntoProdutos = new ConjuntoProdutos();
		
		Produto produto1 = new Produto(1,"TV LCD",3500.0f, fornecedor1);
		Produto produto2 = new Produto(2,"Notebook",2000.0f, fornecedor1);
		Produto produto3 = new Produto(3,"Impressora",232.0f, fornecedor2);
		Produto produto4 = new Produto(4,"Celular",5000.0f, fornecedor2);
		Produto produto5 = new Produto(5,"Geladeira",2000.0f, fornecedor2);

		
		conjuntoProdutos.inserirProduto(produto1);
		conjuntoProdutos.inserirProduto(produto2);
		conjuntoProdutos.inserirProduto(produto3);
		conjuntoProdutos.inserirProduto(produto4);
		conjuntoProdutos.inserirProduto(produto5);	
		
		conjuntoProdutos.mostrarProdutos();
		
		conjuntoProdutos.alterarProduto(1, 15.0f);
		
		conjuntoProdutos.removerProduto(1);

		conjuntoProdutos.mostrarProdutos();


	}

}
