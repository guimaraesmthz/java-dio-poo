package diopoo;

public class Principal {

	public static void main(String[] args) {

		Iphone myIphone = new Iphone("11","iPhone do Matheus", 2020);
		System.out.println(myIphone.reprodutor.getModel());
		System.out.println(myIphone.telefone.number);

	}

}
