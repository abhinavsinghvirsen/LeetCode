class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {

          List<String> result = new ArrayList<>();
        List<String> line = new ArrayList<>();
        int lineLength = 0;

        for (String word : words) {
            if (lineLength + line.size() + word.length() <= maxWidth) {
                line.add(word);
                lineLength += word.length();
            } else {
                int spacesToAdd = maxWidth - lineLength;
                if (line.size() == 1) {
                    result.add(line.get(0) + " ".repeat(spacesToAdd));
                } else {
                    int spacesBetweenWords = spacesToAdd / (line.size() - 1);
                    int extraSpaces = spacesToAdd % (line.size() - 1);
                    StringBuilder formattedLine = new StringBuilder();

                    for (int i = 0; i < line.size() - 1; i++) {
                        formattedLine.append(line.get(i));
                        formattedLine.append(" ".repeat(spacesBetweenWords));
                        if (i < extraSpaces) {
                            formattedLine.append(" ");
                        }
                    }

                    formattedLine.append(line.get(line.size() - 1));
                    result.add(formattedLine.toString());
                }

                line.clear();
                line.add(word);
                lineLength = word.length();
            }
        }

        // Handle the last line (left-justified).
        StringBuilder lastLine = new StringBuilder(String.join(" ", line));
        lastLine.append(" ".repeat(maxWidth - lastLine.length()));
        result.add(lastLine.toString());

        return result;
    }

   


        
    
}