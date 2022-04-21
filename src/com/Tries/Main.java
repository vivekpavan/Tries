package com.Tries;

public class Main {

    public static void main(String[] args) {
        var trie = new Tries();
        trie.insert("pavan");
        trie.insert("ta");
        trie.insert("pan");
        trie.insert("pa");
        System.out.println(trie.contains("pav"));
        trie.traverse();
        trie.remove("book");
        System.out.println(trie.contains("pavan"));
        System.out.println(trie.contains("ta"));
        var word = trie.findWord(null);
        System.out.println(word);
    }
}
