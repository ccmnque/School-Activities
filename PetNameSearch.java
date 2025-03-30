import javax.swing.JOptionPane;

public class PetNameSearch {
  public static void main(String[] args) {

    String[] pets = {"Spots", "Pawi", "Bluey", "Sugar", "Salt", "Piwi"};
    String search = JOptionPane.showInputDialog(null, "Enter pet name:");
    boolean found = false;

    for (int i = 0; i < pets.length; i++) {
      if (pets[i].equalsIgnoreCase(search)) {
        JOptionPane.showMessageDialog(null, search + " is Found at index " + i + ".");
        found = true;
        break;
      }
    }

    if (!found) {
      JOptionPane.showMessageDialog(null, search + " is NOT Found.");
    }
  }
}
