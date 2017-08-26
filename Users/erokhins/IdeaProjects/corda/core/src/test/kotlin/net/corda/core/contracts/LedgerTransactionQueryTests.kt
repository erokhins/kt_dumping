'TestDependencyInjectionBase' @ [19:37] ==> public constructor TestDependencyInjectionBase() defined in net.corda.testing.TestDependencyInjectionBase[DeserializedClassConstructorDescriptor]

'Before' @ [23:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'services' @ [25:9] ==> private final lateinit var services: ServiceHub defined in net.corda.core.contracts.LedgerTransactionQueryTests[PropertyDescriptorImpl]

'MockServices' @ [25:20] ==> public constructor MockServices() defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'DummyContract' @ [36:43] ==> public constructor DummyContract(blank: Any? = ...) defined in net.corda.testing.contracts.DummyContract[DeserializedClassConstructorDescriptor]

'emptyList' @ [37:58] ==> public fun <T> emptyList(): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'DummyContract' @ [41:43] ==> public constructor DummyContract(blank: Any? = ...) defined in net.corda.testing.contracts.DummyContract[DeserializedClassConstructorDescriptor]

'emptyList' @ [42:58] ==> public fun <T> emptyList(): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'when (data) {
            is String -> StringTypeDummyState(data)
            is Int -> IntTypeDummyState(data)
            else -> throw IllegalArgumentException()
        }' @ [46:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ContractState, entry1: ContractState, entry2: ContractState): ContractState[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ContractState

'data' @ [46:22] ==> value-parameter data: Any defined in net.corda.core.contracts.LedgerTransactionQueryTests.makeDummyState[ValueParameterDescriptorImpl]

'StringTypeDummyState' @ [47:26] ==> public constructor StringTypeDummyState(data: String) defined in net.corda.core.contracts.LedgerTransactionQueryTests.StringTypeDummyState[ClassConstructorDescriptorImpl]

'data' @ [47:47] ==> value-parameter data: Any defined in net.corda.core.contracts.LedgerTransactionQueryTests.makeDummyState[ValueParameterDescriptorImpl]

'IntTypeDummyState' @ [48:23] ==> public constructor IntTypeDummyState(data: Int) defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[ClassConstructorDescriptorImpl]

'data' @ [48:41] ==> value-parameter data: Any defined in net.corda.core.contracts.LedgerTransactionQueryTests.makeDummyState[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [49:27] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'makeDummyState' @ [54:26] ==> private final fun makeDummyState(data: Any): ContractState defined in net.corda.core.contracts.LedgerTransactionQueryTests[SimpleFunctionDescriptorImpl]

'data' @ [54:41] ==> value-parameter data: Any defined in net.corda.core.contracts.LedgerTransactionQueryTests.makeDummyStateAndRef[ValueParameterDescriptorImpl]

'services' @ [55:27] ==> private final lateinit var services: ServiceHub defined in net.corda.core.contracts.LedgerTransactionQueryTests[PropertyDescriptorImpl]

'signInitialTransaction' @ [55:36] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'TransactionBuilder' @ [56:17] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [56:45] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'addOutputState' @ [57:26] ==> public final fun addOutputState(state: ContractState): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'dummyState' @ [57:41] ==> val dummyState: ContractState defined in net.corda.core.contracts.LedgerTransactionQueryTests.makeDummyStateAndRef[LocalVariableDescriptor]

'addCommand' @ [58:26] ==> public final fun addCommand(arg: Command<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'dummyCommand' @ [58:37] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'services' @ [60:9] ==> private final lateinit var services: ServiceHub defined in net.corda.core.contracts.LedgerTransactionQueryTests[PropertyDescriptorImpl]

'recordTransactions' @ [60:18] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'fakeIssueTx' @ [60:37] ==> val fakeIssueTx: SignedTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.makeDummyStateAndRef[LocalVariableDescriptor]

'StateRef' @ [61:29] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[DeserializedClassConstructorDescriptor]

'fakeIssueTx' @ [61:38] ==> val fakeIssueTx: SignedTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.makeDummyStateAndRef[LocalVariableDescriptor]

'id' @ [61:50] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'StateAndRef' @ [62:16] ==> public constructor StateAndRef<out T : ContractState>(state: TransactionState<ContractState>, ref: StateRef) defined in net.corda.core.contracts.StateAndRef[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> ContractState

'TransactionState' @ [62:28] ==> @JvmOverloads public constructor TransactionState<out T : ContractState>(data: ContractState, notary: Party, encumbrance: Int? = ...) defined in net.corda.core.contracts.TransactionState[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> ContractState

'dummyState' @ [62:45] ==> val dummyState: ContractState defined in net.corda.core.contracts.LedgerTransactionQueryTests.makeDummyStateAndRef[LocalVariableDescriptor]

'DUMMY_NOTARY' @ [62:57] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'dummyStateRef' @ [62:78] ==> val dummyStateRef: StateRef defined in net.corda.core.contracts.LedgerTransactionQueryTests.makeDummyStateAndRef[LocalVariableDescriptor]

'TransactionBuilder' @ [66:18] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [66:46] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'..' @ [67:19] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'tx' @ [68:13] ==> val tx: TransactionBuilder defined in net.corda.core.contracts.LedgerTransactionQueryTests.makeDummyTransaction[LocalVariableDescriptor]

'addInputState' @ [68:16] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'makeDummyStateAndRef' @ [68:30] ==> private final fun makeDummyStateAndRef(data: Any): StateAndRef<*> defined in net.corda.core.contracts.LedgerTransactionQueryTests[SimpleFunctionDescriptorImpl]

'i' @ [68:51] ==> val i: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.makeDummyTransaction[LocalVariableDescriptor]

'tx' @ [69:13] ==> val tx: TransactionBuilder defined in net.corda.core.contracts.LedgerTransactionQueryTests.makeDummyTransaction[LocalVariableDescriptor]

'addInputState' @ [69:16] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'makeDummyStateAndRef' @ [69:30] ==> private final fun makeDummyStateAndRef(data: Any): StateAndRef<*> defined in net.corda.core.contracts.LedgerTransactionQueryTests[SimpleFunctionDescriptorImpl]

'i' @ [69:51] ==> val i: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.makeDummyTransaction[LocalVariableDescriptor]

'toString' @ [69:53] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'tx' @ [70:13] ==> val tx: TransactionBuilder defined in net.corda.core.contracts.LedgerTransactionQueryTests.makeDummyTransaction[LocalVariableDescriptor]

'addOutputState' @ [70:16] ==> public final fun addOutputState(state: ContractState): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'makeDummyState' @ [70:31] ==> private final fun makeDummyState(data: Any): ContractState defined in net.corda.core.contracts.LedgerTransactionQueryTests[SimpleFunctionDescriptorImpl]

'i' @ [70:46] ==> val i: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.makeDummyTransaction[LocalVariableDescriptor]

'tx' @ [71:13] ==> val tx: TransactionBuilder defined in net.corda.core.contracts.LedgerTransactionQueryTests.makeDummyTransaction[LocalVariableDescriptor]

'addOutputState' @ [71:16] ==> public final fun addOutputState(state: ContractState): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'makeDummyState' @ [71:31] ==> private final fun makeDummyState(data: Any): ContractState defined in net.corda.core.contracts.LedgerTransactionQueryTests[SimpleFunctionDescriptorImpl]

'i' @ [71:46] ==> val i: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.makeDummyTransaction[LocalVariableDescriptor]

'toString' @ [71:48] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'tx' @ [72:13] ==> val tx: TransactionBuilder defined in net.corda.core.contracts.LedgerTransactionQueryTests.makeDummyTransaction[LocalVariableDescriptor]

'addCommand' @ [72:16] ==> public final fun addCommand(data: CommandData, keys: List<PublicKey>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'Cmd1' @ [72:36] ==> public constructor Cmd1(id: Int) defined in net.corda.core.contracts.LedgerTransactionQueryTests.Commands.Cmd1[ClassConstructorDescriptorImpl]

'i' @ [72:41] ==> val i: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.makeDummyTransaction[LocalVariableDescriptor]

'listOf' @ [72:45] ==> public fun <T> listOf(element: PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'services' @ [72:52] ==> private final lateinit var services: ServiceHub defined in net.corda.core.contracts.LedgerTransactionQueryTests[PropertyDescriptorImpl]

'myInfo' @ [72:61] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [72:68] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [72:82] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'tx' @ [73:13] ==> val tx: TransactionBuilder defined in net.corda.core.contracts.LedgerTransactionQueryTests.makeDummyTransaction[LocalVariableDescriptor]

'addCommand' @ [73:16] ==> public final fun addCommand(data: CommandData, keys: List<PublicKey>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'Cmd2' @ [73:36] ==> public constructor Cmd2(id: Int) defined in net.corda.core.contracts.LedgerTransactionQueryTests.Commands.Cmd2[ClassConstructorDescriptorImpl]

'i' @ [73:41] ==> val i: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.makeDummyTransaction[LocalVariableDescriptor]

'listOf' @ [73:45] ==> public fun <T> listOf(element: PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'services' @ [73:52] ==> private final lateinit var services: ServiceHub defined in net.corda.core.contracts.LedgerTransactionQueryTests[PropertyDescriptorImpl]

'myInfo' @ [73:61] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [73:68] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [73:82] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'tx' @ [75:16] ==> val tx: TransactionBuilder defined in net.corda.core.contracts.LedgerTransactionQueryTests.makeDummyTransaction[LocalVariableDescriptor]

'toLedgerTransaction' @ [75:19] ==> public final fun toLedgerTransaction(services: ServiceHub): LedgerTransaction defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'services' @ [75:39] ==> private final lateinit var services: ServiceHub defined in net.corda.core.contracts.LedgerTransactionQueryTests[PropertyDescriptorImpl]

'Test' @ [78:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeDummyTransaction' @ [80:19] ==> private final fun makeDummyTransaction(): LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests[SimpleFunctionDescriptorImpl]

'assertEquals' @ [81:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'ltx' @ [81:25] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple InRef Indexer tests`[LocalVariableDescriptor]

'inRef' @ [81:29] ==> public final fun <T : ContractState> inRef(index: Int): StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> IntTypeDummyState

'state' @ [81:57] ==> public final val state: TransactionState<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [81:63] ==> public final val data: LedgerTransactionQueryTests.IntTypeDummyState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'data' @ [81:68] ==> public final val data: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [82:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'ltx' @ [82:27] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple InRef Indexer tests`[LocalVariableDescriptor]

'inRef' @ [82:31] ==> public final fun <T : ContractState> inRef(index: Int): StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> StringTypeDummyState

'state' @ [82:62] ==> public final val state: TransactionState<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [82:68] ==> public final val data: LedgerTransactionQueryTests.StringTypeDummyState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'data' @ [82:73] ==> public final val data: String defined in net.corda.core.contracts.LedgerTransactionQueryTests.StringTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [83:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'ltx' @ [83:25] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple InRef Indexer tests`[LocalVariableDescriptor]

'inRef' @ [83:29] ==> public final fun <T : ContractState> inRef(index: Int): StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> IntTypeDummyState

'state' @ [83:57] ==> public final val state: TransactionState<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [83:63] ==> public final val data: LedgerTransactionQueryTests.IntTypeDummyState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'data' @ [83:68] ==> public final val data: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [84:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'ltx' @ [84:27] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple InRef Indexer tests`[LocalVariableDescriptor]

'inRef' @ [84:31] ==> public final fun <T : ContractState> inRef(index: Int): StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> StringTypeDummyState

'state' @ [84:62] ==> public final val state: TransactionState<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [84:68] ==> public final val data: LedgerTransactionQueryTests.StringTypeDummyState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'data' @ [84:73] ==> public final val data: String defined in net.corda.core.contracts.LedgerTransactionQueryTests.StringTypeDummyState[PropertyDescriptorImpl]

'assertFailsWith' @ [85:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IndexOutOfBoundsException /* = IndexOutOfBoundsException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IndexOutOfBoundsException

'ltx' @ [85:54] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple InRef Indexer tests`[LocalVariableDescriptor]

'inRef' @ [85:58] ==> public final fun <T : ContractState> inRef(index: Int): StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> IntTypeDummyState

'Test' @ [88:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeDummyTransaction' @ [90:19] ==> private final fun makeDummyTransaction(): LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests[SimpleFunctionDescriptorImpl]

'assertEquals' @ [91:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'ltx' @ [91:25] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple OutRef Indexer tests`[LocalVariableDescriptor]

'outRef' @ [91:29] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> IntTypeDummyState

'state' @ [91:58] ==> public final val state: TransactionState<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [91:64] ==> public final val data: LedgerTransactionQueryTests.IntTypeDummyState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'data' @ [91:69] ==> public final val data: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [92:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'ltx' @ [92:27] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple OutRef Indexer tests`[LocalVariableDescriptor]

'outRef' @ [92:31] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> StringTypeDummyState

'state' @ [92:63] ==> public final val state: TransactionState<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [92:69] ==> public final val data: LedgerTransactionQueryTests.StringTypeDummyState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'data' @ [92:74] ==> public final val data: String defined in net.corda.core.contracts.LedgerTransactionQueryTests.StringTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [93:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'ltx' @ [93:25] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple OutRef Indexer tests`[LocalVariableDescriptor]

'outRef' @ [93:29] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> IntTypeDummyState

'state' @ [93:58] ==> public final val state: TransactionState<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [93:64] ==> public final val data: LedgerTransactionQueryTests.IntTypeDummyState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'data' @ [93:69] ==> public final val data: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [94:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'ltx' @ [94:27] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple OutRef Indexer tests`[LocalVariableDescriptor]

'outRef' @ [94:31] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> StringTypeDummyState

'state' @ [94:63] ==> public final val state: TransactionState<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [94:69] ==> public final val data: LedgerTransactionQueryTests.StringTypeDummyState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'data' @ [94:74] ==> public final val data: String defined in net.corda.core.contracts.LedgerTransactionQueryTests.StringTypeDummyState[PropertyDescriptorImpl]

'assertFailsWith' @ [95:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IndexOutOfBoundsException /* = IndexOutOfBoundsException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IndexOutOfBoundsException

'ltx' @ [95:54] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple OutRef Indexer tests`[LocalVariableDescriptor]

'outRef' @ [95:58] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> IntTypeDummyState

'Test' @ [98:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeDummyTransaction' @ [100:19] ==> private final fun makeDummyTransaction(): LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests[SimpleFunctionDescriptorImpl]

'assertEquals' @ [101:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'ltx' @ [101:26] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Input Indexer tests`[LocalVariableDescriptor]

'getInput' @ [101:30] ==> public final fun getInput(index: Int): ContractState defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]

'data' @ [101:64] ==> public final val data: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [102:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'ltx' @ [102:28] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Input Indexer tests`[LocalVariableDescriptor]

'getInput' @ [102:32] ==> public final fun getInput(index: Int): ContractState defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]

'data' @ [102:69] ==> public final val data: String defined in net.corda.core.contracts.LedgerTransactionQueryTests.StringTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [103:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'ltx' @ [103:26] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Input Indexer tests`[LocalVariableDescriptor]

'getInput' @ [103:30] ==> public final fun getInput(index: Int): ContractState defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]

'data' @ [103:64] ==> public final val data: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [104:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'ltx' @ [104:28] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Input Indexer tests`[LocalVariableDescriptor]

'getInput' @ [104:32] ==> public final fun getInput(index: Int): ContractState defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]

'data' @ [104:69] ==> public final val data: String defined in net.corda.core.contracts.LedgerTransactionQueryTests.StringTypeDummyState[PropertyDescriptorImpl]

'assertFailsWith' @ [105:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IndexOutOfBoundsException /* = IndexOutOfBoundsException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IndexOutOfBoundsException

'ltx' @ [105:54] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Input Indexer tests`[LocalVariableDescriptor]

'getInput' @ [105:58] ==> public final fun getInput(index: Int): ContractState defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]

'Test' @ [108:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeDummyTransaction' @ [110:19] ==> private final fun makeDummyTransaction(): LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests[SimpleFunctionDescriptorImpl]

'assertEquals' @ [111:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'ltx' @ [111:26] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Output Indexer tests`[LocalVariableDescriptor]

'getOutput' @ [111:30] ==> public final fun getOutput(index: Int): ContractState defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]

'data' @ [111:65] ==> public final val data: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [112:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'ltx' @ [112:28] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Output Indexer tests`[LocalVariableDescriptor]

'getOutput' @ [112:32] ==> public final fun getOutput(index: Int): ContractState defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]

'data' @ [112:70] ==> public final val data: String defined in net.corda.core.contracts.LedgerTransactionQueryTests.StringTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [113:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'ltx' @ [113:26] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Output Indexer tests`[LocalVariableDescriptor]

'getOutput' @ [113:30] ==> public final fun getOutput(index: Int): ContractState defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]

'data' @ [113:65] ==> public final val data: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [114:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'ltx' @ [114:28] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Output Indexer tests`[LocalVariableDescriptor]

'getOutput' @ [114:32] ==> public final fun getOutput(index: Int): ContractState defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]

'data' @ [114:70] ==> public final val data: String defined in net.corda.core.contracts.LedgerTransactionQueryTests.StringTypeDummyState[PropertyDescriptorImpl]

'assertFailsWith' @ [115:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IndexOutOfBoundsException /* = IndexOutOfBoundsException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IndexOutOfBoundsException

'ltx' @ [115:54] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Output Indexer tests`[LocalVariableDescriptor]

'getOutput' @ [115:58] ==> public final fun getOutput(index: Int): ContractState defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]

'Test' @ [118:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeDummyTransaction' @ [120:19] ==> private final fun makeDummyTransaction(): LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests[SimpleFunctionDescriptorImpl]

'assertEquals' @ [121:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'ltx' @ [121:25] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Command Indexer tests`[LocalVariableDescriptor]

'getCommand' @ [121:29] ==> public final fun <T : CommandData> getCommand(index: Int): Command<LedgerTransactionQueryTests.Commands.Cmd1> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : CommandData> -> Cmd1

'value' @ [121:58] ==> public final val value: LedgerTransactionQueryTests.Commands.Cmd1 defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'id' @ [121:64] ==> public final val id: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.Commands.Cmd1[PropertyDescriptorImpl]

'assertEquals' @ [122:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'ltx' @ [122:25] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Command Indexer tests`[LocalVariableDescriptor]

'getCommand' @ [122:29] ==> public final fun <T : CommandData> getCommand(index: Int): Command<LedgerTransactionQueryTests.Commands.Cmd2> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : CommandData> -> Cmd2

'value' @ [122:58] ==> public final val value: LedgerTransactionQueryTests.Commands.Cmd2 defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'id' @ [122:64] ==> public final val id: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.Commands.Cmd2[PropertyDescriptorImpl]

'assertEquals' @ [123:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'ltx' @ [123:25] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Command Indexer tests`[LocalVariableDescriptor]

'getCommand' @ [123:29] ==> public final fun <T : CommandData> getCommand(index: Int): Command<LedgerTransactionQueryTests.Commands.Cmd1> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : CommandData> -> Cmd1

'value' @ [123:58] ==> public final val value: LedgerTransactionQueryTests.Commands.Cmd1 defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'id' @ [123:64] ==> public final val id: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.Commands.Cmd1[PropertyDescriptorImpl]

'assertEquals' @ [124:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'ltx' @ [124:25] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Command Indexer tests`[LocalVariableDescriptor]

'getCommand' @ [124:29] ==> public final fun <T : CommandData> getCommand(index: Int): Command<LedgerTransactionQueryTests.Commands.Cmd2> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : CommandData> -> Cmd2

'value' @ [124:58] ==> public final val value: LedgerTransactionQueryTests.Commands.Cmd2 defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'id' @ [124:64] ==> public final val id: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.Commands.Cmd2[PropertyDescriptorImpl]

'assertFailsWith' @ [125:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IndexOutOfBoundsException /* = IndexOutOfBoundsException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IndexOutOfBoundsException

'ltx' @ [125:54] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Command Indexer tests`[LocalVariableDescriptor]

'getOutput' @ [125:58] ==> public final fun getOutput(index: Int): ContractState defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]

'Test' @ [128:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeDummyTransaction' @ [130:19] ==> private final fun makeDummyTransaction(): LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests[SimpleFunctionDescriptorImpl]

'ltx' @ [131:25] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Inputs of type tests`[LocalVariableDescriptor]

'inputsOfType' @ [131:29] ==> public final fun <T : ContractState> inputsOfType(clazz: Class<LedgerTransactionQueryTests.IntTypeDummyState>): List<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> IntTypeDummyState

'IntTypeDummyState' @ [131:42] ==> public constructor IntTypeDummyState(data: Int) defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[ClassConstructorDescriptorImpl]

'java' @ [131:67] ==> public val <T> KClass<LedgerTransactionQueryTests.IntTypeDummyState>.java: Class<LedgerTransactionQueryTests.IntTypeDummyState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IntTypeDummyState

'assertEquals' @ [132:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'intStates' @ [132:25] ==> val intStates: List<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Inputs of type tests`[LocalVariableDescriptor]

'size' @ [132:35] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [133:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [133:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'intStates' @ [133:45] ==> val intStates: List<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Inputs of type tests`[LocalVariableDescriptor]

'map' @ [133:55] ==> public inline fun <T, R> Iterable<LedgerTransactionQueryTests.IntTypeDummyState>.map(transform: (LedgerTransactionQueryTests.IntTypeDummyState) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntTypeDummyState
    <R> -> Int

'it' @ [133:61] ==> value-parameter it: LedgerTransactionQueryTests.IntTypeDummyState defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Inputs of type tests`.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [133:64] ==> public final val data: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[PropertyDescriptorImpl]

'ltx' @ [134:28] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Inputs of type tests`[LocalVariableDescriptor]

'inputsOfType' @ [134:32] ==> public final inline fun <reified T : ContractState> inputsOfType(): List<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> StringTypeDummyState

'assertEquals' @ [135:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'stringStates' @ [135:25] ==> val stringStates: List<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Inputs of type tests`[LocalVariableDescriptor]

'size' @ [135:38] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [136:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [136:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'stringStates' @ [136:55] ==> val stringStates: List<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Inputs of type tests`[LocalVariableDescriptor]

'map' @ [136:68] ==> public inline fun <T, R> Iterable<LedgerTransactionQueryTests.StringTypeDummyState>.map(transform: (LedgerTransactionQueryTests.StringTypeDummyState) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StringTypeDummyState
    <R> -> String

'it' @ [136:74] ==> value-parameter it: LedgerTransactionQueryTests.StringTypeDummyState defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Inputs of type tests`.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [136:77] ==> public final val data: String defined in net.corda.core.contracts.LedgerTransactionQueryTests.StringTypeDummyState[PropertyDescriptorImpl]

'ltx' @ [137:31] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Inputs of type tests`[LocalVariableDescriptor]

'inputsOfType' @ [137:35] ==> public final fun <T : ContractState> inputsOfType(clazz: Class<FungibleAsset<*>>): List<FungibleAsset<*>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> FungibleAsset<*>

'java' @ [137:69] ==> public val <T> KClass<FungibleAsset<*>>.java: Class<FungibleAsset<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FungibleAsset<*>

'assertEquals' @ [138:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<FungibleAsset<*>>, actual: List<FungibleAsset<*>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<FungibleAsset<*>>

'emptyList' @ [138:22] ==> public fun <T> emptyList(): List<FungibleAsset<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FungibleAsset<*>

'notPresentQuery' @ [138:35] ==> val notPresentQuery: List<FungibleAsset<*>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Inputs of type tests`[LocalVariableDescriptor]

'Test' @ [141:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeDummyTransaction' @ [143:19] ==> private final fun makeDummyTransaction(): LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests[SimpleFunctionDescriptorImpl]

'ltx' @ [144:25] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple InputsRefs of type tests`[LocalVariableDescriptor]

'inRefsOfType' @ [144:29] ==> public final fun <T : ContractState> inRefsOfType(clazz: Class<LedgerTransactionQueryTests.IntTypeDummyState>): List<StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> IntTypeDummyState

'IntTypeDummyState' @ [144:42] ==> public constructor IntTypeDummyState(data: Int) defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[ClassConstructorDescriptorImpl]

'java' @ [144:67] ==> public val <T> KClass<LedgerTransactionQueryTests.IntTypeDummyState>.java: Class<LedgerTransactionQueryTests.IntTypeDummyState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IntTypeDummyState

'assertEquals' @ [145:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'intStates' @ [145:25] ==> val intStates: List<StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple InputsRefs of type tests`[LocalVariableDescriptor]

'size' @ [145:35] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [146:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [146:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'intStates' @ [146:45] ==> val intStates: List<StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple InputsRefs of type tests`[LocalVariableDescriptor]

'map' @ [146:55] ==> public inline fun <T, R> Iterable<StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>>.map(transform: (StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<IntTypeDummyState>
    <R> -> Int

'it' @ [146:61] ==> value-parameter it: StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple InputsRefs of type tests`.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [146:64] ==> public final val state: TransactionState<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [146:70] ==> public final val data: LedgerTransactionQueryTests.IntTypeDummyState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'data' @ [146:75] ==> public final val data: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [147:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<StateAndRef<ContractState>>, actual: List<StateAndRef<ContractState>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<StateAndRef<ContractState>>

'listOf' @ [147:22] ==> public fun <T> listOf(vararg elements: StateAndRef<ContractState>): List<StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'ltx' @ [147:29] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple InputsRefs of type tests`[LocalVariableDescriptor]

'inputs' @ [147:33] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'ltx' @ [147:44] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple InputsRefs of type tests`[LocalVariableDescriptor]

'inputs' @ [147:48] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'ltx' @ [147:59] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple InputsRefs of type tests`[LocalVariableDescriptor]

'inputs' @ [147:63] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'ltx' @ [147:74] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple InputsRefs of type tests`[LocalVariableDescriptor]

'inputs' @ [147:78] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'ltx' @ [147:89] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple InputsRefs of type tests`[LocalVariableDescriptor]

'inputs' @ [147:93] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'intStates' @ [147:105] ==> val intStates: List<StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple InputsRefs of type tests`[LocalVariableDescriptor]

'ltx' @ [148:28] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple InputsRefs of type tests`[LocalVariableDescriptor]

'inRefsOfType' @ [148:32] ==> public final inline fun <reified T : ContractState> inRefsOfType(): List<StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> StringTypeDummyState

'assertEquals' @ [149:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'stringStates' @ [149:25] ==> val stringStates: List<StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple InputsRefs of type tests`[LocalVariableDescriptor]

'size' @ [149:38] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [150:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [150:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'stringStates' @ [150:55] ==> val stringStates: List<StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple InputsRefs of type tests`[LocalVariableDescriptor]

'map' @ [150:68] ==> public inline fun <T, R> Iterable<StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>>.map(transform: (StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<StringTypeDummyState>
    <R> -> String

'it' @ [150:74] ==> value-parameter it: StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple InputsRefs of type tests`.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [150:77] ==> public final val state: TransactionState<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [150:83] ==> public final val data: LedgerTransactionQueryTests.StringTypeDummyState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'data' @ [150:88] ==> public final val data: String defined in net.corda.core.contracts.LedgerTransactionQueryTests.StringTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [151:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<StateAndRef<ContractState>>, actual: List<StateAndRef<ContractState>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<StateAndRef<ContractState>>

'listOf' @ [151:22] ==> public fun <T> listOf(vararg elements: StateAndRef<ContractState>): List<StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'ltx' @ [151:29] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple InputsRefs of type tests`[LocalVariableDescriptor]

'inputs' @ [151:33] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'ltx' @ [151:44] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple InputsRefs of type tests`[LocalVariableDescriptor]

'inputs' @ [151:48] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'ltx' @ [151:59] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple InputsRefs of type tests`[LocalVariableDescriptor]

'inputs' @ [151:63] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'ltx' @ [151:74] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple InputsRefs of type tests`[LocalVariableDescriptor]

'inputs' @ [151:78] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'ltx' @ [151:89] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple InputsRefs of type tests`[LocalVariableDescriptor]

'inputs' @ [151:93] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'stringStates' @ [151:105] ==> val stringStates: List<StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple InputsRefs of type tests`[LocalVariableDescriptor]

'Test' @ [154:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeDummyTransaction' @ [156:19] ==> private final fun makeDummyTransaction(): LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests[SimpleFunctionDescriptorImpl]

'ltx' @ [157:25] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Outputs of type tests`[LocalVariableDescriptor]

'outputsOfType' @ [157:29] ==> public final fun <T : ContractState> outputsOfType(clazz: Class<LedgerTransactionQueryTests.IntTypeDummyState>): List<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> IntTypeDummyState

'IntTypeDummyState' @ [157:43] ==> public constructor IntTypeDummyState(data: Int) defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[ClassConstructorDescriptorImpl]

'java' @ [157:68] ==> public val <T> KClass<LedgerTransactionQueryTests.IntTypeDummyState>.java: Class<LedgerTransactionQueryTests.IntTypeDummyState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IntTypeDummyState

'assertEquals' @ [158:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'intStates' @ [158:25] ==> val intStates: List<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Outputs of type tests`[LocalVariableDescriptor]

'size' @ [158:35] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [159:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [159:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'intStates' @ [159:45] ==> val intStates: List<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Outputs of type tests`[LocalVariableDescriptor]

'map' @ [159:55] ==> public inline fun <T, R> Iterable<LedgerTransactionQueryTests.IntTypeDummyState>.map(transform: (LedgerTransactionQueryTests.IntTypeDummyState) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntTypeDummyState
    <R> -> Int

'it' @ [159:61] ==> value-parameter it: LedgerTransactionQueryTests.IntTypeDummyState defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Outputs of type tests`.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [159:64] ==> public final val data: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[PropertyDescriptorImpl]

'ltx' @ [160:28] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Outputs of type tests`[LocalVariableDescriptor]

'outputsOfType' @ [160:32] ==> public final inline fun <reified T : ContractState> outputsOfType(): List<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> StringTypeDummyState

'assertEquals' @ [161:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'stringStates' @ [161:25] ==> val stringStates: List<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Outputs of type tests`[LocalVariableDescriptor]

'size' @ [161:38] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [162:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [162:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'stringStates' @ [162:55] ==> val stringStates: List<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Outputs of type tests`[LocalVariableDescriptor]

'map' @ [162:68] ==> public inline fun <T, R> Iterable<LedgerTransactionQueryTests.StringTypeDummyState>.map(transform: (LedgerTransactionQueryTests.StringTypeDummyState) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StringTypeDummyState
    <R> -> String

'it' @ [162:74] ==> value-parameter it: LedgerTransactionQueryTests.StringTypeDummyState defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Outputs of type tests`.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [162:77] ==> public final val data: String defined in net.corda.core.contracts.LedgerTransactionQueryTests.StringTypeDummyState[PropertyDescriptorImpl]

'ltx' @ [163:31] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Outputs of type tests`[LocalVariableDescriptor]

'outputsOfType' @ [163:35] ==> public final fun <T : ContractState> outputsOfType(clazz: Class<FungibleAsset<*>>): List<FungibleAsset<*>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> FungibleAsset<*>

'java' @ [163:70] ==> public val <T> KClass<FungibleAsset<*>>.java: Class<FungibleAsset<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FungibleAsset<*>

'assertEquals' @ [164:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<FungibleAsset<*>>, actual: List<FungibleAsset<*>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<FungibleAsset<*>>

'emptyList' @ [164:22] ==> public fun <T> emptyList(): List<FungibleAsset<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FungibleAsset<*>

'notPresentQuery' @ [164:35] ==> val notPresentQuery: List<FungibleAsset<*>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Outputs of type tests`[LocalVariableDescriptor]

'Test' @ [167:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeDummyTransaction' @ [169:19] ==> private final fun makeDummyTransaction(): LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests[SimpleFunctionDescriptorImpl]

'ltx' @ [170:25] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple OutputsRefs of type tests`[LocalVariableDescriptor]

'outRefsOfType' @ [170:29] ==> public final fun <T : ContractState> outRefsOfType(clazz: Class<LedgerTransactionQueryTests.IntTypeDummyState>): List<StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> IntTypeDummyState

'IntTypeDummyState' @ [170:43] ==> public constructor IntTypeDummyState(data: Int) defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[ClassConstructorDescriptorImpl]

'java' @ [170:68] ==> public val <T> KClass<LedgerTransactionQueryTests.IntTypeDummyState>.java: Class<LedgerTransactionQueryTests.IntTypeDummyState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IntTypeDummyState

'assertEquals' @ [171:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'intStates' @ [171:25] ==> val intStates: List<StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple OutputsRefs of type tests`[LocalVariableDescriptor]

'size' @ [171:35] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [172:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [172:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'intStates' @ [172:45] ==> val intStates: List<StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple OutputsRefs of type tests`[LocalVariableDescriptor]

'map' @ [172:55] ==> public inline fun <T, R> Iterable<StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>>.map(transform: (StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<IntTypeDummyState>
    <R> -> Int

'it' @ [172:61] ==> value-parameter it: StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple OutputsRefs of type tests`.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [172:64] ==> public final val state: TransactionState<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [172:70] ==> public final val data: LedgerTransactionQueryTests.IntTypeDummyState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'data' @ [172:75] ==> public final val data: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [173:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [173:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'intStates' @ [173:45] ==> val intStates: List<StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple OutputsRefs of type tests`[LocalVariableDescriptor]

'map' @ [173:55] ==> public inline fun <T, R> Iterable<StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>>.map(transform: (StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<IntTypeDummyState>
    <R> -> Int

'it' @ [173:61] ==> value-parameter it: StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple OutputsRefs of type tests`.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [173:64] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'index' @ [173:68] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'assertTrue' @ [174:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'intStates' @ [174:20] ==> val intStates: List<StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple OutputsRefs of type tests`[LocalVariableDescriptor]

'all' @ [174:30] ==> public inline fun <T> Iterable<StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>>.all(predicate: (StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<IntTypeDummyState>

'it' @ [174:36] ==> value-parameter it: StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple OutputsRefs of type tests`.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [174:39] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'txhash' @ [174:43] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'ltx' @ [174:53] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple OutputsRefs of type tests`[LocalVariableDescriptor]

'id' @ [174:57] ==> public open val id: SecureHash defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'ltx' @ [175:28] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple OutputsRefs of type tests`[LocalVariableDescriptor]

'outRefsOfType' @ [175:32] ==> public final inline fun <reified T : ContractState> outRefsOfType(): List<StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> StringTypeDummyState

'assertEquals' @ [176:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'stringStates' @ [176:25] ==> val stringStates: List<StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple OutputsRefs of type tests`[LocalVariableDescriptor]

'size' @ [176:38] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [177:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [177:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'stringStates' @ [177:55] ==> val stringStates: List<StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple OutputsRefs of type tests`[LocalVariableDescriptor]

'map' @ [177:68] ==> public inline fun <T, R> Iterable<StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>>.map(transform: (StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<StringTypeDummyState>
    <R> -> String

'it' @ [177:74] ==> value-parameter it: StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple OutputsRefs of type tests`.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [177:77] ==> public final val state: TransactionState<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [177:83] ==> public final val data: LedgerTransactionQueryTests.StringTypeDummyState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'data' @ [177:88] ==> public final val data: String defined in net.corda.core.contracts.LedgerTransactionQueryTests.StringTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [178:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [178:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'stringStates' @ [178:45] ==> val stringStates: List<StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple OutputsRefs of type tests`[LocalVariableDescriptor]

'map' @ [178:58] ==> public inline fun <T, R> Iterable<StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>>.map(transform: (StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<StringTypeDummyState>
    <R> -> Int

'it' @ [178:64] ==> value-parameter it: StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple OutputsRefs of type tests`.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [178:67] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'index' @ [178:71] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'assertTrue' @ [179:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'stringStates' @ [179:20] ==> val stringStates: List<StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple OutputsRefs of type tests`[LocalVariableDescriptor]

'all' @ [179:33] ==> public inline fun <T> Iterable<StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>>.all(predicate: (StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<StringTypeDummyState>

'it' @ [179:39] ==> value-parameter it: StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple OutputsRefs of type tests`.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [179:42] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'txhash' @ [179:46] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'ltx' @ [179:56] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple OutputsRefs of type tests`[LocalVariableDescriptor]

'id' @ [179:60] ==> public open val id: SecureHash defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'Test' @ [182:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeDummyTransaction' @ [184:19] ==> private final fun makeDummyTransaction(): LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests[SimpleFunctionDescriptorImpl]

'ltx' @ [185:23] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Commands of type tests`[LocalVariableDescriptor]

'commandsOfType' @ [185:27] ==> public final fun <T : CommandData> commandsOfType(clazz: Class<LedgerTransactionQueryTests.Commands.Cmd1>): List<Command<LedgerTransactionQueryTests.Commands.Cmd1>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : CommandData> -> Cmd1

'Cmd1' @ [185:51] ==> public constructor Cmd1(id: Int) defined in net.corda.core.contracts.LedgerTransactionQueryTests.Commands.Cmd1[ClassConstructorDescriptorImpl]

'java' @ [185:63] ==> public val <T> KClass<LedgerTransactionQueryTests.Commands.Cmd1>.java: Class<LedgerTransactionQueryTests.Commands.Cmd1> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Cmd1

'assertEquals' @ [186:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'intCmd1' @ [186:25] ==> val intCmd1: List<Command<LedgerTransactionQueryTests.Commands.Cmd1>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Commands of type tests`[LocalVariableDescriptor]

'size' @ [186:33] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [187:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [187:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'intCmd1' @ [187:45] ==> val intCmd1: List<Command<LedgerTransactionQueryTests.Commands.Cmd1>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Commands of type tests`[LocalVariableDescriptor]

'map' @ [187:53] ==> public inline fun <T, R> Iterable<Command<LedgerTransactionQueryTests.Commands.Cmd1>>.map(transform: (Command<LedgerTransactionQueryTests.Commands.Cmd1>) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<Cmd1>
    <R> -> Int

'it' @ [187:59] ==> value-parameter it: Command<LedgerTransactionQueryTests.Commands.Cmd1> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Commands of type tests`.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [187:62] ==> public final val value: LedgerTransactionQueryTests.Commands.Cmd1 defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'id' @ [187:68] ==> public final val id: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.Commands.Cmd1[PropertyDescriptorImpl]

'ltx' @ [188:23] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Commands of type tests`[LocalVariableDescriptor]

'commandsOfType' @ [188:27] ==> public final inline fun <reified T : CommandData> commandsOfType(): List<Command<LedgerTransactionQueryTests.Commands.Cmd2>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> Cmd2

'assertEquals' @ [189:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'intCmd2' @ [189:25] ==> val intCmd2: List<Command<LedgerTransactionQueryTests.Commands.Cmd2>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Commands of type tests`[LocalVariableDescriptor]

'size' @ [189:33] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [190:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [190:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'intCmd2' @ [190:45] ==> val intCmd2: List<Command<LedgerTransactionQueryTests.Commands.Cmd2>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Commands of type tests`[LocalVariableDescriptor]

'map' @ [190:53] ==> public inline fun <T, R> Iterable<Command<LedgerTransactionQueryTests.Commands.Cmd2>>.map(transform: (Command<LedgerTransactionQueryTests.Commands.Cmd2>) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<Cmd2>
    <R> -> Int

'it' @ [190:59] ==> value-parameter it: Command<LedgerTransactionQueryTests.Commands.Cmd2> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Commands of type tests`.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [190:62] ==> public final val value: LedgerTransactionQueryTests.Commands.Cmd2 defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'id' @ [190:68] ==> public final val id: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.Commands.Cmd2[PropertyDescriptorImpl]

'ltx' @ [191:31] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Commands of type tests`[LocalVariableDescriptor]

'commandsOfType' @ [191:35] ==> public final fun <T : CommandData> commandsOfType(clazz: Class<LedgerTransactionQueryTests.Commands.Cmd3>): List<Command<LedgerTransactionQueryTests.Commands.Cmd3>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : CommandData> -> Cmd3

'Cmd3' @ [191:59] ==> public constructor Cmd3(id: Int) defined in net.corda.core.contracts.LedgerTransactionQueryTests.Commands.Cmd3[ClassConstructorDescriptorImpl]

'java' @ [191:71] ==> public val <T> KClass<LedgerTransactionQueryTests.Commands.Cmd3>.java: Class<LedgerTransactionQueryTests.Commands.Cmd3> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Cmd3

'assertEquals' @ [192:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Command<LedgerTransactionQueryTests.Commands.Cmd3>>, actual: List<Command<LedgerTransactionQueryTests.Commands.Cmd3>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Command<Cmd3>>

'emptyList' @ [192:22] ==> public fun <T> emptyList(): List<Command<LedgerTransactionQueryTests.Commands.Cmd3>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<Cmd3>

'notPresentQuery' @ [192:35] ==> val notPresentQuery: List<Command<LedgerTransactionQueryTests.Commands.Cmd3>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Simple Commands of type tests`[LocalVariableDescriptor]

'Test' @ [195:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeDummyTransaction' @ [197:19] ==> private final fun makeDummyTransaction(): LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests[SimpleFunctionDescriptorImpl]

'ltx' @ [198:25] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered Input Tests`[LocalVariableDescriptor]

'filterInputs' @ [198:29] ==> public final fun <T : ContractState> filterInputs(clazz: Class<LedgerTransactionQueryTests.IntTypeDummyState>, predicate: Predicate<LedgerTransactionQueryTests.IntTypeDummyState>): List<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> IntTypeDummyState

'IntTypeDummyState' @ [198:42] ==> public constructor IntTypeDummyState(data: Int) defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[ClassConstructorDescriptorImpl]

'java' @ [198:67] ==> public val <T> KClass<LedgerTransactionQueryTests.IntTypeDummyState>.java: Class<LedgerTransactionQueryTests.IntTypeDummyState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IntTypeDummyState

'Predicate' @ [198:73] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (LedgerTransactionQueryTests.IntTypeDummyState) -> Boolean): Predicate<LedgerTransactionQueryTests.IntTypeDummyState> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> IntTypeDummyState

'it' @ [198:85] ==> value-parameter it: LedgerTransactionQueryTests.IntTypeDummyState defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered Input Tests`.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [198:88] ==> public final val data: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[PropertyDescriptorImpl]

'rem' @ [198:93] ==> @SinceKotlin public final operator fun rem(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [199:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'intStates' @ [199:25] ==> val intStates: List<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered Input Tests`[LocalVariableDescriptor]

'size' @ [199:35] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [200:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [200:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'intStates' @ [200:39] ==> val intStates: List<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered Input Tests`[LocalVariableDescriptor]

'map' @ [200:49] ==> public inline fun <T, R> Iterable<LedgerTransactionQueryTests.IntTypeDummyState>.map(transform: (LedgerTransactionQueryTests.IntTypeDummyState) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntTypeDummyState
    <R> -> Int

'it' @ [200:55] ==> value-parameter it: LedgerTransactionQueryTests.IntTypeDummyState defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered Input Tests`.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [200:58] ==> public final val data: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[PropertyDescriptorImpl]

'ltx' @ [201:56] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered Input Tests`[LocalVariableDescriptor]

'filterInputs' @ [201:60] ==> public final inline fun <reified T : ContractState> filterInputs(crossinline predicate: (LedgerTransactionQueryTests.StringTypeDummyState) -> Boolean): List<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> StringTypeDummyState

'it' @ [201:75] ==> value-parameter it: LedgerTransactionQueryTests.StringTypeDummyState defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered Input Tests`.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [201:78] ==> public final val data: String defined in net.corda.core.contracts.LedgerTransactionQueryTests.StringTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [202:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'stringStates' @ [202:27] ==> val stringStates: List<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered Input Tests`[LocalVariableDescriptor]

'single' @ [202:40] ==> public fun <T> List<LedgerTransactionQueryTests.StringTypeDummyState>.single(): LedgerTransactionQueryTests.StringTypeDummyState defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StringTypeDummyState

'data' @ [202:49] ==> public final val data: String defined in net.corda.core.contracts.LedgerTransactionQueryTests.StringTypeDummyState[PropertyDescriptorImpl]

'Test' @ [205:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeDummyTransaction' @ [207:19] ==> private final fun makeDummyTransaction(): LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests[SimpleFunctionDescriptorImpl]

'ltx' @ [208:25] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered InRef Tests`[LocalVariableDescriptor]

'filterInRefs' @ [208:29] ==> public final fun <T : ContractState> filterInRefs(clazz: Class<LedgerTransactionQueryTests.IntTypeDummyState>, predicate: Predicate<LedgerTransactionQueryTests.IntTypeDummyState>): List<StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> IntTypeDummyState

'IntTypeDummyState' @ [208:42] ==> public constructor IntTypeDummyState(data: Int) defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[ClassConstructorDescriptorImpl]

'java' @ [208:67] ==> public val <T> KClass<LedgerTransactionQueryTests.IntTypeDummyState>.java: Class<LedgerTransactionQueryTests.IntTypeDummyState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IntTypeDummyState

'Predicate' @ [208:73] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (LedgerTransactionQueryTests.IntTypeDummyState) -> Boolean): Predicate<LedgerTransactionQueryTests.IntTypeDummyState> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> IntTypeDummyState

'it' @ [208:85] ==> value-parameter it: LedgerTransactionQueryTests.IntTypeDummyState defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered InRef Tests`.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [208:88] ==> public final val data: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[PropertyDescriptorImpl]

'rem' @ [208:93] ==> @SinceKotlin public final operator fun rem(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [209:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'intStates' @ [209:25] ==> val intStates: List<StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered InRef Tests`[LocalVariableDescriptor]

'size' @ [209:35] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [210:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [210:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'intStates' @ [210:39] ==> val intStates: List<StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered InRef Tests`[LocalVariableDescriptor]

'map' @ [210:49] ==> public inline fun <T, R> Iterable<StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>>.map(transform: (StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<IntTypeDummyState>
    <R> -> Int

'it' @ [210:55] ==> value-parameter it: StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered InRef Tests`.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [210:58] ==> public final val state: TransactionState<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [210:64] ==> public final val data: LedgerTransactionQueryTests.IntTypeDummyState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'data' @ [210:69] ==> public final val data: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [211:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<StateAndRef<ContractState>>, actual: List<StateAndRef<ContractState>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<StateAndRef<ContractState>>

'listOf' @ [211:22] ==> public fun <T> listOf(vararg elements: StateAndRef<ContractState>): List<StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'ltx' @ [211:29] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered InRef Tests`[LocalVariableDescriptor]

'inputs' @ [211:33] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'ltx' @ [211:44] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered InRef Tests`[LocalVariableDescriptor]

'inputs' @ [211:48] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'ltx' @ [211:59] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered InRef Tests`[LocalVariableDescriptor]

'inputs' @ [211:63] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'intStates' @ [211:75] ==> val intStates: List<StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered InRef Tests`[LocalVariableDescriptor]

'ltx' @ [212:69] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered InRef Tests`[LocalVariableDescriptor]

'filterInRefs' @ [212:73] ==> public final inline fun <reified T : ContractState> filterInRefs(crossinline predicate: (LedgerTransactionQueryTests.StringTypeDummyState) -> Boolean): List<StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> StringTypeDummyState

'it' @ [212:88] ==> value-parameter it: LedgerTransactionQueryTests.StringTypeDummyState defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered InRef Tests`.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [212:91] ==> public final val data: String defined in net.corda.core.contracts.LedgerTransactionQueryTests.StringTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [213:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'stringStates' @ [213:27] ==> val stringStates: List<StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered InRef Tests`[LocalVariableDescriptor]

'single' @ [213:40] ==> public fun <T> List<StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>>.single(): StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<StringTypeDummyState>

'state' @ [213:49] ==> public final val state: TransactionState<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [213:55] ==> public final val data: LedgerTransactionQueryTests.StringTypeDummyState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'data' @ [213:60] ==> public final val data: String defined in net.corda.core.contracts.LedgerTransactionQueryTests.StringTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [214:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: StateAndRef<ContractState>, actual: StateAndRef<ContractState>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> StateAndRef<ContractState>

'ltx' @ [214:22] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered InRef Tests`[LocalVariableDescriptor]

'inputs' @ [214:26] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'stringStates' @ [214:37] ==> val stringStates: List<StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered InRef Tests`[LocalVariableDescriptor]

'single' @ [214:50] ==> public fun <T> List<StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>>.single(): StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<StringTypeDummyState>

'Test' @ [217:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeDummyTransaction' @ [219:19] ==> private final fun makeDummyTransaction(): LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests[SimpleFunctionDescriptorImpl]

'ltx' @ [220:25] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered Output Tests`[LocalVariableDescriptor]

'filterOutputs' @ [220:29] ==> public final fun <T : ContractState> filterOutputs(clazz: Class<LedgerTransactionQueryTests.IntTypeDummyState>, predicate: Predicate<LedgerTransactionQueryTests.IntTypeDummyState>): List<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> IntTypeDummyState

'IntTypeDummyState' @ [220:43] ==> public constructor IntTypeDummyState(data: Int) defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[ClassConstructorDescriptorImpl]

'java' @ [220:68] ==> public val <T> KClass<LedgerTransactionQueryTests.IntTypeDummyState>.java: Class<LedgerTransactionQueryTests.IntTypeDummyState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IntTypeDummyState

'Predicate' @ [220:74] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (LedgerTransactionQueryTests.IntTypeDummyState) -> Boolean): Predicate<LedgerTransactionQueryTests.IntTypeDummyState> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> IntTypeDummyState

'it' @ [220:86] ==> value-parameter it: LedgerTransactionQueryTests.IntTypeDummyState defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered Output Tests`.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [220:89] ==> public final val data: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[PropertyDescriptorImpl]

'rem' @ [220:94] ==> @SinceKotlin public final operator fun rem(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [221:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'intStates' @ [221:25] ==> val intStates: List<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered Output Tests`[LocalVariableDescriptor]

'size' @ [221:35] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [222:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [222:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'intStates' @ [222:39] ==> val intStates: List<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered Output Tests`[LocalVariableDescriptor]

'map' @ [222:49] ==> public inline fun <T, R> Iterable<LedgerTransactionQueryTests.IntTypeDummyState>.map(transform: (LedgerTransactionQueryTests.IntTypeDummyState) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntTypeDummyState
    <R> -> Int

'it' @ [222:55] ==> value-parameter it: LedgerTransactionQueryTests.IntTypeDummyState defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered Output Tests`.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [222:58] ==> public final val data: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[PropertyDescriptorImpl]

'ltx' @ [223:56] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered Output Tests`[LocalVariableDescriptor]

'filterOutputs' @ [223:60] ==> public final inline fun <reified T : ContractState> filterOutputs(crossinline predicate: (LedgerTransactionQueryTests.StringTypeDummyState) -> Boolean): List<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> StringTypeDummyState

'it' @ [223:76] ==> value-parameter it: LedgerTransactionQueryTests.StringTypeDummyState defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered Output Tests`.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [223:79] ==> public final val data: String defined in net.corda.core.contracts.LedgerTransactionQueryTests.StringTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [224:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'stringStates' @ [224:27] ==> val stringStates: List<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered Output Tests`[LocalVariableDescriptor]

'single' @ [224:40] ==> public fun <T> List<LedgerTransactionQueryTests.StringTypeDummyState>.single(): LedgerTransactionQueryTests.StringTypeDummyState defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StringTypeDummyState

'data' @ [224:49] ==> public final val data: String defined in net.corda.core.contracts.LedgerTransactionQueryTests.StringTypeDummyState[PropertyDescriptorImpl]

'Test' @ [227:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeDummyTransaction' @ [229:19] ==> private final fun makeDummyTransaction(): LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests[SimpleFunctionDescriptorImpl]

'ltx' @ [230:25] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered OutRef Tests`[LocalVariableDescriptor]

'filterOutRefs' @ [230:29] ==> public final fun <T : ContractState> filterOutRefs(clazz: Class<LedgerTransactionQueryTests.IntTypeDummyState>, predicate: Predicate<LedgerTransactionQueryTests.IntTypeDummyState>): List<StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> IntTypeDummyState

'IntTypeDummyState' @ [230:43] ==> public constructor IntTypeDummyState(data: Int) defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[ClassConstructorDescriptorImpl]

'java' @ [230:68] ==> public val <T> KClass<LedgerTransactionQueryTests.IntTypeDummyState>.java: Class<LedgerTransactionQueryTests.IntTypeDummyState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IntTypeDummyState

'Predicate' @ [230:74] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (LedgerTransactionQueryTests.IntTypeDummyState) -> Boolean): Predicate<LedgerTransactionQueryTests.IntTypeDummyState> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> IntTypeDummyState

'it' @ [230:86] ==> value-parameter it: LedgerTransactionQueryTests.IntTypeDummyState defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered OutRef Tests`.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [230:89] ==> public final val data: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[PropertyDescriptorImpl]

'rem' @ [230:94] ==> @SinceKotlin public final operator fun rem(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [231:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'intStates' @ [231:25] ==> val intStates: List<StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered OutRef Tests`[LocalVariableDescriptor]

'size' @ [231:35] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [232:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [232:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'intStates' @ [232:39] ==> val intStates: List<StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered OutRef Tests`[LocalVariableDescriptor]

'map' @ [232:49] ==> public inline fun <T, R> Iterable<StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>>.map(transform: (StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<IntTypeDummyState>
    <R> -> Int

'it' @ [232:55] ==> value-parameter it: StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered OutRef Tests`.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [232:58] ==> public final val state: TransactionState<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [232:64] ==> public final val data: LedgerTransactionQueryTests.IntTypeDummyState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'data' @ [232:69] ==> public final val data: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [233:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [233:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'intStates' @ [233:39] ==> val intStates: List<StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered OutRef Tests`[LocalVariableDescriptor]

'map' @ [233:49] ==> public inline fun <T, R> Iterable<StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>>.map(transform: (StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<IntTypeDummyState>
    <R> -> Int

'it' @ [233:55] ==> value-parameter it: StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered OutRef Tests`.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [233:58] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'index' @ [233:62] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'assertTrue' @ [234:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'intStates' @ [234:20] ==> val intStates: List<StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered OutRef Tests`[LocalVariableDescriptor]

'all' @ [234:30] ==> public inline fun <T> Iterable<StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>>.all(predicate: (StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<IntTypeDummyState>

'it' @ [234:36] ==> value-parameter it: StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered OutRef Tests`.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [234:39] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'txhash' @ [234:43] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'ltx' @ [234:53] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered OutRef Tests`[LocalVariableDescriptor]

'id' @ [234:57] ==> public open val id: SecureHash defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'ltx' @ [235:69] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered OutRef Tests`[LocalVariableDescriptor]

'filterOutRefs' @ [235:73] ==> public final inline fun <reified T : ContractState> filterOutRefs(crossinline predicate: (LedgerTransactionQueryTests.StringTypeDummyState) -> Boolean): List<StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> StringTypeDummyState

'it' @ [235:89] ==> value-parameter it: LedgerTransactionQueryTests.StringTypeDummyState defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered OutRef Tests`.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [235:92] ==> public final val data: String defined in net.corda.core.contracts.LedgerTransactionQueryTests.StringTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [236:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'stringStates' @ [236:27] ==> val stringStates: List<StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered OutRef Tests`[LocalVariableDescriptor]

'single' @ [236:40] ==> public fun <T> List<StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>>.single(): StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<StringTypeDummyState>

'state' @ [236:49] ==> public final val state: TransactionState<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [236:55] ==> public final val data: LedgerTransactionQueryTests.StringTypeDummyState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'data' @ [236:60] ==> public final val data: String defined in net.corda.core.contracts.LedgerTransactionQueryTests.StringTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [237:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'stringStates' @ [237:25] ==> val stringStates: List<StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered OutRef Tests`[LocalVariableDescriptor]

'single' @ [237:38] ==> public fun <T> List<StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>>.single(): StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<StringTypeDummyState>

'ref' @ [237:47] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'index' @ [237:51] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'assertEquals' @ [238:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: SecureHash, actual: SecureHash, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> SecureHash

'ltx' @ [238:22] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered OutRef Tests`[LocalVariableDescriptor]

'id' @ [238:26] ==> public open val id: SecureHash defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'stringStates' @ [238:30] ==> val stringStates: List<StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered OutRef Tests`[LocalVariableDescriptor]

'single' @ [238:43] ==> public fun <T> List<StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>>.single(): StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<StringTypeDummyState>

'ref' @ [238:52] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'txhash' @ [238:56] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'Test' @ [241:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeDummyTransaction' @ [243:19] ==> private final fun makeDummyTransaction(): LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests[SimpleFunctionDescriptorImpl]

'ltx' @ [244:24] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered Commands Tests`[LocalVariableDescriptor]

'filterCommands' @ [244:28] ==> public final fun <T : CommandData> filterCommands(clazz: Class<LedgerTransactionQueryTests.Commands.Cmd1>, predicate: Predicate<LedgerTransactionQueryTests.Commands.Cmd1>): List<Command<LedgerTransactionQueryTests.Commands.Cmd1>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : CommandData> -> Cmd1

'Cmd1' @ [244:52] ==> public constructor Cmd1(id: Int) defined in net.corda.core.contracts.LedgerTransactionQueryTests.Commands.Cmd1[ClassConstructorDescriptorImpl]

'java' @ [244:64] ==> public val <T> KClass<LedgerTransactionQueryTests.Commands.Cmd1>.java: Class<LedgerTransactionQueryTests.Commands.Cmd1> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Cmd1

'Predicate' @ [244:70] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (LedgerTransactionQueryTests.Commands.Cmd1) -> Boolean): Predicate<LedgerTransactionQueryTests.Commands.Cmd1> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> Cmd1

'it' @ [244:82] ==> value-parameter it: LedgerTransactionQueryTests.Commands.Cmd1 defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered Commands Tests`.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [244:85] ==> public final val id: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.Commands.Cmd1[PropertyDescriptorImpl]

'rem' @ [244:88] ==> @SinceKotlin public final operator fun rem(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [245:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'intCmds1' @ [245:25] ==> val intCmds1: List<Command<LedgerTransactionQueryTests.Commands.Cmd1>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered Commands Tests`[LocalVariableDescriptor]

'size' @ [245:34] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [246:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [246:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'intCmds1' @ [246:39] ==> val intCmds1: List<Command<LedgerTransactionQueryTests.Commands.Cmd1>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered Commands Tests`[LocalVariableDescriptor]

'map' @ [246:48] ==> public inline fun <T, R> Iterable<Command<LedgerTransactionQueryTests.Commands.Cmd1>>.map(transform: (Command<LedgerTransactionQueryTests.Commands.Cmd1>) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<Cmd1>
    <R> -> Int

'it' @ [246:54] ==> value-parameter it: Command<LedgerTransactionQueryTests.Commands.Cmd1> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered Commands Tests`.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [246:57] ==> public final val value: LedgerTransactionQueryTests.Commands.Cmd1 defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'id' @ [246:63] ==> public final val id: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.Commands.Cmd1[PropertyDescriptorImpl]

'ltx' @ [247:24] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered Commands Tests`[LocalVariableDescriptor]

'filterCommands' @ [247:28] ==> public final inline fun <reified T : CommandData> filterCommands(crossinline predicate: (LedgerTransactionQueryTests.Commands.Cmd2) -> Boolean): List<Command<LedgerTransactionQueryTests.Commands.Cmd2>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> Cmd2

'it' @ [247:60] ==> value-parameter it: LedgerTransactionQueryTests.Commands.Cmd2 defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered Commands Tests`.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [247:63] ==> public final val id: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.Commands.Cmd2[PropertyDescriptorImpl]

'assertEquals' @ [248:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'intCmds2' @ [248:25] ==> val intCmds2: List<Command<LedgerTransactionQueryTests.Commands.Cmd2>> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Filtered Commands Tests`[LocalVariableDescriptor]

'single' @ [248:34] ==> public fun <T> List<Command<LedgerTransactionQueryTests.Commands.Cmd2>>.single(): Command<LedgerTransactionQueryTests.Commands.Cmd2> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<Cmd2>

'value' @ [248:43] ==> public final val value: LedgerTransactionQueryTests.Commands.Cmd2 defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'id' @ [248:49] ==> public final val id: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.Commands.Cmd2[PropertyDescriptorImpl]

'Test' @ [251:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeDummyTransaction' @ [253:19] ==> private final fun makeDummyTransaction(): LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests[SimpleFunctionDescriptorImpl]

'ltx' @ [254:24] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find Input Tests`[LocalVariableDescriptor]

'findInput' @ [254:28] ==> public final fun <T : ContractState> findInput(clazz: Class<LedgerTransactionQueryTests.IntTypeDummyState>, predicate: Predicate<LedgerTransactionQueryTests.IntTypeDummyState>): LedgerTransactionQueryTests.IntTypeDummyState defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> IntTypeDummyState

'IntTypeDummyState' @ [254:38] ==> public constructor IntTypeDummyState(data: Int) defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[ClassConstructorDescriptorImpl]

'java' @ [254:63] ==> public val <T> KClass<LedgerTransactionQueryTests.IntTypeDummyState>.java: Class<LedgerTransactionQueryTests.IntTypeDummyState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IntTypeDummyState

'Predicate' @ [254:69] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (LedgerTransactionQueryTests.IntTypeDummyState) -> Boolean): Predicate<LedgerTransactionQueryTests.IntTypeDummyState> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> IntTypeDummyState

'it' @ [254:81] ==> value-parameter it: LedgerTransactionQueryTests.IntTypeDummyState defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find Input Tests`.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [254:84] ==> public final val data: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [255:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: ContractState, actual: ContractState, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> ContractState

'ltx' @ [255:22] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find Input Tests`[LocalVariableDescriptor]

'getInput' @ [255:26] ==> public final fun getInput(index: Int): ContractState defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]

'intState' @ [255:39] ==> val intState: LedgerTransactionQueryTests.IntTypeDummyState defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find Input Tests`[LocalVariableDescriptor]

'ltx' @ [256:49] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find Input Tests`[LocalVariableDescriptor]

'findInput' @ [256:53] ==> public final inline fun <reified T : ContractState> findInput(crossinline predicate: (LedgerTransactionQueryTests.StringTypeDummyState) -> Boolean): LedgerTransactionQueryTests.StringTypeDummyState defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> StringTypeDummyState

'it' @ [256:65] ==> value-parameter it: LedgerTransactionQueryTests.StringTypeDummyState defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find Input Tests`.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [256:68] ==> public final val data: String defined in net.corda.core.contracts.LedgerTransactionQueryTests.StringTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [257:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: ContractState, actual: ContractState, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> ContractState

'ltx' @ [257:22] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find Input Tests`[LocalVariableDescriptor]

'getInput' @ [257:26] ==> public final fun getInput(index: Int): ContractState defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]

'stringState' @ [257:39] ==> val stringState: LedgerTransactionQueryTests.StringTypeDummyState defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find Input Tests`[LocalVariableDescriptor]

'Test' @ [260:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeDummyTransaction' @ [262:19] ==> private final fun makeDummyTransaction(): LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests[SimpleFunctionDescriptorImpl]

'ltx' @ [263:24] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find InRef Tests`[LocalVariableDescriptor]

'findInRef' @ [263:28] ==> public final fun <T : ContractState> findInRef(clazz: Class<LedgerTransactionQueryTests.IntTypeDummyState>, predicate: Predicate<LedgerTransactionQueryTests.IntTypeDummyState>): StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> IntTypeDummyState

'IntTypeDummyState' @ [263:38] ==> public constructor IntTypeDummyState(data: Int) defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[ClassConstructorDescriptorImpl]

'java' @ [263:63] ==> public val <T> KClass<LedgerTransactionQueryTests.IntTypeDummyState>.java: Class<LedgerTransactionQueryTests.IntTypeDummyState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IntTypeDummyState

'Predicate' @ [263:69] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (LedgerTransactionQueryTests.IntTypeDummyState) -> Boolean): Predicate<LedgerTransactionQueryTests.IntTypeDummyState> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> IntTypeDummyState

'it' @ [263:81] ==> value-parameter it: LedgerTransactionQueryTests.IntTypeDummyState defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find InRef Tests`.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [263:84] ==> public final val data: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [264:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>, actual: StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> StateAndRef<IntTypeDummyState>

'ltx' @ [264:22] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find InRef Tests`[LocalVariableDescriptor]

'inRef' @ [264:26] ==> public final fun <T : ContractState> inRef(index: Int): StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> IntTypeDummyState

'intState' @ [264:36] ==> val intState: StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find InRef Tests`[LocalVariableDescriptor]

'ltx' @ [265:62] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find InRef Tests`[LocalVariableDescriptor]

'findInRef' @ [265:66] ==> public final inline fun <reified T : ContractState> findInRef(crossinline predicate: (LedgerTransactionQueryTests.StringTypeDummyState) -> Boolean): StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> StringTypeDummyState

'it' @ [265:78] ==> value-parameter it: LedgerTransactionQueryTests.StringTypeDummyState defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find InRef Tests`.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [265:81] ==> public final val data: String defined in net.corda.core.contracts.LedgerTransactionQueryTests.StringTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [266:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>, actual: StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> StateAndRef<StringTypeDummyState>

'ltx' @ [266:22] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find InRef Tests`[LocalVariableDescriptor]

'inRef' @ [266:26] ==> public final fun <T : ContractState> inRef(index: Int): StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> StringTypeDummyState

'stringState' @ [266:36] ==> val stringState: StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find InRef Tests`[LocalVariableDescriptor]

'Test' @ [269:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeDummyTransaction' @ [271:19] ==> private final fun makeDummyTransaction(): LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests[SimpleFunctionDescriptorImpl]

'ltx' @ [272:24] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find Output Tests`[LocalVariableDescriptor]

'findOutput' @ [272:28] ==> public final fun <T : ContractState> findOutput(clazz: Class<LedgerTransactionQueryTests.IntTypeDummyState>, predicate: Predicate<LedgerTransactionQueryTests.IntTypeDummyState>): LedgerTransactionQueryTests.IntTypeDummyState defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> IntTypeDummyState

'IntTypeDummyState' @ [272:39] ==> public constructor IntTypeDummyState(data: Int) defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[ClassConstructorDescriptorImpl]

'java' @ [272:64] ==> public val <T> KClass<LedgerTransactionQueryTests.IntTypeDummyState>.java: Class<LedgerTransactionQueryTests.IntTypeDummyState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IntTypeDummyState

'Predicate' @ [272:70] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (LedgerTransactionQueryTests.IntTypeDummyState) -> Boolean): Predicate<LedgerTransactionQueryTests.IntTypeDummyState> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> IntTypeDummyState

'it' @ [272:82] ==> value-parameter it: LedgerTransactionQueryTests.IntTypeDummyState defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find Output Tests`.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [272:85] ==> public final val data: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [273:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: ContractState, actual: ContractState, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> ContractState

'ltx' @ [273:22] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find Output Tests`[LocalVariableDescriptor]

'getOutput' @ [273:26] ==> public final fun getOutput(index: Int): ContractState defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]

'intState' @ [273:40] ==> val intState: LedgerTransactionQueryTests.IntTypeDummyState defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find Output Tests`[LocalVariableDescriptor]

'ltx' @ [274:49] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find Output Tests`[LocalVariableDescriptor]

'findOutput' @ [274:53] ==> public final inline fun <reified T : ContractState> findOutput(crossinline predicate: (LedgerTransactionQueryTests.StringTypeDummyState) -> Boolean): LedgerTransactionQueryTests.StringTypeDummyState defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> StringTypeDummyState

'it' @ [274:66] ==> value-parameter it: LedgerTransactionQueryTests.StringTypeDummyState defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find Output Tests`.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [274:69] ==> public final val data: String defined in net.corda.core.contracts.LedgerTransactionQueryTests.StringTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [275:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: ContractState, actual: ContractState, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> ContractState

'ltx' @ [275:22] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find Output Tests`[LocalVariableDescriptor]

'getOutput' @ [275:26] ==> public final fun getOutput(index: Int): ContractState defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]

'stringState' @ [275:40] ==> val stringState: LedgerTransactionQueryTests.StringTypeDummyState defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find Output Tests`[LocalVariableDescriptor]

'Test' @ [278:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeDummyTransaction' @ [280:19] ==> private final fun makeDummyTransaction(): LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests[SimpleFunctionDescriptorImpl]

'ltx' @ [281:24] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find OutRef Tests`[LocalVariableDescriptor]

'findOutRef' @ [281:28] ==> public final fun <T : ContractState> findOutRef(clazz: Class<LedgerTransactionQueryTests.IntTypeDummyState>, predicate: Predicate<LedgerTransactionQueryTests.IntTypeDummyState>): StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> IntTypeDummyState

'IntTypeDummyState' @ [281:39] ==> public constructor IntTypeDummyState(data: Int) defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[ClassConstructorDescriptorImpl]

'java' @ [281:64] ==> public val <T> KClass<LedgerTransactionQueryTests.IntTypeDummyState>.java: Class<LedgerTransactionQueryTests.IntTypeDummyState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IntTypeDummyState

'Predicate' @ [281:70] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (LedgerTransactionQueryTests.IntTypeDummyState) -> Boolean): Predicate<LedgerTransactionQueryTests.IntTypeDummyState> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> IntTypeDummyState

'it' @ [281:82] ==> value-parameter it: LedgerTransactionQueryTests.IntTypeDummyState defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find OutRef Tests`.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [281:85] ==> public final val data: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.IntTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [282:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>, actual: StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> StateAndRef<IntTypeDummyState>

'ltx' @ [282:22] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find OutRef Tests`[LocalVariableDescriptor]

'outRef' @ [282:26] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> IntTypeDummyState

'intState' @ [282:37] ==> val intState: StateAndRef<LedgerTransactionQueryTests.IntTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find OutRef Tests`[LocalVariableDescriptor]

'ltx' @ [283:62] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find OutRef Tests`[LocalVariableDescriptor]

'findOutRef' @ [283:66] ==> public final inline fun <reified T : ContractState> findOutRef(crossinline predicate: (LedgerTransactionQueryTests.StringTypeDummyState) -> Boolean): StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> StringTypeDummyState

'it' @ [283:79] ==> value-parameter it: LedgerTransactionQueryTests.StringTypeDummyState defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find OutRef Tests`.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [283:82] ==> public final val data: String defined in net.corda.core.contracts.LedgerTransactionQueryTests.StringTypeDummyState[PropertyDescriptorImpl]

'assertEquals' @ [284:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>, actual: StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> StateAndRef<StringTypeDummyState>

'ltx' @ [284:22] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find OutRef Tests`[LocalVariableDescriptor]

'outRef' @ [284:26] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> StringTypeDummyState

'stringState' @ [284:37] ==> val stringState: StateAndRef<LedgerTransactionQueryTests.StringTypeDummyState> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find OutRef Tests`[LocalVariableDescriptor]

'Test' @ [287:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeDummyTransaction' @ [289:19] ==> private final fun makeDummyTransaction(): LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests[SimpleFunctionDescriptorImpl]

'ltx' @ [290:23] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find Commands Tests`[LocalVariableDescriptor]

'findCommand' @ [290:27] ==> public final fun <T : CommandData> findCommand(clazz: Class<LedgerTransactionQueryTests.Commands.Cmd1>, predicate: Predicate<LedgerTransactionQueryTests.Commands.Cmd1>): Command<LedgerTransactionQueryTests.Commands.Cmd1> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : CommandData> -> Cmd1

'Cmd1' @ [290:48] ==> public constructor Cmd1(id: Int) defined in net.corda.core.contracts.LedgerTransactionQueryTests.Commands.Cmd1[ClassConstructorDescriptorImpl]

'java' @ [290:60] ==> public val <T> KClass<LedgerTransactionQueryTests.Commands.Cmd1>.java: Class<LedgerTransactionQueryTests.Commands.Cmd1> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Cmd1

'Predicate' @ [290:66] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (LedgerTransactionQueryTests.Commands.Cmd1) -> Boolean): Predicate<LedgerTransactionQueryTests.Commands.Cmd1> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> Cmd1

'it' @ [290:78] ==> value-parameter it: LedgerTransactionQueryTests.Commands.Cmd1 defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find Commands Tests`.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [290:81] ==> public final val id: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.Commands.Cmd1[PropertyDescriptorImpl]

'assertEquals' @ [291:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Command<LedgerTransactionQueryTests.Commands.Cmd1>, actual: Command<LedgerTransactionQueryTests.Commands.Cmd1>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Command<Cmd1>

'ltx' @ [291:22] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find Commands Tests`[LocalVariableDescriptor]

'getCommand' @ [291:26] ==> public final fun <T : CommandData> getCommand(index: Int): Command<LedgerTransactionQueryTests.Commands.Cmd1> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : CommandData> -> Cmd1

'intCmd1' @ [291:41] ==> val intCmd1: Command<LedgerTransactionQueryTests.Commands.Cmd1> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find Commands Tests`[LocalVariableDescriptor]

'ltx' @ [292:23] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find Commands Tests`[LocalVariableDescriptor]

'findCommand' @ [292:27] ==> public final inline fun <reified T : CommandData> findCommand(crossinline predicate: (LedgerTransactionQueryTests.Commands.Cmd2) -> Boolean): Command<LedgerTransactionQueryTests.Commands.Cmd2> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> Cmd2

'it' @ [292:56] ==> value-parameter it: LedgerTransactionQueryTests.Commands.Cmd2 defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find Commands Tests`.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [292:59] ==> public final val id: Int defined in net.corda.core.contracts.LedgerTransactionQueryTests.Commands.Cmd2[PropertyDescriptorImpl]

'assertEquals' @ [293:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Command<LedgerTransactionQueryTests.Commands.Cmd2>, actual: Command<LedgerTransactionQueryTests.Commands.Cmd2>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Command<Cmd2>

'ltx' @ [293:22] ==> val ltx: LedgerTransaction defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find Commands Tests`[LocalVariableDescriptor]

'getCommand' @ [293:26] ==> public final fun <T : CommandData> getCommand(index: Int): Command<LedgerTransactionQueryTests.Commands.Cmd2> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : CommandData> -> Cmd2

'intCmd2' @ [293:41] ==> val intCmd2: Command<LedgerTransactionQueryTests.Commands.Cmd2> defined in net.corda.core.contracts.LedgerTransactionQueryTests.`Find Commands Tests`[LocalVariableDescriptor]

