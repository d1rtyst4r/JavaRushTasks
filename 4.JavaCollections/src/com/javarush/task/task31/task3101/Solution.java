package com.javarush.task.task31.task3101;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
Проход по дереву файлов
*/
public class Solution {
    public static void main(String[] args) throws Exception{
        File path = new File (args[0]);
        File resultFileAbsolutePath = new File (args[1]);
        File dest = new File(resultFileAbsolutePath.getParent()+ "/allFilesContent.txt");
        FileUtils.renameFile(resultFileAbsolutePath, dest);
        ArrayList<File> list = new ArrayList<>();
        try (FileOutputStream writer = new FileOutputStream(dest)) {




            Files.walkFileTree(path.toPath(), new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    if (file.toFile().length() > 50) {
                        FileUtils.deleteFile(file.toFile());
                    } else {
                        list.add(file.toFile());
                    }
                    return FileVisitResult.CONTINUE;
                }
            });

            Collections.sort(list, new Comparator<File>() {
                @Override
                public int compare(File o1, File o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });

            for (File file : list) {
                if (!file.equals(dest)) {
                    FileReader reader = new FileReader(file);
                    while (reader.ready()) writer.write(reader.read());
                    reader.close();
                    writer.write("\n".getBytes());
                }
            }

            writer.close();
        }

    }
}