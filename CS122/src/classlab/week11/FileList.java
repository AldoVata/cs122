package classlab.week11;


public class FileList {
	private FileDataNode list;
	
	public FileList()
	{
		list = null;
	}
	
	public void add(FilePart fp) {
		FileDataNode node = new FileDataNode(fp);
		FileDataNode current;

		if (list == null)
			list = node;
		else {
			current = list;
			while (current.next != null)
				current = current.next;
			current.next = node;
		}
	}
	
	public String toString() {
		String result = "";

		FileDataNode current = list;

		while (current != null) {
			result += current.file + " ---> ";
			current = current.next;
		}
		result += "---> null";

		return result;
	}


	
	private class FileDataNode {
		public FilePart file;
		public FileDataNode next;
	
		// --------------------------------------------------------------
		// Sets up the node
		// --------------------------------------------------------------
		public FileDataNode(FilePart mag) {
			file = mag;
			next = null;
		}
	}
}
