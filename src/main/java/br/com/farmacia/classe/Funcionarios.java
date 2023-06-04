package br.com.farmacia.classe;

public class Funcionarios extends Pessoas {

	private int salario, id_fun, cart_trab, reservista;
	private String cargo;

	public Funcionarios() {
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getId_fun() {
		return id_fun;
	}

	public void setId_fun(int id_fun) {
		this.id_fun = id_fun;
	}

	public int getCart_trab() {
		return cart_trab;
	}

	public void setCart_trab(int cart_trab) {
		this.cart_trab = cart_trab;
	}

	public int getReservista() {
		return reservista;
	}

	public void setReservista(int reservista) {
		this.reservista = reservista;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
