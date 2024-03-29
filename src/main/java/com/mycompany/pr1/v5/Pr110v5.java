/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pr1.v5;

import static com.mycompany.pr1.v5.FileAndCatalogueSearchService.scanDirectory;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author ПК
 */
public class Pr110v5 {

    public static void main(String[] args) {
        System.out.println("Страхова Анастасия РИБО-02-22 Вариант 5");
        System.out.println("Программа для сканирования файлов и каталогов");

        Scanner scanner = new Scanner(System.in);
        File directory;

        do {
            System.out.print("Введите путь к каталогу: ");
            String directoryPath = scanner.nextLine();
            directory = new File(directoryPath);

            if (!directory.exists() || !directory.isDirectory()) {
                System.out.println("Указанный путь не является действительным каталогом. Пожалуйста, попробуйте снова.");
            }
        } while (!directory.exists() || !directory.isDirectory());

        scanDirectory(directory, 0);

        scanner.close();
    }
}

