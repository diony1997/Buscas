package pkg23.pkg08;

public class Main 
{

    public static void main(String[] args) 
    {
        int vetor[] = {2, 3, 4, 5};
//        ordenador(vetor);
//        for (int i = 0; i < vetor.length; i++) {
//            System.out.println(vetor[i]+" ");
//        }
    System.out.println(buscaBinOrd(5, vetor));
    }

    public static void ordenador(int vetor0[])
    {
        int aux = 0;
        for (int i = 0; i < vetor0.length; i++)
        {
            for (int j = i+1; j < vetor0.length; j++)
            {
                if(vetor0[i] > vetor0[j])
                {
                    aux = vetor0[i];
                    vetor0[i] = vetor0[j];
                    vetor0[j] = aux;
                    
                }
            }
        }
    }
    
    public static int buscaSeq(int valor, int vetor[]) 
    {

        for (int i = 0; i < vetor.length; i++) 
        {
            if (vetor[i] == valor) 
            {
                return i;
            }
        }
        return -1;
    }
    
    //a ultima posição do vetor esta com o valor de busca
    public static int buscaSeqV2(int valor, int vetor[])
    {
        int i = 0;
        while(true)
        {
            if(vetor[i]==valor)
            {
                break;
            }
            i++;
        }
        if(i==vetor.length)
        {
            return -1;
        } else 
        {
            return i;
        }
    }
    
    //para um vetor ordenado de ordem crescente, se o valor no vetor for maior que a busca para de procurar
    public static int buscaSeqOrd(int valor, int vetor[])
    {
        for (int i = 0; i < vetor.length; i++)
        {
            if(vetor[i] == valor)
            {
                return i;
            }
            if(vetor[i] > valor)
            {
                break;
            }
        }
        return -1;
    }
    
    //busca o valor fazendo comparaçoes se o valor é maior ou menor do que a metade do vetor 
    public static int buscaBinOrd(int valor, int vetor[])
    {
        int esq = 0;
        int dta = vetor.length-1; 
        while(esq <= dta)
        {
            int i = (esq + dta)/2;
            if(valor == vetor[i])
            {
                return i;
            }
            if(valor < vetor[i])
            {
                dta = i-1;
            } else
            {
                esq = i+1;
            }
        }
        return -1;
    }
}
