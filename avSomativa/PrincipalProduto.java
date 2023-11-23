package avSomativa;

public class PrincipalProduto {

	public static void main(String[] args) {
		Livro livro = new Livro("Ate o verao terminar", "collen hoover", 275);
		
		System.out.println("-----Livro-----");
		System.out.println(livro.getNome());
		System.out.println(livro.getAutor());
		System.out.println(livro.getPaginas());

	}

}
