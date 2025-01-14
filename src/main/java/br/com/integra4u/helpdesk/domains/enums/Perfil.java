package br.com.integra4u.helpdesk.domains.enums;

public enum Perfil {
    ADMIN(0,"ROLE_ADMN"), CLIENTE(1,"ROLE_CLIENTE"), TECNICO(2,"ROLE_TECNICO");

    Integer codigo;
    String descricao;

    Perfil(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static Perfil getPerfil(Integer codigo) {
        if (codigo == null) {
            return null;
        }
        for (Perfil perfil : Perfil.values()) {
            if (perfil.getCodigo().equals(codigo)) {
                return perfil;
            }
        }
        throw new IllegalArgumentException("Perfil inválido");
    }
}
