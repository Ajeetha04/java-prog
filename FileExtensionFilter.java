/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ashwi
 */
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileExtensionFilter {

    public static void main(String[] args) {

        String folderPath = "/C://Users//ashwi//OneDrive//Desktop//New folder (2)/";
        String extension = "txt";
        List<File> filteredFiles = getFilesWithExtension(folderPath, extension);
        System.out.println("Files with extension \".txt\" in the folder: " + folderPath);
        for (File file : filteredFiles) {
            System.out.println(file.getName());
        }
    }

    private static List<File> getFilesWithExtension(String folderPath, String extension) {
        List<File> result = new ArrayList<>();
        File folder = new File(folderPath);
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile() && file.getName().toLowerCase().endsWith("." + extension.toLowerCase())) {
                        result.add(file);
                    }
                }
            }
        } else {
            System.err.println("Specified folder does not exist or is not a directory.");
        }

        return result;
    }
}

