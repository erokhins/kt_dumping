'DummyContract' @ [11:24] ==> public constructor DummyContract(blank: Any? = ...) defined in net.corda.testing.contracts.DummyContract[ClassConstructorDescriptorImpl]

'DUMMY_PROGRAM_ID' @ [19:33] ==> public val DUMMY_PROGRAM_ID: DummyContract defined in net.corda.testing.contracts in file DummyContract.kt[PropertyDescriptorImpl]

'listOf' @ [21:21] ==> public fun <T> listOf(element: AbstractParty): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'owner' @ [21:28] ==> public open val owner: AbstractParty defined in net.corda.testing.contracts.DummyContract.SingleOwnerState[PropertyDescriptorImpl]

'CommandAndState' @ [23:62] ==> public constructor CommandAndState(command: CommandData, ownableState: OwnableState) defined in net.corda.core.contracts.CommandAndState[DeserializedClassConstructorDescriptor]

'Move' @ [23:87] ==> public constructor Move() defined in net.corda.testing.contracts.DummyContract.Commands.Move[ClassConstructorDescriptorImpl]

'copy' @ [23:95] ==> public final fun copy(magicNumber: Int = ..., owner: AbstractParty = ...): DummyContract.SingleOwnerState defined in net.corda.testing.contracts.DummyContract.SingleOwnerState[SimpleFunctionDescriptorImpl]

'newOwner' @ [23:108] ==> value-parameter newOwner: AbstractParty defined in net.corda.testing.contracts.DummyContract.SingleOwnerState.withNewOwner[ValueParameterDescriptorImpl]

'DUMMY_PROGRAM_ID' @ [33:33] ==> public val DUMMY_PROGRAM_ID: DummyContract defined in net.corda.testing.contracts in file DummyContract.kt[PropertyDescriptorImpl]

'owners' @ [34:64] ==> public final val owners: List<AbstractParty> defined in net.corda.testing.contracts.DummyContract.MultiOwnerState[PropertyDescriptorImpl]

'TypeOnlyCommandData' @ [38:24] ==> public constructor TypeOnlyCommandData() defined in net.corda.core.contracts.TypeOnlyCommandData[DeserializedClassConstructorDescriptor]

'TypeOnlyCommandData' @ [39:22] ==> public constructor TypeOnlyCommandData() defined in net.corda.core.contracts.TypeOnlyCommandData[DeserializedClassConstructorDescriptor]

'JvmStatic' @ [47:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'listOf' @ [49:26] ==> public fun <T> listOf(element: PartyAndReference): List<PartyAndReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndReference

'owner' @ [49:33] ==> value-parameter owner: PartyAndReference defined in net.corda.testing.contracts.DummyContract.Companion.generateInitial[ValueParameterDescriptorImpl]

'otherOwners' @ [49:42] ==> value-parameter vararg otherOwners: PartyAndReference defined in net.corda.testing.contracts.DummyContract.Companion.generateInitial[ValueParameterDescriptorImpl]

'if (owners.size == 1) {
                val state = SingleOwnerState(magicNumber, owners.first().party)
                TransactionBuilder(notary).withItems(state, Command(Commands.Create(), owners.first().party.owningKey))
            } else {
                val state = MultiOwnerState(magicNumber, owners.map { it.party })
                TransactionBuilder(notary).withItems(state, Command(Commands.Create(), owners.map { it.party.owningKey }))
            }' @ [50:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TransactionBuilder, elseBranch: TransactionBuilder): TransactionBuilder[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TransactionBuilder

'owners' @ [50:24] ==> val owners: List<PartyAndReference> defined in net.corda.testing.contracts.DummyContract.Companion.generateInitial[LocalVariableDescriptor]

'size' @ [50:31] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'SingleOwnerState' @ [51:29] ==> public constructor SingleOwnerState(magicNumber: Int = ..., owner: AbstractParty) defined in net.corda.testing.contracts.DummyContract.SingleOwnerState[ClassConstructorDescriptorImpl]

'magicNumber' @ [51:46] ==> value-parameter magicNumber: Int defined in net.corda.testing.contracts.DummyContract.Companion.generateInitial[ValueParameterDescriptorImpl]

'owners' @ [51:59] ==> val owners: List<PartyAndReference> defined in net.corda.testing.contracts.DummyContract.Companion.generateInitial[LocalVariableDescriptor]

'first' @ [51:66] ==> public fun <T> List<PartyAndReference>.first(): PartyAndReference defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndReference

'party' @ [51:74] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'TransactionBuilder' @ [52:17] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [52:36] ==> value-parameter notary: Party defined in net.corda.testing.contracts.DummyContract.Companion.generateInitial[ValueParameterDescriptorImpl]

'withItems' @ [52:44] ==> public final fun withItems(vararg items: Any): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'state' @ [52:54] ==> val state: DummyContract.SingleOwnerState defined in net.corda.testing.contracts.DummyContract.Companion.generateInitial[LocalVariableDescriptor]

'Command' @ [52:61] ==> public constructor Command<T : CommandData>(data: DummyContract.Commands.Create, key: PublicKey) defined in net.corda.core.contracts.Command[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : CommandData> -> Create

'Create' @ [52:78] ==> public constructor Create() defined in net.corda.testing.contracts.DummyContract.Commands.Create[ClassConstructorDescriptorImpl]

'owners' @ [52:88] ==> val owners: List<PartyAndReference> defined in net.corda.testing.contracts.DummyContract.Companion.generateInitial[LocalVariableDescriptor]

'first' @ [52:95] ==> public fun <T> List<PartyAndReference>.first(): PartyAndReference defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndReference

'party' @ [52:103] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'owningKey' @ [52:109] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'MultiOwnerState' @ [54:29] ==> public constructor MultiOwnerState(magicNumber: Int = ..., owners: List<AbstractParty>) defined in net.corda.testing.contracts.DummyContract.MultiOwnerState[ClassConstructorDescriptorImpl]

'magicNumber' @ [54:45] ==> value-parameter magicNumber: Int defined in net.corda.testing.contracts.DummyContract.Companion.generateInitial[ValueParameterDescriptorImpl]

'owners' @ [54:58] ==> val owners: List<PartyAndReference> defined in net.corda.testing.contracts.DummyContract.Companion.generateInitial[LocalVariableDescriptor]

'map' @ [54:65] ==> public inline fun <T, R> Iterable<PartyAndReference>.map(transform: (PartyAndReference) -> AbstractParty): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndReference
    <R> -> AbstractParty

'it' @ [54:71] ==> value-parameter it: PartyAndReference defined in net.corda.testing.contracts.DummyContract.Companion.generateInitial.<anonymous>[ValueParameterDescriptorImpl]

'party' @ [54:74] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'TransactionBuilder' @ [55:17] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [55:36] ==> value-parameter notary: Party defined in net.corda.testing.contracts.DummyContract.Companion.generateInitial[ValueParameterDescriptorImpl]

'withItems' @ [55:44] ==> public final fun withItems(vararg items: Any): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'state' @ [55:54] ==> val state: DummyContract.MultiOwnerState defined in net.corda.testing.contracts.DummyContract.Companion.generateInitial[LocalVariableDescriptor]

'Command' @ [55:61] ==> public constructor Command<T : CommandData>(value: DummyContract.Commands.Create, signers: List<PublicKey>) defined in net.corda.core.contracts.Command[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : CommandData> -> Create

'Create' @ [55:78] ==> public constructor Create() defined in net.corda.testing.contracts.DummyContract.Commands.Create[ClassConstructorDescriptorImpl]

'owners' @ [55:88] ==> val owners: List<PartyAndReference> defined in net.corda.testing.contracts.DummyContract.Companion.generateInitial[LocalVariableDescriptor]

'map' @ [55:95] ==> public inline fun <T, R> Iterable<PartyAndReference>.map(transform: (PartyAndReference) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndReference
    <R> -> PublicKey

'it' @ [55:101] ==> value-parameter it: PartyAndReference defined in net.corda.testing.contracts.DummyContract.Companion.generateInitial.<anonymous>[ValueParameterDescriptorImpl]

'party' @ [55:104] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'owningKey' @ [55:110] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'move' @ [59:83] ==> public final fun move(priors: List<StateAndRef<DummyContract.SingleOwnerState>>, newOwner: AbstractParty): TransactionBuilder defined in net.corda.testing.contracts.DummyContract.Companion[SimpleFunctionDescriptorImpl]

'listOf' @ [59:88] ==> public fun <T> listOf(element: StateAndRef<DummyContract.SingleOwnerState>): List<StateAndRef<DummyContract.SingleOwnerState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<SingleOwnerState>

'prior' @ [59:95] ==> value-parameter prior: StateAndRef<DummyContract.SingleOwnerState> defined in net.corda.testing.contracts.DummyContract.Companion.move[ValueParameterDescriptorImpl]

'newOwner' @ [59:103] ==> value-parameter newOwner: AbstractParty defined in net.corda.testing.contracts.DummyContract.Companion.move[ValueParameterDescriptorImpl]

'require' @ [61:13] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'priors' @ [61:21] ==> value-parameter priors: List<StateAndRef<DummyContract.SingleOwnerState>> defined in net.corda.testing.contracts.DummyContract.Companion.move[ValueParameterDescriptorImpl]

'isNotEmpty' @ [61:28] ==> @InlineOnly public inline fun <T> Collection<StateAndRef<DummyContract.SingleOwnerState>>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<SingleOwnerState>

'priors' @ [62:30] ==> value-parameter priors: List<StateAndRef<DummyContract.SingleOwnerState>> defined in net.corda.testing.contracts.DummyContract.Companion.move[ValueParameterDescriptorImpl]

'state' @ [62:40] ==> public final val state: TransactionState<DummyContract.SingleOwnerState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [62:46] ==> public final val data: DummyContract.SingleOwnerState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'component1' @ [63:18] ==> public final operator fun component1(): CommandData defined in net.corda.core.contracts.CommandAndState[DeserializedSimpleFunctionDescriptor]

'component2' @ [63:23] ==> public final operator fun component2(): OwnableState defined in net.corda.core.contracts.CommandAndState[DeserializedSimpleFunctionDescriptor]

'priorState' @ [63:32] ==> val priorState: DummyContract.SingleOwnerState defined in net.corda.testing.contracts.DummyContract.Companion.move[LocalVariableDescriptor]

'withNewOwner' @ [63:43] ==> public open fun withNewOwner(newOwner: AbstractParty): CommandAndState defined in net.corda.testing.contracts.DummyContract.SingleOwnerState[SimpleFunctionDescriptorImpl]

'newOwner' @ [63:56] ==> value-parameter newOwner: AbstractParty defined in net.corda.testing.contracts.DummyContract.Companion.move[ValueParameterDescriptorImpl]

'TransactionBuilder' @ [64:20] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'priors' @ [64:48] ==> value-parameter priors: List<StateAndRef<DummyContract.SingleOwnerState>> defined in net.corda.testing.contracts.DummyContract.Companion.move[ValueParameterDescriptorImpl]

'state' @ [64:58] ==> public final val state: TransactionState<DummyContract.SingleOwnerState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'notary' @ [64:64] ==> public final val notary: Party defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'withItems' @ [64:72] ==> public final fun withItems(vararg items: Any): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'priors' @ [65:36] ==> value-parameter priors: List<StateAndRef<DummyContract.SingleOwnerState>> defined in net.corda.testing.contracts.DummyContract.Companion.move[ValueParameterDescriptorImpl]

'toTypedArray' @ [65:43] ==> public inline fun <reified T> Collection<StateAndRef<DummyContract.SingleOwnerState>>.toTypedArray(): Array<StateAndRef<DummyContract.SingleOwnerState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> StateAndRef<SingleOwnerState>

'Command' @ [66:35] ==> public constructor Command<T : CommandData>(data: CommandData, key: PublicKey) defined in net.corda.core.contracts.Command[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : CommandData> -> CommandData

'cmd' @ [66:43] ==> val cmd: CommandData defined in net.corda.testing.contracts.DummyContract.Companion.move[LocalVariableDescriptor]

'priorState' @ [66:48] ==> val priorState: DummyContract.SingleOwnerState defined in net.corda.testing.contracts.DummyContract.Companion.move[LocalVariableDescriptor]

'owner' @ [66:59] ==> public open val owner: AbstractParty defined in net.corda.testing.contracts.DummyContract.SingleOwnerState[PropertyDescriptorImpl]

'owningKey' @ [66:65] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'state' @ [67:35] ==> val state: OwnableState defined in net.corda.testing.contracts.DummyContract.Companion.move[LocalVariableDescriptor]

