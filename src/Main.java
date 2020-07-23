import java.io.File;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        findLargestFileCountDir(new File(new Scanner(System.in).nextLine()));
    }

    public static void findLargestFileCountDir(File baseDir) {
        int largestCountOfFiles = 0;
        String largestCountDirectory = "";
        File[] files = baseDir.listFiles();

        for (int i = 0; i < files.length; i++) {
            int count = Objects.requireNonNull(files[i].list()).length;
            if (count > largestCountOfFiles) {
                largestCountOfFiles = count;
                largestCountDirectory = files[i].getName();
            }
        }

        System.out.println(largestCountDirectory);
        System.out.println(largestCountOfFiles);
    }
}
