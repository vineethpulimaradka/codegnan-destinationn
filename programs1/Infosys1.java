package programs1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Infosys1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int exp=sc.nextInt();
		
		int monst[]=new int[n];
		int bonus[]=new int[n];
		
		for(int i=0;i<n;i++) {
			
			monst[i]=sc.nextInt();
			
		}
 		
        for(int i=0;i<n;i++) {
			
			bonus[i]=sc.nextInt();
			
		}
		
        class Monster{
        	private final int power,bonus;
        	public Monster(int power,int bonus) {
        		this.power=power;
        		this.bonus=bonus;
        	}
        }
        
        Monster[] monster=new Monster[n];
        
        for(int i=0;i<n;i++) 
        	monster[i]=new Monster(monst[i],bonus[i]);
        	
        	
        	Arrays.sort(monster,Comparator.comparingInt(m->m.power));
        
        	int count=0;
        	
        	for(Monster m:monster) {
        		if(exp<m.power) break;
        		exp +=m.bonus;
        		++count;
        	}
        	System.out.println(count);
        }

	}

