/*
   EXPERIMENT - 2

AIM:
Write a C program to perform AND and XOR operations with 127 on "Hello World".

DESCRIPTION:
- Stores string "Hello World"
- AND with 127 → same output
- XOR with 127 → encrypted output
- Applying XOR again decrypts it

ALGORITHM:
1. Start
2. Initialize string
3. Apply XOR with 127
4. Print result
5. Apply AND with 127
6. Print result
7. Stop

PROGRAM:
*/

#include<stdio.h>
#include<string.h>

int main()
{
    char *str = "Hello world";
    int i;

    for(i=0;i<strlen(str);i++)
        printf("%c", str[i]^127);

    printf("\n");

    for(i=0;i<strlen(str);i++)
        printf("%c", str[i]&127);

    return 0;
}

/*
OUTPUT:
Hello world
*/