public class Date{  
    private int dia;  
    private int mes;  
    private int ano;  
    
    public Date(int _dia, int _mes, int _ano){ 
	dia = _dia;
	mes = _mes;
	ano = _ano;
        
    }  
    public void setDia(int _dia){  
        _dia = dia;  
    }  
    public int getDia(){  
        return dia;  
    }  
    
   
    public void setMes(int _mes){  
        _mes = mes;  
    }  
    public int getMes(){  
        return mes;  
    }  
    
   
    public void setAno(int _ano){  
        _ano = ano;  
    }  
    public int getAno(){  
        return ano;  
    }  
   
    public void displayDate(){  
        System.out.print(dia + "/" + mes + "/" + ano);  
    }  
}
