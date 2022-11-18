package javaPOO;

public class IngressoVIP extends Ingresso{

	public IngressoVIP(String filme, String horasessao, String tipoingresso) {
		super(filme, horasessao, tipoingresso);
	}
	
	public void acessoLanchonete(boolean vip, boolean filme){
		if(vip) {
			System.out.print("Lanchonete do cinema liberada.");
		}
		if(filme) {
			System.out.print(" Sessão 3D.");
		}else {
			System.out.print(" Sessão 2D.");
		}
	}
	
	public void acessoLanchonete() {
		System.out.print("Compre um ingresso VIP.");
		System.out.print(" Sessão 2D.");
	}

}
