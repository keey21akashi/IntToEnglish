package inttoeng;

import java.util.Scanner;

public class IntToEng {
	static String eng;

	//入出力を行う
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();
	        
	       /* if(input<=9){
	        System.out.println(translateEng(input));
	        }else if(input<=99){
		        System.out.println(translateEng2(input));
	        }*/

			if (input / 10 == 0) {//0~9,translateEng
				//label.setText (translateEng(input));
				System.out.println(translateEng(input));
			} else if (input / 10 == 1) {//10~19,translateEng3
				//label.setText (printTeen(input));
				System.out.println(translateEng3(input));
			} else if (input / 10 > 1 && input/10 <= 9) {//20~99,translateEng2+1
				//label.setText(print2(input) + " "+ print1(input%10) );
				System.out.println(translateEng2(input) + " " + translateEng(input));
			} else if (input /10 >= 10){
				System.out.println(translateEng4(input));
			}
	}
	public static String translateEng4(int n) {//100
		eng = "one hundred";
		return eng;
		
	}
	public static String translateEng3(int n) {//11〜19
	    	
	    	
	    	switch (n%10) {
	    	case 0:
	        	eng ="ten";
	        	break;
	        case 1:
	        	eng ="eleven";
	        	break;
	        case 2:
	        	eng ="twelve";
	        	break;
	        case 3:
	        	eng ="thirteen";
	        	break;
	        case 4:
	    		eng ="fourteen";
	    		break;
	        case 5:
	        	eng ="fiveteen";
	        	break;
	        case 6:
	        	eng ="sixteen";
	        	break;
	        case 7:
	        	eng ="seventeen";
	        	break;
	        case 8:
	        	eng ="eighteen";
	        	break;
	        case 9:
	        	eng ="nineteen";
	        	break;
	        	}
	    	
	        return eng;
    }
    public static String translateEng2(int n) {//10〜99
    	switch (n/10) {
    	case 0:
    		break;
        case 2:
        	eng ="twenty";
        	break;
        case 3:
        	eng ="thirty";
        	break;
        case 4:
    		eng ="forty";
    		break;
        case 5:
        	eng ="fifty";
        	break;
        case 6:
        	eng ="sixty";
        	break;
        case 7:
        	eng ="seventy";
        	break;
        case 8:
        	eng ="eighty";
        	break;
        case 9:
        	eng ="ninety";
        	break;
    	}
    	return eng;
    }

    // 数値を英訳する変換するメソッド
    public static String translateEng(int n) {//0〜9
    	
    	if(n>9){
    		n %= 10;
    	}
    	switch (n) {
    	case 0:
    		eng ="zero";
    		break;
        case 1:
        	eng ="one";
        	break;
        case 2:
        	eng ="two";
        	break;
        case 3:
        	eng ="three";
        	break;
        case 4:
    		eng ="four";
    		break;
        case 5:
        	eng ="five";
        	break;
        case 6:
        	eng ="six";
        	break;
        case 7:
        	eng ="seven";
        	break;
        case 8:
        	eng ="eight";
        	break;
        case 9:
        	eng ="nine";
        	break;
        default:
        	eng ="?";
        	}
    	
    	
    	
        return eng;
    }

}
