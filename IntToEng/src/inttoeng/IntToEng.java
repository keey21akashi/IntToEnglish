package inttoeng;

import java.util.Scanner;

public class IntToEng {
	static String eng;

	//入出力を行う
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();
	        
	        
			if (input / 10 == 0) {//0~9,translateEng
				System.out.println(translateEng(input));
			} else if (input / 10 == 1) {//10~19,translateEng3
				System.out.println(translateEng3(input));
			} else if (input / 10 > 1 && input/10 <= 9) {//20~99,translateEng2+1
				System.out.println(translateEng2(input) + " " + translateEng(input));
			} else if (input % 100 == 0){//100の倍数
				System.out.println(translateEng(input) + " " + translateEng4(input));
			}else if(input % 100 >=  10 && input % 100 <= 19) {//下２桁が10~19
				System.out.println(translateEng(input) + " " + translateEng4(input) + " and " + translateEng3(input));
			}else if(input / 100 >= 1 && input / 100 < 10) {//上記以外の3桁
				System.out.println(translateEng(input) + " " + translateEng4(input) + " and " + translateEng2(input) + " " + translateEng(input%10));
			}else if (input % 1000 == 0) {//1000の倍数
				System.out.println(translateEng(input) + " " + translateEng5(input));
			}
	}
	public static String translateEng5(int n) {//1000
		eng = "thousand";
		return eng;	
	}
	public static String translateEng4(int n) {//100
		eng = "hundred";
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
	        	eng ="fifteen";
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
    	if(n>9 && n<100){
    		n /= 10;
    	}else if(n>99){
    		n /= 10;
    		n %= 10;
    	}
    	switch (n) {
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
        default:
        	eng ="";
    	}
    	return eng;
    }

    // 数値を英訳する変換するメソッド
    public static String translateEng(int n) {//0〜9
    	
    	if(n>9 && n<100){
    		n %= 10;
    	}else if(n>99 && n<1000){
    		n /= 100;
    	}else if(n>999 && n<10000){
    		n /= 1000;
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
        	eng ="";
        	}
        return eng;
    }

}

