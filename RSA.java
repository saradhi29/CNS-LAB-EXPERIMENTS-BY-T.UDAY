/*
======================
   EXPERIMENT - 8
======================

AIM:
Implement RSA algorithm for encryption and decryption.

DESCRIPTION:
RSA is a public key cryptography algorithm.
It uses two keys: public key for encryption and private key for decryption.
Security is based on large prime numbers.

ALGORITHM:
1. Read two prime numbers p and q
2. Compute n = p * q
3. Compute φ(n) = (p-1)*(q-1)
4. Choose e such that gcd(e, φ(n)) = 1
5. Compute d = e⁻¹ mod φ(n)
6. Read message
7. Encrypt using C = M^e mod n
8. Decrypt using M = C^d mod n
9. Display output

PROGRAM:
*/

import java.math.BigInteger;
import java.util.Scanner;

public class RSA 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter prime number p: ");
        BigInteger p = sc.nextBigInteger();

        System.out.print("Enter prime number q: ");
        BigInteger q = sc.nextBigInteger();

        BigInteger n = p.multiply(q);

        BigInteger phi = (p.subtract(BigInteger.ONE))
                         .multiply(q.subtract(BigInteger.ONE));

        System.out.print("Enter public key e: ");
        BigInteger e = sc.nextBigInteger();

        BigInteger d = e.modInverse(phi);

        System.out.print("Enter message: ");
        BigInteger msg = sc.nextBigInteger();

        BigInteger cipher = msg.modPow(e, n);

        BigInteger decrypted = cipher.modPow(d, n);

        System.out.println("Encrypted message: " + cipher);
        System.out.println("Decrypted message: " + decrypted);
    }
}

/*
OUTPUT:
Enter prime number p: 3
Enter prime number q: 3
Enter public key e: 3
Enter message: 2

Encrypted message: 8
Decrypted message: 2
*/