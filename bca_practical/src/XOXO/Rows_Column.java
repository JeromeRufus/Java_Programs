package XOXO;

public class Rows_Column {
	
	char[][] arr = new char[3][3];
	
	public void Display (char arr[][]) {
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("|"+arr[i][j]);
			}
			System.out.println("|");
		}	
	}
	
	public void Replace(char arr2[][],char replace,char find) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(arr2[i][j] == replace) {
					arr2[i][j] = find;
					
				}
			}
		}	
	}
	public boolean checkforWin() {
		if(checkRow() || checkColumn() || checkDiagonal()) {
			return true;
		}
			return false;
		
	}
	public boolean check(char c1,char c2,char c3) {
		return(c1 == c2) && (c2 == c3);
	}
	public boolean checkRow() {
		for(int i=0;i<3;i++) {
			if(check(arr[i][0], arr[i][1] , arr[i][2]) == true) {
				return true;
			}
		}
		return false;
		
	}
	public boolean checkColumn() {
		for( int i=0;i<3;i++) {
			if(check(arr[0][i], arr[1][i] , arr[2][0]) == true) {
				return true;
			}
			
		}
				return false;
		
	}
	public boolean checkDiagonal() {
		if(check(arr[0][0],arr[1][1],arr[2][2]) == true || check(arr[0][2],arr[1][1],arr[2][0]) == true) {
			return true;
		}
		else {
			return false;
		}
	}
		
}
