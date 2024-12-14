package week3.day4;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetCompany {

	public static void main(String[] args) {
		
		String companyName = "google";
		char company1[]=companyName.toCharArray();
		System.out.println(Arrays.toString(company1));
		

		Set<Character> comp =new LinkedHashSet<Character>();
		
		for(int i=0; i<company1.length;i++)
		{
	    comp.add(company1[i]);
		System.out.println(company1);
		
	}
	}

}
