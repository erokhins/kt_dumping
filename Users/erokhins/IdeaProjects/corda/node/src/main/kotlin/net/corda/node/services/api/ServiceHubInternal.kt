'VisibleForTesting' @ [54:5] ==> public constructor VisibleForTesting() defined in net.corda.core.internal.VisibleForTesting[DeserializedClassConstructorDescriptor]

'CordaSerializable' @ [58:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'Exception' @ [59:34] ==> public final fun <init>(): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'NetworkCacheError' @ [61:34] ==> private constructor NetworkCacheError() defined in net.corda.node.services.api.NetworkCacheError[ClassConstructorDescriptorImpl]

'loggerFor' @ [66:27] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ServiceHubInternal

'require' @ [87:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'txs' @ [87:17] ==> value-parameter txs: Iterable<SignedTransaction> defined in net.corda.node.services.api.ServiceHubInternal.recordTransactions[ValueParameterDescriptorImpl]

'any' @ [87:21] ==> public fun <T> Iterable<SignedTransaction>.any(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'txs' @ [88:36] ==> value-parameter txs: Iterable<SignedTransaction> defined in net.corda.node.services.api.ServiceHubInternal.recordTransactions[ValueParameterDescriptorImpl]

'filter' @ [88:40] ==> public inline fun <T> Iterable<SignedTransaction>.filter(predicate: (SignedTransaction) -> Boolean): List<SignedTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'validatedTransactions' @ [88:49] ==> public abstract val validatedTransactions: WritableTransactionStorage defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'addTransaction' @ [88:71] ==> public abstract fun addTransaction(transaction: SignedTransaction): Boolean defined in net.corda.node.services.api.WritableTransactionStorage[SimpleFunctionDescriptorImpl]

'it' @ [88:86] ==> value-parameter it: SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal.recordTransactions.<anonymous>[ValueParameterDescriptorImpl]

'FlowStateMachineImpl' @ [89:33] ==> public companion object defined in net.corda.node.services.statemachine.FlowStateMachineImpl[FakeCallableDescriptorForObject]

'currentStateMachine' @ [89:54] ==> public final fun currentStateMachine(): FlowStateMachineImpl<*>? defined in net.corda.node.services.statemachine.FlowStateMachineImpl.Companion[SimpleFunctionDescriptorImpl]

'id' @ [89:77] ==> public open val id: StateMachineRunId defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'if (stateMachineRunId != null) {
            recordedTransactions.forEach {
                stateMachineRecordedTransactionMapping.addMapping(stateMachineRunId, it.id)
            }
        } else {
            log.warn("Transactions recorded from outside of a state machine")
        }' @ [90:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'stateMachineRunId' @ [90:13] ==> val stateMachineRunId: StateMachineRunId? defined in net.corda.node.services.api.ServiceHubInternal.recordTransactions[LocalVariableDescriptor]

'recordedTransactions' @ [91:13] ==> val recordedTransactions: List<SignedTransaction> defined in net.corda.node.services.api.ServiceHubInternal.recordTransactions[LocalVariableDescriptor]

'forEach' @ [91:34] ==> @HidesMembers public inline fun <T> Iterable<SignedTransaction>.forEach(action: (SignedTransaction) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'stateMachineRecordedTransactionMapping' @ [92:17] ==> public abstract val stateMachineRecordedTransactionMapping: StateMachineRecordedTransactionMappingStorage defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'addMapping' @ [92:56] ==> public abstract fun addMapping(stateMachineRunId: StateMachineRunId, transactionId: SecureHash): Unit defined in net.corda.node.services.api.StateMachineRecordedTransactionMappingStorage[SimpleFunctionDescriptorImpl]

'stateMachineRunId' @ [92:67] ==> val stateMachineRunId: StateMachineRunId? defined in net.corda.node.services.api.ServiceHubInternal.recordTransactions[LocalVariableDescriptor]

'it' @ [92:86] ==> value-parameter it: SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal.recordTransactions.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [92:89] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'log' @ [95:13] ==> private final val log: Logger defined in net.corda.node.services.api.ServiceHubInternal.Companion[PropertyDescriptorImpl]

'warn' @ [95:17] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'notifyVault' @ [98:13] ==> value-parameter notifyVault: Boolean defined in net.corda.node.services.api.ServiceHubInternal.recordTransactions[ValueParameterDescriptorImpl]

'recordedTransactions' @ [99:28] ==> val recordedTransactions: List<SignedTransaction> defined in net.corda.node.services.api.ServiceHubInternal.recordTransactions[LocalVariableDescriptor]

'map' @ [99:49] ==> public inline fun <T, R> Iterable<SignedTransaction>.map(transform: (SignedTransaction) -> CoreTransaction): List<CoreTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction
    <R> -> CoreTransaction

'if (it.isNotaryChangeTransaction()) it.notaryChangeTx else it.tx' @ [99:55] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CoreTransaction, elseBranch: CoreTransaction): CoreTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CoreTransaction

'it' @ [99:59] ==> value-parameter it: SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal.recordTransactions.<anonymous>[ValueParameterDescriptorImpl]

'isNotaryChangeTransaction' @ [99:62] ==> public final fun isNotaryChangeTransaction(): Boolean defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'it' @ [99:91] ==> value-parameter it: SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal.recordTransactions.<anonymous>[ValueParameterDescriptorImpl]

'notaryChangeTx' @ [99:94] ==> public final val notaryChangeTx: NotaryChangeWireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'it' @ [99:114] ==> value-parameter it: SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal.recordTransactions.<anonymous>[ValueParameterDescriptorImpl]

'tx' @ [99:117] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'vaultService' @ [100:13] ==> public abstract val vaultService: VaultService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'notifyAll' @ [100:26] ==> public abstract fun notifyAll(txns: Iterable<CoreTransaction>): Unit defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'toNotify' @ [100:36] ==> val toNotify: List<CoreTransaction> defined in net.corda.node.services.api.ServiceHubInternal.recordTransactions[LocalVariableDescriptor]

'VisibleForTesting' @ [108:5] ==> public constructor VisibleForTesting() defined in net.corda.core.internal.VisibleForTesting[DeserializedClassConstructorDescriptor]

'startFlow' @ [109:67] ==> public abstract fun <T> startFlow(logic: FlowLogic<T>, flowInitiator: FlowInitiator): FlowStateMachineImpl<T> defined in net.corda.node.services.api.ServiceHubInternal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'logic' @ [109:77] ==> value-parameter logic: FlowLogic<T> defined in net.corda.node.services.api.ServiceHubInternal.startFlow[ValueParameterDescriptorImpl]

'RPC' @ [109:98] ==> public constructor RPC(username: String) defined in net.corda.core.flows.FlowInitiator.RPC[DeserializedClassConstructorDescriptor]

'FlowLogicRefFactoryImpl' @ [129:24] ==> public object FlowLogicRefFactoryImpl : SingletonSerializeAsToken, FlowLogicRefFactory defined in net.corda.node.services.statemachine in file FlowLogicRefFactoryImpl.kt[FakeCallableDescriptorForObject]

'createForRPC' @ [129:48] ==> public final fun createForRPC(flowClass: Class<out FlowLogic<*>>, vararg args: Any?): FlowLogicRef defined in net.corda.node.services.statemachine.FlowLogicRefFactoryImpl[SimpleFunctionDescriptorImpl]

'logicType' @ [129:61] ==> value-parameter logicType: Class<out FlowLogic<T>> defined in net.corda.node.services.api.ServiceHubInternal.invokeFlowAsync[ValueParameterDescriptorImpl]

'args' @ [129:73] ==> value-parameter vararg args: Any? defined in net.corda.node.services.api.ServiceHubInternal.invokeFlowAsync[ValueParameterDescriptorImpl]

'Suppress' @ [130:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'FlowLogicRefFactoryImpl' @ [131:21] ==> public object FlowLogicRefFactoryImpl : SingletonSerializeAsToken, FlowLogicRefFactory defined in net.corda.node.services.statemachine in file FlowLogicRefFactoryImpl.kt[FakeCallableDescriptorForObject]

'toFlowLogic' @ [131:45] ==> public final fun toFlowLogic(ref: FlowLogicRef): FlowLogic<*> defined in net.corda.node.services.statemachine.FlowLogicRefFactoryImpl[SimpleFunctionDescriptorImpl]

'logicRef' @ [131:57] ==> val logicRef: FlowLogicRef defined in net.corda.node.services.api.ServiceHubInternal.invokeFlowAsync[LocalVariableDescriptor]

'startFlow' @ [132:16] ==> public abstract fun <T> startFlow(logic: FlowLogic<T>, flowInitiator: FlowInitiator): FlowStateMachineImpl<T> defined in net.corda.node.services.api.ServiceHubInternal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'logic' @ [132:26] ==> val logic: FlowLogic<T> defined in net.corda.node.services.api.ServiceHubInternal.invokeFlowAsync[LocalVariableDescriptor]

'flowInitiator' @ [132:33] ==> value-parameter flowInitiator: FlowInitiator defined in net.corda.node.services.api.ServiceHubInternal.invokeFlowAsync[ValueParameterDescriptorImpl]

