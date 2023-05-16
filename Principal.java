public class Principal {
    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        usuario.setNome("Felipe Siqueira Camargo");
        usuario.setIdade(17);
        usuario.setUsername("Felps");
        usuario.setSenha("manoFelps");

        System.out.println("O nome é: " + usuario.getNome());
        System.out.println("A idade é: " + usuario.getIdade());
        System.out.println("O susername é: " + usuario.getUsername());
        usuario.setSenha("Etec123");

        if(usuario.verificaSenha("Etec2023")){

            System.out.println("senha Valida");
        }else{
            System.out.println("senha Invalida");
        }
    }
}
