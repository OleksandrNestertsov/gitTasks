package main.java.com.alevel.alevelClassWorks.booksArray;

import java.util.Arrays;
import java.util.Scanner;

public class BooksArray {
    public static void main(String[] args) {
        String[][] books = {{"chapter1", "chapter2"}, {"3, 4"}};

        Scanner scanner = new Scanner(System.in);
        String chapter = scanner.nextLine();

        int chapterIndex = 0;
        int volumeIndex = 0;

        for (int i = 0; i < books.length; i++) {
            Arrays.sort(books[i]);
            chapterIndex = Arrays.binarySearch(books[i], chapter);
            volumeIndex = i;
            break;
        }

        if (chapterIndex < 0) {
            System.out.println("Chapter is missing");
        } else {
            System.out.println("Chapter index:" + chapterIndex);
            System.out.println("Volume index:" + volumeIndex);

        }
    }


}

