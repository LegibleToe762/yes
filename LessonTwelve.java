import java.util.Arrays;
import java.util.LinkedList;

public class LessonTwelve{
	
	public static void main(String[] args){
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.add("Shreya Shah");
		names.add("Sam Williams");
		
		names.addLast("Nathan Martin");
		
		names.addFirst("Joshua Smith");
		
		names.add(0, "Noah Peters");
		
		names.set(2, "Paul Heyman");
		
		names.remove(4);
		names.remove("Joshua Smith");
		
		
		for(String name:names){
			
			System.out.println(name);
		}
		
		System.out.println("\nFirst Index: " + names.get(0));
		
		System.out.println("\nLast Index: " + names.getLast());
		
		LinkedList<String> nameCopy = new LinkedList<String>(names);
		
		System.out.println("\nnameCopy: " + nameCopy);
		
		if(names.contains("Noah Peters")){
			System.out.println("\nNoah's here.");
		}
		
		if(names.containsAll(nameCopy)){
			System.out.println("\nCollections the Same");
		}
		
		System.out.println("\nSam index at: " + names.indexOf("Sam Williams"));
		
		System.out.println("\nList Empty: " + names.isEmpty());
		System.out.println("\nHow Many: " + names.size());
		System.out.println("\nremove first element: " + nameCopy.poll());
		System.out.println("\nremove last element: " + nameCopy.pollLast());
		
		nameCopy.push("Noah Peters");
		nameCopy.pop();
		

		for(String name:nameCopy){
			
			System.out.println(name);
		}
		
		Object[] nameArray = new Object[4];
		
		nameArray = names.toArray();
		
		System.out.println(Arrays.toString(nameArray));
		
		names.clear();
		System.out.println(names);
		
	}
}