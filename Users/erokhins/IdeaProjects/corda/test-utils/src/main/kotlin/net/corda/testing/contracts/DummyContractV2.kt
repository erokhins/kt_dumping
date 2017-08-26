'DummyContractV2' @ [11:27] ==> public constructor DummyContractV2() defined in net.corda.testing.contracts.DummyContractV2[ClassConstructorDescriptorImpl]

'DummyContract' @ [18:35] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'java' @ [18:56] ==> public val <T> KClass<DummyContract>.java: Class<DummyContract> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DummyContract

'DUMMY_V2_PROGRAM_ID' @ [21:33] ==> public val DUMMY_V2_PROGRAM_ID: DummyContractV2 defined in net.corda.testing.contracts in file DummyContractV2.kt[PropertyDescriptorImpl]

'owners' @ [22:58] ==> public final val owners: List<AbstractParty> defined in net.corda.testing.contracts.DummyContractV2.State[PropertyDescriptorImpl]

'TypeOnlyCommandData' @ [26:24] ==> public constructor TypeOnlyCommandData() defined in net.corda.core.contracts.TypeOnlyCommandData[DeserializedClassConstructorDescriptor]

'TypeOnlyCommandData' @ [27:22] ==> public constructor TypeOnlyCommandData() defined in net.corda.core.contracts.TypeOnlyCommandData[DeserializedClassConstructorDescriptor]

'State' @ [31:16] ==> public constructor State(magicNumber: Int = ..., owners: List<AbstractParty>) defined in net.corda.testing.contracts.DummyContractV2.State[ClassConstructorDescriptorImpl]

'state' @ [31:22] ==> value-parameter state: DummyContract.State defined in net.corda.testing.contracts.DummyContractV2.upgrade[ValueParameterDescriptorImpl]

'magicNumber' @ [31:28] ==> public abstract val magicNumber: Int defined in net.corda.testing.contracts.DummyContract.State[PropertyDescriptorImpl]

'state' @ [31:41] ==> value-parameter state: DummyContract.State defined in net.corda.testing.contracts.DummyContractV2.upgrade[ValueParameterDescriptorImpl]

'participants' @ [31:47] ==> public abstract val participants: List<AbstractParty> defined in net.corda.testing.contracts.DummyContract.State[DeserializedPropertyDescriptor]

'tx' @ [35:13] ==> value-parameter tx: LedgerTransaction defined in net.corda.testing.contracts.DummyContractV2.verify[ValueParameterDescriptorImpl]

'commands' @ [35:16] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'any' @ [35:25] ==> public inline fun <T> Iterable<AuthenticatedObject<CommandData>>.any(predicate: (AuthenticatedObject<CommandData>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<CommandData>

'it' @ [35:31] ==> value-parameter it: AuthenticatedObject<CommandData> defined in net.corda.testing.contracts.DummyContractV2.verify.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [35:34] ==> public final val value: CommandData defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'ContractUpgradeFlow' @ [35:61] ==> public companion object defined in net.corda.core.flows.ContractUpgradeFlow[FakeCallableDescriptorForObject]

'verify' @ [35:81] ==> @JvmStatic public final fun verify(tx: LedgerTransaction): Unit defined in net.corda.core.flows.ContractUpgradeFlow.Companion[DeserializedSimpleFunctionDescriptor]

'tx' @ [35:88] ==> value-parameter tx: LedgerTransaction defined in net.corda.testing.contracts.DummyContractV2.verify[ValueParameterDescriptorImpl]

'states' @ [47:22] ==> value-parameter vararg states: StateAndRef<DummyContract.State> defined in net.corda.testing.contracts.DummyContractV2.generateUpgradeFromV1[ValueParameterDescriptorImpl]

'map' @ [47:29] ==> public inline fun <T, R> Array<out StateAndRef<DummyContract.State>>.map(transform: (StateAndRef<DummyContract.State>) -> Party): List<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>
    <R> -> Party

'it' @ [47:35] ==> value-parameter it: StateAndRef<DummyContract.State> defined in net.corda.testing.contracts.DummyContractV2.generateUpgradeFromV1.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [47:38] ==> public final val state: TransactionState<DummyContract.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'notary' @ [47:44] ==> public final val notary: Party defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'single' @ [47:53] ==> public fun <T> List<Party>.single(): Party defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'require' @ [48:9] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'states' @ [48:17] ==> value-parameter vararg states: StateAndRef<DummyContract.State> defined in net.corda.testing.contracts.DummyContractV2.generateUpgradeFromV1[ValueParameterDescriptorImpl]

'isNotEmpty' @ [48:24] ==> @InlineOnly public inline fun <T> Array<out StateAndRef<DummyContract.State>>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'states' @ [50:43] ==> value-parameter vararg states: StateAndRef<DummyContract.State> defined in net.corda.testing.contracts.DummyContractV2.generateUpgradeFromV1[ValueParameterDescriptorImpl]

'flatMap' @ [50:50] ==> public inline fun <T, R> Array<out StateAndRef<DummyContract.State>>.flatMap(transform: (StateAndRef<DummyContract.State>) -> Iterable<AbstractParty>): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>
    <R> -> AbstractParty

'it' @ [50:60] ==> value-parameter it: StateAndRef<DummyContract.State> defined in net.corda.testing.contracts.DummyContractV2.generateUpgradeFromV1.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [50:63] ==> public final val state: TransactionState<DummyContract.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [50:69] ==> public final val data: DummyContract.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'participants' @ [50:74] ==> public abstract val participants: List<AbstractParty> defined in net.corda.testing.contracts.DummyContract.State[DeserializedPropertyDescriptor]

'distinct' @ [50:89] ==> public fun <T> Iterable<AbstractParty>.distinct(): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'toSet' @ [50:100] ==> public fun <T> Iterable<AbstractParty>.toSet(): Set<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'Pair' @ [51:16] ==> public constructor Pair<out A, out B>(first: WireTransaction, second: Set<AbstractParty>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> WireTransaction
    <out B> -> Set<AbstractParty>

'TransactionBuilder' @ [51:21] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [51:40] ==> val notary: Party defined in net.corda.testing.contracts.DummyContractV2.generateUpgradeFromV1[LocalVariableDescriptor]

'apply' @ [51:48] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'states' @ [52:13] ==> value-parameter vararg states: StateAndRef<DummyContract.State> defined in net.corda.testing.contracts.DummyContractV2.generateUpgradeFromV1[ValueParameterDescriptorImpl]

'forEach' @ [52:20] ==> public inline fun <T> Array<out StateAndRef<DummyContract.State>>.forEach(action: (StateAndRef<DummyContract.State>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'addInputState' @ [53:17] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'it' @ [53:31] ==> value-parameter it: StateAndRef<DummyContract.State> defined in net.corda.testing.contracts.DummyContractV2.generateUpgradeFromV1.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'addOutputState' @ [54:17] ==> public final fun addOutputState(state: ContractState): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'upgrade' @ [54:32] ==> public open fun upgrade(state: DummyContract.State): DummyContractV2.State defined in net.corda.testing.contracts.DummyContractV2[SimpleFunctionDescriptorImpl]

'it' @ [54:40] ==> value-parameter it: StateAndRef<DummyContract.State> defined in net.corda.testing.contracts.DummyContractV2.generateUpgradeFromV1.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [54:43] ==> public final val state: TransactionState<DummyContract.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [54:49] ==> public final val data: DummyContract.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'addCommand' @ [55:17] ==> public final fun addCommand(data: CommandData, keys: List<PublicKey>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'UpgradeCommand' @ [55:28] ==> public constructor UpgradeCommand(upgradedContractClass: Class<out UpgradedContract<*, *>>) defined in net.corda.core.contracts.UpgradeCommand[DeserializedClassConstructorDescriptor]

'DUMMY_V2_PROGRAM_ID' @ [55:43] ==> public val DUMMY_V2_PROGRAM_ID: DummyContractV2 defined in net.corda.testing.contracts in file DummyContractV2.kt[PropertyDescriptorImpl]

'javaClass' @ [55:63] ==> public val <T : Any> DummyContractV2.javaClass: Class<DummyContractV2> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> DummyContractV2

'signees' @ [55:75] ==> val signees: Set<AbstractParty> defined in net.corda.testing.contracts.DummyContractV2.generateUpgradeFromV1[LocalVariableDescriptor]

'map' @ [55:83] ==> public inline fun <T, R> Iterable<AbstractParty>.map(transform: (AbstractParty) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> PublicKey

'it' @ [55:89] ==> value-parameter it: AbstractParty defined in net.corda.testing.contracts.DummyContractV2.generateUpgradeFromV1.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [55:92] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'toList' @ [55:104] ==> public fun <T> Iterable<PublicKey>.toList(): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'toWireTransaction' @ [57:11] ==> public final fun toWireTransaction(): WireTransaction defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'signees' @ [57:32] ==> val signees: Set<AbstractParty> defined in net.corda.testing.contracts.DummyContractV2.generateUpgradeFromV1[LocalVariableDescriptor]

