package oop.labor09.labor9_2;

public interface IDictionary {
    static final String DICTIONARY_FILE = "dict.txt";
     boolean find(String word);
     boolean add(String word);
     int size();

}
