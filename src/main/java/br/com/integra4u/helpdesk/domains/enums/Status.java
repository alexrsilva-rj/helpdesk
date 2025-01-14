package br.com.integra4u.helpdesk.domains.enums;

public enum Status {
    ABERTO(0,"ABERTO"), ANDAMENTO(1,"ANDAMENTO"), ENCERRADO(2,"ENCERRADO");

    Integer codigo;
    String descricao;

    Status(Integer codigo, String descricao) {
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

    public static Status getPerfil(Integer codigo) {
        if (codigo == null) {
            return null;
        }
        for (Status perfil : Status.values()) {
            if (perfil.getCodigo().equals(codigo)) {
                return perfil;
            }
        }
        throw new IllegalArgumentException("Status inválido");
    }
}
