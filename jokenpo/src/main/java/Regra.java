import java.util.*;

class Regra {
    HashMap<String, Set<String>> ganhaDe = new HashMap<>();

    public boolean jogar(String a, String b){
        return ganhaDe.get(a).contains(b);
    }

    public void addRule(String chave, Set<String> valor) {
        ganhaDe.put(chave, valor);
    }
}

class Main {
    public static void main(String[] args) {
        String pedra = "pedra";
        String papel = "papel";
        String tesoura = "tesoura";

        Regra jokenpo = new Regra();

        jokenpo.addRule(papel, Set.of(pedra));
        jokenpo.addRule(pedra, Set.of(tesoura));
        jokenpo.addRule(tesoura, Set.of(papel));

        boolean pedraGanhaDePapel = jokenpo.jogar(pedra, papel);
        boolean papelGanhaDePedra = jokenpo.jogar(papel, pedra);
        System.out.println("Pedra ganha de papel: " + pedraGanhaDePapel);
        System.out.println("Papel ganha de pedra: " + papelGanhaDePedra);
    }
}