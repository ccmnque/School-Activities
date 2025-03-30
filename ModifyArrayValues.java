import javax.swing.JOptionPane;

public class ModifyArrayValues {
    public static void main(String[] args) {
    
        String[] pets = {"Spots", "Pawi", "Bluey", "Sugar", "Salt", "Piwi"};
        String searchPet = JOptionPane.showInputDialog(null, "Enter pet name to search:");

        boolean found = false;
        for (int i = 0; i < pets.length; i++) {
            if (pets[i].equalsIgnoreCase(searchPet)) {
                String newPetName = JOptionPane.showInputDialog(null, "Enter new pet name:");
                pets[i] = newPetName;
                found = true;
                break;
            }
        }

        if (found) {
            JOptionPane.showMessageDialog(null, "Pet name successfully changed!");
            JOptionPane.showMessageDialog(null, "Updated pets list: " + String.join(", ", pets));
        } else {
            JOptionPane.showMessageDialog(null, "Pet not found.");
        }
    }
}
