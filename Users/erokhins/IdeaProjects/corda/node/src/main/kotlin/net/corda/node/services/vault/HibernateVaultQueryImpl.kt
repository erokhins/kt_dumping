'SingletonSerializeAsToken' @ [32:58] ==> public constructor SingletonSerializeAsToken() defined in net.corda.core.serialization.SingletonSerializeAsToken[DeserializedClassConstructorDescriptor]

'loggerFor' @ [34:19] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> HibernateVaultQueryImpl

'hibernateConfig' @ [37:34] ==> value-parameter hibernateConfig: HibernateConfiguration defined in net.corda.node.services.vault.HibernateVaultQueryImpl.<init>[ValueParameterDescriptorImpl]

'sessionFactoryForRegisteredSchemas' @ [37:50] ==> public final fun sessionFactoryForRegisteredSchemas(): SessionFactory defined in net.corda.node.services.database.HibernateConfiguration[SimpleFunctionDescriptorImpl]

'sessionFactory' @ [38:35] ==> private final val sessionFactory: SessionFactory defined in net.corda.node.services.vault.HibernateVaultQueryImpl[PropertyDescriptorImpl]

'criteriaBuilder' @ [38:50] ==> public final val SessionFactory.criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?)[MyPropertyDescriptor]

'bootstrapContractStateTypes' @ [44:40] ==> public final fun bootstrapContractStateTypes(): MutableMap<String, MutableSet<String>> defined in net.corda.node.services.vault.HibernateVaultQueryImpl[SimpleFunctionDescriptorImpl]

'vault' @ [47:9] ==> public final val vault: VaultService defined in net.corda.node.services.vault.HibernateVaultQueryImpl[PropertyDescriptorImpl]

'rawUpdates' @ [47:15] ==> public abstract val rawUpdates: Observable<Vault.Update<ContractState>> defined in net.corda.core.node.services.VaultService[DeserializedPropertyDescriptor]

'subscribe' @ [47:26] ==> public final fun subscribe(p0: (((Vault.Update<ContractState>..Vault.Update<ContractState>?)) -> Unit..(((Vault.Update<ContractState>..Vault.Update<ContractState>?)) -> Unit)?)): (Subscription..Subscription?) defined in rx.Observable[MyFunctionDescriptor]

'update' @ [48:13] ==> value-parameter update: (Vault.Update<ContractState>..Vault.Update<ContractState>?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl.<init>.<anonymous>[ValueParameterDescriptorImpl]

'produced' @ [48:20] ==> public final val produced: Set<StateAndRef<ContractState>> defined in net.corda.core.node.services.Vault.Update[DeserializedPropertyDescriptor]

'forEach' @ [48:29] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<ContractState>>.forEach(action: (StateAndRef<ContractState>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'it' @ [49:36] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.node.services.vault.HibernateVaultQueryImpl.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [49:39] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [49:45] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'javaClass' @ [49:50] ==> public val <T : Any> ContractState.javaClass: Class<ContractState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> ContractState

'log' @ [50:17] ==> public final val log: Logger defined in net.corda.node.services.vault.HibernateVaultQueryImpl.Companion[PropertyDescriptorImpl]

'trace' @ [50:21] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'concreteType' @ [50:53] ==> val concreteType: Class<ContractState> defined in net.corda.node.services.vault.HibernateVaultQueryImpl.<init>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'contractTypeMappings' @ [51:28] ==> private final val contractTypeMappings: MutableMap<String, MutableSet<String>> defined in net.corda.node.services.vault.HibernateVaultQueryImpl[PropertyDescriptorImpl]

'any' @ [51:49] ==> public inline fun <K, V> Map<out String, MutableSet<String>>.any(predicate: (Map.Entry<String, MutableSet<String>>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> MutableSet<String>

'it' @ [51:55] ==> value-parameter it: Map.Entry<String, MutableSet<String>> defined in net.corda.node.services.vault.HibernateVaultQueryImpl.<init>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [51:58] ==> public abstract val value: MutableSet<String> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'contains' @ [51:64] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'concreteType' @ [51:73] ==> val concreteType: Class<ContractState> defined in net.corda.node.services.vault.HibernateVaultQueryImpl.<init>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'name' @ [51:86] ==> public final val <T : (Any..Any?)> Class<ContractState>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ContractState

'!' @ [52:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'seen' @ [52:22] ==> val seen: Boolean defined in net.corda.node.services.vault.HibernateVaultQueryImpl.<init>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'deriveContractInterfaces' @ [53:46] ==> private final fun <T : ContractState> deriveContractInterfaces(clazz: Class<ContractState>): Set<Class<ContractState>> defined in net.corda.node.services.vault.HibernateVaultQueryImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> ContractState

'concreteType' @ [53:71] ==> val concreteType: Class<ContractState> defined in net.corda.node.services.vault.HibernateVaultQueryImpl.<init>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'contractInterfaces' @ [54:21] ==> val contractInterfaces: Set<Class<ContractState>> defined in net.corda.node.services.vault.HibernateVaultQueryImpl.<init>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'map' @ [54:40] ==> public inline fun <T, R> Iterable<Class<ContractState>>.map(transform: (Class<ContractState>) -> Boolean): List<Boolean> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<ContractState>
    <R> -> Boolean

'contractTypeMappings' @ [55:49] ==> private final val contractTypeMappings: MutableMap<String, MutableSet<String>> defined in net.corda.node.services.vault.HibernateVaultQueryImpl[PropertyDescriptorImpl]

'getOrPut' @ [55:70] ==> public inline fun <K, V> MutableMap<String, MutableSet<String>>.getOrPut(key: String, defaultValue: () -> MutableSet<String>): MutableSet<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> MutableSet<String>

'it' @ [55:79] ==> value-parameter it: Class<ContractState> defined in net.corda.node.services.vault.HibernateVaultQueryImpl.<init>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [55:82] ==> public final val <T : (Any..Any?)> Class<ContractState>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ContractState

'mutableSetOf' @ [55:90] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'contractInterface' @ [56:25] ==> val contractInterface: MutableSet<String> defined in net.corda.node.services.vault.HibernateVaultQueryImpl.<init>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'add' @ [56:43] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'concreteType' @ [56:47] ==> val concreteType: Class<ContractState> defined in net.corda.node.services.vault.HibernateVaultQueryImpl.<init>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'name' @ [56:60] ==> public final val <T : (Any..Any?)> Class<ContractState>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ContractState

'Throws' @ [63:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'VaultQueryException' @ [63:13] ==> public constructor VaultQueryException(description: String) defined in net.corda.core.node.services.VaultQueryException[DeserializedClassConstructorDescriptor]

'log' @ [65:9] ==> public final val log: Logger defined in net.corda.node.services.vault.HibernateVaultQueryImpl.Companion[PropertyDescriptorImpl]

'info' @ [65:13] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'contractType' @ [65:51] ==> value-parameter contractType: Class<out T> defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[ValueParameterDescriptorImpl]

'criteria' @ [65:76] ==> value-parameter criteria: QueryCriteria defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[ValueParameterDescriptorImpl]

'paging' @ [65:99] ==> value-parameter paging: PageSpecification defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[ValueParameterDescriptorImpl]

'sorting' @ [65:117] ==> value-parameter sorting: Sort defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[ValueParameterDescriptorImpl]

'-' @ [68:27] ==> public final operator fun unaryMinus(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'!' @ [69:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'paging' @ [69:14] ==> value-parameter paging: PageSpecification defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[ValueParameterDescriptorImpl]

'isDefault' @ [69:21] ==> public final val isDefault: Boolean defined in net.corda.core.node.services.vault.PageSpecification[DeserializedPropertyDescriptor]

'builder' @ [70:25] ==> public inline fun <A> builder(block: Builder.() -> CriteriaExpression.AggregateFunctionExpression<VaultSchemaV1.VaultStates, Instant>): CriteriaExpression.AggregateFunctionExpression<VaultSchemaV1.VaultStates, Instant> defined in net.corda.core.node.services.vault[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> AggregateFunctionExpression<VaultStates, Instant>

'VaultSchemaV1' @ [70:35] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [70:49] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'recordedTime' @ [70:62] ==> @Column public final var recordedTime: Instant defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'count' @ [70:75] ==> public final fun <O, R> KProperty1<VaultSchemaV1.VaultStates, Instant?>.count(): CriteriaExpression.AggregateFunctionExpression<VaultSchemaV1.VaultStates, Instant> defined in net.corda.core.node.services.vault.Builder[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <O> -> VaultStates
    <R> -> Instant

'VaultCustomQueryCriteria' @ [71:33] ==> @JvmOverloads public constructor VaultCustomQueryCriteria<L : PersistentState>(expression: CriteriaExpression<VaultSchemaV1.VaultStates, Boolean>, status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultCustomQueryCriteria[DeserializedClassConstructorDescriptor]
Inferred types:
    <L : PersistentState> -> VaultStates

'count' @ [71:58] ==> val count: CriteriaExpression.AggregateFunctionExpression<VaultSchemaV1.VaultStates, Instant> defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[LocalVariableDescriptor]

'ALL' @ [71:83] ==> enum entry ALL defined in net.corda.core.node.services.Vault.StateStatus[FakeCallableDescriptorForObject]

'queryBy' @ [72:27] ==> public open fun <T : ContractState> queryBy(contractType: Class<out T>, criteria: QueryCriteria): Vault.Page<T> defined in net.corda.node.services.vault.HibernateVaultQueryImpl[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> T

'contractType' @ [72:35] ==> value-parameter contractType: Class<out T> defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[ValueParameterDescriptorImpl]

'criteria' @ [72:49] ==> value-parameter criteria: QueryCriteria defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[ValueParameterDescriptorImpl]

'and' @ [72:58] ==> public final infix fun and(criteria: QueryCriteria): QueryCriteria defined in net.corda.core.node.services.vault.QueryCriteria[DeserializedSimpleFunctionDescriptor]

'countCriteria' @ [72:62] ==> val countCriteria: QueryCriteria.VaultCustomQueryCriteria<VaultSchemaV1.VaultStates> defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[LocalVariableDescriptor]

'totalStates' @ [73:13] ==> var totalStates: Long defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[LocalVariableDescriptor]

'results' @ [73:27] ==> val results: Vault.Page<T> defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[LocalVariableDescriptor]

'otherResults' @ [73:35] ==> public final val otherResults: List<Any> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'getSession' @ [76:23] ==> private final fun getSession(): Session defined in net.corda.node.services.vault.HibernateVaultQueryImpl[SimpleFunctionDescriptorImpl]

'session' @ [78:9] ==> val session: Session defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[LocalVariableDescriptor]

'use' @ [78:17] ==> @SinceKotlin @InlineOnly public inline fun <T : AutoCloseable?, R> Session.use(block: (Session) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : AutoCloseable?> -> Session
    <R> -> Nothing

'criteriaBuilder' @ [79:33] ==> private final val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl[PropertyDescriptorImpl]

'createQuery' @ [79:49] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(Tuple..Tuple?)>..Class<(Tuple..Tuple?)>?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (javax.persistence.Tuple..javax.persistence.Tuple?)

'java' @ [79:74] ==> public val <T> KClass<Tuple>.java: Class<Tuple> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Tuple

'criteriaQuery' @ [80:40] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>[LocalVariableDescriptor]

'from' @ [80:54] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'VaultSchemaV1' @ [80:59] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [80:73] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'java' @ [80:92] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'HibernateQueryCriteriaParser' @ [83:34] ==> public constructor HibernateQueryCriteriaParser(contractType: Class<out ContractState>, contractTypeMappings: Map<String, Set<String>>, criteriaBuilder: CriteriaBuilder, criteriaQuery: CriteriaQuery<Tuple>, vaultStates: Root<VaultSchemaV1.VaultStates>) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[ClassConstructorDescriptorImpl]

'contractType' @ [83:63] ==> value-parameter contractType: Class<out T> defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[ValueParameterDescriptorImpl]

'contractTypeMappings' @ [83:77] ==> private final val contractTypeMappings: MutableMap<String, MutableSet<String>> defined in net.corda.node.services.vault.HibernateVaultQueryImpl[PropertyDescriptorImpl]

'criteriaBuilder' @ [83:99] ==> private final val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl[PropertyDescriptorImpl]

'criteriaQuery' @ [83:116] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>[LocalVariableDescriptor]

'queryRootVaultStates' @ [83:131] ==> val queryRootVaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>[LocalVariableDescriptor]

'criteriaParser' @ [87:17] ==> val criteriaParser: HibernateQueryCriteriaParser defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>[LocalVariableDescriptor]

'parse' @ [87:32] ==> public open fun parse(criteria: QueryCriteria, sorting: Sort?): Collection<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[SimpleFunctionDescriptorImpl]

'criteria' @ [87:38] ==> value-parameter criteria: QueryCriteria defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[ValueParameterDescriptorImpl]

'sorting' @ [87:48] ==> value-parameter sorting: Sort defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[ValueParameterDescriptorImpl]

'session' @ [90:29] ==> val session: Session defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[LocalVariableDescriptor]

'createQuery' @ [90:37] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?)): (Query<(Tuple..Tuple?)>..Query<(Tuple..Tuple?)>?) defined in org.hibernate.Session[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (javax.persistence.Tuple..javax.persistence.Tuple?)

'criteriaQuery' @ [90:49] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>[LocalVariableDescriptor]

'!' @ [93:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'paging' @ [93:22] ==> value-parameter paging: PageSpecification defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[ValueParameterDescriptorImpl]

'isDefault' @ [93:29] ==> public final val isDefault: Boolean defined in net.corda.core.node.services.vault.PageSpecification[DeserializedPropertyDescriptor]

'paging' @ [95:25] ==> value-parameter paging: PageSpecification defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[ValueParameterDescriptorImpl]

'pageNumber' @ [95:32] ==> public final val pageNumber: Int defined in net.corda.core.node.services.vault.PageSpecification[DeserializedPropertyDescriptor]

'DEFAULT_PAGE_NUM' @ [95:45] ==> public const val DEFAULT_PAGE_NUM: Int defined in net.corda.core.node.services.vault[DeserializedPropertyDescriptor]

'VaultQueryException' @ [95:69] ==> public constructor VaultQueryException(description: String) defined in net.corda.core.node.services.VaultQueryException[DeserializedClassConstructorDescriptor]

'paging' @ [95:132] ==> value-parameter paging: PageSpecification defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[ValueParameterDescriptorImpl]

'pageNumber' @ [95:139] ==> public final val pageNumber: Int defined in net.corda.core.node.services.vault.PageSpecification[DeserializedPropertyDescriptor]

'DEFAULT_PAGE_NUM' @ [95:177] ==> public const val DEFAULT_PAGE_NUM: Int defined in net.corda.core.node.services.vault[DeserializedPropertyDescriptor]

'paging' @ [96:25] ==> value-parameter paging: PageSpecification defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[ValueParameterDescriptorImpl]

'pageSize' @ [96:32] ==> public final val pageSize: Int defined in net.corda.core.node.services.vault.PageSpecification[DeserializedPropertyDescriptor]

'VaultQueryException' @ [96:52] ==> public constructor VaultQueryException(description: String) defined in net.corda.core.node.services.VaultQueryException[DeserializedClassConstructorDescriptor]

'paging' @ [96:113] ==> value-parameter paging: PageSpecification defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[ValueParameterDescriptorImpl]

'pageSize' @ [96:120] ==> public final val pageSize: Int defined in net.corda.core.node.services.vault.PageSpecification[DeserializedPropertyDescriptor]

'MAX_PAGE_SIZE' @ [96:162] ==> public const val MAX_PAGE_SIZE: Int defined in net.corda.core.node.services.vault[DeserializedPropertyDescriptor]

'query' @ [99:17] ==> val query: (Query<(Tuple..Tuple?)>..Query<(Tuple..Tuple?)>?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>[LocalVariableDescriptor]

'firstResult' @ [99:23] ==> public final var <R : (Any..Any?)> Query<(Tuple..Tuple?)>.firstResult: Int[MyPropertyDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (javax.persistence.Tuple..javax.persistence.Tuple?)

'*' @ [99:37] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'paging' @ [99:38] ==> value-parameter paging: PageSpecification defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[ValueParameterDescriptorImpl]

'pageNumber' @ [99:45] ==> public final val pageNumber: Int defined in net.corda.core.node.services.vault.PageSpecification[DeserializedPropertyDescriptor]

'paging' @ [99:63] ==> value-parameter paging: PageSpecification defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[ValueParameterDescriptorImpl]

'pageSize' @ [99:70] ==> public final val pageSize: Int defined in net.corda.core.node.services.vault.PageSpecification[DeserializedPropertyDescriptor]

'query' @ [100:17] ==> val query: (Query<(Tuple..Tuple?)>..Query<(Tuple..Tuple?)>?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>[LocalVariableDescriptor]

'maxResults' @ [100:23] ==> public final var <R : (Any..Any?)> Query<(Tuple..Tuple?)>.maxResults: Int[MyPropertyDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (javax.persistence.Tuple..javax.persistence.Tuple?)

'paging' @ [100:36] ==> value-parameter paging: PageSpecification defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[ValueParameterDescriptorImpl]

'pageSize' @ [100:43] ==> public final val pageSize: Int defined in net.corda.core.node.services.vault.PageSpecification[DeserializedPropertyDescriptor]

'query' @ [103:31] ==> val query: (Query<(Tuple..Tuple?)>..Query<(Tuple..Tuple?)>?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>[LocalVariableDescriptor]

'resultList' @ [103:37] ==> public final val <R : (Any..Any?)> Query<(Tuple..Tuple?)>.resultList: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?)[MyPropertyDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (javax.persistence.Tuple..javax.persistence.Tuple?)

'paging' @ [106:21] ==> value-parameter paging: PageSpecification defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[ValueParameterDescriptorImpl]

'isDefault' @ [106:28] ==> public final val isDefault: Boolean defined in net.corda.core.node.services.vault.PageSpecification[DeserializedPropertyDescriptor]

'results' @ [106:41] ==> val results: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>[LocalVariableDescriptor]

'size' @ [106:49] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'DEFAULT_PAGE_SIZE' @ [106:56] ==> public const val DEFAULT_PAGE_SIZE: Int defined in net.corda.core.node.services.vault[DeserializedPropertyDescriptor]

'VaultQueryException' @ [107:27] ==> public constructor VaultQueryException(description: String) defined in net.corda.core.node.services.VaultQueryException[DeserializedClassConstructorDescriptor]

'results' @ [107:114] ==> val results: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>[LocalVariableDescriptor]

'size' @ [107:122] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'DEFAULT_PAGE_SIZE' @ [107:158] ==> public const val DEFAULT_PAGE_SIZE: Int defined in net.corda.core.node.services.vault[DeserializedPropertyDescriptor]

'mutableListOf' @ [109:66] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<StateAndRef<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<T>

'mutableListOf' @ [110:68] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Vault.StateMetadata> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateMetadata

'mutableListOf' @ [111:54] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'results' @ [113:17] ==> val results: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>[LocalVariableDescriptor]

'asSequence' @ [113:25] ==> public fun <T> Iterable<(Tuple..Tuple?)>.asSequence(): Sequence<(Tuple..Tuple?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.persistence.Tuple..javax.persistence.Tuple?)

'forEachIndexed' @ [114:26] ==> public inline fun <T> Sequence<(Tuple..Tuple?)>.forEachIndexed(action: (index: Int, (Tuple..Tuple?)) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.persistence.Tuple..javax.persistence.Tuple?)

'if (result[0] is VaultSchemaV1.VaultStates) {
                                if (!paging.isDefault && index == paging.pageSize) // skip last result if paged
                                    return@forEachIndexed
                                val vaultState = result[0] as VaultSchemaV1.VaultStates
                                val stateRef = StateRef(SecureHash.parse(vaultState.stateRef!!.txId!!), vaultState.stateRef!!.index!!)
                                val state = vaultState.contractState.deserialize<TransactionState<T>>(context = STORAGE_CONTEXT)
                                statesMeta.add(Vault.StateMetadata(stateRef,
                                                                   vaultState.contractStateClassName,
                                                                   vaultState.recordedTime,
                                                                   vaultState.consumedTime,
                                                                   vaultState.stateStatus,
                                                                   vaultState.notary,
                                                                   vaultState.lockId,
                                                                   vaultState.lockUpdateTime))
                                statesAndRefs.add(StateAndRef(state, stateRef))
                            }
                            else {
                                // TODO: improve typing of returned other results
                                log.debug { "OtherResults: ${Arrays.toString(result.toArray())}" }
                                otherResults.addAll(result.toArray().asList())
                            }' @ [115:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'result' @ [115:33] ==> value-parameter result: (Tuple..Tuple?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [116:37] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'paging' @ [116:38] ==> value-parameter paging: PageSpecification defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[ValueParameterDescriptorImpl]

'isDefault' @ [116:45] ==> public final val isDefault: Boolean defined in net.corda.core.node.services.vault.PageSpecification[DeserializedPropertyDescriptor]

'index' @ [116:58] ==> value-parameter index: Int defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'paging' @ [116:67] ==> value-parameter paging: PageSpecification defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[ValueParameterDescriptorImpl]

'pageSize' @ [116:74] ==> public final val pageSize: Int defined in net.corda.core.node.services.vault.PageSpecification[DeserializedPropertyDescriptor]

'result' @ [118:50] ==> value-parameter result: (Tuple..Tuple?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'StateRef' @ [119:48] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[DeserializedClassConstructorDescriptor]

'parse' @ [119:68] ==> @JvmStatic public final fun parse(str: String): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'vaultState' @ [119:74] ==> val vaultState: VaultSchemaV1.VaultStates defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>.<anonymous>[LocalVariableDescriptor]

'stateRef' @ [119:85] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'txId' @ [119:96] ==> @field:Column public final var txId: String? defined in net.corda.core.schemas.PersistentStateRef[DeserializedPropertyDescriptor]

'vaultState' @ [119:105] ==> val vaultState: VaultSchemaV1.VaultStates defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>.<anonymous>[LocalVariableDescriptor]

'stateRef' @ [119:116] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'index' @ [119:127] ==> @field:Column public final var index: Int? defined in net.corda.core.schemas.PersistentStateRef[DeserializedPropertyDescriptor]

'vaultState' @ [120:45] ==> val vaultState: VaultSchemaV1.VaultStates defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>.<anonymous>[LocalVariableDescriptor]

'contractState' @ [120:56] ==> @Column public final var contractState: ByteArray defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'deserialize' @ [120:70] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): TransactionState<T> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TransactionState<T>

'STORAGE_CONTEXT' @ [120:113] ==> public final var STORAGE_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[PropertyImportedFromObject]

'statesMeta' @ [121:33] ==> val statesMeta: MutableList<Vault.StateMetadata> defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>[LocalVariableDescriptor]

'add' @ [121:44] ==> public abstract fun add(element: Vault.StateMetadata): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'StateMetadata' @ [121:54] ==> public constructor StateMetadata(ref: StateRef, contractStateClassName: String, recordedTime: Instant, consumedTime: Instant?, status: Vault.StateStatus, notary: AbstractParty?, lockId: String?, lockUpdateTime: Instant?) defined in net.corda.core.node.services.Vault.StateMetadata[DeserializedClassConstructorDescriptor]

'stateRef' @ [121:68] ==> val stateRef: StateRef defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>.<anonymous>[LocalVariableDescriptor]

'vaultState' @ [122:68] ==> val vaultState: VaultSchemaV1.VaultStates defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>.<anonymous>[LocalVariableDescriptor]

'contractStateClassName' @ [122:79] ==> @Column public final var contractStateClassName: String defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'vaultState' @ [123:68] ==> val vaultState: VaultSchemaV1.VaultStates defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>.<anonymous>[LocalVariableDescriptor]

'recordedTime' @ [123:79] ==> @Column public final var recordedTime: Instant defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'vaultState' @ [124:68] ==> val vaultState: VaultSchemaV1.VaultStates defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>.<anonymous>[LocalVariableDescriptor]

'consumedTime' @ [124:79] ==> @Column public final var consumedTime: Instant? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'vaultState' @ [125:68] ==> val vaultState: VaultSchemaV1.VaultStates defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>.<anonymous>[LocalVariableDescriptor]

'stateStatus' @ [125:79] ==> @Column public final var stateStatus: Vault.StateStatus defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'vaultState' @ [126:68] ==> val vaultState: VaultSchemaV1.VaultStates defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>.<anonymous>[LocalVariableDescriptor]

'notary' @ [126:79] ==> @Column public final var notary: AbstractParty defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'vaultState' @ [127:68] ==> val vaultState: VaultSchemaV1.VaultStates defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>.<anonymous>[LocalVariableDescriptor]

'lockId' @ [127:79] ==> @Column public final var lockId: String? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'vaultState' @ [128:68] ==> val vaultState: VaultSchemaV1.VaultStates defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>.<anonymous>[LocalVariableDescriptor]

'lockUpdateTime' @ [128:79] ==> @Column public final var lockUpdateTime: Instant? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'statesAndRefs' @ [129:33] ==> val statesAndRefs: MutableList<StateAndRef<T>> defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>[LocalVariableDescriptor]

'add' @ [129:47] ==> public abstract fun add(element: StateAndRef<T>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'StateAndRef' @ [129:51] ==> public constructor StateAndRef<out T : ContractState>(state: TransactionState<T>, ref: StateRef) defined in net.corda.core.contracts.StateAndRef[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> T

'state' @ [129:63] ==> val state: TransactionState<T> defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>.<anonymous>[LocalVariableDescriptor]

'stateRef' @ [129:70] ==> val stateRef: StateRef defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>.<anonymous>[LocalVariableDescriptor]

'log' @ [133:33] ==> public final val log: Logger defined in net.corda.node.services.vault.HibernateVaultQueryImpl.Companion[PropertyDescriptorImpl]

'debug' @ [133:37] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'toString' @ [133:69] ==> public open fun toString(p0: (Array<(Any..Any?)>..Array<out (Any..Any?)>?)): (String..String?) defined in java.util.Arrays[JavaMethodDescriptor]

'result' @ [133:78] ==> value-parameter result: (Tuple..Tuple?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toArray' @ [133:85] ==> public abstract fun toArray(): (Array<(Any..Any?)>..Array<out (Any..Any?)>?) defined in javax.persistence.Tuple[JavaMethodDescriptor]

'otherResults' @ [134:33] ==> val otherResults: MutableList<Any> defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>[LocalVariableDescriptor]

'addAll' @ [134:46] ==> public abstract fun addAll(elements: Collection<Any>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'result' @ [134:53] ==> value-parameter result: (Tuple..Tuple?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toArray' @ [134:60] ==> public abstract fun toArray(): (Array<(Any..Any?)>..Array<out (Any..Any?)>?) defined in javax.persistence.Tuple[JavaMethodDescriptor]

'asList' @ [134:70] ==> public fun <T> Array<out (Any..Any?)>.asList(): List<(Any..Any?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)

'Vault' @ [138:24] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'Page' @ [138:30] ==> public constructor Page<out T : ContractState>(states: List<StateAndRef<T>>, statesMetadata: List<Vault.StateMetadata>, totalStatesAvailable: Long, stateTypes: Vault.StateStatus, otherResults: List<Any>) defined in net.corda.core.node.services.Vault.Page[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> T

'statesAndRefs' @ [138:44] ==> val statesAndRefs: MutableList<StateAndRef<T>> defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>[LocalVariableDescriptor]

'statesMeta' @ [138:76] ==> val statesMeta: MutableList<Vault.StateMetadata> defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>[LocalVariableDescriptor]

'criteriaParser' @ [138:101] ==> val criteriaParser: HibernateQueryCriteriaParser defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>[LocalVariableDescriptor]

'stateTypes' @ [138:116] ==> public final var stateTypes: Vault.StateStatus defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'totalStates' @ [138:151] ==> var totalStates: Long defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy[LocalVariableDescriptor]

'otherResults' @ [138:179] ==> val otherResults: MutableList<Any> defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>[LocalVariableDescriptor]

'log' @ [140:17] ==> public final val log: Logger defined in net.corda.node.services.vault.HibernateVaultQueryImpl.Companion[PropertyDescriptorImpl]

'error' @ [140:21] ==> public abstract fun error(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'e' @ [140:27] ==> val e: Exception defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>[LocalVariableDescriptor]

'message' @ [140:29] ==> public open val message: String? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'e' @ [141:23] ==> val e: Exception defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>[LocalVariableDescriptor]

'cause' @ [141:25] ==> public open val cause: Throwable? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'e' @ [141:34] ==> val e: Exception defined in net.corda.node.services.vault.HibernateVaultQueryImpl._queryBy.<anonymous>[LocalVariableDescriptor]

'ThreadBox' @ [146:25] ==> public constructor ThreadBox<out T>(content: () -> PublishSubject<Vault.Update<ContractState>>, lock: ReentrantLock = ...) defined in net.corda.core.internal.ThreadBox[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Function0<PublishSubject<Update<ContractState>>>

'vault' @ [146:37] ==> public final val vault: VaultService defined in net.corda.node.services.vault.HibernateVaultQueryImpl[PropertyDescriptorImpl]

'updatesPublisher' @ [146:43] ==> public abstract val updatesPublisher: PublishSubject<Vault.Update<ContractState>> defined in net.corda.core.node.services.VaultService[DeserializedPropertyDescriptor]

'Throws' @ [148:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'VaultQueryException' @ [148:13] ==> public constructor VaultQueryException(description: String) defined in net.corda.core.node.services.VaultQueryException[DeserializedClassConstructorDescriptor]

'mutex' @ [150:16] ==> private final val mutex: ThreadBox<() -> PublishSubject<Vault.Update<ContractState>>> defined in net.corda.node.services.vault.HibernateVaultQueryImpl[PropertyDescriptorImpl]

'locked' @ [150:22] ==> public final inline fun <R> locked(body: (() -> PublishSubject<Vault.Update<ContractState>>).() -> DataFeed<Vault.Page<T>, Vault.Update<T>>): DataFeed<Vault.Page<T>, Vault.Update<T>> defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> DataFeed<Page<T>, Update<T>>

'_queryBy' @ [151:35] ==> @Throws public open fun <T : ContractState> _queryBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): Vault.Page<T> defined in net.corda.node.services.vault.HibernateVaultQueryImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'criteria' @ [151:44] ==> value-parameter criteria: QueryCriteria defined in net.corda.node.services.vault.HibernateVaultQueryImpl._trackBy[ValueParameterDescriptorImpl]

'paging' @ [151:54] ==> value-parameter paging: PageSpecification defined in net.corda.node.services.vault.HibernateVaultQueryImpl._trackBy[ValueParameterDescriptorImpl]

'sorting' @ [151:62] ==> value-parameter sorting: Sort defined in net.corda.node.services.vault.HibernateVaultQueryImpl._trackBy[ValueParameterDescriptorImpl]

'contractType' @ [151:71] ==> value-parameter contractType: Class<out T> defined in net.corda.node.services.vault.HibernateVaultQueryImpl._trackBy[ValueParameterDescriptorImpl]

'Suppress' @ [152:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'vault' @ [153:27] ==> public final val vault: VaultService defined in net.corda.node.services.vault.HibernateVaultQueryImpl[PropertyDescriptorImpl]

'updatesPublisher' @ [153:33] ==> public abstract val updatesPublisher: PublishSubject<Vault.Update<ContractState>> defined in net.corda.core.node.services.VaultService[DeserializedPropertyDescriptor]

'bufferUntilSubscribed' @ [153:50] ==> public fun <T> Observable<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>.bufferUntilSubscribed(): Observable<(Vault.Update<ContractState>..Vault.Update<ContractState>?)> defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>..net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>?)

'filter' @ [153:74] ==> public final fun filter(p0: (((Vault.Update<ContractState>..Vault.Update<ContractState>?)) -> (Boolean..Boolean?)..(((Vault.Update<ContractState>..Vault.Update<ContractState>?)) -> (Boolean..Boolean?))?)): (Observable<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>..Observable<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>?) defined in rx.Observable[MyFunctionDescriptor]

'it' @ [153:83] ==> value-parameter it: (Vault.Update<ContractState>..Vault.Update<ContractState>?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl._trackBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'containsType' @ [153:86] ==> public final fun <T : ContractState> containsType(clazz: Class<out T>, status: Vault.StateStatus): Boolean defined in net.corda.core.node.services.Vault.Update[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> Captured(out T)

'contractType' @ [153:99] ==> value-parameter contractType: Class<out T> defined in net.corda.node.services.vault.HibernateVaultQueryImpl._trackBy[ValueParameterDescriptorImpl]

'snapshotResults' @ [153:113] ==> val snapshotResults: Vault.Page<T> defined in net.corda.node.services.vault.HibernateVaultQueryImpl._trackBy.<anonymous>[LocalVariableDescriptor]

'stateTypes' @ [153:129] ==> public final val stateTypes: Vault.StateStatus defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'DataFeed' @ [154:13] ==> public constructor DataFeed<out A, B>(snapshot: Vault.Page<T>, updates: Observable<Vault.Update<T>>) defined in net.corda.core.messaging.DataFeed[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Page<T>
    <B> -> Update<T>

'snapshotResults' @ [154:22] ==> val snapshotResults: Vault.Page<T> defined in net.corda.node.services.vault.HibernateVaultQueryImpl._trackBy.<anonymous>[LocalVariableDescriptor]

'updates' @ [154:39] ==> val updates: Observable<Vault.Update<T>> defined in net.corda.node.services.vault.HibernateVaultQueryImpl._trackBy.<anonymous>[LocalVariableDescriptor]

'sessionFactory' @ [159:16] ==> private final val sessionFactory: SessionFactory defined in net.corda.node.services.vault.HibernateVaultQueryImpl[PropertyDescriptorImpl]

'withOptions' @ [159:31] ==> public abstract fun withOptions(): raw (SessionBuilder<(SessionBuilder<*>..SessionBuilder<*>?)>..SessionBuilder<out (SessionBuilder<*>..SessionBuilder<*>?)>?) defined in org.hibernate.SessionFactory[JavaMethodDescriptor]

'connection' @ [160:17] ==> public abstract fun connection(p0: (Connection..Connection?)): raw (SessionBuilder<(SessionBuilder<*>..SessionBuilder<*>?)>..SessionBuilder<out (SessionBuilder<*>..SessionBuilder<*>?)>?) defined in org.hibernate.SessionBuilder[JavaMethodDescriptor]

'current' @ [160:55] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'connection' @ [160:65] ==> public final val connection: Connection defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'openSession' @ [161:17] ==> public abstract fun openSession(): (Session..Session?) defined in org.hibernate.SessionBuilder[JavaMethodDescriptor]

'criteriaBuilder' @ [168:24] ==> private final val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl[PropertyDescriptorImpl]

'createQuery' @ [168:40] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(String..String?)>..Class<(String..String?)>?)): (CriteriaQuery<(String..String?)>..CriteriaQuery<(String..String?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'String' @ [168:52] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'java' @ [168:66] ==> public val <T> KClass<String>.java: Class<String> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> String

'criteria' @ [169:27] ==> val criteria: (CriteriaQuery<(String..String?)>..CriteriaQuery<(String..String?)>?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl.bootstrapContractStateTypes[LocalVariableDescriptor]

'from' @ [169:36] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'VaultSchemaV1' @ [169:41] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [169:55] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'java' @ [169:74] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteria' @ [170:9] ==> val criteria: (CriteriaQuery<(String..String?)>..CriteriaQuery<(String..String?)>?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl.bootstrapContractStateTypes[LocalVariableDescriptor]

'select' @ [170:18] ==> public abstract fun select(p0: (Selection<out (String..String?)>..Selection<out (String..String?)>?)): (CriteriaQuery<(String..String?)>..CriteriaQuery<(String..String?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'vaultStates' @ [170:25] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl.bootstrapContractStateTypes[LocalVariableDescriptor]

'get' @ [170:37] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'distinct' @ [170:68] ==> public abstract fun distinct(p0: Boolean): (CriteriaQuery<(String..String?)>..CriteriaQuery<(String..String?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'getSession' @ [171:23] ==> private final fun getSession(): Session defined in net.corda.node.services.vault.HibernateVaultQueryImpl[SimpleFunctionDescriptorImpl]

'session' @ [172:9] ==> val session: Session defined in net.corda.node.services.vault.HibernateVaultQueryImpl.bootstrapContractStateTypes[LocalVariableDescriptor]

'use' @ [172:17] ==> @SinceKotlin @InlineOnly public inline fun <T : AutoCloseable?, R> Session.use(block: (Session) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : AutoCloseable?> -> Session
    <R> -> Nothing

'session' @ [173:25] ==> val session: Session defined in net.corda.node.services.vault.HibernateVaultQueryImpl.bootstrapContractStateTypes[LocalVariableDescriptor]

'createQuery' @ [173:33] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(String..String?)>..CriteriaQuery<(String..String?)>?)): (Query<(String..String?)>..Query<(String..String?)>?) defined in org.hibernate.Session[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'criteria' @ [173:45] ==> val criteria: (CriteriaQuery<(String..String?)>..CriteriaQuery<(String..String?)>?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl.bootstrapContractStateTypes[LocalVariableDescriptor]

'query' @ [174:27] ==> val query: (Query<(String..String?)>..Query<(String..String?)>?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl.bootstrapContractStateTypes.<anonymous>[LocalVariableDescriptor]

'resultList' @ [174:33] ==> public final val <R : (Any..Any?)> Query<(String..String?)>.resultList: (MutableList<(String..String?)>..List<(String..String?)>?)[MyPropertyDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'results' @ [175:33] ==> val results: (MutableList<(String..String?)>..List<(String..String?)>?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl.bootstrapContractStateTypes.<anonymous>[LocalVariableDescriptor]

'map' @ [175:41] ==> public inline fun <T, R> Iterable<(String..String?)>.map(transform: ((String..String?)) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [175:47] ==> value-parameter it: (String..String?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl.bootstrapContractStateTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'mutableMapOf' @ [177:52] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<String, MutableSet<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> MutableSet<String>

'distinctTypes' @ [178:13] ==> val distinctTypes: List<(String..String?)> defined in net.corda.node.services.vault.HibernateVaultQueryImpl.bootstrapContractStateTypes.<anonymous>[LocalVariableDescriptor]

'forEach' @ [178:27] ==> @HidesMembers public inline fun <T> Iterable<(String..String?)>.forEach(action: ((String..String?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'Suppress' @ [179:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'forName' @ [180:42] ==> @CallerSensitive public open fun forName(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.Class[JavaMethodDescriptor]

'type' @ [180:50] ==> value-parameter type: (String..String?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl.bootstrapContractStateTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'deriveContractInterfaces' @ [181:42] ==> private final fun <T : ContractState> deriveContractInterfaces(clazz: Class<ContractState>): Set<Class<ContractState>> defined in net.corda.node.services.vault.HibernateVaultQueryImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> ContractState

'concreteType' @ [181:67] ==> val concreteType: Class<ContractState> defined in net.corda.node.services.vault.HibernateVaultQueryImpl.bootstrapContractStateTypes.<anonymous>.<anonymous>[LocalVariableDescriptor]

'contractInterfaces' @ [182:17] ==> val contractInterfaces: Set<Class<ContractState>> defined in net.corda.node.services.vault.HibernateVaultQueryImpl.bootstrapContractStateTypes.<anonymous>.<anonymous>[LocalVariableDescriptor]

'map' @ [182:36] ==> public inline fun <T, R> Iterable<Class<ContractState>>.map(transform: (Class<ContractState>) -> Boolean): List<Boolean> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<ContractState>
    <R> -> Boolean

'contractInterfaceToConcreteTypes' @ [183:45] ==> val contractInterfaceToConcreteTypes: MutableMap<String, MutableSet<String>> defined in net.corda.node.services.vault.HibernateVaultQueryImpl.bootstrapContractStateTypes.<anonymous>[LocalVariableDescriptor]

'getOrPut' @ [183:78] ==> public inline fun <K, V> MutableMap<String, MutableSet<String>>.getOrPut(key: String, defaultValue: () -> MutableSet<String>): MutableSet<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> MutableSet<String>

'it' @ [183:87] ==> value-parameter it: Class<ContractState> defined in net.corda.node.services.vault.HibernateVaultQueryImpl.bootstrapContractStateTypes.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [183:90] ==> public final val <T : (Any..Any?)> Class<ContractState>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ContractState

'mutableSetOf' @ [183:98] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'contractInterface' @ [184:21] ==> val contractInterface: MutableSet<String> defined in net.corda.node.services.vault.HibernateVaultQueryImpl.bootstrapContractStateTypes.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'add' @ [184:39] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'concreteType' @ [184:43] ==> val concreteType: Class<ContractState> defined in net.corda.node.services.vault.HibernateVaultQueryImpl.bootstrapContractStateTypes.<anonymous>.<anonymous>[LocalVariableDescriptor]

'name' @ [184:56] ==> public final val <T : (Any..Any?)> Class<ContractState>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ContractState

'contractInterfaceToConcreteTypes' @ [187:20] ==> val contractInterfaceToConcreteTypes: MutableMap<String, MutableSet<String>> defined in net.corda.node.services.vault.HibernateVaultQueryImpl.bootstrapContractStateTypes.<anonymous>[LocalVariableDescriptor]

'mutableSetOf' @ [192:50] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<Class<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<T>

'clazz' @ [193:9] ==> value-parameter clazz: Class<T> defined in net.corda.node.services.vault.HibernateVaultQueryImpl.deriveContractInterfaces[ValueParameterDescriptorImpl]

'interfaces' @ [193:15] ==> public final val <T : (Any..Any?)> Class<T>.interfaces: (Array<(Class<*>..Class<*>?)>..Array<out (Class<*>..Class<*>?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'forEach' @ [193:26] ==> public inline fun <T> Array<out (Class<*>..Class<*>?)>.forEach(action: ((Class<*>..Class<*>?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.Class<*>..java.lang.Class<*>?)

'!' @ [194:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [194:18] ==> value-parameter it: (Class<*>..Class<*>?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl.deriveContractInterfaces.<anonymous>[ValueParameterDescriptorImpl]

'equals' @ [194:21] ==> public open fun equals(other: Any?): Boolean defined in java.lang.Class[DeserializedSimpleFunctionDescriptor]

'java' @ [194:49] ==> public val <T> KClass<ContractState>.java: Class<ContractState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ContractState

'Suppress' @ [195:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'myInterfaces' @ [196:17] ==> val myInterfaces: MutableSet<Class<T>> defined in net.corda.node.services.vault.HibernateVaultQueryImpl.deriveContractInterfaces[LocalVariableDescriptor]

'add' @ [196:30] ==> public abstract fun add(element: Class<T>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'it' @ [196:34] ==> value-parameter it: (Class<*>..Class<*>?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl.deriveContractInterfaces.<anonymous>[ValueParameterDescriptorImpl]

'myInterfaces' @ [197:17] ==> val myInterfaces: MutableSet<Class<T>> defined in net.corda.node.services.vault.HibernateVaultQueryImpl.deriveContractInterfaces[LocalVariableDescriptor]

'addAll' @ [197:30] ==> public abstract fun addAll(elements: Collection<Class<T>>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'deriveContractInterfaces' @ [197:37] ==> private final fun <T : ContractState> deriveContractInterfaces(clazz: Class<T>): Set<Class<T>> defined in net.corda.node.services.vault.HibernateVaultQueryImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'it' @ [197:62] ==> value-parameter it: (Class<*>..Class<*>?) defined in net.corda.node.services.vault.HibernateVaultQueryImpl.deriveContractInterfaces.<anonymous>[ValueParameterDescriptorImpl]

'myInterfaces' @ [200:16] ==> val myInterfaces: MutableSet<Class<T>> defined in net.corda.node.services.vault.HibernateVaultQueryImpl.deriveContractInterfaces[LocalVariableDescriptor]

