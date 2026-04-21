/*
======================
   EXPERIMENT - 10
======================

AIM:
Generate message digest using SHA-1 algorithm.

DESCRIPTION:
SHA-1 is a cryptographic hash function.
It converts input message into a fixed 160-bit hash value.
Used for data integrity and security.

ALGORITHM:
1. Define input message
2. Create MessageDigest object using SHA-1
3. Convert message to byte array
4. Generate hash using digest()
5. Convert hash to hexadecimal format
6. Display output

PROGRAM:
*/

import java.security.MessageDigest;

public class SHA1 
{
    public static void main(String args[]) throws Exception 
    {
        String msg = "Hello World";

        MessageDigest md = MessageDigest.getInstance("SHA-1");

        byte[] hash = md.digest(msg.getBytes());

        StringBuilder sb = new StringBuilder();

        for(byte b : hash)
        {
            String hex = Integer.toHexString(0xff & b);

            if(hex.length() == 1)
            {
                sb.append('0');
            }

            sb.append(hex);
        }

        System.out.println("Original Message: " + msg);
        System.out.println("SHA1 Hash: " + sb.toString());
    }
}

/*
OUTPUT:
Original Message: Hello World
SHA1 Hash: 0a4d55a8d778e5022fab701977c5d840bbc486d0
*/