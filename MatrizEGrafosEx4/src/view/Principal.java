package view;

import controller.GrafoSymmetry;

public class Principal {

	public static void main(String[] args) {
		int matriz[][] = {{0,0,0,0,0,0},
						  {1,0,0,0,0,0},
						  {0,1,0,0,0,0},
						  {0,1,1,0,0,0},
						  {1,1,0,1,0,0},
						  {0,0,1,1,1,0}};
		GrafoSymmetry g = new GrafoSymmetry();
		matriz = g.simetria(matriz);
		g.mostraMatriz(matriz);
	}

}
