package arreglo_practico2p;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
public class arreglo_practico2p {
	final static int MAX=20;
	final static int MIN=0;
	final static int MAXAUX=3;
	public static void main(String [] args) {
		int arrdatos[]={0,2,3,1,2,3,4,5,1,0,0,0,0,0,0,0,0,0,0,0};
		int arraux[]=new int [MAX];
		imprimir_arreglo(arrdatos);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");

		
		//int numeroingre_enpos(arrdatos,pos);
	//	System.out.println("");
	//	imprimir_arreglo(arrdatos);
	//	burbujeo_crecientemente(arrdatos);
	//	imprimir_arreglo(arrdatos);
	//	burbujeo_decrecientemente(arrdatos);
	//	imprimir_arreglo(arrdatossado=ingresar_entero();
		//cargar_arreglo(arrdatos);
	//	int pos=numeroingresado;
	//	corrimiento_derecha_enpos(arrdatos,pos);
	//	imprimir_arreglo(arrdatos);
	//	corrimiento_izquierda);
	//	insertar_elemento(arrdatos);
	//	imprimir_arreglo(arrdatos);
	//	System.out.println("");

//		burbujeo_decrecientemente(arrdatos);
		System.out.println("");

	//	imprimir_arreglo(arrdatos);
	//	eliminar_elemento(arrdatos); 
		
	//	imprimir_arreglo(arrdatos);
	//	burbujeo_decrecientemente(arrdatos);
		System.out.println("");
	//	invertir_elementos(arrdatos);
	//	devolversecuenciamayor(arrdatos);
	//	devolveranteultimasecuencia(arrdatos);
	//	eliminarsecuenciasdetamañoN(arrdatos);
	//	eliminarsecuenciasordendescendente(arrdatos);
	//	eliminarsecuenciadadaporarreglo(arrdatos);
	//	eliminarsecuenciordendescendente(arrdatos);
	//	invertirultimasecuencia(arrdatos);
		secuenciasparesaotroarreglo(arrdatos,arraux);
	}
	public static void cargar_arreglo(int arrdatos[]) {
		for (int pos=0;pos<MAX;pos++) {
			arrdatos[pos]=(pos+1);
		}
	}	
	
	public static int ingresar_entero() {
		int numero=0;
		boolean validador=false;
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(new Locale("Es","Us"));
		
		while (!validador) {
			try {
				System.out.println("Ingresar entero");
				numero=new Integer(entrada.readLine());
				if ((numero>0)||(numero<=0)) {
					validador=true;
				}
			}
			catch (Exception exc) {
				System.out.println(exc);
				validador=false;
			} 
		}
		return numero;
	}

	public static void imprimir_arreglo(int arrdatos[]) {
		for (int i=0;i<MAX;i++) {
			System.out.print(arrdatos[i]);
		}
	}
	public static void corrimiento_derecha_enpos(int arrdatos[],int pos) {
		int aux=0;
		int i=0;
		for (i=MAX-1;i>pos;i--) {
			aux=arrdatos[i];
			arrdatos[i]=arrdatos[i-1];			
			}
		}
	public static void corrimiento_izquierda_enpos(int arrdatos[],int pos) {
		int aux=0;
		int i=0;
		for (i=MIN;i<pos;i++) {
			aux=arrdatos[i];
			arrdatos[i]=arrdatos[i+1];		
			}
		}
	public static void burbujeo_crecientemente(int arrdatos[]) {
		int aux=0;
		for (int i=1;i<MAX;i++) {
			for(int j=0;j<MAX-1;j++) {
				if(arrdatos[j]>arrdatos[j+1]) {
					aux=arrdatos[j];
					arrdatos[j]=arrdatos[j+1];
					arrdatos[j+1]=aux;
				}
			}
		}
	}
	public static void burbujeo_decrecientemente(int arrdatos[]) {
		int aux=0;
		for (int i=1;i<MAX;i++) {
			for(int j=MAX-1;j>0;j--) {
				if(arrdatos[j]>arrdatos[j-1]) {
					aux=arrdatos[j];
					arrdatos[j]=arrdatos[j-1];
					arrdatos[j-1]=aux;
				}
			}
		}
	}
	public static void insertar_elemento(int arrdatos[]) {
		System.out.println("ingresar numero para insertar en el arreglo");
		int numero=ingresar_entero();
		System.out.println("ingresar posicion en el arreglo");
		int posicion_arreglo=ingresar_entero();
		arrdatos[posicion_arreglo]=numero;
	}
	public static void eliminar_elemento(int arrdatos[]) {
	//	System.out.println("ingresar posicion para eliminar en el arreglo");
	//	int numero=ingresar_entero();
	//	arrdatos[numero]=0;
		for(int i=0;i<MAX;i++) {
			if(arrdatos[i]%2 ==0) {
				arrdatos[i]=0;
			}
		}
	}
	public static void invertir_elementos(int arrdatos[]) {
		int aux=0;
		int terminodelarreglo=9;
		for (int i=0;i<(MAX/2);i++) {
			aux=arrdatos[i];
			arrdatos[i]=arrdatos[MAX-1-i];
			arrdatos[MAX-1-i]=aux;
			System.out.println(arrdatos[i]);
		}
	}
	public static void principioyfin_primersecuencia(int arrdatos[]) {
		int inicio=0;
		int fin=0;
		int contador=0;
		boolean inicioval=true;
		boolean finval=false;
		for(int i=0;i<MAX;i++) {
			if(arrdatos[i] != 0) {
				if(inicioval) {
					inicio=arrdatos[i];
					System.out.println(inicio);
					inicioval=false;
					finval=true;
				}
				if (finval==true) {
					if(arrdatos[i+1] == 0) {
						fin=arrdatos[i];
						System.out.println(fin);
						finval=false;
					}
				}
			}
		}
	}
	public static void devolversecuenciamayor(int arrdatos[]) {
		int inicio=0;
		int fin=0;
		int contador=0;
		int valorsecuencia=0;
		int valorsecuenciamayor=0;
		boolean inicioval=true;
		boolean finval=false;
		for(int i=0;i<MAX;i++) {
			if(arrdatos[i] != 0) {
				if(inicioval) {
					inicio=arrdatos[i];
					System.out.println(inicio);
					inicioval=false;
					finval=true;
				}
				valorsecuencia+= arrdatos[i];
				if (finval==true) {
					if(arrdatos[i+1] == 0) {
						fin=arrdatos[i];
						System.out.println(fin);
						finval=false;
						if(valorsecuencia>valorsecuenciamayor) {
							valorsecuenciamayor=valorsecuencia;
						}
						valorsecuencia=0;
						System.out.println("");
						System.out.println(valorsecuenciamayor);
						System.out.println("");

						inicioval=true;
					}
				}
			}
		}
		System.out.println("valor mas alto de secuencias: "+valorsecuenciamayor);

	}
	public static void devolveranteultimasecuencia(int arrdatos[]) {
		int inicio=0;
		int fin=0;
		int contador=0;
		int anteultimofin=0;
		int anteultimoinicio=0;
		boolean validador=true;
		boolean validadorfin=true;
		for(int i=MAX-1;i>0;i--) {
			if(arrdatos[i] !=0) {
				if((arrdatos[i] !=0)&&(arrdatos[i-1] !=0)) {
				fin=arrdatos[i];
				if(contador==1){
					anteultimofin=arrdatos[i];}
				}
				}
			if(arrdatos[i-1]==0) {
				inicio=arrdatos[i];
				if(contador==1) {
					anteultimoinicio=arrdatos[i];
				}
				contador++;
			}
			}
		
	System.out.println("anteultimoinicio: "+anteultimoinicio);
	System.out.println("anteultimofin: "+anteultimofin);
	}
	public static void eliminarsecuenciasdetamañoN(int arrdatos[]) {
		int numeroingresado=obtenerenteroporteclado();
		boolean validadorinicio=true;
		boolean validadorfin=false;
		int contador=0;
		int inicio=0;
		int medio=0;
		int fin=0;
		boolean validadorfinsecuencia=false;
		int x=0;
		for (int i=0;i<MAX;i++) {
			if (arrdatos[i] != 0) {
				 x=i;
				if(validadorinicio==true) {
					if((arrdatos[i]!=0)&&(arrdatos[i+1] !=0)&&(arrdatos[i-1] ==0 )) {
						inicio=arrdatos[i];	
					}
					if ((arrdatos[i]!=0)&&(arrdatos[i-1] != 0)&&(arrdatos[i+1] != 0)) {
						medio=arrdatos[i];
					}
					validadorfin=true;
					validadorinicio=false;
				}
				if(validadorfin==true) {
					if((arrdatos[i] != 0)&&(arrdatos[i+1] == 0)) {
						fin=arrdatos[i];
						System.out.println("fin de secuencia");
					}
					validadorfin=false;
					validadorinicio=true;
					validadorfinsecuencia=true;
					if((contador==numeroingresado)&&(validadorfinsecuencia==true)) {
						
						for(int j=0;j<numeroingresado;j++) {
							arrdatos[(i)-j]=0;
						}
						validadorfinsecuencia=false;
						System.out.println("borrando"+arrdatos[i]);
						contador=0;
						}
					
				}
				contador++;
				System.out.println(contador);

				}
		
				System.out.println("fin iteracion");
				System.out.println("");
			}
			}
	public static int obtenerenteroporteclado() {
			int numero=0;
			boolean validador=false;
			
			BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
			Locale.setDefault(new Locale("Es","Us"));
			
			while (!(validador)) {
				try {
					System.out.println("Ingresar entero");
					numero=new Integer(entrada.readLine());
					if((numero>0)||(numero<=0)) {
						validador=true;
					}
				}
				catch (Exception exc){
					System.out.println(exc);
					validador=false;
				}
			}
			return numero;
		}
	public static void eliminarsecuenciasordendescendente(int arrdatos[]) {
			int numeroingresado=obtenerenteroporteclado();
			boolean validadorinicio=true;
			boolean validadorfin=false;
			int contador=0;
			int inicio=0;
			int medio=0;
			int fin=0;
			int contadordecreciente=0;
			int contadorfinal=0;
			boolean validadorfinsecuencia=false;
			int valoranterior=0;
			for (int i=0;i<MAX;i++) {
						if((arrdatos[i]!=0)&&(arrdatos[i+1] !=0)&&(arrdatos[i-1] ==0 )) {
							inicio=arrdatos[i];	
							contador++;
						}
						if ((arrdatos[i]!=0)&&(arrdatos[i-1] != 0)&&(arrdatos[i+1] != 0)) {
							medio=arrdatos[i];
							contador++;
						}
						if((arrdatos[i] != 0)&&(arrdatos[i+1] == 0)) {
							fin=arrdatos[i];
							validadorfinsecuencia=true;
							contador++;
							contadorfinal=contador;
							contador=0;
							System.out.println("longitud de secuencia");
						}
						if(i==0) {
							valoranterior=arrdatos[i];
	
						}
						if (i>0) {
						if (arrdatos[i]>arrdatos[i-1]) {
							contadordecreciente++;
						
							if((validadorfinsecuencia==true)&&(contador>=2)) {
								validadorfinsecuencia=false;
								for(int j=0;j<contadordecreciente;j++) {
									arrdatos[(i)-j]=0;
									}
									System.out.println("borrando"+arrdatos[i]);
									contadordecreciente=0;
							}
						}
						}
									
			}
			imprimir_arreglo(arrdatos);
			}
	public static void eliminarsecuenciadadaporarreglo(int arrdatos[]) {
			int arrdatosaux[]={9,8,7};
			boolean validadorinicio=true;
			boolean validadorfin=false;
			int contador=0;
			int inicio=0;
			int medio=0;
			int fin=0;
			int contadordecreciente=0;
			int contadorfinal=0;
			int contadorarreglo=0;
			boolean validadorfinsecuencia=false;
			int contadore=0;
			for (int i=0;i<MAX;i++) {
						if((arrdatos[i]!=0)&&(arrdatos[i+1] !=0)&&(arrdatos[i-1] ==0 )) {
							inicio=arrdatos[i];	
							contador++;
							System.out.println("contador de inicio:"+contador+" posicion del arreglo: "+arrdatos[i]);
							}	
						if ((arrdatos[i]!=0)&&(arrdatos[i-1] != 0)&&(arrdatos[i+1] != 0)) {
							medio=arrdatos[i];
							contador++;
							System.out.println("contador de medio:"+contador+" posicion del arreglo: "+arrdatos[i]);
						}
						if((arrdatos[i] != 0)&&(arrdatos[i+1] == 0)) {
							fin=arrdatos[i];
							validadorfinsecuencia=true;
							contador++;
							contadorfinal=contador;
							contador=0;
							System.out.println("contador de fin:"+contador+" posicion del arreglo: "+arrdatos[i]);
							if(validadorfinsecuencia==true) {
									if(contadorfinal==MAXAUX) {
										System.out.println("es igual: contador"+contadorfinal+ " MAXAUX:"+MAXAUX);
										System.out.println(arrdatos[i]);
										for(int j=0;j<MAXAUX;j++) {
										System.out.println("datosarreglos:"+arrdatos[i-j]);	
										System.out.println("datosarreglosaux:"+arrdatosaux[MAXAUX-1-j]);
											if(arrdatos[i-j]==arrdatosaux[MAXAUX-1-j]) {
												contadore++;
												if(contadore==MAXAUX) {
													for(int k=0;k<MAXAUX;k++) {
														arrdatos[i-k]=0;
														contadore=0;
													}
												}
											}
										}
										contadorfinal=0;
									}	
								}
								validadorfinsecuencia=false;
							}
						}
				imprimir_arreglo(arrdatos);
				}
	public static void eliminarsecuenciordendescendente(int arrdatos[]) {
		boolean validadorinicio=true;
		boolean validadorfin=false;
		int contador=0;
		int inicio=0;
		int medio=0;
		int fin=0;
		int contadordecreciente=0;
		int contadorfinal=0;
		int contadorarreglo=0;
		boolean validadorfinsecuencia=false;
		int contadore=0;
		for (int i=0;i<MAX;i++) {
					if((arrdatos[i]!=0)&&(arrdatos[i+1] !=0)&&(arrdatos[i-1] ==0 )) {
						inicio=arrdatos[i];	
						contador++;
						System.out.println("contador de inicio:"+contador+" posicion del arreglo: "+arrdatos[i]);
						}	
					if ((arrdatos[i]!=0)&&(arrdatos[i-1] != 0)&&(arrdatos[i+1] != 0)) {
						medio=arrdatos[i];
						contador++;
						System.out.println("contador de medio:"+contador+" posicion del arreglo: "+arrdatos[i]);
					}
					if((arrdatos[i] != 0)&&(arrdatos[i+1] == 0)) {
						fin=arrdatos[i];
						validadorfinsecuencia=true;
						contador++;
						contadorfinal=contador;
						contador=0;
						System.out.println("contador de fin:"+contadorfinal+" posicion del arreglo: "+arrdatos[i]);
						if(validadorfinsecuencia==true) {
							for(int k=0;k<contadorfinal;k++) {
								if(arrdatos[i]<arrdatos[i-1]) {
									contadore++;
									if(contadore==contadorfinal) {
										for(int l=0;l<contadorfinal;l++) {
											arrdatos[i-l]=0;
										}
										contadore=0;
									}
							}
							}
							contadorfinal=0;
							}
							validadorfinsecuencia=false;
						}
					}
			imprimir_arreglo(arrdatos);
	}
	public static void invertirultimasecuencia(int arrdatos[]) {
		boolean validadorinicio=true;
		boolean validadorfin=false;
		int contador=0;
		int inicio=0;
		int medio=0;
		int fin=0;
		int contadordecreciente=0;
		int contadorfinal=0;
		int contadorarreglo=0;
		boolean validadorfinsecuencia=false;
		int contadore=0;
		int aux=0;
		int contadorsape=0;
		for (int i=0;i<MAX;i++) {
					if((arrdatos[i]!=0)&&(arrdatos[i+1] !=0)&&(arrdatos[i-1] ==0 )) {
						inicio=arrdatos[i];	
						contador++;
						System.out.println("contador de inicio:"+contador+" posicion del arreglo: "+arrdatos[i]);
						}	
					if ((arrdatos[i]!=0)&&(arrdatos[i-1] != 0)&&(arrdatos[i+1] != 0)) {
						medio=arrdatos[i];
						contador++;
						System.out.println("contador de medio:"+contador+" posicion del arreglo: "+arrdatos[i]);
					}
					if((arrdatos[i] != 0)&&(arrdatos[i+1] == 0)) {
						fin=arrdatos[i];
						validadorfinsecuencia=true;
						contador++;
						contadorfinal=contador;
						contador=0;
						System.out.println("contador de fin:"+contadorfinal+" posicion del arreglo: "+arrdatos[i]);
						}
				
					}
		for(int i=MAX-1;i>0;i--) {	
			if(arrdatos[i]==fin) {
				System.out.println("arrdatossenI:"+arrdatos[i]);
				System.out.println("contadorfinal:"+contadorfinal);
				
				if(arrdatos[i-(contadorfinal/2)] == inicio) {
					if(contadorsape==0) {
					for(int j=(contadorfinal/2);j>0;j--) {
						aux=arrdatos[i-j];
						arrdatos[i-j]=arrdatos[i-(contadorfinal/2)+j];
						arrdatos[i-(contadorfinal/2)+j]=aux;
						System.out.println("asd");
						contadorsape++;
					}
					}
				}
			}
		}
			imprimir_arreglo(arrdatos);
	}
	public static void secuenciasparesaotroarreglo(int arrdatos[],int arraux[]) {
		
		boolean validadorinicio=true;
		boolean validadorfin=false;
		int contador=0;
		int inicio=0;
		int medio=0;
		int fin=0;
		int contadordecreciente=0;
		int contadorfinal=0;
		int contadorarreglo=0;
		boolean validadorfinsecuencia=false;
		int contadore=0;
		int aux=0;
		int contadorsape=0;
		int variable=0;
		int k=0;
		for (int i=0;i<MAX;i++) {
					if((arrdatos[i]!=0)&&(arrdatos[i+1] !=0)&&(arrdatos[i-1] ==0 )) {
						inicio=arrdatos[i];	
						contador++;
						System.out.println("contador de inicio:"+contador+" posicion del arreglo: "+arrdatos[i]);
						}	
					if ((arrdatos[i]!=0)&&(arrdatos[i-1] != 0)&&(arrdatos[i+1] != 0)) {
						medio=arrdatos[i];
						contador++;
						System.out.println("contador de medio:"+contador+" posicion del arreglo: "+arrdatos[i]);
					}
					if((arrdatos[i] != 0)&&(arrdatos[i+1] == 0)) {
						fin=arrdatos[i];
						validadorfinsecuencia=true;
						contador++;
						contadorfinal=contador;
						contador=0;
						System.out.println("contador de fin:"+contadorfinal+" posicion del arreglo: "+arrdatos[i]);
						}
					
					if(validadorfinsecuencia) {
						if(contadorfinal%2 == 0) {
							for(int j=0;j<contadorfinal;j++) {
								if(contadore==0) {
								k=i-contadorfinal;
								System.out.println(k);
								arraux[j]=arrdatos[i-j];
								arraux[contadorfinal+1]=0;
								variable=arraux[MAX-1-contadorfinal-1];
								}	
							}
							contadore++;
						}
						validadorfinsecuencia=false;
						contadorfinal=0;
					}
				//	if(validadorfinsecuencia) {
					//	if(contadorfinal%2 == 0) {
						//	for(int j=0;j<contadorfinal;j++) {
							//	if(contadore==0) {
								//arraux[MAX-1-j]=arrdatos[i-j];
//
	//							arraux[MAX-1-contadorfinal]=0;
		//						variable=arraux[MAX-1-contadorfinal-1];
			//					}
				//				
					//		}
						//	contadore++;
						//}
						//validadorfinsecuencia=false;
						//contadorfinal=0;
					//}
		}
		imprimir_arreglo(arrdatos);
		System.out.println("");
		imprimir_arreglo(arraux);
	}
}