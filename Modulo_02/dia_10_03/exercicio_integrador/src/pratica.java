public class pratica {
    public static void main(String[] args) throws Exception {
        String[] cidades = {
            "Londres", "Madrid", "Nova York", "Buenos Aires", "Asuncion", "São Paulo", "Lima", "Santiago", "Lisboa", "Toquio"
        };
        int[][] temp = { {-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};
        
        // verificar a menor temperatura na coluna 0
        int menor = temp[0][0];
        int maior = temp[1][0];
        int cidadeLow = 0;
        int cidadeHight = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i][0] < menor) {
                menor = temp[i][0];
                cidadeLow = i;
            }
            if (temp[i][1] > maior) {
                maior = temp[i][1];
                cidadeHight = i;
            }
        }
        System.out.println("A cidade com a menor temperatura é: " + cidades[cidadeLow]);
        System.out.println("A cidade com a maior temperatura é: " + cidades[cidadeHight]);
    }
}
