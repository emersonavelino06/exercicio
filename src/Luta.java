import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;


    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
          this.aprovada = true;
          this.desafiado = l1;
          this.desafiante = l2;
            System.out.println("Luta maracada com sucesso");
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
            System.out.println("Não é possivel marcar a luta");
        }

    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("Lutador desafiado");
            this.desafiado.apresentar();
            System.out.println("lutador desafiante");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            switch (vencedor) {
                case 0:
                    System.out.println("Emapatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;

                case 1:
                    System.out.println("Venceu o lutador desafiante: " + this.desafiante.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

                case 3:
                    System.out.println("Venceu o lutador desafiado: " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
            }

        } else  {
            System.out.println("A luta não pode acontecer");
        }

    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
