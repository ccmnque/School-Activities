import java.io.FileReader;

public class EOFLoop {
    public static void main(String[] args) throws Exception {
        Scanner read=new Scanner(new FileReader("Data.txt"));
        String data = "", hold="", val1="", val2="";
        String str1 = read.next(), str2 = read.next();
        int cnt1=0, cnt2=0;
        while(read.hasNext()) {
            data=read.next();
            for (int i = (data.length()-1); i>=0; i--) {
            }
            if(data.equalsIgnoreCase(hold)) {
                val1+=hold+"\n"; cnt1++;
            } else {
                val2+=hold+"\n"; cnt2++;
            }
            hold="";
        }
        hold+=str1+"\t: " + cnt1 +"\n" +val1 + "\n" +
        str2 + "\t: " + cnt2 + "\n" + val2 + "\n";
        System.out.println(hold);
    }
}