public boolean xyBalance(String str) {
  if(str.indexOf('x') == -1 && str.indexOf("y") == -1) return true;
  return str.lastIndexOf("x") < str.lastIndexOf("y");
}
