package javaPOO;

class Ingresso{
	public String filme;
	private String horasessao;
	private String tipoingresso;
	
	public Ingresso(String filme, String horasessao, String tipoingresso) {
		this.filme = filme;
		this.horasessao = horasessao;
		this.tipoingresso = tipoingresso;		
	}
	
	public void acessoLanchonete() {
		System.out.println("Compre um ingresso VIP.");
	}
	
	public String getHorasessao(){
		return horasessao;
	}
	
	public void setHorasessao(String horasessao) {
		this.horasessao = horasessao;
	}
	
	public String getTipoingresso(){
		return tipoingresso;
	}
	
	public void setTipoingresso(String tipoingresso) {
		this.tipoingresso = tipoingresso;
	}	
	
}

