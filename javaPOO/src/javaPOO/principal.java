package javaPOO;
import java.util.Scanner;
import java.util.ArrayList;

public class principal {

	public static void main(String[] args) {
		int contador = 0;
		MenuController controlador = new MenuController(0);
		
		IngressoVIP ticket = new IngressoVIP("", "", "");
		
		
		Films filme1 = new Films("Whiplash", "Damien Chazelle", "Andrew sonha em ser o melhor baterista de sua geração. Ele chama a atenção do impiedoso mestre do jazz Terence Fletcher, que ultrapassa os limites e transforma seu sonho em uma obsessão, colocando em risco a saúde física e mental do jovem músico.", "Drama/Música/Independente", "1h e 47m");
		
		Films filme2 = new Films("Madoka Magica Rebellion", "Akiyuki Shinbou e Yukihiro Miyamoto", "Na história, Homura parece ter voltado novamente no tempo, mas algo estranho parece estar acontecendo, ao invés de bruxas, ela agora parece lutar contra os “pesadelos” das pessoas, só que ela parece ser a única que percebe que isso não é normal.", "Anime/Suspense/Mistério", "2h e 16m");
		
		Films filme3 = new Films("Gojira", "Ishirõ Honda", "Um gigantesco réptil mutante com 50 metros de altura surge em virtude de testes nucleares. A monstruosa criatura cria um rastro de destruição no seu caminho até Tóquio, que corre o risco de ser totalmente destruída se o monstro, imenso como um dinossauro, não for detido. Cabe às autoridades conter o pânico da população e tentar deter ou, em última instância, matar o que ameaça a cidade.", "Terror/Kaiju/Drama", "1h e 36m");
		
		ArrayList<Films> lista = new ArrayList<Films>();
		lista.add(filme1);
		lista.add(filme2);
		lista.add(filme3);
		
		// \n <- quebrar linha
		Scanner leitor = new Scanner(System.in);
		
		int soma = 0;
		int total = 0;
		boolean versao = false; 
		
		while (contador != 4){
			System.out.print("");
			System.out.println("Qual tipo de ingresso você deseja? 1- Vip 2- Comum\nOBS.: O preço do ingresso VIP custa o dobro do comum, espere mudança TAMBÉM no valor da meia.");
			System.out.print("> ");
			controlador.setOpcao(leitor.nextInt());
			if (controlador.getOpcao() == 1){
				versao = true;
				filme1.setFilme3D(true);
				filme2.setFilme3D(true);
				filme3.setFilme3D(true);
				controlador.setMeia(12*2);
				controlador.setInteira(24*2);
			}else {
				versao = false;
				filme1.setFilme3D(false);
				filme2.setFilme3D(false);
				filme3.setFilme3D(false);
				controlador.setMeia(12);
				controlador.setInteira(24);
			}			
			
			System.out.println();
			System.out.println("Diga qual filme você deseja ver da seguinte lista: 1-  Whiplash 2- Madoka Magica Rebellion 3- Gojira");	
			System.out.print("> ");
			controlador.setOpcao(leitor.nextInt());
			controlador.setOpcao(controlador.getOpcao() - 1);
			ticket.filme = lista.get(controlador.getOpcao()).getNome();
			
			System.out.println();
			System.out.println("Boa escolha! \nSeu filme escolhido foi: " + lista.get(controlador.getOpcao()).getNome() + "\nDiretor: " + lista.get(controlador.getOpcao()).getDiretor() + "\nDescrição: " +lista.get(controlador.getOpcao()).getDescricao()+"\nGênero: " + lista.get(controlador.getOpcao()).getGenero() + "\nDuração: " + lista.get(controlador.getOpcao()).getDuracao());
			System.out.println();
	
			
			System.out.println("Temos 3 sessões para "+ lista.get(controlador.getOpcao()).getNome() +", diga qual prefere: 1- 13h, 2- 16h, 3- 18h");
			System.out.print("> ");
			controlador.setSessao(leitor.nextInt());
			if (controlador.getSessao() == 1){
				ticket.setHorasessao("13h");
			}
			
			if (controlador.getSessao() == 2){
				ticket.setHorasessao("16h");
			}
			
			if (controlador.getSessao() == 3){
				ticket.setHorasessao("18h");
			}
			
			if(lista.get(controlador.getOpcao()).getFilme3D()) {
				System.out.println();
				System.out.println("Deseja ver seu filme em 3D ou 2D? 1- 3D 2- 2D");
				System.out.print("> ");
				controlador.setOpcao(leitor.nextInt());
				if(controlador.getOpcao() == 2) {
					filme1.setFilme3D(false);
					filme2.setFilme3D(false);
					filme3.setFilme3D(false);
				}
			}
			
			System.out.println();
			System.out.println("Quantas meia-entradas?");
			System.out.print("> ");
			soma = leitor.nextInt();
			if(soma > 0) {
				ticket.setTipoingresso("Meia");
			} 
			total = soma * controlador.getMeia();
			
			System.out.println();
			System.out.println("Quantas inteiras?");
			System.out.print("> ");
			soma = leitor.nextInt();
			if(soma > 0) {
				if(total > 0) {
					ticket.setTipoingresso(ticket.getTipoingresso() + " e inteira");
				}				
				
				else {
					ticket.setTipoingresso("Inteira");
				}
			
			}
			total += soma * controlador.getInteira();
			
			System.out.println();
			System.out.println("Ticket pronto!\nFilme: "+ ticket.filme +"\nHorário: "+ ticket.getHorasessao() +"\nTipo de ingresso: " + ticket.getTipoingresso() + ".\nCustando um total de: " + total +". Bom filme!");
			if(versao) {
				if(lista.get(controlador.getOpcao()).getFilme3D()){
					ticket.acessoLanchonete(true, true);
				}else {
					ticket.acessoLanchonete(true, false);
				}
			}else{
				ticket.acessoLanchonete();
			}
			
			total = 0;
			
			System.out.println();
			
			System.out.println("Deseja comprar ingresso para outro filme? 0- Não 1- Sim");
			System.out.print("> ");
			contador = leitor.nextInt();
			
			if (contador == 0) {
				break;
			
			}
		}
		
	}

}
