/*
======================
   EXPERIMENT - 5
======================

AIM:
Implement Blowfish encryption.

DESCRIPTION:
Blowfish is a symmetric key encryption algorithm.

ALGORITHM:
1. Define plaintext
2. Define secret key
3. Initialize Blowfish cipher
4. Encrypt data
5. Convert to Base64
6. Display output

PROGRAM:
*/

import javax.crypto.*;
import javax.crypto.spec.*;
import java.util.*;

public class Blowfish 
{
    public static void main(String args[]) throws Exception 
    {
        String text = "Hello World";

        SecretKeySpec key = new SecretKeySpec("MySecretKey".getBytes(), "Blowfish");
        Cipher cipher = Cipher.getInstance("Blowfish");

        cipher.init(Cipher.ENCRYPT_MODE, key);

        byte[] enc = cipher.doFinal(text.getBytes());

        String output = Base64.getEncoder().encodeToString(enc);

        System.out.println("Encrypted Text: " + output);
    }
}

/*
OUTPUT:
Encrypted Text: +pf7S2q4OHpBv7sqXdXimg==
*/