//Return true if the given string contains between 1 and 3 'e' chars.

public boolean stringE(String str) {
  int counter = 0;
  char[] x = str.toCharArray();
  for(int i=0;i<x.length;i++){
    if(x[i] == 'e') counter++;
  }
  return (counter>=1 && counter <=3);
  
}
