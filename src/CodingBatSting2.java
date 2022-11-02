public class CodingBatSting2 {
    public static void main(String[] args) {
        /*
        (doubleChar)
        public String doubleChar(String str) {
        StringBuilder blr = new StringBuilder();
        for(int i=0; i<str.length(); i++)
        blr.append(str.charAt(i) + String.valueOf(str.charAt(i)));
        return blr.toString();
        }
        (countHi)
        public int countHi(String str) {
        int count = 0;
        for(int i=0; i<str.length()-1; i++)
        if(str.substring(i,i + 2).equals("hi")) count++;
        return count;
        }
        (catDog)
        public boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for(int i=0; i<str.length()-2; i++){
        String w = str.substring(i,i + 3);
        if(w.equals("cat")) cat++;
        if(w.equals("dog")) dog++;}
        return cat == dog;
        }
        (countCode)
        public int countCode(String str) {
        int count = 0;
        for(int i = 0; i < str.length() - 3; i++)
        if(str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e')
        count++;
        return count;
        }
        (endOther)
        public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.endsWith(b) || b.endsWith(a)) return true;
        return false;
        }
        (xyzThere)
        public boolean xyzThere(String str) {
        if(str.length() >= 3 && str.substring(0,3).equals("xyz")) return true;
        for(int i = 1; i<str.length()-2; i++)
        if(str.substring(i, i+3).equals("xyz") && str.charAt(i-1) !='.') return true;
        return false;
        }
        (bobThere)
        public boolean bobThere(String str) {
        for(int i=0; i<str.length()-2;i++)
        if(str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') return true;
        return false;
        }
        (xyBalance)
        public boolean xyBalance(String str) {
        for(int i=0; i<str.length(); i++)
        if(str.lastIndexOf("y") < str.lastIndexOf("x")) return false;
        return true;
        }
        (mixString)
        public String mixString(String a, String b) {
        int i = 0;
        StringBuilder blr =  new StringBuilder();
        while(i<a.length() && i <b.length()){
        blr.append(a.charAt(i));
        blr.append(b.charAt(i));
        i++;
        }
        blr.append(a.substring(i));
        blr.append(b.substring(i));
        return blr.toString();
        }
        (repeatEnd)
        public String repeatEnd(String str, int n) {
        StringBuilder blr = new StringBuilder();
        String pr = str.substring(str.length() - n);
        for(int i = 0; i < n; i++)
        blr.append(pr);
        return blr.toString();
        }
        (repeatFront)
        public String repeatFront(String str, int n) {
        StringBuilder blr = new StringBuilder();
        for(int i = n; i > 0; i--)
        blr.append(str.substring(0, i));
        return blr.toString();
        }
        (repeatSeparator)
        public String repeatSeparator(String word, String sep, int count) {
        if(count == 0)  return "";
        StringBuilder blr = new StringBuilder();
        for(int i = 0; i < count - 1; i++)  {
        blr.append(word);
        blr.append(sep);  }
        return blr.append(word).toString();
        }
        (prefixAgain)
        public boolean prefixAgain(String str, int n) {
        String s = str.substring(0,n);
        String s1 = str.substring(n);
        return s1.contains(s);
        // return str.substring(n).contains(str.substring(0,n));
        }
        (xyzMiddle)
        public boolean xyzMiddle(String str) {
        if(str.length() < 3)  return false;
        int st1 = str.length() / 2 - 2;
        int st2 = str.length() / 2 - 1;
        if(str.length() % 2 == 0) {
        return str.substring(st1, st1 + 3).equals("xyz") ||
        str.substring(st2, st2 + 3).equals("xyz"); }
        return str.substring(st2, st2 + 3).equals("xyz");
        }
        (getSandwich)
        public String getSandwich(String str) {
        int b1 = str.indexOf("bread");
        int b2 = str.lastIndexOf("bread");
        if(b1>=0 && b2>=0 && b1!=b2)
        return str.substring(b1 + 5, b2);
        else return "";
        }
        (sameStarChar)
        public boolean sameStarChar(String str) {
        for(int i = 1; i < str.length() - 1; i++)
        if(str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1))
        return false;
        return true;
        }
        (oneTwo)
        public String oneTwo(String str) {
        StringBuilder blr = new StringBuilder();
        for(int i=0; i<str.length()-2; i+=3)
        blr.append(str.charAt(i+1)).append(str.charAt(i+2)).append(str.charAt(i));
        return blr.toString();
        }
        (zipZap)
        public String zipZap(String str) {
        char[] arr = new char[str.length()];
        int count = 0;
        int i = 0;
        while(i < str.length()) {
        if(i < str.length() - 2 && str.charAt(i) == 'z' &&
        str.charAt(i + 2) == 'p') {
        arr[count] = 'z';  count++;
        arr[count] = 'p';  count++;
        i += 3; }
        else {
        arr[count] = str.charAt(i);  count++;
        i++; }
        }
        return new String(arr, 0, count);
        }
        (starOut)
        public String starOut(String str) {
        if(str.length() < 1)
        return "";
        if(str.length() == 1) {
        if(str.charAt(0) == '*')
        return "";
        else
        return str;
        }
        char[] arr = new char[str.length()];
        int count = 0;
        if(str.charAt(0) != '*' && str.charAt(1) != '*') {
        arr[count] = str.charAt(0);
        count++;
        }
        for(int i = 1; i < str.length() - 1; i++) {
        if(str.charAt(i-1)!='*' && str.charAt(i) != '*' &&
        str.charAt(i+1) != '*') {
        arr[count] = str.charAt(i);
        count++;
        }
        }
        if(str.charAt(str.length()-1) != '*' &&
        str.charAt(str.length()-2) != '*') {
        arr[count] = str.charAt(str.length() - 1);
        count++;
        }
        return new String(arr, 0, count);
        }
        (plusOut)
        public String plusOut(String str, String word) {
        StringBuffer result = new StringBuffer();
        int i = 0;
        while(i < str.length()) {
        if(i <= str.length() - word.length() &&
        str.substring(i, i + word.length()).equals(word)) {
        result.append(word);
        i += word.length();
        } else {
        result.append("+");
        i++;
        }
        }
        return result.toString();
        }
        (wordEnds)
        public String wordEnds(String str, String word) {
        StringBuffer result = new StringBuffer();
        int i = 0;
        if(str.length() >= word.length() + 1 &&
        str.substring(0, word.length()).equals(word)) {
        i = word.length() - 1;
        result.append(str.charAt(i + 1));
        }
        while(i < str.length() - word.length()) {
        if(str.substring(i + 1, i + 1 + word.length()).equals(word)) {
        result.append(str.charAt(i));
        i = i + word.length();
        if(i < str.length() - 1) {
        result.append(str.charAt(i + 1));
        }
        } else {
        i++;
        }
        }
        return result.toString();
        }
        That's all...  :)

         */
    }
}
