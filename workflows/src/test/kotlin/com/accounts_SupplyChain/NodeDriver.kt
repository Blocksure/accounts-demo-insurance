package com.accounts_SupplyChain

import net.corda.core.identity.CordaX500Name
import net.corda.core.utilities.getOrThrow
import net.corda.testing.driver.DriverParameters
import net.corda.testing.driver.driver
import net.corda.testing.node.User

/**
 * Allows you to run your nodes through an IDE (as opposed to using deployNodes). Do not use in a production
 * environment.
 */
fun main(args: Array<String>) {
    val rpcUsers = listOf(User("user1", "test", permissions = setOf("ALL")))

    driver(DriverParameters(startNodesInProcess = true, waitForAllNodesToFinish = true)) {

        startNode(providedName = CordaX500Name("Blocksure", "London", "GB"), rpcUsers = rpcUsers).getOrThrow()
        startNode(providedName = CordaX500Name("Stakeholders", "London", "GB"), rpcUsers = rpcUsers).getOrThrow()
    }
}
