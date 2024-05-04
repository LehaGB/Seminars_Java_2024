package seminar_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task_05 {

    private static Logger logger = Log.log(Task_05.class.getName());

    public static void main(String[] args) {
        String path = ".";
        System.out.println(Arrays.toString(getFileNamesInDir(path)));
        writeFilesNamesToFiles(path, "Task_05.txt");
    }

    public static String[] getFileNamesInDir(String path) {
        File dir = new File(path);
        String[] result = new String[0];
        File[] files;
        if (dir.isDirectory()) {
            files = dir.listFiles();
            if (files != null) {
                result = new String[files.length];
                for (int i = 0; i < files.length; i++) {
                    File f = files[i];
                    String fileName = f.getName();
                    result[i] = fileName;
                }
            }
        } else {
            System.out.println(dir.getName() + " Не является папкой");
        }
        return result;
    }

    public static void writeFilesNamesToFiles(String outPath, String inPath) {
        String[] array = getFileNamesInDir(outPath);
        try {
            FileWriter fw = new FileWriter(inPath, true);
            for (int i = 0; i < array.length; i++) {
                fw.write(array[i] + "\n");
            }
            fw.flush();
            if (isThrow()) {
                throw new IOException("Фатальная ошибка записи");
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи");
            logger.log(Level.INFO, "Привет, Мир!");
        }

    }

    private static boolean isThrow() {
        int a = 0;
        int b = 2;
        int digit = a + (int) (Math.random() * b);
        System.out.println(digit);
        return digit > 0;
    }
}
