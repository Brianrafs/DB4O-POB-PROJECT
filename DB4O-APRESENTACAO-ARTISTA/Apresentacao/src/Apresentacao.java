
public class Apresentacao {
	private int id;
	private String data;
	private String artista;
	private String cidade;
	private int precoIngresso;
	
	public Apresentacao(int id, String data , String artista, String cidade, int precoIngresso) {
		this.id = id;
		this.artista = artista;
		this.cidade = cidade;
		this.precoIngresso = precoIngresso;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getPrecoIngresso() {
		return precoIngresso;
	}
	public void setPrecoIngresso(int precoIngresso) {
		this.precoIngresso = precoIngresso;
	}
	@Override
	public String toString() {
		return "Apresentacao [id=" + id + ", data=" + data + ", artista=" + artista + ", cidade=" + cidade
				+ ", precoIngresso=" + precoIngresso + "]";
	}
}