package skyScraper;

import java.util.*;
import java.util.Stack;

public class Service {

		private static final Stack<Integer> stack = new Stack<Integer>();
		private static final Scanner sc = new Scanner(System.in);

		public void insertValue(int size) {
			for (int index = 1; index <= size; index++) {
				System.out.print("Enter the floor size given on day " + (index) + " : ");
				int value = sc.nextInt();

				if (stack.contains(value)) {
					System.out.println("You have already added this Size \n");
					index--;
				} else if (value > 0 && value <= size) {
					stack.push(value);
				} else {
					System.out.println("Floor size should be greater than Zero or smaller than " + size + "\n");
					index--;
				}
			}
		}
		
		public void orderOfConstruction(int size) {

			System.out.println("The order of construction is as follows:");
			boolean flag;
			int indexOfArray = size;
			for (int index = 0; index < size; index++) {
				flag = false;
				System.out.println("Day " + (index + 1) + " : ");
				while (indexOfArray >= 1 && stack.indexOf(indexOfArray) <= index) {
					flag = true;
					System.out.print(indexOfArray + " ");
					indexOfArray--;
				}

				if (flag == true || flag == false) {
					System.out.println("");
				}
			}
		}

		public void line() {
			System.out.println("\n--------------------");
		}

		public int GetUserInput() {
			System.out.print("Enter the total no of floors in the building : ");
			int size = sc.nextInt();
			return size;
		}
	}


