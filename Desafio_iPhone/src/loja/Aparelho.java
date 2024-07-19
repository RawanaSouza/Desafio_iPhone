package loja;

import smartphone.Iphone;

//este pacote representa uma loja onde o atendente está apresentando os novos aplicativos do iPhone

public class Aparelho {
	public static void main(String[ ] args) {
		Iphone iphone = new Iphone();
		
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica(null);
		iphone.ligar(null);
		iphone.atender();
		iphone.iniciarCorreioVoz();
		iphone.exibirPagina(null);
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
	}
}
