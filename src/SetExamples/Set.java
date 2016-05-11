package SetExamples;
import java.util.*;
public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> mySet= new HashSet<String>();
		mySet.add("A");
		mySet.add("B");
		mySet.add("C");
		mySet.add("D");
		mySet.add("A");
		
		System.out.println("mySet"+ mySet);
		
		List<String> list = new LinkedList<String>();
		
		list.add("A");
		list.add("C");
		list.add("A");
		list.add("A");
		list.add("B");
		list.add("C");
		
		HashSet<String> mySet2 = new HashSet<String>(list);
		System.out.println("list"+list);
		System.out.println("mySet2"+mySet2);
System.out.println("mySet matches mySet2:"+ (mySet.equals(mySet2)));
		Iterator<String> itr= mySet.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		for(String str :mySet){
			System.out.println(str);
		}
		System.out.println("printing the elements in myset2");
			Iterator<String> itr1= mySet2.iterator();
			while(itr1.hasNext()){
				System.out.println(itr1.next());
			}
			System.out.println("by using for each loop");
			
			for(String str1:mySet2){
				System.out.println(str1);
			}
	}

}
