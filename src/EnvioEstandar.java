public class EnvioEstandar extends EstrategiaEnvio {

    private static final double COSTO_POR_KG = 150.0;
    private static final double COSTO_POR_KM = 2.0;

    public EnvioEstandar(double tarifaBase) {
        super("Envío estándar", tarifaBase);
    }

    @Override
    protected double calcular(double pesoKg, double distanciaKm) {
        return tarifaBase + (pesoKg * COSTO_POR_KG) + (distanciaKm * COSTO_POR_KM);
    }
}