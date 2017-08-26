'Test' @ [16:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'DummyContractV2' @ [18:31] ==> public constructor DummyContractV2() defined in net.corda.testing.contracts.DummyContractV2[DeserializedClassConstructorDescriptor]

'TransactionState' @ [19:23] ==> @JvmOverloads public constructor TransactionState<out T : ContractState>(data: DummyContract.SingleOwnerState, notary: Party, encumbrance: Int? = ...) defined in net.corda.core.contracts.TransactionState[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> SingleOwnerState

'DummyContract' @ [19:40] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'SingleOwnerState' @ [19:54] ==> public constructor SingleOwnerState(magicNumber: Int = ..., owner: AbstractParty) defined in net.corda.testing.contracts.DummyContract.SingleOwnerState[DeserializedClassConstructorDescriptor]

'ALICE' @ [19:74] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [19:82] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'StateRef' @ [20:21] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[DeserializedClassConstructorDescriptor]

'SecureHash' @ [20:30] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'randomSHA256' @ [20:41] ==> @JvmStatic public final fun randomSHA256(): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'StateAndRef' @ [21:29] ==> public constructor StateAndRef<out T : ContractState>(state: TransactionState<DummyContract.SingleOwnerState>, ref: StateRef) defined in net.corda.core.contracts.StateAndRef[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> SingleOwnerState

'v1State' @ [21:41] ==> val v1State: TransactionState<DummyContract.SingleOwnerState> defined in net.corda.core.contracts.DummyContractV2Tests.`upgrade from v1`[LocalVariableDescriptor]

'v1Ref' @ [21:50] ==> val v1Ref: StateRef defined in net.corda.core.contracts.DummyContractV2Tests.`upgrade from v1`[LocalVariableDescriptor]

'component1' @ [22:14] ==> public final operator fun component1(): WireTransaction defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [22:18] ==> public final operator fun component2(): Set<AbstractParty> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'DummyContractV2' @ [22:23] ==> public constructor DummyContractV2() defined in net.corda.testing.contracts.DummyContractV2[DeserializedClassConstructorDescriptor]

'generateUpgradeFromV1' @ [22:41] ==> public final fun generateUpgradeFromV1(vararg states: StateAndRef<DummyContract.State>): Pair<WireTransaction, Set<AbstractParty>> defined in net.corda.testing.contracts.DummyContractV2[DeserializedSimpleFunctionDescriptor]

'v1StateAndRef' @ [22:63] ==> val v1StateAndRef: StateAndRef<DummyContract.SingleOwnerState> defined in net.corda.core.contracts.DummyContractV2Tests.`upgrade from v1`[LocalVariableDescriptor]

'assertEquals' @ [24:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: StateRef, actual: StateRef, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> StateRef

'v1Ref' @ [24:22] ==> val v1Ref: StateRef defined in net.corda.core.contracts.DummyContractV2Tests.`upgrade from v1`[LocalVariableDescriptor]

'tx' @ [24:29] ==> val tx: WireTransaction defined in net.corda.core.contracts.DummyContractV2Tests.`upgrade from v1`[LocalVariableDescriptor]

'inputs' @ [24:32] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'single' @ [24:39] ==> public fun <T> List<StateRef>.single(): StateRef defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'TransactionState' @ [26:30] ==> @JvmOverloads public constructor TransactionState<out T : ContractState>(data: DummyContractV2.State, notary: Party, encumbrance: Int? = ...) defined in net.corda.core.contracts.TransactionState[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> State

'contractUpgrade' @ [26:47] ==> val contractUpgrade: DummyContractV2 defined in net.corda.core.contracts.DummyContractV2Tests.`upgrade from v1`[LocalVariableDescriptor]

'upgrade' @ [26:63] ==> public open fun upgrade(state: DummyContract.State): DummyContractV2.State defined in net.corda.testing.contracts.DummyContractV2[DeserializedSimpleFunctionDescriptor]

'v1State' @ [26:71] ==> val v1State: TransactionState<DummyContract.SingleOwnerState> defined in net.corda.core.contracts.DummyContractV2Tests.`upgrade from v1`[LocalVariableDescriptor]

'data' @ [26:79] ==> public final val data: DummyContract.SingleOwnerState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [26:86] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'tx' @ [27:28] ==> val tx: WireTransaction defined in net.corda.core.contracts.DummyContractV2Tests.`upgrade from v1`[LocalVariableDescriptor]

'outputs' @ [27:31] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'single' @ [27:39] ==> public fun <T> List<TransactionState<ContractState>>.single(): TransactionState<ContractState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>

'assertEquals' @ [28:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: TransactionState<ContractState>, actual: TransactionState<ContractState>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> TransactionState<ContractState>

'expectedOutput' @ [28:22] ==> val expectedOutput: TransactionState<DummyContractV2.State> defined in net.corda.core.contracts.DummyContractV2Tests.`upgrade from v1`[LocalVariableDescriptor]

'actualOutput' @ [28:38] ==> val actualOutput: TransactionState<ContractState> defined in net.corda.core.contracts.DummyContractV2Tests.`upgrade from v1`[LocalVariableDescriptor]

'tx' @ [30:29] ==> val tx: WireTransaction defined in net.corda.core.contracts.DummyContractV2Tests.`upgrade from v1`[LocalVariableDescriptor]

'commands' @ [30:32] ==> public open val commands: List<Command<*>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'map' @ [30:41] ==> public inline fun <T, R> Iterable<Command<*>>.map(transform: (Command<*>) -> CommandData): List<CommandData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<*>
    <R> -> CommandData

'it' @ [30:47] ==> value-parameter it: Command<*> defined in net.corda.core.contracts.DummyContractV2Tests.`upgrade from v1`.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [30:50] ==> public final val value: CommandData defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'single' @ [30:58] ==> public fun <T> List<CommandData>.single(): CommandData defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CommandData

'assertTrue' @ [31:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'==' @ [31:20] ==> public open fun equals(other: Any?): Boolean defined in java.lang.Class[DeserializedSimpleFunctionDescriptor]

'actualCommand' @ [31:21] ==> val actualCommand: CommandData defined in net.corda.core.contracts.DummyContractV2Tests.`upgrade from v1`[LocalVariableDescriptor]

'upgradedContractClass' @ [31:54] ==> public final val upgradedContractClass: Class<out UpgradedContract<*, *>> defined in net.corda.core.contracts.UpgradeCommand[DeserializedPropertyDescriptor]

'DummyContractV2' @ [31:79] ==> public constructor DummyContractV2() defined in net.corda.testing.contracts.DummyContractV2[DeserializedClassConstructorDescriptor]

'java' @ [31:102] ==> public val <T> KClass<DummyContractV2>.java: Class<DummyContractV2> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DummyContractV2

