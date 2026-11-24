class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String, List<String>> hashMap = new HashMap<>();
      List<List<String>> result = new ArrayList<List<String>>();
      char a = 'a';
      int aCode = (int) a;

      for (String word : strs) {
          int[] arr = new int[26];
          Arrays.fill(arr,0);

        for (int i = 0; i < word.length(); i++) {
          char ch = word.charAt(i);
          int index = (int) ch - aCode;
          arr[index]++;
        }

        String strOfCharCodes = Arrays.toString(arr);
        if(!hashMap.containsKey(strOfCharCodes)){
            hashMap.put(strOfCharCodes, new ArrayList<>());
        }

        hashMap.get(strOfCharCodes).add(word);
      }
        result.addAll(hashMap.values());
        
      return result;
    }
  }
