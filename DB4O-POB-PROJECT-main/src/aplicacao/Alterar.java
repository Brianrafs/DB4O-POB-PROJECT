package aplicacao;
/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * POB - Persistencia de Objetos
 * Prof. Fausto Ayres
 *
 */

import java.util.List;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import modelo.Apresentacao;
import modelo.Carro;


public class Alterar {
	protected ObjectContainer manager;

	public Alterar(){
		manager = Util.conectarBanco();
		atualizar();
		Util.desconectar();

		System.out.println("\n\n aviso: feche sempre o plugin OME antes de executar aplica��o");
	}

	public void atualizar(){
		//localizar carro com placa AAA1100 
		Query q = manager.query();
		q.constrain(Apresentacao.class);  				
		q.descend("placa").constrain("AAA1100");		 
		List<Apresentacao> resultados = q.execute(); 

		if(resultados.size()>0) {
			//alterar potencia do motor para 1.6
			Apresentacao a =  resultados.get(0);
			a.setData("25/09/2023");
			a.setCidade("Campina Grande");
			a.setPrecoIngresso(150);
			manager.store(a);
			manager.commit();
			System.out.println("alterou a Data para 25/09/2023 em Campina Grande no valor de 150 reais.");
		}
		else
			System.out.println("Show inexistente");
	}



	//=================================================
	public static void main(String[] args) {
		new Alterar();
	}
}

