package VendingMachineDesign.VendingState.Impl;

import java.util.List;

import VendingMachineDesign.Coin;
import VendingMachineDesign.Item;
import VendingMachineDesign.VendingMachine;
import VendingMachineDesign.VendingState.State;

public class SelectionState implements State{
	
	public SelectionState() {
		System.out.println("Currently Vending Machine is in Selection state");
	}

	@Override
	public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
		throw new Exception("You can not click on insert coin button in selection state");
	}

	@Override
	public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
		return ;
	}

	@Override
	public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
		throw new Exception("You can not insert coin in selection state");
	}

	@Override
	public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
		Item item = machine.getInventory().getItem(codeNumber);

		int paidByUser = 0;
		for(Coin coin: machine.getCoinList()) {
			paidByUser += coin.value;
		}
		
		if(paidByUser < item.getPrice()) {
			System.out.println("Insufficient Amount, Product you select is for price: " + item.getPrice() + " and you paid: " + paidByUser);	
			refundFullMoney(machine);
			throw new Exception("Insufficiet amount");
		}
		else {
			if(paidByUser > item.getPrice()) {
				getChange(paidByUser - item.getPrice());
			}
			machine.setVendingMachineState(new DispenseState(machine, codeNumber));
		}
	}

	@Override
	public int getChange(int returnChangeMoney) throws Exception {
		System.out.println("Returned the change in the Coin dispense tray: " + returnChangeMoney);;
		return returnChangeMoney;
	}

	@Override
	public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
		throw new Exception("Product can not be dispense in selection state");
	}

	@Override
	public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
		System.out.println("Return the full amount back in the Coin Dispense Tray");
		machine.setVendingMachineState(new IdleState(machine));
		return machine.getCoinList();
	}

	@Override
	public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
		throw new Exception("You can not update inventory in selection state");
	}

}
