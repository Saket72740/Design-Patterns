package VendingMachineDesign.VendingState.Impl;

import java.util.List;

import VendingMachineDesign.Coin;
import VendingMachineDesign.Item;
import VendingMachineDesign.VendingMachine;
import VendingMachineDesign.VendingState.State;

public class DispenseState implements State {

	public DispenseState(VendingMachine machine, int codeNumber) throws Exception {
		System.out.println("Currently Vending Machine is in Dispense state");
		dispenseProduct(machine, codeNumber);
	}

	@Override
	public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
		throw new Exception("You can not click on insert coin button in dispense state");
	}

	@Override
	public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
		throw new Exception("You can not click on selection button in dispense state");
	}

	@Override
	public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
		throw new Exception("You can not insert coin in dispense state");
	}

	@Override
	public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
		throw new Exception("You can not choose product in dispense state");
	}

	@Override
	public int getChange(int returnChangeMoney) throws Exception {
		throw new Exception("You can not get change in dispense state");
	}

	@Override
	public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
		System.out.println("Product has been dispensed");
		Item item = machine.getInventory().getItem(codeNumber);
		machine.getInventory().updateSoldOutItem(codeNumber);
		machine.setVendingMachineState(new IdleState(machine));
		return item;
	}

	@Override
	public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
		throw new Exception("You can not get change in dispense state");
	}

	@Override
	public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
		throw new Exception("You can not update inventory in selection state");
	}

}
