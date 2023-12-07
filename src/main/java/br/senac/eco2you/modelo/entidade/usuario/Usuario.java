package br.senac.eco2you.modelo.entidade.usuario;

import br.senac.eco2you.modelo.endereco.Endereco;

public abstract class Usuario {

	public Usuario() {}

		    private String nome;
		    private String email;
		    private String senha;
		    private Endereco endereco;

		    public Usuario(String nome, String email, String senha, Endereco endereco) {
		        this.nome = nome;
		        this.email = email;
		        this.senha = senha;
		        this.endereco = endereco;
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
		    
		    public Endereco getEndereco() {
		    	return endereco;
		    }
		    
		    public void setEndereco(Endereco endereco) {
		    	this.endereco = endereco;
		    }

	}

