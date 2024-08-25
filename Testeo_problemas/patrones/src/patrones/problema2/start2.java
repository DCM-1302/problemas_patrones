package patrones.problema2;

public class start2 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Juan");

        Dispositivo movil1 = new DispositivoMovil("Móvil 1");
        Dispositivo movil2 = new DispositivoMovil("Móvil 2");
        Dispositivo tablet = new DispositivoMovil("Tablet");

        usuario.añadirDispositivo(movil1);
        usuario.añadirDispositivo(movil2);
        usuario.añadirDispositivo(tablet);

        usuario.recibirMensaje("¡Hola! ¿Cómo estás?");

        usuario.eliminarDispositivo(movil2);

        usuario.recibirMensaje("Nos vemos mañana.");
    }
}
