class MontañaRusa extends Atraccion implements Mantenimiento {
    private String intensidad;

    public MontañaRusa(String nombre, int capacidadMaxima, int duracion, String intensidad) {
        super(nombre, capacidadMaxima, duracion);
        this.intensidad = intensidad;
    }

    public String getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(String intensidad) {
        this.intensidad = intensidad;
    }

    @Override
    public void iniciar() {
        System.out.println("La montaña rusa está en marcha");
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento en la montaña rusa");
    }

    @Override
    public boolean estadoMantenimiento() {
        return true;
    }

    public void aumentarIntensidad() {
        System.out.println("La intensidad de la montaña rusa ha aumentado");
    }
}

