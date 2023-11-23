package avSomativa;

public class PrincipalPedido {

	public static void main(String[] args) {
		Pedido pedido1 = new Pedido();
		Pedido pedido2 = new Pedido(18, "celular", 15);
		
		System.out.println("-----PEDIDO-----");
		System.out.println(pedido2.getId());
		System.out.println(pedido2.getProduto());
		System.out.println(pedido2.getQuantidade());

	}

}
