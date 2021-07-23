package assign_23_07.Main.Model;

import java.util.List;

public class Calculator implements Arithemetic{
    private int[] numbers;


    public Calculator(int[] numbers) {
        this.numbers = numbers;

    }




    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void sum() {

        int sum = 0;
        for (int numb: numbers
             ) {
            sum += numb;
        }
        System.out.println(sum);

    }



    @Override
    public void subtract() {
        int sum = 0;
        for (int numb: numbers
        ) {
            sum -= numb;
        }
        System.out.println(sum);
    }

    @Override
    public void multiply() {
        int sum = 0;
        for (int numb: numbers
        ) {
            sum = sum * numb;
        }
        System.out.println(sum);

    }

    @Override
    public void divide() {
        int sum = 0;
        for (int numb: numbers
        ) {
            sum = sum/ numb;
        }
        System.out.println(sum);

    }
}
