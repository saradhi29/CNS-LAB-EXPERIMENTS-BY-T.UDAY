/*
======================
   EXPERIMENT - 7
======================

AIM:
Encrypt text using Blowfish algorithm.

DESCRIPTION:
Blowfish is a symmetric key encryption algorithm.
It uses a secret key to encrypt data and provides fast and secure encryption.

ALGORITHM:
1. Define plaintext
2. Define secret key
3. Initialize Blowfish cipher
4. Encrypt the data
5. Convert encrypted data to Base64
6. Display output

PROGRAM:
*/

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class Blowfish2 
{
    public static void main(String args[]) throws Exception 
    {
        String text = "Hello World";        // plaintext
        String keyStr = "MySecretKey";      // secret key

        SecretKeySpec key = new SecretKeySpec(keyStr.getBytes(), "Blowfish");

        Cipher cipher = Cipher.getInstance("Blowfish");

        cipher.init(Cipher.ENCRYPT_MODE, key);

        byte[] encrypted = cipher.doFinal(text.getBytes());

        String output = Base64.getEncoder().encodeToString(encrypted);

        System.out.println("Encrypted Text: " + output);
    }
}

/*
OUTPUT:
Encrypted Text: +pf7S2q4OHpBv7sqXdXimg==
*/