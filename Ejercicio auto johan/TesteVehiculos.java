public class TesteVehiculos {
    public static void main(String[] args) {
        // Crear objetos de cada clase
        Vehiculo hilux = new Camioneta("Pedro", "Toyota", 2800, 2500.0f, 3000.0f, true);
        Vehiculo corolla = new Vehiculo("Ana", "Toyota", 2021, 4, 1800);
        Auto corsa = new Auto("Carlos", "Chevrolet", 1400, false, 5);

        // Imprimir los atributos de cada objeto
        System.out.println(hilux.toString());
        System.out.println(corolla.toString());
        System.out.println(corsa.toString());

        // Ejemplo de polimorfismo
        hilux.encenderMotor();
        corsa.encenderMotor();
    }
}
