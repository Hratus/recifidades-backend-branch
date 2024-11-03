package View;

import Controller.CadastrarUsuario;

import java.util.Scanner;

public class TelaInicial {


    /// esse é o menu principal, devemos adicionar mais funções e abstrair mais. Optei por separar Usuario, Empresa e Morador, creio que assim
    /// vai ser mais simples de gerenciar. O login vai poder acessar as ArrayLists e fazer a validação.
    /// Pontos turisticos e atividades serão pre-estabelecidos por voces, sendo apenas possivel alterar no codigo fonte.
    public void Menu() {


        System.out.println("=========================================");
        System.out.println("       Bem-vindx ao ReciFeCidades    ");
        System.out.println("=========================================");
        System.out.println("Por favor, selecione uma das opções abaixo:");
        System.out.println("1 - Cadastrar Usuario");
        System.out.println("2 - Cadastrar Empresa");
        System.out.println("3 - Cadastrar Morador");
        System.out.println("4 - Login");
        System.out.println("5 - Listar Pontos Turisticos");
        System.out.println("6 - Listar atividades");
        System.out.println("7 - Listar Usuarios");
        System.out.println("0 - Sair");
        System.out.println("=========================================");
        System.out.print("Digite sua opção: ");




    }
}


