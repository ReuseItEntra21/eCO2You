package br.senac.eco2you.modelo.entidade.itemDeposito;

import br.senac.eco2you.modelo.entidade.reciclavel.Reciclavel;

public class ItemDeposito {
	
	private Reciclavel reciclavel;
	private int quantidadeReciclaveis;
	 
		public ItemDeposito(Reciclavel reciclavel, int quantidadeReciclaveis) {
			setReciclavel(reciclavel);
			setQuantidadeReciclaveis(quantidadeReciclaveis);;
	 
		}
	 
		public Reciclavel getReciclavel() {
			return reciclavel;
		}
	 
		public void setReciclavel(Reciclavel reciclavel) {
			this.reciclavel = reciclavel;
		}
	 
		public int getQuantidadeReciclaveis() {
			return quantidadeReciclaveis;
		}
	 
		public void setQuantidadeReciclaveis(int quantidadeReciclaveis) {
			this.quantidadeReciclaveis = quantidadeReciclaveis;
		}
}
