public class Computador {
    // Atributos (nivel de acceso por defecto - package-private)
    String descripcion;
    String sistemaOperativo;
    double capacidadMemoria;
    float tamañoDisco;
    int procesadorClock;
    static boolean estaHibernando;
    static boolean estaEnchufado;

    // Métodos
    public void encender() {
        System.out.println("Computador encendido.");
    }

    public void apagar() {
        System.out.println("Computador apagado.");
    }

    public void reiniciar() {
        System.out.println("Computador reiniciando.");
    }

    public void hibernar() {
        estaHibernando = true;
        System.out.println("Computador en hibernación.");
    }

    public static void main(String[] args) {
        // Crear un objeto de tipo Computador
        Computador compu = new Computador();

        // Asignar valores a los atributos
        compu.descripcion = "Computador Gamer";
        compu.sistemaOperativo = "Windows 11";
        compu.capacidadMemoria = 16.0;
        compu.tamañoDisco = 512.5f;
        compu.procesadorClock = 3200;

        // Imprimir los valores de los atributos
        System.out.println("Descripción: " + compu.descripcion);
        System.out.println("Sistema Operativo: " + compu.sistemaOperativo);
        System.out.println("Capacidad de Memoria: " + compu.capacidadMemoria + " GB");
        System.out.println("Tamaño de Disco: " + compu.tamañoDisco + " GB");
        System.out.println("Velocidad del Procesador: " + compu.procesadorClock + " MHz");

        // Llamar algunos métodos
        compu.encender();
        compu.hibernar();
    }
}
