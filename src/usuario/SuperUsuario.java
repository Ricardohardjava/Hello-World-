package usuario;

public class SuperUsuario {

private String login; // caracteristica da clase = atributos da classe , private = modificador de acesso
private String senha; // atributo , private = modificador de acesso
String nome; // atributos ( login, senha e nome)

public SuperUsuario(final String login, final String senha) {
    this.login = login;
    this.senha = senha;
}

public String getLogin() { return login;}
protected String getSenha() { return senha;}

}
