package Odev;

public class Main {

	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		list=list.insert(list);
		list=list.insert(list);
		list=list.insert(list);
		list=list.insert(list);
		list=list.insert(list);
		//list=list.insert(list,"f");
		//list=list.insert(list,"g");
		list.print(list);
		//list.indexofwanted(list);
		list.reversePrint(list);
		//list.indexofwanted(list,"d");//ilk eleman 0. indis
		
		//list.indexofwanted2(list); //ilk eleman 1. indis
		
		//list=list.removeat(list,4); //ilk eleman 0. indis 
		//list.print(list);
		list.indexofwanted2(list); //ilk eleman 1. indis
		list=list.removeat(list,3); //ilk eleman 0. indis 
				list.print(list);
		
	}

}
