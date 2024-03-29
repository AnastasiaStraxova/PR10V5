/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pr1.v5;

import java.io.File;

/**
 *
 * @author ПК
 */
public class FileAndCatalogueSearchService {
    public static void scanDirectory(File directory, int depth) {
        System.out.println(getIndent(depth) + "d: " + directory.getName());

        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    scanDirectory(file, depth + 1);
                } else {
                    System.out.println(getIndent(depth + 1) + "f: " + file.getName() + " " + file.length() + " bytes");
                }
            }
        }
    }

    private static String getIndent(int depth) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            indent.append("  ");
        }
        return indent.toString();
    }
}
