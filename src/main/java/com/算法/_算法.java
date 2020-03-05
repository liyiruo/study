package main.java.com.算法;

/**
 * 有一个字符串 以逗号分割（小于100个），以这个字符串的后一位的ascii 大小排序 输出
 */
public class _算法 {

    public static void main(String[] args) {
        String s = "a1,d2,f3,g4,h5,ja,kb,8c,9d,0e,fe";
        sortBytes(s);
    }

    private static void sortBytes(String input) {
        try {
            String[] ss = input.split(",");
            String temp;
            for (int i = 0; i < ss.length; i++) {
                for (int j = 0; j < ss.length-1-i; j++) {
                    int firstAscii = (int) ss[j].substring(ss[j].length()-1).charAt(0);
                    int secondAscii = (int) ss[j + 1].substring(ss[j+1].length() - 1).charAt(0);
                    if (firstAscii <secondAscii){
                        temp = ss[j+1];
                        ss[j + 1] = ss[j];
                        ss[j] = temp;
                    }
                }
            }
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < ss.length; i++) {
                if (i==ss.length-1){
                    builder.append(ss[i]);
                }else{
                    builder.append(ss[i]).append(",");
                }
            }
            System.out.println(builder.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
