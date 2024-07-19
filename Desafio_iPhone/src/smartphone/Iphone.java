package smartphone;

import smartphone.aplicativos.*;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	@Override
	public void tocar() {
		System.out.println("TOCANDO MÚSICA");
	}
	@Override
	public void pausar() {
		System.out.println("PAUSANDO MÚSICA");
	}
	
	@Override
	public void selecionarMusica(String musica) {
		System.out.println("SELECIONANDO MÚSICA");
	}
	
	
	@Override
	public void ligar(String numero) {
		System.out.println("LIGANDO");
	}
	
	@Override
	public void atender() {
		System.out.println("ATENDENDO");
	}
	
	@Override
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
	}
	
	
	@Override
	public void exibirPagina(String url) {
		System.out.println("EXIBINDO PÁGINA");
	}
	
	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA");
	}
	
	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO A PÁGINA");
	}
	
}


