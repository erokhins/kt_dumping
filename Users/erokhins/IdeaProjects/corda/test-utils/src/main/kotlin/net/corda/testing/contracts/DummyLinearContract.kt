'tx' @ [21:22] ==> value-parameter tx: LedgerTransaction defined in net.corda.testing.contracts.DummyLinearContract.verify[ValueParameterDescriptorImpl]

'inputs' @ [21:25] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'map' @ [21:32] ==> public inline fun <T, R> Iterable<StateAndRef<ContractState>>.map(transform: (StateAndRef<ContractState>) -> ContractState): List<ContractState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>
    <R> -> ContractState

'it' @ [21:38] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.testing.contracts.DummyLinearContract.verify.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [21:41] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [21:47] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'filterIsInstance' @ [21:54] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<DummyLinearContract.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> State

'tx' @ [22:23] ==> value-parameter tx: LedgerTransaction defined in net.corda.testing.contracts.DummyLinearContract.verify[ValueParameterDescriptorImpl]

'outputs' @ [22:26] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'map' @ [22:34] ==> public inline fun <T, R> Iterable<TransactionState<ContractState>>.map(transform: (TransactionState<ContractState>) -> ContractState): List<ContractState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>
    <R> -> ContractState

'it' @ [22:40] ==> value-parameter it: TransactionState<ContractState> defined in net.corda.testing.contracts.DummyLinearContract.verify.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [22:43] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'filterIsInstance' @ [22:50] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<DummyLinearContract.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> State

'inputs' @ [24:24] ==> val inputs: List<DummyLinearContract.State> defined in net.corda.testing.contracts.DummyLinearContract.verify[LocalVariableDescriptor]

'map' @ [24:31] ==> public inline fun <T, R> Iterable<DummyLinearContract.State>.map(transform: (DummyLinearContract.State) -> UniqueIdentifier): List<UniqueIdentifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State
    <R> -> UniqueIdentifier

'it' @ [24:37] ==> value-parameter it: DummyLinearContract.State defined in net.corda.testing.contracts.DummyLinearContract.verify.<anonymous>[ValueParameterDescriptorImpl]

'linearId' @ [24:40] ==> public open val linearId: UniqueIdentifier defined in net.corda.testing.contracts.DummyLinearContract.State[PropertyDescriptorImpl]

'distinct' @ [24:51] ==> public fun <T> Iterable<UniqueIdentifier>.distinct(): List<UniqueIdentifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UniqueIdentifier

'outputs' @ [25:25] ==> val outputs: List<DummyLinearContract.State> defined in net.corda.testing.contracts.DummyLinearContract.verify[LocalVariableDescriptor]

'map' @ [25:33] ==> public inline fun <T, R> Iterable<DummyLinearContract.State>.map(transform: (DummyLinearContract.State) -> UniqueIdentifier): List<UniqueIdentifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State
    <R> -> UniqueIdentifier

'it' @ [25:39] ==> value-parameter it: DummyLinearContract.State defined in net.corda.testing.contracts.DummyLinearContract.verify.<anonymous>[ValueParameterDescriptorImpl]

'linearId' @ [25:42] ==> public open val linearId: UniqueIdentifier defined in net.corda.testing.contracts.DummyLinearContract.State[PropertyDescriptorImpl]

'distinct' @ [25:53] ==> public fun <T> Iterable<UniqueIdentifier>.distinct(): List<UniqueIdentifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UniqueIdentifier

'requireThat' @ [26:9] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [27:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'inputIds' @ [27:50] ==> val inputIds: List<UniqueIdentifier> defined in net.corda.testing.contracts.DummyLinearContract.verify[LocalVariableDescriptor]

'count' @ [27:59] ==> @InlineOnly public inline fun <T> Collection<UniqueIdentifier>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UniqueIdentifier

'inputs' @ [27:70] ==> val inputs: List<DummyLinearContract.State> defined in net.corda.testing.contracts.DummyLinearContract.verify[LocalVariableDescriptor]

'count' @ [27:77] ==> @InlineOnly public inline fun <T> Collection<DummyLinearContract.State>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'using' @ [28:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'outputIds' @ [28:49] ==> val outputIds: List<UniqueIdentifier> defined in net.corda.testing.contracts.DummyLinearContract.verify[LocalVariableDescriptor]

'count' @ [28:59] ==> @InlineOnly public inline fun <T> Collection<UniqueIdentifier>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UniqueIdentifier

'outputs' @ [28:70] ==> val outputs: List<DummyLinearContract.State> defined in net.corda.testing.contracts.DummyLinearContract.verify[LocalVariableDescriptor]

'count' @ [28:78] ==> @InlineOnly public inline fun <T> Collection<DummyLinearContract.State>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'UniqueIdentifier' @ [33:55] ==> public constructor UniqueIdentifier(externalId: String? = ..., id: UUID = ...) defined in net.corda.core.contracts.UniqueIdentifier[DeserializedClassConstructorDescriptor]

'DummyLinearContract' @ [34:47] ==> public constructor DummyLinearContract() defined in net.corda.testing.contracts.DummyLinearContract[ClassConstructorDescriptorImpl]

'listOf' @ [35:62] ==> @InlineOnly public inline fun <T> listOf(): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'now' @ [38:68] ==> public open fun now(): (LocalDateTime..LocalDateTime?) defined in java.time.LocalDateTime[JavaMethodDescriptor]

'toInstant' @ [38:74] ==> public open fun toInstant(p0: (ZoneOffset..ZoneOffset?)): (Instant..Instant?) defined in java.time.LocalDateTime[JavaMethodDescriptor]

'UTC' @ [38:84] ==> public final val UTC: (ZoneOffset..ZoneOffset?) defined in java.time.ZoneOffset[JavaPropertyDescriptor]

'SecureHash' @ [40:37] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'randomSHA256' @ [40:48] ==> @JvmStatic public final fun randomSHA256(): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'participants' @ [43:20] ==> public open val participants: List<AbstractParty> defined in net.corda.testing.contracts.DummyLinearContract.State[PropertyDescriptorImpl]

'any' @ [43:33] ==> public inline fun <T> Iterable<AbstractParty>.any(predicate: (AbstractParty) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'it' @ [43:39] ==> value-parameter it: AbstractParty defined in net.corda.testing.contracts.DummyLinearContract.State.isRelevant.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [43:42] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'containsAny' @ [43:52] ==> public fun PublicKey.containsAny(otherKeys: Iterable<PublicKey>): Boolean defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'ourKeys' @ [43:64] ==> value-parameter ourKeys: Set<PublicKey> defined in net.corda.testing.contracts.DummyLinearContract.State.isRelevant[ValueParameterDescriptorImpl]

'listOf' @ [46:67] ==> public fun <T> listOf(vararg elements: MappedSchema): List<MappedSchema> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MappedSchema

'DummyLinearStateSchemaV1' @ [46:74] ==> public object DummyLinearStateSchemaV1 : MappedSchema defined in net.corda.testing.schemas in file DummyLinearStateSchemaV1.kt[FakeCallableDescriptorForObject]

'DummyLinearStateSchemaV2' @ [46:100] ==> public object DummyLinearStateSchemaV2 : MappedSchema defined in net.corda.testing.schemas in file DummyLinearStateSchemaV2.kt[FakeCallableDescriptorForObject]

'when (schema) {
                is DummyLinearStateSchemaV1 -> DummyLinearStateSchemaV1.PersistentDummyLinearState(
                        participants = participants.toMutableSet(),
                        externalId = linearId.externalId,
                        uuid = linearId.id,
                        linearString = linearString,
                        linearNumber = linearNumber,
                        linearTimestamp = linearTimestamp,
                        linearBoolean = linearBoolean
                )
                is DummyLinearStateSchemaV2 -> DummyLinearStateSchemaV2.PersistentDummyLinearState(
                        _participants = participants.toSet(),
                        uid = linearId,
                        linearString = linearString,
                        linearNumber = linearNumber,
                        linearTimestamp = linearTimestamp,
                        linearBoolean = linearBoolean
                )
                else -> throw IllegalArgumentException("Unrecognised schema $schema")
            }' @ [49:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PersistentState, entry1: PersistentState, entry2: PersistentState): PersistentState[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PersistentState

'schema' @ [49:26] ==> value-parameter schema: MappedSchema defined in net.corda.testing.contracts.DummyLinearContract.State.generateMappedObject[ValueParameterDescriptorImpl]

'DummyLinearStateSchemaV1' @ [50:48] ==> public object DummyLinearStateSchemaV1 : MappedSchema defined in net.corda.testing.schemas in file DummyLinearStateSchemaV1.kt[FakeCallableDescriptorForObject]

'PersistentDummyLinearState' @ [50:73] ==> public constructor PersistentDummyLinearState(participants: MutableSet<AbstractParty>, externalId: String?, uuid: UUID, linearString: String, linearNumber: Long, linearTimestamp: Instant, linearBoolean: Boolean) defined in net.corda.testing.schemas.DummyLinearStateSchemaV1.PersistentDummyLinearState[ClassConstructorDescriptorImpl]

'participants' @ [51:40] ==> public open val participants: List<AbstractParty> defined in net.corda.testing.contracts.DummyLinearContract.State[PropertyDescriptorImpl]

'toMutableSet' @ [51:53] ==> public fun <T> Iterable<AbstractParty>.toMutableSet(): MutableSet<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'linearId' @ [52:38] ==> public open val linearId: UniqueIdentifier defined in net.corda.testing.contracts.DummyLinearContract.State[PropertyDescriptorImpl]

'externalId' @ [52:47] ==> public final val externalId: String? defined in net.corda.core.contracts.UniqueIdentifier[DeserializedPropertyDescriptor]

'linearId' @ [53:32] ==> public open val linearId: UniqueIdentifier defined in net.corda.testing.contracts.DummyLinearContract.State[PropertyDescriptorImpl]

'id' @ [53:41] ==> public final val id: UUID defined in net.corda.core.contracts.UniqueIdentifier[DeserializedPropertyDescriptor]

'linearString' @ [54:40] ==> public final val linearString: String defined in net.corda.testing.contracts.DummyLinearContract.State[PropertyDescriptorImpl]

'linearNumber' @ [55:40] ==> public final val linearNumber: Long defined in net.corda.testing.contracts.DummyLinearContract.State[PropertyDescriptorImpl]

'linearTimestamp' @ [56:43] ==> public final val linearTimestamp: Instant defined in net.corda.testing.contracts.DummyLinearContract.State[PropertyDescriptorImpl]

'linearBoolean' @ [57:41] ==> public final val linearBoolean: Boolean defined in net.corda.testing.contracts.DummyLinearContract.State[PropertyDescriptorImpl]

'DummyLinearStateSchemaV2' @ [59:48] ==> public object DummyLinearStateSchemaV2 : MappedSchema defined in net.corda.testing.schemas in file DummyLinearStateSchemaV2.kt[FakeCallableDescriptorForObject]

'PersistentDummyLinearState' @ [59:73] ==> public constructor PersistentDummyLinearState(linearString: String, linearNumber: Long, linearTimestamp: Instant, linearBoolean: Boolean, _participants: Set<AbstractParty>, uid: UniqueIdentifier) defined in net.corda.testing.schemas.DummyLinearStateSchemaV2.PersistentDummyLinearState[ClassConstructorDescriptorImpl]

'participants' @ [60:41] ==> public open val participants: List<AbstractParty> defined in net.corda.testing.contracts.DummyLinearContract.State[PropertyDescriptorImpl]

'toSet' @ [60:54] ==> public fun <T> Iterable<AbstractParty>.toSet(): Set<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'linearId' @ [61:31] ==> public open val linearId: UniqueIdentifier defined in net.corda.testing.contracts.DummyLinearContract.State[PropertyDescriptorImpl]

'linearString' @ [62:40] ==> public final val linearString: String defined in net.corda.testing.contracts.DummyLinearContract.State[PropertyDescriptorImpl]

'linearNumber' @ [63:40] ==> public final val linearNumber: Long defined in net.corda.testing.contracts.DummyLinearContract.State[PropertyDescriptorImpl]

'linearTimestamp' @ [64:43] ==> public final val linearTimestamp: Instant defined in net.corda.testing.contracts.DummyLinearContract.State[PropertyDescriptorImpl]

'linearBoolean' @ [65:41] ==> public final val linearBoolean: Boolean defined in net.corda.testing.contracts.DummyLinearContract.State[PropertyDescriptorImpl]

'IllegalArgumentException' @ [67:31] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'schema' @ [67:78] ==> value-parameter schema: MappedSchema defined in net.corda.testing.contracts.DummyLinearContract.State.generateMappedObject[ValueParameterDescriptorImpl]

