package Tela;

import apsAbstractFactory.Botao;
import apsAbstractFactory.FabricaAbstrata;
import apsAbstractFactory.Janela;
import apsAbstractFactory.Menu;

public class TelaProjeto {

	private FabricaAbstrata fabrica;
	private Janela janela;
	private Menu menu;
	private Botao botao;
	

	public void setFabrica(FabricaAbstrata fabrica) {
		this.fabrica = fabrica;
	}
	
	public void montar() {
		this.janela = fabrica.criarJanela();
		this.menu = fabrica.criarMenu();
		this.botao = fabrica.criarBotao();
		
		
		
	}
	
	public String desenhar() {
		return janela.desenhar()+" { "+menu.desenhar()+","+botao.desenhar()+" }";
	}
	
}
//"JanelaWindows { MenuWindows, BotaoWindows }"