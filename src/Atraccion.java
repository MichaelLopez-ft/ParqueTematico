abstract class Atraccion {
    private String nombre;
    private int capacidadMaxima;
    private int duracion; // duración en minutos

    public Atraccion(String nombre, int capacidadMaxima, int duracion) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public abstract void iniciar();

    public void detener() {
        System.out.println("La atracción se ha detenido");
    }
}
