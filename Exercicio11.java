public class Exercicio11 {
    public static void main(String[] args) {
        int idade;
        idade = 20;

        if (idade < 12) {
            System.out.println("Entrada permitida apenas com responsável.");
        }
        if (idade > 12 && idade <= 17) {
            System.out.println("Entrada permitida na área juvenil.");
        }
        if (idade >= 18) {
            System.out.println("Entrada liberada para todas as áreas.");
        }
    }
}
