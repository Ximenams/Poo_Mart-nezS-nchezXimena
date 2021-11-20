import java.text.BreakIterator;

class palindromo {
	public static void main(String[] args) {
		String[] cadenas = { "La ruta natural", "Esto no es", "Parzibyte", "Hola", "Sol", "Ana", "Oro", "Oso",
				"A ti no, bonita",
				"Adivina ya te opina, ya ni miles origina, ya ni cetro me domina, ya ni monarcas, a repaso ni mulato carreta, acaso nicotina, ya ni cita vecino, anima cocina, pedazo gallina, cedazo terso nos retoza de canilla goza, de pánico camina, ónice vaticina, ya ni tocino saca, a terracota luminosa pera, sacra nómina y ánimo de mortecina, ya ni giros elimina, ya ni poeta, ya ni vida",
				"A mamá, Roma le aviva el amor a papá y a papá, Roma le aviva el amor a Mama", "Me gusta programar en Java" };
		for (String cadena : cadenas) {
			System.out.println("¿" + cadena + " es palíndromo? " + (cadena));
		}
	}
}

