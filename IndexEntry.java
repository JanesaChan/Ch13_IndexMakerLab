import java.util.*;

public class IndexEntry {

	private String word;
	private ArrayList<Integer> numsList;
	
	public IndexEntry(String givenWord){
		word = givenWord.toUpperCase();
		numsList = new ArrayList<Integer>();
	}
	
	public void add(int num){
		if (numsList.contains(num) == true){
			return;
		}else{
			numsList.add(num);
		}
	}
	
	public String getWord(){
		return word;
	}
	
	public String toString(){
		return (word + numsList);
	}
	
}
