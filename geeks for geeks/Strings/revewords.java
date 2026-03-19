class Solution {
    public String reverseWords(String s) {
        // Code here
        String[] words = s.split("\\.+");
        
        List<String> wordList = new ArrayList<>();
        
        for (String word : words)
        {
            if(!word.isEmpty())
            {
                wordList.add(word);
            }
        }
        Collections.reverse(wordList);
        return String.join("." , wordList);
    }
}