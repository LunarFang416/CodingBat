//Return true if the string "cat" and "dog" appear the same number of times in the given string.

public boolean catDog(String str) {
  int x = 0, y = 0;
  for(int i = 0;i<str.length()-2;i++){
    if(str.substring(i,i+3).equals("cat")) y++;
    if(str.substring(i,i+3).equals("dog")) x++;
  }
  return x == y;
}
