package projects.project2;
//********************************************************************
//  Magazine.java       Author: Lewis/Loftus
//
//  Represents a single magazine.
//********************************************************************

public class Magazine {
	private final String title;

	// -----------------------------------------------------------------
	// Sets up the new magazine with its title.
	// -----------------------------------------------------------------
	public Magazine(String newTitle) {
		title = newTitle;
	}

	// -----------------------------------------------------------------
	// Returns this magazine as a string.
	// -----------------------------------------------------------------
	public String toString() {
		return title;
	}
	
	public boolean equals(Object other) {
		return this.title.equals(((Magazine)other).title);
	}
}
