import java.io.*;
class SortString {
public static void main(String[] args)
{
int n = 4;
String s[]= { "Lambo", "Audi", "Toyota", "Benz" };
String str;
for (int i = 0; i < n; i++) {
for (int j = i + 1; j < n; j++) {
if (s[i].compareTo(s[j]) > 0) {
str = s[i];
s[i] = s[j];
s[j] = str;
}
}
}
System.out.println("Sorted List: ");
for (int i = 0; i < n; i++) {
   System.out.println(s[i]);
}
}
}
