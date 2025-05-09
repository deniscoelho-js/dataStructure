package strings_uri;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CultivandoStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int tam = scanner.nextInt();
            if (tam == 0) break;

            Set<String> seq = new HashSet<>();
            String anterior = "", atual;

            for (int i = 0; i < tam; i++) {
                atual = scanner.next();

                if (!anterior.isEmpty() && anterior.contains(atual)) {
                    seq.add(anterior);
                    seq.add(atual);
                }

                anterior = atual;
            }

            System.out.println(seq.size());
        }

        scanner.close();
    }
}
