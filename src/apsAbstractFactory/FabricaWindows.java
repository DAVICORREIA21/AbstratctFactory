package apsAbstractFactory;

public class FabricaWindows implements FabricaAbstrata{

	@Override
	public Janela criarJanela() {
		
		return new JanelaWindows();
	}

	@Override
	public Botao criarBotao() {
		
		return new BotaoWindows();
	}

	@Override
	public Menu criarMenu() {
		
		return new MenuWindows();
	}

}
