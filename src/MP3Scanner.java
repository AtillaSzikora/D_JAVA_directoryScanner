import java.util.ArrayList;

public class MP3Scanner extends DirectoryScanner{
    int p;

    public MP3Scanner(int p) {
        this.p = p;
        super.equals(this);
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("MP3Scanner.equals()");
        return super.equals(obj);
    }
}
