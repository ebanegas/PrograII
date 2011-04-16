/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prograii;

/**
 *
 * @author Edwin Banegas
 */
public class Recursiones {

    public boolean primo(int num){
       return primo(num,2);

    }
    public boolean primo(int num, int c){
        if(num==c)
            return true;
        else if (num%c==0)
            return false;
        else
            return primo(num,c+1);
    }
    }


