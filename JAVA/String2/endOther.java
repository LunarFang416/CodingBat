//Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences

public boolean endOther(String a, String b) {
  if(a.length() >= b.length()) return a.substring(a.length()-b.length()).equalsIgnoreCase(b);
  if(a.length() <= b.length()) return b.substring(b.length()-a.length()).equalsIgnoreCase(a);
  else return false;
}
