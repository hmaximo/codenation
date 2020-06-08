package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List<Integer> seqFibonacci = new ArrayList<Integer>();
		
		//Adiciona os primeiros números da sequência:
		seqFibonacci.add(0,0); 
		seqFibonacci.add(1,1);
		
		int i = 1; //Variável de controle dos índices dos itens da lista

		//Laço de composição da sequência com controle de limite (valores até 350)
		while (seqFibonacci.get(i) <= 350) { 
			seqFibonacci.add((i+1),(seqFibonacci.get(i)+seqFibonacci.get(i-1)));
			i++;
		}
		return seqFibonacci;
	}

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}

}