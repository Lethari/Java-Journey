import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pet implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String id;
    private String name;
    private String breed;
    private int age;
    private String owner;
    private String contact;
    private final LocalDateTime registrationDate;
    private final List<Appointment> appointments;

    // Constructor
    public Pet(String id, String name, String breed, int age, String owner, String contact) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.owner = owner;
        this.contact = contact;
        this.registrationDate = LocalDateTime.now();
        this.appointments = new ArrayList<>();
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getBreed() { return breed; }
    public int getAge() { return age; }
    public String getOwner() { return owner; }
    public String getContact() { return contact; }
    public LocalDateTime getRegistrationDate() { return registrationDate; }
    public List<Appointment> getAppointments() { return appointments; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setBreed(String breed) { this.breed = breed; }
    public void setAge(int age) { this.age = age; }
    public void setOwner(String owner) { this.owner = owner; }
    public void setContact(String contact) { this.contact = contact; }

    // Add appointment
    public void addAppointment(Appointment appointment) {
        this.appointments.add(appointment);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", owner='" + owner + '\'' +
                ", contact='" + contact + '\'' +
                ", registrationDate=" + registrationDate +
                ", appointments=" + appointments +
                '}';
    }
}
