package br.com.projetoloja.objeto;

public class DetalheVenda {
//atributos da classe detalheVenda
	private int idDetalheVenda;
	private Venda venda;
	private Produto produto;
	private int quantidade;
	
	public DetalheVenda() {
	}

	public DetalheVenda(int idDetalheVenda, Venda venda, Produto produto, int quantidade) {
		this.idDetalheVenda = idDetalheVenda;
		this.venda = venda;
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public int getIdDetalheVenda() {
		return idDetalheVenda;
	}

	public Venda getVenda() {
		return venda;
	}

	public Produto getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	
	
	
}
