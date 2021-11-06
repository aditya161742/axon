package com.demoaxon.services.commands;

import java.util.concurrent.CompletableFuture;

import com.demoaxon.dto.AccountCreateDTO;
import com.demoaxon.dto.MoneyCreditDTO;
import com.demoaxon.dto.MoneyDebitDTO;

public interface AccountCommandService {
	
	 	public CompletableFuture<String> createAccount(AccountCreateDTO accountCreateDTO);
	    public CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditDTO moneyCreditDTO);
	    public CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitDTO moneyDebitDTO);
	    
}
