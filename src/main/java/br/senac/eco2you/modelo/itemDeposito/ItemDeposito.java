package br.senac.eco2you.modelo.itemDeposito;

public class ItemDeposito {
	
	 private Reciclavel reciclavel;
		private int quantidadeReciclaveis;
	 
		public ItemDeposito(Reciclavel reciclavel, int quantidadeReciclaveis) {
			setReciclavel(reciclavel);
			this.quantidadeReciclaveis = quantidadeReciclaveis;
	 
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
