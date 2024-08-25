package patrones.problema2;

import java.util.ArrayList;
import java.util.List;

class Usuario {
    private List<Dispositivo> dispositivos = new ArrayList<>();
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void añadirDispositivo(Dispositivo dispositivo) {
        dispositivos.add(dispositivo);
    }

    public void eliminarDispositivo(Dispositivo dispositivo) {
        dispositivos.remove(dispositivo);
    }

    public void notificarDispositivos(String mensaje) {
        for (Dispositivo dispositivo : dispositivos) {
            dispositivo.actualizar(mensaje);
        }
    }

    public void recibirMensaje(String mensaje) {
        System.out.println(nombre + " ha recibido un nuevo mensaje: " + mensaje);
        notificarDispositivos(mensaje);
    }
}
