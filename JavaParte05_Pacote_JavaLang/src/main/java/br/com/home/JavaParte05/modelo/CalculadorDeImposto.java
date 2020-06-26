// padrão de nome de pacote, "SiglaPais.TipoOrgnização.NomeOrganização.NomeProjeto"
package br.com.home.JavaParte05.modelo;

import br.com.home.modelo.Tributavel;

//Full Qualified Name - br.com.home.modelo.CalculadorDeImposto
public class CalculadorDeImposto {
	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	public double getTotalImposto() {
		return totalImposto;
	}
}
