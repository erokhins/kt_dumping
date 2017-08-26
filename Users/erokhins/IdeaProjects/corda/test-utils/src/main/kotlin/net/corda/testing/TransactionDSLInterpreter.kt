'interpreter' @ [66:108] ==> value-parameter interpreter: T defined in net.corda.testing.TransactionDSL.<init>[ValueParameterDescriptorImpl]

'input' @ [71:37] ==> public open fun input(stateRef: StateRef): Unit defined in net.corda.testing.TransactionDSL[SimpleFunctionDescriptorImpl]

'retrieveOutputStateAndRef' @ [71:43] ==> public open fun <S : ContractState> retrieveOutputStateAndRef(clazz: Class<ContractState>, label: String): StateAndRef<ContractState> defined in net.corda.testing.TransactionDSL[SimpleFunctionDescriptorImpl]
Inferred types:
    <S : ContractState> -> ContractState

'java' @ [71:90] ==> public val <T> KClass<ContractState>.java: Class<ContractState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ContractState

'stateLabel' @ [71:96] ==> value-parameter stateLabel: String defined in net.corda.testing.TransactionDSL.input[ValueParameterDescriptorImpl]

'ref' @ [71:108] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'ledgerInterpreter' @ [79:27] ==> public open val ledgerInterpreter: LedgerDSLInterpreter<TransactionDSLInterpreter> defined in net.corda.testing.TransactionDSL[PropertyDescriptorImpl]

'_unverifiedTransaction' @ [79:45] ==> public abstract fun _unverifiedTransaction(transactionLabel: String?, transactionBuilder: TransactionBuilder, dsl: TransactionDSL<TransactionDSLInterpreter>.() -> Unit): WireTransaction defined in net.corda.testing.LedgerDSLInterpreter[SimpleFunctionDescriptorImpl]

'TransactionBuilder' @ [79:74] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [79:102] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing in file TestConstants.kt[PropertyDescriptorImpl]

'output' @ [80:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[SimpleFunctionDescriptorImpl]

'state' @ [80:22] ==> value-parameter state: ContractState defined in net.corda.testing.TransactionDSL.input[ValueParameterDescriptorImpl]

'DummyContract' @ [82:30] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'SingleOwnerState' @ [82:44] ==> public constructor SingleOwnerState(magicNumber: Int = ..., owner: AbstractParty) defined in net.corda.testing.contracts.DummyContract.SingleOwnerState[ClassConstructorDescriptorImpl]

'Random' @ [82:61] ==> public constructor Random() defined in java.util.Random[JavaClassConstructorDescriptor]

'nextInt' @ [82:70] ==> public open fun nextInt(): Int defined in java.util.Random[JavaMethodDescriptor]

'DUMMY_NOTARY' @ [82:81] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing in file TestConstants.kt[PropertyDescriptorImpl]

'output' @ [83:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[SimpleFunctionDescriptorImpl]

'nonceState' @ [83:22] ==> val nonceState: DummyContract.SingleOwnerState defined in net.corda.testing.TransactionDSL.input.<anonymous>[LocalVariableDescriptor]

'input' @ [85:9] ==> public open fun input(stateRef: StateRef): Unit defined in net.corda.testing.TransactionDSL[SimpleFunctionDescriptorImpl]

'transaction' @ [85:15] ==> val transaction: WireTransaction defined in net.corda.testing.TransactionDSL.input[LocalVariableDescriptor]

'outRef' @ [85:27] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<ContractState> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> ContractState

'ref' @ [85:52] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'input' @ [88:52] ==> public final fun input(state: ContractState): Unit defined in net.corda.testing.TransactionDSL[SimpleFunctionDescriptorImpl]

'invoke' @ [88:58] ==> public abstract operator fun invoke(): ContractState defined in kotlin.Function0[FunctionInvokeDescriptor]

'JvmOverloads' @ [93:5] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [94:55] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing in file TestConstants.kt[PropertyDescriptorImpl]

'_output' @ [95:13] ==> public open fun _output(label: String?, notary: Party, encumbrance: Int?, contractState: ContractState): Unit defined in net.corda.testing.TransactionDSL[SimpleFunctionDescriptorImpl]

'label' @ [95:21] ==> value-parameter label: String? = ... defined in net.corda.testing.TransactionDSL.output[ValueParameterDescriptorImpl]

'notary' @ [95:28] ==> value-parameter notary: Party = ... defined in net.corda.testing.TransactionDSL.output[ValueParameterDescriptorImpl]

'encumbrance' @ [95:36] ==> value-parameter encumbrance: Int? = ... defined in net.corda.testing.TransactionDSL.output[ValueParameterDescriptorImpl]

'invoke' @ [95:49] ==> public abstract operator fun invoke(): ContractState defined in kotlin.Function0[FunctionInvokeDescriptor]

'_output' @ [101:13] ==> public open fun _output(label: String?, notary: Party, encumbrance: Int?, contractState: ContractState): Unit defined in net.corda.testing.TransactionDSL[SimpleFunctionDescriptorImpl]

'label' @ [101:21] ==> value-parameter label: String defined in net.corda.testing.TransactionDSL.output[ValueParameterDescriptorImpl]

'DUMMY_NOTARY' @ [101:28] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing in file TestConstants.kt[PropertyDescriptorImpl]

'contractState' @ [101:48] ==> value-parameter contractState: ContractState defined in net.corda.testing.TransactionDSL.output[ValueParameterDescriptorImpl]

'_output' @ [104:13] ==> public open fun _output(label: String?, notary: Party, encumbrance: Int?, contractState: ContractState): Unit defined in net.corda.testing.TransactionDSL[SimpleFunctionDescriptorImpl]

'DUMMY_NOTARY' @ [104:27] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing in file TestConstants.kt[PropertyDescriptorImpl]

'contractState' @ [104:47] ==> value-parameter contractState: ContractState defined in net.corda.testing.TransactionDSL.output[ValueParameterDescriptorImpl]

'_command' @ [110:13] ==> public open fun _command(signers: List<PublicKey>, commandData: CommandData): Unit defined in net.corda.testing.TransactionDSL[SimpleFunctionDescriptorImpl]

'listOf' @ [110:22] ==> public fun <T> listOf(vararg elements: PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'signers' @ [110:30] ==> value-parameter vararg signers: PublicKey defined in net.corda.testing.TransactionDSL.command[ValueParameterDescriptorImpl]

'invoke' @ [110:40] ==> public abstract operator fun invoke(): CommandData defined in kotlin.Function0[FunctionInvokeDescriptor]

'_command' @ [115:64] ==> public open fun _command(signers: List<PublicKey>, commandData: CommandData): Unit defined in net.corda.testing.TransactionDSL[SimpleFunctionDescriptorImpl]

'listOf' @ [115:73] ==> public fun <T> listOf(element: PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'signer' @ [115:80] ==> value-parameter signer: PublicKey defined in net.corda.testing.TransactionDSL.command[ValueParameterDescriptorImpl]

'commandData' @ [115:89] ==> value-parameter commandData: CommandData defined in net.corda.testing.TransactionDSL.command[ValueParameterDescriptorImpl]

'JvmOverloads' @ [122:5] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'seconds' @ [123:60] ==> public val Int.seconds: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'timeWindow' @ [124:13] ==> public open fun timeWindow(data: TimeWindow): Unit defined in net.corda.testing.TransactionDSL[SimpleFunctionDescriptorImpl]

'TimeWindow' @ [124:24] ==> public companion object defined in net.corda.core.contracts.TimeWindow[FakeCallableDescriptorForObject]

'withTolerance' @ [124:35] ==> @JvmStatic public final fun withTolerance(instant: Instant, tolerance: Duration): TimeWindow defined in net.corda.core.contracts.TimeWindow.Companion[DeserializedSimpleFunctionDescriptor]

'time' @ [124:49] ==> value-parameter time: Instant defined in net.corda.testing.TransactionDSL.timeWindow[ValueParameterDescriptorImpl]

'tolerance' @ [124:55] ==> value-parameter tolerance: Duration = ... defined in net.corda.testing.TransactionDSL.timeWindow[ValueParameterDescriptorImpl]

