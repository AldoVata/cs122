package classlab.week11;


public class FileDriver {
	public static void main(String[] args) {
		FileList rack = new FileList();

		rack.add(new FilePart(7));
		rack.add(new FilePart(19));
		rack.add(new FilePart(2));
		rack.add(new FilePart(32));
		rack.add(new FilePart(12));

		System.out.println(rack);
	}
}
