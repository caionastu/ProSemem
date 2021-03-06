package Classes;

import java.sql.Date;
import java.sql.Time;

public class Evento {
    private int id;
    private Date data;
    private int compromissoId;
    private int atividadeId;
    private int protocoloId;
    private String sessaoId;
    private int confirmado;
    private int bloqueado;
    private Integer horaInicio;
    private int duracao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    // Marilia
    public void setHoraInicio(Integer hora) {
        this.horaInicio = hora;
    }
    
    public Integer getHoraInicio() {
        return horaInicio;
    }
    
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    public int getDuracao() {
        return duracao;
    }
    // 
    public int getCompromissoId() {
        return compromissoId;
    }

    public void setCompromissoId(int compromissoId) {
        this.compromissoId = compromissoId;
    }

    public int getAtividadeId() {
        return atividadeId;
    }

    public void setAtividadeId(int atividadeId) {
        this.atividadeId = atividadeId;
    }

    public int getProtocoloId() {
        return protocoloId;
    }

    public void setProtocoloId(int protocoloId) {
        this.protocoloId = protocoloId;
    }

    public String getSessaoId() {
        return sessaoId;
    }

    public void setSessaoId(String sessaoId) {
        this.sessaoId = sessaoId;
    }

    public int getConfirmado() {
        return confirmado;
    }

    public void setConfirmado(int confirma) {
        this.confirmado = confirma;
    }

    public int getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(int bloqueado) {
        this.bloqueado = bloqueado;
    }
}
