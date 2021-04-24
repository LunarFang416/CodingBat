//Given a string, return a string where for every char in the original, there are two chars.

public String doubleChar(String str) {
  String x = "";
  for(int i=0;i<str.length();i++){
    String y = String.valueOf(str.charAt(i));
    x += y + y;
  }
  return x;
}
