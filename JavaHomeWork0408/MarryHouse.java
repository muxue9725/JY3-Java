
public class MarryHouse {
			public static  boolean marryrules(people p1, people p2){
				if(p1.sex!=p2.sex){
					if(p1.age>=20&&p1.sex=="Ů"||p2.age>=22){
						if(!p1.ismarry&&!p2.ismarry){
							p1.ismarry=true;
							p2.ismarry=true;
							return true;
						}			
					}				
				}
				return false;	
			}
}
