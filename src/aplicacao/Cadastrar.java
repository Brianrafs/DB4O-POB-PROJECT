package aplicacao;

import com.db4o.ObjectContainer;

import modelo.Apresentacao;
import modelo.Cidade;
import modelo.Artista;


public class Cadastrar {
	protected ObjectContainer manager;

	public Cadastrar(){
		manager = Util.conectarBanco();
		cadastrar();
		Util.desconectar();
		
		System.out.println("fim da aplicacao");
	}


	public void cadastrar(){
		System.out.println("cadastrando...");
		Apresentacao apresentacao ;

		apresentacao = new Apresentacao("1", "29/03/2024", new Artista("Fausto Ayres"), new Cidade("João Pessoa"), 200);
		manager.store(apresentacao);
		manager.commit();
		
		apresentacao = new Apresentacao("2","17/10/2023", new Artista("Arthur Lyra"),  new Cidade("Sapé"), 85);
		manager.store(apresentacao);
		manager.commit();

		apresentacao = new Apresentacao("3","07/09/2023", new Artista("Brian Rafael"), new Cidade("Campina Grande"), 125);
		manager.store(apresentacao);
		manager.commit();
		
		System.out.println("cadastrou.");
	}	


	//=================================================
	public static void main(String[] args) {
		new Cadastrar();
	}
}


