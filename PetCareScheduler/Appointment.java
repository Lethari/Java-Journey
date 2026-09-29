import java.io.Serializable;
import java.time.LocalDateTime;

public class Appointment implements Serializable {
    private String type;
    private LocalDateTime dateTime;
    private String notes;

    // Constructor with notes
    public Appointment(String type, LocalDateTime dateTime, String notes) {
        this.type = type;
        this.dateTime = dateTime;
        this.notes = notes;
    }

    // Overloaded constructor (without notes)
    public Appointment(String type, LocalDateTime dateTime) {
        this(type, dateTime, ""); // default empty notes
    }

    // Getters
    public String getType() { return type; }
    public LocalDateTime getDateTime() { return dateTime; }
    public String getNotes() { return notes; }

    // Setters
    public void setType(String type) { this.type = type; }
    public void setDateTime(LocalDateTime dateTime) { this.dateTime = dateTime; }
    public void setNotes(String notes) { this.notes = notes; }

    // toString override
    @Override
    public String toString() {
        return "Appointment{" +
                "type='" + type + '\'' +
                ", dateTime=" + dateTime +
                (notes != null && !notes.isEmpty() ? ", notes='" + notes + '\'' : "") +
                '}';
    }
}