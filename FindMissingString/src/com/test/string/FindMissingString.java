package com.test.string;

import java.util.Scanner;

public class FindMissingString {

	private static Scanner s;

	public static void main(String[] args) {

		s = new Scanner(System.in);

		System.out.println("Enter First String :");
		String fs = s.nextLine();
		System.out.println("Enter Second String :");
		String ss = s.nextLine();

		String dif[] = showMissing(fs, ss);

		for (int i = 0; i < dif.length; i++) {
			System.out.println(dif[i] + " ");
		}

	}

	private static String[] showMissing(String fs, String ss) {
		String f[] = fs.split(" ");
		String s[] = ss.split(" ");
		int ldif = f.length - s.length;

		String dif[] = new String[ldif];
		String temp = "";
		int k = 0;
		for (int i = 0; i < f.length; i++) {
			int count = 0;

			for (int j = 0; j < s.length; j++) {
				if (f[i].equalsIgnoreCase(s[j])) {
					count=0;
					break;
				} else {
					count++;
					temp = f[i];
				}

			}
			if (count != 0) {
				dif[k] = temp;
				k++;
			}
		}

		return dif;
	}

}
