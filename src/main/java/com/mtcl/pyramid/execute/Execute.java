package com.mtcl.pyramid.execute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.mtcl.pyramid.util.CreatePyramid;

public class Execute {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Integer:");
		Integer n = 0;
		try {
			n = Integer.parseInt(br.readLine());
		} catch (NumberFormatException nfe) {
			System.err.println("Invalid Format!");
		}

		CreatePyramid cp = new CreatePyramid();
		System.out.println("Total of the min values is: " + cp.create(n));
	}

}
