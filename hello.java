import java.io.File;


public class Files {

	public static void main(String[] args) {
		File f1=new File ("D:/JavaTrainin/Day1/Files/src/Files.java");
		System.out.println("File Name "  +f1.getName());
		System.out.println("Full Name"  +f1.getPath());
		System.out.println("Parent" +f1.getParent());

		File f2=new File ("D:/JavaTrainin/Day1/Files/src");
			String[] flist=f2.list();
			for (String s : flist) {
				System.out.println(s);
			}
	}
}
