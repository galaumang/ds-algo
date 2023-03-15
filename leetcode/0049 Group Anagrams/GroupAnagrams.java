class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0)
            return new ArrayList();
        Map<String, List> groups = new HashMap<String, List>();
        int[] charCount = new int[26];
        for (String s : strs) {
            Arrays.fill(charCount, 0);
            for (char c : s.toCharArray())
                charCount[c - 'a']++;
            StringBuilder keySb = new StringBuilder("");
            for (int i = 0; i < 26; i++) 
                keySb.append("||").append(charCount[i]);
            String key = keySb.toString();
            if (! groups.containsKey(key))
                groups.put(key, new ArrayList());
            groups.get(key).add(s);
        }
        return new ArrayList(groups.values());
    }
}
