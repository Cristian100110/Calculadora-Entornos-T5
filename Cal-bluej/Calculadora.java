
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
    private String srdo;
    private String errah;
    /*
    private char co, mander, meleon, izard, latan, cuteria;
    private int ermedio, erceptar, eresante, olerable, erpretar, rinseco, ratable, erminable, 
                ruso, romision, erceptado, ecepcion, ro, egral, achable, ernos
                ///, las demas te las buscas tu!!! >.
                ;
    */
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
        this.dob1=(double) n1;
    }
    public void /*ponDob1*/ponNum1(double d1)
    {
        // put your code here
        this.dob1=d1;
        this.num1=(int)d1;
    }
    
    public void ponNum2(int n2)
    {
        // put your code here
        this.num2=n2;
        this.dob2=(double) n2;
    }
    public void /*ponDob2*/ponNum2(double d2)
    {
        // put your code here
        this.dob2=d2;
        this.num2=(int)d2;
    }

    public void opera()
    {
        switch(op){
            case SUMA:
                drdo=suma(dob1,dob2);
                break;
            case RESTA:
                drdo=resta(dob1,dob2);
                break;
            case MULTIPLICA:
                //rdo=num1*num2;
                drdo=multiplicacion(dob1,dob2);
                break;
            case DIVIDE:
                //rdo=num1/num2;
                drdo=divide(dob1,dob2);
                break;
            case SUMAi:
                rdo=suma(num1,num2);
                drdo=(double)rdo;
                break;
            case RESTAi:
                rdo=resta(num1,num2);
                drdo=(double)rdo;
                break;
            case MULTIPLICAi:
                rdo=multiplicacion(num1,num2);
                drdo=(double)rdo;
                break;
            case DIVIDEi:
                rdo=divide(num1,num2);
                drdo=(double)rdo;
                break;
            case SQRT:
                //drdo=Math.sqrt(dob1);
                drdo=this.Sqrt(dob1);
                break;
            case nROOT:
                //drdo=Math.pow(Math.E, Math.log(dob1)/dob2);
                //drdo=Math.pow(Math.exp (1/dob2),Math.log(dob1));
                drdo=nroot(dob1,dob2);
                break;
            case LOG:
                drdo=Math.log10(dob1);
                break;
            case nLOG:
                drdo=(Math.log(dob1) / Math.log(dob2));
                break;
            case LN:
                drdo=ln(dob1);
                break;
            case FACTORIAL:
                rdo=factorial(num1);
                drdo=(double)rdo;
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
            case "SUMAi":
                op=op.SUMAi;
                break;
            case "RESTAi":
                op=op.RESTAi;
                break;
            case "MULTIPLICAi":
                op=op.MULTIPLICAi;
                break;
            case "DIVIDEi":
                op=op.DIVIDEi;
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
            case "LN":
                op=op.LN;
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
        errah="";
        int num;
        num=a+b;
        if(a>0 && b>0 && num<0 )
            errah="Infinity (result out of range)";
        if(a<0 && b<0 && num>0 )
            errah="-Infinity (result out of range)";
        return num;
    }
    private double suma(double a, double b)
    {
        errah="";
        double num;
        num=a+b;
        if(a>0 && b>0 && num<0 )
            errah="Infinity (result out of range)";
        if(a<0 && b<0 && num>0 )
            errah="-Infinity (result out of range)";
        return num;
    }
    
    private int resta(int a, int b)
    {/*
        errah="";
        return suma(a,-b);*/
        errah="";
        int num;
        num=a-b;
        if(a>0 && b<0 && num<0 )
            errah="Infinity (result out of range)";
        if(a<0 && b>0 && num>0 )
            errah="-Infinity (result out of range)";
        return num;
    }
    private double resta(double a, double b)
    {
        errah="";
        return suma(a,-b);
    }
    
    private double multiplicacion(double a, double b)
    {
        errah="";
        double num;
        num=a*b;
        if(a>0 && b>0 && num<0 )
            errah="Infinity (result out of range)";
        if((a<0 && b>0 || a>0 && b<0) && num>0 )
            errah="-Infinity (result out of range)";
        return num;
    }
    private int multiplicacion(int a, int b)
    {
        errah="";
        int num;
        num=a*b;
        if(a>0 && b>0 && num<0 )
            errah="Infinity (result out of range)";
        if((a<0 && b>0 || a>0 && b<0) && num>0 )
            errah="-Infinity (result out of range)";
        return num;
    }
    
    private double divide(double a, double b)
    {
        errah="";
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
        errah="";
        return this.num1 / this.num2;
    }
    
    private double Sqrt(double a)
    {
        errah="";
        if(dob1<0)
        {
            System.err.println("error: Actualmente no soportamos numeros no reales, sorry");
            errah="Operacion no soportada";
        }else{
            return Math.sqrt(dob1);
        }
        return -1;
    }
    
    private double nroot(double radicando, double indice)
    {
        errah="";
        
        return Math.pow(Math.exp (1/dob2),Math.log(dob1));
    }
    
    private double log(double a)
    {
        errah="";
        return Math.log(dob1);
    }
    
    private double nlog(double a, double base)
    {
        errah="";
        return (Math.log(dob1) / Math.log(dob2));
    }
    
    private double ln(double a)
    {
        errah="";
        return (Math.log(dob1) / Math.log(Math.E));
    }

    private int factorial (int numero) {
        errah="";
        if (numero==0)
            return 1;
        else
            return numero * factorial(numero-1);
    }
        
    private void does_errah_ocurred()
    {
        if (errah != "")
        {
            srdo=errah;
        }else{
            if(hasdecimals(drdo))
                srdo=String.valueOf(drdo);
            else{
                rdo=(int) drdo.intValue();
                srdo=String.valueOf(rdo);
            }
        }
    }
    private Boolean hasdecimals(double d)
    {
        Boolean a;
        if(d % 1 == 0)
        {
            a = false;
        }
        else
        {
            a = true;
        }
        return a;
    }
    public String /*int*/ dameResultado()
    {
        // put your code here
        does_errah_ocurred();
        //return rdo;
        return srdo;
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
