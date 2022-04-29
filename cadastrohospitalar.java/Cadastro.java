public class Cadastro {

    String nome;  // Atributos
    String sobrenome;// Atributos
    double cpf;// Atributos
    double sus;// Atributos
    int idade;// Atributos
    String dataNascimento;// Atributos
    double senhas;// Atributos
    
   
     void senhasPS(int valor){ // Metodos
           senhas = senhas ++;
     }
     void senhasAb(int valor){ // Metodos
         senhas = senhas ++;
          
    }
      Cadastro(){ // Construtor
          
          senhas = 1;
          idade=0;
      }
