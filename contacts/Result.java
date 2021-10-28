package contacts;

import java.util.*;

public class Result {

	public static List<Integer> contacts(List<List<String>> queries) {

		List<Integer> resultados = new ArrayList<>();
		List<String> nomes = new ArrayList<>();
		List<String> buscas = new ArrayList<>();
		
		for(int i = 0; i < queries.size(); i++) {
			if(queries.get(i).get(0).startsWith("add")) {
				nomes.add(queries.get(i).get(0).replace("add ", ""));
			}
			if(queries.get(i).get(0).startsWith("find")) {
				buscas.add(queries.get(i).get(0).replace("find ", ""));
			}
		}
		
		for(int j = 0; j < buscas.size(); j++) {
			int qtd = 0;
			for(int k = 0; k < nomes.size(); k++) {
				if(nomes.get(k).contains(buscas.get(j)))
					qtd++;
			}
			resultados.add(qtd);
		}
		
		return resultados;
    }

}
