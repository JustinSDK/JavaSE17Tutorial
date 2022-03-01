package cc.openhome;

public class UnicodeDemo {

	public static void main(String[] args) {
		System.out.println(
		    "𝟏𝟐𝟑𝟜𝟝𝟞𝟩𝟪𝟫𝟬𝟭𝟮𝟯𝟺𝟻𝟼".matches("(?U)\\d*")
		);
		System.out.println(
		    (
		        "²³¹¼½¾𝟏𝟐𝟑𝟜𝟝𝟞𝟩𝟪𝟫𝟬𝟭𝟮𝟯𝟺𝟻𝟼" + 
		        "㉛㉜㉝" +
		        "ⅠⅡⅢⅣⅤⅥⅦⅧⅨⅩⅪⅫⅬⅭⅮⅯ" + 
		        "ⅰⅱⅲⅳⅴⅵⅶⅷⅸⅹⅺⅻⅼⅽⅾⅿ"
		    )
		    .matches("\\pN*")
		);
	}

}
