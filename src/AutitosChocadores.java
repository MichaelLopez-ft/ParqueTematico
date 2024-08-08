class AutitosChocadores extends Atraccion implements Mantenimiento {
    private int numeroDeAutitos;

    public AutitosChocadores(String nombre, int capacidadMaxima, int duracion, int numeroDeAutitos) {
        super(nombre, capacidadMaxima, duracion);
        this.numeroDeAutitos = numeroDeAutitos;
    }

    public int getNumeroDeAutitos() {
        return numeroDeAutitos;
    }

    public void setNumeroDeAutitos(int numeroDeAutitos) {
        this.numeroDeAutitos = numeroDeAutitos;
    }

    @Override
    public void iniciar() {
        System.out.println("Los autitos chocadores están en marcha");
    }

    public void iniciar(int numeroDeAutitosEnFuncionamiento) {
        System.out.println("Los autitos chocadores están en marcha con " + numeroDeAutitosEnFuncionamiento + " autitos");
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento en los autitos chocadores");
    }

    @Override
    public boolean estadoMantenimiento() {
        // Suponemos que necesita mantenimiento cada vez que se consulta este método
        return true;
    }
}

