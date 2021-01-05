package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
public static void main(String[] args) {
	
	Map<Integer, String> usuarios = new HashMap<Integer, String>();
	
//put: adiciona e subtitui	
	usuarios.put(1, "Roberto");
	usuarios.put(2, "Ricardo");
	usuarios.put(3, "Rafaela");
	usuarios.put(4, "Rebeca");
// não necessariamente é ordenado
	
	System.out.println(usuarios);
	System.out.println(usuarios.size());
	System.out.println(usuarios.isEmpty());
	
	System.out.println(usuarios.keySet());
	System.out.println(usuarios.values()); 
	System.out.println(usuarios.entrySet()); // chave e valor
	
	System.out.println(usuarios.containsKey(2));
	System.out.println(usuarios.containsValue("Rebeca"));
	
	System.out.println(usuarios.get(3)); // retorna o valor
	System.out.println(usuarios.remove(1));
	System.out.println(usuarios.remove(4, "Gui")); // retorna false
	
	
	for (int chave: usuarios.keySet()) {
		System.out.println(chave);
// percorrendo só a chave
	}
	for (String valor: usuarios.values()) {
		System.out.println(valor);
// percorrendo só o valor
	}
	for (Entry<Integer, String> registro: usuarios.entrySet()) {
		System.out.print(registro.getKey() + "--> ");
		System.out.println(registro.getValue());
		System.out.println(registro);
	}
	
	}
}
