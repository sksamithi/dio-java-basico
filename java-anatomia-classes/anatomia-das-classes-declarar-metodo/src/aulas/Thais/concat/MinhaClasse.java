package aulas.Thais.concat;
public class MinhaClasse {
    
    public static void main (String [] args){
        
        //Declaração de variáveis:
        String primeiroNome = "Thais";
        String segundoNome = "Macedo Vieira";
        //Faz-se uso do método nomeCompleto definido abaixo do método main:
        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        //Imprime no terminal o resultado da aplicação do método:
        System.out.println(nomeCompleto);

    }
    //Declaração de um novo método chamado de nomeCompleto
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        //Retorna a concatenação das strings (variáveis):
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
