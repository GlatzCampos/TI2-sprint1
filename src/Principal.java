public class Principal {
    public static void main(String[] args) {
        
        DAO dao = new DAO();

        //Inserção de elemento da tabela
        Usuario usuario = new Usuario(1, "João", "joao@gmail.com", "123");
        if(dao.inserirUsuario(usuario) == true){
            System.out.println("Inserção com sucesso -> " + usuario.toString());
        }

        //Mostrar usuário
        System.out.println("==== Mostrar Usuários ====");
        Usuario[] usuarios = dao.getUsuarios();
        for(int i = 0; i < usuarios.length; i++){
            System.out.println(usuarios[i].toString());
        }

        //Atualizar usuários
        usuario.setSenha("novaSenha");
        dao.atualizarUsuario(usuario);

        //Mostrar usuário
        System.out.println("==== Mostrar Usuários ====");
        usuarios = dao.getUsuarios();
        for(int i = 0; i < usuarios.length; i++){
            System.out.println(usuarios[i].toString());
        }

        dao.close();
    }
}
