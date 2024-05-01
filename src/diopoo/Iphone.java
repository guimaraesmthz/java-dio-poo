package diopoo;

public class Iphone {

    public String versao;
    public String nome;
    public int year;
    protected AparelhoTelefonico telefone;
    protected ReprodutorMusical reprodutor;
    protected NavegadorInternet navegador;

    public Iphone(String versao, String nome, int year){
      this.versao = versao;
      this.nome = nome;
      this.year = year;
      ReprodutorMusical reprodutor = new ReprodutorMusical();
      AparelhoTelefonico telefone = new AparelhoTelefonico("Matheus","21970296925");
      NavegadorInternet navegador = new NavegadorInternet();
      this.telefone = telefone;
      this.reprodutor = reprodutor;
      this.navegador = navegador;
    };

}
