package oop.labor09.labor9_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ArrayListDictionary d1 = ArrayListDictionary.newInstance();
//        System.out.println(d1.size());
//        d1.add("Samu");
//        System.out.println(d1.size());
//        System.out.println(d1.find("Samu"));
//        IDictionary dict = DictionaryProvider.createDictionary(DictionaryType.ARRAY_LIST);
//        System.out.println("Size: " + dict.size());
//        System.out.println("apple benne van? " + dict.find("apple"));
//        dict.add("samu");
//        System.out.println("samu benne van? " + dict.find("samu"));
//        DictionaryService service =
//                new DictionaryService(DictionaryType.ARRAY_LIST);
//        Scanner scanner = new Scanner(System.in);
//        while( true ) {
//            System.out.print("Word to find ( Enter <end> for exit): ");
//            String word = scanner.nextLine();
//            if( word.equalsIgnoreCase( "end")){
//                break;
//            }
//            System.out.println(" Find(" + word + "): " + service.findWord(word));
//        }
//        scanner.close();
        DictionaryService service =
                new DictionaryService(DictionaryType.ARRAY_LIST);
        System.out.println("Unknown words from a file: ");
        System.out.println( service.findWordsFile( "unknownWords.txt"));


    }

}
