/*
======================
   EXPERIMENT - 3(c)
======================

AIM:
Implement Hill Cipher.

DESCRIPTION:
Uses matrix multiplication for encryption.

ALGORITHM:
1. Read text
2. Convert to uppercase
3. Add padding if needed
4. Apply encryption
5. Display result

PROGRAM:
*/

import java.util.*;

class HillCipher 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next().toUpperCase();

        if(text.length() % 2 != 0)
        {
            text += "X";
        }

        String enc = "";

        for(int i = 0; i < text.length(); i += 2) 
        {
            int a = text.charAt(i) - 'A';
            int b = text.charAt(i + 1) - 'A';

            enc += (char)((a + 2 * b) % 26 + 'A');
            enc += (char)((3 * a + 5 * b) % 26 + 'A');
        }

        System.out.println("Encrypted: " + enc);
    }
}

/*
OUTPUT:
HIOZHN
*/