import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Main extends JFrame implements ActionListener {
    // This is so horribly unoptimized that its honestly embarassing. Its a glorified if else statement
    // Makes all of the variables
    private static final long serialVersionUID = 1L;
    private JButton[][] boardButtons;
    private JFrame frame;
    private JPanel controlPanel;
    private JButton newGameButton;
    private JButton aiPlayButton;
    private JLabel currentPlayerLabel;
    private JPanel boardPanel;
    private JPanel buttonPanel;
    private JPanel infoPanel;
    private boolean player1Turn = true;

    public Main() {
        // Makes the board bruv
        setTitle("Jerry Tac Toe");
        frame = new JFrame("Tic Tac Toe");
        //Sets the board so that the program closes when u close the window
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);

        // Set up the board buttons
        boardButtons = new JButton[3][3];
        boardPanel = new JPanel(new GridLayout(3, 3));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boardButtons[i][j] = new JButton();
                boardButtons[i][j].addActionListener(this);
                boardPanel.add(boardButtons[i][j]);
            }
        }

        // Set up the button panel
        // Create the control panel and add it to the main frame
        controlPanel = new JPanel();
        frame.add(controlPanel, BorderLayout.SOUTH);

        // Create the new game button
        newGameButton = new JButton("New Game");
        newGameButton.addActionListener(this);

        // Create the AI play button
        aiPlayButton = new JButton("Let AI play");
        aiPlayButton.addActionListener(this);

        // Create a panel for the buttons and add the buttons to it
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.add(newGameButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        buttonPanel.add(aiPlayButton);

        // Add the button panel to the control panel
        controlPanel.add(buttonPanel);

        // Create the current player label and add it to the control panel
        currentPlayerLabel = new JLabel("Player 1's Turn");
        controlPanel.add(currentPlayerLabel);


        // Set up the info panel
        currentPlayerLabel = new JLabel("Player 1's Turn");
        infoPanel = new JPanel(new FlowLayout());
        infoPanel.add(currentPlayerLabel);

        // Add all of the elements
        add(boardPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        add(infoPanel, BorderLayout.NORTH);

        // Makes it show up
        setVisible(true);
    }

    // Method to check if there is a winner
    private boolean checkWin() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (boardButtons[i][0].getText().equals(boardButtons[i][1].getText())
                    && boardButtons[i][0].getText().equals(boardButtons[i][2].getText())
                    && !boardButtons[i][0].getText().equals("")) {
                return true;
            }
        }

        // Check the weirdo ones
        if(boardButtons[0][0].getText().equals(boardButtons[1][0].getText())
                && boardButtons[0][0].getText().equals(boardButtons[2][1].getText())
                && !boardButtons[0][0].getText().equals("")){
            return true;
        }
        if(boardButtons[0][1].getText().equals(boardButtons[1][0].getText())
                && boardButtons[0][1].getText().equals(boardButtons[2][0].getText())
                && !boardButtons[0][1].getText().equals("")){
            return true;
        }
        if(boardButtons[0][1].getText().equals(boardButtons[1][2].getText())
                && boardButtons[0][1].getText().equals(boardButtons[2][2].getText())
                && !boardButtons[0][1].getText().equals("")){
            return true;
        }
        if(boardButtons[0][2].getText().equals(boardButtons[1][2].getText())
                && boardButtons[0][2].getText().equals(boardButtons[2][1].getText())
                && !boardButtons[0][2].getText().equals("")){
            return true;
        }

        // Check diagonals
        if (boardButtons[0][0].getText().equals(boardButtons[1][1].getText())
                && boardButtons[0][0].getText().equals(boardButtons[2][2].getText())
                && !boardButtons[0][0].getText().equals("")) {
            return true;
        }

        if (boardButtons[0][2].getText().equals(boardButtons[1][1].getText())
                && boardButtons[0][2].getText().equals(boardButtons[2][0].getText())
                && !boardButtons[0][2].getText().equals("")) {
            return true;
        }

        return false;
    }

    // Method to check if the board is full
    private boolean boardFull() {
        boolean full = true;
        // Increments through 1 by one and breaks if anything is "" while setting full to false
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j<3;j++) {
                if (boardButtons[i][j].getText().equals("")) {
                    full = false;
                    break;
                }
            }
        }

        return full;
    }

    // Method to reset the board
    private void resetBoard() {
        // Increments through 1 by 1 and sets everything to blank
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boardButtons[i][j].setText("");
            }
        }
    }

    // Method to handle button clicks
    public void actionPerformed(ActionEvent e) {
        // Detects if the New Game button has been clicked, if it has, it resets the game
        if (e.getSource() == newGameButton) {
            resetBoard();
            currentPlayerLabel.setText("Player 1's Turn");
            player1Turn = true;
            return;
        }
        // Checks to see if the Let Ai Play button has been clicked
        if(e.getSource() == aiPlayButton){
            aiTurn(false);
        }

        JButton clickedButton = (JButton) e.getSource();
        // Disallows clicking over a already used button
        if (!clickedButton.getText().equals("")) {
            return;
        }

        // Player Turn
        if (player1Turn && !checkWin()) {
            // Makes any button clicked by the player turn into an x
            clickedButton.setText("X");
            // Changes the Label to say AI turn
            currentPlayerLabel.setText("AI's Turn");
            player1Turn = false;
            // Makes sure the user hasnt won and that the board isnt full now
            if(!boardFull() && !checkWin()) {
                aiTurn(player1Turn);
                player1Turn = true;
            }
        }
        // Checks for a win
        if(checkWin()){
            JOptionPane.showMessageDialog(this, (player1Turn ? "AI" : "Player 1") + " wins!");
            resetBoard();
            currentPlayerLabel.setText("Player 1's Turn");
            player1Turn = true;
        }
        // Checks for a draw
        if(boardFull()){
            JOptionPane.showMessageDialog(this, ("Draw!"));
            resetBoard();
            currentPlayerLabel.setText("Player 1's Turn");
            player1Turn = true;
        }

    }
    // Method to handle AI's turn
    private void aiTurn(boolean player1Turn) {
        int row;
        int col;
        // Takes in the value given from the winopps function
        if(winOpps() == 0) {
            // if win opps was 0, then chose a random integer
            Random random = new Random();

            // Keep choosing random squares until an empty one is found
            row = random.nextInt(3);
            col = random.nextInt(3);
            while (!boardButtons[row][col].getText().equals("")) {
                row = random.nextInt(3);
                col = random.nextInt(3);
            }
        }
        else{
            // converts a single integer into array coordniates
            if(winOpps() == 1){
                row = 0;
                col = 0;
            }
            else if(winOpps() == 2){
                row = 0;
                col = 1;
            }
            else if(winOpps() == 3){
                row = 0;
                col = 2;
            }
            else if(winOpps() == 4){
                row = 1;
                col = 0;
            }
            else if(winOpps() == 5){
                row = 1;
                col = 1;
            }
            else if(winOpps() == 6){
                row = 1;
                col = 2;
            }
            else if(winOpps() == 7){
                row = 2;
                col = 0;
            }
            else if(winOpps() == 8){
                row = 2;
                col = 1;
            }
            else{
                row = 2;
                col = 2;
            }

        }
        // Toggle the button to the correct "color"
        boardButtons[row][col].setText("O");

    }
    private int winOpps(){
        //Basically what this part of the function is going to do is that it is going to:
        //1. Check for a win,
        //2. Check for an opponents win opportunity and blocks,
        //3. Check to see if a move can be made that opens up 2 win opportunities.
        //4. Check to see if a move can be made that blocks the opponents ability to get 2 win opportinities
        //3. Checks to see if a move can be made that opens up 1 win opportunities
        //Doing this gives a high chance of sucsess for the AI as it will try and win along with trying to make winning moves


        //Win code
        if(boardButtons[0][0].getText().equals("O") && boardButtons[0][1].getText().equals("O") && boardButtons[0][2].getText().equals("")){
            return 3;
        }
        else if(boardButtons[0][0].getText().equals("O") && boardButtons[0][1].getText().equals("") && boardButtons[0][2].getText().equals("O")){
            return 2;
        }
        else if(boardButtons[0][0].getText().equals("") && boardButtons[0][1].getText().equals("O") && boardButtons[0][2].getText().equals("O")){
            return 1;
        }
        else if(boardButtons[1][0].getText().equals("") && boardButtons[1][1].getText().equals("O") && boardButtons[1][2].getText().equals("O")){
            return 4;
        }
        else if(boardButtons[1][0].getText().equals("O") && boardButtons[1][1].getText().equals("") && boardButtons[1][2].getText().equals("O")){
            return 5;
        }
        else if(boardButtons[1][0].getText().equals("O") && boardButtons[1][1].getText().equals("O") && boardButtons[1][2].getText().equals("")){
            return 6;
        }
        else if(boardButtons[2][0].getText().equals("") && boardButtons[2][1].getText().equals("O") && boardButtons[2][2].getText().equals("O")){
            return 7;
        }
        else if(boardButtons[2][0].getText().equals("O") && boardButtons[2][1].getText().equals("") && boardButtons[2][2].getText().equals("O")){
            return 8;
        }
        else if(boardButtons[2][0].getText().equals("O") && boardButtons[2][1].getText().equals("O") && boardButtons[2][2].getText().equals("")){
            return 9;
        }
        else if(boardButtons[0][0].getText().equals("") && boardButtons[1][1].getText().equals("O") && boardButtons[2][2].getText().equals("O")){
            return 1;
        }
        else if(boardButtons[0][0].getText().equals("O") && boardButtons[1][1].getText().equals("") && boardButtons[2][2].getText().equals("O")){
            return 5;
        }
        else if(boardButtons[0][0].getText().equals("O") && boardButtons[1][1].getText().equals("O") && boardButtons[2][2].getText().equals("")){
            return 9;
        }
        else if(boardButtons[0][2].getText().equals("") && boardButtons[1][1].getText().equals("O") && boardButtons[2][0].getText().equals("O")){
            return 3;
        }
        else if(boardButtons[0][2].getText().equals("O") && boardButtons[1][1].getText().equals("") && boardButtons[2][0].getText().equals("O")){
            return 5;
        }
        else if(boardButtons[0][2].getText().equals("O") && boardButtons[1][1].getText().equals("O") && boardButtons[2][0].getText().equals("")){
            return 7;
        }
        else if(boardButtons[0][0].getText().equals("") && boardButtons[1][0].getText().equals("O") && boardButtons[2][1].getText().equals("O")){
            return 1;
        }
        else if(boardButtons[0][0].getText().equals("O") && boardButtons[1][0].getText().equals("") && boardButtons[2][1].getText().equals("O")){
            return 4;
        }
        else if(boardButtons[0][0].getText().equals("O") && boardButtons[1][0].getText().equals("O") && boardButtons[2][1].getText().equals("")){
            return 8;
        }
        else if(boardButtons[0][1].getText().equals("") && boardButtons[1][0].getText().equals("O") && boardButtons[2][0].getText().equals("O")){
            return 2;
        }
        else if(boardButtons[0][1].getText().equals("O") && boardButtons[1][0].getText().equals("") && boardButtons[2][0].getText().equals("O")){
            return 4;
        }
        else if(boardButtons[0][1].getText().equals("O") && boardButtons[1][0].getText().equals("O") && boardButtons[2][0].getText().equals("")){
            return 7;
        }
        else if(boardButtons[0][1].getText().equals("") && boardButtons[1][2].getText().equals("O") && boardButtons[2][2].getText().equals("O")){
            return 2;
        }
        else if(boardButtons[0][1].getText().equals("O") && boardButtons[1][2].getText().equals("") && boardButtons[2][2].getText().equals("O")){
            return 6;
        }
        else if(boardButtons[0][1].getText().equals("O") && boardButtons[1][2].getText().equals("O") && boardButtons[2][2].getText().equals("")){
            return 9;
        }
        else if(boardButtons[0][2].getText().equals("") && boardButtons[1][2].getText().equals("O") && boardButtons[2][1].getText().equals("O")){
            return 3;
        }
        else if(boardButtons[0][2].getText().equals("O") && boardButtons[1][2].getText().equals("") && boardButtons[2][1].getText().equals("O")){
            return 6;
        }
        else if(boardButtons[0][2].getText().equals("O") && boardButtons[1][2].getText().equals("O") && boardButtons[2][1].getText().equals("")){
            return 8;
        }
        //Loss Prevention code
        else if(boardButtons[0][0].getText().equals("X") && boardButtons[0][1].getText().equals("X") && boardButtons[0][2].getText().equals("")){
            return 3;
        }
        else if(boardButtons[0][0].getText().equals("X") && boardButtons[0][1].getText().equals("") && boardButtons[0][2].getText().equals("X")){
            return 2;
        }
        else if(boardButtons[0][0].getText().equals("") && boardButtons[0][1].getText().equals("X") && boardButtons[0][2].getText().equals("X")){
            return 1;
        }
        else if(boardButtons[1][0].getText().equals("") && boardButtons[1][1].getText().equals("X") && boardButtons[1][2].getText().equals("X")){
            return 4;
        }
        else if(boardButtons[1][0].getText().equals("X") && boardButtons[1][1].getText().equals("") && boardButtons[1][2].getText().equals("X")){
            return 5;
        }
        else if(boardButtons[1][0].getText().equals("X") && boardButtons[1][1].getText().equals("X") && boardButtons[1][2].getText().equals("")){
            return 6;
        }
        else if(boardButtons[2][0].getText().equals("") && boardButtons[2][1].getText().equals("X") && boardButtons[2][2].getText().equals("X")){
            return 7;
        }
        else if(boardButtons[2][0].getText().equals("X") && boardButtons[2][1].getText().equals("") && boardButtons[2][2].getText().equals("X")){
            return 8;
        }
        else if(boardButtons[2][0].getText().equals("X") && boardButtons[2][1].getText().equals("X") && boardButtons[2][2].getText().equals("")){
            return 9;
        }
        else if(boardButtons[0][0].getText().equals("") && boardButtons[1][1].getText().equals("X") && boardButtons[2][2].getText().equals("X")){
            return 1;
        }
        else if(boardButtons[0][0].getText().equals("X") && boardButtons[1][1].getText().equals("") && boardButtons[2][2].getText().equals("X")){
            return 5;
        }
        else if(boardButtons[0][0].getText().equals("X") && boardButtons[1][1].getText().equals("X") && boardButtons[2][2].getText().equals("")){
            return 9;
        }
        else if(boardButtons[0][2].getText().equals("") && boardButtons[1][1].getText().equals("X") && boardButtons[2][0].getText().equals("X")){
            return 3;
        }
        else if(boardButtons[0][2].getText().equals("X") && boardButtons[1][1].getText().equals("") && boardButtons[2][0].getText().equals("X")){
            return 5;
        }
        else if(boardButtons[0][2].getText().equals("X") && boardButtons[1][1].getText().equals("X") && boardButtons[2][0].getText().equals("")){
            return 7;
        }
        else if(boardButtons[0][0].getText().equals("") && boardButtons[1][0].getText().equals("X") && boardButtons[2][1].getText().equals("X")){
            return 1;
        }
        else if(boardButtons[0][0].getText().equals("X") && boardButtons[1][0].getText().equals("") && boardButtons[2][1].getText().equals("X")){
            return 4;
        }
        else if(boardButtons[0][0].getText().equals("X") && boardButtons[1][0].getText().equals("X") && boardButtons[2][1].getText().equals("")){
            return 8;
        }
        else if(boardButtons[0][1].getText().equals("") && boardButtons[1][0].getText().equals("X") && boardButtons[2][0].getText().equals("X")){
            return 2;
        }
        else if(boardButtons[0][1].getText().equals("X") && boardButtons[1][0].getText().equals("") && boardButtons[2][0].getText().equals("X")){
            return 4;
        }
        else if(boardButtons[0][1].getText().equals("X") && boardButtons[1][0].getText().equals("X") && boardButtons[2][0].getText().equals("")){
            return 7;
        }
        else if(boardButtons[0][1].getText().equals("") && boardButtons[1][2].getText().equals("X") && boardButtons[2][2].getText().equals("X")){
            return 2;
        }
        else if(boardButtons[0][1].getText().equals("X") && boardButtons[1][2].getText().equals("") && boardButtons[2][2].getText().equals("X")){
            return 6;
        }
        else if(boardButtons[0][1].getText().equals("X") && boardButtons[1][2].getText().equals("X") && boardButtons[2][2].getText().equals("")){
            return 9;
        }
        else if(boardButtons[0][2].getText().equals("") && boardButtons[1][2].getText().equals("X") && boardButtons[2][1].getText().equals("X")){
            return 3;
        }
        else if(boardButtons[0][2].getText().equals("X") && boardButtons[1][2].getText().equals("") && boardButtons[2][1].getText().equals("X")){
            return 6;
        }
        else if(boardButtons[0][2].getText().equals("X") && boardButtons[1][2].getText().equals("X") && boardButtons[2][1].getText().equals("")){
            return 8;
        }
        else if(boardButtons[0][0].getText().equals("")){
            int opps = 0;
            //This check to see if the AI plays in the spot 0,0, if there are 2 or more win opportunities (unstopable)
            if((boardButtons[0][1].getText().equals("O") && boardButtons[0][2].getText().equals("")) ||
                    (boardButtons[0][1].getText().equals("") && boardButtons[0][2].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[1][0].getText().equals("O") && boardButtons[2][1].getText().equals("")) ||
                    (boardButtons[1][0].getText().equals("") && boardButtons[2][1].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[1][1].getText().equals("O") && boardButtons[2][2].getText().equals("")) ||
                    (boardButtons[1][1].getText().equals("") && boardButtons[2][2].getText().equals("O"))){
                opps++;
            }
            if(opps>1){
                return 1;
            }
        }
        else if(boardButtons[0][1].getText().equals("")){
            int opps = 0;
            //This check to see if the AI plays in the spot 0,0, if there are 2 or more win opportunities (unstopable)
            if((boardButtons[0][0].getText().equals("O") && boardButtons[0][2].getText().equals("")) ||
                    (boardButtons[0][0].getText().equals("") && boardButtons[0][2].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[1][0].getText().equals("O") && boardButtons[2][0].getText().equals("")) ||
                    (boardButtons[1][0].getText().equals("") && boardButtons[2][0].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[1][2].getText().equals("O") && boardButtons[2][2].getText().equals("")) ||
                    (boardButtons[1][2].getText().equals("") && boardButtons[2][2].getText().equals("O"))){
                opps++;
            }
            if(opps>1){
                return 2;
            }
        }
        else if(boardButtons[0][2].getText().equals("")){
            int opps = 0;
            //This check to see if the AI plays in the spot 0,0, if there are 2 or more win opportunities (unstopable)
            if((boardButtons[0][0].getText().equals("O") && boardButtons[0][1].getText().equals("")) ||
                    (boardButtons[0][0].getText().equals("") && boardButtons[0][1].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[1][2].getText().equals("O") && boardButtons[2][1].getText().equals("")) ||
                    (boardButtons[1][2].getText().equals("") && boardButtons[2][1].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[1][1].getText().equals("O") && boardButtons[2][0].getText().equals("")) ||
                    (boardButtons[1][1].getText().equals("") && boardButtons[2][0].getText().equals("O"))){
                opps++;
            }
            if(opps>1){
                return 3;
            }
        }
        else if(boardButtons[1][0].getText().equals("")){
            int opps = 0;
            //This check to see if the AI plays in the spot 0,0, if there are 2 or more win opportunities (unstopable)
            if((boardButtons[0][0].getText().equals("O") && boardButtons[2][1].getText().equals("")) ||
                    (boardButtons[0][0].getText().equals("") && boardButtons[2][1].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[1][1].getText().equals("O") && boardButtons[1][2].getText().equals("")) ||
                    (boardButtons[1][1].getText().equals("") && boardButtons[1][2].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[0][1].getText().equals("O") && boardButtons[2][0].getText().equals("")) ||
                    (boardButtons[0][1].getText().equals("") && boardButtons[2][0].getText().equals("O"))){
                opps++;
            }
            if(opps>1){
                return 4;
            }
        }
        else if(boardButtons[1][1].getText().equals("")){
            int opps = 0;
            //This check to see if the AI plays in the spot 0,0, if there are 2 or more win opportunities (unstopable)
            if((boardButtons[0][0].getText().equals("O") && boardButtons[2][2].getText().equals("")) ||
                    (boardButtons[0][0].getText().equals("") && boardButtons[2][2].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[1][0].getText().equals("O") && boardButtons[1][2].getText().equals("")) ||
                    (boardButtons[1][0].getText().equals("") && boardButtons[1][2].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[0][2].getText().equals("O") && boardButtons[2][0].getText().equals("")) ||
                    (boardButtons[0][2].getText().equals("") && boardButtons[2][0].getText().equals("O"))){
                opps++;
            }
            if(opps>1){
                return 5;
            }
        }
        else if(boardButtons[1][2].getText().equals("")){
            int opps = 0;
            //This check to see if the AI plays in the spot 0,0, if there are 2 or more win opportunities (unstopable)
            if((boardButtons[0][1].getText().equals("O") && boardButtons[2][2].getText().equals("")) ||
                    (boardButtons[0][1].getText().equals("") && boardButtons[2][2].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[1][0].getText().equals("O") && boardButtons[1][1].getText().equals("")) ||
                    (boardButtons[1][0].getText().equals("") && boardButtons[1][1].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[0][2].getText().equals("O") && boardButtons[2][1].getText().equals("")) ||
                    (boardButtons[0][2].getText().equals("") && boardButtons[2][1].getText().equals("O"))){
                opps++;
            }
            if(opps>1){
                return 6;
            }
        }
        else if(boardButtons[2][0].getText().equals("")){
            int opps = 0;
            //This check to see if the AI plays in the spot 0,0, if there are 2 or more win opportunities (unstopable)
            if((boardButtons[0][1].getText().equals("O") && boardButtons[1][0].getText().equals("")) ||
                    (boardButtons[0][1].getText().equals("") && boardButtons[1][0].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[0][2].getText().equals("O") && boardButtons[1][1].getText().equals("")) ||
                    (boardButtons[0][2].getText().equals("") && boardButtons[1][1].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[2][1].getText().equals("O") && boardButtons[2][2].getText().equals("")) ||
                    (boardButtons[2][1].getText().equals("") && boardButtons[2][2].getText().equals("O"))){
                opps++;
            }
            if(opps>1){
                return 7;
            }
        }
        else if(boardButtons[2][1].getText().equals("")){
            int opps = 0;
            //This check to see if the AI plays in the spot 0,0, if there are 2 or more win opportunities (unstopable)
            if((boardButtons[0][0].getText().equals("O") && boardButtons[1][0].getText().equals("")) ||
                    (boardButtons[0][0].getText().equals("") && boardButtons[1][0].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[2][0].getText().equals("O") && boardButtons[2][2].getText().equals("")) ||
                    (boardButtons[2][0].getText().equals("") && boardButtons[2][2].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[0][2].getText().equals("O") && boardButtons[1][2].getText().equals("")) ||
                    (boardButtons[0][2].getText().equals("") && boardButtons[1][2].getText().equals("O"))){
                opps++;
            }
            if(opps>1){
                return 8;
            }
        }
        else if(boardButtons[0][1].getText().equals("")){
            int opps = 0;
            //This check to see if the AI plays in the spot 0,0, if there are 2 or more win opportunities (unstopable)
            if((boardButtons[0][0].getText().equals("O") && boardButtons[1][1].getText().equals("")) ||
                    (boardButtons[0][0].getText().equals("") && boardButtons[1][1].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[2][0].getText().equals("O") && boardButtons[2][1].getText().equals("")) ||
                    (boardButtons[2][0].getText().equals("") && boardButtons[2][1].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[0][1].getText().equals("O") && boardButtons[1][2].getText().equals("")) ||
                    (boardButtons[0][1].getText().equals("") && boardButtons[1][2].getText().equals("O"))){
                opps++;
            }
            if(opps>1){
                return 9;
            }
        }
        else if(boardButtons[0][0].getText().equals("")){
            int opps = 0;
            //This check to see if the AI plays in the spot 0,0, if there are 2 or more win opportunities (unstopable)
            if((boardButtons[0][1].getText().equals("X") && boardButtons[0][2].getText().equals("")) ||
                    (boardButtons[0][1].getText().equals("") && boardButtons[0][2].getText().equals("X"))){
                opps++;
            }
            if((boardButtons[1][0].getText().equals("X") && boardButtons[2][1].getText().equals("")) ||
                    (boardButtons[1][0].getText().equals("") && boardButtons[2][1].getText().equals("X"))){
                opps++;
            }
            if((boardButtons[1][1].getText().equals("X") && boardButtons[2][2].getText().equals("")) ||
                    (boardButtons[1][1].getText().equals("") && boardButtons[2][2].getText().equals("X"))){
                opps++;
            }
            if(opps>1){
                return 1;
            }
        }
        else if(boardButtons[0][1].getText().equals("")){
            int opps = 0;
            //This check to see if the AI plays in the spot 0,0, if there are 2 or more win opportunities (unstopable)
            if((boardButtons[0][0].getText().equals("X") && boardButtons[0][2].getText().equals("")) ||
                    (boardButtons[0][0].getText().equals("") && boardButtons[0][2].getText().equals("X"))){
                opps++;
            }
            if((boardButtons[1][0].getText().equals("X") && boardButtons[2][0].getText().equals("")) ||
                    (boardButtons[1][0].getText().equals("") && boardButtons[2][0].getText().equals("X"))){
                opps++;
            }
            if((boardButtons[1][2].getText().equals("X") && boardButtons[2][2].getText().equals("")) ||
                    (boardButtons[1][2].getText().equals("") && boardButtons[2][2].getText().equals("X"))){
                opps++;
            }
            if(opps>1){
                return 2;
            }
        }
        else if(boardButtons[0][2].getText().equals("")){
            int opps = 0;
            //This check to see if the AI plays in the spot 0,0, if there are 2 or more win opportunities (unstopable)
            if((boardButtons[0][0].getText().equals("X") && boardButtons[0][1].getText().equals("")) ||
                    (boardButtons[0][0].getText().equals("") && boardButtons[0][1].getText().equals("X"))){
                opps++;
            }
            if((boardButtons[1][2].getText().equals("X") && boardButtons[2][1].getText().equals("")) ||
                    (boardButtons[1][2].getText().equals("") && boardButtons[2][1].getText().equals("X"))){
                opps++;
            }
            if((boardButtons[1][1].getText().equals("X") && boardButtons[2][0].getText().equals("")) ||
                    (boardButtons[1][1].getText().equals("") && boardButtons[2][0].getText().equals("X"))){
                opps++;
            }
            if(opps>1){
                return 3;
            }
        }
        else if(boardButtons[1][0].getText().equals("")){
            int opps = 0;
            //This check to see if the AI plays in the spot 0,0, if there are 2 or more win opportunities (unstopable)
            if((boardButtons[0][0].getText().equals("X") && boardButtons[2][1].getText().equals("")) ||
                    (boardButtons[0][0].getText().equals("") && boardButtons[2][1].getText().equals("X"))){
                opps++;
            }
            if((boardButtons[1][1].getText().equals("X") && boardButtons[1][2].getText().equals("")) ||
                    (boardButtons[1][1].getText().equals("") && boardButtons[1][2].getText().equals("X"))){
                opps++;
            }
            if((boardButtons[0][1].getText().equals("X") && boardButtons[2][0].getText().equals("")) ||
                    (boardButtons[0][1].getText().equals("") && boardButtons[2][0].getText().equals("X"))){
                opps++;
            }
            if(opps>1){
                return 4;
            }
        }
        else if(boardButtons[1][1].getText().equals("")){
            int opps = 0;
            //This check to see if the AI plays in the spot 0,0, if there are 2 or more win opportunities (unstopable)
            if((boardButtons[0][0].getText().equals("X") && boardButtons[2][2].getText().equals("")) ||
                    (boardButtons[0][0].getText().equals("") && boardButtons[2][2].getText().equals("X"))){
                opps++;
            }
            if((boardButtons[1][0].getText().equals("X") && boardButtons[1][2].getText().equals("")) ||
                    (boardButtons[1][0].getText().equals("") && boardButtons[1][2].getText().equals("X"))){
                opps++;
            }
            if((boardButtons[0][2].getText().equals("X") && boardButtons[2][0].getText().equals("")) ||
                    (boardButtons[0][2].getText().equals("") && boardButtons[2][0].getText().equals("X"))){
                opps++;
            }
            if(opps>1){
                return 5;
            }
        }
        else if(boardButtons[1][2].getText().equals("")){
            int opps = 0;
            //This check to see if the AI plays in the spot 0,0, if there are 2 or more win opportunities (unstopable)
            if((boardButtons[0][1].getText().equals("X") && boardButtons[2][2].getText().equals("")) ||
                    (boardButtons[0][1].getText().equals("") && boardButtons[2][2].getText().equals("X"))){
                opps++;
            }
            if((boardButtons[1][0].getText().equals("X") && boardButtons[1][1].getText().equals("")) ||
                    (boardButtons[1][0].getText().equals("") && boardButtons[1][1].getText().equals("X"))){
                opps++;
            }
            if((boardButtons[0][2].getText().equals("X") && boardButtons[2][1].getText().equals("")) ||
                    (boardButtons[0][2].getText().equals("") && boardButtons[2][1].getText().equals("X"))){
                opps++;
            }
            if(opps>1){
                return 6;
            }
        }
        else if(boardButtons[2][0].getText().equals("")){
            int opps = 0;
            //This check to see if the AI plays in the spot 0,0, if there are 2 or more win opportunities (unstopable)
            if((boardButtons[0][1].getText().equals("X") && boardButtons[1][0].getText().equals("")) ||
                    (boardButtons[0][1].getText().equals("") && boardButtons[1][0].getText().equals("X"))){
                opps++;
            }
            if((boardButtons[0][2].getText().equals("X") && boardButtons[1][1].getText().equals("")) ||
                    (boardButtons[0][2].getText().equals("") && boardButtons[1][1].getText().equals("X"))){
                opps++;
            }
            if((boardButtons[2][1].getText().equals("X") && boardButtons[2][2].getText().equals("")) ||
                    (boardButtons[2][1].getText().equals("") && boardButtons[2][2].getText().equals("X"))){
                opps++;
            }
            if(opps>1){
                return 7;
            }
        }
        else if(boardButtons[2][1].getText().equals("")){
            int opps = 0;
            //This check to see if the AI plays in the spot 0,0, if there are 2 or more win opportunities (unstopable)
            if((boardButtons[0][0].getText().equals("X") && boardButtons[1][0].getText().equals("")) ||
                    (boardButtons[0][0].getText().equals("") && boardButtons[1][0].getText().equals("X"))){
                opps++;
            }
            if((boardButtons[2][0].getText().equals("X") && boardButtons[2][2].getText().equals("")) ||
                    (boardButtons[2][0].getText().equals("") && boardButtons[2][2].getText().equals("X"))){
                opps++;
            }
            if((boardButtons[0][2].getText().equals("X") && boardButtons[1][2].getText().equals("")) ||
                    (boardButtons[0][2].getText().equals("") && boardButtons[1][2].getText().equals("X"))){
                opps++;
            }
            if(opps>1){
                return 8;
            }
        }
        else if(boardButtons[0][1].getText().equals("")){
            int opps = 0;
            //This check to see if the AI plays in the spot 0,0, if there are 2 or more win opportunities (unstopable)
            if((boardButtons[0][0].getText().equals("X") && boardButtons[1][1].getText().equals("")) ||
                    (boardButtons[0][0].getText().equals("") && boardButtons[1][1].getText().equals("X"))){
                opps++;
            }
            if((boardButtons[2][0].getText().equals("X") && boardButtons[2][1].getText().equals("")) ||
                    (boardButtons[2][0].getText().equals("") && boardButtons[2][1].getText().equals("X"))){
                opps++;
            }
            if((boardButtons[0][1].getText().equals("X") && boardButtons[1][2].getText().equals("")) ||
                    (boardButtons[0][1].getText().equals("") && boardButtons[1][2].getText().equals("X"))){
                opps++;
            }
            if(opps>1){
                return 9;
            }
        }
        else if(boardButtons[0][0].getText().equals("")){
            int opps = 0;
            //This check to see if the AI plays in the spot 0,0, if there are 2 or more win opportunities (unstopable)
            if((boardButtons[0][1].getText().equals("O") && boardButtons[0][2].getText().equals("")) ||
                    (boardButtons[0][1].getText().equals("") && boardButtons[0][2].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[1][0].getText().equals("O") && boardButtons[2][1].getText().equals("")) ||
                    (boardButtons[1][0].getText().equals("") && boardButtons[2][1].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[1][1].getText().equals("O") && boardButtons[2][2].getText().equals("")) ||
                    (boardButtons[1][1].getText().equals("") && boardButtons[2][2].getText().equals("O"))){
                opps++;
            }
            if(opps>=1){
                return 1;
            }
        }
        else if(boardButtons[0][1].getText().equals("")){
            int opps = 0;
            //This check to see if the AI plays in the spot 0,0, if there are 2 or more win opportunities (unstopable)
            if((boardButtons[0][0].getText().equals("O") && boardButtons[0][2].getText().equals("")) ||
                    (boardButtons[0][0].getText().equals("") && boardButtons[0][2].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[1][0].getText().equals("O") && boardButtons[2][0].getText().equals("")) ||
                    (boardButtons[1][0].getText().equals("") && boardButtons[2][0].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[1][2].getText().equals("O") && boardButtons[2][2].getText().equals("")) ||
                    (boardButtons[1][2].getText().equals("") && boardButtons[2][2].getText().equals("O"))){
                opps++;
            }
            if(opps>=1){
                return 2;
            }
        }
        else if(boardButtons[0][2].getText().equals("")){
            int opps = 0;
            //This check to see if the AI plays in the spot 0,0, if there are 2 or more win opportunities (unstopable)
            if((boardButtons[0][0].getText().equals("O") && boardButtons[0][1].getText().equals("")) ||
                    (boardButtons[0][0].getText().equals("") && boardButtons[0][1].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[1][2].getText().equals("O") && boardButtons[2][1].getText().equals("")) ||
                    (boardButtons[1][2].getText().equals("") && boardButtons[2][1].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[1][1].getText().equals("O") && boardButtons[2][0].getText().equals("")) ||
                    (boardButtons[1][1].getText().equals("") && boardButtons[2][0].getText().equals("O"))){
                opps++;
            }
            if(opps>=1){
                return 3;
            }
        }
        else if(boardButtons[1][0].getText().equals("")){
            int opps = 0;
            //This check to see if the AI plays in the spot 0,0, if there are 2 or more win opportunities (unstopable)
            if((boardButtons[0][0].getText().equals("O") && boardButtons[2][1].getText().equals("")) ||
                    (boardButtons[0][0].getText().equals("") && boardButtons[2][1].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[1][1].getText().equals("O") && boardButtons[1][2].getText().equals("")) ||
                    (boardButtons[1][1].getText().equals("") && boardButtons[1][2].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[0][1].getText().equals("O") && boardButtons[2][0].getText().equals("")) ||
                    (boardButtons[0][1].getText().equals("") && boardButtons[2][0].getText().equals("O"))){
                opps++;
            }
            if(opps>=1){
                return 4;
            }
        }
        else if(boardButtons[1][1].getText().equals("")){
            int opps = 0;
            //This check to see if the AI plays in the spot 0,0, if there are 2 or more win opportunities (unstopable)
            if((boardButtons[0][0].getText().equals("O") && boardButtons[2][2].getText().equals("")) ||
                    (boardButtons[0][0].getText().equals("") && boardButtons[2][2].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[1][0].getText().equals("O") && boardButtons[1][2].getText().equals("")) ||
                    (boardButtons[1][0].getText().equals("") && boardButtons[1][2].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[0][2].getText().equals("O") && boardButtons[2][0].getText().equals("")) ||
                    (boardButtons[0][2].getText().equals("") && boardButtons[2][0].getText().equals("O"))){
                opps++;
            }
            if(opps>=1){
                return 5;
            }
        }
        else if(boardButtons[1][2].getText().equals("")){
            int opps = 0;
            //This check to see if the AI plays in the spot 0,0, if there are 2 or more win opportunities (unstopable)
            if((boardButtons[0][1].getText().equals("O") && boardButtons[2][2].getText().equals("")) ||
                    (boardButtons[0][1].getText().equals("") && boardButtons[2][2].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[1][0].getText().equals("O") && boardButtons[1][1].getText().equals("")) ||
                    (boardButtons[1][0].getText().equals("") && boardButtons[1][1].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[0][2].getText().equals("O") && boardButtons[2][1].getText().equals("")) ||
                    (boardButtons[0][2].getText().equals("") && boardButtons[2][1].getText().equals("O"))){
                opps++;
            }
            if(opps>=1){
                return 6;
            }
        }
        else if(boardButtons[2][0].getText().equals("")){
            int opps = 0;
            //This check to see if the AI plays in the spot 0,0, if there are 2 or more win opportunities (unstopable)
            if((boardButtons[0][1].getText().equals("O") && boardButtons[1][0].getText().equals("")) ||
                    (boardButtons[0][1].getText().equals("") && boardButtons[1][0].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[0][2].getText().equals("O") && boardButtons[1][1].getText().equals("")) ||
                    (boardButtons[0][2].getText().equals("") && boardButtons[1][1].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[2][1].getText().equals("O") && boardButtons[2][2].getText().equals("")) ||
                    (boardButtons[2][1].getText().equals("") && boardButtons[2][2].getText().equals("O"))){
                opps++;
            }
            if(opps>=1){
                return 7;
            }
        }
        else if(boardButtons[2][1].getText().equals("")){
            int opps = 0;
            //This check to see if the AI plays in the spot 0,0, if there are 2 or more win opportunities (unstopable)
            if((boardButtons[0][0].getText().equals("O") && boardButtons[1][0].getText().equals("")) ||
                    (boardButtons[0][0].getText().equals("") && boardButtons[1][0].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[2][0].getText().equals("O") && boardButtons[2][2].getText().equals("")) ||
                    (boardButtons[2][0].getText().equals("") && boardButtons[2][2].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[0][2].getText().equals("O") && boardButtons[1][2].getText().equals("")) ||
                    (boardButtons[0][2].getText().equals("") && boardButtons[1][2].getText().equals("O"))){
                opps++;
            }
            if(opps>=1){
                return 8;
            }
        }
        else if(boardButtons[0][1].getText().equals("")){
            int opps = 0;
            //This check to see if the AI plays in the spot 0,0, if there are 2 or more win opportunities (unstopable)
            if((boardButtons[0][0].getText().equals("O") && boardButtons[1][1].getText().equals("")) ||
                    (boardButtons[0][0].getText().equals("") && boardButtons[1][1].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[2][0].getText().equals("O") && boardButtons[2][1].getText().equals("")) ||
                    (boardButtons[2][0].getText().equals("") && boardButtons[2][1].getText().equals("O"))){
                opps++;
            }
            if((boardButtons[0][1].getText().equals("O") && boardButtons[1][2].getText().equals("")) ||
                    (boardButtons[0][1].getText().equals("") && boardButtons[1][2].getText().equals("O"))){
                opps++;
            }
            if(opps>=1){
                return 9;
            }
        }
        return 0;
    }

    // Main method to start the game
    public static void main(String[] args) {
        new Main();
    }

}
