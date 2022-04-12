import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class TesteOptional {

	public static void main(String[] args) {
		Optional<String> listaString = Optional.of("Valor presente");

		System.out.println("Valor Optional que esta presente");
		listaString.ifPresentOrElse(System.out::println, () -> System.out.println("Não etá presente")); 
		
		Optional<String> listaNula = Optional.ofNullable(null);
		System.out.println("Valor Optional não esta presente");
		listaNula.ifPresentOrElse(System.out::println, () -> System.out.println("Null = não etá presente"));
		
		Optional<String> listaVazia = Optional.empty();
		System.out.println("Valor Optional não esta presente");
		listaVazia.ifPresentOrElse(System.out::println, () -> System.out.println("Empty = não etá presente"));
		
	/*	Optional<String> listaErro = Optional.of(null);
		System.out.println("Valor Optional lança um erro NullPointerException");
		listaErro.ifPresentOrElse(System.out::println, () -> System.out.println("Erro = não etá presente"));
		*/
		
		System.out.println("Valores inteiros");
		OptionalInt.of(22).ifPresent(System.out::println);
		
		System.out.println("Valores decimais");
		OptionalDouble.of(22.75).ifPresent(System.out::println);
		
		System.out.println("Valores longos");
		OptionalDouble.of(23L).ifPresent(System.out::println);
		
		
	}

}
