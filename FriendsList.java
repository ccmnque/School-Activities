import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class FriendsList {

    public static void main(String[] args) {

        try {
            File file = new File("phonebook.txt");

            // file doesn't exist
            if (file.createNewFile()) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
        String fileName = "phonebook.txt";
        ArrayList<Contact> contacts = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(" ");
                Contact contact = new Contact(data[0], data[1], data[2], Integer.parseInt(data[3]), data[4], data[5]);
                contacts.add(contact);
            }

            // Task 2
            System.out.println("Contacts whose age is greater than or equal to 18:");
            for (Contact contact : contacts) {
                if (contact.getAge() >= 18) {
                    System.out.println(contact);
                }
            }

            // Task 3
            System.out.println("\nContacts whose remark is 'Friend':");
            for (Contact contact : contacts) {
                if (contact.getRemarks().equals("Friend")) {
                    System.out.println(contact.getName() + " " + contact.getGender() + " " + contact.getAge());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

class Contact {

    private String name;
    private String birthday;
    private String gender;
    private int age;
    private String contactNumber;
    private String remarks;

    public Contact(String name, String birthday, String gender, int age, String contactNumber, String remarks) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.age = age;
        this.contactNumber = contactNumber;
        this.remarks = remarks;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getRemarks() {
        return remarks;
    }

    @Override
    public String toString() {
        return name + " " + birthday + " " + gender + " " + age + " " + contactNumber + " " + remarks;
    }
}