package Lista_02;

public class Exercicio13 {
    public static void main(String[] args) {
        double valorCompra,desconto20,desconto10;
        boolean clienteVip = false;

        valorCompra = 100.00;
        desconto20 = valorCompra - valorCompra * 0.2;
        desconto10 = valorCompra - valorCompra * 0.1;

        
        if (clienteVip == true && valorCompra >= 200) {
            System.out.println("Será aplicado um desconto de 20% na sua compra!");
            System.out.println(desconto20);
        }
        if (clienteVip == true && valorCompra < 200){
            System.out.println("Será aplicado um desconto de 10% na sua compra!");
            System.out.println(desconto10);
        }
        if (clienteVip == false && valorCompra >= 200) {
            System.out.println("Será aplicado um desconto de 10% na sua compra!");
            System.out.println(desconto10);
        }
        if(clienteVip == false && valorCompra < 200) {
            System.out.println("Não será aplicado nenhum desconto.");
            System.out.println(valorCompra);
        }
    }  
}
