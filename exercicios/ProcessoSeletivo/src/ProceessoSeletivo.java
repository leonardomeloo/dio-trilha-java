import java.util.concurrent.ThreadLocalRandom;

public class ProceessoSeletivo {
    public static void main(String[] args) {
       System.out.println("Processo Seletivo");
    //    selecaoCandidatos();
        imprimirSelecionados();
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCIA","JULIA","DIEGO","AUGUSTO"};
        System.out.println("Imprimindo lista informando o indice");
        for(int i=0; i < candidatos.length; i++){
            System.out.println("O candidato de nº" + (i+1) + " é o candidato " + candidatos[i]);
        }
        System.out.println("Forma abreviada for each");
        for(String candidato:candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA","JULIA","DIEGO","AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        int candidatosSelecionados = 0;
        int indexCandidato = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && indexCandidato < candidatos.length){
            String candidato = candidatos[indexCandidato];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidado " + candidato + " solicitou o valor de salário: " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            indexCandidato++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");}
        else if(salarioBase==salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }


    }
}
