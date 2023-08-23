import java.util.ArrayList;

public class Artista {
	
		private List<Apresentacao> apresentacao = new ArrayList<>();
		private String nome;

		public Artista(String apresentacao, String nome) {
			this.apresentacao = apresentacao;
			this.nome = nome;
		}

		public String getApresentacao() {
			return apresentacao;
		}
		
		public void setApresentacao(String apresentacao) {
			this.apresentacao = apresentacao;
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}

		@Override
		public String toString() {
			return "[nome=" + nome + ", apresentacao=" + apresentacao + "]";
		}
		
		
	}
}
