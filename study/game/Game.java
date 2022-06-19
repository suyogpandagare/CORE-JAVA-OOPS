package study.game;

public class Game {

	private int hiddenNo;
	private int chances;
	
	
	public Game(int hiddenNo, int chances) {
		super();
		this.hiddenNo = hiddenNo;
		this.chances = chances;
	}


	public Game() {

	}


	public int getHiddenNo() {
		return hiddenNo;
	}


	public void setHiddenNo(int hiddenNo) {
		
		this.hiddenNo = hiddenNo;
	}


	public int getChances() {
		return chances;
	}


	public void setChances(int chances) {
		this.chances = chances;
	}


	public int isMatching(int guessedNo)
	{
		if(hiddenNo == guessedNo)
		return 0;
		if(hiddenNo < guessedNo)
			return -1;
		if(hiddenNo > guessedNo)
			return 1;
		return 0;
		
	}
}
