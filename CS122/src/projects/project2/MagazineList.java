package projects.project2;
//*******************************************************************
//  MagazineList.java       Author: Lewis/Loftus
//
//  Represents a collection of magazines.
//*******************************************************************

public class MagazineList {
	private MagazineNode list;

	// ----------------------------------------------------------------
	// Sets up an initially empty list of magazines.
	// ----------------------------------------------------------------
	public MagazineList() {
		list = null;
	}

	// ----------------------------------------------------------------
	// Creates a new MagazineNode object and adds it to the end of
	// the linked list.
	// ----------------------------------------------------------------
	public void add(Magazine mag) {
		MagazineNode node = new MagazineNode(mag);
		MagazineNode current;

		if (list == null)
			list = node;
		else {
			current = list;
			while (current.next != null)
				current = current.next;
			current.next = node;
		}
	}

	// ----------------------------------------------------------------
	// Returns this list of magazines as a string.
	// ----------------------------------------------------------------
	public String toString() {
		String result = "";

		MagazineNode current = list;

		while (current != null) {
			result += current.magazine + "\n";
			current = current.next;
		}

		return result;
	}

	
	public void addToFront(Magazine mag) {
		this.add(mag);	
	}
	
	
	public void addToEnd(Magazine mag) {
		MagazineNode newNode = new MagazineNode(mag);
		newNode.next = list;
		list = newNode;
	}
	
	public void removeFirst() {
		MagazineNode current = list;
		if(current == null)
			return;
		MagazineNode temp = current;
		current = temp.next;
		list = current;
	}
	
	public void removeLast() {
		MagazineNode current = list;
		if(current == null)
			return;
		else if(current.next == null) {
			list = null;
			return;
		}
		while(current.next.next != null)
			current = current.next;
		current.next = null;
	}
	
	public void replace(Magazine oldMag, Magazine newMag) {
		MagazineNode oldNode = new MagazineNode(oldMag);
		MagazineNode newNode = new MagazineNode(newMag);
		
		if(oldMag == null || newMag == null|| list == null)
			return;
		if(oldMag.equals(list.magazine))
		{
			newNode.next = oldNode.next;
			list = newNode;
		}
		else {
			MagazineNode current = list;
			while(!current.magazine.equals(oldMag)) {
				current = current.next;
			}
			MagazineNode temp = oldNode.next;
			oldNode = newNode;
			newNode.next = temp;
		}
	}
	public void print() {
		MagazineNode current = list;
		for(int i = 1; current != null; i++) {
			System.out.println("["+i+"] "+current.magazine);
			current = current.next;
		}
	}
	// *****************************************************************
	// An inner class that represents a node in the magazine list.
	// The public variables are accessed by the MagazineList class.
	// *****************************************************************
	private class MagazineNode {
		public Magazine magazine;
		public MagazineNode next;

		// --------------------------------------------------------------
		// Sets up the node
		// --------------------------------------------------------------
		public MagazineNode(Magazine mag) {
			magazine = mag;
			next = null;
		}
	}
}
