package com.saraya;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BagService {
	
	private static ArrayList<Bag> bags = new ArrayList<Bag>();
	private static int count = 10;
	
	static {
				bags.add(new Bag(1,2020,"Ferragamo","Boxyz bag","https://images.unsplash.com/photo-1584917865442-de89df76afd3?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=375&q=80"));
				bags.add(new Bag(2, 2018,"Editorial","Fashion","https://images.unsplash.com/photo-1559563458-527698bf5295?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80"));				
				bags.add(new Bag(3, 2022,"Michael Kors","tote bag","https://images.unsplash.com/photo-1614179689702-355944cd0918?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1275&q=80"));
				bags.add(new Bag(4, 2019,"Blue leather","Lancel","https://images.unsplash.com/photo-1594223274512-ad4803739b7c?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1294&q=80"));
				bags.add(new Bag(5, 2020,"Brown leather","handbag","https://images.unsplash.com/photo-1598532163257-ae3c6b2524b6?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1300&q=80" ));
				bags.add(new Bag(6, 2018,"Zahra","hanbag","https://images.unsplash.com/photo-1606522754091-a3bbf9ad4cb3?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1067&q=80"));
				bags.add(new Bag(7, 2016,"Gucci","black leather","https://images.unsplash.com/photo-1548036328-c9fa89d128fa?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1049&q=80"));
				bags.add(new Bag(8, 2021,"Carrier","black and pink","https://images.unsplash.com/photo-1608060434411-0c3fa9049e7b?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=334&q=80"));
				bags.add(new Bag(5,2015,"Wrislet","brown leather","https://images.unsplash.com/photo-1575890318083-4d7c6ebcd60a?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1301&q=80")); 
				bags.add(new Bag(10,2019,"Ferragam","Gancini","https://images.unsplash.com/photo-1591561954555-607968c989ab?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1028&q=80"));
				
			}
			
			public List<Bag> getAllBags(){
				return bags;
			}  
			
			public void addBag(int year, String make, String model, String image) {
				bags.add(new Bag(++count, year, make, model, image));
			}
			public void deleteById(int id) {
				 Iterator<Bag> iterator =bags.iterator();
				 while(iterator.hasNext()) {
					 Bag bag = iterator.next();
					 if(bag.getId()==id) {
						 iterator.remove();
					 }
				 }
			}



		}

