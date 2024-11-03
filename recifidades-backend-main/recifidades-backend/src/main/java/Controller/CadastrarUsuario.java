package Controller;
/// Apesar do nome, é necessario adicionar toda a logica que envolve o usuario aqui
///Os dados estão sendo armazenados em uma ArrayList de usuarios
import model.Turista;
import model.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

 public class CadastrarUsuario extends Usuario {

     Scanner sc = new Scanner(System.in);

    Usuario usuario = new Usuario();
    ///instancia da Arraylist
    ArrayList<Usuario>usuarios = new ArrayList<>();

    ///Somente os dados julgados necessarios para realizar o cadastro
    /// Novos usuarios ja vem com um valor de capibas e pontos de 0
    public void cadastrarUsuario(){

        String nome, email, senha , cpf;


    System.out.println("Digite seu nome completo: ");
    nome = sc.nextLine();
    usuario.setNomeUsuario(nome);

    System.out.println("Digite seu email: ");
    email = sc.nextLine();

        ///filtros devem ser adicionados sempre que necessario
        do{

            if(!email.endsWith(".com")){
                System.out.println("invalido, use um email valido!");
                System.out.println("Digite seu email novamente: ");
                email =sc.next();
            }
        }while(!email.endsWith(".com"));
    usuario.setEmailUsuario(email);

    System.out.println("Escolha uma senha de sua preferencia: ");
    senha = sc.nextLine();
    usuario.setSenhaUsuario(senha);

    System.out.println("Digite seu cpf: ");
    cpf = sc.nextLine();
    usuario.setCpf(cpf);
    
        int capiba = 0;
        usuario.setSaldoMoedasCapibas(capiba);
        int pontos = 0;
        usuario.setPontosAcumulados(pontos);

        System.out.println("Cadastrado com sucesso!");
        usuarios.add(usuario);

    }
    ///Listar todos os Usuarios cadastrados, ainda sem destinção de Empresa/turista.
    /// caso fiqye muito complexo, é aconselhavel simplificar o sistema
    public void ListarUsuarios(){
        System.out.println(Arrays.toString(usuarios.toArray()));
        if(usuarios.isEmpty()){
            System.out.println("Nenhum usuario encontrado!");
        }
    }






}
