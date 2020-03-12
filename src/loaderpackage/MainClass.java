package loaderpackage;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args)  {
		System.out.println("Введите класс для загрузки");
		Scanner scanner = new Scanner(System.in);
		String className = scanner.next();
		MyClassLoader loader = new MyClassLoader();
		try {
			Class<?> c = loader.findClass("loaderpackage." + className);
		}
		catch(Exception e){
			System.out.println("Такого класса нет");
			return;
		}
		System.out.println("Класс загружен");
	}

}
