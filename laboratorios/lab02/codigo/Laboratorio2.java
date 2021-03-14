/**
 * Laboratorio 2 de Estructuras de Datos 1
 * 
 * @author Mauricio Toro 
 * @version 1
 */

import java.util.Arrays;

public class Laboratorio2
{

    // Sorts an array using Insertion Sort
    public static void InsertionSort(int[] A)
    {

        int temp,j;
        for (int i = 0; i < A.length; i++)
        {
            j = i;
            while (j > 0 && A[j-1] > A[j])
            {
                temp = A[j];
                A[j] = A[j-1];
                A[j-1] = temp;
                j = j-1;
            } 
        }
        // //System.out.println(Arrays.toString(A));

    }
    // Sorts an array using Merge Sort
    public static void mergeSort(int [ ] a)
    {
        int[] tmp = new int[a.length];
        mergeSort(a, tmp,  0,  a.length - 1);
    }

    // Sorts an array using Merge Sort
    private static void mergeSort(int [ ] a, int [ ] tmp, int left, int right)
    {
        if( left < right )
        {
            int center = (left + right) / 2;
            mergeSort(a, tmp, left, center);
            mergeSort(a, tmp, center + 1, right);
            merge(a, tmp, left, center + 1, right);
        }
    }

    // Merges two sorted arrays
    private static void merge(int[ ] a, int[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd)
            if(a[left] <= a[right] )
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd)    // Copy rest of first half
            tmp[k++] = a[left++];

        while(right <= rightEnd)  // Copy rest of right half
            tmp[k++] = a[right++];

        // Copy tmp back
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
    }

    public static void main(String[] args)
    {
        //Toma inicial de timepo
        //long inicio = System.currentTimeMillis();
        int[] A= new int[200000];
        int[] B= new int[200000];
        int[] C= new int[200000];
        int[] D= new int[200000];
        int[] E= new int[200000];
        int[] F= new int[200000];
        int[] G= new int[200000];
        int[] H= new int[200000];
        int[] I= new int[200000];
        int[] J= new int[200000];
        int[] K= new int[200000];
        int[] L= new int[200000];
        int[] M= new int[200000];
        int[] N= new int[200000];
        int[] O= new int[200000];
        int[] P= new int[200000];
        int[] Q= new int[200000];
        int[] R= new int[200000];
        int[] S= new int[200000];
        int[] T= new int[200000];

        for (int i=0;i<200000;i++)
        {        
            //Random rnd = Math.random()*9999+1;
            A[i]= (int) (Math.random()*999+1);
            B[i]= (int) (Math.random()*999+1);
            C[i]= (int) (Math.random()*999+1);
            D[i]= (int) (Math.random()*999+1);
            E[i]= (int) (Math.random()*999+1);
            F[i]= (int) (Math.random()*999+1);
            G[i]= (int) (Math.random()*999+1);
            H[i]= (int) (Math.random()*999+1);
            I[i]= (int) (Math.random()*999+1);
            J[i]= (int) (Math.random()*999+1);
            K[i]= (int) (Math.random()*999+1);
            L[i]= (int) (Math.random()*999+1);
            M[i]= (int) (Math.random()*999+1);
            N[i]= (int) (Math.random()*999+1);
            O[i]= (int) (Math.random()*999+1);
            P[i]= (int) (Math.random()*999+1);
            Q[i]= (int) (Math.random()*999+1);
            R[i]= (int) (Math.random()*999+1);
            S[i]= (int) (Math.random()*999+1);
            T[i]= (int) (Math.random()*999+1);

        }
        int[][] Arrays ={ A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T};
        for (int[] X : Arrays)
        {        
            long inicio = System.currentTimeMillis();
            mergeSort(X);
            //InsertionSort(X);
            long fin = System.currentTimeMillis();
            long total = fin - inicio;
            System.out.println("El tiempo total fue de " + total + " ms");
        }
        //Toma final de tiempo
        // long fin = System.currentTimeMillis();
        // long total = fin - inicio;
        // System.out.println("El tiempo total fue de " + total + " ms");
    }

}