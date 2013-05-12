package com.jeroensteenbeeke.minecraft.ftbhelper;

import java.util.Map;
import java.util.Map.Entry;

public class App {
	public static void main(String[] args) {
		// Map<String, Integer> rollingMachine = Library.rollingMachine();
		// Map<String, Integer> macerator = Library.macerator();
		Map<String, Integer> compressor = Library.compressor();
		Map<String, Integer> quarry = Library.quarry();
		Map<String, Integer> blastFurnace = Library.industrialBlastFurnace();
		Map<String, Integer> electrolyzer = Library.industrialElectrolyzer();
		Map<String, Integer> landmark = Library.landmarkTimes4();

		printRecipe("All machines combined", Library.join(/*
														 * rollingMachine,
														 * macerator,
														 */compressor, quarry,
				blastFurnace, electrolyzer, landmark));

		printRecipe("Recipes", Library.callCounter);
	}

	private static void printRecipe(String name, Map<String, Integer> recipe) {
		System.out.printf("=== %s ===", name);
		System.out.println();

		for (Entry<String, Integer> e : recipe.entrySet()) {
			System.out.printf("%dx %s", e.getValue(), e.getKey());
			System.out.println();
		}

	}
}
