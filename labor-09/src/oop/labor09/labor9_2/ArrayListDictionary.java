package oop.labor09.labor9_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDictionary implements IDictionary {
    private ArrayList<String> words;

    private ArrayListDictionary() {
        words = new ArrayList<>();
        try (Scanner file = new Scanner(new File(IDictionary.DICTIONARY_FILE))) {
            while (file.hasNext()) {
                words.add(file.next());
                //Collections.sort(words);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }


    @Override
    public boolean find(String word) {
        return Collections.binarySearch(words, word) >= 0;
    }

    @Override
    public boolean add(String word) {
        if (!words.contains(word)) {
            words.add(word);
            Collections.sort(words);
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return words.size();
    }
    public static ArrayListDictionary newInstance(){
        return new ArrayListDictionary();
    }
}