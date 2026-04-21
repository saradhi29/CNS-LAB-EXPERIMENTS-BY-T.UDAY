/*

   EXPERIMENT - 3(a)


AIM:
Implement Caesar Cipher encryption and decryption.

DESCRIPTION:
- Shifts letters by fixed key
- Used in ancient cryptography

ALGORITHM:
1. Read text and key
2. Shift characters
3. Print encrypted text
4. Reverse shift
5. Print decrypted text

PROGRAM:
*/

import java.util.*;

class CaesarCipher {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String text, ctext="", dtext="";
        int shift;

        System.out.println("Enter text:");
        text = sc.nextLine();

        System.out.println("Enter shift:");
        shift = sc.nextInt();

        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if(ch>='A'&&ch<='Z')
                ctext += (char)((ch-'A'+shift)%26+'A');
            else if(ch>='a'&&ch<='z')
                ctext += (char)((ch-'a'+shift)%26+'a');
            else
                ctext += ch;
        }

        for(int i=0;i<ctext.length();i++){
            char ch = ctext.charAt(i);
            if(ch>='A'&&ch<='Z')
                dtext += (char)((ch-'A'+26-shift)%26+'A');
            else if(ch>='a'&&ch<='z')
                dtext += (char)((ch-'a'+26-shift)%26+'a');
            else
                dtext += ch;
        }

        System.out.println("Encrypted: "+ctext);
        System.out.println("Decrypted: "+dtext);
    }
}

/*
OUTPUT:
Encrypted: Khoor
Decrypted: Hello
*/