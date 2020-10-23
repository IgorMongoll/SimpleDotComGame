/*import test_project_package.SimpleDotCom;
*/

/*
public class SimpleDotCom {

int [] locationCells;
int numOfHits=0;

public void setLocationCells(int[] locs){
	locationCells=locs;
}


public String checkYouself(String stringGuess) {
	int guess=Integer.parseInt(stringGuess);
	String result="OUT";
	for(int cell:locationCells) {
		if(guess==cell) {
			result="IN";
			numOfHits++;
			break;
		} 
 }
	if (numOfHits==locationCells.length) {
		result="DOWN";
	}

	System.out.println(result);
	return result;
}

*/

/*

public class SimpleDotComTestDrive{

	public static void main (String[] args) {
		SimpleDotCom dot=new SimpleDotCom();
		int[] locations= {2,3,4};
		dot.setLocationCells(locations);
		String userGuess="2";
		String result=dot.checkYouself(userGuess);
		
	}
		
	
		// TODO Auto-generated method stub

	}

}


*/



public class SimpleDotComTestDrive {

	public static void main(String[] args) {
	
		SimpleDotCom dot=new SimpleDotCom();
		int[] locations= {2,3,4};
		dot.setLocationCells(locations);
		String userGuess="2";
		String result=dot.checkYouself(userGuess);
		
		
		System.out.println("NNNN");

	}

	
	public class SimpleDotCom {

		int [] locationCells;
		int numOfHits=0;

		public void setLocationCells(int[] locs){
			locationCells=locs;
		}


		public String checkYouself(String stringGuess) {
			int guess=Integer.parseInt(stringGuess);
			String result="OUT";
			for(int cell:locationCells) {
				if(guess==cell) {
					result="IN";
					numOfHits++;
					break;
				} 
		 }
			if (numOfHits==locationCells.length) {
				result="DOWN";
			}

			System.out.println(result);
			return result;
		}
		}
	}

