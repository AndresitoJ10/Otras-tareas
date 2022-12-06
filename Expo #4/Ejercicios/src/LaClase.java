public class LaClase {
    private int n;

	public LaClase (int n) throws Exception {
		if (n < 0) {
			throw new Exception("El número debe ser mayor a 0");
		}
		
		this.n = n;
	}
}
