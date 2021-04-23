/*Given a string, return a new string where the first and last chars have been exchanged.*/

public String frontBack(String str) {
  if(str.length() <= 1) return str;
  else return str.charAt(str.length()-1) + str.substring(1,str.length()-1) + str.charAt(0);
}
