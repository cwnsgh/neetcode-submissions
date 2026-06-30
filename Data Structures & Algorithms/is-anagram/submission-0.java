class Solution {
    public boolean isAnagram(String s, String t) {


        if(s.length() != t.length()){
            return false;
        }

        //s랑 t의 문자가 서로 애너그램이 되냐 안되냐의 문제
        //중복관련된건 일단 해시셋을 생각해보고 해야하지
        int[] charcheck = new int [26];

        for(int i = 0 ; i < s.length(); i++){
            char now = s.charAt(i);
            charcheck[now-'a']++;
        } 

        for(int i =0; i<t.length(); i++){
            char now = t.charAt(i);
            if(charcheck[now-'a']==0){
                return false;
            }
            charcheck[now-'a']--;
        }

        return true;
    }
}
