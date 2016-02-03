import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

public class DirectoryScanner {

    List<File> result= new ArrayList<File>();

    public void collect(File file) {
        File[] files = file.listFiles(new MP3Filter());

        if( files.length > 0) {
            for (File f : files) {
                if(f.isDirectory()) {collect(f);}
                else {result.add(f);
                }
            }
        }
    }

    class MP3Filter implements FileFilter {
        @Override
        public boolean accept (File f) {return f.getName().endsWith(".jpg") || f.isDirectory();}
    }

    public static void main(String[] args) {
        File directory = new File("C:\\GDrive");
        DirectoryScanner ds = new DirectoryScanner();
        ds.collect(directory);
        for(File file : ds.result) {System.out.println(file.getAbsolutePath());
        }
    }
}