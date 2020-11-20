
public class unicode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decodeUnicode("\\u9ad8\\u4e00\\u6850\\u000d\\u000a"));
	}
public static String decodeUnicode(final String dataStr) {
	        int start = 0;
	        int end = 0;
	        final StringBuffer buffer = new StringBuffer();
	        while (start > -1) {
	            end = dataStr.indexOf("\\u", start + 2);
	            String charStr = "";
	            if (end == -1) {
	                charStr = dataStr.substring(start + 2, dataStr.length());
	            } else {
	                charStr = dataStr.substring(start + 2, end);
	            }
	            char letter = (char) Integer.parseInt(charStr, 16); // 16����parse�����ַ�����
	            buffer.append(new Character(letter).toString());
	            start = end;
	        }
	        return buffer.toString();
	    }
	}
