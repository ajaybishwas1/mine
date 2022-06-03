package wordScrambler;

import java.util.Scanner;

public class Wor {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		
		String newsentence = "";
		String words[] = sentence.split(" ");
		
		for(int i=0; i<words.length;i++)
		{
			String newword="";
			if(i%2==0) {
				newword+=words[i].charAt(0);
				if(words[i].length()==1) {
					newsentence+=words[i]+" ";
					continue;
				}
				String sortword = words[i].substring(1,words[i].length()-1);
				
				Character character[] = new Character[sortword.length()];
				for(int j=0;j<sortword.length();j++) {
					character[j]=sortword.charAt(j);
				}
				
				for(int j=0;j<character.length;j++) {
					for(int k=0;k< character.length;k++) {
						if(character[j].compareTo(character[k])>0) {
							char temp = character[j];
							character[j]= character[k];
							character[k]= temp;
						}
					}
				}
				
				for(int l =0;l<character.length;l++) {
					newword +=character[l];
				}
					
				newword += words[i].charAt(words[i].length()-1);
			} else {
				newword += words[i].charAt(0);
				String sortword = words[i].substring(1,words[i].length()-1);
				
				if(words[i].length()==1) {
					newsentence+=words[i]+" ";
					continue;
				}
				
				Character character[] = new Character[sortword.length()];
				for(int j=0;j<sortword.length();j++) {
					character[j]=sortword.charAt(j);
				}
				
				for(int j=0;j<character.length;j++) {
					for(int k=0;k< character.length;k++) {
						if(character[j].compareTo(character[k])>0) {
							char temp = character[j];
							character[j]= character[k];
							character[k]= temp;
						}
					}
				}
				
				for(int l =character.length-1;l>=0;l--) {
					newword +=character[l];
				}
					
				newword += words[i].charAt(words[i].length()-1);
			}
			
			newsentence += newword;
			if(i< words.length -1) {
				newsentence += " ";
			}
		}
		System.out.println(newsentence);
	}

}
