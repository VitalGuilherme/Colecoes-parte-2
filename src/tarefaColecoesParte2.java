import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author VitalGuilherme
 */
public class tarefaColecoesParte2 {


    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        List<String> Nomes = new ArrayList<>();
        List<String> Homens = new ArrayList<>();
        List<String> Mulheres = new ArrayList<>();

        System.out.println("Digite os nomes na lista de convidados separados entre Homens e Mulheres(Ou digite 'fim' para encerrae):");
        while (true) {
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }
            String[] partes = entrada.split("-");
            if (partes.length != 2) {
            System.out.println("Formato inválido. Use o formato 'nome-gênero'.");
            continue;
            }
            String nome = partes[0].trim();
            String genero = partes[1].trim();

            Nomes.add(nome + "-" + genero);
            if (genero.equalsIgnoreCase("Homem")) {
                Homens.add(nome);
            }else if (genero.equalsIgnoreCase("Mulher")) {
                Mulheres.add(nome);
            }
        }
        System.out.println("\nListas de nomes:");
        for (String nome : Nomes) {
            System.out.println(nome);
        }
        System.out.println("\nLista de Homens:");
        for (String homem : Homens) {
            System.out.println(homem);
        }
        System.out.println("\nLista de Mulheres:");
        for (String mulher : Mulheres) {
            System.out.println(mulher);
        }
    }
}


