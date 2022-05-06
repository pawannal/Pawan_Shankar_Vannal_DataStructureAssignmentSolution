package com.GL.Fsd.Project.skyscraper.Q1;

import java.util.*;

public class skyscraper {

	public static void main(String[] args) {
		System.out.println("\t\t\t\t*********Welcome ABC Buliders************");
		System.out.println("Enter the total no of floors in the building :");
		int N;
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		int arr[] = new int[N];
		int k = 0;
		int current_floor = N;

		for (int i = 1; i <= N; i++) {
			System.out.println("Enter the floor size given on day: " + i);
			int floor;
			floor = scan.nextInt();
			if (floor < current_floor) {
				arr[k++] = floor;
			} else if (floor == current_floor) {
				System.out.println(current_floor);
				int j;
				for (j = current_floor - 1; j >= 0; j--) {
					int flag = 1;
					for (int m = 0; m < k; m++) {
						if (arr[m] == j) {
							System.out.println(j);
							flag = 0;
							break;
						}
					}
					if (flag == 1)
						break;
				}
				current_floor = j;
			}
		}

	}
}
