package aplicacao;

import java.util.List;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import modelo.Apresentacao;


public class Consultar {
	protected ObjectContainer manager;

	public Consultar(){
		manager = Util.conectarBanco();
		consultar();
		Util.desconectar();
		
		System.out.println("\n\n aviso: feche sempre o plugin OME antes de executar aplicação");
	}

	public void consultar(){
		System.out.println("\n---listar Apresentações com Artista de nome Fausto");
		Query q = manager.query();
		q.constrain(Apresentacao.class);
		q.descend("artista").descend("nome").constrain("Fausto").startsWith(true);
		List<Apresentacao> resultados = q.execute();
		for(Apresentacao a: resultados)
			System.out.println(a);
		
		System.out.println("\n---listar apresentações com preço do ingresso superior a 100 reais ordenados por valor");
		Query q2 = manager.query();
		q2.constrain(Apresentacao.class);
		q2.descend("precoIngresso").constrain(100).smaller().not();
		q2.descend("precoIngresso").orderDescending();
		List<Apresentacao> resultados2 = q2.execute();
		for(Apresentacao a: resultados2)
			System.out.println(a);
		
	}
	
	//=================================================
	public static void main(String[] args) {
		new Consultar();
	}
}

