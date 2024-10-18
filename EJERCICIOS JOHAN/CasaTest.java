public class CasaTest {
    public static void main(String[] argumentos) {
        // Crear un objeto de tipo Casa e inicializar sus atributos
        Casa miCasa = new Casa(4, 2, 6, 2, "Blanco", 1, true, true, false);

        // Imprimir los atributos de la casa
        System.out.println("Número de Habitaciones: " + miCasa.getNumHabitaciones());
        System.out.println("Cantidad de Puertas: " + miCasa.getCantPuertas());
        System.out.println("Cantidad de Ventanas: " + miCasa.cantVentanas);
        System.out.println("Cantidad de Baños: " + miCasa.cantBaños);
        System.out.println("Color: " + miCasa.color);
        System.out.println("Cantidad de Plantas: " + miCasa.cantPlantas);

        // Imprimir los valores booleanos
        System.out.println("Tiene Línea Fija: " + miCasa.isTieneLineaFija());
        System.out.println("Tiene TV Cable: " + miCasa.isTieneTvCable());
        System.out.println("Tiene Agua Corriente: " + miCasa.isTieneAguaCorriente());
    }
}
