import java.util.Scanner;
public class lanhua {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = lanhua(s);
        System.out.println("变异次数为:"+n);
	}
	public static int lanhua(String str) {
		//判断是否为空
		if(str == null || str.equals("")) {
			System.out.println("输入有误，不能输入非空字符串！");
			return 0;
		}
		//判断是否为大写字母
		for(int i = 0;i < str.length();i++) {
			 if(!Character.isUpperCase(str.charAt(i))) {
				 System.out.println("输入有误，不能输入非大写字母！");
				 return 0;
			 }				 
		 }
		//判断字符串长度
		int len = str.length();
		if(len > 10000 || len == 0) {
			System.out.println("输入有误！");
			return 0;
		}
		//长度为奇数	
		if(len % 2 == 1){
			return 0;
		}
		//输入为偶数
		else {
			String str1 = str.substring(0,len/2);
			String str2 = str.substring(len/2,len);
			boolean flag = true;
			for(int i = 0;i < len/2 ; i++) {
				if(str1.charAt(i) != str2.charAt(len/2 - i - 1)) {
					flag = false;
					break;
				}
			}
			if(flag) {
				return lanhua(str1) + 1;
			}else {
				return 0;
			}
		}		
	}	
}
