package mabu;

import java.io.Serializable;
import java.util.LinkedList;

public class CuentaBancaria implements Serializable {
    
    private String nroCuenta;
    private Integer saldo;
        
    public CuentaBancaria(){
    }
        
        

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }
    
    

    public static LinkedList<CuentaBancaria> getList_cuentas() {    
       
        LinkedList<CuentaBancaria> list_cuentas = new LinkedList<>();  
        CuentaBancaria c1 = new CuentaBancaria();
        CuentaBancaria c2 = new CuentaBancaria();
        CuentaBancaria c3 = new CuentaBancaria();
        
        c1.setNroCuenta("00000001");
        c2.setNroCuenta("00000002");
        c3.setNroCuenta("00000003");
        
        c1.setSaldo(10000000);
        c2.setSaldo(20000000);
        c3.setSaldo(15000000);
        
            list_cuentas.add(c1);
            list_cuentas.add(c2);
            list_cuentas.add(c3);
        
        return list_cuentas;
    }        

}