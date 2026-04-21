/*
======================
   EXPERIMENT - 6
======================

AIM:
Implement AES (Advanced Encryption Standard) encryption.

DESCRIPTION:
AES is a symmetric key encryption algorithm used to securely encrypt data.
It uses a fixed block size and a secret key for encryption.

ALGORITHM:
1. Define plaintext
2. Define secret key
3. Initialize AES cipher
4. Encrypt the data
5. Convert encrypted data to Base64
6. Display output

PROGRAM:
*/

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class AES 
{
    public static void main(String args[]) throws Exception 
    {
        String text = "HelloWorld12345";   // plaintext
        String keyStr = "MySecretKey12345"; // 16-byte key

        SecretKeySpec key = new SecretKeySpec(keyStr.getBytes(), "AES");

        Cipher cipher = Cipher.getInstance("AES");

        cipher.init(Cipher.ENCRYPT_MODE, key);

        byte[] encrypted = cipher.doFinal(text.getBytes());

        String output = Base64.getEncoder().encodeToString(encrypted);

        System.out.println("Encrypted Text: " + output);
    }
}

/*
OUTPUT:
Encrypted Text: Z1r3xUQeK8n9pVg0hQhZ7A==
*/