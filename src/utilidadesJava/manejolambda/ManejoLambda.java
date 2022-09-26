package utilidadesJava.manejolambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import utilidadesJava.manejolambda.objetos.Persona;

public class ManejoLambda {

	public static void main(String[] args) {
		 
		List<Long> idsEntidades = new ArrayList<>();
		List<String> nombresPersonas = new ArrayList<>();
		List<Persona> personas = construirPersonas();
		
		//Filtrar una lista y obtener una nueva lista
		List<Long> idsEntidadesMayores2 = idsEntidades.stream().filter(idEntidad -> idEntidad > 2).collect(Collectors.toList());
		
		//Crear un mapa con llave el id del objeto y como valor el objeto encontrado
		Map<Long, Persona> mapaPersonas = personas.stream().collect(Collectors.toMap(Persona::getIdPersona, persona -> persona));
		
		
		
		for (Entry<Long, Persona> valorMapa : mapaPersonas.entrySet()) {
			
			System.out.println(valorMapa.getKey());
			
			System.out.println(valorMapa.getValue().getNombrePersona());
		}
		
	}
	
	private static List<Persona> construirPersonas() {
		
		List<Persona> personas = new ArrayList<>();
		Persona persona1 = new Persona(1L, "Dizzi", 2L, "312202");
		Persona persona2 = new Persona(2L, "Andres", 2L, "312202");
		
		personas.add(persona1);
		personas.add(persona2);

		return personas;
	}
}
