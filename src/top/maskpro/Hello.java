package top.maskpro;

/**
 * @author Mask
 * @version 5.0 --Final
 */

import java.util.Scanner;

public class Hello {

	public static void showStar() {
		System.out.println("******************************");
	}
	
	public static void start(short arr[]) {
		//TODO
		Scanner arrSc = new Scanner(System.in);
		System.out.println("Input five num:");
		for(int i = 0;i < arr.length;i++) {
			arr[i] = arrSc.nextByte();
		}
		System.out.println("Numbers are:");
		for(short b:arr) {
			System.out.print(b + " ");
		}
		System.out.println();
	}
	
	public static void showDate(short arr[]) {
		System.out.println("Dates are:");
		for(short b:arr) {
			System.out.print(b + " ");
		}
		System.out.println();
	}
	
	public static void divThree(short arr[]) {
		System.out.println("Numbers are:");
		for(short b:arr) {
			if(b % 3 == 0) {
				System.out.print(b + " ");
			}
		}
		System.out.println();
	}
	
	public static void insert(short pos,short date,short arr[]) {
		arr[pos] = date;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short arr[] = {1,2,3,4,5};
		Scanner sc = new Scanner(System.in);

		while(true) {
			showStar();
			System.out.println("1--初始化数据");
			System.out.println("2--显示数据");
			System.out.println("3--在指定位置插入数据");
			System.out.println("4--查询能被3整除的数字");
			System.out.println("0--退出");
			showStar();
			System.out.print("Input:");
			short num = sc.nextByte();
			if(num==0) {
				System.out.println("Over");
				break;
			}
			else if(num==1) {
				start(arr);
			}
			else if(num==2) {
				showDate(arr);
			}
			else if(num==3) {
				System.out.println("Input pos:");
				short pos = sc.nextShort();
				System.out.println("Input date:");
				short date = sc.nextShort();
				insert(pos,date,arr);
			}
			else if(num==4) {
				divThree(arr);
			}
			else {
				System.out.println("Error");
			}
		}
	}
}
