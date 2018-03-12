
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */



public class Calculadora
{
    // instance variables - replace the example below with your own
    private int    num1, num2;
    private double dob1, dob2;
    private Integer    rdo;
    private Double drdo;
    private char co, mander, meleon, izard, latan, cuteria;
    private int ermedio, erceptar, eresante, olerable, erpretar, rinseco, ratable, erminable, 
                ruso, romision, erceptado, ecepcion, ro, egral, achable, ernos/*, las demas te
                las buscas tu!!! >.<*/;
    private Operacion op;

    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {
        // initialise instance variables
        num1 = 0;
        num2 = 0;
        dob1 = 0;
        dob2 = 0;
        op=op.SUMA;
        
    }
    
    public void ponNum1(int n1)
    {
        // put your code here
        this.num1=n1;
    }
    
    public void ponNum2(int n2)
    {
        // put your code here
        this.num2=n2;
    }
    
    public void ponDob1(double d1)
    {
        // put your code here
        this.dob1=d1;
        this.num1=(int)d1;
    }
    
    public void ponDob2(double d2)
    {
        // put your code here
        this.dob2=d2;
        this.num2=(int)d2;
    }

    public void opera()
    {
        switch(op){
            case SUMA:
                rdo=num1+num2;
                break;
            case RESTA:
                rdo=num1-num2;
                break;
            case MULTIPLICA:
                rdo=num1*num2;
                multiplicacion(dob1,dob2);
                break;
            case DIVIDE:
                rdo=num1/num2;
                break;
            case SUMAd:
                drdo=dob1+dob2;
                rdo=num1+num2;
                break;
            case RESTAd:
                drdo=dob1-dob2;
                rdo=num1-num2;
                break;
            case MULTIPLICAd:
                drdo=dob1*dob2;
                rdo=num1*num2;
                break;
            case DIVIDEd:
                drdo=dob1/dob2;
                rdo=num1/num2;
                break;
            case SQRT:
                drdo=Math.sqrt(dob1);
                break;
            case nROOT:
                //drdo=Math.pow(Math.E, Math.log(dob1)/dob2);
                drdo=Math.pow(Math.exp (1/dob2),Math.log(dob1));
                break;
            case LOG:
                drdo=Math.log(dob1);
                break;
            case nLOG:
                drdo=(Math.log(dob1) / Math.log(dob2));
                break;
            case FACTORIAL:
                rdo=factorial(num1);
                break;
            default:
                System.err.println("error: operacion malpuesta ");
                break;
        }
    }
    public void ponOperacion(String opera){
        switch(opera){
        
            case "SUMA":
                op=op.SUMA;
                break;
            case "RESTA":
                op=op.RESTA;
                break;
            case "MULTIPLICA":
                op=op.MULTIPLICA;
                break;
            case "DIVIDE":
                op=op.DIVIDE;
                break;
            case "SUMAd":
                op=op.SUMAd;
                break;
            case "RESTAd":
                op=op.RESTAd;
                break;
            case "MULTIPLICAd":
                op=op.MULTIPLICAd;
                break;
            case "DIVIDEd":
                op=op.DIVIDEd;
                break;
            case "SQRT":
                op=op.SQRT;
                break;
            case "nROOT":
                op=op.nROOT;
                break;
            case "LOG":
                op=op.LOG;
                break;
            case "nLOG":
                op=op.nLOG;
                break;
            case "FACTORIAL":
                op=op.FACTORIAL;
                break;
            default:
                System.err.println("errah: pon la opaçio (a)bion ");
                break;
        }
    }
    
    private int suma(int a, int b)
    {
    	/*
        this.num1=a;
        this.num2=b;
        op=op.SUMA;
        rdo=a+b;
        */
        return a+b;
    }
    
    private int resta(int a, int b)
    {
    	/*
        suma(a,-b);
        this.num2=b;
        op=op.RESTA;
        rdo=suma(a,-b);
        */
        return suma(a,-b);
    }
    
    private double multiplicacion(double a, double b)
    {
    	/*
        op=op.MULTIPLICA;
        this.dob1=a;
        this.dob2=b;
        this.num1=(int) a;
        this.num2=(int) b;
        drdo = this.dob1 * this.dob2;
        rdo = this.num1 * this.num2; 
        */
        return this.dob1 * this.dob2;
    }
    private int multiplicacion(int a, int b)
    {
    	return this.num1 * this.num2;
    }
    
    private double divide(double a, double b)
    {
    	/*
        op=op.DIVIDE;
        this.dob1=a;
        this.dob2=b;
        this.num1=(int) a;
        this.num2=(int) b;
        drdo = this.dob1 / this.dob2;
        rdo = this.num1 / this.num2;
        */
        return this.dob1 / this.dob2;
    }
    private int divide(int a, int b)
    {
    	return this.num1 / this.num2;
    }
    
    private double sqrt(double a)
    {
    	if(dob1<0)
    	{
    		System.err.println("error: Actualmente no soportamos numeros no reales, sorry");
    	}else{
    		return Math.sqrt(dob1);
    	}
    	return -1;
    }
    
    private double nroot(double radicando, double indice)
    {
    	return Math.pow(Math.exp (1/dob2),Math.log(dob1));
    }
    
    private double log(double a)
    {
    	return Math.log(dob1);
    }
    
    private double nlog(double a, double base)
    {
		return (Math.log(dob1) / Math.log(dob2));
    }
    
    /*
    private int factorial(int num)
    {
        int factorial;
        int numero =num;
        while ( numero!=0) {
          factorial=factorial*numero;
          numero--;
        }
        return factorial;
    }
    */
    public int factorial (int numero) {
        if (numero==0)
            return 1;
        else
            return numero * factorial(numero-1);
    }
        
    public int dameResultado()
    {
        // put your code here
        
        return rdo;
    }
    public double dameResultadod()
    {
        // put your code here
        
        return drdo;
    }
    
    public void muestraTodosResultados(){
        System.out.println("Num1="        + Integer.toString(num1)+
                           " Num2="       + Integer.toString(num2));
        System.out.println("Suma :"       + Integer.toString(num1+num2));
        System.out.println("Resta :"      + Integer.toString(num1-num2));
        System.out.println("Multiplica :" + Integer.toString(num1*num2));
        System.out.println("Divide :"     + Integer.toString(num1/num2));
    }
}
