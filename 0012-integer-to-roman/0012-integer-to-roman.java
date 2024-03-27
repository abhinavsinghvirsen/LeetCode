class Solution {
    public String intToRoman(int num) {
        List<String> symbols = List.of("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I");
        List<Integer> values = List.of(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1);

        StringBuilder result = new StringBuilder();
        int i = 0;

        while (num > 0) {
            while (num >= values.get(i)) {
                num -= values.get(i);
                result.append(symbols.get(i));
            }
            i++;
        }

        return result.toString();
    }
}