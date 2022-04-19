import java.io.File;
import java.io.FilenameFilter;

public class Ext implements FilenameFilter {
	String extention=".java";
	

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(extention);
	}
	

}
