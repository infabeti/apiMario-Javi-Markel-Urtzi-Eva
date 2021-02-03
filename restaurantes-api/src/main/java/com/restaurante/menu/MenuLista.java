package com.restaurante.menu;

public class MenuLista {
	private Menu[] ListaMenus;
	
	public MenuLista(){
		ListaMenus = new Menu[5];
		
		Plato plato1 = new Plato("Macarrones con chorizo", 7.49);
		Plato plato2 = new Plato("Revuelto de setas", 8.49);
		Plato plato3 = new Plato("Arroz Meloso con Rabo de Ternera al Toque de Curry", 10.49);
		Plato plato4 = new Plato("Romanescu con vinagreta de comino y naranja", 8.99);
		Plato plato5 = new Plato("Crema de calabaza", 6.49);
		Plato plato6 = new Plato("Sopa de pasta con zanahoria y chorizo", 7.99);
		Plato plato7 = new Plato("Champiñones rellenos de tofu", 7.49);
		Plato plato8 = new Plato("Salmon con puerros a la crema", 11.49);
		Plato plato9 = new Plato("Ensalada poke de atun y algas con aguacate", 7.49);
		Plato plato10 = new Plato("Ensalada caprese de pasta", 6.49);

		Plato plato11 = new Plato("Tallarines con pollo al pesto de avellanas y rúcula", 9.49);
		Plato plato12 = new Plato("Arroz con Conejo al Horno", 12.99);
		Plato plato13 = new Plato("Lomos de bacalao confitado con potaje de vigilia", 14.49);
		Plato plato14 = new Plato("Cazuela de pollo con verduras", 10.99);
		Plato plato15 = new Plato("Berenjenas rellenas de pollo", 8.99);
		Plato plato16 = new Plato("Fingers de pollo al crujiente de cacahuete", 9.99);
		Plato plato17 = new Plato("Albondigas de berenjena y parmesano", 11.49);
		Plato plato18 = new Plato("Pollo de Navidad", 13.99);
		Plato plato19 = new Plato("Sardinas asadas en papillote", 9.49);
		Plato plato20 = new Plato("Pollo asado especial celebraciones (pollos Cuk)", 11.49);
		Plato plato21 = new Plato("Quiche de pimientos y sardinillas", 10.99);
		Plato plato22 = new Plato("Huevos en cocotte al gorgonzola con rúcula", 11.49);

		Plato plato23 = new Plato("Mousse de frutas del bosque", 7.49);
		Plato plato24 = new Plato("Soufflé de mango y coco", 4.99);
		Plato plato25 = new Plato("Pastel de zanahoria de la casa", 6.99);
		Plato plato26 = new Plato("Pastel de matcha", 6.49);
		Plato plato27 = new Plato("Pastel vegano de chocolate", 8.99);
		Plato plato28 = new Plato("Pastel de praliné y ganache ", 7.99);
		Plato plato29 = new Plato("Blondie con sorbete de vainilla", 8.49);
		
		Plato primeros1[] = new Plato[5];
		Plato segundos1[] = new Plato[6];
		Plato postres1[] = new Plato[3];
		
		Plato primeros2[] = new Plato[5];
		Plato segundos2[] = new Plato[6];
		Plato postres2[] = new Plato[3];
		
		Plato primeros3[] = new Plato[5];
		Plato segundos3[] = new Plato[6];
		Plato postres3[] = new Plato[3];
		
		Plato primeros4[] = new Plato[5];
		Plato segundos4[] = new Plato[6];
		Plato postres4[] = new Plato[3];
		
		Plato primeros5[] = new Plato[5];
		Plato segundos5[] = new Plato[6];
		Plato postres5[] = new Plato[3];
		//---------------
		primeros1[0] = plato4;
		primeros1[1] = plato2;
		primeros1[2] = plato5;
		primeros1[3] = plato8;
		primeros1[4] =  plato3;
		segundos1[0] = plato11;
		segundos1[1] = plato13;
		segundos1[2] = plato15;
		segundos1[3] = plato17;
		segundos1[4] = plato19;
		segundos1[5] = plato21;
		postres1[0] = plato24;
		postres1[1] = plato25;
		postres1[2] = plato28;
		ListaMenus[0] = new Menu(primeros1, segundos1, postres1);
		//--------------
		primeros2[0] = plato1;
		primeros2[1] = plato2;
		primeros2[2] = plato3;
		primeros2[3] = plato4;
		primeros2[4] =  plato5;
		segundos2[0] = plato11;
		segundos2[1] = plato12;
		segundos2[2] = plato16;
		segundos2[3] = plato18;
		segundos2[4] = plato19;
		segundos2[5] = plato22;
		postres2[0] = plato23;
		postres2[1] = plato24;
		postres2[2] = plato29;
		ListaMenus[1]  = new Menu(primeros2, segundos2, postres2);
		//--------------
		primeros3[0] = plato5;
		primeros3[1] = plato6;
		primeros3[2] = plato7;
		primeros3[3] = plato8;
		primeros3[4] =  plato9;
		segundos3[0] = plato11;
		segundos3[1] = plato15;
		segundos3[2] = plato16;
		segundos3[3] = plato17;
		segundos3[4] = plato18;
		segundos3[5] = plato19;
		postres3[0] = plato23;
		postres3[1] = plato25;
		postres3[2] = plato29;
		ListaMenus[2]  = new Menu(primeros3, segundos3, postres3);
		//--------------
		primeros4[0] = plato4;
		primeros4[1] = plato1;
		primeros4[2] = plato6;
		primeros4[3] = plato2;
		primeros4[4] =  plato8;
		segundos4[0] = plato11;
		segundos4[1] = plato14;
		segundos4[2] = plato16;
		segundos4[3] = plato17;
		segundos4[4] = plato19;
		segundos4[5] = plato22;
		postres4[0] = plato26;
		postres4[1] = plato27;
		postres4[2] = plato29;
		ListaMenus[3]  = new Menu(primeros4, segundos4, postres4);
		//--------------
		primeros5[0] = plato2;
		primeros5[1] = plato4;
		primeros5[2] = plato6;
		primeros5[3] = plato8;
		primeros5[4] =  plato10;
		segundos5[0] = plato11;
		segundos5[1] = plato14;
		segundos5[2] = plato15;
		segundos5[3] = plato18;
		segundos5[4] = plato20;
		segundos5[5] = plato21;
		postres5[0] = plato23;
		postres5[1] = plato24;
		postres5[2] = plato28;
		ListaMenus[4]  = new Menu(primeros5, segundos5, postres5);
		
	}
	
	public Menu GetMenu(int menuid)
	{
		return ListaMenus[menuid];
	}

}
