/**
 * CalculadoraPadrao
 */
public class CalculadoraPadrao {

    private Integer num1;
    private Integer num2;

    /**
     * @return Integer return the num1
     */
    public Integer getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    /**
     * @return Integer return the num2
     */
    public Integer getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public Float soma(Float num1, Float num2){
        return num1+num2;
    }

    public Float subtracao(Float num1, Float num2){
        return num1-num2;
    }

    public Float multiplicacao(Float num1, Float num2){
        return num1*num2;
    }

    public Float divisao(Float num1, Float num2){
        return num1/num2;
    }
}