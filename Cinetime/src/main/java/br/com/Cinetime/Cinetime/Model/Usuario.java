package br.com.Cinetime.Cinetime.Model;

import jakarta.persistence.*;

import java.util.Date;

//infomações do nosso usuario
@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Date dataNascimento;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String senha;

    public Usuario(Long id, String name, Date dataNascimento, String email, String senha) {
        this.id = id;
        this.name = name;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDataNascimento(Date dataNascimento) {return dataNascimento; }

    public void setDataNascimento(Date dataNascimento) {this.dataNascimento = dataNascimento; }

    public String getEmail() {return email; }

    public void setEmail(String email) {this.email = email; }

    public String getSenha() {return senha; }

    public void setSenha(String senha) {this.senha = senha; }
}
