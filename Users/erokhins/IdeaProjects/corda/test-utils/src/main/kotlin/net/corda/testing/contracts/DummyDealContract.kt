'DummyDealContract' @ [25:42] ==> public constructor DummyDealContract() defined in net.corda.testing.contracts.DummyDealContract[ClassConstructorDescriptorImpl]

'listOf' @ [26:57] ==> @InlineOnly public inline fun <T> listOf(): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'this' @ [27:36] ==> public constructor State(contract: Contract, participants: List<AbstractParty>, linearId: UniqueIdentifier) defined in net.corda.testing.contracts.DummyDealContract.State[ClassConstructorDescriptorImpl]

'contract' @ [27:41] ==> value-parameter contract: Contract = ... defined in net.corda.testing.contracts.DummyDealContract.State.<init>[ValueParameterDescriptorImpl]

'participants' @ [27:51] ==> value-parameter participants: List<AbstractParty> = ... defined in net.corda.testing.contracts.DummyDealContract.State.<init>[ValueParameterDescriptorImpl]

'UniqueIdentifier' @ [27:65] ==> public constructor UniqueIdentifier(externalId: String? = ..., id: UUID = ...) defined in net.corda.core.contracts.UniqueIdentifier[DeserializedClassConstructorDescriptor]

'ref' @ [27:82] ==> value-parameter ref: String defined in net.corda.testing.contracts.DummyDealContract.State.<init>[ValueParameterDescriptorImpl]

'participants' @ [30:20] ==> public open val participants: List<AbstractParty> defined in net.corda.testing.contracts.DummyDealContract.State[PropertyDescriptorImpl]

'any' @ [30:33] ==> public inline fun <T> Iterable<AbstractParty>.any(predicate: (AbstractParty) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'it' @ [30:39] ==> value-parameter it: AbstractParty defined in net.corda.testing.contracts.DummyDealContract.State.isRelevant.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [30:42] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'containsAny' @ [30:52] ==> public fun PublicKey.containsAny(otherKeys: Iterable<PublicKey>): Boolean defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'ourKeys' @ [30:64] ==> value-parameter ourKeys: Set<PublicKey> defined in net.corda.testing.contracts.DummyDealContract.State.isRelevant[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [34:19] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'listOf' @ [37:67] ==> public fun <T> listOf(element: DummyDealStateSchemaV1): List<DummyDealStateSchemaV1> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DummyDealStateSchemaV1

'DummyDealStateSchemaV1' @ [37:74] ==> public object DummyDealStateSchemaV1 : MappedSchema defined in net.corda.testing.schemas in file DummyDealStateSchemaV1.kt[FakeCallableDescriptorForObject]

'when (schema) {
                is DummyDealStateSchemaV1 -> DummyDealStateSchemaV1.PersistentDummyDealState(
                        _participants = participants.toSet(),
                        uid = linearId
                )
                else -> throw IllegalArgumentException("Unrecognised schema $schema")
            }' @ [40:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PersistentState, entry1: PersistentState): PersistentState[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PersistentState

'schema' @ [40:26] ==> value-parameter schema: MappedSchema defined in net.corda.testing.contracts.DummyDealContract.State.generateMappedObject[ValueParameterDescriptorImpl]

'DummyDealStateSchemaV1' @ [41:46] ==> public object DummyDealStateSchemaV1 : MappedSchema defined in net.corda.testing.schemas in file DummyDealStateSchemaV1.kt[FakeCallableDescriptorForObject]

'PersistentDummyDealState' @ [41:69] ==> public constructor PersistentDummyDealState(_participants: Set<AbstractParty>, uid: UniqueIdentifier) defined in net.corda.testing.schemas.DummyDealStateSchemaV1.PersistentDummyDealState[ClassConstructorDescriptorImpl]

'participants' @ [42:41] ==> public open val participants: List<AbstractParty> defined in net.corda.testing.contracts.DummyDealContract.State[PropertyDescriptorImpl]

'toSet' @ [42:54] ==> public fun <T> Iterable<AbstractParty>.toSet(): Set<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'linearId' @ [43:31] ==> public open val linearId: UniqueIdentifier defined in net.corda.testing.contracts.DummyDealContract.State[PropertyDescriptorImpl]

'IllegalArgumentException' @ [45:31] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'schema' @ [45:78] ==> value-parameter schema: MappedSchema defined in net.corda.testing.contracts.DummyDealContract.State.generateMappedObject[ValueParameterDescriptorImpl]

