
package trabalhopraticoso;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Felipe Tomaz
 */
public class Maquina extends Thread{
    
    private final String nome;
    private final MonitorTarefas monitor;
    
    public Maquina(String nome,MonitorTarefas monitor){
        this.nome = nome;
        this.monitor = monitor;
    }
    
    @Override
    public void run() {
        
        Tarefa t = monitor.remove();
        System.out.println("Máquina: "+nome+" Funcionário: "+t.getIdFuncionario()+
                " Tarefa: "+ t.getIdTarefa()+" Tempo de Execução :"+t.getTempoDeExecucao());
        try {
            sleep(t.getTempoDeExecucao());
        } catch (InterruptedException ex) {
            Logger.getLogger(Maquina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
