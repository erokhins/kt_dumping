'Throws' @ [32:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'VaultQueryException' @ [32:13] ==> public constructor VaultQueryException(description: String) defined in net.corda.core.node.services.VaultQueryException[ClassConstructorDescriptorImpl]

'Throws' @ [50:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'VaultQueryException' @ [50:13] ==> public constructor VaultQueryException(description: String) defined in net.corda.core.node.services.VaultQueryException[ClassConstructorDescriptorImpl]

'_queryBy' @ [60:16] ==> @Throws public abstract fun <T : ContractState> _queryBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): Vault.Page<T> defined in net.corda.core.node.services.VaultQueryService[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'VaultQueryCriteria' @ [60:39] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[ClassConstructorDescriptorImpl]

'PageSpecification' @ [60:61] ==> public constructor PageSpecification(pageNumber: Int = ..., pageSize: Int = ...) defined in net.corda.core.node.services.vault.PageSpecification[ClassConstructorDescriptorImpl]

'Sort' @ [60:82] ==> public constructor Sort(columns: Collection<Sort.SortColumn>) defined in net.corda.core.node.services.vault.Sort[ClassConstructorDescriptorImpl]

'emptySet' @ [60:87] ==> public fun <T> emptySet(): Set<Sort.SortColumn> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SortColumn

'contractType' @ [60:100] ==> value-parameter contractType: Class<out T> defined in net.corda.core.node.services.VaultQueryService.queryBy[ValueParameterDescriptorImpl]

'_queryBy' @ [64:16] ==> @Throws public abstract fun <T : ContractState> _queryBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): Vault.Page<T> defined in net.corda.core.node.services.VaultQueryService[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'criteria' @ [64:25] ==> value-parameter criteria: QueryCriteria defined in net.corda.core.node.services.VaultQueryService.queryBy[ValueParameterDescriptorImpl]

'PageSpecification' @ [64:35] ==> public constructor PageSpecification(pageNumber: Int = ..., pageSize: Int = ...) defined in net.corda.core.node.services.vault.PageSpecification[ClassConstructorDescriptorImpl]

'Sort' @ [64:56] ==> public constructor Sort(columns: Collection<Sort.SortColumn>) defined in net.corda.core.node.services.vault.Sort[ClassConstructorDescriptorImpl]

'emptySet' @ [64:61] ==> public fun <T> emptySet(): Set<Sort.SortColumn> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SortColumn

'contractType' @ [64:74] ==> value-parameter contractType: Class<out T> defined in net.corda.core.node.services.VaultQueryService.queryBy[ValueParameterDescriptorImpl]

'_queryBy' @ [68:16] ==> @Throws public abstract fun <T : ContractState> _queryBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): Vault.Page<T> defined in net.corda.core.node.services.VaultQueryService[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'criteria' @ [68:25] ==> value-parameter criteria: QueryCriteria defined in net.corda.core.node.services.VaultQueryService.queryBy[ValueParameterDescriptorImpl]

'paging' @ [68:35] ==> value-parameter paging: PageSpecification defined in net.corda.core.node.services.VaultQueryService.queryBy[ValueParameterDescriptorImpl]

'Sort' @ [68:43] ==> public constructor Sort(columns: Collection<Sort.SortColumn>) defined in net.corda.core.node.services.vault.Sort[ClassConstructorDescriptorImpl]

'emptySet' @ [68:48] ==> public fun <T> emptySet(): Set<Sort.SortColumn> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SortColumn

'contractType' @ [68:61] ==> value-parameter contractType: Class<out T> defined in net.corda.core.node.services.VaultQueryService.queryBy[ValueParameterDescriptorImpl]

'_queryBy' @ [72:16] ==> @Throws public abstract fun <T : ContractState> _queryBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): Vault.Page<T> defined in net.corda.core.node.services.VaultQueryService[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'criteria' @ [72:25] ==> value-parameter criteria: QueryCriteria defined in net.corda.core.node.services.VaultQueryService.queryBy[ValueParameterDescriptorImpl]

'PageSpecification' @ [72:35] ==> public constructor PageSpecification(pageNumber: Int = ..., pageSize: Int = ...) defined in net.corda.core.node.services.vault.PageSpecification[ClassConstructorDescriptorImpl]

'sorting' @ [72:56] ==> value-parameter sorting: Sort defined in net.corda.core.node.services.VaultQueryService.queryBy[ValueParameterDescriptorImpl]

'contractType' @ [72:65] ==> value-parameter contractType: Class<out T> defined in net.corda.core.node.services.VaultQueryService.queryBy[ValueParameterDescriptorImpl]

'_queryBy' @ [76:16] ==> @Throws public abstract fun <T : ContractState> _queryBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): Vault.Page<T> defined in net.corda.core.node.services.VaultQueryService[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'criteria' @ [76:25] ==> value-parameter criteria: QueryCriteria defined in net.corda.core.node.services.VaultQueryService.queryBy[ValueParameterDescriptorImpl]

'paging' @ [76:35] ==> value-parameter paging: PageSpecification defined in net.corda.core.node.services.VaultQueryService.queryBy[ValueParameterDescriptorImpl]

'sorting' @ [76:43] ==> value-parameter sorting: Sort defined in net.corda.core.node.services.VaultQueryService.queryBy[ValueParameterDescriptorImpl]

'contractType' @ [76:52] ==> value-parameter contractType: Class<out T> defined in net.corda.core.node.services.VaultQueryService.queryBy[ValueParameterDescriptorImpl]

'_trackBy' @ [80:16] ==> @Throws public abstract fun <T : ContractState> _trackBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): DataFeed<Vault.Page<T>, Vault.Update<T>> defined in net.corda.core.node.services.VaultQueryService[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'VaultQueryCriteria' @ [80:39] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[ClassConstructorDescriptorImpl]

'PageSpecification' @ [80:61] ==> public constructor PageSpecification(pageNumber: Int = ..., pageSize: Int = ...) defined in net.corda.core.node.services.vault.PageSpecification[ClassConstructorDescriptorImpl]

'Sort' @ [80:82] ==> public constructor Sort(columns: Collection<Sort.SortColumn>) defined in net.corda.core.node.services.vault.Sort[ClassConstructorDescriptorImpl]

'emptySet' @ [80:87] ==> public fun <T> emptySet(): Set<Sort.SortColumn> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SortColumn

'contractType' @ [80:100] ==> value-parameter contractType: Class<out T> defined in net.corda.core.node.services.VaultQueryService.trackBy[ValueParameterDescriptorImpl]

'_trackBy' @ [84:16] ==> @Throws public abstract fun <T : ContractState> _trackBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): DataFeed<Vault.Page<T>, Vault.Update<T>> defined in net.corda.core.node.services.VaultQueryService[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'criteria' @ [84:25] ==> value-parameter criteria: QueryCriteria defined in net.corda.core.node.services.VaultQueryService.trackBy[ValueParameterDescriptorImpl]

'PageSpecification' @ [84:35] ==> public constructor PageSpecification(pageNumber: Int = ..., pageSize: Int = ...) defined in net.corda.core.node.services.vault.PageSpecification[ClassConstructorDescriptorImpl]

'Sort' @ [84:56] ==> public constructor Sort(columns: Collection<Sort.SortColumn>) defined in net.corda.core.node.services.vault.Sort[ClassConstructorDescriptorImpl]

'emptySet' @ [84:61] ==> public fun <T> emptySet(): Set<Sort.SortColumn> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SortColumn

'contractType' @ [84:74] ==> value-parameter contractType: Class<out T> defined in net.corda.core.node.services.VaultQueryService.trackBy[ValueParameterDescriptorImpl]

'_trackBy' @ [88:16] ==> @Throws public abstract fun <T : ContractState> _trackBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): DataFeed<Vault.Page<T>, Vault.Update<T>> defined in net.corda.core.node.services.VaultQueryService[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'criteria' @ [88:25] ==> value-parameter criteria: QueryCriteria defined in net.corda.core.node.services.VaultQueryService.trackBy[ValueParameterDescriptorImpl]

'paging' @ [88:35] ==> value-parameter paging: PageSpecification defined in net.corda.core.node.services.VaultQueryService.trackBy[ValueParameterDescriptorImpl]

'Sort' @ [88:43] ==> public constructor Sort(columns: Collection<Sort.SortColumn>) defined in net.corda.core.node.services.vault.Sort[ClassConstructorDescriptorImpl]

'emptySet' @ [88:48] ==> public fun <T> emptySet(): Set<Sort.SortColumn> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SortColumn

'contractType' @ [88:61] ==> value-parameter contractType: Class<out T> defined in net.corda.core.node.services.VaultQueryService.trackBy[ValueParameterDescriptorImpl]

'_trackBy' @ [92:16] ==> @Throws public abstract fun <T : ContractState> _trackBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): DataFeed<Vault.Page<T>, Vault.Update<T>> defined in net.corda.core.node.services.VaultQueryService[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'criteria' @ [92:25] ==> value-parameter criteria: QueryCriteria defined in net.corda.core.node.services.VaultQueryService.trackBy[ValueParameterDescriptorImpl]

'PageSpecification' @ [92:35] ==> public constructor PageSpecification(pageNumber: Int = ..., pageSize: Int = ...) defined in net.corda.core.node.services.vault.PageSpecification[ClassConstructorDescriptorImpl]

'sorting' @ [92:56] ==> value-parameter sorting: Sort defined in net.corda.core.node.services.VaultQueryService.trackBy[ValueParameterDescriptorImpl]

'contractType' @ [92:65] ==> value-parameter contractType: Class<out T> defined in net.corda.core.node.services.VaultQueryService.trackBy[ValueParameterDescriptorImpl]

'_trackBy' @ [96:16] ==> @Throws public abstract fun <T : ContractState> _trackBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): DataFeed<Vault.Page<T>, Vault.Update<T>> defined in net.corda.core.node.services.VaultQueryService[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'criteria' @ [96:25] ==> value-parameter criteria: QueryCriteria defined in net.corda.core.node.services.VaultQueryService.trackBy[ValueParameterDescriptorImpl]

'paging' @ [96:35] ==> value-parameter paging: PageSpecification defined in net.corda.core.node.services.VaultQueryService.trackBy[ValueParameterDescriptorImpl]

'sorting' @ [96:43] ==> value-parameter sorting: Sort defined in net.corda.core.node.services.VaultQueryService.trackBy[ValueParameterDescriptorImpl]

'contractType' @ [96:52] ==> value-parameter contractType: Class<out T> defined in net.corda.core.node.services.VaultQueryService.trackBy[ValueParameterDescriptorImpl]

'_queryBy' @ [101:12] ==> @Throws public abstract fun <T : ContractState> _queryBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): Vault.Page<T> defined in net.corda.core.node.services.VaultQueryService[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'VaultQueryCriteria' @ [101:35] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[ClassConstructorDescriptorImpl]

'PageSpecification' @ [101:57] ==> public constructor PageSpecification(pageNumber: Int = ..., pageSize: Int = ...) defined in net.corda.core.node.services.vault.PageSpecification[ClassConstructorDescriptorImpl]

'Sort' @ [101:78] ==> public constructor Sort(columns: Collection<Sort.SortColumn>) defined in net.corda.core.node.services.vault.Sort[ClassConstructorDescriptorImpl]

'emptySet' @ [101:83] ==> public fun <T> emptySet(): Set<Sort.SortColumn> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SortColumn

'java' @ [101:105] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'_queryBy' @ [105:12] ==> @Throws public abstract fun <T : ContractState> _queryBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): Vault.Page<T> defined in net.corda.core.node.services.VaultQueryService[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'criteria' @ [105:21] ==> value-parameter criteria: QueryCriteria defined in net.corda.core.node.services.queryBy[ValueParameterDescriptorImpl]

'PageSpecification' @ [105:31] ==> public constructor PageSpecification(pageNumber: Int = ..., pageSize: Int = ...) defined in net.corda.core.node.services.vault.PageSpecification[ClassConstructorDescriptorImpl]

'Sort' @ [105:52] ==> public constructor Sort(columns: Collection<Sort.SortColumn>) defined in net.corda.core.node.services.vault.Sort[ClassConstructorDescriptorImpl]

'emptySet' @ [105:57] ==> public fun <T> emptySet(): Set<Sort.SortColumn> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SortColumn

'java' @ [105:79] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'_queryBy' @ [109:12] ==> @Throws public abstract fun <T : ContractState> _queryBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): Vault.Page<T> defined in net.corda.core.node.services.VaultQueryService[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'criteria' @ [109:21] ==> value-parameter criteria: QueryCriteria defined in net.corda.core.node.services.queryBy[ValueParameterDescriptorImpl]

'paging' @ [109:31] ==> value-parameter paging: PageSpecification defined in net.corda.core.node.services.queryBy[ValueParameterDescriptorImpl]

'Sort' @ [109:39] ==> public constructor Sort(columns: Collection<Sort.SortColumn>) defined in net.corda.core.node.services.vault.Sort[ClassConstructorDescriptorImpl]

'emptySet' @ [109:44] ==> public fun <T> emptySet(): Set<Sort.SortColumn> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SortColumn

'java' @ [109:66] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'_queryBy' @ [113:12] ==> @Throws public abstract fun <T : ContractState> _queryBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): Vault.Page<T> defined in net.corda.core.node.services.VaultQueryService[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'criteria' @ [113:21] ==> value-parameter criteria: QueryCriteria defined in net.corda.core.node.services.queryBy[ValueParameterDescriptorImpl]

'PageSpecification' @ [113:31] ==> public constructor PageSpecification(pageNumber: Int = ..., pageSize: Int = ...) defined in net.corda.core.node.services.vault.PageSpecification[ClassConstructorDescriptorImpl]

'sorting' @ [113:52] ==> value-parameter sorting: Sort defined in net.corda.core.node.services.queryBy[ValueParameterDescriptorImpl]

'java' @ [113:70] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'_queryBy' @ [117:12] ==> @Throws public abstract fun <T : ContractState> _queryBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): Vault.Page<T> defined in net.corda.core.node.services.VaultQueryService[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'criteria' @ [117:21] ==> value-parameter criteria: QueryCriteria defined in net.corda.core.node.services.queryBy[ValueParameterDescriptorImpl]

'paging' @ [117:31] ==> value-parameter paging: PageSpecification defined in net.corda.core.node.services.queryBy[ValueParameterDescriptorImpl]

'sorting' @ [117:39] ==> value-parameter sorting: Sort defined in net.corda.core.node.services.queryBy[ValueParameterDescriptorImpl]

'java' @ [117:57] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'_trackBy' @ [121:12] ==> @Throws public abstract fun <T : ContractState> _trackBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): DataFeed<Vault.Page<T>, Vault.Update<T>> defined in net.corda.core.node.services.VaultQueryService[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'VaultQueryCriteria' @ [121:35] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[ClassConstructorDescriptorImpl]

'PageSpecification' @ [121:57] ==> public constructor PageSpecification(pageNumber: Int = ..., pageSize: Int = ...) defined in net.corda.core.node.services.vault.PageSpecification[ClassConstructorDescriptorImpl]

'Sort' @ [121:78] ==> public constructor Sort(columns: Collection<Sort.SortColumn>) defined in net.corda.core.node.services.vault.Sort[ClassConstructorDescriptorImpl]

'emptySet' @ [121:83] ==> public fun <T> emptySet(): Set<Sort.SortColumn> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SortColumn

'java' @ [121:105] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'_trackBy' @ [125:12] ==> @Throws public abstract fun <T : ContractState> _trackBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): DataFeed<Vault.Page<T>, Vault.Update<T>> defined in net.corda.core.node.services.VaultQueryService[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'criteria' @ [125:21] ==> value-parameter criteria: QueryCriteria defined in net.corda.core.node.services.trackBy[ValueParameterDescriptorImpl]

'PageSpecification' @ [125:31] ==> public constructor PageSpecification(pageNumber: Int = ..., pageSize: Int = ...) defined in net.corda.core.node.services.vault.PageSpecification[ClassConstructorDescriptorImpl]

'Sort' @ [125:52] ==> public constructor Sort(columns: Collection<Sort.SortColumn>) defined in net.corda.core.node.services.vault.Sort[ClassConstructorDescriptorImpl]

'emptySet' @ [125:57] ==> public fun <T> emptySet(): Set<Sort.SortColumn> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SortColumn

'java' @ [125:79] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'_trackBy' @ [129:12] ==> @Throws public abstract fun <T : ContractState> _trackBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): DataFeed<Vault.Page<T>, Vault.Update<T>> defined in net.corda.core.node.services.VaultQueryService[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'criteria' @ [129:21] ==> value-parameter criteria: QueryCriteria defined in net.corda.core.node.services.trackBy[ValueParameterDescriptorImpl]

'paging' @ [129:31] ==> value-parameter paging: PageSpecification defined in net.corda.core.node.services.trackBy[ValueParameterDescriptorImpl]

'Sort' @ [129:39] ==> public constructor Sort(columns: Collection<Sort.SortColumn>) defined in net.corda.core.node.services.vault.Sort[ClassConstructorDescriptorImpl]

'emptySet' @ [129:44] ==> public fun <T> emptySet(): Set<Sort.SortColumn> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SortColumn

'java' @ [129:66] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'_trackBy' @ [133:12] ==> @Throws public abstract fun <T : ContractState> _trackBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): DataFeed<Vault.Page<T>, Vault.Update<T>> defined in net.corda.core.node.services.VaultQueryService[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'criteria' @ [133:21] ==> value-parameter criteria: QueryCriteria defined in net.corda.core.node.services.trackBy[ValueParameterDescriptorImpl]

'PageSpecification' @ [133:31] ==> public constructor PageSpecification(pageNumber: Int = ..., pageSize: Int = ...) defined in net.corda.core.node.services.vault.PageSpecification[ClassConstructorDescriptorImpl]

'sorting' @ [133:52] ==> value-parameter sorting: Sort defined in net.corda.core.node.services.trackBy[ValueParameterDescriptorImpl]

'java' @ [133:70] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'_trackBy' @ [137:12] ==> @Throws public abstract fun <T : ContractState> _trackBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): DataFeed<Vault.Page<T>, Vault.Update<T>> defined in net.corda.core.node.services.VaultQueryService[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'criteria' @ [137:21] ==> value-parameter criteria: QueryCriteria defined in net.corda.core.node.services.trackBy[ValueParameterDescriptorImpl]

'paging' @ [137:31] ==> value-parameter paging: PageSpecification defined in net.corda.core.node.services.trackBy[ValueParameterDescriptorImpl]

'sorting' @ [137:39] ==> value-parameter sorting: Sort defined in net.corda.core.node.services.trackBy[ValueParameterDescriptorImpl]

'java' @ [137:57] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'FlowException' @ [140:50] ==> public constructor FlowException(message: String?) defined in net.corda.core.flows.FlowException[ClassConstructorDescriptorImpl]

'description' @ [140:64] ==> value-parameter description: String defined in net.corda.core.node.services.VaultQueryException.<init>[ValueParameterDescriptorImpl]

