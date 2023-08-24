package aplicacao;
import java.util.List;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import modelo.Carro;

public class Alterar {
	protected ObjectContainer manager;
	public Alterar(){
		manager = Util.conectarBanco();
		atualizar();
		Util.desconectar();
		System.out.println("\n\n aviso: feche sempre o plugin OME antes de executar aplicacao");
	}

	public void atualizar(){
		Query q = manager.query();
		q.constrain(Carro.class);  				
		q.descend("placa").constrain("AAA1100");		 
		List<Carro> resultados = q.execute(); 

		if(resultados.size()>0) {
			//alterar potencia do motor para 1.6
			Carro c =  resultados.get(0);
			c.getMotor().setPotencia(1.6);
			manager.store(c);
			manager.commit();
			System.out.println("alterou a potencia para 1.6 do carro AAA1100");
		}
		else
			System.out.println("carro inexistente");
	}



	//=================================================
	public static void main(String[] args) {
		new Alterar();
	}
}

