public boolean xyzThere(String str) {
  if(str.length() >= 3 && str.substring(0, 3).equals("xyz")) return true;
  for(int i=0;i<str.length()-2;i++)
    if(str.substring(i,i+3).equals("xyz") && str.charAt(i-1) != '.') return true;
  return false;

}
