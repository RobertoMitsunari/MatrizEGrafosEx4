package controller;


public class GrafoSymmetry {
	public int[][] simetria(int matriz[][]) {
		int linhas = matriz.length;
		int colunas = matriz[0].length;
		int linhaBaixo = linhas - 1;
		int colunaBaixo = linhas - 1;
		for (int l = 0; l < linhas; l++) {
			for (int c = l; c < colunas; c++) {
				matriz[l][c] = matriz[linhaBaixo - l][colunaBaixo - c];
			}
		}
		return matriz;
	}

	public void mostraMatriz(int matriz[][]) {
		for (int[] linha : matriz) {
			for (int coluna : linha) {
				System.out.print(coluna + " ");
			}
			System.out.println("");
		}
	}
}
