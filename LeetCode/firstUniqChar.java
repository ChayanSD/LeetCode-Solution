class Solution {
    public int firstUniqChar(String str) {
         Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            //check if particular character ch  is already present on my map on not
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        int index = 0;
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
//                System.out.println(ch);
               return index;
            } else {
                index++;
            }
        }
        return -1;
    }
}
