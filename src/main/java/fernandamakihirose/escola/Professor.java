package fernandamakihirose.escola;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Professor extends Pessoa {

    private String especialidade;
    private float salario;

    public Professor() {
    }

    public void receberAumento(float aumento) {
        salario += aumento;
    }

    @Override
    public String toString() {
        return "Professor{" + super.toString()+ "especialidade=" + especialidade + ", salario=" + salario + '}';
    }
}