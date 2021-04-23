//Given a string, return a string made of the first 2 chars (if present), however include first char only if 
//it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

public String startOz(String str) {
  if(str.length() < 2) return str;
  else{
    String x = "";
    if(str.charAt(0) == 'o') x += "o";
    if(str.charAt(1) == 'z') x += "z";
    return x;
  }
}
