package apsAbstractFactory;

public class FabricaAndroid implements FabricaAbstrata {

	@Override
	public Janela criarJanela() {
		// TODO Auto-generated method stub
		return new JanelaAndroid();
	}

	@Override
	public Botao criarBotao() {
		// TODO Auto-generated method stub
		return new BotaoAndroid();
	}

	@Override
	public Menu criarMenu() {
		// TODO Auto-generated method stub
		return new MenuAndroid();
	}
	

}
