import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
public class LessonEight {
	
	public static void main(String[] args)
	{
		
		MonsterTwo.buildBattleBoard();
		
		char[][] tempBattleBoard = new char [10][10];
		
		// ObjectName[] ArrayName = new ObjectName[4];
		
		MonsterTwo[] Monsters = new MonsterTwo[4];
		
		// MonsterTwo(int health, int attack, int movement, String name
		
		Monsters[0] = new MonsterTwo(1000,20,1,"Drake");
		Monsters[1] = new MonsterTwo(500,40,2,"Josh");
		Monsters[2] = new MonsterTwo(1000,20,1,"Megan");
		Monsters[3] = new MonsterTwo(1000,20,1,"Jake");
		
		MonsterTwo.redrawBoard();
	}
	
}