package br.com.farmacia.classe;

public class Produtos {

	private int cod_barras, mg, val, valor, lote;
	private String prin_ativ, tipo, tarja;

	public Produtos() {
	}

	public int getCod_barras() {
		return cod_barras;
	}

	public void setCod_barras(int cod_barras) {
		this.cod_barras = cod_barras;
	}

	public int getMg() {
		return mg;
	}

	public void setMg(int mg) {
		this.mg = mg;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	public String getPrin_ativ() {
		return prin_ativ;
	}

	public void setPrin_ativ(String prin_ativ) {
		this.prin_ativ = prin_ativ;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTarja() {
		return tarja;
	}

	public void setTarja(String tarja) {
		this.tarja = tarja;
	}

}
