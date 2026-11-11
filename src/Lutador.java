public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;



    public void apresentar() {
        System.out.println("INFORMAÇÕES DO LUTADOR");
        System.out.println("----------------------");
        System.out.println("Nome do lutador: " + this.getNome());
        System.out.println("Nacionalida do lutador: " + this.getNacionalidade());
        System.out.println("Idade do lutador: " + this.getIdade());
        System.out.println("Altura do lutador: " + this.getAltura());
        System.out.println("Pesando: " + this.getPeso());
        System.out.println("Categoria do lutador: " + this.getCategoria());
        System.out.println("----------------------");
    }

    public void status() {
        System.out.println("Status atual do lutador: " + this.getNome());
        System.out.println("O lutador " + this.getNome() + " Pesando " + this.getPeso() + " Está com:");
        System.out.println("VITORIAS: " + this.getVitorias());
        System.out.println("DERROTAS: " + this.getDerrotas());
        System.out.println("EMPATES: " + this.getEmpates());
    }

    public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);

    }
    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);

    }
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return this.categoria;
    }

    private void setCategoria() {
        if (this.getPeso() < 52.2) {
            this.categoria = "Inválido";
        } else if (this.getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if (this.getPeso() <= 83.9) {
            this.categoria = "Médio";
        } else if (this.getPeso() <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

}
