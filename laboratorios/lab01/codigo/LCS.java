//Punto 1.1
import java.util.ArrayList;
public class LCS {
    public static void main(String[] args) {
        String a="dvcynhnixqcvgakvygqqdbntiaenqvvhyxbauzukjqxyxjvdjh";
        String b="dipcirruiymtykubdeiaungdmwtepuijjncewayexcywwgmjfj";
        String c="gnzqvymfbkjvghdgfveiyqxmkqbixnnpjthpfprekkmzuxgqkz";
        String d="pqnigjegjumpzvghifbdxbcceigupkirnbjmhbhbubcbryzhmx";
        String e="iqacahjhgukvjuavrprcqafzviybvntddmzazkpedbhnrxktwd";
        String f="vacxgwpaigypzaqiatmrnmfhxickqytwaicqqnttykdmktretr";
        String g="ngtcthbiuxxpkwyxckmcuqyuudipzaqjqczqzvdkmzrxzueywy";
        String h="uqexmyzrhrkuatprbruxbtbrbmfqcmyvyfvqmiyjbruhagucjp";
        String i="nciyqwdewavfhncmpyqrvhgguvbuydydbubmdmekkgzgnaahwz";
        String j="ykbycgmpbmtnjpdqkgbkadvpmtkhwqmajtaajxtkhvkfctmphd";
        String k="bztetqyrgnkqifewxgbekzgyineeerdixjtdnyyeqpgvhuvgru";
        String l="rtdejmgyckubdwapeapeyrrhhdqkebzzmyzvakbjnbarzxgkkm";
        long inicio = System.currentTimeMillis();
        System.out.println("El arreglo es: "+ dfs(a,b));
        System.out.println("La soluciones es: "+solution(a,b));
        long fin = System.currentTimeMillis();
        long total = fin - inicio;
        System.out.println("El tiempo total fue de " + total + " ms");
        inicio=0;fin=0;total=0;
        //1
        inicio = System.currentTimeMillis();
        System.out.println("El arreglo es: "+ dfs(c,b));
        System.out.println("La soluciones es: "+solution(c,b));
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("El tiempo total fue de " + total + " ms");
        inicio=0;fin=0;total=0;
        //2
        inicio = System.currentTimeMillis();
        System.out.println("El arreglo es: "+ dfs(c,b));
        System.out.println("La soluciones es: "+solution(c,b));
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("El tiempo total fue de " + total + " ms");
        inicio=0;fin=0;total=0;
        //3
        inicio = System.currentTimeMillis();
        System.out.println("El arreglo es: "+ dfs(d,b));
        System.out.println("La soluciones es: "+solution(d,b));
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("El tiempo total fue de " + total + " ms");
        inicio=0;fin=0;total=0;
        //4
        inicio = System.currentTimeMillis();
        System.out.println("El arreglo es: "+ dfs(e,b));
        System.out.println("La soluciones es: "+solution(e,b));
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("El tiempo total fue de " + total + " ms");
        inicio=0;fin=0;total=0;
        //5
        inicio = System.currentTimeMillis();
        System.out.println("El arreglo es: "+ dfs(f,b));
        System.out.println("La soluciones es: "+solution(f,b));
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("El tiempo total fue de " + total + " ms");
        inicio=0;fin=0;total=0;
        //6
        inicio = System.currentTimeMillis();
        System.out.println("El arreglo es: "+ dfs(e,a));
        System.out.println("La soluciones es: "+solution(e,a));
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("El tiempo total fue de " + total + " ms");
        inicio=0;fin=0;total=0;
        //7
        inicio = System.currentTimeMillis();
        System.out.println("El arreglo es: "+ dfs(j,d));
        System.out.println("La soluciones es: "+solution(j,d));
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("El tiempo total fue de " + total + " ms");
        inicio=0;fin=0;total=0;
        //8
        inicio = System.currentTimeMillis();
        System.out.println("El arreglo es: "+ dfs(f,a));
        System.out.println("La soluciones es: "+solution(f,a));
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("El tiempo total fue de " + total + " ms");
        inicio=0;fin=0;total=0;
        //9
        inicio = System.currentTimeMillis();
        System.out.println("El arreglo es: "+ dfs(l,j));
        System.out.println("La soluciones es: "+solution(l,j));
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("El tiempo total fue de " + total + " ms");
        inicio=0;fin=0;total=0;
        //10
        inicio = System.currentTimeMillis();
        System.out.println("El arreglo es: "+ dfs(c,k));
        System.out.println("La soluciones es: "+solution(c,k));
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("El tiempo total fue de " + total + " ms");
        inicio=0;fin=0;total=0;
        //11
        inicio = System.currentTimeMillis();
        System.out.println("El arreglo es: "+ dfs(g,i));
        System.out.println("La soluciones es: "+solution(g,i));
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("El tiempo total fue de " + total + " ms");
        inicio=0;fin=0;total=0;
        //12
        inicio = System.currentTimeMillis();
        System.out.println("El arreglo es: "+ dfs(e,f));
        System.out.println("La soluciones es: "+solution(e,f));
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("El tiempo total fue de " + total + " ms");
        inicio=0;fin=0;total=0;
        //13
        inicio = System.currentTimeMillis();
        System.out.println("El arreglo es: "+ dfs(a,l));
        System.out.println("La soluciones es: "+solution(a,l));
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("El tiempo total fue de " + total + " ms");
        inicio=0;fin=0;total=0;
        //14
        inicio = System.currentTimeMillis();
        System.out.println("El arreglo es: "+ dfs(e,d));
        System.out.println("La soluciones es: "+solution(e,d));
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("El tiempo total fue de " + total + " ms");
        inicio=0;fin=0;total=0;
        //15
        inicio = System.currentTimeMillis();
        System.out.println("El arreglo es: "+ dfs(k,b));
        System.out.println("La soluciones es: "+solution(k,b));
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("El tiempo total fue de " + total + " ms");
        inicio=0;fin=0;total=0;
        //16
        inicio = System.currentTimeMillis();
        System.out.println("El arreglo es: "+ dfs(j,i));
        System.out.println("La soluciones es: "+solution(j,i));
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("El tiempo total fue de " + total + " ms");
        inicio=0;fin=0;total=0;
        //17
        inicio = System.currentTimeMillis();
        System.out.println("El arreglo es: "+ dfs(a,i));
        System.out.println("La soluciones es: "+solution(a,i));
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("El tiempo total fue de " + total + " ms");
        inicio=0;fin=0;total=0;
        //18
        inicio = System.currentTimeMillis();
        System.out.println("El arreglo es: "+ dfs(e,k));
        System.out.println("La soluciones es: "+solution(e,k));
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("El tiempo total fue de " + total + " ms");
        inicio=0;fin=0;total=0;
        //19
        inicio = System.currentTimeMillis();
        System.out.println("El arreglo es: "+ dfs(b,k));
        System.out.println("La soluciones es: "+solution(b,k));
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("El tiempo total fue de " + total + " ms");
        inicio=0;fin=0;total=0;
        //20
        inicio = System.currentTimeMillis();
        System.out.println("El arreglo es: "+ dfs(d,k));
        System.out.println("La soluciones es: "+solution(d,k));
        fin = System.currentTimeMillis();
        total = fin - inicio;
        System.out.println("El tiempo total fue de " + total + " ms");
        inicio=0;fin=0;total=0;

        
    }

    static ArrayList<Character> dfs(String s1,String s2){
        int len1 = s1.length();
        int len2 = s2.length();
        ArrayList<Character> ans = new ArrayList<>();
        for (int i = 0; i < len1; i++) {
            ArrayList<Character> list = new ArrayList<>();
            for (int j = 0; j < len2; j++) {
                if (s1.charAt(i) == s2.charAt(j)){
                    list.add(s1.charAt(i));
                    list.addAll(dfs(s1.substring(i+1),s2.substring(j+1)));
                    break;
                }
            }
            if (list.size()>ans.size()){
                ans = list;
            }
        }
        return ans;
    }

    static String solution(String s1,String s2){
        int len1 = s1.length();
        int len2 = s2.length();
        int [][]dp = new int[len1+1][len2+1];
        int flag = 0;
        for (int i = 1; i <=len1; i++) {
            if (flag == 1){
                dp[i][1] = 1;
            }else if (s1.charAt(i-1) == s2.charAt(0)){
                dp[i][1] = 1;
                flag = 1;
            }else {
                dp[i][1] = 0;
            }
        }
        flag = 0;
        for (int i = 1; i <=len2; i++) {
            if (flag == 1){
                dp[1][i] = 1;
            }else if (s2.charAt(i-1) == s1.charAt(0)){
                dp[1][i] = 1;
                flag = 1;
            }else {
                dp[1][i] = 0;
            }
        }
        for (int i = 2; i <= len1; i++) {
            for (int j = 2; j <=len2; j++) {
                int max = Math.max(dp[i-1][j],dp[i][j-1]);
                if (s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = Math.max(max,dp[i-1][j-1]+1);
                }else {
                    dp[i][j] = max;
                }
            }
        }
        return parseDp(dp,s1,s2);
    }

    private static String parseDp(int[][] dp, String s1, String s2) {
        int M = s1.length();
        int N = s2.length();
        StringBuilder sb = new StringBuilder();
        while (M>0 && N>0){
            if (dp[M][N]>Math.max(dp[M-1][N],dp[M][N-1])){
                sb.insert(0,s1.charAt(M-1));
                M--;
                N--;
            }else {
                if (dp[M-1][N]>dp[M][N-1]){
                    M--;
                }else {
                    N--;
                }
            }
        }
        return sb.toString();
    }
}