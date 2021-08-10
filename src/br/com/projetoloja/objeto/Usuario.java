package br.com.projetoloja.objeto;

public class Usuario {

// atributos da classe usuario
	private int idusuario;
	private String nomeUsuario;
	private String senha;
	private String foto;
	
	
	public Usuario() {
		
	}
		
	
	public Usuario(int idusuario, String nomeUsuario, String senha, String foto) {
		this.idusuario = idusuario;
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
		this.foto = foto;
	}



	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
}
