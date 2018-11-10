package trabalhopraticoso;

/**
 *
 * @author Felipe Tomaz
 */
public class Tarefa {
    private String idTarefa;
    private String idFuncionario;
    private int tempoDeExecucao;

    public Tarefa(String idFuncionario, String idTarefa, int tempoDeExecucao) {
        this.idFuncionario = idFuncionario;
        this.idTarefa = idTarefa;
        this.tempoDeExecucao = tempoDeExecucao;
    }

    public String getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(String idTarefa) {
        this.idTarefa = idTarefa;
    }

    public int getTempoDeExecucao() {
        return tempoDeExecucao;
    }

    public void setTempoDeExecucao(int tempoDeExecucao) {
        this.tempoDeExecucao = tempoDeExecucao;
    }

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    
    
    
}
