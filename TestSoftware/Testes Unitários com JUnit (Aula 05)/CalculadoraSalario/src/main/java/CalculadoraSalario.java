public class CalculadoraSalario {

    public static double desconto;

    public static double CalcularINSS(double salarioBruto)
    {
        if(salarioBruto <= 1320){
            desconto = salarioBruto * 0.075;
        }
        else if(salarioBruto > 1320  && salarioBruto <= 2571.29)
        {
            desconto = (1320 * 0.075) + ((salarioBruto - 1320) * 0.09);
        }
        else if(salarioBruto > 2751.30  && salarioBruto <= 3856.94)
        {
            desconto = (1320 * 0.075) + ((2571.30 - 1320) * 0.09) + ((salarioBruto - 2571.30) * 0.12);
        }
        else if(salarioBruto > 3856.94  && salarioBruto <= 7507.49)
        {
            desconto = (1320 * 0.075) + ((2571.30 - 1320) * 0.09) + ((3856.94 - 2571.30) * 0.12) + ((salarioBruto - 3856.94) * 0.14);
        }
        else
        {
            salarioBruto = 7507.49;
            desconto = (1320 * 0.075) + ((2571.30 - 1320) * 0.09) + ((3856.94 - 2571.30) * 0.12) + ((salarioBruto - 3856.94) * 0.14);
        }
        return desconto;
    }
}
