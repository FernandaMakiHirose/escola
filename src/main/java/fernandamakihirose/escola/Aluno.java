package fernandamakihirose.escola;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Aluno extends Pessoa {

    private String matr;
    private String curso;

    public Aluno() {
    }

    public void cancelarMatr() {
        System.out.println("Matrícula será cancelada");
    }

    @Override
    public String toString() {
        return "Aluno{" +super.toString()+ "matr=" + matr + ", curso=" + curso + '}';
    }
}