/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonnaci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonnaci {
    private int start=0;
    private int end=1;
    private int fibonacci;
    private List<Integer> list=new ArrayList<Integer>();
    public Fibonnaci(){
        list.add(0);
        list.add(1);
    }
    
    public List<Integer> getFibonacci(int limit){
        
        for(int i=0;i<limit-2;i++){
            fibonacci=end+start;
            start=end;
            end=fibonacci;
            
            list.add(fibonacci);
        }
        
        return list;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input angka : ");
        int ang1 = input.nextInt();
        Fibonnaci fib = new Fibonnaci();
        List<Integer> list=fib.getFibonacci(ang1);
        
        for(Integer i:list){
            System.out.print(i+" ");
        }
        
    }
    
}
