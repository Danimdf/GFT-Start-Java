package one.digitalinnovation.collection.map;

import java.util.*;

public class ExercicioMap1 {
    public static void main(String[] args) {
        System.out.println("\nCrie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> populaçãoEstadosNE = new HashMap<>() {{
            put("ES", 4108508);
            put("SP", 46649132);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populaçãoEstadosNE);

        System.out.println("\nSubstitua a população do estado RN por : 3.534.165");
        populaçãoEstadosNE.put("RN", 3534165);
        System.out.println(populaçãoEstadosNE);

        System.out.println("\nConfira se o estado da Paraíba (PB) tucson está no dicionário, caso não, adicion: " +
                "PB - 4.039.277: ");
        populaçãoEstadosNE.put("PB", 4039277);
        System.out.println(populaçãoEstadosNE);

        System.out.println("\nExiba a população do estado ES: " + populaçãoEstadosNE.get("ES"));

        System.out.println("\nExiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> populaçãoEstadosNE2 = new LinkedHashMap<>() {{
            put("ES", 4108508);
            put("SP", 46649132);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(populaçãoEstadosNE2);

        System.out.println("\nExiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> populaçãoEstadosNE3 = new TreeMap<>(populaçãoEstadosNE);
        System.out.println(populaçãoEstadosNE3);

        Collection<Integer> populacao = populaçãoEstadosNE.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : populaçãoEstadosNE.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entry.getKey();
        }
        System.out.printf("\nExiba o estado com o menor população (%s) e seu respectivo valor (%d)",
                estadoMenorPopulacao, Collections.min(populacao));
        System.out.printf("\nExiba o estado com a maior população (%s) e seu respectivo valor (%d)",
                estadoMaiorPopulacao, Collections.max(populacao));

        int soma = 0;
        Iterator<Integer> iterator = populaçãoEstadosNE.values().iterator();
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("\nExiba a soma da população desses estados: " + soma);

        System.out.println("\nExiba a média da população deste dicionário de estados: " + (soma / populaçãoEstadosNE.size()));
        System.out.println("\nRemova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator1 = populaçãoEstadosNE.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() <= 4000000) iterator1.remove();
        }
        System.out.println(populaçãoEstadosNE);

        System.out.println("\nApague o dicionario de estados com suas respectivas populações estimadas: ");
        populaçãoEstadosNE.clear();
        System.out.println(populaçãoEstadosNE);

        System.out.println("\nConfira se a lista está vazia: " + populaçãoEstadosNE.isEmpty());
    }
}
