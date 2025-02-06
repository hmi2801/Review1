public class Reverse {
	public static void main(String[] args){
		String s="Java is awesome";
		String[] arr=s.split(" ");
		String ans="";

		for(String sb:arr){
			ans=ans+reverse(sb)+" ";
		}
		ans.trim();
		System.out.println(ans);
		
	}
	public static String reverse(String s){
		String st="";
		for(int i=s.length()-1;i>=0;i--){
			st=st+s.charAt(i);
		}
		return st;
	}
}
