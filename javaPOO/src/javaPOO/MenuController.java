package javaPOO;

public class MenuController {
	private int meia;
	private int inteira;
	private int opcao;
	private int sessao;
	
	public MenuController(int sessao){
		this.setOpcao(0);	
	}
	
	public int getSessao() {
		return this.sessao;
	}
	
	public int getMeia() {
		return this.meia;
	}

	public void setMeia(int meia) {
		this.meia = meia;
	}
	
	public int getInteira() {
		return this.inteira;
	}
	
	public void setInteira(int inteira) {
		this.inteira = inteira;
	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}

	public void setSessao(int sessao) {
		this.sessao = sessao;
	}
}
