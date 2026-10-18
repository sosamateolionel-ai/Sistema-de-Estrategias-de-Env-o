public class EnvioExpresoAereo extends EstrategiaEnvio {

    private static final double COSTO_POR_KG = 400.0;
    private static final double COSTO_POR_KM = 8.0;
    private static final double RECARGO_URGENCIA = 0.25; // 25% sobre el total

    public EnvioExpresoAereo(double tarifaBase) {
        super("Expreso aéreo", tarifaBase);
    }

    @Override
    protected double calcular(double pesoKg, double distanciaKm) {
        double subtotal = tarifaBase + (pesoKg * COSTO_POR_KG) + (distanciaKm * COSTO_POR_KM);
        return subtotal * (1 + RECARGO_URGENCIA);
    }
}