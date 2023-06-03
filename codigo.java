/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.atividade;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Main {
    
    public static void sair(){
        System.exit(0);
    }
    
    public static void gerenciarAlunosSubMenu(){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("|--------------------------------------------------------------------------|");
        System.out.println("|------------------------     Gerenciar Alunos       ----------------------|");
        System.out.println("|--------------------------------------------------------------------------|");
        System.out.println("| [1] - Adicionar aluno [2] - Editar Aluno [3]- Remover Aluno [4] - Voltar |");
        System.out.println("|--------------------------------------------------------------------------|");
    
        int opcao = teclado.nextInt();
        
        switch(opcao){
            case 1:
                main(null);
                break;
            
            case 2:
                main(null);
                break;
            
            case 3:
                sair();
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
