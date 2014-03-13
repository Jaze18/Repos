/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ej19.pkg1;


public class colegio {
    private int notas;
    private String nombres;

    public int getNotas() {
        return notas;
    }
    public colegio()
    {
    
    }
    public colegio(String nombresV,int notasV)
    {
       notas=notasV;
       nombres=nombresV;
    }
    public void setNotas(int notas) {
        this.notas = notas;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
}
