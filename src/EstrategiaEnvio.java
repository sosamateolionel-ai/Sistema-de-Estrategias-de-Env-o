public abstract class EstrategiaEnvio {

    protected String nombre;
    protected double tarifaBase;

    public EstrategiaEnvio(String nombre, double tarifaBase) {
        this.nombre = nombre;
        this.tarifaBase = tarifaBase;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    // Punto de entrada: valida siempre y luego delega en la fórmula de cada hija.
    // Devuelve -1 si los datos son inválidos.
    public double calcularCosto(double pesoKg, double distanciaKm) {

        if (pesoKg < 0) {
            System.out.println("[" + nombre + "] Error: el peso no puede ser negativo (" + pesoKg + " kg).");
            return -1;
        }

        if (distanciaKm < 0) {
            System.out.println("[" + nombre + "] Error: la distancia no puede ser negativa (" + distanciaKm + " km).");
            return -1;
        }

        return calcular(pesoKg, distanciaKm);
    }

    // Cada modalidad define su propia fórmula
    protected abstract double calcular(double pesoKg, double distanciaKm);
}