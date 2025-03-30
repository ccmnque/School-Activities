import javax.swing.JOptionPane;

public class BowlingGame {

    public static void main(String[] args) {
        int player1Score = 0;
        int player2Score = 0;
        
        for (int i = 1; i <= 3; i++) {
            String player1Input = JOptionPane.showInputDialog("Try " + i + ": Player 1 score:");
            String player2Input = JOptionPane.showInputDialog("Try " + i + ": Player 2 score:");
            
            int player1TryScore = Integer.parseInt(player1Input);
            int player2TryScore = Integer.parseInt(player2Input);
            
            player1Score += player1TryScore;
            player2Score += player2TryScore;
        }
        
        String winnerMessage;
        if (player1Score > player2Score) {
            winnerMessage = "Congratulations, Player 1. You won.";
        } else if (player2Score > player1Score) {
            winnerMessage = "Congratulations, Player 2. You won.";
        } else {
            winnerMessage = "It's a tie!";
        }
        
        String finalScores = "Player 1 Total Score: " + player1Score + "\n" +
                             "Player 2 Total Score: " + player2Score;
        
        JOptionPane.showMessageDialog(null, finalScores + "\n" + winnerMessage);
    }
}