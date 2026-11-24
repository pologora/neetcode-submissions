class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            mapS.merge(s.charAt(i), 1, Integer::sum);
        }

        for(int i = 0; i < s.length(); i++){
            mapT.merge(t.charAt(i), 1, Integer::sum);
        }

        System.out.println(mapS.entrySet());
        System.out.println(mapT.entrySet());

        return Objects.equals(mapS, mapT);
    }

    // private boolean compareMaps(Map<Character, Integer> a, Map<Character, Integer> b ){
    //     if(a.size() != b.size()) return false;

    //     return a.entrySet().stream()
    //     .allMatch(e -> Objects.equals(e.getValue(), b.get(e.getKey())));
    // }
}
