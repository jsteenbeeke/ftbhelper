package com.jeroensteenbeeke.minecraft.ftbhelper;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.Maps;

public final class Library {
	private static final String TREE_TAP = "tree tap";
	private static final String IRON_FENCE = "iron fence";
	private static final String MAGNETIZER = "magnetizer";
	private static final String ELECTROLYZER = "electrolyzer";
	private static final String EXTRACTOR = "extractor";
	private static final String RAW_CARBON_FIBRE = "raw carbon fibre";
	private static final String STONE_GEAR = "stone gear";
	private static final String EMPTY_CELL_X4 = "empty cell (x4)";
	private static final String CRAFTING_BENCH = "crafting bench";
	private static final String PISTON = "piston";
	private static final String BRONZE_X4 = "bronze (x4)";
	private static final String COAL_DUST = "coal dust";
	private static final String RAW_CARBON_MESH = "raw carbon mesh";
	private static final String ADVANCED_ALLOY_2X = "advanced alloy (2x)";
	private static final String CARBON_PLATE = "carbon plate";
	private static final String IRON_FURNACE = "iron furnace";
	private static final String ADVANCED_MACHINE_BLOCK = "Advanced Machine Block";
	private static final String INDUCTION_FURNACE = "induction furnace";
	private static final String CUPRONICKEL_HEATING_COIL_3X = "cupronickel heating coil (3x)";
	private static final String STANDARD_MACHINE_CASING_X4 = "standard machine casing (x4)";
	private static final String STICK = "stick";
	private static final String WOOD_GEAR = "wood gear";
	private static final String RE_BATTERY = "re battery";
	private static final String MINING_DRILL = "mining drill";
	private static final String DIAMOND_DRILL = "diamond drill";
	private static final String ADVANCED_CIRCUIT = "advanced circuit";
	private static final String IRON_GEAR = "iron gear";
	private static final String GOLD_GEAR = "gold gear";
	private static final String DIAMOND_GEAR = "diamond gear";
	private static final String COPPER_CABLE_X6 = "copper cable (x6)";
	private static final String ELECTRONIC_CIRCUIT = "electronic circuit";
	private static final String MACHINE_BLOCK = "machine block";
	private static final String FLINT = "flint";
	private static final String COAL = "coal";
	private static final String WOODEN_PLANK = "wooden plank";
	private static final String NICKEL_INGOT = "nickel ingot";
	private static final String LAVA_BUCKET = "Lava bucket";
	private static final String TIN_INGOT = "tin ingot";
	private static final String STEEL = "steel";
	private static final String TITANIUM_INGOT = "titanium ingot";
	private static final String DIAMOND = "diamond";
	private static final String RUBBER = "rubber";
	private static final String COPPER_INGOT = "copper ingot";
	private static final String REFINED_IRON = "refined iron";
	private static final String LAPIS_LAZULI = "lapis lazuli";
	private static final String GLOWSTONE_DUST = "glowstone dust";
	private static final String REDSTONE_DUST = "redstone dust";
	private static final String GOLD_INGOT = "gold ingot";
	private static final String IRON_INGOT = "iron ingot";
	private static final String COBBLESTONE = "cobblestone";

	static Map<String, Integer> callCounter = Maps.newHashMap();

	private Library() {

	}

	public static Map<String, Integer> quarry() {
		Map<String, Integer> map = Maps.newHashMap();

		add(map, 2, diamondGear(), DIAMOND_GEAR);
		add(map, 2, goldGear(), GOLD_GEAR);
		add(map, 3, ironGear(), IRON_GEAR);
		add(map, 1, advancedCircuit(), ADVANCED_CIRCUIT);
		add(map, 1, diamondDrill(), DIAMOND_DRILL);

		return map;
	}

	private static void registerClall(String method) {
		mapAddition(callCounter, method, 1);
	}

	public static Map<String, Integer> diamondDrill() {
		Map<String, Integer> map = Maps.newHashMap();

		map.put(DIAMOND, (3));
		map.put(TITANIUM_INGOT, 2);
		add(map, 1, advancedCircuit(), ADVANCED_CIRCUIT);
		add(map, 1, miningDrill(), MINING_DRILL);

		return map;

	}

	/*
	 * Map<String, Integer> map = Maps.newHashMap(); return map;
	 */

	public static Map<String, Integer> miningDrill() {
		Map<String, Integer> map = Maps.newHashMap();

		add(map, 1, electronicCircuit(), ELECTRONIC_CIRCUIT);
		add(map, 1, reBattery(), RE_BATTERY);
		map.put(STEEL, 5);

		return map;
	}

	public static Map<String, Integer> reBattery() {
		Map<String, Integer> map = Maps.newHashMap();

		map.put(TIN_INGOT, 4);
		map.put(REDSTONE_DUST, 2);
		add(map, 1, insulatedCopperCableTimes6(), COPPER_CABLE_X6);

		return map;
	}

	public static Map<String, Integer> advancedCircuit() {
		Map<String, Integer> map = Maps.newHashMap();

		add(map, 1, electronicCircuit(), ELECTRONIC_CIRCUIT);
		map.put(REDSTONE_DUST, 4);
		map.put(GLOWSTONE_DUST, 2);
		map.put(LAPIS_LAZULI, 2);

		return map;

	}

	public static Map<String, Integer> electronicCircuit() {
		Map<String, Integer> map = Maps.newHashMap();

		map.put(REFINED_IRON, 1);
		map.put(REDSTONE_DUST, 2);
		add(map, 1, insulatedCopperCableTimes6(), COPPER_CABLE_X6);

		return map;
	}

	private static Map<String, Integer> insulatedCopperCableTimes6() {
		Map<String, Integer> map = Maps.newHashMap();

		map.put(RUBBER, 6);
		map.put(COPPER_INGOT, 3);

		return map;
	}

	public static Map<String, Integer> ironGear() {
		Map<String, Integer> map = Maps.newHashMap();

		add(map, 1, stoneGear(), STONE_GEAR);
		map.put(IRON_INGOT, 4);

		return map;

	}

	public static Map<String, Integer> goldGear() {
		Map<String, Integer> map = Maps.newHashMap();

		add(map, 1, ironGear(), IRON_GEAR);
		map.put(GOLD_INGOT, 4);

		return map;

	}

	public static Map<String, Integer> stoneGear() {
		Map<String, Integer> map = Maps.newHashMap();

		add(map, 1, woodGear(), WOOD_GEAR);
		map.put(COBBLESTONE, 4);

		return map;
	}

	public static Map<String, Integer> woodGear() {
		Map<String, Integer> map = Maps.newHashMap();

		add(map, 1, stickTimes4(), STICK);

		return map;

	}

	public static Map<String, Integer> macerator() {
		Map<String, Integer> map = Maps.newHashMap();

		map.put(DIAMOND, 3);
		map.put(FLINT, 4);
		add(map, 1, machineBlock(), MACHINE_BLOCK);
		add(map, 1, advancedCircuit(), ADVANCED_CIRCUIT);

		return map;
	}

	public static Map<String, Integer> compressor() {
		Map<String, Integer> map = Maps.newHashMap();

		map.put("stone", 6);
		add(map, 1, machineBlock(), MACHINE_BLOCK);
		add(map, 1, electronicCircuit(), ELECTRONIC_CIRCUIT);

		return map;
	}

	private static Map<String, Integer> stickTimes4() {
		Map<String, Integer> map = Maps.newHashMap();

		map.put(WOODEN_PLANK, 2);

		return map;
	}

	public static Map<String, Integer> diamondGear() {
		Map<String, Integer> map = Maps.newHashMap();

		map.put(DIAMOND, 4);
		add(map, 1, goldGear(), GOLD_GEAR);

		return map;
	}

	public static Map<String, Integer> industrialBlastFurnace() {
		Map<String, Integer> map = Maps.newHashMap();

		add(map, 9, standardMachineCasingTimes4(), STANDARD_MACHINE_CASING_X4);
		map.put(LAVA_BUCKET, 2);

		add(map, 2, electronicCircuit(), ELECTRONIC_CIRCUIT);

		add(map, 2, cuproNickelHeatingCoilTimes3(), CUPRONICKEL_HEATING_COIL_3X);
		add(map, 2, inductionFurnace(), INDUCTION_FURNACE);
		add(map, 1, advancedMachineBlock(), ADVANCED_MACHINE_BLOCK);

		return map;
	}

	private static Map<String, Integer> inductionFurnace() {
		Map<String, Integer> map = Maps.newHashMap();

		map.put(COPPER_INGOT, 7);

		add(map, 1, electricFurnace(), ELECTRONIC_CIRCUIT);
		add(map, 1, advancedMachineBlock(), ADVANCED_MACHINE_BLOCK);

		return map;
	}

	private static Map<String, Integer> electricFurnace() {
		Map<String, Integer> map = Maps.newHashMap();

		add(map, 1, ironFurnace(), IRON_FURNACE);
		add(map, 1, electronicCircuit(), ELECTRONIC_CIRCUIT);
		map.put(REDSTONE_DUST, 2);

		return map;
	}

	private static Map<String, Integer> ironFurnace() {
		Map<String, Integer> map = Maps.newHashMap();

		map.put(IRON_INGOT, 8);

		return map;
	}

	private static Map<String, Integer> advancedMachineBlock() {
		Map<String, Integer> map = Maps.newHashMap();

		add(map, 1, machineBlock(), MACHINE_BLOCK);
		add(map, 1, advancedAlloyTimes2(), ADVANCED_ALLOY_2X);
		add(map, 2, carbonPlate(), CARBON_PLATE);

		return map;
	}

	private static Map<String, Integer> carbonPlate() {

		Map<String, Integer> map = Maps.newHashMap();

		add(map, 1, rawCarbonMesh(), RAW_CARBON_MESH);

		return map;
	}

	private static Map<String, Integer> rawCarbonMesh() {

		Map<String, Integer> map = Maps.newHashMap();

		add(map, 2, rawCarbonFibre(), RAW_CARBON_FIBRE);

		return map;
	}

	private static Map<String, Integer> rawCarbonFibre() {
		Map<String, Integer> map = Maps.newHashMap();

		add(map, 4, coalDust(), COAL_DUST);

		return map;
	}

	private static Map<String, Integer> coalDust() {
		Map<String, Integer> map = Maps.newHashMap();

		map.put(COAL, 1);

		return map;
	}

	private static Map<String, Integer> advancedAlloyTimes2() {
		Map<String, Integer> map = Maps.newHashMap();

		map.put(REFINED_IRON, 3);
		map.put(TIN_INGOT, 3);
		add(map, 1, bronzeTimes4(), BRONZE_X4);

		return map;
	}

	private static Map<String, Integer> bronzeTimes4() {
		Map<String, Integer> map = Maps.newHashMap();

		map.put(TIN_INGOT, 1);
		map.put(COPPER_INGOT, 3);

		return map;
	}

	private static Map<String, Integer> cuproNickelHeatingCoilTimes3() {
		Map<String, Integer> map = Maps.newHashMap();

		map.put(COPPER_INGOT, 4);
		map.put(NICKEL_INGOT, 4);

		return map;
	}

	public static Map<String, Integer> rollingMachine() {
		Map<String, Integer> map = Maps.newHashMap();

		map.put(IRON_INGOT, 4);
		add(map, 1, craftingBench(), CRAFTING_BENCH);
		add(map, 4, piston(), PISTON);

		return map;
	}

	private static Map<String, Integer> piston() {
		Map<String, Integer> map = Maps.newHashMap();

		map.put(IRON_INGOT, 1);
		map.put(COBBLESTONE, 4);
		map.put(WOODEN_PLANK, 3);
		map.put(REDSTONE_DUST, 1);

		return map;
	}

	private static Map<String, Integer> craftingBench() {
		Map<String, Integer> map = Maps.newHashMap();

		map.put(WOODEN_PLANK, 4);

		return map;
	}

	public static Map<String, Integer> standardMachineCasingTimes4() {
		Map<String, Integer> map = Maps.newHashMap();

		map.put(REFINED_IRON, 6);
		add(map, 2, electronicCircuit(), ELECTRONIC_CIRCUIT);
		add(map, 1, machineBlock(), MACHINE_BLOCK);

		return map;
	}

	public static Map<String, Integer> landmarkTimes4() {
		Map<String, Integer> map = Maps.newHashMap();

		map.put(LAPIS_LAZULI, 4);
		map.put(REDSTONE_DUST, 4);
		add(map, 1, stickTimes4(), STICK);

		return map;
	}

	public static Map<String, Integer> industrialElectrolyzer() {
		Map<String, Integer> map = Maps.newHashMap();

		map.put(REFINED_IRON, 4);
		add(map, 2, advancedCircuit(), ADVANCED_CIRCUIT);
		add(map, 1, extractor(), EXTRACTOR);
		add(map, 1, electrolyzer(), ELECTROLYZER);
		add(map, 1, magnetizer(), MAGNETIZER);

		return map;
	}

	private static Map<String, Integer> magnetizer() {
		Map<String, Integer> map = Maps.newHashMap();

		add(map, 1, machineBlock(), MACHINE_BLOCK);
		add(map, 1, ironFenceTimes12(), IRON_FENCE);
		map.put(REDSTONE_DUST, 6);

		return map;
	}

	private static Map<String, Integer> ironFenceTimes12() {
		Map<String, Integer> map = Maps.newHashMap();

		map.put(REFINED_IRON, 6);

		return map;
	}

	private static Map<String, Integer> electrolyzer() {
		Map<String, Integer> map = Maps.newHashMap();

		add(map, 1, insulatedCopperCableTimes6(), COPPER_CABLE_X6);
		add(map, 1, emptyCellTimes4(), EMPTY_CELL_X4);
		add(map, 1, machineBlock(), MACHINE_BLOCK);
		add(map, 1, electronicCircuit(), ELECTRONIC_CIRCUIT);

		return map;
	}

	private static Map<String, Integer> emptyCellTimes4() {
		Map<String, Integer> map = Maps.newHashMap();

		map.put(TIN_INGOT, 4);

		return map;
	}

	private static Map<String, Integer> extractor() {
		Map<String, Integer> map = Maps.newHashMap();

		add(map, 4, treeTap(), TREE_TAP);
		add(map, 1, machineBlock(), MACHINE_BLOCK);
		add(map, 1, electronicCircuit(), ELECTRONIC_CIRCUIT);

		return map;
	}

	private static Map<String, Integer> treeTap() {
		Map<String, Integer> map = Maps.newHashMap();

		map.put(WOODEN_PLANK, 5);

		return map;
	}

	private static Map<String, Integer> machineBlock() {
		Map<String, Integer> map = Maps.newHashMap();

		map.put(REFINED_IRON, 8);

		return map;
	}

	private static void add(final Map<String, Integer> workInProgress,
			final int amount, final Map<String, Integer> addition,
			String registerAs) {
		for (int i = 1; i <= amount; i++) {
			for (Entry<String, Integer> e : addition.entrySet()) {
				mapAddition(workInProgress, e.getKey(), e.getValue());
			}

			registerClall(registerAs);
		}
	}

	@SafeVarargs
	public static Map<String, Integer> join(Map<String, Integer>... maps) {
		Map<String, Integer> result = Maps.newHashMap();

		for (Map<String, Integer> map : maps) {
			for (Entry<String, Integer> e : map.entrySet()) {
				mapAddition(result, e.getKey(), e.getValue());
			}
		}

		return result;
	}

	public static void mapAddition(Map<String, Integer> map, String key,
			Integer value) {
		if (map.containsKey(key)) {
			Integer old = map.get(key);
			map.put(key, old + value);
		} else {
			map.put(key, value);
		}

	}

}
