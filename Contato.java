public class Contato {

    private String ag;
    private String conta;
    private String nome;
    private String email;
    private String Telefone;
    private float saldo;
    public Contato() {}

    public Contato(String ag, String conta, String nome, String email, float saldo) {
        this.ag = ag;
        this.conta = conta;
        this.nome = nome;
        this.email = email;
        this.saldo = saldo;
    }

    public String getAg() {
        return ag;
    }

    public void setAg(String ag) {
        this.ag = ag;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

}