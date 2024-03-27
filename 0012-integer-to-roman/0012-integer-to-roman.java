class Solution {
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        // Create a TreeMap to store the values and their corresponding Roman numeral symbols in descending order
        TreeMap<Integer, String> map = new TreeMap<>((a, b) -> b - a);
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

       
        for (int value : map.keySet()) {
            while (num >= value) {
                num -= value;
                result.append(map.get(value));
            }
        }
        return result.toString();
    }
}