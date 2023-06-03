/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.atividade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Main {

    public static String[] alunos = new String[10];

    public static void adicionarAlunos(){

        Scanner teclado = new Scanner(System.in);

        boolean laco = true;
        int i = 0;

        while(laco == true){

            int continuar;

            System.out.println("Por favor insira o nome do aluno:");

            alunos[i] = teclado.next();

            i ++;
            
            if(i == 9){
                laco = false;
                gerenciarAlunosSubMenu();
            }
            
            System.out.println("Desejar adicionar um novo aluno? [1] - Sim | [2] - Não");

            continuar = teclado.nextInt();

            if(continuar == 2){
                laco = false;
                gerenciarAlunosSubMenu();
            }
        }

    }

    public static void exibirAlunos(){
        
        System.out.println("|--------------------------------------|");
        
         for(int i = 0; i < alunos.length; i ++){
             
             if(alunos[i] != null){
                 System.out.printf("|%d | %s \n", i, alunos[i]);
             }
            
        }
        
        System.out.println("|--------------------------------------|");

      
        gerenciarAlunosSubMenu();

    }
    
    public static void editarAlunos(){
        Scanner teclado = new Scanner(System.in);

        int codigo;
        String novoNome;
        
        System.out.println("|-------------------------------------------------|");
        
         for(int i = 0; i < alunos.length; i ++){
             
             if(alunos[i] != null){
                 System.out.printf("|%d | %s \n", i, alunos[i]);
             }
            
        }
        
        System.out.println("|-------------------------------------------------|");
        System.out.println("|Informe o codigo do usuario que deseja editar:   |");
        System.out.println("|-------------------------------------------------|");

        codigo = teclado.nextInt();
        
        novoNome = teclado.next();
        
        alunos[codigo] = novoNome;
        
        exibirAlunos();
    }

    public static void sair(){
        System.exit(0);
    }

    public static void gerenciarAlunosSubMenu(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("|---------------------------------------------------------------------------|");
        System.out.println("|------------------------     Gerenciar Alunos       -----------------------|");
        System.out.println("|---------------------------------------------------------------------------|");
        System.out.println("| [1] - Adicionar alunos [2] - Ver Alunos [3] - Editar Aluno [4]- Remover Aluno [5] - Voltar |");
        System.out.println("|---------------------------------------------------------------------------|");

        int opcao = teclado.nextInt();

        switch(opcao){
            case 1:
                adicionarAlunos();
                break;

            case 2:
                exibirAlunos();
                break;

            case 3:
                editarAlunos();
                break;

            case 4:
                menu();
                break;

            default:
                System.out.println("Por favor, insira uma opção válida");
                main(null);
            break;
        }
    }

    public static void menu(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("|-----------------------------------------------------------|");
        System.out.println("|---------------     Selecione uma opção       -------------|");
        System.out.println("|-----------------------------------------------------------|");
        System.out.println("| [1] - Gerenciar alunos [2] - Gerenciar Chamadas [3]- Sair |");
        System.out.println("|-----------------------------------------------------------|");

        int opcao = teclado.nextInt();

        switch(opcao){
            case 1:
                gerenciarAlunosSubMenu();
                break;

            case 2:
                gerenciarAlunosSubMenu();
                break;

            case 3:
                sair();
                break;

            default:
                System.out.println("Por favor, insira uma opção válida");
                main(null);
            break;
        }
    }

    public static void main(String args[]){  

        Scanner teclado = new Scanner(System.in);

        menu();

        System.exit(0);

    }
}
