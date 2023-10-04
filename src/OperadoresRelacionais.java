public class OperadoresRelacionais {
    
    public static void main (String[] args){
        String nomeUm = "Rafaela";
        String nomeDois = new String("Rafaela");

        System.out.println(nomeUm.equals(nomeDois));
        
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);
        
        simNao = numero1 < numero2;

        System.out.println("numeroUm é menor que numeroDois? " + simNao);
   
        if (numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        if (numero1 == numero2){
            System.out.println("a nossa condição é verdadeira");
        }
    }   
}
