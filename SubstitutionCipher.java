/*
======================
   EXPERIMENT - 3(b)
======================

AIM:
Implement Substitution Cipher.

DESCRIPTION:
Each character is replaced using a fixed key mapping.

ALGORITHM:
1. Read input text
2. Convert to uppercase
3. Replace characters using key
4. Reverse mapping
5. Display result

PROGRAM:
*/

import java.util.*;

class SubstitutionCipher 
{
    public static void main(String args[]) 
    {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String key = "QWERTYUIOPASDFGHJKLZXCVBNM";

        Scanner sc = new Scanner(System.in);
        String text, ctext = "", dtext = "";

        System.out.print("Enter text: ");
        text = sc.nextLine().toUpperCase();

        // Encryption
        for(int i = 0; i < text.length(); i++) 
        {
            char ch = text.charAt(i);

            for(int j = 0; j < 26; j++) 
            {
                if(ch == alphabet.charAt(j)) 
                {
                    ctext += key.charAt(j);
                    break;
                }
            }
        }

        // Decryption
        for(int i = 0; i < ctext.length(); i++) 
        {
            char ch = ctext.charAt(i);

            for(int j = 0; j < 26; j++) 
            {
                if(ch == key.charAt(j)) 
                {
                    dtext += alphabet.charAt(j);
                    break;
                }
            }
        }

        System.out.println("Encrypted: " + ctext);
        System.out.println("Decrypted: " + dtext);
    }
}

/*
OUTPUT:
Encrypted: ITSSG
Decrypted: HELLO
*/