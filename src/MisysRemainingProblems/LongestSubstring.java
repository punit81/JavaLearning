package MisysRemainingProblems;

class LongString{
	public boolean notHavingRepeatingChars(String s) {
		boolean hasRepeatingChars=false;
		for(String st:s.split("")) {
			if(s.indexOf(st)!=s.length()-1 && s.substring( s.indexOf(st)+1,s.length()).contains(st)) {
				hasRepeatingChars=true;
				break;
			}
		}
		return !hasRepeatingChars;
	}
	public String maxString(String s) {
		if(s.length()==0)
			return "";
		String maxstring=s.charAt(0)+"";
		int maxlength=1;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				String sub=s.substring(i,j);
				if(notHavingRepeatingChars(sub)) {
					if(sub.length()>maxlength) {
						maxlength=sub.length();
						maxstring=sub;
					}
				}
				else {
					break;
				}
			}
		}
		return maxstring;
	}
}
public class LongestSubstring {

	public static void main(String[] args) {
		String a="ABDEFGABEF";
		LongString lstr=new LongString();
		System.out.println(lstr.maxString(a));
	}

}
