package trabalhopraticoso;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Felipe Tomaz
 */
public class MonitorTarefas {
    
    private Tarefa [] tarefas;
    private int QUANTIDADE_DE_TAREFAS;
    private int in;
    private int out;
    private int cont;
    
    public MonitorTarefas(int quantidade){
        this.QUANTIDADE_DE_TAREFAS = quantidade;
        tarefas = new Tarefa[QUANTIDADE_DE_TAREFAS];
        this.in = 0;
        this.out = 0;
        this.cont = 0;
    }
    
    public synchronized Tarefa remove(){
        while(cont == 0){
             try {
                 this.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(MonitorTarefas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        cont--;
        Tarefa t = tarefas[out];
        out = (out + 1)%QUANTIDADE_DE_TAREFAS;
        this.notifyAll();
        return t;
    }
    
    public synchronized void insere(Tarefa t){
        while(cont == QUANTIDADE_DE_TAREFAS){
            try {
                this.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(MonitorTarefas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        cont++;
        tarefas[in] = t;
        in = (in + 1)%QUANTIDADE_DE_TAREFAS;
        this.notifyAll();
    }
    
}
