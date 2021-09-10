package fernandamakihirose.escola;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Funcionario extends Pessoa {

    private String setor;
    private boolean trabalhando;

    public Funcionario() {
    }

    public void mudarTrabalho() {
        trabalhando = !trabalhando;
    }

    @Override
    public String toString() {
        return "Funcionario{" + super.toString()+ "setor=" + setor + ", trabalhando=" + trabalhando + '}';
    }
}
