package loaderpackage;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args)  {
		System.out.println("������� ����� ��� ��������");
		Scanner scanner = new Scanner(System.in);
		String className = scanner.next();
		MyClassLoader loader = new MyClassLoader();
		try {
			Class<?> c = loader.findClass("loaderpackage." + className);
		}
		catch(Exception e){
			System.out.println("������ ������ ���");
			return;
		}
		System.out.println("����� ��������");
	}

}
