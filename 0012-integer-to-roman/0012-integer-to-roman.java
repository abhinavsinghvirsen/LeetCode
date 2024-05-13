class Solution {
    public String intToRoman(int num) {
        if (num < 1 || num > 3999)
            throw new IllegalArgumentException("Input out of range");

        String[] romanNumerals = {
            "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",
            "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC",
            "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM",
            "", "M", "MM", "MMM"
        };

        return romanNumerals[num / 1000 + 30] +
               romanNumerals[(num / 100) % 10 + 20] +
               romanNumerals[(num / 10) % 10 + 10] +
               romanNumerals[num % 10];
    }
}