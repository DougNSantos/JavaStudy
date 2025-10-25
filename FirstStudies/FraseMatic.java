public class FraseMatic {
    public static void main(String args[]){
        String[] listaUm = {"agnostico", "terapeutico", "mundano"};
        String[] listaDois = {"IoT", "humanizado", "roboto", "élfico"};
        String[] listaTres = {"Framework", "API","RESTful", "SpringBoot"};

        int tamUm = listaUm.length;
        int tamDois = listaDois.length;
        int tamTres = listaTres.length;

        java.util.Random randomico = new java.util.Random();
        int ranUm = randomico.nextInt(tamUm);
        int ranDois = randomico.nextInt(tamDois);
        int ranTres = randomico.nextInt(tamTres);

        String frase = listaUm[ranUm] + " " + listaDois[ranDois] + " " + listaTres[ranTres];

        System.out.println("precisamos de " + frase);
    }
}
    