/*
EXPERIMENT - 1

AIM:
Write a C program to XOR each character of "Hello World" with 0.

DESCRIPTION:
XOR with 0 returns same value. Demonstrates identity property.

ALGORITHM:
1. Start
2. Initialize string
3. Apply XOR with 0
4. Print result
5. Stop

PROGRAM:
*/
#include<stdio.h>
#include<string.h>
int main(){
    char *str="Hello world";
    int i;
    for(i=0;i<strlen(str);i++)
        printf("%c",str[i]^0);
    return 0;
}
/*
OUTPUT:
Hello world
*/