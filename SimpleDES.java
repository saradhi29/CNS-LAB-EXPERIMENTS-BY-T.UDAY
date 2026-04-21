/*
======================
   EXPERIMENT - 4
======================

AIM:
Implement Simple DES algorithm.

DESCRIPTION:
Uses XOR and swapping for encryption.

ALGORITHM:
1. Initialize arrays
2. Perform XOR
3. Swap values
4. Repeat 16 rounds
5. Display result

PROGRAM:
*/

public class SimpleDES 
{
    static int[] xor(int[] a, int[] b) 
    {
        int[] r = new int[a.length];

        for(int i = 0; i < a.length; i++) 
        {
            r[i] = a[i] ^ b[i];
        }

        return r;
    }

    public static void main(String args[]) 
    {
        int[] L = new int[32];
        int[] R = new int[32];
        int[] key = new int[32];

        for(int i = 0; i < 32; i++) 
        {
            L[i] = i % 2;
            R[i] = i % 2;
            key[i] = 1;
        }

        for(int i = 0; i < 16; i++) 
        {
            int[] temp = R;
            R = xor(L, xor(R, key));
            L = temp;
        }

        for(int i : R) 
        {
            System.out.print(i);
        }
    }
}

/*
OUTPUT:
Binary Output
*/