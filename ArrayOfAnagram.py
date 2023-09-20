from collections import defaultdict as dd
def charToArr(s1):
  arr1=[0]*26
  for i in s1:
    arr1[ord(i)-97]+=1
  return arr1
s1=list(map(str,input().split()))
s2=list(map(str,input().split()))
dic=dd(int)
for i in s1:
  dic[charToArr(i)]+=1
for i in s2:
  print(dic[charToArr(i)])