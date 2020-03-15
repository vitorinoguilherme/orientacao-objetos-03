package exercicios;

public class Correntista {
    private String codigo;
    private String nome;
    private String email;
    private Integer tel;

    public Correntista(String codigo) {
        this(codigo, "null", "null", 1);
    }

    public Correntista(String nome, String email) {
        this("null", nome, email, 1);
    }

    public Correntista(String nome, String email, Integer tel) {
        this("null", nome, email, tel);
    }

    public Correntista(String codigo, String nome, String email, Integer tel) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setEmail(email);
        this.setTel(tel);
    }

    public static Correntista criarComNomeEmail(String nome, String email) {
        return new Correntista(nome, email);
    }

    public void setCodigo(String codigo) {
        if ( codigo == null )
            throw new IllegalArgumentException("Informe o código do Correntista");
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        if ( nome == null )
            throw new IllegalArgumentException("Informe o nome do Correntista");
        this.nome = nome;
    }

    public void setEmail(String email) {
        if ( email == null )
            throw new IllegalArgumentException("Informe o e-mail do Correntista");
        this.email = email;
    }

    public void setTel(Integer tel) {
        if ( tel <= 0 )
            throw new IllegalArgumentException("Informe o telefone do Correntista");
        this.tel = tel;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getTel() {
        return tel;
    }

}
