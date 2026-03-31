import java.util.Scanner;
public class GestaoSubmarino{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nInsira o valor do repasse em bilhão: ");
        double repasse = scanner.nextDouble();

        if(repasse < 0.5){
            System.out.println( "\nALERTA: Risco de paralisação total. Data estimada: 2045");
        }else if( 0.5 < repasse && repasse < 1.0){
            System.out.println("\nRitmo lento: Finalização prevista para 2037");
        } else {
            System.out.println("\nProjeto acelerado: Possibilidade de antecipação da entrega");
        }
        
        scanner.nextLine();
        System.out.println("\nInsira o nivel de acesso: ");
        String lvAcesso = scanner.nextLine();

        System.out.println("\nInsira o pais: ");
        String pais = scanner.nextLine();

        if(lvAcesso.equalsIgnoreCase("total") && pais.equalsIgnoreCase("brasil")){
            System.out.println( "\nAcesso autorizado ao Almirantado");
            System.out.println("\nInsira a temperatura do reator: ");
            double temperatura = scanner.nextDouble();
            if(temperatura < 280){
                System.out.println( "\nAumentar potência do reator");
            }else if( 280 <= temperatura && temperatura <= 350){
                System.out.println( "\nOperação Normal - Cruzeiro");
            } else {
                System.out.println("\nEMERGÊNCIA: Acionar sistema de resfriamento e emergência");
            }

        }else{
            System.out.println("\nSoberania Nacional preservada. Dados criptografados");
        }
        scanner.close();
    }
}