package revisao;

public class Juntar {
    public static int[] juntarVetor(int[] vet1, int[] vet2){
        int vetorNovo[] = new int[vet1.length + vet2.length];

        System.arraycopy(vet1, 0, vetorNovo, 0, vet1.length);
        System.arraycopy(vet2, 0, vetorNovo, vet1.length, vet2.length);

        System.out.println();

        return vetorNovo;

    }
    
}