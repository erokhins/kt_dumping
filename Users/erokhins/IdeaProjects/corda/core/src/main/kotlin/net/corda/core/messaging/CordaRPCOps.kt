'CordaSerializable' @ [31:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'javaClass' @ [38:42] ==> public val <T : Any> StateMachineInfo.javaClass: Class<StateMachineInfo> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> StateMachineInfo

'simpleName' @ [38:52] ==> public final val <T : (Any..Any?)> Class<StateMachineInfo>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> StateMachineInfo

'id' @ [38:65] ==> public final val id: StateMachineRunId defined in net.corda.core.messaging.StateMachineInfo[PropertyDescriptorImpl]

'flowLogicClassName' @ [38:70] ==> public final val flowLogicClassName: String defined in net.corda.core.messaging.StateMachineInfo[PropertyDescriptorImpl]

'CordaSerializable' @ [41:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'StateMachineUpdate' @ [45:64] ==> private constructor StateMachineUpdate() defined in net.corda.core.messaging.StateMachineUpdate[ClassConstructorDescriptorImpl]

'stateMachineInfo' @ [46:52] ==> public final val stateMachineInfo: StateMachineInfo defined in net.corda.core.messaging.StateMachineUpdate.Added[PropertyDescriptorImpl]

'id' @ [46:69] ==> public final val id: StateMachineRunId defined in net.corda.core.messaging.StateMachineInfo[PropertyDescriptorImpl]

'StateMachineUpdate' @ [49:82] ==> private constructor StateMachineUpdate() defined in net.corda.core.messaging.StateMachineUpdate[ClassConstructorDescriptorImpl]

'CordaSerializable' @ [52:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'nodeIdentity' @ [61:47] ==> public abstract fun nodeIdentity(): NodeInfo defined in net.corda.core.messaging.CordaRPCOps[SimpleFunctionDescriptorImpl]

'platformVersion' @ [61:62] ==> public final val platformVersion: Int defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'RPCReturnsObservables' @ [71:5] ==> public constructor RPCReturnsObservables() defined in net.corda.core.messaging.RPCReturnsObservables[ClassConstructorDescriptorImpl]

'RPCReturnsObservables' @ [96:5] ==> public constructor RPCReturnsObservables() defined in net.corda.core.messaging.RPCReturnsObservables[ClassConstructorDescriptorImpl]

'vaultQueryBy' @ [108:16] ==> @RPCReturnsObservables public abstract fun <T : ContractState> vaultQueryBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): Vault.Page<T> defined in net.corda.core.messaging.CordaRPCOps[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'VaultQueryCriteria' @ [108:43] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[ClassConstructorDescriptorImpl]

'PageSpecification' @ [108:65] ==> public constructor PageSpecification(pageNumber: Int = ..., pageSize: Int = ...) defined in net.corda.core.node.services.vault.PageSpecification[ClassConstructorDescriptorImpl]

'Sort' @ [108:86] ==> public constructor Sort(columns: Collection<Sort.SortColumn>) defined in net.corda.core.node.services.vault.Sort[ClassConstructorDescriptorImpl]

'emptySet' @ [108:91] ==> public fun <T> emptySet(): Set<Sort.SortColumn> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SortColumn

'contractType' @ [108:104] ==> value-parameter contractType: Class<out T> defined in net.corda.core.messaging.CordaRPCOps.vaultQuery[ValueParameterDescriptorImpl]

'vaultQueryBy' @ [111:16] ==> @RPCReturnsObservables public abstract fun <T : ContractState> vaultQueryBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): Vault.Page<T> defined in net.corda.core.messaging.CordaRPCOps[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'criteria' @ [111:29] ==> value-parameter criteria: QueryCriteria defined in net.corda.core.messaging.CordaRPCOps.vaultQueryByCriteria[ValueParameterDescriptorImpl]

'PageSpecification' @ [111:39] ==> public constructor PageSpecification(pageNumber: Int = ..., pageSize: Int = ...) defined in net.corda.core.node.services.vault.PageSpecification[ClassConstructorDescriptorImpl]

'Sort' @ [111:60] ==> public constructor Sort(columns: Collection<Sort.SortColumn>) defined in net.corda.core.node.services.vault.Sort[ClassConstructorDescriptorImpl]

'emptySet' @ [111:65] ==> public fun <T> emptySet(): Set<Sort.SortColumn> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SortColumn

'contractType' @ [111:78] ==> value-parameter contractType: Class<out T> defined in net.corda.core.messaging.CordaRPCOps.vaultQueryByCriteria[ValueParameterDescriptorImpl]

'vaultQueryBy' @ [114:16] ==> @RPCReturnsObservables public abstract fun <T : ContractState> vaultQueryBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): Vault.Page<T> defined in net.corda.core.messaging.CordaRPCOps[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'criteria' @ [114:29] ==> value-parameter criteria: QueryCriteria defined in net.corda.core.messaging.CordaRPCOps.vaultQueryByWithPagingSpec[ValueParameterDescriptorImpl]

'paging' @ [114:39] ==> value-parameter paging: PageSpecification defined in net.corda.core.messaging.CordaRPCOps.vaultQueryByWithPagingSpec[ValueParameterDescriptorImpl]

'Sort' @ [114:47] ==> public constructor Sort(columns: Collection<Sort.SortColumn>) defined in net.corda.core.node.services.vault.Sort[ClassConstructorDescriptorImpl]

'emptySet' @ [114:52] ==> public fun <T> emptySet(): Set<Sort.SortColumn> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SortColumn

'contractType' @ [114:65] ==> value-parameter contractType: Class<out T> defined in net.corda.core.messaging.CordaRPCOps.vaultQueryByWithPagingSpec[ValueParameterDescriptorImpl]

'vaultQueryBy' @ [117:16] ==> @RPCReturnsObservables public abstract fun <T : ContractState> vaultQueryBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): Vault.Page<T> defined in net.corda.core.messaging.CordaRPCOps[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'criteria' @ [117:29] ==> value-parameter criteria: QueryCriteria defined in net.corda.core.messaging.CordaRPCOps.vaultQueryByWithSorting[ValueParameterDescriptorImpl]

'PageSpecification' @ [117:39] ==> public constructor PageSpecification(pageNumber: Int = ..., pageSize: Int = ...) defined in net.corda.core.node.services.vault.PageSpecification[ClassConstructorDescriptorImpl]

'sorting' @ [117:60] ==> value-parameter sorting: Sort defined in net.corda.core.messaging.CordaRPCOps.vaultQueryByWithSorting[ValueParameterDescriptorImpl]

'contractType' @ [117:69] ==> value-parameter contractType: Class<out T> defined in net.corda.core.messaging.CordaRPCOps.vaultQueryByWithSorting[ValueParameterDescriptorImpl]

'RPCReturnsObservables' @ [134:5] ==> public constructor RPCReturnsObservables() defined in net.corda.core.messaging.RPCReturnsObservables[ClassConstructorDescriptorImpl]

'vaultTrackBy' @ [146:16] ==> @RPCReturnsObservables public abstract fun <T : ContractState> vaultTrackBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): DataFeed<Vault.Page<T>, Vault.Update<T>> defined in net.corda.core.messaging.CordaRPCOps[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'VaultQueryCriteria' @ [146:43] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[ClassConstructorDescriptorImpl]

'PageSpecification' @ [146:65] ==> public constructor PageSpecification(pageNumber: Int = ..., pageSize: Int = ...) defined in net.corda.core.node.services.vault.PageSpecification[ClassConstructorDescriptorImpl]

'Sort' @ [146:86] ==> public constructor Sort(columns: Collection<Sort.SortColumn>) defined in net.corda.core.node.services.vault.Sort[ClassConstructorDescriptorImpl]

'emptySet' @ [146:91] ==> public fun <T> emptySet(): Set<Sort.SortColumn> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SortColumn

'contractType' @ [146:104] ==> value-parameter contractType: Class<out T> defined in net.corda.core.messaging.CordaRPCOps.vaultTrack[ValueParameterDescriptorImpl]

'vaultTrackBy' @ [149:16] ==> @RPCReturnsObservables public abstract fun <T : ContractState> vaultTrackBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): DataFeed<Vault.Page<T>, Vault.Update<T>> defined in net.corda.core.messaging.CordaRPCOps[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'criteria' @ [149:29] ==> value-parameter criteria: QueryCriteria defined in net.corda.core.messaging.CordaRPCOps.vaultTrackByCriteria[ValueParameterDescriptorImpl]

'PageSpecification' @ [149:39] ==> public constructor PageSpecification(pageNumber: Int = ..., pageSize: Int = ...) defined in net.corda.core.node.services.vault.PageSpecification[ClassConstructorDescriptorImpl]

'Sort' @ [149:60] ==> public constructor Sort(columns: Collection<Sort.SortColumn>) defined in net.corda.core.node.services.vault.Sort[ClassConstructorDescriptorImpl]

'emptySet' @ [149:65] ==> public fun <T> emptySet(): Set<Sort.SortColumn> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SortColumn

'contractType' @ [149:78] ==> value-parameter contractType: Class<out T> defined in net.corda.core.messaging.CordaRPCOps.vaultTrackByCriteria[ValueParameterDescriptorImpl]

'vaultTrackBy' @ [152:16] ==> @RPCReturnsObservables public abstract fun <T : ContractState> vaultTrackBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): DataFeed<Vault.Page<T>, Vault.Update<T>> defined in net.corda.core.messaging.CordaRPCOps[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'criteria' @ [152:29] ==> value-parameter criteria: QueryCriteria defined in net.corda.core.messaging.CordaRPCOps.vaultTrackByWithPagingSpec[ValueParameterDescriptorImpl]

'paging' @ [152:39] ==> value-parameter paging: PageSpecification defined in net.corda.core.messaging.CordaRPCOps.vaultTrackByWithPagingSpec[ValueParameterDescriptorImpl]

'Sort' @ [152:47] ==> public constructor Sort(columns: Collection<Sort.SortColumn>) defined in net.corda.core.node.services.vault.Sort[ClassConstructorDescriptorImpl]

'emptySet' @ [152:52] ==> public fun <T> emptySet(): Set<Sort.SortColumn> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SortColumn

'contractType' @ [152:65] ==> value-parameter contractType: Class<out T> defined in net.corda.core.messaging.CordaRPCOps.vaultTrackByWithPagingSpec[ValueParameterDescriptorImpl]

'vaultTrackBy' @ [155:16] ==> @RPCReturnsObservables public abstract fun <T : ContractState> vaultTrackBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): DataFeed<Vault.Page<T>, Vault.Update<T>> defined in net.corda.core.messaging.CordaRPCOps[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'criteria' @ [155:29] ==> value-parameter criteria: QueryCriteria defined in net.corda.core.messaging.CordaRPCOps.vaultTrackByWithSorting[ValueParameterDescriptorImpl]

'PageSpecification' @ [155:39] ==> public constructor PageSpecification(pageNumber: Int = ..., pageSize: Int = ...) defined in net.corda.core.node.services.vault.PageSpecification[ClassConstructorDescriptorImpl]

'sorting' @ [155:60] ==> value-parameter sorting: Sort defined in net.corda.core.messaging.CordaRPCOps.vaultTrackByWithSorting[ValueParameterDescriptorImpl]

'contractType' @ [155:69] ==> value-parameter contractType: Class<out T> defined in net.corda.core.messaging.CordaRPCOps.vaultTrackByWithSorting[ValueParameterDescriptorImpl]

'RPCReturnsObservables' @ [167:5] ==> public constructor RPCReturnsObservables() defined in net.corda.core.messaging.RPCReturnsObservables[ClassConstructorDescriptorImpl]

'RPCReturnsObservables' @ [179:5] ==> public constructor RPCReturnsObservables() defined in net.corda.core.messaging.RPCReturnsObservables[ClassConstructorDescriptorImpl]

'RPCReturnsObservables' @ [190:5] ==> public constructor RPCReturnsObservables() defined in net.corda.core.messaging.RPCReturnsObservables[ClassConstructorDescriptorImpl]

'RPCReturnsObservables' @ [196:5] ==> public constructor RPCReturnsObservables() defined in net.corda.core.messaging.RPCReturnsObservables[ClassConstructorDescriptorImpl]

'RPCReturnsObservables' @ [203:5] ==> public constructor RPCReturnsObservables() defined in net.corda.core.messaging.RPCReturnsObservables[ClassConstructorDescriptorImpl]

'RPCReturnsObservables' @ [259:5] ==> public constructor RPCReturnsObservables() defined in net.corda.core.messaging.RPCReturnsObservables[ClassConstructorDescriptorImpl]

'VaultQueryCriteria' @ [304:105] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[ClassConstructorDescriptorImpl]

'PageSpecification' @ [305:93] ==> public constructor PageSpecification(pageNumber: Int = ..., pageSize: Int = ...) defined in net.corda.core.node.services.vault.PageSpecification[ClassConstructorDescriptorImpl]

'Sort' @ [306:81] ==> public constructor Sort(columns: Collection<Sort.SortColumn>) defined in net.corda.core.node.services.vault.Sort[ClassConstructorDescriptorImpl]

'emptySet' @ [306:86] ==> public fun <T> emptySet(): Set<Sort.SortColumn> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SortColumn

'vaultQueryBy' @ [307:12] ==> @RPCReturnsObservables public abstract fun <T : ContractState> vaultQueryBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): Vault.Page<T> defined in net.corda.core.messaging.CordaRPCOps[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'criteria' @ [307:25] ==> value-parameter criteria: QueryCriteria = ... defined in net.corda.core.messaging.vaultQueryBy[ValueParameterDescriptorImpl]

'paging' @ [307:35] ==> value-parameter paging: PageSpecification = ... defined in net.corda.core.messaging.vaultQueryBy[ValueParameterDescriptorImpl]

'sorting' @ [307:43] ==> value-parameter sorting: Sort = ... defined in net.corda.core.messaging.vaultQueryBy[ValueParameterDescriptorImpl]

'java' @ [307:61] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'VaultQueryCriteria' @ [310:105] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[ClassConstructorDescriptorImpl]

'PageSpecification' @ [311:93] ==> public constructor PageSpecification(pageNumber: Int = ..., pageSize: Int = ...) defined in net.corda.core.node.services.vault.PageSpecification[ClassConstructorDescriptorImpl]

'Sort' @ [312:81] ==> public constructor Sort(columns: Collection<Sort.SortColumn>) defined in net.corda.core.node.services.vault.Sort[ClassConstructorDescriptorImpl]

'emptySet' @ [312:86] ==> public fun <T> emptySet(): Set<Sort.SortColumn> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SortColumn

'vaultTrackBy' @ [313:12] ==> @RPCReturnsObservables public abstract fun <T : ContractState> vaultTrackBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): DataFeed<Vault.Page<T>, Vault.Update<T>> defined in net.corda.core.messaging.CordaRPCOps[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'criteria' @ [313:25] ==> value-parameter criteria: QueryCriteria = ... defined in net.corda.core.messaging.vaultTrackBy[ValueParameterDescriptorImpl]

'paging' @ [313:35] ==> value-parameter paging: PageSpecification = ... defined in net.corda.core.messaging.vaultTrackBy[ValueParameterDescriptorImpl]

'sorting' @ [313:43] ==> value-parameter sorting: Sort = ... defined in net.corda.core.messaging.vaultTrackBy[ValueParameterDescriptorImpl]

'java' @ [313:61] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'Suppress' @ [326:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'startFlowDynamic' @ [328:20] ==> @RPCReturnsObservables public abstract fun <T : Any> startFlowDynamic(logicType: Class<out FlowLogic<T>>, vararg args: Any?): FlowHandle<T> defined in net.corda.core.messaging.CordaRPCOps[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'java' @ [328:46] ==> public val <T> KClass<R>.java: Class<R> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> R

'Suppress' @ [331:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'startFlowDynamic' @ [334:20] ==> @RPCReturnsObservables public abstract fun <T : Any> startFlowDynamic(logicType: Class<out FlowLogic<T>>, vararg args: Any?): FlowHandle<T> defined in net.corda.core.messaging.CordaRPCOps[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'java' @ [334:46] ==> public val <T> KClass<R>.java: Class<R> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> R

'arg0' @ [334:52] ==> value-parameter arg0: A defined in net.corda.core.messaging.startFlow[ValueParameterDescriptorImpl]

'Suppress' @ [337:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'startFlowDynamic' @ [341:20] ==> @RPCReturnsObservables public abstract fun <T : Any> startFlowDynamic(logicType: Class<out FlowLogic<T>>, vararg args: Any?): FlowHandle<T> defined in net.corda.core.messaging.CordaRPCOps[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'java' @ [341:46] ==> public val <T> KClass<R>.java: Class<R> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> R

'arg0' @ [341:52] ==> value-parameter arg0: A defined in net.corda.core.messaging.startFlow[ValueParameterDescriptorImpl]

'arg1' @ [341:58] ==> value-parameter arg1: B defined in net.corda.core.messaging.startFlow[ValueParameterDescriptorImpl]

'Suppress' @ [344:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'startFlowDynamic' @ [349:20] ==> @RPCReturnsObservables public abstract fun <T : Any> startFlowDynamic(logicType: Class<out FlowLogic<T>>, vararg args: Any?): FlowHandle<T> defined in net.corda.core.messaging.CordaRPCOps[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'java' @ [349:46] ==> public val <T> KClass<R>.java: Class<R> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> R

'arg0' @ [349:52] ==> value-parameter arg0: A defined in net.corda.core.messaging.startFlow[ValueParameterDescriptorImpl]

'arg1' @ [349:58] ==> value-parameter arg1: B defined in net.corda.core.messaging.startFlow[ValueParameterDescriptorImpl]

'arg2' @ [349:64] ==> value-parameter arg2: C defined in net.corda.core.messaging.startFlow[ValueParameterDescriptorImpl]

'Suppress' @ [352:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'startFlowDynamic' @ [358:20] ==> @RPCReturnsObservables public abstract fun <T : Any> startFlowDynamic(logicType: Class<out FlowLogic<T>>, vararg args: Any?): FlowHandle<T> defined in net.corda.core.messaging.CordaRPCOps[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'java' @ [358:46] ==> public val <T> KClass<R>.java: Class<R> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> R

'arg0' @ [358:52] ==> value-parameter arg0: A defined in net.corda.core.messaging.startFlow[ValueParameterDescriptorImpl]

'arg1' @ [358:58] ==> value-parameter arg1: B defined in net.corda.core.messaging.startFlow[ValueParameterDescriptorImpl]

'arg2' @ [358:64] ==> value-parameter arg2: C defined in net.corda.core.messaging.startFlow[ValueParameterDescriptorImpl]

'arg3' @ [358:70] ==> value-parameter arg3: D defined in net.corda.core.messaging.startFlow[ValueParameterDescriptorImpl]

'Suppress' @ [361:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'startFlowDynamic' @ [368:20] ==> @RPCReturnsObservables public abstract fun <T : Any> startFlowDynamic(logicType: Class<out FlowLogic<T>>, vararg args: Any?): FlowHandle<T> defined in net.corda.core.messaging.CordaRPCOps[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'java' @ [368:46] ==> public val <T> KClass<R>.java: Class<R> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> R

'arg0' @ [368:52] ==> value-parameter arg0: A defined in net.corda.core.messaging.startFlow[ValueParameterDescriptorImpl]

'arg1' @ [368:58] ==> value-parameter arg1: B defined in net.corda.core.messaging.startFlow[ValueParameterDescriptorImpl]

'arg2' @ [368:64] ==> value-parameter arg2: C defined in net.corda.core.messaging.startFlow[ValueParameterDescriptorImpl]

'arg3' @ [368:70] ==> value-parameter arg3: D defined in net.corda.core.messaging.startFlow[ValueParameterDescriptorImpl]

'arg4' @ [368:76] ==> value-parameter arg4: E defined in net.corda.core.messaging.startFlow[ValueParameterDescriptorImpl]

'Suppress' @ [371:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'startFlowDynamic' @ [379:20] ==> @RPCReturnsObservables public abstract fun <T : Any> startFlowDynamic(logicType: Class<out FlowLogic<T>>, vararg args: Any?): FlowHandle<T> defined in net.corda.core.messaging.CordaRPCOps[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'java' @ [379:46] ==> public val <T> KClass<R>.java: Class<R> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> R

'arg0' @ [379:52] ==> value-parameter arg0: A defined in net.corda.core.messaging.startFlow[ValueParameterDescriptorImpl]

'arg1' @ [379:58] ==> value-parameter arg1: B defined in net.corda.core.messaging.startFlow[ValueParameterDescriptorImpl]

'arg2' @ [379:64] ==> value-parameter arg2: C defined in net.corda.core.messaging.startFlow[ValueParameterDescriptorImpl]

'arg3' @ [379:70] ==> value-parameter arg3: D defined in net.corda.core.messaging.startFlow[ValueParameterDescriptorImpl]

'arg4' @ [379:76] ==> value-parameter arg4: E defined in net.corda.core.messaging.startFlow[ValueParameterDescriptorImpl]

'arg5' @ [379:82] ==> value-parameter arg5: F defined in net.corda.core.messaging.startFlow[ValueParameterDescriptorImpl]

'Suppress' @ [384:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [386:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'startTrackedFlowDynamic' @ [388:28] ==> @RPCReturnsObservables public abstract fun <T : Any> startTrackedFlowDynamic(logicType: Class<out FlowLogic<T>>, vararg args: Any?): FlowProgressHandle<T> defined in net.corda.core.messaging.CordaRPCOps[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'java' @ [388:61] ==> public val <T> KClass<R>.java: Class<R> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> R

'Suppress' @ [390:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [392:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'startTrackedFlowDynamic' @ [395:28] ==> @RPCReturnsObservables public abstract fun <T : Any> startTrackedFlowDynamic(logicType: Class<out FlowLogic<T>>, vararg args: Any?): FlowProgressHandle<T> defined in net.corda.core.messaging.CordaRPCOps[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'java' @ [395:61] ==> public val <T> KClass<R>.java: Class<R> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> R

'arg0' @ [395:67] ==> value-parameter arg0: A defined in net.corda.core.messaging.startTrackedFlow[ValueParameterDescriptorImpl]

'Suppress' @ [397:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [399:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'startTrackedFlowDynamic' @ [403:28] ==> @RPCReturnsObservables public abstract fun <T : Any> startTrackedFlowDynamic(logicType: Class<out FlowLogic<T>>, vararg args: Any?): FlowProgressHandle<T> defined in net.corda.core.messaging.CordaRPCOps[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'java' @ [403:61] ==> public val <T> KClass<R>.java: Class<R> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> R

'arg0' @ [403:67] ==> value-parameter arg0: A defined in net.corda.core.messaging.startTrackedFlow[ValueParameterDescriptorImpl]

'arg1' @ [403:73] ==> value-parameter arg1: B defined in net.corda.core.messaging.startTrackedFlow[ValueParameterDescriptorImpl]

'Suppress' @ [405:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [407:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'startTrackedFlowDynamic' @ [412:28] ==> @RPCReturnsObservables public abstract fun <T : Any> startTrackedFlowDynamic(logicType: Class<out FlowLogic<T>>, vararg args: Any?): FlowProgressHandle<T> defined in net.corda.core.messaging.CordaRPCOps[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'java' @ [412:61] ==> public val <T> KClass<R>.java: Class<R> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> R

'arg0' @ [412:67] ==> value-parameter arg0: A defined in net.corda.core.messaging.startTrackedFlow[ValueParameterDescriptorImpl]

'arg1' @ [412:73] ==> value-parameter arg1: B defined in net.corda.core.messaging.startTrackedFlow[ValueParameterDescriptorImpl]

'arg2' @ [412:79] ==> value-parameter arg2: C defined in net.corda.core.messaging.startTrackedFlow[ValueParameterDescriptorImpl]

'Suppress' @ [414:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [416:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'startTrackedFlowDynamic' @ [422:28] ==> @RPCReturnsObservables public abstract fun <T : Any> startTrackedFlowDynamic(logicType: Class<out FlowLogic<T>>, vararg args: Any?): FlowProgressHandle<T> defined in net.corda.core.messaging.CordaRPCOps[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'java' @ [422:61] ==> public val <T> KClass<R>.java: Class<R> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> R

'arg0' @ [422:67] ==> value-parameter arg0: A defined in net.corda.core.messaging.startTrackedFlow[ValueParameterDescriptorImpl]

'arg1' @ [422:73] ==> value-parameter arg1: B defined in net.corda.core.messaging.startTrackedFlow[ValueParameterDescriptorImpl]

'arg2' @ [422:79] ==> value-parameter arg2: C defined in net.corda.core.messaging.startTrackedFlow[ValueParameterDescriptorImpl]

'arg3' @ [422:85] ==> value-parameter arg3: D defined in net.corda.core.messaging.startTrackedFlow[ValueParameterDescriptorImpl]

'Suppress' @ [424:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [426:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'startTrackedFlowDynamic' @ [433:28] ==> @RPCReturnsObservables public abstract fun <T : Any> startTrackedFlowDynamic(logicType: Class<out FlowLogic<T>>, vararg args: Any?): FlowProgressHandle<T> defined in net.corda.core.messaging.CordaRPCOps[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'java' @ [433:61] ==> public val <T> KClass<R>.java: Class<R> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> R

'arg0' @ [433:67] ==> value-parameter arg0: A defined in net.corda.core.messaging.startTrackedFlow[ValueParameterDescriptorImpl]

'arg1' @ [433:73] ==> value-parameter arg1: B defined in net.corda.core.messaging.startTrackedFlow[ValueParameterDescriptorImpl]

'arg2' @ [433:79] ==> value-parameter arg2: C defined in net.corda.core.messaging.startTrackedFlow[ValueParameterDescriptorImpl]

'arg3' @ [433:85] ==> value-parameter arg3: D defined in net.corda.core.messaging.startTrackedFlow[ValueParameterDescriptorImpl]

'arg4' @ [433:91] ==> value-parameter arg4: E defined in net.corda.core.messaging.startTrackedFlow[ValueParameterDescriptorImpl]

'Suppress' @ [435:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [437:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'startTrackedFlowDynamic' @ [445:28] ==> @RPCReturnsObservables public abstract fun <T : Any> startTrackedFlowDynamic(logicType: Class<out FlowLogic<T>>, vararg args: Any?): FlowProgressHandle<T> defined in net.corda.core.messaging.CordaRPCOps[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'java' @ [445:61] ==> public val <T> KClass<R>.java: Class<R> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> R

'arg0' @ [445:67] ==> value-parameter arg0: A defined in net.corda.core.messaging.startTrackedFlow[ValueParameterDescriptorImpl]

'arg1' @ [445:73] ==> value-parameter arg1: B defined in net.corda.core.messaging.startTrackedFlow[ValueParameterDescriptorImpl]

'arg2' @ [445:79] ==> value-parameter arg2: C defined in net.corda.core.messaging.startTrackedFlow[ValueParameterDescriptorImpl]

'arg3' @ [445:85] ==> value-parameter arg3: D defined in net.corda.core.messaging.startTrackedFlow[ValueParameterDescriptorImpl]

'arg4' @ [445:91] ==> value-parameter arg4: E defined in net.corda.core.messaging.startTrackedFlow[ValueParameterDescriptorImpl]

'arg5' @ [445:97] ==> value-parameter arg5: F defined in net.corda.core.messaging.startTrackedFlow[ValueParameterDescriptorImpl]

'CordaSerializable' @ [450:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

