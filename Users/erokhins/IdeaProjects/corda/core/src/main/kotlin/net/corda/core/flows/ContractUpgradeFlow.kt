'InitiatingFlow' @ [16:1] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[ClassConstructorDescriptorImpl]

'StartableByRPC' @ [17:1] ==> public constructor StartableByRPC() defined in net.corda.core.flows.StartableByRPC[ClassConstructorDescriptorImpl]

'AbstractStateReplacementFlow.Instigator<OldState, NewState, Class<out UpgradedContract<OldState, NewState>>>' @ [21:5] ==> public constructor Instigator<out S : ContractState, out T : ContractState, out M>(originalState: StateAndRef<OldState>, modification: Class<out UpgradedContract<OldState, NewState>>, progressTracker: ProgressTracker = ...) defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator[ClassConstructorDescriptorImpl]
Inferred types:
    <out S : ContractState> -> OldState
    <out T : ContractState> -> NewState
    <out M> -> Class<out UpgradedContract<OldState, NewState>>

'originalState' @ [21:114] ==> value-parameter originalState: StateAndRef<OldState> defined in net.corda.core.flows.ContractUpgradeFlow.<init>[ValueParameterDescriptorImpl]

'newContractClass' @ [21:129] ==> value-parameter newContractClass: Class<out UpgradedContract<OldState, NewState>> defined in net.corda.core.flows.ContractUpgradeFlow.<init>[ValueParameterDescriptorImpl]

'JvmStatic' @ [24:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'verify' @ [27:13] ==> @JvmStatic public final fun verify(input: ContractState, output: ContractState, commandData: Command<UpgradeCommand>): Unit defined in net.corda.core.flows.ContractUpgradeFlow.Companion[SimpleFunctionDescriptorImpl]

'tx' @ [28:21] ==> value-parameter tx: LedgerTransaction defined in net.corda.core.flows.ContractUpgradeFlow.Companion.verify[ValueParameterDescriptorImpl]

'inputStates' @ [28:24] ==> public final val inputStates: List<ContractState> defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'single' @ [28:36] ==> public fun <T> List<ContractState>.single(): ContractState defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ContractState

'tx' @ [29:21] ==> value-parameter tx: LedgerTransaction defined in net.corda.core.flows.ContractUpgradeFlow.Companion.verify[ValueParameterDescriptorImpl]

'outputStates' @ [29:24] ==> public final val outputStates: List<ContractState> defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'single' @ [29:37] ==> public fun <T> List<ContractState>.single(): ContractState defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ContractState

'tx' @ [30:21] ==> value-parameter tx: LedgerTransaction defined in net.corda.core.flows.ContractUpgradeFlow.Companion.verify[ValueParameterDescriptorImpl]

'commandsOfType' @ [30:24] ==> public final inline fun <reified T : CommandData> commandsOfType(): List<Command<UpgradeCommand>> defined in net.corda.core.transactions.LedgerTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : CommandData> -> UpgradeCommand

'single' @ [30:57] ==> public fun <T> List<Command<UpgradeCommand>>.single(): Command<UpgradeCommand> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<UpgradeCommand>

'JvmStatic' @ [33:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'commandData' @ [35:27] ==> value-parameter commandData: Command<UpgradeCommand> defined in net.corda.core.flows.ContractUpgradeFlow.Companion.verify[ValueParameterDescriptorImpl]

'value' @ [35:39] ==> public final val value: UpgradeCommand defined in net.corda.core.contracts.Command[PropertyDescriptorImpl]

'input' @ [36:51] ==> value-parameter input: ContractState defined in net.corda.core.flows.ContractUpgradeFlow.Companion.verify[ValueParameterDescriptorImpl]

'participants' @ [36:57] ==> public abstract val participants: List<AbstractParty> defined in net.corda.core.contracts.ContractState[PropertyDescriptorImpl]

'map' @ [36:70] ==> public inline fun <T, R> Iterable<AbstractParty>.map(transform: (AbstractParty) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> PublicKey

'it' @ [36:76] ==> value-parameter it: AbstractParty defined in net.corda.core.flows.ContractUpgradeFlow.Companion.verify.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [36:79] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[PropertyDescriptorImpl]

'toSet' @ [36:91] ==> public fun <T> Iterable<PublicKey>.toSet(): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'commandData' @ [37:50] ==> value-parameter commandData: Command<UpgradeCommand> defined in net.corda.core.flows.ContractUpgradeFlow.Companion.verify[ValueParameterDescriptorImpl]

'signers' @ [37:62] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.Command[PropertyDescriptorImpl]

'toSet' @ [37:70] ==> public fun <T> Iterable<PublicKey>.toSet(): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'Suppress' @ [38:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'command' @ [39:36] ==> val command: UpgradeCommand defined in net.corda.core.flows.ContractUpgradeFlow.Companion.verify[LocalVariableDescriptor]

'upgradedContractClass' @ [39:44] ==> public final val upgradedContractClass: Class<out UpgradedContract<*, *>> defined in net.corda.core.contracts.UpgradeCommand[PropertyDescriptorImpl]

'newInstance' @ [39:66] ==> @CallerSensitive public open fun newInstance(): (UpgradedContract<*, *>..UpgradedContract<*, *>?) defined in java.lang.Class[JavaMethodDescriptor]

'requireThat' @ [40:13] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit

'using' @ [41:17] ==> @Suppress public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[SimpleFunctionDescriptorImpl]

'keysThatSigned' @ [41:71] ==> val keysThatSigned: Set<PublicKey> defined in net.corda.core.flows.ContractUpgradeFlow.Companion.verify[LocalVariableDescriptor]

'containsAll' @ [41:86] ==> public abstract fun containsAll(elements: Collection<PublicKey>): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'participantKeys' @ [41:98] ==> val participantKeys: Set<PublicKey> defined in net.corda.core.flows.ContractUpgradeFlow.Companion.verify[LocalVariableDescriptor]

'using' @ [42:17] ==> @Suppress public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[SimpleFunctionDescriptorImpl]

'input' @ [42:69] ==> value-parameter input: ContractState defined in net.corda.core.flows.ContractUpgradeFlow.Companion.verify[ValueParameterDescriptorImpl]

'contract' @ [42:75] ==> public abstract val contract: Contract defined in net.corda.core.contracts.ContractState[PropertyDescriptorImpl]

'javaClass' @ [42:84] ==> public val <T : Any> Contract.javaClass: Class<Contract> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Contract

'upgradedContract' @ [42:97] ==> val upgradedContract: UpgradedContract<ContractState, *> defined in net.corda.core.flows.ContractUpgradeFlow.Companion.verify[LocalVariableDescriptor]

'legacyContract' @ [42:114] ==> public abstract val legacyContract: Class<out Contract> defined in net.corda.core.contracts.UpgradedContract[PropertyDescriptorImpl]

'using' @ [43:17] ==> @Suppress public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[SimpleFunctionDescriptorImpl]

'output' @ [43:72] ==> value-parameter output: ContractState defined in net.corda.core.flows.ContractUpgradeFlow.Companion.verify[ValueParameterDescriptorImpl]

'contract' @ [43:79] ==> public abstract val contract: Contract defined in net.corda.core.contracts.ContractState[PropertyDescriptorImpl]

'javaClass' @ [43:88] ==> public val <T : Any> Contract.javaClass: Class<Contract> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Contract

'command' @ [43:101] ==> val command: UpgradeCommand defined in net.corda.core.flows.ContractUpgradeFlow.Companion.verify[LocalVariableDescriptor]

'upgradedContractClass' @ [43:109] ==> public final val upgradedContractClass: Class<out UpgradedContract<*, *>> defined in net.corda.core.contracts.UpgradeCommand[PropertyDescriptorImpl]

'using' @ [44:17] ==> @Suppress public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[SimpleFunctionDescriptorImpl]

'output' @ [44:86] ==> value-parameter output: ContractState defined in net.corda.core.flows.ContractUpgradeFlow.Companion.verify[ValueParameterDescriptorImpl]

'upgradedContract' @ [44:96] ==> val upgradedContract: UpgradedContract<ContractState, *> defined in net.corda.core.flows.ContractUpgradeFlow.Companion.verify[LocalVariableDescriptor]

'upgrade' @ [44:113] ==> public abstract fun upgrade(state: ContractState): ContractState defined in net.corda.core.contracts.UpgradedContract[SimpleFunctionDescriptorImpl]

'input' @ [44:121] ==> value-parameter input: ContractState defined in net.corda.core.flows.ContractUpgradeFlow.Companion.verify[ValueParameterDescriptorImpl]

'upgradedContractClass' @ [53:35] ==> value-parameter upgradedContractClass: Class<out UpgradedContract<OldState, NewState>> defined in net.corda.core.flows.ContractUpgradeFlow.Companion.assembleBareTx[ValueParameterDescriptorImpl]

'newInstance' @ [53:57] ==> @CallerSensitive public open fun newInstance(): (UpgradedContract<OldState, NewState>..UpgradedContract<OldState, NewState>?) defined in java.lang.Class[JavaMethodDescriptor]

'TransactionBuilder' @ [54:20] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[ClassConstructorDescriptorImpl]

'stateRef' @ [54:39] ==> value-parameter stateRef: StateAndRef<OldState> defined in net.corda.core.flows.ContractUpgradeFlow.Companion.assembleBareTx[ValueParameterDescriptorImpl]

'state' @ [54:48] ==> public final val state: TransactionState<OldState> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'notary' @ [54:54] ==> public final val notary: Party defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'withItems' @ [55:22] ==> public final fun withItems(vararg items: Any): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[SimpleFunctionDescriptorImpl]

'stateRef' @ [56:29] ==> value-parameter stateRef: StateAndRef<OldState> defined in net.corda.core.flows.ContractUpgradeFlow.Companion.assembleBareTx[ValueParameterDescriptorImpl]

'contractUpgrade' @ [57:29] ==> val contractUpgrade: (UpgradedContract<OldState, NewState>..UpgradedContract<OldState, NewState>?) defined in net.corda.core.flows.ContractUpgradeFlow.Companion.assembleBareTx[LocalVariableDescriptor]

'upgrade' @ [57:45] ==> public abstract fun upgrade(state: OldState): NewState defined in net.corda.core.contracts.UpgradedContract[SimpleFunctionDescriptorImpl]

'stateRef' @ [57:53] ==> value-parameter stateRef: StateAndRef<OldState> defined in net.corda.core.flows.ContractUpgradeFlow.Companion.assembleBareTx[ValueParameterDescriptorImpl]

'state' @ [57:62] ==> public final val state: TransactionState<OldState> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'data' @ [57:68] ==> public final val data: OldState defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'Command' @ [58:29] ==> public constructor Command<T : CommandData>(value: UpgradeCommand, signers: List<PublicKey>) defined in net.corda.core.contracts.Command[ClassConstructorDescriptorImpl]
Inferred types:
    <T : CommandData> -> UpgradeCommand

'UpgradeCommand' @ [58:37] ==> public constructor UpgradeCommand(upgradedContractClass: Class<out UpgradedContract<*, *>>) defined in net.corda.core.contracts.UpgradeCommand[ClassConstructorDescriptorImpl]

'upgradedContractClass' @ [58:52] ==> value-parameter upgradedContractClass: Class<out UpgradedContract<OldState, NewState>> defined in net.corda.core.flows.ContractUpgradeFlow.Companion.assembleBareTx[ValueParameterDescriptorImpl]

'stateRef' @ [58:76] ==> value-parameter stateRef: StateAndRef<OldState> defined in net.corda.core.flows.ContractUpgradeFlow.Companion.assembleBareTx[ValueParameterDescriptorImpl]

'state' @ [58:85] ==> public final val state: TransactionState<OldState> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'data' @ [58:91] ==> public final val data: OldState defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'participants' @ [58:96] ==> public abstract val participants: List<AbstractParty> defined in net.corda.core.contracts.ContractState[PropertyDescriptorImpl]

'map' @ [58:109] ==> public inline fun <T, R> Iterable<AbstractParty>.map(transform: (AbstractParty) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> PublicKey

'it' @ [58:115] ==> value-parameter it: AbstractParty defined in net.corda.core.flows.ContractUpgradeFlow.Companion.assembleBareTx.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [58:118] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[PropertyDescriptorImpl]

'privacySalt' @ [59:29] ==> value-parameter privacySalt: PrivacySalt defined in net.corda.core.flows.ContractUpgradeFlow.Companion.assembleBareTx[ValueParameterDescriptorImpl]

'assembleBareTx' @ [65:22] ==> public final fun <OldState : ContractState, NewState : ContractState> assembleBareTx(stateRef: StateAndRef<OldState>, upgradedContractClass: Class<out UpgradedContract<OldState, NewState>>, privacySalt: PrivacySalt): TransactionBuilder defined in net.corda.core.flows.ContractUpgradeFlow.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <OldState : ContractState> -> OldState
    <NewState : ContractState> -> NewState

'originalState' @ [65:37] ==> public final val originalState: StateAndRef<OldState> defined in net.corda.core.flows.ContractUpgradeFlow[PropertyDescriptorImpl]

'modification' @ [65:52] ==> public final val modification: Class<out UpgradedContract<OldState, NewState>> defined in net.corda.core.flows.ContractUpgradeFlow[PropertyDescriptorImpl]

'PrivacySalt' @ [65:66] ==> public constructor PrivacySalt() defined in net.corda.core.contracts.PrivacySalt[ClassConstructorDescriptorImpl]

'originalState' @ [66:31] ==> public final val originalState: StateAndRef<OldState> defined in net.corda.core.flows.ContractUpgradeFlow[PropertyDescriptorImpl]

'state' @ [66:45] ==> public final val state: TransactionState<OldState> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'data' @ [66:51] ==> public final val data: OldState defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'participants' @ [66:56] ==> public abstract val participants: List<AbstractParty> defined in net.corda.core.contracts.ContractState[PropertyDescriptorImpl]

'map' @ [66:69] ==> public inline fun <T, R> Iterable<AbstractParty>.map(transform: (AbstractParty) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> PublicKey

'it' @ [66:75] ==> value-parameter it: AbstractParty defined in net.corda.core.flows.ContractUpgradeFlow.assembleTx.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [66:78] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[PropertyDescriptorImpl]

'toSet' @ [66:90] ==> public fun <T> Iterable<PublicKey>.toSet(): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'serviceHub' @ [68:21] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.ContractUpgradeFlow[PropertyDescriptorImpl]

'keyManagementService' @ [68:32] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'filterMyKeys' @ [68:53] ==> public abstract fun filterMyKeys(candidateKeys: Iterable<PublicKey>): Iterable<PublicKey> defined in net.corda.core.node.services.KeyManagementService[SimpleFunctionDescriptorImpl]

'participantKeys' @ [68:66] ==> val participantKeys: Set<PublicKey> defined in net.corda.core.flows.ContractUpgradeFlow.assembleTx[LocalVariableDescriptor]

'single' @ [68:83] ==> public fun <T> Iterable<PublicKey>.single(): PublicKey defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'serviceHub' @ [69:19] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.ContractUpgradeFlow[PropertyDescriptorImpl]

'signInitialTransaction' @ [69:30] ==> public open fun signInitialTransaction(builder: TransactionBuilder, publicKey: PublicKey): SignedTransaction defined in net.corda.core.node.ServiceHub[SimpleFunctionDescriptorImpl]

'baseTx' @ [69:53] ==> val baseTx: TransactionBuilder defined in net.corda.core.flows.ContractUpgradeFlow.assembleTx[LocalVariableDescriptor]

'myKey' @ [69:61] ==> val myKey: PublicKey defined in net.corda.core.flows.ContractUpgradeFlow.assembleTx[LocalVariableDescriptor]

'UpgradeTx' @ [70:45] ==> public constructor UpgradeTx(stx: SignedTransaction, participants: Iterable<PublicKey>, myKey: PublicKey) defined in net.corda.core.flows.AbstractStateReplacementFlow.UpgradeTx[ClassConstructorDescriptorImpl]

'stx' @ [70:55] ==> val stx: SignedTransaction defined in net.corda.core.flows.ContractUpgradeFlow.assembleTx[LocalVariableDescriptor]

'participantKeys' @ [70:60] ==> val participantKeys: Set<PublicKey> defined in net.corda.core.flows.ContractUpgradeFlow.assembleTx[LocalVariableDescriptor]

'myKey' @ [70:77] ==> val myKey: PublicKey defined in net.corda.core.flows.ContractUpgradeFlow.assembleTx[LocalVariableDescriptor]

