package p2;

public class Participante {
    int id;
    int dni;
    String name;
    String lastName;
    int age;
    int telNumber;
    int emergencyNumber;
    String bloodType;
    int circuit;

    public Participante(int id, int dni, String name, String lastName, int age,
                        int telNumber, int emergencyNumber, String bloodType, int circuit) {
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.telNumber = telNumber;
        this.emergencyNumber = emergencyNumber;
        this.bloodType = bloodType;
        this.circuit = circuit;
    }

    public int getCircuit() {
        return circuit;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getDni() {
        return dni;
    }

    public int getId() {
        return id;
    }

}
