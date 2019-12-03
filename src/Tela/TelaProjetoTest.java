package Tela;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import apsAbstractFactory.FabricaAndroid;
import apsAbstractFactory.FabricaWindows;

class TelaProjetoTest {

	@Test
	void testTelaWindows() {
		TelaProjeto t = new TelaProjeto();
		t.setFabrica(new FabricaWindows());
		t.montar();
		assertEquals("JanelaWindows { MenuWindows,BotaoWindows }", t.desenhar());
		
	}
	@Test
	void testTelaAndroid() {
		TelaProjeto t = new TelaProjeto();
		t.setFabrica(new FabricaAndroid());
		t.montar();
		assertEquals("JanelaAndroid { MenuAndroid,BotaoAndroid }", t.desenhar());
		
	}

}
