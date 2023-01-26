public class ConversionDePrimitivos {
    public static void main(String[] args) {

        //de String a entero
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        //de String a real o decimal
        String realStr = "2145685.15";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        //de String a logico (false-true)
        String logicoStr = "true";
        boolean logicoBolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBolean = " + logicoBolean);

        //de entero a String
        int otroNumeroInt = 11;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        String otroNumeroStr = Integer.toString(otroNumeroInt); //Integer.toString es para convertir un entero a String
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        //Otra forma mas convencional de convertir un dato de cualquier tipo a String (sobrecarga de metodo)
        otroNumeroStr = String.valueOf(otroNumeroInt); //valueOf es llamado sobrecarga de metodo
        System.out.println("otroNumeroStr Sobrecarga de metodo = " + otroNumeroStr);
        
        double realDouble1 = 12.2569e3;
        String realStringDouble = Double.toString(realDouble1); //Double.toString es para pasar un Double a String
        System.out.println("realStringDouble = " + realStringDouble);

        realStringDouble = String.valueOf(12.4523f); //la f sabemos que es un numero de tipo float
        System.out.println("realStringDouble = " + realStringDouble);

        //convertir entre primitivos

        int i = 10000;
        short s = (short)i; //int es de 32 bits y el short de 16, por ende hay que forzar a que haga la conversion antepomiendo la variable con el tipo de dato en parentesis
        System.out.println("s = " + s);
        long l = i; //long es mayor que int, por ende no es necesario forzar su conversion
        System.out.println("l = " + l);
        char c = (char) i;
        System.out.println("c = " + c);
        float f = (float) i;
        System.out.println("f = " + f);
        
    }
}
