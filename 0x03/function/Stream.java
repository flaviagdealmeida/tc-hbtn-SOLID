import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TesteStreams {

	public static void main(String[] args) {

		List<String> estudantes = new ArrayList<>();

		estudantes.add("Maria");
		estudantes.add("Jose");
		estudantes.add("Antonio");
		estudantes.add("Pedro");
		estudantes.add("Ruy");
		estudantes.add("Ana");

		// imprime todos os elmentos da coleção sem gerar uma nova coleção
		System.out.println("Lista de alunos: ");
		estudantes.stream().forEach(System.out::println);

		// contador
		System.out.println("Total de alunos: " + estudantes.stream().count());

		// maior nome
		System.out.println("Maior nome: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

		// menor nome
		System.out.println("Maior nome: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

		// retorna nomes que contem a letra R
		System.out.println("Nomes contendo R: " + estudantes.stream()
				.filter((estudante) -> estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

		// retorna somente os 3 primeiros elementos da colecao
		System.out.println("Os 3 primeiros: " + estudantes.stream().limit(3).collect(Collectors.toList()));

		// retorna uma nova colecão com os itens e seu tamanho
		System.out.println("Nova coleção com tamanho os nomes " + estudantes.stream()
				.map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
				.collect(Collectors.toList()));

		// retorna true se todos os elementos tiverem o conteudo
		System.out.println(
				"Possue letra q no nome? " + estudantes.stream().allMatch((elemento) -> elemento.contains("q")));

		// retorna true se pelo menos um elementos corresponder ao conteudo
		System.out.println(
				"Alguem possue letra a no nome? " + estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));

		// retorna true se pelo ninguem corresponder ao conteudo
		System.out.println(
				"Ninguem possue letra x no nome? " + estudantes.stream().noneMatch((elemento) -> elemento.contains("x")));

	}

}
