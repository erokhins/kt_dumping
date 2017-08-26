'DummyTimeLock' @ [15:52] ==> public constructor DummyTimeLock() defined in net.corda.core.contracts.TransactionEncumbranceTests.DummyTimeLock[ClassConstructorDescriptorImpl]

'MEGA_CORP' @ [18:25] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [18:35] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'Cash' @ [20:17] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [20:22] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[DeserializedClassConstructorDescriptor]

'`issued by`' @ [21:22] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [21:27] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [21:47] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'MEGA_CORP' @ [22:21] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'state' @ [24:29] ==> public final val state: Cash.State defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'copy' @ [24:35] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'MINI_CORP' @ [24:48] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'parse' @ [26:36] ==> public open fun parse(p0: (CharSequence..CharSequence?)): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'FOUR_PM' @ [27:28] ==> public final val FOUR_PM: Instant defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'plus' @ [27:36] ==> public open fun plus(p0: Long, p1: (TemporalUnit..TemporalUnit?)): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'HOURS' @ [27:55] ==> enum entry HOURS defined in java.time.temporal.ChronoUnit[FakeCallableDescriptorForObject]

'State' @ [28:34] ==> public constructor State(validFrom: Instant) defined in net.corda.core.contracts.TransactionEncumbranceTests.DummyTimeLock.State[ClassConstructorDescriptorImpl]

'FIVE_PM' @ [28:40] ==> public final val FIVE_PM: Instant defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'tx' @ [32:33] ==> value-parameter tx: LedgerTransaction defined in net.corda.core.contracts.TransactionEncumbranceTests.DummyTimeLock.verify[ValueParameterDescriptorImpl]

'inputsOfType' @ [32:36] ==> public final inline fun <reified T : ContractState> inputsOfType(): List<TransactionEncumbranceTests.DummyTimeLock.State> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'singleOrNull' @ [32:58] ==> public fun <T> List<TransactionEncumbranceTests.DummyTimeLock.State>.singleOrNull(): TransactionEncumbranceTests.DummyTimeLock.State? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'tx' @ [33:24] ==> value-parameter tx: LedgerTransaction defined in net.corda.core.contracts.TransactionEncumbranceTests.DummyTimeLock.verify[ValueParameterDescriptorImpl]

'timeWindow' @ [33:27] ==> public final val timeWindow: TimeWindow? defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'untilTime' @ [33:39] ==> public abstract val untilTime: Instant? defined in net.corda.core.contracts.TimeWindow[DeserializedPropertyDescriptor]

'IllegalArgumentException' @ [33:58] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'requireThat' @ [34:13] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [35:17] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'time' @ [35:73] ==> val time: Instant defined in net.corda.core.contracts.TransactionEncumbranceTests.DummyTimeLock.verify[LocalVariableDescriptor]

'timeLockInput' @ [35:81] ==> val timeLockInput: TransactionEncumbranceTests.DummyTimeLock.State defined in net.corda.core.contracts.TransactionEncumbranceTests.DummyTimeLock.verify[LocalVariableDescriptor]

'validFrom' @ [35:95] ==> public final val validFrom: Instant defined in net.corda.core.contracts.TransactionEncumbranceTests.DummyTimeLock.State[PropertyDescriptorImpl]

'emptyList' @ [42:62] ==> public fun <T> emptyList(): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'TEST_TIMELOCK_ID' @ [43:47] ==> public val TEST_TIMELOCK_ID: TransactionEncumbranceTests.DummyTimeLock defined in net.corda.core.contracts in file TransactionEncumbranceTests.kt[PropertyDescriptorImpl]

'Test' @ [47:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'ledger' @ [49:9] ==> @JvmOverloads public fun ledger(services: ServiceHub = ..., initialiseSerialization: Boolean = ..., dsl: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>.() -> Unit): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'transaction' @ [50:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [51:17] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'state' @ [51:25] ==> public final val state: Cash.State defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'output' @ [52:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'stateWithNewOwner' @ [52:43] ==> public final val stateWithNewOwner: Cash.State defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'output' @ [53:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'timeLock' @ [53:43] ==> public final val timeLock: TransactionEncumbranceTests.DummyTimeLock.State defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'command' @ [54:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP' @ [54:25] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [54:35] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Cash' @ [54:48] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [54:62] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'verifies' @ [55:17] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'Test' @ [60:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'ledger' @ [62:9] ==> @JvmOverloads public fun ledger(services: ServiceHub = ..., initialiseSerialization: Boolean = ..., dsl: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>.() -> Unit): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'unverifiedTransaction' @ [63:13] ==> @JvmOverloads public final fun unverifiedTransaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> Unit): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [64:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'state' @ [64:63] ==> public final val state: Cash.State defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'output' @ [65:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'timeLock' @ [65:43] ==> public final val timeLock: TransactionEncumbranceTests.DummyTimeLock.State defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'transaction' @ [68:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [69:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [70:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [71:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'stateWithNewOwner' @ [71:26] ==> public final val stateWithNewOwner: Cash.State defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'command' @ [72:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP' @ [72:25] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [72:35] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Cash' @ [72:48] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [72:62] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'timeWindow' @ [73:17] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'FIVE_PM' @ [73:28] ==> public final val FIVE_PM: Instant defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'verifies' @ [74:17] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'Test' @ [79:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'ledger' @ [81:9] ==> @JvmOverloads public fun ledger(services: ServiceHub = ..., initialiseSerialization: Boolean = ..., dsl: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>.() -> Unit): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'unverifiedTransaction' @ [82:13] ==> @JvmOverloads public final fun unverifiedTransaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> Unit): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [83:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'state' @ [83:63] ==> public final val state: Cash.State defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'output' @ [84:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'timeLock' @ [84:43] ==> public final val timeLock: TransactionEncumbranceTests.DummyTimeLock.State defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'transaction' @ [87:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [88:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [89:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [90:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'state' @ [90:26] ==> public final val state: Cash.State defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'command' @ [91:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP' @ [91:25] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [91:35] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Cash' @ [91:48] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [91:62] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'timeWindow' @ [92:17] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'FOUR_PM' @ [92:28] ==> public final val FOUR_PM: Instant defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'this' @ [93:17] ==> <this> defined in net.corda.core.contracts.TransactionEncumbranceTests.`state cannot transition if the encumbrance contract fails to verify`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'Test' @ [98:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'ledger' @ [100:9] ==> @JvmOverloads public fun ledger(services: ServiceHub = ..., initialiseSerialization: Boolean = ..., dsl: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>.() -> Unit): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'unverifiedTransaction' @ [101:13] ==> @JvmOverloads public final fun unverifiedTransaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> Unit): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [102:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'state' @ [102:80] ==> public final val state: Cash.State defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'output' @ [103:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'timeLock' @ [103:43] ==> public final val timeLock: TransactionEncumbranceTests.DummyTimeLock.State defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'transaction' @ [105:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [106:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [107:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'stateWithNewOwner' @ [107:26] ==> public final val stateWithNewOwner: Cash.State defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'command' @ [108:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP' @ [108:25] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [108:35] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Cash' @ [108:48] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [108:62] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'timeWindow' @ [109:17] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'FIVE_PM' @ [109:28] ==> public final val FIVE_PM: Instant defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'this' @ [110:17] ==> <this> defined in net.corda.core.contracts.TransactionEncumbranceTests.`state must be consumed along with its encumbrance`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'Test' @ [115:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'ledger' @ [117:9] ==> @JvmOverloads public fun ledger(services: ServiceHub = ..., initialiseSerialization: Boolean = ..., dsl: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>.() -> Unit): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'transaction' @ [118:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [119:17] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'state' @ [119:25] ==> public final val state: Cash.State defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'output' @ [120:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'stateWithNewOwner' @ [120:43] ==> public final val stateWithNewOwner: Cash.State defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'command' @ [121:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP' @ [121:25] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [121:35] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Cash' @ [121:48] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [121:62] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [122:17] ==> <this> defined in net.corda.core.contracts.TransactionEncumbranceTests.`state cannot be encumbered by itself`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'Test' @ [127:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'ledger' @ [129:9] ==> @JvmOverloads public fun ledger(services: ServiceHub = ..., initialiseSerialization: Boolean = ..., dsl: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>.() -> Unit): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'transaction' @ [130:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [131:17] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'state' @ [131:25] ==> public final val state: Cash.State defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'output' @ [132:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'stateWithNewOwner' @ [132:43] ==> public final val stateWithNewOwner: Cash.State defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'output' @ [133:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'timeLock' @ [133:26] ==> public final val timeLock: TransactionEncumbranceTests.DummyTimeLock.State defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'command' @ [134:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP' @ [134:25] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [134:35] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Cash' @ [134:48] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [134:62] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [135:17] ==> <this> defined in net.corda.core.contracts.TransactionEncumbranceTests.`encumbrance state index must be valid`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'Test' @ [140:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'ledger' @ [142:9] ==> @JvmOverloads public fun ledger(services: ServiceHub = ..., initialiseSerialization: Boolean = ..., dsl: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>.() -> Unit): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'unverifiedTransaction' @ [143:13] ==> @JvmOverloads public final fun unverifiedTransaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> Unit): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [144:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'state' @ [144:83] ==> public final val state: Cash.State defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'output' @ [145:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'state' @ [145:46] ==> public final val state: Cash.State defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'output' @ [146:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'timeLock' @ [146:43] ==> public final val timeLock: TransactionEncumbranceTests.DummyTimeLock.State defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'transaction' @ [148:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [149:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [150:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [151:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'stateWithNewOwner' @ [151:26] ==> public final val stateWithNewOwner: Cash.State defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'command' @ [152:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP' @ [152:25] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [152:35] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Cash' @ [152:48] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [152:62] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'timeWindow' @ [153:17] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'FIVE_PM' @ [153:28] ==> public final val FIVE_PM: Instant defined in net.corda.core.contracts.TransactionEncumbranceTests[PropertyDescriptorImpl]

'this' @ [154:17] ==> <this> defined in net.corda.core.contracts.TransactionEncumbranceTests.`correct encumbrance state must be provided`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

