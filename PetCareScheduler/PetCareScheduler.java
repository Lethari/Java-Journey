import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

public class PetCareScheduler {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<String, Pet> pets = new HashMap<>();
    private static List<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        loadPetsFromFile();
        boolean running = true;

        while (running) {
            System.out.println("\n=== PetCare Scheduler ===");
            System.out.println("1. Register Pets");
            System.out.println("2. Schedule Appointments");
            System.out.println("3. Store Data");
            System.out.println("4. Display Records");
            System.out.println("5. Generate Reports");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    registerPet();
                    break;
                case "2":
                    scheduleAppointment();
                    break;
                case "3":
                    storeData();
                    break;
                case "4":
                    displayRecords();
                    break;
                case "5":
                    generateReports();
                    break;
                case "6":
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1-6.");
            }
        }
    }

    // Register a new pet
    private static void registerPet() {
        System.out.print("Enter Pet ID: ");
        String id = scanner.nextLine();
        if (pets.containsKey(id)) {
            System.out.println("Pet ID already exists.");
            return;
        }

        System.out.print("Enter Pet Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Breed: ");
        String breed = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Owner Name: ");
        String owner = scanner.nextLine();
        System.out.print("Enter Contact Info: ");
        String contact = scanner.nextLine();

        Pet pet = new Pet(id, name, breed, age, owner, contact);
        pets.put(id, pet);
        System.out.println("Pet registered successfully!");
    }

    // Schedule appointment with validations
    private static void scheduleAppointment() {
        System.out.print("Enter Pet ID: ");
        String id = scanner.nextLine();
        Pet pet = pets.get(id);

        if (pet == null) {
            System.out.println("Pet not found.");
            return;
        }

        System.out.print("Enter Appointment Type (Vet Visit, Vaccination, Grooming): ");
        String type = scanner.nextLine();
        if (!(type.equalsIgnoreCase("Vet Visit") ||
              type.equalsIgnoreCase("Vaccination") ||
              type.equalsIgnoreCase("Grooming"))) {
            System.out.println("Invalid appointment type.");
            return;
        }

        System.out.print("Enter Appointment Date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Enter Appointment Time (HH:MM): ");
        String time = scanner.nextLine();

        LocalDateTime dateTime;
        try {
            dateTime = LocalDateTime.parse(date + "T" + time + ":00");
        } catch (Exception e) {
            System.out.println("Invalid date/time format.");
            return;
        }

        if (dateTime.isBefore(LocalDateTime.now())) {
            System.out.println("Appointment must be set in the future.");
            return;
        }

        System.out.print("Enter Notes (optional): ");
        String notes = scanner.nextLine();

        Appointment appointment = new Appointment(type, dateTime, notes);
        pet.addAppointment(appointment);
        appointments.add(appointment);

        System.out.println("Appointment scheduled successfully!");
    }

    // Store pets and appointments to file
    private static void storeData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pets.dat"))) {
            oos.writeObject(pets);
            System.out.println("Data stored successfully.");
        } catch (IOException e) {
            System.out.println("Error storing data: " + e.getMessage());
        }
    }

    // Load pets from file
    private static void loadPetsFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pets.dat"))) {
            pets = (HashMap<String, Pet>) ois.readObject();
            System.out.println("Pets loaded successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("No existing pet data found.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading pets: " + e.getMessage());
        }
    }

    // Display records
    private static void displayRecords() {
        System.out.println("\n--- All Registered Pets ---");
        for (Pet pet : pets.values()) {
            System.out.println(pet);
        }

        System.out.print("\nEnter Pet ID to view appointments: ");
        String id = scanner.nextLine();
        Pet pet = pets.get(id);
        if (pet != null) {
            System.out.println("Appointments for " + pet.getName() + ":");
            for (Appointment a : pet.getAppointments()) {
                System.out.println(a);
            }
        }

        System.out.println("\n--- Upcoming Appointments ---");
        for (Appointment a : appointments) {
            if (a.getDateTime().isAfter(LocalDateTime.now())) {
                System.out.println(a);
            }
        }

        System.out.println("\n--- Past Appointment History ---");
        for (Appointment a : appointments) {
            if (a.getDateTime().isBefore(LocalDateTime.now())) {
                System.out.println(a);
            }
        }
    }

    // Generate reports
    private static void generateReports() {
        System.out.println("\n--- Report ---");

        // Pets with upcoming appointments in next week
        System.out.println("Pets with upcoming appointments in next week:");
        for (Pet pet : pets.values()) {
            for (Appointment a : pet.getAppointments()) {
                if (a.getDateTime().isAfter(LocalDateTime.now()) &&
                    a.getDateTime().isBefore(LocalDateTime.now().plusWeeks(1))) {
                    System.out.println(pet.getName() + " -> " + a);
                }
            }
        }

        // Pets overdue for vet visit (no vet visit in last 6 months)
        System.out.println("\nPets overdue for vet visit:");
        for (Pet pet : pets.values()) {
            boolean overdue = true;
            for (Appointment a : pet.getAppointments()) {
                if (a.getType().equalsIgnoreCase("Vet Visit") &&
                    a.getDateTime().isAfter(LocalDateTime.now().minusMonths(6))) {
                    overdue = false;
                    break;
                }
            }
            if (overdue) {
                System.out.println(pet.getName() + " has no vet visit in last 6 months.");
            }
        }
    }
}
