public boolean equalIsNot(String str) {
  int is = 0, not = 0, index = 0;
  
  for(int i=0;i<str.length()-2;i++){
    if(str.indexOf("is", index) != -1){
      is++;
      index = str.indexOf("is",index) + 2;
    }
  }
  index = 0;
  for(int i=0;i<str.length()-2;i++){
    if(str.indexOf("not", index) != -1){
      not++;
      index = str.indexOf("not",index) + 3;
    }
  }
  
  return is == not;
}
