public class CodingBatSting1 {
    public static void main(String[] args) {
         /*
        (HelloName)
        public String helloName(String name) {
        return "Hello " + name + "!";
        }
        (makeAbba)
        public String makeAbba(String a, String b) {
        return a + b + b + a;()
        }
        (makeTags)
        public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
        }
        (makeOutWord)
        public String makeOutWord(String out, String word) {
        return out.substring(0,2)+word+out.substring(2);
        }
        (extraEnd)
        public String extraEnd(String str) {
        String x = str.substring(str.length() -2);
        return x+x+x;
        }
        (firstTwo)
        public String firstTwo(String str) {
        if(str.length() < 2) return str;
        return str.substring(0,2);
        }
        (firstHalf)
        public String firstHalf(String str) {
        return str.substring(0,str.length() / 2);
        }
        (withoutEnd)
        public String withoutEnd(String str) {
        return str.substring(1,str.length() -1);
        }
        (comboString)
        public String comboString(String a, String b) {
        if(a.length() > b.length()) return b+a+b;
        return a+b+a;
        }
        (nonStart)
        public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
        }
        (left2)
        public String left2(String str) {
        return str.substring(2) + str.substring(0,2);
        }
        (right2)
        public String right2(String str) {
        return str.substring(str.length()-2) + str.substring(0,str.length()-2);
        }
        (theEnd)
        public String theEnd(String str, boolean front) {
        if(front) return str.substring(0,1);
        else return str.substring(str.length()-1);
        }
        (withoutEnd2)
        public String withoutEnd2(String str) {
        if(str.length() <= 1) return "";
        return str.substring(1,str.length() -1);
        }
        (middleTwo)
        public String middleTwo(String str) {
        return str.substring(str.length() / 2 -1 , str.length() / 2 + 1);
        }
        (endsLy)
        public boolean endsLy(String str) {
        if(str.length() < 2) return false;
        return str.substring(str.length() - 2).endsWith("ly");
        // equals or endsWith
        (nTwice)
        public String nTwice(String str, int n) {
        return str.substring(0,n) + str.substring(str.length()-n);
        }
        (twoChar)
        public String twoChar(String str, int index) {
        if(index > str.length()-2|| index < 0) return str.substring(0,2);
        return str.substring(index,index + 2);
        }
        (middleThree)
        public String middleThree(String str) {
        int x = str.length() / 2;
        return str.substring(x - 1, x + 2);
        }
        (hasBad)
        public boolean hasBad(String str) {
        if(str.length() < 3) return false;
        else if (str.substring(0,3).equals("bad")) return true;
        else if(str.length() > 3)
        if(str.substring(1,4).equals("bad")) return true;
        return false;
        }
        (atFirst)
        public String atFirst(String str) {
        if(str.length() < 2) str = str +  "@@";
        return str.substring(0,2);
        }
        (lastChars)
        public String lastChars(String a, String b) {
        a = a + "@";
        b = "@" + b;
        return a.substring(0,1) + b.substring(b.length()-1);
        }
        (conCat)
        public String conCat(String a, String b) {
        if(a.length() == 0 || b.length() == 0) return a + b;
        if(a.charAt(a.length()-1) == b.charAt(0)) return a + b.substring(1);
        return a + b;
        }
        (lastTwo)
        public String lastTwo(String str) {
        int x = str.length();
        if(x >= 2) {
        String y = str.substring(0,x -2);
        return y + str.charAt(x-1) + str.charAt(x-2);}
        else return str;
        (seeColor)
        public String seeColor(String str) {
        if(str.length() > 2 && str.substring(0,3).equals("red")) return "red";
        if(str.length() > 3 && str.substring(0,4).equals("blue")) return "blue";
        return "";
        }
        (frontAgain)
        public boolean frontAgain(String str) {
        if(str.substring(0,2).equals(str.substring(str.length()-2)))  return true;
        return false;
        }
        (minCat)
        public String minCat(String a, String b) {
        if(a.length() == b.length()) return a + b;
        if(a.length() < b.length())
        return a + b.substring(b.length() -a.length());
        return a.substring(a.length()-b.length()) + b;
        }
        (extraFront)
        public String extraFront(String str) {
        if(str.length() < 2 ) return str + str + str;
        return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
        }
        (without2)
        public String without2(String str) {
        if(str.length() < 2) return str;
        if(str.substring(0,2).equals(str.substring(str.length()-2)))
        return str.substring(2);
        return str;
        }
        (deFront)
        public String deFront(String str) {
        String x = str.substring(2,str.length());
        if(str.charAt(1) == 'b') x = 'b' + x;
        if(str.charAt(0) == 'a') x = 'a' + x;
        return x;
        }
        (startWord)
        public String startWord(String str, String word) {
        if(str.length() > 0 && str.substring(1).startsWith(word.substring(1)))
        return str.substring(0, word.length());
        return "";
        }
        (withoutX)
        public String withoutX(String str) {
        if(str.length() > 0 && str.charAt(0) == 'x')
        str = str.substring(1,str.length());
        if(str.length() > 0 && str.charAt(str.length()-1) == 'x')
        str = str.substring(0, str.length()-1);
        return str;
        }
        (withoutX2)
        public String withoutX2(String str) {
        if(str.length() > 0){
        if(str.startsWith("x") && str.substring(1).startsWith("x"))
        return str.substring(2);
        if(str.startsWith("x"))
        return str.substring(1);
        if(str.substring(1).startsWith("x"))
        return str.substring(0, 1) + str.substring(2);
        return str;
        }
        else return "";
        }


        That's all.... :)

        */
    }
}
