import java.util.HashMap;


public class WordCounter implements Interface {
    HashMap<String, Integer> sentenceMap = new HashMap<>();

    @Override
    public void count(String sentence) {

        int oneValue = 1;
        sentence = sentence.toUpperCase();
        String[] split = sentence.split("[ ,./;']");

        for (int i = 0; i < split.length; i++) {
            if (!sentenceMap.containsKey(split[i])) {

                sentenceMap.put(split[i], oneValue);
            } else {
                sentenceMap.put(split[i], sentenceMap.get(split[i]) + 1);
            }

        }

    }

    @Override
    public int getCount(String word) {

        if (sentenceMap.get(word.toUpperCase()) == null) {
            return 0;
        }
        return sentenceMap.get(word.toUpperCase());
    }

}

