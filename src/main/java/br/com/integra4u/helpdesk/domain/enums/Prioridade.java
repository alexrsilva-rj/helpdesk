package br.com.integra4u.helpdesk.domain.enums;

public enum Prioridade {
    BAIXA(0,"BAIXA"), MEDIA(1,"MEDIA"), ALTA(2,"ALTA");

    Integer codigo;
    String descricao;

    Prioridade(Integer codigo, String descricao) {
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

    public static Prioridade getPrioridade(Integer codigo) {
        if (codigo == null) {
            return null;
        }
        for (Prioridade prioridade : Prioridade.values()) {
            if (prioridade.getCodigo().equals(codigo)) {
                return prioridade;
            }
        }
        throw new IllegalArgumentException("Prioridade inválida");
    }
}
