import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nome = null; int idade = 0; 


		for(int i=1; i<5; i++){
			Pessoa pes = new Pessoa();
			System.out.println("Informe o nome da " + i + "° Pessoa");
			pes.setNome(sc.nextLine());
			System.out.println("Informe a idade");
			pes.setIdade(Integer.parseInt(sc.nextLine()));
			listaPessoas.add(pes);
		}


		System.out.println("Informe o nome para busca:");
		String busca = sc.nextLine();

		for(Pessoa pes: listaPessoas){
			if(busca.equals(pes.getNome())){
				System.out.println("Localizei o: " + pes.getNome());				
			}

		}

		System.out.println("Busca do mais Velho:");
		Pessoa maisVelho = new Pessoa();
		maisVelho.setIdade(0);

		for(Pessoa p: listaPessoas){
			if(p.getIdade() > maisVelho.getIdade()){
				maisVelho = p;
			}
		}
		System.out.println("O mais velho é " + maisVelho.getNome());

		System.out.println("Informe o nome para busca:");
		String busca2 = sc.next();
		System.out.println("Resultado da Pesquisa");
		for(Pessoa p : buscaPessoas(busca2)){
			System.out.println(p.getNome());
		}
	}

	private static ArrayList<Pessoa> buscaPessoas(String busca){
		ArrayList<Pessoa> resultado = new ArrayList<Pessoa>();
		for(Pessoa x : listaPessoas){
			if(busca.equalsIgnoreCase (x.getNome())){
				resultado.add(x);

			}
		}
		return resultado;
	}	



}	
