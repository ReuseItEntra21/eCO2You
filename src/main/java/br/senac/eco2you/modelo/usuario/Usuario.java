package br.senac.eco2you.modelo.usuario;

public class Usuario {

	public Usuario() {}

		    private String nome;
		    private String email;
		    private String senha;

		    public Usuario(String nome, String email, String senha) {
		        this.nome = nome;
		        this.email = email;
		        this.senha = senha;
		    }

		    public String getNome() {
		        return nome;
		    }

		    public void setNome(String novoNome) {
		        this.nome = novoNome;
		    }

		    public String getEmail() {
		        return email;
		    }

		    public void setEmail(String novoEmail) {
		        this.email = novoEmail;
		    }

		    public String getSenha() {
		        return senha;
		    }

		    public void setSenha(String novaSenha) {
		        this.senha = novaSenha;
		    

		    
		}

	}

