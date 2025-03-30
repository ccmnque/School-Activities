import javax.swing.JOptionPane;

public class ModifyAndRemoveArrayValues {
    public static void main(String[] args) {

        String[] pets = {"Spots", "Pawi", "Bluey", "Sugar", "Salt", "Piwi"};

        String searchPet = JOptionPane.showInputDialog(null, "Enter the name of the pet to modify:");
        int index = -1; // initialize index to -1 to indicate not found

        for (int i = 0; i < pets.length; i++) {
            if (pets[i].equalsIgnoreCase(searchPet)) {
                String newPetName = JOptionPane.showInputDialog(null, "Enter the new name for " + pets[i] + ":");
                pets[i] = newPetName;
                index = i; // set index to the found index
                break; // exit the loop after the first match
            }
        }

        if (index == -1) {
            JOptionPane.showMessageDialog(null, searchPet + " not found.");
        } else {
            // Ask the user to search for a pet to remove
            searchPet = JOptionPane.showInputDialog(null, "Enter the name of the pet to remove:");
            index = -1; // reset index to -1

            for (int i = 0; i < pets.length; i++) {
                if (pets[i].equalsIgnoreCase(searchPet)) {
                    // Use System.arraycopy to remove the pet from the array
                    System.arraycopy(pets, i + 1, pets, i, pets.length - i - 1);
                    index = i; // set index to the found index
                    break; // exit the loop after the first match
                }
            }

            if (index == -1) {
                JOptionPane.showMessageDialog(null, searchPet + " not found.");
            } else {
                // Resize the array by creating a new array with length - 1 and copying the values over
                String[] newPets = new String[pets.length - 1];
                System.arraycopy(pets, 0, newPets, 0, pets.length - 1);
                pets = newPets;
            }
        }
        JOptionPane.showMessageDialog(null, "Modified pets array:\n" + String.join(", ", pets));
    }
}