//Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.

public int max1020(int a, int b) {
  if((a <= 20 && a >= 10) && (b <= 20 && b >= 10)) return Math.max(a,b);
  else if(a <= 20 && a >= 10) return a;
  else if(b <= 20 && b >= 10) return b;
  else return 0;
}
