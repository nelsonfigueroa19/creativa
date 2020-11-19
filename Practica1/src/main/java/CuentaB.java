public abstract class CuentaB {

    
    //atributos de la clase 
    private String NombreC;
    private String NumeroC;
    private double TipodeI;
    private double Saldo;
    
    //Metodos Setter y Getters
    public void SetNombreC(String NombreC){
        this.NombreC = NombreC;
    }
    public String GetNombreC(){
        return NombreC;
    }
    public void SetNumeroC(String NumeroC){
        this.NumeroC = NumeroC;
    }
    public String GetNumeroC(){
        return NumeroC;
    }
    public void SetTipodeI(double TipodeI){
        this.TipodeI = TipodeI;
    }
    public double GetTipodeI(){
        return TipodeI;
    }
    public void SetSaldo(double Saldo){
        this.Saldo = Saldo;
    }
    public double GetSaldo(){
        return Saldo;
    }
    //Constructor por defecto
    public CuentaB(){
        
    }
    //Constructor con parametros
     public CuentaB(String _NombreC, String _NumeroC, double _TipodeI, double _Saldo){
        NombreC =  _NombreC;
        NumeroC = _NumeroC;
        TipodeI = _TipodeI;
        Saldo = _Saldo;
    }
     
    public CuentaB(CuentaB cuentab)
    {
	this.NombreC = cuentab.NombreC;
	this.NumeroC = cuentab.NumeroC;
	this.TipodeI = cuentab.TipodeI;
	this.Saldo = cuentab.Saldo;
	}

     public abstract String Mensaje1(String constructor);

 }
   
