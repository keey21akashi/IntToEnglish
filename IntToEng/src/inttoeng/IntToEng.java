package inttoeng;

import java.util.Scanner;

public class IntToEng {
	static String eng;

	//入出力を行う
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();
	        
	        if(input<=9){
	        System.out.println(translateEng(input));
	        }else if(input<=99){
		        System.out.println(translateEng2(input));
	        }

	}
    public static String translateEng2(int n) {//10〜99
    	
    	
    	return eng;
    }

    // 数値を英訳する変換するメソッド
    public static String translateEng(int n) {//0〜9
    	
    	
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
