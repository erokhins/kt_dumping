'AnotherDummyContract' @ [10:32] ==> public constructor AnotherDummyContract() defined in net.corda.finance.contracts.isolated.AnotherDummyContract[ClassConstructorDescriptorImpl]

'ANOTHER_DUMMY_PROGRAM_ID' @ [14:33] ==> public val ANOTHER_DUMMY_PROGRAM_ID: AnotherDummyContract defined in net.corda.finance.contracts.isolated in file AnotherDummyContract.kt[PropertyDescriptorImpl]

'emptyList' @ [16:21] ==> public fun <T> emptyList(): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'TypeOnlyCommandData' @ [20:24] ==> public constructor TypeOnlyCommandData() defined in net.corda.core.contracts.TypeOnlyCommandData[DeserializedClassConstructorDescriptor]

'State' @ [28:21] ==> public constructor State(magicNumber: Int = ...) defined in net.corda.finance.contracts.isolated.AnotherDummyContract.State[ClassConstructorDescriptorImpl]

'magicNumber' @ [28:27] ==> value-parameter magicNumber: Int defined in net.corda.finance.contracts.isolated.AnotherDummyContract.generateInitial[ValueParameterDescriptorImpl]

'TransactionBuilder' @ [29:16] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [29:35] ==> value-parameter notary: Party defined in net.corda.finance.contracts.isolated.AnotherDummyContract.generateInitial[ValueParameterDescriptorImpl]

'withItems' @ [29:43] ==> public final fun withItems(vararg items: Any): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'state' @ [29:53] ==> val state: AnotherDummyContract.State defined in net.corda.finance.contracts.isolated.AnotherDummyContract.generateInitial[LocalVariableDescriptor]

'Command' @ [29:60] ==> public constructor Command<T : CommandData>(data: AnotherDummyContract.Commands.Create, key: PublicKey) defined in net.corda.core.contracts.Command[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : CommandData> -> Create

'Create' @ [29:77] ==> public constructor Create() defined in net.corda.finance.contracts.isolated.AnotherDummyContract.Commands.Create[ClassConstructorDescriptorImpl]

'owner' @ [29:87] ==> value-parameter owner: PartyAndReference defined in net.corda.finance.contracts.isolated.AnotherDummyContract.generateInitial[ValueParameterDescriptorImpl]

'party' @ [29:93] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'owningKey' @ [29:99] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'state' @ [32:61] ==> value-parameter state: ContractState defined in net.corda.finance.contracts.isolated.AnotherDummyContract.inspectState[ValueParameterDescriptorImpl]

'magicNumber' @ [32:77] ==> public final val magicNumber: Int defined in net.corda.finance.contracts.isolated.AnotherDummyContract.State[PropertyDescriptorImpl]

