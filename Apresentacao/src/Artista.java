import java.util.ArrayList;


public class Artista {
	
		private ArrayList<Apresentacao> apresentacoes = new ArrayList<>();
		private String nome;

		public Artista(ArrayList<Apresentacao> apresentacoes, String nome) {
			this.apresentacoes = apresentacoes;
			this.nome = nome;
		}

		public ArrayList<Apresentacao> getApresentacoes() {
			return apresentacoes;
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}

		@Override
		public String toString() {
			return "[nome=" + nome + ", apresentacoes=" + apresentacoes + "]";
		}
		
		
	}
