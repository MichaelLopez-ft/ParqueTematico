public class Main {
    public static void main(String[] args) {
        MontañaRusa montañaRusa = new MontañaRusa("Montaña Rusa Veloz", 20, 5, "Alta");
        Noria noria = new Noria("Noria Gigante", 30, 10, 50);
        AutitosChocadores autitosChocadores = new AutitosChocadores("Autitos Chocadores Divertidos", 10, 15, 8);

        montañaRusa.iniciar();
        montañaRusa.detener();
        montañaRusa.realizarMantenimiento();
        System.out.println("¿Necesita mantenimiento? " + montañaRusa.estadoMantenimiento());
        montañaRusa.aumentarIntensidad();

        noria.iniciar();
        noria.detener();
        noria.realizarMantenimiento();
        System.out.println("¿Necesita mantenimiento? " + noria.estadoMantenimiento());

        autitosChocadores.iniciar();
        autitosChocadores.iniciar(5); // Iniciar con un número específico de autitos
        autitosChocadores.detener();
        autitosChocadores.realizarMantenimiento();
        System.out.println("¿Necesita mantenimiento? " + autitosChocadores.estadoMantenimiento());
    }
}

