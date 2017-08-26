'TestDependencyInjectionBase' @ [15:37] ==> public constructor TestDependencyInjectionBase() defined in net.corda.testing.TestDependencyInjectionBase[DeserializedClassConstructorDescriptor]

'MockTransactionStorage' @ [16:102] ==> public constructor MockTransactionStorage() defined in net.corda.testing.node.MockTransactionStorage[DeserializedClassConstructorDescriptor]

'addTransaction' @ [18:13] ==> public open fun addTransaction(transaction: SignedTransaction): Boolean defined in net.corda.core.contracts.TransactionGraphSearchTests.GraphTransactionStorage[DeserializedSimpleFunctionDescriptor]

'originTx' @ [18:28] ==> public final val originTx: SignedTransaction defined in net.corda.core.contracts.TransactionGraphSearchTests.GraphTransactionStorage[PropertyDescriptorImpl]

'addTransaction' @ [19:13] ==> public open fun addTransaction(transaction: SignedTransaction): Boolean defined in net.corda.core.contracts.TransactionGraphSearchTests.GraphTransactionStorage[DeserializedSimpleFunctionDescriptor]

'inputTx' @ [19:28] ==> public final val inputTx: SignedTransaction defined in net.corda.core.contracts.TransactionGraphSearchTests.GraphTransactionStorage[PropertyDescriptorImpl]

'abs' @ [23:40] ==> public open fun abs(p0: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'newSecureRandom' @ [23:44] ==> public fun newSecureRandom(): SecureRandom defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'nextInt' @ [23:62] ==> public open fun nextInt(): Int defined in java.security.SecureRandom[JavaMethodDescriptor]

'MockServices' @ [33:32] ==> public constructor MockServices(vararg keys: KeyPair) defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'MEGA_CORP_KEY' @ [33:45] ==> public val MEGA_CORP_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'MockServices' @ [34:30] ==> public constructor MockServices(vararg keys: KeyPair) defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY_KEY' @ [34:43] ==> public val DUMMY_NOTARY_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'TransactionBuilder' @ [36:29] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [36:48] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'addOutputState' @ [37:18] ==> public final fun addOutputState(state: ContractState): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'DummyState' @ [37:33] ==> public constructor DummyState(magicNumber: Int = ...) defined in net.corda.testing.contracts.DummyState[DeserializedClassConstructorDescriptor]

'random31BitValue' @ [37:44] ==> public final fun random31BitValue(): Int defined in net.corda.core.contracts.TransactionGraphSearchTests[SimpleFunctionDescriptorImpl]

'addCommand' @ [38:18] ==> public final fun addCommand(data: CommandData, vararg keys: PublicKey): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'command' @ [38:29] ==> value-parameter command: CommandData defined in net.corda.core.contracts.TransactionGraphSearchTests.buildTransactions[ValueParameterDescriptorImpl]

'MEGA_CORP_PUBKEY' @ [38:38] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'megaCorpServices' @ [40:25] ==> val megaCorpServices: MockServices defined in net.corda.core.contracts.TransactionGraphSearchTests.buildTransactions[LocalVariableDescriptor]

'signInitialTransaction' @ [40:42] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'originBuilder' @ [40:65] ==> val originBuilder: TransactionBuilder defined in net.corda.core.contracts.TransactionGraphSearchTests.buildTransactions[LocalVariableDescriptor]

'notaryServices' @ [41:24] ==> val notaryServices: MockServices defined in net.corda.core.contracts.TransactionGraphSearchTests.buildTransactions[LocalVariableDescriptor]

'addSignature' @ [41:39] ==> public open fun addSignature(signedTransaction: SignedTransaction): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'originPtx' @ [41:52] ==> val originPtx: SignedTransaction defined in net.corda.core.contracts.TransactionGraphSearchTests.buildTransactions[LocalVariableDescriptor]

'TransactionBuilder' @ [43:28] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [43:47] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'addInputState' @ [44:18] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'originTx' @ [44:32] ==> val originTx: SignedTransaction defined in net.corda.core.contracts.TransactionGraphSearchTests.buildTransactions[LocalVariableDescriptor]

'tx' @ [44:41] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [44:44] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<DummyState> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> DummyState

'addCommand' @ [45:18] ==> public final fun addCommand(arg: Command<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'dummyCommand' @ [45:29] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [45:42] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'megaCorpServices' @ [47:24] ==> val megaCorpServices: MockServices defined in net.corda.core.contracts.TransactionGraphSearchTests.buildTransactions[LocalVariableDescriptor]

'signInitialTransaction' @ [47:41] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'inputBuilder' @ [47:64] ==> val inputBuilder: TransactionBuilder defined in net.corda.core.contracts.TransactionGraphSearchTests.buildTransactions[LocalVariableDescriptor]

'megaCorpServices' @ [48:23] ==> val megaCorpServices: MockServices defined in net.corda.core.contracts.TransactionGraphSearchTests.buildTransactions[LocalVariableDescriptor]

'addSignature' @ [48:40] ==> public open fun addSignature(signedTransaction: SignedTransaction): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'inputPtx' @ [48:53] ==> val inputPtx: SignedTransaction defined in net.corda.core.contracts.TransactionGraphSearchTests.buildTransactions[LocalVariableDescriptor]

'GraphTransactionStorage' @ [50:16] ==> public constructor GraphTransactionStorage(originTx: SignedTransaction, inputTx: SignedTransaction) defined in net.corda.core.contracts.TransactionGraphSearchTests.GraphTransactionStorage[ClassConstructorDescriptorImpl]

'originTx' @ [50:40] ==> val originTx: SignedTransaction defined in net.corda.core.contracts.TransactionGraphSearchTests.buildTransactions[LocalVariableDescriptor]

'inputTx' @ [50:50] ==> val inputTx: SignedTransaction defined in net.corda.core.contracts.TransactionGraphSearchTests.buildTransactions[LocalVariableDescriptor]

'Test' @ [53:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'buildTransactions' @ [55:23] ==> public final fun buildTransactions(command: CommandData): TransactionGraphSearchTests.GraphTransactionStorage defined in net.corda.core.contracts.TransactionGraphSearchTests[SimpleFunctionDescriptorImpl]

'DummyContract' @ [55:41] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'Create' @ [55:64] ==> public constructor Create() defined in net.corda.testing.contracts.DummyContract.Commands.Create[DeserializedClassConstructorDescriptor]

'TransactionGraphSearch' @ [56:22] ==> public constructor TransactionGraphSearch(transactions: TransactionStorage, startPoints: List<WireTransaction>) defined in net.corda.core.contracts.TransactionGraphSearch[DeserializedClassConstructorDescriptor]

'storage' @ [56:45] ==> val storage: TransactionGraphSearchTests.GraphTransactionStorage defined in net.corda.core.contracts.TransactionGraphSearchTests.`return empty from empty`[LocalVariableDescriptor]

'emptyList' @ [56:54] ==> public fun <T> emptyList(): List<WireTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransaction

'search' @ [57:9] ==> val search: TransactionGraphSearch defined in net.corda.core.contracts.TransactionGraphSearchTests.`return empty from empty`[LocalVariableDescriptor]

'query' @ [57:16] ==> public final var query: TransactionGraphSearch.Query defined in net.corda.core.contracts.TransactionGraphSearch[DeserializedPropertyDescriptor]

'Query' @ [57:47] ==> public constructor Query(withCommandOfType: Class<out CommandData>? = ..., followInputsOfType: Class<out ContractState>? = ...) defined in net.corda.core.contracts.TransactionGraphSearch.Query[DeserializedClassConstructorDescriptor]

'emptyList' @ [58:24] ==> public fun <T> emptyList(): List<WireTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransaction

'search' @ [59:22] ==> val search: TransactionGraphSearch defined in net.corda.core.contracts.TransactionGraphSearchTests.`return empty from empty`[LocalVariableDescriptor]

'call' @ [59:29] ==> public open fun call(): List<WireTransaction> defined in net.corda.core.contracts.TransactionGraphSearch[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [61:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<WireTransaction>, actual: List<WireTransaction>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<WireTransaction>

'expected' @ [61:22] ==> val expected: List<WireTransaction> defined in net.corda.core.contracts.TransactionGraphSearchTests.`return empty from empty`[LocalVariableDescriptor]

'actual' @ [61:32] ==> val actual: List<WireTransaction> defined in net.corda.core.contracts.TransactionGraphSearchTests.`return empty from empty`[LocalVariableDescriptor]

'Test' @ [64:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'buildTransactions' @ [66:23] ==> public final fun buildTransactions(command: CommandData): TransactionGraphSearchTests.GraphTransactionStorage defined in net.corda.core.contracts.TransactionGraphSearchTests[SimpleFunctionDescriptorImpl]

'DummyContract' @ [66:41] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'Create' @ [66:64] ==> public constructor Create() defined in net.corda.testing.contracts.DummyContract.Commands.Create[DeserializedClassConstructorDescriptor]

'TransactionGraphSearch' @ [67:22] ==> public constructor TransactionGraphSearch(transactions: TransactionStorage, startPoints: List<WireTransaction>) defined in net.corda.core.contracts.TransactionGraphSearch[DeserializedClassConstructorDescriptor]

'storage' @ [67:45] ==> val storage: TransactionGraphSearchTests.GraphTransactionStorage defined in net.corda.core.contracts.TransactionGraphSearchTests.`return empty from no match`[LocalVariableDescriptor]

'listOf' @ [67:54] ==> public fun <T> listOf(element: WireTransaction): List<WireTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransaction

'storage' @ [67:61] ==> val storage: TransactionGraphSearchTests.GraphTransactionStorage defined in net.corda.core.contracts.TransactionGraphSearchTests.`return empty from no match`[LocalVariableDescriptor]

'inputTx' @ [67:69] ==> public final val inputTx: SignedTransaction defined in net.corda.core.contracts.TransactionGraphSearchTests.GraphTransactionStorage[PropertyDescriptorImpl]

'tx' @ [67:77] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'search' @ [68:9] ==> val search: TransactionGraphSearch defined in net.corda.core.contracts.TransactionGraphSearchTests.`return empty from no match`[LocalVariableDescriptor]

'query' @ [68:16] ==> public final var query: TransactionGraphSearch.Query defined in net.corda.core.contracts.TransactionGraphSearch[DeserializedPropertyDescriptor]

'Query' @ [68:47] ==> public constructor Query(withCommandOfType: Class<out CommandData>? = ..., followInputsOfType: Class<out ContractState>? = ...) defined in net.corda.core.contracts.TransactionGraphSearch.Query[DeserializedClassConstructorDescriptor]

'emptyList' @ [69:24] ==> public fun <T> emptyList(): List<WireTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransaction

'search' @ [70:22] ==> val search: TransactionGraphSearch defined in net.corda.core.contracts.TransactionGraphSearchTests.`return empty from no match`[LocalVariableDescriptor]

'call' @ [70:29] ==> public open fun call(): List<WireTransaction> defined in net.corda.core.contracts.TransactionGraphSearch[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [72:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<WireTransaction>, actual: List<WireTransaction>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<WireTransaction>

'expected' @ [72:22] ==> val expected: List<WireTransaction> defined in net.corda.core.contracts.TransactionGraphSearchTests.`return empty from no match`[LocalVariableDescriptor]

'actual' @ [72:32] ==> val actual: List<WireTransaction> defined in net.corda.core.contracts.TransactionGraphSearchTests.`return empty from no match`[LocalVariableDescriptor]

'Test' @ [75:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'buildTransactions' @ [77:23] ==> public final fun buildTransactions(command: CommandData): TransactionGraphSearchTests.GraphTransactionStorage defined in net.corda.core.contracts.TransactionGraphSearchTests[SimpleFunctionDescriptorImpl]

'DummyContract' @ [77:41] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'Create' @ [77:64] ==> public constructor Create() defined in net.corda.testing.contracts.DummyContract.Commands.Create[DeserializedClassConstructorDescriptor]

'TransactionGraphSearch' @ [78:22] ==> public constructor TransactionGraphSearch(transactions: TransactionStorage, startPoints: List<WireTransaction>) defined in net.corda.core.contracts.TransactionGraphSearch[DeserializedClassConstructorDescriptor]

'storage' @ [78:45] ==> val storage: TransactionGraphSearchTests.GraphTransactionStorage defined in net.corda.core.contracts.TransactionGraphSearchTests.`return origin on match`[LocalVariableDescriptor]

'listOf' @ [78:54] ==> public fun <T> listOf(element: WireTransaction): List<WireTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransaction

'storage' @ [78:61] ==> val storage: TransactionGraphSearchTests.GraphTransactionStorage defined in net.corda.core.contracts.TransactionGraphSearchTests.`return origin on match`[LocalVariableDescriptor]

'inputTx' @ [78:69] ==> public final val inputTx: SignedTransaction defined in net.corda.core.contracts.TransactionGraphSearchTests.GraphTransactionStorage[PropertyDescriptorImpl]

'tx' @ [78:77] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'search' @ [79:9] ==> val search: TransactionGraphSearch defined in net.corda.core.contracts.TransactionGraphSearchTests.`return origin on match`[LocalVariableDescriptor]

'query' @ [79:16] ==> public final var query: TransactionGraphSearch.Query defined in net.corda.core.contracts.TransactionGraphSearch[DeserializedPropertyDescriptor]

'Query' @ [79:47] ==> public constructor Query(withCommandOfType: Class<out CommandData>? = ..., followInputsOfType: Class<out ContractState>? = ...) defined in net.corda.core.contracts.TransactionGraphSearch.Query[DeserializedClassConstructorDescriptor]

'DummyContract' @ [79:53] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'Create' @ [79:76] ==> public constructor Create() defined in net.corda.testing.contracts.DummyContract.Commands.Create[DeserializedClassConstructorDescriptor]

'java' @ [79:90] ==> public val <T> KClass<DummyContract.Commands.Create>.java: Class<DummyContract.Commands.Create> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Create

'listOf' @ [80:24] ==> public fun <T> listOf(element: WireTransaction): List<WireTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransaction

'storage' @ [80:31] ==> val storage: TransactionGraphSearchTests.GraphTransactionStorage defined in net.corda.core.contracts.TransactionGraphSearchTests.`return origin on match`[LocalVariableDescriptor]

'originTx' @ [80:39] ==> public final val originTx: SignedTransaction defined in net.corda.core.contracts.TransactionGraphSearchTests.GraphTransactionStorage[PropertyDescriptorImpl]

'tx' @ [80:48] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'search' @ [81:22] ==> val search: TransactionGraphSearch defined in net.corda.core.contracts.TransactionGraphSearchTests.`return origin on match`[LocalVariableDescriptor]

'call' @ [81:29] ==> public open fun call(): List<WireTransaction> defined in net.corda.core.contracts.TransactionGraphSearch[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [83:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<WireTransaction>, actual: List<WireTransaction>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<WireTransaction>

'expected' @ [83:22] ==> val expected: List<WireTransaction> defined in net.corda.core.contracts.TransactionGraphSearchTests.`return origin on match`[LocalVariableDescriptor]

'actual' @ [83:32] ==> val actual: List<WireTransaction> defined in net.corda.core.contracts.TransactionGraphSearchTests.`return origin on match`[LocalVariableDescriptor]

