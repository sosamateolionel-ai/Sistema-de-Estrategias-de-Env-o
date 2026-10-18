import java.util.ArrayList;
import java.util.List;

void main() {

    List<EstrategiaEnvio> estrategias = new ArrayList<>();
    estrategias.add(new EnvioEstandar(1000.0));
    estrategias.add(new EnvioExpresoAereo(3000.0));
    estrategias.add(new EnvioMaritimo(5000.0));

    double peso = 20.0;
    double distancia = 1000.0;

    System.out.println("=== Paquete de " + peso + " kg a " + distancia + " km ===");
    for (EstrategiaEnvio e : estrategias) {
        double costo = e.calcularCosto(peso, distancia);
        System.out.printf("%-20s: $%,.2f%n", e.getNombre(), costo);
    }

    double pesoPesado = 2000.0;

    System.out.println("\n=== Carga pesada de " + pesoPesado + " kg a " + distancia + " km ===");
    for (EstrategiaEnvio e : estrategias) {
        double costo = e.calcularCosto(pesoPesado, distancia);
        System.out.printf("%-20s: $%,.2f%n", e.getNombre(), costo);
    }

    System.out.println("\n=== Datos inválidos ===");
    for (EstrategiaEnvio e : estrategias) {
        e.calcularCosto(-5.0, 300.0);   // peso negativo
    }
    estrategias.get(0).calcularCosto(10.0, -50.0); // distancia negativa

}
