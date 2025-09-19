public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;

    // Default constructor
    public BuddyInfo() {
        this("Eyong", "Sammy", "343-558-2067");
    }

    // Constructor with parameters
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Main method
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer", "742 Evergreen Terrace", "123-456-7890");
        System.out.println("Hello " + buddy.getName());
    }

}
