package org.example;


import Controller.CadastrarUsuario;
import View.TelaInicial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int opcao;

        /// Instancia de View
            TelaInicial telaInicial = new TelaInicial();

        ///Instancia de Controller/Cadastrar Usuario
            CadastrarUsuario usuario = new CadastrarUsuario();






            ///Estrutura de repetição para manter as telas em atividade caso aperte algum botão por engano.
        do {
            telaInicial.Menu();

             opcao = sc.nextInt();

           switch (opcao){
               case 1: usuario.cadastrarUsuario();
               break;

               ///Adicionar o resto da logica


               case 7: usuario.ListarUsuarios();
               break;
               default: System.out.println("Comando invalido");
               break;



           }



       } while (opcao !=0);

    }
}