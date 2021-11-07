/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

/**
 *
 * @author MDA 174321 :)
 */
public enum ValorCarta {
    C_A(52, "As de Corazónes"),
    D_A(51, "As de Diamantes"),
    T_A(50, "As de Treboles"),
    P_A(49, "As de Picas");
    
    /*
    C_K(48),
    D_K(47),
    T_K(46),
    P_K(45),
    
    C_Q(44),
    D_Q(43),
    T_Q(42),
    P_Q(41),
    
    C_J(40),
    D_J(39),
    T_J(38),
    P_J(37),
    
    C_10(36),
    D_10(35),
    T_10(34),
    P_10(33),

    C_9(32),
    D_9(31),
    T_9(30),
    P_9(29),
    
    C_8(28),
    D_8(27),
    T_8(26),
    P_8(25),

    C_7(24),
    D_7(23),
    T_7(22),
    P_7(21),

    C_6(20),
    D_6(19),
    T_6(18),
    P_6(17),

    C_5(16),
    D_5(15),
    T_5(14),
    P_5(13),

    C_4(12),
    D_4(11),
    T_4(10),
    P_4(9),

    C_3(8),
    D_3(7),
    T_3(6),
    P_3(5),

    C_2(4),
    D_2(3),
    T_2(2),
    P_2(1);
    */

    public  final int val;
    public  final String nom;
    private ValorCarta(int v, String n){
        this.val = v;
        this.nom = n;
    }
    
    @Override 
    public String toString() { 
        return this.nom; 
    }
}
