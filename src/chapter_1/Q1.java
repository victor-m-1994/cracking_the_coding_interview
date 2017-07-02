package chapter_1;

import java.util.Hashtable;

public class Q1 {
	//Find if string is unique
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
	}

	private boolean isUnique(String string){
		Hashtable<String, String> hashTable = new Hashtable<String, String>();
		for(int i = 0; i < string.length(); i++){
			if(hashTable.containsKey(string.charAt(i))){
				return false;
			}else{
				hashTable.put(Character.toString(string.charAt(i)), Character.toString(string.charAt(i)));
			}
		}
		return true;
	}
}
