public class pruebaExepcion {

	public static void main(String[] args) {
		try {
			throw new SegExepcion("Segunda Exepcion ");
		} catch (PrimExepcion e) {
		}

		try {
			throw new TerExepcion("Tercer Exepcion ");
		} catch (PrimExepcion e) {
		}
	}

}