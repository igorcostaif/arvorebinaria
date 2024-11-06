
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estrutura e = new Estrutura();
		
		No n = new No();
		
		e.inserir(4);
		e.inserir(2);
		e.inserir(3);
		e.inserir(1);
		e.inserir(6);
		e.inserir(5);
		e.inserir(7);
		
		e.inOrdem();
		
		n = e.valorMinimo();
		
		System.out.println("\n Valor minimo= "+n.getValor());
		

	}

}
