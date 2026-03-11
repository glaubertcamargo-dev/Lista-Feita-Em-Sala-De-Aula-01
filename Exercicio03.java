public class Exercicio03 {
    public static void main(String[] args) {
        int anoAtual;
        int anoNascimento, idade;

        anoAtual = 2026;
        anoNascimento = 2012;
        idade = anoAtual - anoNascimento;

        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }
    }
}
