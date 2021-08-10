package br.com.projetoloja.objeto;

import java.util.Date;

public class Venda {
//atributos da classe venda
	private int idVenda;
	private Cliente cliente;
	private Funcionario funcionario;
	private Date dataVenda;
	
	public Venda() {
	}

	public Venda(int idVenda, Cliente cliente, Funcionario funcionario, Date dataVenda) {
		this.idVenda = idVenda;
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.dataVenda = dataVenda;
	}

	public int getIdVenda() {
		return idVenda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public Date getDataVenda() {
		return dataVenda;
	}
	
	
	
}
