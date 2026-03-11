public class Exercicio12 {
    public static void main(String[] args) {
        String usuario, senha, perfil;
        usuario = "admin";
        senha = "1234";
        perfil = "gerente";

        if (usuario.equals("admin") && senha.equals("1234")) {
        } else {
            System.out.println("Login inválido");
        }
        if (perfil.equals("gerente") && usuario.equals("admin") && senha.equals("1234")) {
            System.out.println("Acesso total ao sistema!");
        }
        if (perfil.equals("funcionário") && usuario.equals("admin") && senha.equals("1234")) {
            System.out.println("Acesso limitado.");
        }
        if (perfil != "gerente" && perfil != "funcionário") {
            System.out.println("Perfil não reconhecido.");
        }
        if (usuario != "admin" && senha != "1234") {
            System.out.println("Login inválido.");
        }
    }
}
