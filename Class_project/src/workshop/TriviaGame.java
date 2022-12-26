package workshop;

import java.util.ArrayList;
import java.util.LinkedList;

public class TriviaGame {
    ArrayList players = new ArrayList();
    int[] places = new int[6];
    int[] purses = new int[6];
    boolean[] inPenaltyBox = new boolean[6];

    LinkedList popQuestions = new LinkedList();
    LinkedList scienceQuestions = new LinkedList();
    LinkedList sportsQuestions = new LinkedList();
    LinkedList rockQuestions = new LinkedList();

    int currentPlayer = 0;
    boolean isGettingOutOfPenaltyBox;

    public TriviaGame() {
        for (int i = 0; i < 50; i++) {
            popQuestions.addLast("Pop Question " + i);
            scienceQuestions.addLast(("Science Question " + i));
            sportsQuestions.addLast(("Sports Question " + i));
            rockQuestions.addLast("Rock Question " + i);	//createRockQuestion() method deleted (unnecessary method)
        }
    }


    public boolean isPlayable() {
        return (players.size() >= 2);
    }

    public boolean add(String playerName) {


        players.add(playerName);
        places[players.size()] = 0;		//unnecessary method
        purses[players.size()] = 0;
        inPenaltyBox[players.size()] = false;

        announce(playerName + " was added");
        announce("They are player number " + players.size());
        return true;
    }


    public void roll(int roll) {		//long method smell
        announce(players.get(currentPlayer) + " is the current player");
        announce("They have rolled a " + roll);

        if (inPenaltyBox[currentPlayer]) {
            if (roll % 2 != 0) {
                anounceAndAssign(true);
               newLocatuion(roll);
            } 
            else {
               anounceAndAssign(false);
            }
        } 
        else {
           newLocatuion(roll);
        }

    }
    
    public void anounceAndAssign(boolean value)
    {
	 isGettingOutOfPenaltyBox = value;
         announce(players.get(currentPlayer) + " is getting out of the penalty box");
    }
    
    public void newLocatuion(int roll)
    {
    	 places[currentPlayer] = places[currentPlayer] + roll;
                if (places[currentPlayer] > 11) places[currentPlayer] = places[currentPlayer] - 12;

                announce(players.get(currentPlayer)
                        + "'s new location is "
                        + places[currentPlayer]);
                announce("The category is " + currentCategory());
                askQuestion();
    }

    private void askQuestion() {
    	
        if (currentCategory() == "Pop")
            announce(popQuestions.removeFirst());
        if (currentCategory() == "Science")
            announce(scienceQuestions.removeFirst());
        if (currentCategory() == "Sports")
            announce(sportsQuestions.removeFirst());
        if (currentCategory() == "Rock")
            announce(rockQuestions.removeFirst());
    }


    private String currentCategory() {		//repeted code
    	String[] catagory = {"Pop","Science","Sports"};
    	int[] index = {0,1,2,4,5,6,8,9,10};
    	
    	for(int i:index)
    	{
    	    return catagory[index[places[currentPlayer]]%4];
    	}
        return null;
    }

    public boolean wasCorrectlyAnswered() {
        if (inPenaltyBox[currentPlayer]) {
            if (isGettingOutOfPenaltyBox) {
                addPlayers();
            } else {
                checkOverFlow();
                return true;
            }
        } else {
            addPlayers();
        }
        return false;
    }
    
    public boolean addPlayers()
    {
	announce("Answer was correct!!!!");
                purses[currentPlayer]++;
                announce(players.get(currentPlayer)
                        + " now has "
                        + purses[currentPlayer]
                        + " Gold Coins.");

                boolean winner = didPlayerWin();
               checkOverFlow();

                return winner;
    }
    
    public void checkOverFlow()		//Duplicate code
    {
	currentPlayer++;
        if (currentPlayer == players.size()) currentPlayer = 0;
    }

    public boolean wrongAnswer() {
        announce("Question was incorrectly answered");
        announce(players.get(currentPlayer) + " was sent to the penalty box");
        inPenaltyBox[currentPlayer] = true;

        checkOverFlow();
        return true;
    }

    private boolean didPlayerWin() {
        return !(purses[currentPlayer] == 6);
    }

    protected void announce(Object message) {
        System.out.println(message);
    }
}
