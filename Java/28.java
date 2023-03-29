class Solution 
{
    public int strStr(String haystack, String needle)
    {
        int n = 0;

        while(haystack.length() >= needle.length())
        {
            System.out.println(haystack + " " + haystack.substring(0, needle.length()));
            if(haystack.substring(0, needle.length()).equals(needle))
            {
                return n;
            }
            else
            {
                n += 1;
                haystack = haystack.substring(1, haystack.length());
            }
        }

        return -1;
    }
}
