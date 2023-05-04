package cursoestruturadedadosjava.teste;

import java.util.Objects;

public class Contato {
    private String nome;
    private String tel;
    private String email;

    public Contato() {    }
    
    public Contato(String nome, String tel, String email) {
        super();
        this.nome = nome;
        this.tel = tel;
        this.email = email;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", tel=" + tel + ", email=" + email + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contato other = (Contato) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.tel, other.tel)) {
            return false;
        }
        return Objects.equals(this.email, other.email);
    }

    
    
    
}
