import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author jgsha
 *
 */
public class LinkedListLab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<String>();
		LinkedList<String> list2 = new LinkedList<String>();
		LinkedList<String> list2deepCopy = new LinkedList<String>();
		ListIterator<String> list1iter = list1.listIterator();
		int nextIndex = 0;
		
		list1.add("Tulsa");
		list1.add("Ada");
		list1.add("Broken Arrow");
		list1.add("Owasso");
	
		list1.add(1, "OKC");
		System.out.println("List 1: " + list1);
		System.out.println();
		
		list2.add("74104");
		list2.add("74135");
		list2.add("foo");
		list2.add("hello world");
		list2.add("777");
		System.out.println("List 2: " + list2);
		System.out.println();
		
		list1.addAll(list2);
		System.out.println("List 1 after merge:\n" + list1);
		System.out.println();
		
		for(int x = 1;list1iter.hasNext(); x++) {
		
			if(x>list1.size())
				break;
			
			nextIndex = list1iter.nextIndex() + x;
			
			list1.remove(nextIndex);
		}
		
		System.out.println("List 1 after deleting: " + list1);
		System.out.println();
		
		System.out.println("List 2: " + list2);
		System.out.println();
		
		for(int x = 0; x < list2.size(); x++)
			list2deepCopy.add(list2.get(x));
		
		System.out.print("Deep copy: ");
		System.out.println(list2deepCopy);
		
	}

}
