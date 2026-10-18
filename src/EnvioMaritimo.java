public class EnvioMaritimo extends EstrategiaEnvio {

    private static final double COSTO_POR_KG = 40.0;
    private static final double COSTO_POR_KM = 0.5;
    private static final double DESCUENTO_CARGA_PESADA = 0.15; // 15% si pesa más de 1000 kg
    private static final double PESO_CARGA_PESADA = 1000.0;

    public EnvioMaritimo(double tarifaBase) {
        super("Transporte marítimo", tarifaBase);
    }

    @Override
    protected double calcular(double pesoKg, double distanciaKm) {
        double subtotal = tarifaBase + (pesoKg * COSTO_POR_KG) + (distanciaKm * COSTO_POR_KM);

        if (pesoKg > PESO_CARGA_PESADA) {
            subtotal = subtotal * (1 - DESCUENTO_CARGA_PESADA);
        }

        return subtotal;
    }
}