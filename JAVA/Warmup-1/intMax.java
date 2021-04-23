//Given three int values, a b c, return the largest.

public int intMax(int a, int b, int c) {
  int highest = a;
  if(b > highest) highest = b;
  if(c > highest) highest = c;
  return highest;
}
