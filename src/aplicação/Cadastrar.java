package aplicacao;
import com.db4o.ObjectContainer;

import modelo.Artista;
import modelo.Apresentacao;
import modelo.Cidade;

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
		Artista carro ;

		carro = new Carro("AAA1100", new Motor("zetec", 1.0), new Motorista("1111","joao"));
		manager.store(carro);
		manager.commit();

		carro = new Carro("BBB2200", new Motor("fire", 2.0), new Motorista("2222", "maria"));
		manager.store(carro);
		manager.commit();

		carro = new Carro("CCC3300", new Motor("equinox", 3.0),	new Motorista("3333", "jose"));
		manager.store(carro);
		manager.commit();
		
		System.out.println("cadastrou.");
	}	


	//=================================================
	public static void main(String[] args) {
		new Cadastrar();
	}
}


