package cadastrohospitalar;

import java.util.Scanner; // Método
import javax.swing.JOptionPane; //Método 

public class Hospital_C {

    public static void main(String[] args) { // SuperClasse 
      Scanner tc = new Scanner(System.in);
    int opcao;
        JOptionPane.showMessageDialog(null,"Bem vindo ao Hospital BCC");
        System.out.print("\nSelecione o Tipo de Consulta : <1> para Pronto Socorro  <2> para Ambulatorio <0> para sair: ");
       opcao = tc.nextInt();
    if(opcao == 2) {
        Ambulatorio ab = new Ambulatorio();
        System.out.println("\n Bem vindo ao Ambulatorio BCC  ");
        System.out.print("Digite seu Nome : ");
        ab.nome = tc.next();
        System.out.print("Digite seu sobrenome: ");
        ab.sobrenome = tc.next();
        System.out.print("Digite seu CPF : ");
        ab.cpf = tc.nextDouble();
        System.out.print("Digite seu Cartão do SUS : ");
        ab.sus = tc.nextDouble();
        System.out.print("Digite sua Data de Nascimento : ");
        ab.dataNascimento =tc.next();
        System.out.print("Digite sua idade : ");
        ab.idade =tc.nextInt();
        if (ab.idade <= 17){
          JOptionPane.showMessageDialog(null,"Atendimento no Ambulatorio Pediatra ! ! ");      
      }   
        else{ 
          JOptionPane.showMessageDialog(null,"Atendimento no Ambulatorio Médico Clinico geral ! ! ! ");   
      }
        JOptionPane.showMessageDialog(null,"Senha é " + ab.senhas);
        ab.senhas =tc.nextInt();   
    }
    if(opcao ==1){
         ProntoSocorro ps = new ProntoSocorro();
        System.out.println("\n Bem vindo ao ProntoSocorro BCC  ");
        System.out.print("Digite seu Nome : ");
        ps.nome = tc.next();
        System.out.print("Digite seu sobrenome: ");
        ps.sobrenome = tc.next();
        System.out.print("Digite seu CPF : ");
        ps.cpf = tc.nextDouble();
        System.out.print("Digite seu Cartão do SUS : ");
        ps.sus = tc.nextDouble();
        System.out.print("Digite sua Data de Nasciumento : ");
        ps.dataNascimento =tc.next();
        System.out.print("Digite sua idade : ");
        ps.idade =tc.nextInt();    
        if (ps.idade <= 17){
          JOptionPane.showMessageDialog(null,"Atendimento no Ambulatorio Pediatra ! ! ");      
      }
      else{ 
          JOptionPane.showMessageDialog(null,"Atendimento no Ambulatorio Médico Clinico geral ! ! ! ");
          
      }
         JOptionPane.showMessageDialog(null,"Sua senha é "+ ps.senhas);
         ps.senhas = tc.nextInt();
    }
}
    }