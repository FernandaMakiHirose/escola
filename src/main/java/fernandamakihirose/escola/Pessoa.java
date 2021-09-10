package fernandamakihirose.escola;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pessoa {

    private String nome;
    private int idade;
    private String sexo;

    public Pessoa() {
    }

    public void fazerAniv() {
        idade++;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
}
