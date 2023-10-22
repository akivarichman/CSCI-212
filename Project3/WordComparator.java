import java.util.Comparator;

public class WordComparator implements Comparator <Word> {
    public int compare(Word newer, Word older) {
        return newer.compareTo(older);
    }
}