//Lesson Eight - Part 1
import java.util.Arrays;

public class MonsterTwo
{
	static char[][] battleBoard = new char[10][10];
	
	public static void buildBattleBoard()
	{
		for(char[] row : battleBoard)
		{
			Arrays.fill(row, '*');
		}
	}
	
	public static void redrawBoard()
	{
		
		int k = 1;
		while(k <= 30){
			System.out.print('-');
			k++;
		}
			System.out.println();
			
			for (int i = 0; i < battleBoard.length; i++)
			{
				for(int j = 0; j < battleBoard[i].length; j++)
				{
					
					System.out.print("|" + battleBoard[i][j] + "|");
					
				}
				
				System.out.println();
			}
			
			k = 1;
			while(k <= 30){
				System.out.print('-');
				k++;
			}
				System.out.println();
		
	}
	public final String TOMBSTONE = "Here lies a dead monster";
	
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	public int xPosition = 0;
	public int yPosition = 0;
	private boolean alive = true;
	public char nameChar1 = 'B';
	public String name = "Big Monster";
	
	public static int numOfMonsters = 0;
	
	public int getAttack()
	{
		return attack;
	}
	
	public int getMovement()
	{
		return movement;
	}
	
	public int getHealth()
	{
		return health;
	}
	
	public boolean getAlive()
	{
		return alive;
	}
	
	public void setHealth(int decreaseHealth)
	{
		health = health - decreaseHealth;
		if (health < 0)
		{
			alive = false;
		}
	}
	
	public void moveMonster(MonsterTwo[] monster, int arrayItemIndex)
	{
		boolean isSpaceOpen = true;
		
		int maxXBoardSpace = battleBoard.length - 1;
		int maxYBoardSpace = battleBoard[0].length - 1;
		
		while(isSpaceOpen)
		{
			int randMoveDirection = (int) (Math.random() * 4);
			int randMoveDistance = (int) (Math.random() * (this.getMovement() + 1));
			
			System.out.println(randMoveDistance + " " + randMoveDirection);
			
			battleBoard[this.yPosition][this.xPosition] = '*';
			
			if(randMoveDirection == 0)
			{
				if((this.yPosition - randMoveDistance) < 0)
				{
					this.yPosition = 0;
				} else {
					this.yPosition = this.yPosition - randMoveDistance;
				}
				
			}else if(randMoveDirection == 1){
				if((this.xPosition + randMoveDistance) > maxXBoardSpace)
				{
					this.xPosition = maxXBoardSpace;
				} else {
					this.xPosition = this.xPosition + randMoveDistance;
				}
			}else if(randMoveDirection == 2){
				if((this.yPosition + randMoveDistance) > maxYBoardSpace)
				{
					this.yPosition = maxYBoardSpace;
				} else {
					this.yPosition = this.yPosition + randMoveDistance;
				}
			}else {
				if((this.xPosition - randMoveDistance) < 0)
				{
					this.xPosition = 0;
				} else {
					this.xPosition = this.xPosition - randMoveDistance;
				}
				
				for(int i = 0; i < monster.length; i++)
				{
					if(i == arrayItemIndex)
					{
						continue;
					}
					
					if(onMySpace(monster, i, arrayItemIndex))
					{
						
						isSpaceOpen = true;
						break;
					}else {
						isSpaceOpen = false;
					}
					
				}
				
				
			}
		} //END OF WHILE LOOP
			battleBoard[this.yPosition][this.xPosition] = this.nameChar1;
	} // END OF moveMonster
	
	public boolean onMySpace(MonsterTwo[] monster, int indexToCheck1, int indexToCheck2)
	{
		if((monster[indexToCheck1].xPosition)==(monster[indexToCheck2].xPosition)&&(monster[indexToCheck1].yPosition)==(monster[indexToCheck2].yPosition))
		{
			return true;
		} else {
			return false;
		}
	
	} //END OF onMySpace

	
	public void setHealth(double decreaseHealth)
	{
		int intDecreaseHealth = (int) decreaseHealth;
		health = health - intDecreaseHealth;
		if (health < 0)
		{
			alive = false;
		}
	}
	
	public MonsterTwo(int health, int attack, int movement, String name)
	{
		this.health = health;
		this.attack = attack;
		this.movement = movement;
		this.name = name;
		
		int maxXBoardSpace = battleBoard.length - 1;
		int maxYBoardSpace = battleBoard[0].length - 1;
		
		int randNumX, randNumY;
		
		do
		{
			randNumX = (int) (Math.random() * maxXBoardSpace);
			randNumY = (int) (Math.random() * maxYBoardSpace);
		} while(battleBoard[randNumX][randNumY] != '*');
			
			this.xPosition = randNumX;
			this.yPosition = randNumY;
			
			this.nameChar1 = this.name.charAt(0);
			
			battleBoard[this.yPosition][this.xPosition] = this.nameChar1;
			//battleBoard[this.xPosition][this.yPosition] = this.nameChar1;
			// The top line maps the monsters to a different location but the bottom line both maps the monster to a different location and displays its original position :D
			
			numOfMonsters++;
			
	}
	
	//Default Constructor
	
	public MonsterTwo()
	{
		numOfMonsters++;
	}
public static void main(String[] args)
{
		
}

}