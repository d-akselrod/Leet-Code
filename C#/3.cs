public class Solution {
    public int LengthOfLongestSubstring(string s) {
        int n = s.Length;
        int res = 0;
        string sub = "";

        for (int i = 0; i < n; i++) {
            if (sub.Contains(s[i])) {
                sub = sub.Substring(sub.IndexOf(s[i]) + 1);
            }
            sub += s[i];

            res = Math.Max(res, sub.Length);
        }
        return res;
    }
}
