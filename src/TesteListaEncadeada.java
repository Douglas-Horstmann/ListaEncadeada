
public class TesteListaEncadeada {

	public static void main(String[] args) {
		
		ListaEncadeada lista = new ListaEncadeada();
		
		lista.append(5);
		lista.append(6);
		lista.addFirst(2);
		lista.addFirst(1);
		
		lista.adicionarApos(2,3);
		lista.adicionarApos(3,4);
		
		lista.print();
	}

}
