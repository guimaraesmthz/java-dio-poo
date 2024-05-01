package diopoo;

public class AparelhoTelefonico {

    public String name;
    public String number;

    public AparelhoTelefonico(String name, String number){
        this.name = name;
        this.number = number;
    };

    public void ligar(int number){
        System.out.println("Ligando para o número: "+number);
    };

    public void atender(){
        System.out.println("Ligação atendida");
    };

    public void iniciarCorreioDeVoz(){
        System.out.println("Correio de voz iniciado");
    }

}
