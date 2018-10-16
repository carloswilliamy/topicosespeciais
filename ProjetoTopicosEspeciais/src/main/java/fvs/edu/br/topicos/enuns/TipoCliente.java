package fvs.edu.br.topicos.enuns;

public enum TipoCliente {

	PESSOAFISICA(1), PESSOAJURIDICA(2);
	
	int tipoPessoa;
	
	TipoCliente(int tipoPessoa){
		this.tipoPessoa = tipoPessoa;
	}
}
