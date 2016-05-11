package StringExamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFind {

	public static void main(String[] args) {
		String s1 = "ABCDEFABCMNOPABCDEMNOPABCDEFMNOP";
		Pattern pat=Pattern.compile("CD");
		Pattern pat1=Pattern.compile("ABCD");
		Pattern pat2=Pattern.compile("MNOP");
		Matcher mat=pat.matcher(s1);
		Matcher mat1=pat1.matcher(s1);
		Matcher mat2=pat2.matcher(s1);
		
		int occurance=0;
		while(mat.find()){
			occurance++;
		}
		System.out.println(occurance);
		while(mat1.find()){
			occurance++;
		}
		System.out.println(occurance);
		while(mat2.find()){
			occurance++;
		}
		System.out.println(occurance);
	}

}
