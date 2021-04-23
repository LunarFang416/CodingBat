/*Given a string, take the last char and return a new string with the last 
char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.*/

public String backAround(String str) {
  if(str.length() <= 1) return str + str + str;
  else{
    char x = str.charAt(str.length()-1);
    return x + str + x;
  }
}
