package patrones.problema2;

class DispositivoMovil implements Dispositivo {
    private String tipo;

    public DispositivoMovil(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Dispositivo " + tipo + " mostrando el mensaje: " + mensaje);
    }
}
