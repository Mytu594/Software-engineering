import java.util.Scanner;
public class lanhua {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = lanhua(s);
        System.out.println("�������Ϊ:"+n);
	}
	public static int lanhua(String str) {
		//�ж��Ƿ�Ϊ��
		if(str == null || str.equals("")) {
			System.out.println("�������󣬲�������ǿ��ַ�����");
			return 0;
		}
		//�ж��Ƿ�Ϊ��д��ĸ
		for(int i = 0;i < str.length();i++) {
			 if(!Character.isUpperCase(str.charAt(i))) {
				 System.out.println("�������󣬲�������Ǵ�д��ĸ��");
				 return 0;
			 }				 
		 }
		//�ж��ַ�������
		int len = str.length();
		if(len > 10000 || len == 0) {
			System.out.println("��������");
			return 0;
		}
		//����Ϊ����	
		if(len % 2 == 1){
			return 0;
		}
		//����Ϊż��
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
