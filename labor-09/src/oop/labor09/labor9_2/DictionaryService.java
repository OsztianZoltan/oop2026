package oop.labor09.labor9_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryService {
   private IDictionary dictionary;

    public DictionaryService(DictionaryType dictionaryType) {
       dictionary = DictionaryProvider.createDictionary(dictionaryType);
    }
    public boolean findWord(String word){
        return dictionary.find(word);
    }
    public ArrayList<String> findWordsFile(String fileName) {
        ArrayList<String> unknownWords = new ArrayList<>();
        try (Scanner file = new Scanner(new File(fileName))) {
            while (file.hasNext()) {
                String word = file.next();
                if (!dictionary.find(word)) {
                    unknownWords.add(word);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        return unknownWords;
    }
}
