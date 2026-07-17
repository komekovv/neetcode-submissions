class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }

        return sb.toString();
    }

    public static List<String> decode(String str) {
      List<String> res = new ArrayList<>();
      int i = 0;

      while(i < str.length() - 1) {
        int j = str.indexOf('#', i);
        int length = Integer.parseInt(str.substring(i,j));
        res.add(str.substring(j+1, length + j + 1));
        i = length + j + 1;
      }

      return res;
    }
}
