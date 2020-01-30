package com.accounts_SupplyChain.contracts

import net.corda.core.contracts.CommandData
import net.corda.core.contracts.Contract
import net.corda.core.contracts.requireSingleCommand
import net.corda.core.contracts.requireThat
import net.corda.core.transactions.LedgerTransaction

class QuoteContract : Contract {

    companion object{
        const val ID = "com.accounts_SupplyChain.contracts.QuoteContract"
    }


    override fun verify(tx: LedgerTransaction) {
        val command = tx.commands.requireSingleCommand<Commands.Create>()
        requireThat {
            /*
             *
             * For the simplicity of the sample, we unconditionally accept all of the transactions.
             *
             */
        }
    }

    interface Commands : CommandData {
        class Create : Commands
    }
}