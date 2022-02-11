import java.util.Scanner;

public class test {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        //String [] strArr= s.split(""); 
        is_symmetric(s);
        int n = symmetric(s);
        System.out.println(n);
	}
	 public static void is_symmetric(String s) {
		 
		 int count = (s.length()-1)/2;
			
			for(int x = 0;x <= count;x++){
				if(s.charAt(x) != s.charAt(s.length()-1-x)){
					System.out.println("¸Ã×Ö·û´®²»¶Ô³Æ");
					break;
				}else{
					System.out.println("¸Ã×Ö·û´®¶Ô³Æ");
					break;
				}
			}	
	 }
	 public static int symmetric(String str) {
		 boolean flag = true;
		 for(int i = 0;i < str.length();i++) {
			 if(!Character.isUpperCase(str.charAt(i)))
				 flag = false;
		 }
		 int count = 0;
		 int len = str.length();
		 while(len > 0 && flag == true) {
			 if(Count(str,len)==true) {
				 count++;
				 len /=2;
			 }else
				 break;
		 }
		 return count;
	 }

	private static boolean Count(String str, int len) {
		String str1 = str.substring(0,len/2);
		String str2= str.substring(len/2,len);
		StringBuilder sub = new StringBuilder(str2);
		if(str1.equals(sub.reverse().toString()))
			return true;
		return false;
	}
}