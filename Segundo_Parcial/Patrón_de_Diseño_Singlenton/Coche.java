class Coche {

    private Motor motor;

    public Coche() {
        motor = new Motor(); // El coche contiene el motor
    }

    public void arrancar() {
        motor.encender();
        System.out.println("El coche ha arrancado.");
    }
}
