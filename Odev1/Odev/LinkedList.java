package Odev;
import java.util.Scanner;
public class LinkedList {
	Node root;
	//int sayac=0;
	int size;
	int boyut;
	int boyut2;
	public  LinkedList insert (LinkedList list) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Listeye eklemek istediginiz elemani yaziniz: "); 
		String data=scan.nextLine();
		Node yeniDugum=new Node(data);
		//scan.close();
		if(list.root==null)
			list.root=yeniDugum;
		else 
		{
		Node iter=list.root;
		while(iter.next!=null)
			iter=iter.next;
		iter.next=yeniDugum;
		}
		return list;
	}
	public void indexofwanted(LinkedList list,String data) {
		Node iter=list.root;
		//bu fonksiyon scanner kullanılmadan istenilen elementin indeksini buluyor
		//indeks değeri 0 dan başlıyor ve son iki indeks için de doğru çalışıyor
		//String data3;
		//Scanner scan2= new Scanner(System.in);
	    //System.out.print("indeksini ogrenmek istediginiz elemani yaziniz: "); 
		//String data2=scan2.nextLine();
		//scan2.close();
		//data3=data2;
		//Node iter=list.root;
	for(int t=0;t<boyut;t++) {
		if(data==iter.data) {
			System.out.println();
			System.out.println(iter.data+" bagli listenin "+t+" . elemanidir ");
			break;
		}else {
			iter=iter.next;
		}
	}	
	}
	public void indexofwanted2(LinkedList list) {
		
		//son iki değer için yanlış çalışıyor
		//son indeksten öncekini değeri tutmasına rağmen yazdırmıyor atlıyor ve onun indis değerini son indiste yazdırıyor
		Node iter=list.root;
		//String data3;
		Scanner scan2= new Scanner(System.in);
		System.out.println();
	    System.out.print("indeksini ogrenmek istediginiz elemani yaziniz: "); 
		String data2=scan2.nextLine();
		scan2.close();
		//data3=data2;
		//Node iter=list.root;
	for(int t=0;iter!=null && t<boyut2;iter=iter.next,t++) {
		if(data2.equals(iter.data) ) {
			System.out.println();
			int sira=t;
			System.out.println(iter.data+" bagli listenin " +(sira+1)+ " . elemanidir ");
			break;
		}
		
	}	
	}
	
	
	public void print(LinkedList list) 
	{
		Node iter=list.root;
		int sayac=0;
		while(iter!=null) {
			System.out.print(iter.data+" ");
			iter=iter.next;
			sayac++;
			size=sayac;
			boyut=sayac;
			boyut2=sayac;
		}
		System.out.println();
		System.out.print(sayac+" tane eleman var ");
		System.out.println();
	}
	public void reversePrint(LinkedList list ) {
		int size2=size;
		for(int p=0;p<size2;p++) {
		Node iter=list.root;
			for(int k=1;k<size;k++) {
				iter=iter.next;
			}
			System.out.print(iter.data+" ");
			size --; }
	}

	public LinkedList removeat(LinkedList list,int index) { 
		if(index<0||index>=boyut) {
			System.out.println("Sayı bulunamadı"); // bunda da sınır dışı büyük sayılarda çalışıyor fakat sınır dışı negatif sayılarda mesajı yazdıktan sonra sayıları bir daha yazdırıyor(bug)
			//throw new IndexOutOfBoundsException(); //yaparak uyarı mesajı verebiliriz bu çalışıyor.
		}
		if(index==0) {
			list.root=list.root.next;
		}
		else {
		Node current=list.root;
		for(int i=0;i<index-1;i++) {
			current=current.next;
		}
		current.next=current.next.next;
		}
		
		size--;
		System.out.println();
		return list;
		
		
		
	}
	
	
	

} 
//ilkine bağlı olan curly bu satır 
