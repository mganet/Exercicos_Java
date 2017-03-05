package Model;

public class Aluno {

    private String nome;
    private String contacto;
    private int nota;

    public Aluno(String nome, String contacto, int nota) {
        this.nome = nome;
        this.contacto = contacto;
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    
    
    
}
