public class FormWord{
    public static void main(String[] args) {
		
        //		String str = "ww:ii:pp:rr:oo";
                String str = "zx:za:ee";
                System.out.println(formWord(str));
            }
            
            static String formWord(String inp1) {
                inp1 = inp1.toUpperCase();
                String op = "";
                StringBuffer sb = new StringBuffer();
                String words[] = inp1.split(":");
                for (int i=0; i<words.length; i++) {
                    if (words[i].charAt(0) == words[i].charAt(1)) sb.append(words[i].charAt(0));
                    else {
                        int max = words[i].charAt(0);
                        int min = words[i].charAt(1);
                        char c = (char) ((max-min) +'A'-1);
                        sb.append(c);
                    }
                }
                op = sb.toString();
                return op;
            }
}