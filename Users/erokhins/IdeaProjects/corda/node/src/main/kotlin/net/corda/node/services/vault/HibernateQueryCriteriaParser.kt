'loggerFor' @ [30:19] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> HibernateQueryCriteriaParser

'mutableListOf' @ [34:34] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Predicate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Predicate

'mutableMapOf' @ [36:32] ==> public fun <K, V> mutableMapOf(vararg pairs: Pair<Class<out PersistentState>, Root<*>>): MutableMap<Class<out PersistentState>, Root<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Class<out PersistentState>
    <V> -> Root<*>

'Pair' @ [36:82] ==> public constructor Pair<out A, out B>(first: Class<VaultSchemaV1.VaultStates>, second: Root<VaultSchemaV1.VaultStates>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Class<VaultStates>
    <out B> -> Root<VaultStates>

'VaultSchemaV1' @ [36:87] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [36:101] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'java' @ [36:120] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'vaultStates' @ [36:126] ==> public final val vaultStates: Root<VaultSchemaV1.VaultStates> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'mutableListOf' @ [37:40] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Expression<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Expression<*>

'mutableMapOf' @ [38:36] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<Pair<String, Operator>, Predicate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pair<String, Operator>
    <V> -> Predicate

'Vault' @ [40:41] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'UNCONSUMED' @ [40:59] ==> enum entry UNCONSUMED defined in net.corda.core.node.services.Vault.StateStatus[FakeCallableDescriptorForObject]

'log' @ [43:9] ==> public final val log: Logger defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.Companion[PropertyDescriptorImpl]

'trace' @ [43:13] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'criteria' @ [43:51] ==> value-parameter criteria: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'mutableSetOf' @ [44:28] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<Predicate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Predicate

'criteria' @ [47:9] ==> value-parameter criteria: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'softLockingCondition' @ [47:18] ==> public final val softLockingCondition: QueryCriteria.SoftLockingCondition? defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedPropertyDescriptor]

'let' @ [47:40] ==> @InlineOnly public inline fun <T, R> QueryCriteria.SoftLockingCondition.let(block: (QueryCriteria.SoftLockingCondition) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SoftLockingCondition
    <R> -> Boolean

'criteria' @ [48:31] ==> value-parameter criteria: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'softLockingCondition' @ [48:40] ==> public final val softLockingCondition: QueryCriteria.SoftLockingCondition? defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedPropertyDescriptor]

'softLocking' @ [49:24] ==> val softLocking: QueryCriteria.SoftLockingCondition? defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>[LocalVariableDescriptor]

'type' @ [49:38] ==> public final val type: QueryCriteria.SoftLockingType defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingCondition[DeserializedPropertyDescriptor]

'when(type) {
                QueryCriteria.SoftLockingType.UNLOCKED_ONLY ->
                    predicateSet.add(criteriaBuilder.and(vaultStates.get<String>("lockId").isNull))
                QueryCriteria.SoftLockingType.LOCKED_ONLY ->
                    predicateSet.add(criteriaBuilder.and(vaultStates.get<String>("lockId").isNotNull))
                QueryCriteria.SoftLockingType.UNLOCKED_AND_SPECIFIED -> {
                    require(softLocking.lockIds.isNotEmpty()) { "Must specify one or more lockIds" }
                    predicateSet.add(criteriaBuilder.or(vaultStates.get<String>("lockId").isNull,
                                                        vaultStates.get<String>("lockId").`in`(softLocking.lockIds.map { it.toString() })))
                }
                QueryCriteria.SoftLockingType.SPECIFIED -> {
                    require(softLocking.lockIds.isNotEmpty()) { "Must specify one or more lockIds" }
                    predicateSet.add(criteriaBuilder.and(vaultStates.get<String>("lockId").`in`(softLocking.lockIds.map { it.toString() })))
                }
            }' @ [50:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'type' @ [50:18] ==> val type: QueryCriteria.SoftLockingType defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>[LocalVariableDescriptor]

'UNLOCKED_ONLY' @ [51:47] ==> enum entry UNLOCKED_ONLY defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingType[FakeCallableDescriptorForObject]

'predicateSet' @ [52:21] ==> val predicateSet: MutableSet<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'add' @ [52:34] ==> public abstract fun add(element: Predicate): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'criteriaBuilder' @ [52:38] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'and' @ [52:54] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [52:58] ==> public final val vaultStates: Root<VaultSchemaV1.VaultStates> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'get' @ [52:70] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'isNull' @ [52:92] ==> public final val <X : (Any..Any?)> Path<(String..String?)>.isNull: (Predicate..Predicate?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'LOCKED_ONLY' @ [53:47] ==> enum entry LOCKED_ONLY defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingType[FakeCallableDescriptorForObject]

'predicateSet' @ [54:21] ==> val predicateSet: MutableSet<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'add' @ [54:34] ==> public abstract fun add(element: Predicate): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'criteriaBuilder' @ [54:38] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'and' @ [54:54] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [54:58] ==> public final val vaultStates: Root<VaultSchemaV1.VaultStates> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'get' @ [54:70] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'isNotNull' @ [54:92] ==> public final val <X : (Any..Any?)> Path<(String..String?)>.isNotNull: (Predicate..Predicate?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'UNLOCKED_AND_SPECIFIED' @ [55:47] ==> enum entry UNLOCKED_AND_SPECIFIED defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingType[FakeCallableDescriptorForObject]

'require' @ [56:21] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'softLocking' @ [56:29] ==> val softLocking: QueryCriteria.SoftLockingCondition? defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>[LocalVariableDescriptor]

'lockIds' @ [56:41] ==> public final val lockIds: List<UUID> defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingCondition[DeserializedPropertyDescriptor]

'isNotEmpty' @ [56:49] ==> @InlineOnly public inline fun <T> Collection<UUID>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UUID

'predicateSet' @ [57:21] ==> val predicateSet: MutableSet<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'add' @ [57:34] ==> public abstract fun add(element: Predicate): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'criteriaBuilder' @ [57:38] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'or' @ [57:54] ==> public abstract fun or(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [57:57] ==> public final val vaultStates: Root<VaultSchemaV1.VaultStates> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'get' @ [57:69] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'isNull' @ [57:91] ==> public final val <X : (Any..Any?)> Path<(String..String?)>.isNull: (Predicate..Predicate?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'vaultStates' @ [58:57] ==> public final val vaultStates: Root<VaultSchemaV1.VaultStates> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'get' @ [58:69] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'`in`' @ [58:91] ==> public abstract fun `in`(p0: (MutableCollection<*>..Collection<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.Path[JavaMethodDescriptor]

'softLocking' @ [58:96] ==> val softLocking: QueryCriteria.SoftLockingCondition? defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>[LocalVariableDescriptor]

'lockIds' @ [58:108] ==> public final val lockIds: List<UUID> defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingCondition[DeserializedPropertyDescriptor]

'map' @ [58:116] ==> public inline fun <T, R> Iterable<UUID>.map(transform: (UUID) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UUID
    <R> -> String

'it' @ [58:122] ==> value-parameter it: UUID defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [58:125] ==> public open fun toString(): String defined in java.util.UUID[JavaMethodDescriptor]

'SPECIFIED' @ [60:47] ==> enum entry SPECIFIED defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingType[FakeCallableDescriptorForObject]

'require' @ [61:21] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'softLocking' @ [61:29] ==> val softLocking: QueryCriteria.SoftLockingCondition? defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>[LocalVariableDescriptor]

'lockIds' @ [61:41] ==> public final val lockIds: List<UUID> defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingCondition[DeserializedPropertyDescriptor]

'isNotEmpty' @ [61:49] ==> @InlineOnly public inline fun <T> Collection<UUID>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UUID

'predicateSet' @ [62:21] ==> val predicateSet: MutableSet<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'add' @ [62:34] ==> public abstract fun add(element: Predicate): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'criteriaBuilder' @ [62:38] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'and' @ [62:54] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [62:58] ==> public final val vaultStates: Root<VaultSchemaV1.VaultStates> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'get' @ [62:70] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'`in`' @ [62:92] ==> public abstract fun `in`(p0: (MutableCollection<*>..Collection<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.Path[JavaMethodDescriptor]

'softLocking' @ [62:97] ==> val softLocking: QueryCriteria.SoftLockingCondition? defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>[LocalVariableDescriptor]

'lockIds' @ [62:109] ==> public final val lockIds: List<UUID> defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingCondition[DeserializedPropertyDescriptor]

'map' @ [62:117] ==> public inline fun <T, R> Iterable<UUID>.map(transform: (UUID) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UUID
    <R> -> String

'it' @ [62:123] ==> value-parameter it: UUID defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [62:126] ==> public open fun toString(): String defined in java.util.UUID[JavaMethodDescriptor]

'criteria' @ [68:9] ==> value-parameter criteria: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'notary' @ [68:18] ==> public final val notary: List<AbstractParty>? defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedPropertyDescriptor]

'let' @ [68:26] ==> @InlineOnly public inline fun <T, R> List<AbstractParty>.let(block: (List<AbstractParty>) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<AbstractParty>
    <R> -> Boolean

'predicateSet' @ [69:13] ==> val predicateSet: MutableSet<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'add' @ [69:26] ==> public abstract fun add(element: Predicate): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'criteriaBuilder' @ [69:30] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'and' @ [69:46] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [69:50] ==> public final val vaultStates: Root<VaultSchemaV1.VaultStates> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'get' @ [69:62] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(AbstractParty..AbstractParty?)>..Path<(AbstractParty..AbstractParty?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> AbstractParty

'`in`' @ [69:91] ==> public abstract fun `in`(p0: (MutableCollection<*>..Collection<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.Path[JavaMethodDescriptor]

'criteria' @ [69:96] ==> value-parameter criteria: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'notary' @ [69:105] ==> public final val notary: List<AbstractParty>? defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedPropertyDescriptor]

'criteria' @ [73:9] ==> value-parameter criteria: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'stateRefs' @ [73:18] ==> public final val stateRefs: List<StateRef>? defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedPropertyDescriptor]

'let' @ [73:29] ==> @InlineOnly public inline fun <T, R> List<StateRef>.let(block: (List<StateRef>) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<StateRef>
    <R> -> Boolean

'criteria' @ [74:40] ==> value-parameter criteria: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'stateRefs' @ [74:49] ==> public final val stateRefs: List<StateRef>? defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedPropertyDescriptor]

'map' @ [74:78] ==> public inline fun <T, R> Iterable<StateRef>.map(transform: (StateRef) -> PersistentStateRef): List<PersistentStateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef
    <R> -> PersistentStateRef

'PersistentStateRef' @ [74:84] ==> public constructor PersistentStateRef(txId: String? = ..., index: Int? = ...) defined in net.corda.core.schemas.PersistentStateRef[DeserializedClassConstructorDescriptor]

'it' @ [74:103] ==> value-parameter it: StateRef defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'txhash' @ [74:106] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'bytes' @ [74:113] ==> public open val bytes: ByteArray defined in net.corda.core.crypto.SecureHash[DeserializedPropertyDescriptor]

'toHexString' @ [74:119] ==> public fun ByteArray.toHexString(): String defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'it' @ [74:134] ==> value-parameter it: StateRef defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [74:137] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'vaultStates' @ [75:32] ==> public final val vaultStates: Root<VaultSchemaV1.VaultStates> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'get' @ [75:44] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(PersistentStateRef..PersistentStateRef?)>..Path<(PersistentStateRef..PersistentStateRef?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> PersistentStateRef

'predicateSet' @ [76:13] ==> val predicateSet: MutableSet<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'add' @ [76:26] ==> public abstract fun add(element: Predicate): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'criteriaBuilder' @ [76:30] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'and' @ [76:46] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'compositeKey' @ [76:50] ==> val compositeKey: (Path<(PersistentStateRef..PersistentStateRef?)>..Path<(PersistentStateRef..PersistentStateRef?)>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>[LocalVariableDescriptor]

'`in`' @ [76:63] ==> public abstract fun `in`(p0: (MutableCollection<*>..Collection<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.Path[JavaMethodDescriptor]

'persistentStateRefs' @ [76:68] ==> val persistentStateRefs: List<PersistentStateRef> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>[LocalVariableDescriptor]

'criteria' @ [80:9] ==> value-parameter criteria: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'timeCondition' @ [80:18] ==> public final val timeCondition: QueryCriteria.TimeCondition? defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedPropertyDescriptor]

'let' @ [80:33] ==> @InlineOnly public inline fun <T, R> QueryCriteria.TimeCondition.let(block: (QueryCriteria.TimeCondition) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TimeCondition
    <R> -> Boolean

'criteria' @ [81:33] ==> value-parameter criteria: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'timeCondition' @ [81:42] ==> public final val timeCondition: QueryCriteria.TimeCondition? defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedPropertyDescriptor]

'timeCondition' @ [82:35] ==> val timeCondition: QueryCriteria.TimeCondition? defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>[LocalVariableDescriptor]

'type' @ [82:51] ==> public final val type: QueryCriteria.TimeInstantType defined in net.corda.core.node.services.vault.QueryCriteria.TimeCondition[DeserializedPropertyDescriptor]

'when (timeInstantType) {
                QueryCriteria.TimeInstantType.RECORDED -> Column(VaultSchemaV1.VaultStates::recordedTime)
                QueryCriteria.TimeInstantType.CONSUMED -> Column(VaultSchemaV1.VaultStates::consumedTime)
            }' @ [83:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Column<VaultSchemaV1.VaultStates, Instant>, entry1: Column<VaultSchemaV1.VaultStates, Instant>): Column<VaultSchemaV1.VaultStates, Instant>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Column<VaultStates, Instant>

'timeInstantType' @ [83:36] ==> val timeInstantType: QueryCriteria.TimeInstantType defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>[LocalVariableDescriptor]

'RECORDED' @ [84:47] ==> enum entry RECORDED defined in net.corda.core.node.services.vault.QueryCriteria.TimeInstantType[FakeCallableDescriptorForObject]

'Column' @ [84:59] ==> public constructor Column<O, out C>(property: KProperty1<VaultSchemaV1.VaultStates, Instant?>) defined in net.corda.core.node.services.vault.Column[DeserializedClassConstructorDescriptor]
Inferred types:
    <O> -> VaultStates
    <out C> -> Instant

'VaultSchemaV1' @ [84:66] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [84:80] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'recordedTime' @ [84:93] ==> @Column public final var recordedTime: Instant defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'CONSUMED' @ [85:47] ==> enum entry CONSUMED defined in net.corda.core.node.services.vault.QueryCriteria.TimeInstantType[FakeCallableDescriptorForObject]

'Column' @ [85:59] ==> public constructor Column<O, out C>(property: KProperty1<VaultSchemaV1.VaultStates, Instant?>) defined in net.corda.core.node.services.vault.Column[DeserializedClassConstructorDescriptor]
Inferred types:
    <O> -> VaultStates
    <out C> -> Instant

'VaultSchemaV1' @ [85:66] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [85:80] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'consumedTime' @ [85:93] ==> @Column public final var consumedTime: Instant? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'ColumnPredicateExpression' @ [87:49] ==> public constructor ColumnPredicateExpression<O, C>(column: Column<VaultSchemaV1.VaultStates, Instant>, predicate: ColumnPredicate<Instant>) defined in net.corda.core.node.services.vault.CriteriaExpression.ColumnPredicateExpression[DeserializedClassConstructorDescriptor]
Inferred types:
    <O> -> VaultStates
    <C> -> Instant

'timeColumn' @ [87:75] ==> val timeColumn: Column<VaultSchemaV1.VaultStates, Instant> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>[LocalVariableDescriptor]

'timeCondition' @ [87:87] ==> val timeCondition: QueryCriteria.TimeCondition? defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>[LocalVariableDescriptor]

'predicate' @ [87:101] ==> public final val predicate: ColumnPredicate<Instant> defined in net.corda.core.node.services.vault.QueryCriteria.TimeCondition[DeserializedPropertyDescriptor]

'predicateSet' @ [88:13] ==> val predicateSet: MutableSet<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'add' @ [88:26] ==> public abstract fun add(element: Predicate): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'parseExpression' @ [88:30] ==> private final fun <O, R> parseExpression(root: Root<VaultSchemaV1.VaultStates>, expression: CriteriaExpression<VaultSchemaV1.VaultStates, Boolean>): Expression<Boolean> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> VaultStates
    <R> -> Boolean

'vaultStates' @ [88:46] ==> public final val vaultStates: Root<VaultSchemaV1.VaultStates> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'expression' @ [88:59] ==> val expression: CriteriaExpression.ColumnPredicateExpression<VaultSchemaV1.VaultStates, Instant> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>[LocalVariableDescriptor]

'predicateSet' @ [90:16] ==> val predicateSet: MutableSet<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'log' @ [94:9] ==> public final val log: Logger defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.Companion[PropertyDescriptorImpl]

'trace' @ [94:13] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'contractType' @ [94:62] ==> public final val contractType: Class<out ContractState> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'contractStateTypes' @ [94:90] ==> value-parameter contractStateTypes: Set<Class<out ContractState>>? = ... defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.deriveContractTypes[ValueParameterDescriptorImpl]

'contractStateTypes' @ [95:42] ==> value-parameter contractStateTypes: Set<Class<out ContractState>>? = ... defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.deriveContractTypes[ValueParameterDescriptorImpl]

'plus' @ [95:62] ==> public operator fun <T> Set<Class<out ContractState>>.plus(element: Class<out ContractState>): Set<Class<out ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out ContractState>

'contractType' @ [95:67] ==> public final val contractType: Class<out ContractState> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'setOf' @ [95:84] ==> public fun <T> setOf(element: Class<out ContractState>): Set<Class<out ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out ContractState>

'contractType' @ [95:90] ==> public final val contractType: Class<out ContractState> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'combinedContractStateTypes' @ [96:9] ==> val combinedContractStateTypes: Set<Class<out ContractState>> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.deriveContractTypes[LocalVariableDescriptor]

'filter' @ [96:36] ==> public inline fun <T> Iterable<Class<out ContractState>>.filter(predicate: (Class<out ContractState>) -> Boolean): List<Class<out ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out ContractState>

'it' @ [96:45] ==> value-parameter it: Class<out ContractState> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.deriveContractTypes.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [96:48] ==> public final val <T : (Any..Any?)> Class<out ContractState>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out ContractState)

'java' @ [96:77] ==> public val <T> KClass<ContractState>.java: Class<ContractState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ContractState

'name' @ [96:82] ==> public final val <T : (Any..Any?)> Class<ContractState>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ContractState

'let' @ [96:89] ==> @InlineOnly public inline fun <T, R> List<Class<out ContractState>>.let(block: (List<Class<out ContractState>>) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<Class<out ContractState>>
    <R> -> Nothing

'it' @ [97:30] ==> value-parameter it: List<Class<out ContractState>> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.deriveContractTypes.<anonymous>[ValueParameterDescriptorImpl]

'flatMap' @ [97:33] ==> public inline fun <T, R> Iterable<Class<out ContractState>>.flatMap(transform: (Class<out ContractState>) -> Iterable<String>): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out ContractState>
    <R> -> String

'contractTypeMappings' @ [97:43] ==> public final val contractTypeMappings: Map<String, Set<String>> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'it' @ [97:64] ==> value-parameter it: Class<out ContractState> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.deriveContractTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [97:67] ==> public final val <T : (Any..Any?)> Class<out ContractState>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out ContractState)

'setOf' @ [97:76] ==> public fun <T> setOf(element: (String..String?)): Set<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'it' @ [97:82] ==> value-parameter it: Class<out ContractState> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.deriveContractTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [97:85] ==> public final val <T : (Any..Any?)> Class<out ContractState>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out ContractState)

'it' @ [98:28] ==> value-parameter it: List<Class<out ContractState>> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.deriveContractTypes.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [98:31] ==> public inline fun <T> Iterable<Class<out ContractState>>.filter(predicate: (Class<out ContractState>) -> Boolean): List<Class<out ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out ContractState>

'!' @ [98:40] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [98:41] ==> value-parameter it: Class<out ContractState> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.deriveContractTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isInterface' @ [98:44] ==> public final val <T : (Any..Any?)> Class<out ContractState>.isInterface: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out ContractState)

'map' @ [98:58] ==> public inline fun <T, R> Iterable<Class<out ContractState>>.map(transform: (Class<out ContractState>) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out ContractState>
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [98:64] ==> value-parameter it: Class<out ContractState> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.deriveContractTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [98:67] ==> public final val <T : (Any..Any?)> Class<out ContractState>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out ContractState)

'log' @ [99:13] ==> public final val log: Logger defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.Companion[PropertyDescriptorImpl]

'trace' @ [99:17] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'interfaces' @ [99:52] ==> val interfaces: List<String> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.deriveContractTypes.<anonymous>[LocalVariableDescriptor]

'union' @ [99:63] ==> public infix fun <T> Iterable<(String..String?)>.union(other: Iterable<(String..String?)>): Set<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'concrete' @ [99:69] ==> val concrete: List<(String..String?)> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.deriveContractTypes.<anonymous>[LocalVariableDescriptor]

'interfaces' @ [100:20] ==> val interfaces: List<String> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.deriveContractTypes.<anonymous>[LocalVariableDescriptor]

'union' @ [100:31] ==> public infix fun <T> Iterable<(String..String?)>.union(other: Iterable<(String..String?)>): Set<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'concrete' @ [100:37] ==> val concrete: List<(String..String?)> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.deriveContractTypes.<anonymous>[LocalVariableDescriptor]

'when (columnPredicate) {
            is ColumnPredicate.EqualityComparison -> {
                val literal = columnPredicate.rightLiteral
                when (columnPredicate.operator) {
                    EqualityComparisonOperator.EQUAL -> criteriaBuilder.equal(column, literal)
                    EqualityComparisonOperator.NOT_EQUAL -> criteriaBuilder.notEqual(column, literal)
                }
            }
            is ColumnPredicate.BinaryComparison -> {
                @Suppress("UNCHECKED_CAST")
                val literal = columnPredicate.rightLiteral as Comparable<Any?>?
                @Suppress("UNCHECKED_CAST")
                column as Path<Comparable<Any?>?>
                when (columnPredicate.operator) {
                    BinaryComparisonOperator.GREATER_THAN -> criteriaBuilder.greaterThan(column, literal)
                    BinaryComparisonOperator.GREATER_THAN_OR_EQUAL -> criteriaBuilder.greaterThanOrEqualTo(column, literal)
                    BinaryComparisonOperator.LESS_THAN -> criteriaBuilder.lessThan(column, literal)
                    BinaryComparisonOperator.LESS_THAN_OR_EQUAL -> criteriaBuilder.lessThanOrEqualTo(column, literal)
                }
            }
            is ColumnPredicate.Likeness -> {
                @Suppress("UNCHECKED_CAST")
                column as Path<String?>
                when (columnPredicate.operator) {
                    LikenessOperator.LIKE -> criteriaBuilder.like(column, columnPredicate.rightLiteral)
                    LikenessOperator.NOT_LIKE -> criteriaBuilder.notLike(column, columnPredicate.rightLiteral)
                }
            }
            is ColumnPredicate.CollectionExpression -> {
                when (columnPredicate.operator) {
                    CollectionOperator.IN -> column.`in`(columnPredicate.rightLiteral)
                    CollectionOperator.NOT_IN -> criteriaBuilder.not(column.`in`(columnPredicate.rightLiteral))
                }
            }
            is ColumnPredicate.Between -> {
                @Suppress("UNCHECKED_CAST")
                column as Path<Comparable<Any?>?>
                @Suppress("UNCHECKED_CAST")
                val fromLiteral = columnPredicate.rightFromLiteral as Comparable<Any?>?
                @Suppress("UNCHECKED_CAST")
                val toLiteral = columnPredicate.rightToLiteral as Comparable<Any?>?
                criteriaBuilder.between(column, fromLiteral, toLiteral)
            }
            is ColumnPredicate.NullExpression -> {
                when (columnPredicate.operator) {
                    NullOperator.IS_NULL -> criteriaBuilder.isNull(column)
                    NullOperator.NOT_NULL -> criteriaBuilder.isNotNull(column)
                }
            }
            else -> throw VaultQueryException("Not expecting $columnPredicate")
        }' @ [105:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Predicate, entry1: Predicate, entry2: Predicate, entry3: Predicate, entry4: Predicate, entry5: Predicate, entry6: Predicate): Predicate[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Predicate

'columnPredicate' @ [105:22] ==> value-parameter columnPredicate: ColumnPredicate<*> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'columnPredicate' @ [107:31] ==> value-parameter columnPredicate: ColumnPredicate<*> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'rightLiteral' @ [107:47] ==> public final val rightLiteral: Any? defined in net.corda.core.node.services.vault.ColumnPredicate.EqualityComparison[DeserializedPropertyDescriptor]

'when (columnPredicate.operator) {
                    EqualityComparisonOperator.EQUAL -> criteriaBuilder.equal(column, literal)
                    EqualityComparisonOperator.NOT_EQUAL -> criteriaBuilder.notEqual(column, literal)
                }' @ [108:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Predicate..Predicate?), entry1: (Predicate..Predicate?)): (Predicate..Predicate?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (javax.persistence.criteria.Predicate..javax.persistence.criteria.Predicate?)

'columnPredicate' @ [108:23] ==> value-parameter columnPredicate: ColumnPredicate<*> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'operator' @ [108:39] ==> public final val operator: EqualityComparisonOperator defined in net.corda.core.node.services.vault.ColumnPredicate.EqualityComparison[DeserializedPropertyDescriptor]

'EQUAL' @ [109:48] ==> enum entry EQUAL defined in net.corda.core.node.services.vault.EqualityComparisonOperator[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [109:57] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'equal' @ [109:73] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'column' @ [109:79] ==> value-parameter column: Path<out Any?> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'literal' @ [109:87] ==> val literal: Any? defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[LocalVariableDescriptor]

'NOT_EQUAL' @ [110:48] ==> enum entry NOT_EQUAL defined in net.corda.core.node.services.vault.EqualityComparisonOperator[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [110:61] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'notEqual' @ [110:77] ==> public abstract fun notEqual(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'column' @ [110:86] ==> value-parameter column: Path<out Any?> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'literal' @ [110:94] ==> val literal: Any? defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[LocalVariableDescriptor]

'Suppress' @ [114:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'columnPredicate' @ [115:31] ==> value-parameter columnPredicate: ColumnPredicate<*> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'rightLiteral' @ [115:47] ==> public final val rightLiteral: Any? defined in net.corda.core.node.services.vault.ColumnPredicate.BinaryComparison[DeserializedPropertyDescriptor]

'Suppress' @ [116:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'column' @ [117:17] ==> value-parameter column: Path<out Any?> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'when (columnPredicate.operator) {
                    BinaryComparisonOperator.GREATER_THAN -> criteriaBuilder.greaterThan(column, literal)
                    BinaryComparisonOperator.GREATER_THAN_OR_EQUAL -> criteriaBuilder.greaterThanOrEqualTo(column, literal)
                    BinaryComparisonOperator.LESS_THAN -> criteriaBuilder.lessThan(column, literal)
                    BinaryComparisonOperator.LESS_THAN_OR_EQUAL -> criteriaBuilder.lessThanOrEqualTo(column, literal)
                }' @ [118:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Predicate..Predicate?), entry1: (Predicate..Predicate?), entry2: (Predicate..Predicate?), entry3: (Predicate..Predicate?)): (Predicate..Predicate?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (javax.persistence.criteria.Predicate..javax.persistence.criteria.Predicate?)

'columnPredicate' @ [118:23] ==> value-parameter columnPredicate: ColumnPredicate<*> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'operator' @ [118:39] ==> public final val operator: BinaryComparisonOperator defined in net.corda.core.node.services.vault.ColumnPredicate.BinaryComparison[DeserializedPropertyDescriptor]

'GREATER_THAN' @ [119:46] ==> enum entry GREATER_THAN defined in net.corda.core.node.services.vault.BinaryComparisonOperator[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [119:62] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'greaterThan' @ [119:78] ==> public abstract fun <Y : (Comparable<Comparable<Any?>?>..Comparable<Comparable<Any?>?>?)> greaterThan(p0: (Expression<out Comparable<Any?>?>..Expression<out Comparable<Any?>?>?), p1: Comparable<Any?>?): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <Y : (Comparable<(Y..Y?)>..Comparable<(Y..Y?)>?)> -> Comparable<Any?>?

'column' @ [119:90] ==> value-parameter column: Path<out Any?> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'literal' @ [119:98] ==> val literal: Comparable<Any?>? defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[LocalVariableDescriptor]

'GREATER_THAN_OR_EQUAL' @ [120:46] ==> enum entry GREATER_THAN_OR_EQUAL defined in net.corda.core.node.services.vault.BinaryComparisonOperator[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [120:71] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'greaterThanOrEqualTo' @ [120:87] ==> public abstract fun <Y : (Comparable<Comparable<Any?>?>..Comparable<Comparable<Any?>?>?)> greaterThanOrEqualTo(p0: (Expression<out Comparable<Any?>?>..Expression<out Comparable<Any?>?>?), p1: Comparable<Any?>?): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <Y : (Comparable<(Y..Y?)>..Comparable<(Y..Y?)>?)> -> Comparable<Any?>?

'column' @ [120:108] ==> value-parameter column: Path<out Any?> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'literal' @ [120:116] ==> val literal: Comparable<Any?>? defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[LocalVariableDescriptor]

'LESS_THAN' @ [121:46] ==> enum entry LESS_THAN defined in net.corda.core.node.services.vault.BinaryComparisonOperator[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [121:59] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'lessThan' @ [121:75] ==> public abstract fun <Y : (Comparable<Comparable<Any?>?>..Comparable<Comparable<Any?>?>?)> lessThan(p0: (Expression<out Comparable<Any?>?>..Expression<out Comparable<Any?>?>?), p1: Comparable<Any?>?): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <Y : (Comparable<(Y..Y?)>..Comparable<(Y..Y?)>?)> -> Comparable<Any?>?

'column' @ [121:84] ==> value-parameter column: Path<out Any?> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'literal' @ [121:92] ==> val literal: Comparable<Any?>? defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[LocalVariableDescriptor]

'LESS_THAN_OR_EQUAL' @ [122:46] ==> enum entry LESS_THAN_OR_EQUAL defined in net.corda.core.node.services.vault.BinaryComparisonOperator[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [122:68] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'lessThanOrEqualTo' @ [122:84] ==> public abstract fun <Y : (Comparable<Comparable<Any?>?>..Comparable<Comparable<Any?>?>?)> lessThanOrEqualTo(p0: (Expression<out Comparable<Any?>?>..Expression<out Comparable<Any?>?>?), p1: Comparable<Any?>?): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <Y : (Comparable<(Y..Y?)>..Comparable<(Y..Y?)>?)> -> Comparable<Any?>?

'column' @ [122:102] ==> value-parameter column: Path<out Any?> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'literal' @ [122:110] ==> val literal: Comparable<Any?>? defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[LocalVariableDescriptor]

'Suppress' @ [126:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'column' @ [127:17] ==> value-parameter column: Path<out Any?> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'when (columnPredicate.operator) {
                    LikenessOperator.LIKE -> criteriaBuilder.like(column, columnPredicate.rightLiteral)
                    LikenessOperator.NOT_LIKE -> criteriaBuilder.notLike(column, columnPredicate.rightLiteral)
                }' @ [128:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Predicate..Predicate?), entry1: (Predicate..Predicate?)): (Predicate..Predicate?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (javax.persistence.criteria.Predicate..javax.persistence.criteria.Predicate?)

'columnPredicate' @ [128:23] ==> value-parameter columnPredicate: ColumnPredicate<*> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'operator' @ [128:39] ==> public final val operator: LikenessOperator defined in net.corda.core.node.services.vault.ColumnPredicate.Likeness[DeserializedPropertyDescriptor]

'LIKE' @ [129:38] ==> enum entry LIKE defined in net.corda.core.node.services.vault.LikenessOperator[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [129:46] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'like' @ [129:62] ==> public abstract fun like(p0: (Expression<(String..String?)>..Expression<(String..String?)>?), p1: (String..String?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'column' @ [129:67] ==> value-parameter column: Path<out Any?> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'columnPredicate' @ [129:75] ==> value-parameter columnPredicate: ColumnPredicate<*> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'rightLiteral' @ [129:91] ==> public final val rightLiteral: String defined in net.corda.core.node.services.vault.ColumnPredicate.Likeness[DeserializedPropertyDescriptor]

'NOT_LIKE' @ [130:38] ==> enum entry NOT_LIKE defined in net.corda.core.node.services.vault.LikenessOperator[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [130:50] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'notLike' @ [130:66] ==> public abstract fun notLike(p0: (Expression<(String..String?)>..Expression<(String..String?)>?), p1: (String..String?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'column' @ [130:74] ==> value-parameter column: Path<out Any?> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'columnPredicate' @ [130:82] ==> value-parameter columnPredicate: ColumnPredicate<*> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'rightLiteral' @ [130:98] ==> public final val rightLiteral: String defined in net.corda.core.node.services.vault.ColumnPredicate.Likeness[DeserializedPropertyDescriptor]

'when (columnPredicate.operator) {
                    CollectionOperator.IN -> column.`in`(columnPredicate.rightLiteral)
                    CollectionOperator.NOT_IN -> criteriaBuilder.not(column.`in`(columnPredicate.rightLiteral))
                }' @ [134:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Predicate..Predicate?), entry1: (Predicate..Predicate?)): (Predicate..Predicate?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (javax.persistence.criteria.Predicate..javax.persistence.criteria.Predicate?)

'columnPredicate' @ [134:23] ==> value-parameter columnPredicate: ColumnPredicate<*> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'operator' @ [134:39] ==> public final val operator: CollectionOperator defined in net.corda.core.node.services.vault.ColumnPredicate.CollectionExpression[DeserializedPropertyDescriptor]

'IN' @ [135:40] ==> enum entry IN defined in net.corda.core.node.services.vault.CollectionOperator[FakeCallableDescriptorForObject]

'column' @ [135:46] ==> value-parameter column: Path<out Any?> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'`in`' @ [135:53] ==> public abstract fun `in`(p0: (MutableCollection<*>..Collection<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.Path[JavaMethodDescriptor]

'columnPredicate' @ [135:58] ==> value-parameter columnPredicate: ColumnPredicate<*> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'rightLiteral' @ [135:74] ==> public final val rightLiteral: Collection<Any?> defined in net.corda.core.node.services.vault.ColumnPredicate.CollectionExpression[DeserializedPropertyDescriptor]

'NOT_IN' @ [136:40] ==> enum entry NOT_IN defined in net.corda.core.node.services.vault.CollectionOperator[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [136:50] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'not' @ [136:66] ==> public abstract fun not(p0: (Expression<(Boolean..Boolean?)>..Expression<(Boolean..Boolean?)>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'column' @ [136:70] ==> value-parameter column: Path<out Any?> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'`in`' @ [136:77] ==> public abstract fun `in`(p0: (MutableCollection<*>..Collection<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.Path[JavaMethodDescriptor]

'columnPredicate' @ [136:82] ==> value-parameter columnPredicate: ColumnPredicate<*> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'rightLiteral' @ [136:98] ==> public final val rightLiteral: Collection<Any?> defined in net.corda.core.node.services.vault.ColumnPredicate.CollectionExpression[DeserializedPropertyDescriptor]

'Suppress' @ [140:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'column' @ [141:17] ==> value-parameter column: Path<out Any?> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'Suppress' @ [142:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'columnPredicate' @ [143:35] ==> value-parameter columnPredicate: ColumnPredicate<*> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'rightFromLiteral' @ [143:51] ==> public final val rightFromLiteral: Any? defined in net.corda.core.node.services.vault.ColumnPredicate.Between[DeserializedPropertyDescriptor]

'Suppress' @ [144:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'columnPredicate' @ [145:33] ==> value-parameter columnPredicate: ColumnPredicate<*> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'rightToLiteral' @ [145:49] ==> public final val rightToLiteral: Any? defined in net.corda.core.node.services.vault.ColumnPredicate.Between[DeserializedPropertyDescriptor]

'criteriaBuilder' @ [146:17] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'between' @ [146:33] ==> public abstract fun <Y : (Comparable<Comparable<Any?>?>..Comparable<Comparable<Any?>?>?)> between(p0: (Expression<out Comparable<Any?>?>..Expression<out Comparable<Any?>?>?), p1: Comparable<Any?>?, p2: Comparable<Any?>?): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <Y : (Comparable<(Y..Y?)>..Comparable<(Y..Y?)>?)> -> Comparable<Any?>?

'column' @ [146:41] ==> value-parameter column: Path<out Any?> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'fromLiteral' @ [146:49] ==> val fromLiteral: Comparable<Any?>? defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[LocalVariableDescriptor]

'toLiteral' @ [146:62] ==> val toLiteral: Comparable<Any?>? defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[LocalVariableDescriptor]

'when (columnPredicate.operator) {
                    NullOperator.IS_NULL -> criteriaBuilder.isNull(column)
                    NullOperator.NOT_NULL -> criteriaBuilder.isNotNull(column)
                }' @ [149:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Predicate..Predicate?), entry1: (Predicate..Predicate?)): (Predicate..Predicate?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (javax.persistence.criteria.Predicate..javax.persistence.criteria.Predicate?)

'columnPredicate' @ [149:23] ==> value-parameter columnPredicate: ColumnPredicate<*> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'operator' @ [149:39] ==> public final val operator: NullOperator defined in net.corda.core.node.services.vault.ColumnPredicate.NullExpression[DeserializedPropertyDescriptor]

'IS_NULL' @ [150:34] ==> enum entry IS_NULL defined in net.corda.core.node.services.vault.NullOperator[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [150:45] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'isNull' @ [150:61] ==> public abstract fun isNull(p0: (Expression<*>..Expression<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'column' @ [150:68] ==> value-parameter column: Path<out Any?> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'NOT_NULL' @ [151:34] ==> enum entry NOT_NULL defined in net.corda.core.node.services.vault.NullOperator[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [151:46] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'isNotNull' @ [151:62] ==> public abstract fun isNotNull(p0: (Expression<*>..Expression<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'column' @ [151:72] ==> value-parameter column: Path<out Any?> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'VaultQueryException' @ [154:27] ==> public constructor VaultQueryException(description: String) defined in net.corda.core.node.services.VaultQueryException[DeserializedClassConstructorDescriptor]

'columnPredicate' @ [154:63] ==> value-parameter columnPredicate: ColumnPredicate<*> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.columnPredicateToPredicate[ValueParameterDescriptorImpl]

'if (expression is CriteriaExpression.AggregateFunctionExpression<O,*>) {
            parseAggregateFunction(entityRoot, expression)
        } else {
            predicateSet.add(parseExpression(entityRoot, expression) as Predicate)
        }' @ [159:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'expression' @ [159:13] ==> value-parameter expression: CriteriaExpression<O, Boolean> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseExpression[ValueParameterDescriptorImpl]

'parseAggregateFunction' @ [160:13] ==> private final fun <O, R> parseAggregateFunction(root: Root<O>, expression: CriteriaExpression.AggregateFunctionExpression<O, out Any?>): Expression<out Any?>? defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <R> -> Captured(*)

'entityRoot' @ [160:36] ==> value-parameter entityRoot: Root<O> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseExpression[ValueParameterDescriptorImpl]

'expression' @ [160:48] ==> value-parameter expression: CriteriaExpression<O, Boolean> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseExpression[ValueParameterDescriptorImpl]

'predicateSet' @ [162:13] ==> value-parameter predicateSet: MutableSet<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseExpression[ValueParameterDescriptorImpl]

'add' @ [162:26] ==> public abstract fun add(element: Predicate): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'parseExpression' @ [162:30] ==> private final fun <O, R> parseExpression(root: Root<O>, expression: CriteriaExpression<O, Boolean>): Expression<Boolean> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <R> -> Boolean

'entityRoot' @ [162:46] ==> value-parameter entityRoot: Root<O> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseExpression[ValueParameterDescriptorImpl]

'expression' @ [162:58] ==> value-parameter expression: CriteriaExpression<O, Boolean> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseExpression[ValueParameterDescriptorImpl]

'when (expression) {
            is CriteriaExpression.BinaryLogical -> {
                val leftPredicate = parseExpression(root, expression.left)
                val rightPredicate = parseExpression(root, expression.right)
                when (expression.operator) {
                    BinaryLogicalOperator.AND -> criteriaBuilder.and(leftPredicate, rightPredicate)
                    BinaryLogicalOperator.OR -> criteriaBuilder.or(leftPredicate, rightPredicate)
                }
            }
            is CriteriaExpression.Not -> criteriaBuilder.not(parseExpression(root, expression.expression))
            is CriteriaExpression.ColumnPredicateExpression<O, *> -> {
                val column = root.get<Any?>(getColumnName(expression.column))
                columnPredicateToPredicate(column, expression.predicate)
            }
            else -> throw VaultQueryException("Unexpected expression: $expression")
        }' @ [167:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Expression<Boolean>, entry1: Expression<Boolean>, entry2: Expression<Boolean>, entry3: Expression<Boolean>): Expression<Boolean>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Expression<Boolean>

'expression' @ [167:22] ==> value-parameter expression: CriteriaExpression<O, R> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseExpression[ValueParameterDescriptorImpl]

'parseExpression' @ [169:37] ==> private final fun <O, R> parseExpression(root: Root<O>, expression: CriteriaExpression<O, Boolean>): Expression<Boolean> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <R> -> Boolean

'root' @ [169:53] ==> value-parameter root: Root<O> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseExpression[ValueParameterDescriptorImpl]

'expression' @ [169:59] ==> value-parameter expression: CriteriaExpression<O, R> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseExpression[ValueParameterDescriptorImpl]

'left' @ [169:70] ==> public final val left: CriteriaExpression<O, Boolean> defined in net.corda.core.node.services.vault.CriteriaExpression.BinaryLogical[DeserializedPropertyDescriptor]

'parseExpression' @ [170:38] ==> private final fun <O, R> parseExpression(root: Root<O>, expression: CriteriaExpression<O, Boolean>): Expression<Boolean> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <R> -> Boolean

'root' @ [170:54] ==> value-parameter root: Root<O> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseExpression[ValueParameterDescriptorImpl]

'expression' @ [170:60] ==> value-parameter expression: CriteriaExpression<O, R> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseExpression[ValueParameterDescriptorImpl]

'right' @ [170:71] ==> public final val right: CriteriaExpression<O, Boolean> defined in net.corda.core.node.services.vault.CriteriaExpression.BinaryLogical[DeserializedPropertyDescriptor]

'when (expression.operator) {
                    BinaryLogicalOperator.AND -> criteriaBuilder.and(leftPredicate, rightPredicate)
                    BinaryLogicalOperator.OR -> criteriaBuilder.or(leftPredicate, rightPredicate)
                }' @ [171:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Predicate..Predicate?), entry1: (Predicate..Predicate?)): (Predicate..Predicate?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (javax.persistence.criteria.Predicate..javax.persistence.criteria.Predicate?)

'expression' @ [171:23] ==> value-parameter expression: CriteriaExpression<O, R> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseExpression[ValueParameterDescriptorImpl]

'operator' @ [171:34] ==> public final val operator: BinaryLogicalOperator defined in net.corda.core.node.services.vault.CriteriaExpression.BinaryLogical[DeserializedPropertyDescriptor]

'AND' @ [172:43] ==> enum entry AND defined in net.corda.core.node.services.vault.BinaryLogicalOperator[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [172:50] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'and' @ [172:66] ==> public abstract fun and(p0: (Expression<(Boolean..Boolean?)>..Expression<(Boolean..Boolean?)>?), p1: (Expression<(Boolean..Boolean?)>..Expression<(Boolean..Boolean?)>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'leftPredicate' @ [172:70] ==> val leftPredicate: Expression<Boolean> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseExpression[LocalVariableDescriptor]

'rightPredicate' @ [172:85] ==> val rightPredicate: Expression<Boolean> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseExpression[LocalVariableDescriptor]

'OR' @ [173:43] ==> enum entry OR defined in net.corda.core.node.services.vault.BinaryLogicalOperator[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [173:49] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'or' @ [173:65] ==> public abstract fun or(p0: (Expression<(Boolean..Boolean?)>..Expression<(Boolean..Boolean?)>?), p1: (Expression<(Boolean..Boolean?)>..Expression<(Boolean..Boolean?)>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'leftPredicate' @ [173:68] ==> val leftPredicate: Expression<Boolean> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseExpression[LocalVariableDescriptor]

'rightPredicate' @ [173:83] ==> val rightPredicate: Expression<Boolean> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseExpression[LocalVariableDescriptor]

'criteriaBuilder' @ [176:42] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'not' @ [176:58] ==> public abstract fun not(p0: (Expression<(Boolean..Boolean?)>..Expression<(Boolean..Boolean?)>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'parseExpression' @ [176:62] ==> private final fun <O, R> parseExpression(root: Root<O>, expression: CriteriaExpression<O, Boolean>): Expression<Boolean> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <R> -> Boolean

'root' @ [176:78] ==> value-parameter root: Root<O> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseExpression[ValueParameterDescriptorImpl]

'expression' @ [176:84] ==> value-parameter expression: CriteriaExpression<O, R> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseExpression[ValueParameterDescriptorImpl]

'expression' @ [176:95] ==> public final val expression: CriteriaExpression<O, Boolean> defined in net.corda.core.node.services.vault.CriteriaExpression.Not[DeserializedPropertyDescriptor]

'root' @ [178:30] ==> value-parameter root: Root<O> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseExpression[ValueParameterDescriptorImpl]

'get' @ [178:35] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<Any?>..Path<Any?>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> Any?

'getColumnName' @ [178:45] ==> public fun <O, C> getColumnName(column: Column<O, Any?>): String defined in net.corda.core.node.services.vault[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <O> -> O
    <C> -> Any?

'expression' @ [178:59] ==> value-parameter expression: CriteriaExpression<O, R> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseExpression[ValueParameterDescriptorImpl]

'column' @ [178:70] ==> public final val column: Column<O, Any?> defined in net.corda.core.node.services.vault.CriteriaExpression.ColumnPredicateExpression[DeserializedPropertyDescriptor]

'columnPredicateToPredicate' @ [179:17] ==> private final fun columnPredicateToPredicate(column: Path<out Any?>, columnPredicate: ColumnPredicate<*>): Predicate defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[SimpleFunctionDescriptorImpl]

'column' @ [179:44] ==> val column: (Path<Any?>..Path<Any?>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseExpression[LocalVariableDescriptor]

'expression' @ [179:52] ==> value-parameter expression: CriteriaExpression<O, R> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseExpression[ValueParameterDescriptorImpl]

'predicate' @ [179:63] ==> public final val predicate: ColumnPredicate<out Any?> defined in net.corda.core.node.services.vault.CriteriaExpression.ColumnPredicateExpression[DeserializedPropertyDescriptor]

'VaultQueryException' @ [181:27] ==> public constructor VaultQueryException(description: String) defined in net.corda.core.node.services.VaultQueryException[DeserializedClassConstructorDescriptor]

'expression' @ [181:72] ==> value-parameter expression: CriteriaExpression<O, R> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseExpression[ValueParameterDescriptorImpl]

'root' @ [186:22] ==> value-parameter root: Root<O> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAggregateFunction[ValueParameterDescriptorImpl]

'get' @ [186:27] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<Any?>..Path<Any?>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> Any?

'getColumnName' @ [186:37] ==> public fun <O, C> getColumnName(column: Column<O, R>): String defined in net.corda.core.node.services.vault[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <O> -> O
    <C> -> R

'expression' @ [186:51] ==> value-parameter expression: CriteriaExpression.AggregateFunctionExpression<O, R> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAggregateFunction[ValueParameterDescriptorImpl]

'column' @ [186:62] ==> public final val column: Column<O, R> defined in net.corda.core.node.services.vault.CriteriaExpression.AggregateFunctionExpression[DeserializedPropertyDescriptor]

'expression' @ [187:31] ==> value-parameter expression: CriteriaExpression.AggregateFunctionExpression<O, R> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAggregateFunction[ValueParameterDescriptorImpl]

'predicate' @ [187:42] ==> public final val predicate: ColumnPredicate<R> defined in net.corda.core.node.services.vault.CriteriaExpression.AggregateFunctionExpression[DeserializedPropertyDescriptor]

'when (columnPredicate) {
            is ColumnPredicate.AggregateFunction -> {
                @Suppress("UNCHECKED_CAST")
                column as Path<Long?>?
                val aggregateExpression =
                        when (columnPredicate.type) {
                            AggregateFunctionType.SUM -> criteriaBuilder.sum(column)
                            AggregateFunctionType.AVG -> criteriaBuilder.avg(column)
                            AggregateFunctionType.COUNT -> criteriaBuilder.count(column)
                            AggregateFunctionType.MAX -> criteriaBuilder.max(column)
                            AggregateFunctionType.MIN -> criteriaBuilder.min(column)
                        }
                aggregateExpressions.add(aggregateExpression)
                // optionally order by this aggregate function
                expression.orderBy?.let {
                    val orderCriteria =
                            when (expression.orderBy!!) {
                                Sort.Direction.ASC -> criteriaBuilder.asc(aggregateExpression)
                                Sort.Direction.DESC -> criteriaBuilder.desc(aggregateExpression)
                            }
                    criteriaQuery.orderBy(orderCriteria)
                }
                // add optional group by clauses
                expression.groupByColumns?.let { columns ->
                    val groupByExpressions =
                            columns.map { _column ->
                                val path = root.get<Any?>(getColumnName(_column))
                                aggregateExpressions.add(path)
                                path
                            }
                    criteriaQuery.groupBy(groupByExpressions)
                }
                return aggregateExpression
            }
            else -> throw VaultQueryException("Not expecting $columnPredicate")
        }' @ [188:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'columnPredicate' @ [188:15] ==> val columnPredicate: ColumnPredicate<R> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAggregateFunction[LocalVariableDescriptor]

'Suppress' @ [190:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'column' @ [191:17] ==> val column: (Path<Any?>..Path<Any?>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAggregateFunction[LocalVariableDescriptor]

'when (columnPredicate.type) {
                            AggregateFunctionType.SUM -> criteriaBuilder.sum(column)
                            AggregateFunctionType.AVG -> criteriaBuilder.avg(column)
                            AggregateFunctionType.COUNT -> criteriaBuilder.count(column)
                            AggregateFunctionType.MAX -> criteriaBuilder.max(column)
                            AggregateFunctionType.MIN -> criteriaBuilder.min(column)
                        }' @ [193:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Expression<out Any?>..Expression<out Any?>?), entry1: (Expression<out Any?>..Expression<out Any?>?), entry2: (Expression<out Any?>..Expression<out Any?>?), entry3: (Expression<out Any?>..Expression<out Any?>?), entry4: (Expression<out Any?>..Expression<out Any?>?)): (Expression<out Any?>..Expression<out Any?>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (javax.persistence.criteria.Expression<out kotlin.Any?>..javax.persistence.criteria.Expression<out kotlin.Any?>?)

'columnPredicate' @ [193:31] ==> val columnPredicate: ColumnPredicate<R> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAggregateFunction[LocalVariableDescriptor]

'type' @ [193:47] ==> public final val type: AggregateFunctionType defined in net.corda.core.node.services.vault.ColumnPredicate.AggregateFunction[DeserializedPropertyDescriptor]

'SUM' @ [194:51] ==> enum entry SUM defined in net.corda.core.node.services.vault.AggregateFunctionType[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [194:58] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'sum' @ [194:74] ==> public abstract fun <N : (Number..Number?)> sum(p0: (Expression<Long?>..Expression<Long?>?)): (Expression<Long?>..Expression<Long?>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <N : (Number..Number?)> -> Long?

'column' @ [194:78] ==> val column: (Path<Any?>..Path<Any?>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAggregateFunction[LocalVariableDescriptor]

'AVG' @ [195:51] ==> enum entry AVG defined in net.corda.core.node.services.vault.AggregateFunctionType[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [195:58] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'avg' @ [195:74] ==> public abstract fun <N : (Number..Number?)> avg(p0: (Expression<Long?>..Expression<Long?>?)): (Expression<(Double..Double?)>..Expression<(Double..Double?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <N : (Number..Number?)> -> Long?

'column' @ [195:78] ==> val column: (Path<Any?>..Path<Any?>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAggregateFunction[LocalVariableDescriptor]

'COUNT' @ [196:51] ==> enum entry COUNT defined in net.corda.core.node.services.vault.AggregateFunctionType[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [196:60] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'count' @ [196:76] ==> public abstract fun count(p0: (Expression<*>..Expression<*>?)): (Expression<(Long..Long?)>..Expression<(Long..Long?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'column' @ [196:82] ==> val column: (Path<Any?>..Path<Any?>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAggregateFunction[LocalVariableDescriptor]

'MAX' @ [197:51] ==> enum entry MAX defined in net.corda.core.node.services.vault.AggregateFunctionType[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [197:58] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'max' @ [197:74] ==> public abstract fun <N : (Number..Number?)> max(p0: (Expression<Long?>..Expression<Long?>?)): (Expression<Long?>..Expression<Long?>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <N : (Number..Number?)> -> Long?

'column' @ [197:78] ==> val column: (Path<Any?>..Path<Any?>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAggregateFunction[LocalVariableDescriptor]

'MIN' @ [198:51] ==> enum entry MIN defined in net.corda.core.node.services.vault.AggregateFunctionType[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [198:58] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'min' @ [198:74] ==> public abstract fun <N : (Number..Number?)> min(p0: (Expression<Long?>..Expression<Long?>?)): (Expression<Long?>..Expression<Long?>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <N : (Number..Number?)> -> Long?

'column' @ [198:78] ==> val column: (Path<Any?>..Path<Any?>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAggregateFunction[LocalVariableDescriptor]

'aggregateExpressions' @ [200:17] ==> private final val aggregateExpressions: MutableList<Expression<*>> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'add' @ [200:38] ==> public abstract fun add(element: Expression<*>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'aggregateExpression' @ [200:42] ==> val aggregateExpression: (Expression<out Any?>..Expression<out Any?>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAggregateFunction[LocalVariableDescriptor]

'expression' @ [202:17] ==> value-parameter expression: CriteriaExpression.AggregateFunctionExpression<O, R> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAggregateFunction[ValueParameterDescriptorImpl]

'orderBy' @ [202:28] ==> public final val orderBy: Sort.Direction? defined in net.corda.core.node.services.vault.CriteriaExpression.AggregateFunctionExpression[DeserializedPropertyDescriptor]

'let' @ [202:37] ==> @InlineOnly public inline fun <T, R> Sort.Direction.let(block: (Sort.Direction) -> (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Direction
    <R> -> (javax.persistence.criteria.CriteriaQuery<(javax.persistence.Tuple..javax.persistence.Tuple?)>..javax.persistence.criteria.CriteriaQuery<(javax.persistence.Tuple..javax.persistence.Tuple?)>?)

'when (expression.orderBy!!) {
                                Sort.Direction.ASC -> criteriaBuilder.asc(aggregateExpression)
                                Sort.Direction.DESC -> criteriaBuilder.desc(aggregateExpression)
                            }' @ [204:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Order..Order?), entry1: (Order..Order?)): (Order..Order?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (javax.persistence.criteria.Order..javax.persistence.criteria.Order?)

'expression' @ [204:35] ==> value-parameter expression: CriteriaExpression.AggregateFunctionExpression<O, R> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAggregateFunction[ValueParameterDescriptorImpl]

'orderBy' @ [204:46] ==> public final val orderBy: Sort.Direction? defined in net.corda.core.node.services.vault.CriteriaExpression.AggregateFunctionExpression[DeserializedPropertyDescriptor]

'ASC' @ [205:48] ==> enum entry ASC defined in net.corda.core.node.services.vault.Sort.Direction[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [205:55] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'asc' @ [205:71] ==> public abstract fun asc(p0: (Expression<*>..Expression<*>?)): (Order..Order?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'aggregateExpression' @ [205:75] ==> val aggregateExpression: (Expression<out Any?>..Expression<out Any?>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAggregateFunction[LocalVariableDescriptor]

'DESC' @ [206:48] ==> enum entry DESC defined in net.corda.core.node.services.vault.Sort.Direction[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [206:56] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'desc' @ [206:72] ==> public abstract fun desc(p0: (Expression<*>..Expression<*>?)): (Order..Order?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'aggregateExpression' @ [206:77] ==> val aggregateExpression: (Expression<out Any?>..Expression<out Any?>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAggregateFunction[LocalVariableDescriptor]

'criteriaQuery' @ [208:21] ==> public final val criteriaQuery: CriteriaQuery<Tuple> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'orderBy' @ [208:35] ==> public abstract fun orderBy(vararg p0: (Order..Order?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'orderCriteria' @ [208:43] ==> val orderCriteria: (Order..Order?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAggregateFunction.<anonymous>[LocalVariableDescriptor]

'expression' @ [211:17] ==> value-parameter expression: CriteriaExpression.AggregateFunctionExpression<O, R> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAggregateFunction[ValueParameterDescriptorImpl]

'groupByColumns' @ [211:28] ==> public final val groupByColumns: List<Column<O, R>>? defined in net.corda.core.node.services.vault.CriteriaExpression.AggregateFunctionExpression[DeserializedPropertyDescriptor]

'let' @ [211:44] ==> @InlineOnly public inline fun <T, R> List<Column<O, R>>.let(block: (List<Column<O, R>>) -> (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<Column<O, R>>
    <R> -> (javax.persistence.criteria.CriteriaQuery<(javax.persistence.Tuple..javax.persistence.Tuple?)>..javax.persistence.criteria.CriteriaQuery<(javax.persistence.Tuple..javax.persistence.Tuple?)>?)

'columns' @ [213:29] ==> value-parameter columns: List<Column<O, R>> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAggregateFunction.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [213:37] ==> public inline fun <T, R> Iterable<Column<O, R>>.map(transform: (Column<O, R>) -> (Path<Any?>..Path<Any?>?)): List<(Path<Any?>..Path<Any?>?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Column<O, R>
    <R> -> (javax.persistence.criteria.Path<kotlin.Any?>..javax.persistence.criteria.Path<kotlin.Any?>?)

'root' @ [214:44] ==> value-parameter root: Root<O> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAggregateFunction[ValueParameterDescriptorImpl]

'get' @ [214:49] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<Any?>..Path<Any?>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> Any?

'getColumnName' @ [214:59] ==> public fun <O, C> getColumnName(column: Column<O, R>): String defined in net.corda.core.node.services.vault[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <O> -> O
    <C> -> R

'_column' @ [214:73] ==> value-parameter _column: Column<O, R> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAggregateFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'aggregateExpressions' @ [215:33] ==> private final val aggregateExpressions: MutableList<Expression<*>> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'add' @ [215:54] ==> public abstract fun add(element: Expression<*>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'path' @ [215:58] ==> val path: (Path<Any?>..Path<Any?>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAggregateFunction.<anonymous>.<anonymous>[LocalVariableDescriptor]

'path' @ [216:33] ==> val path: (Path<Any?>..Path<Any?>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAggregateFunction.<anonymous>.<anonymous>[LocalVariableDescriptor]

'criteriaQuery' @ [218:21] ==> public final val criteriaQuery: CriteriaQuery<Tuple> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'groupBy' @ [218:35] ==> public abstract fun groupBy(p0: (MutableList<(Expression<*>..Expression<*>?)>..List<(Expression<*>..Expression<*>?)>?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'groupByExpressions' @ [218:43] ==> val groupByExpressions: List<(Path<Any?>..Path<Any?>?)> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAggregateFunction.<anonymous>[LocalVariableDescriptor]

'aggregateExpression' @ [220:24] ==> val aggregateExpression: (Expression<out Any?>..Expression<out Any?>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAggregateFunction[LocalVariableDescriptor]

'VaultQueryException' @ [222:27] ==> public constructor VaultQueryException(description: String) defined in net.corda.core.node.services.VaultQueryException[DeserializedClassConstructorDescriptor]

'columnPredicate' @ [222:63] ==> val columnPredicate: ColumnPredicate<R> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAggregateFunction[LocalVariableDescriptor]

'log' @ [227:9] ==> public final val log: Logger defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.Companion[PropertyDescriptorImpl]

'trace' @ [227:13] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'criteria' @ [227:59] ==> value-parameter criteria: QueryCriteria.FungibleAssetQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'mutableSetOf' @ [229:28] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<Predicate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Predicate

'criteriaQuery' @ [231:35] ==> public final val criteriaQuery: CriteriaQuery<Tuple> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'from' @ [231:49] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultFungibleStates..VaultSchemaV1.VaultFungibleStates?)>..Class<(VaultSchemaV1.VaultFungibleStates..VaultSchemaV1.VaultFungibleStates?)>?)): (Root<(VaultSchemaV1.VaultFungibleStates..VaultSchemaV1.VaultFungibleStates?)>..Root<(VaultSchemaV1.VaultFungibleStates..VaultSchemaV1.VaultFungibleStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultFungibleStates..net.corda.node.services.vault.VaultSchemaV1.VaultFungibleStates?)

'VaultSchemaV1' @ [231:54] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'java' @ [231:95] ==> public val <T> KClass<VaultSchemaV1.VaultFungibleStates>.java: Class<VaultSchemaV1.VaultFungibleStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultFungibleStates

'rootEntities' @ [232:9] ==> private final val rootEntities: MutableMap<Class<out PersistentState>, Root<*>> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'putIfAbsent' @ [232:22] ==> public open fun putIfAbsent(p0: Class<out PersistentState>, p1: Root<*>): Root<*>? defined in kotlin.collections.MutableMap[JavaMethodDescriptor]

'VaultSchemaV1' @ [232:34] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'java' @ [232:75] ==> public val <T> KClass<VaultSchemaV1.VaultFungibleStates>.java: Class<VaultSchemaV1.VaultFungibleStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultFungibleStates

'vaultFungibleStates' @ [232:81] ==> val vaultFungibleStates: (Root<(VaultSchemaV1.VaultFungibleStates..VaultSchemaV1.VaultFungibleStates?)>..Root<(VaultSchemaV1.VaultFungibleStates..VaultSchemaV1.VaultFungibleStates?)>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'criteriaBuilder' @ [234:29] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'equal' @ [234:45] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Expression<*>..Expression<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [234:51] ==> public final val vaultStates: Root<VaultSchemaV1.VaultStates> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'get' @ [234:63] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(PersistentStateRef..PersistentStateRef?)>..Path<(PersistentStateRef..PersistentStateRef?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> PersistentStateRef

'vaultFungibleStates' @ [234:100] ==> val vaultFungibleStates: (Root<(VaultSchemaV1.VaultFungibleStates..VaultSchemaV1.VaultFungibleStates?)>..Root<(VaultSchemaV1.VaultFungibleStates..VaultSchemaV1.VaultFungibleStates?)>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'get' @ [234:120] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(PersistentStateRef..PersistentStateRef?)>..Path<(PersistentStateRef..PersistentStateRef?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> PersistentStateRef

'predicateSet' @ [235:9] ==> val predicateSet: MutableSet<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'add' @ [235:22] ==> public abstract fun add(element: Predicate): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'joinPredicate' @ [235:26] ==> val joinPredicate: (Predicate..Predicate?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'criteria' @ [238:9] ==> value-parameter criteria: QueryCriteria.FungibleAssetQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'owner' @ [238:18] ==> public final val owner: List<AbstractParty>? defined in net.corda.core.node.services.vault.QueryCriteria.FungibleAssetQueryCriteria[DeserializedPropertyDescriptor]

'let' @ [238:25] ==> @InlineOnly public inline fun <T, R> List<AbstractParty>.let(block: (List<AbstractParty>) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<AbstractParty>
    <R> -> Boolean

'criteria' @ [239:26] ==> value-parameter criteria: QueryCriteria.FungibleAssetQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'owner' @ [239:35] ==> public final val owner: List<AbstractParty>? defined in net.corda.core.node.services.vault.QueryCriteria.FungibleAssetQueryCriteria[DeserializedPropertyDescriptor]

'predicateSet' @ [240:13] ==> val predicateSet: MutableSet<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'add' @ [240:26] ==> public abstract fun add(element: Predicate): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'criteriaBuilder' @ [240:30] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'and' @ [240:46] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultFungibleStates' @ [240:50] ==> val vaultFungibleStates: (Root<(VaultSchemaV1.VaultFungibleStates..VaultSchemaV1.VaultFungibleStates?)>..Root<(VaultSchemaV1.VaultFungibleStates..VaultSchemaV1.VaultFungibleStates?)>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'get' @ [240:70] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(AbstractParty..AbstractParty?)>..Path<(AbstractParty..AbstractParty?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> AbstractParty

'`in`' @ [240:98] ==> public abstract fun `in`(p0: (MutableCollection<*>..Collection<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.Path[JavaMethodDescriptor]

'owners' @ [240:103] ==> val owners: List<AbstractParty> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>[LocalVariableDescriptor]

'criteria' @ [244:9] ==> value-parameter criteria: QueryCriteria.FungibleAssetQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'quantity' @ [244:18] ==> public final val quantity: ColumnPredicate<Long>? defined in net.corda.core.node.services.vault.QueryCriteria.FungibleAssetQueryCriteria[DeserializedPropertyDescriptor]

'let' @ [244:28] ==> @InlineOnly public inline fun <T, R> ColumnPredicate<Long>.let(block: (ColumnPredicate<Long>) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ColumnPredicate<Long>
    <R> -> Boolean

'predicateSet' @ [245:13] ==> val predicateSet: MutableSet<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'add' @ [245:26] ==> public abstract fun add(element: Predicate): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'columnPredicateToPredicate' @ [245:30] ==> private final fun columnPredicateToPredicate(column: Path<out Any?>, columnPredicate: ColumnPredicate<*>): Predicate defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[SimpleFunctionDescriptorImpl]

'vaultFungibleStates' @ [245:57] ==> val vaultFungibleStates: (Root<(VaultSchemaV1.VaultFungibleStates..VaultSchemaV1.VaultFungibleStates?)>..Root<(VaultSchemaV1.VaultFungibleStates..VaultSchemaV1.VaultFungibleStates?)>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'get' @ [245:77] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Long..Long?)>..Path<(Long..Long?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> Long

'it' @ [245:100] ==> value-parameter it: ColumnPredicate<Long> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>[ValueParameterDescriptorImpl]

'criteria' @ [249:9] ==> value-parameter criteria: QueryCriteria.FungibleAssetQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'issuer' @ [249:18] ==> public final val issuer: List<AbstractParty>? defined in net.corda.core.node.services.vault.QueryCriteria.FungibleAssetQueryCriteria[DeserializedPropertyDescriptor]

'let' @ [249:26] ==> @InlineOnly public inline fun <T, R> List<AbstractParty>.let(block: (List<AbstractParty>) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<AbstractParty>
    <R> -> Boolean

'criteria' @ [250:33] ==> value-parameter criteria: QueryCriteria.FungibleAssetQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'issuer' @ [250:42] ==> public final val issuer: List<AbstractParty>? defined in net.corda.core.node.services.vault.QueryCriteria.FungibleAssetQueryCriteria[DeserializedPropertyDescriptor]

'predicateSet' @ [251:13] ==> val predicateSet: MutableSet<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'add' @ [251:26] ==> public abstract fun add(element: Predicate): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'criteriaBuilder' @ [251:30] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'and' @ [251:46] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultFungibleStates' @ [251:50] ==> val vaultFungibleStates: (Root<(VaultSchemaV1.VaultFungibleStates..VaultSchemaV1.VaultFungibleStates?)>..Root<(VaultSchemaV1.VaultFungibleStates..VaultSchemaV1.VaultFungibleStates?)>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'get' @ [251:70] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(AbstractParty..AbstractParty?)>..Path<(AbstractParty..AbstractParty?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> AbstractParty

'`in`' @ [251:99] ==> public abstract fun `in`(p0: (MutableCollection<*>..Collection<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.Path[JavaMethodDescriptor]

'issuerParties' @ [251:104] ==> val issuerParties: List<AbstractParty> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>[LocalVariableDescriptor]

'criteria' @ [255:9] ==> value-parameter criteria: QueryCriteria.FungibleAssetQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'issuerRef' @ [255:18] ==> public final val issuerRef: List<OpaqueBytes>? defined in net.corda.core.node.services.vault.QueryCriteria.FungibleAssetQueryCriteria[DeserializedPropertyDescriptor]

'let' @ [255:29] ==> @InlineOnly public inline fun <T, R> List<OpaqueBytes>.let(block: (List<OpaqueBytes>) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<OpaqueBytes>
    <R> -> Boolean

'criteria' @ [256:31] ==> value-parameter criteria: QueryCriteria.FungibleAssetQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'issuerRef' @ [256:40] ==> public final val issuerRef: List<OpaqueBytes>? defined in net.corda.core.node.services.vault.QueryCriteria.FungibleAssetQueryCriteria[DeserializedPropertyDescriptor]

'map' @ [256:72] ==> public inline fun <T, R> Iterable<OpaqueBytes>.map(transform: (OpaqueBytes) -> ByteArray): List<ByteArray> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OpaqueBytes
    <R> -> ByteArray

'it' @ [256:78] ==> value-parameter it: OpaqueBytes defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'bytes' @ [256:81] ==> public open val bytes: ByteArray defined in net.corda.core.utilities.OpaqueBytes[DeserializedPropertyDescriptor]

'predicateSet' @ [257:13] ==> val predicateSet: MutableSet<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'add' @ [257:26] ==> public abstract fun add(element: Predicate): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'criteriaBuilder' @ [257:30] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'and' @ [257:46] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultFungibleStates' @ [257:50] ==> val vaultFungibleStates: (Root<(VaultSchemaV1.VaultFungibleStates..VaultSchemaV1.VaultFungibleStates?)>..Root<(VaultSchemaV1.VaultFungibleStates..VaultSchemaV1.VaultFungibleStates?)>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'get' @ [257:70] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(ByteArray..ByteArray?)>..Path<(ByteArray..ByteArray?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> ByteArray

'`in`' @ [257:98] ==> public abstract fun `in`(p0: (MutableCollection<*>..Collection<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.Path[JavaMethodDescriptor]

'issuerRefs' @ [257:103] ==> val issuerRefs: List<ByteArray> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>[LocalVariableDescriptor]

'criteria' @ [261:9] ==> value-parameter criteria: QueryCriteria.FungibleAssetQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'participants' @ [261:18] ==> public final val participants: List<AbstractParty>? defined in net.corda.core.node.services.vault.QueryCriteria.FungibleAssetQueryCriteria[DeserializedPropertyDescriptor]

'let' @ [261:32] ==> @InlineOnly public inline fun <T, R> List<AbstractParty>.let(block: (List<AbstractParty>) -> (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<AbstractParty>
    <R> -> (javax.persistence.criteria.CriteriaQuery<(javax.persistence.Tuple..javax.persistence.Tuple?)>..javax.persistence.criteria.CriteriaQuery<(javax.persistence.Tuple..javax.persistence.Tuple?)>?)

'criteria' @ [262:32] ==> value-parameter criteria: QueryCriteria.FungibleAssetQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'participants' @ [262:41] ==> public final val participants: List<AbstractParty>? defined in net.corda.core.node.services.vault.QueryCriteria.FungibleAssetQueryCriteria[DeserializedPropertyDescriptor]

'vaultFungibleStates' @ [263:42] ==> val vaultFungibleStates: (Root<(VaultSchemaV1.VaultFungibleStates..VaultSchemaV1.VaultFungibleStates?)>..Root<(VaultSchemaV1.VaultFungibleStates..VaultSchemaV1.VaultFungibleStates?)>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'joinSet' @ [263:62] ==> public abstract fun <X : (Any..Any?), Y : (Any..Any?)> joinSet(p0: (String..String?)): (SetJoin<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?), (AbstractParty..AbstractParty?)>..SetJoin<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?), (AbstractParty..AbstractParty?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> VaultLinearStates
    <Y : (Any..Any?)> -> AbstractParty

'predicateSet' @ [264:13] ==> val predicateSet: MutableSet<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'add' @ [264:26] ==> public abstract fun add(element: Predicate): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'criteriaBuilder' @ [264:30] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'and' @ [264:46] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'joinLinearStateToParty' @ [264:50] ==> val joinLinearStateToParty: (SetJoin<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?), (AbstractParty..AbstractParty?)>..SetJoin<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?), (AbstractParty..AbstractParty?)>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>[LocalVariableDescriptor]

'`in`' @ [264:73] ==> public abstract fun `in`(p0: (MutableCollection<*>..Collection<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.SetJoin[JavaMethodDescriptor]

'participants' @ [264:78] ==> val participants: List<AbstractParty> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>[LocalVariableDescriptor]

'criteriaQuery' @ [265:13] ==> public final val criteriaQuery: CriteriaQuery<Tuple> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'distinct' @ [265:27] ==> public abstract fun distinct(p0: Boolean): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'predicateSet' @ [267:16] ==> val predicateSet: MutableSet<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'log' @ [271:9] ==> public final val log: Logger defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.Companion[PropertyDescriptorImpl]

'trace' @ [271:13] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'criteria' @ [271:57] ==> value-parameter criteria: QueryCriteria.LinearStateQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'mutableSetOf' @ [273:28] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<Predicate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Predicate

'criteriaQuery' @ [275:33] ==> public final val criteriaQuery: CriteriaQuery<Tuple> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'from' @ [275:47] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Class<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?)): (Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultLinearStates..net.corda.node.services.vault.VaultSchemaV1.VaultLinearStates?)

'VaultSchemaV1' @ [275:52] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'java' @ [275:91] ==> public val <T> KClass<VaultSchemaV1.VaultLinearStates>.java: Class<VaultSchemaV1.VaultLinearStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultLinearStates

'rootEntities' @ [276:9] ==> private final val rootEntities: MutableMap<Class<out PersistentState>, Root<*>> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'putIfAbsent' @ [276:22] ==> public open fun putIfAbsent(p0: Class<out PersistentState>, p1: Root<*>): Root<*>? defined in kotlin.collections.MutableMap[JavaMethodDescriptor]

'VaultSchemaV1' @ [276:34] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'java' @ [276:73] ==> public val <T> KClass<VaultSchemaV1.VaultLinearStates>.java: Class<VaultSchemaV1.VaultLinearStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultLinearStates

'vaultLinearStates' @ [276:79] ==> val vaultLinearStates: (Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'criteriaBuilder' @ [278:29] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'equal' @ [278:45] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Expression<*>..Expression<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [278:51] ==> public final val vaultStates: Root<VaultSchemaV1.VaultStates> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'get' @ [278:63] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(PersistentStateRef..PersistentStateRef?)>..Path<(PersistentStateRef..PersistentStateRef?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> PersistentStateRef

'vaultLinearStates' @ [278:100] ==> val vaultLinearStates: (Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'get' @ [278:118] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(PersistentStateRef..PersistentStateRef?)>..Path<(PersistentStateRef..PersistentStateRef?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> PersistentStateRef

'joinPredicates' @ [279:9] ==> private final val joinPredicates: MutableList<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'add' @ [279:24] ==> public abstract fun add(element: Predicate): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'joinPredicate' @ [279:28] ==> val joinPredicate: (Predicate..Predicate?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'criteria' @ [282:9] ==> value-parameter criteria: QueryCriteria.LinearStateQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'uuid' @ [282:18] ==> public final val uuid: List<UUID>? defined in net.corda.core.node.services.vault.QueryCriteria.LinearStateQueryCriteria[DeserializedPropertyDescriptor]

'let' @ [282:24] ==> @InlineOnly public inline fun <T, R> List<UUID>.let(block: (List<UUID>) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<UUID>
    <R> -> Boolean

'criteria' @ [283:25] ==> value-parameter criteria: QueryCriteria.LinearStateQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'uuid' @ [283:34] ==> public final val uuid: List<UUID>? defined in net.corda.core.node.services.vault.QueryCriteria.LinearStateQueryCriteria[DeserializedPropertyDescriptor]

'predicateSet' @ [284:13] ==> val predicateSet: MutableSet<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'add' @ [284:26] ==> public abstract fun add(element: Predicate): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'criteriaBuilder' @ [284:30] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'and' @ [284:46] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultLinearStates' @ [284:50] ==> val vaultLinearStates: (Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'get' @ [284:68] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(UUID..UUID?)>..Path<(UUID..UUID?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> UUID

'`in`' @ [284:86] ==> public abstract fun `in`(p0: (MutableCollection<*>..Collection<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.Path[JavaMethodDescriptor]

'uuids' @ [284:91] ==> val uuids: List<UUID> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>[LocalVariableDescriptor]

'criteria' @ [288:9] ==> value-parameter criteria: QueryCriteria.LinearStateQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'externalId' @ [288:18] ==> public final val externalId: List<String>? defined in net.corda.core.node.services.vault.QueryCriteria.LinearStateQueryCriteria[DeserializedPropertyDescriptor]

'let' @ [288:30] ==> @InlineOnly public inline fun <T, R> List<String>.let(block: (List<String>) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<String>
    <R> -> Boolean

'criteria' @ [289:31] ==> value-parameter criteria: QueryCriteria.LinearStateQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'externalId' @ [289:40] ==> public final val externalId: List<String>? defined in net.corda.core.node.services.vault.QueryCriteria.LinearStateQueryCriteria[DeserializedPropertyDescriptor]

'predicateSet' @ [290:13] ==> val predicateSet: MutableSet<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'add' @ [290:26] ==> public abstract fun add(element: Predicate): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'criteriaBuilder' @ [290:30] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'and' @ [290:46] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultLinearStates' @ [290:50] ==> val vaultLinearStates: (Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'get' @ [290:68] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'`in`' @ [290:94] ==> public abstract fun `in`(p0: (MutableCollection<*>..Collection<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.Path[JavaMethodDescriptor]

'externalIds' @ [290:99] ==> val externalIds: List<String> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>[LocalVariableDescriptor]

'criteria' @ [294:9] ==> value-parameter criteria: QueryCriteria.LinearStateQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'participants' @ [294:18] ==> public final val participants: List<AbstractParty>? defined in net.corda.core.node.services.vault.QueryCriteria.LinearStateQueryCriteria[DeserializedPropertyDescriptor]

'let' @ [294:32] ==> @InlineOnly public inline fun <T, R> List<AbstractParty>.let(block: (List<AbstractParty>) -> (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<AbstractParty>
    <R> -> (javax.persistence.criteria.CriteriaQuery<(javax.persistence.Tuple..javax.persistence.Tuple?)>..javax.persistence.criteria.CriteriaQuery<(javax.persistence.Tuple..javax.persistence.Tuple?)>?)

'criteria' @ [295:32] ==> value-parameter criteria: QueryCriteria.LinearStateQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'participants' @ [295:41] ==> public final val participants: List<AbstractParty>? defined in net.corda.core.node.services.vault.QueryCriteria.LinearStateQueryCriteria[DeserializedPropertyDescriptor]

'vaultLinearStates' @ [296:42] ==> val vaultLinearStates: (Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'joinSet' @ [296:60] ==> public abstract fun <X : (Any..Any?), Y : (Any..Any?)> joinSet(p0: (String..String?)): (SetJoin<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?), (AbstractParty..AbstractParty?)>..SetJoin<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?), (AbstractParty..AbstractParty?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> VaultLinearStates
    <Y : (Any..Any?)> -> AbstractParty

'predicateSet' @ [297:13] ==> val predicateSet: MutableSet<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'add' @ [297:26] ==> public abstract fun add(element: Predicate): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'criteriaBuilder' @ [297:30] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'and' @ [297:46] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'joinLinearStateToParty' @ [297:50] ==> val joinLinearStateToParty: (SetJoin<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?), (AbstractParty..AbstractParty?)>..SetJoin<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?), (AbstractParty..AbstractParty?)>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>[LocalVariableDescriptor]

'`in`' @ [297:73] ==> public abstract fun `in`(p0: (MutableCollection<*>..Collection<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.SetJoin[JavaMethodDescriptor]

'participants' @ [297:78] ==> val participants: List<AbstractParty> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>[LocalVariableDescriptor]

'criteriaQuery' @ [298:13] ==> public final val criteriaQuery: CriteriaQuery<Tuple> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'distinct' @ [298:27] ==> public abstract fun distinct(p0: Boolean): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'predicateSet' @ [300:16] ==> val predicateSet: MutableSet<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'log' @ [304:9] ==> public final val log: Logger defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.Companion[PropertyDescriptorImpl]

'trace' @ [304:13] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'criteria' @ [304:57] ==> value-parameter criteria: QueryCriteria.VaultCustomQueryCriteria<L> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'mutableSetOf' @ [306:28] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<Predicate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Predicate

'resolveEnclosingObjectFromExpression' @ [307:27] ==> public fun <O, R> resolveEnclosingObjectFromExpression(expression: CriteriaExpression<L, Boolean>): Class<L> defined in net.corda.core.node.services.vault[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <O> -> L
    <R> -> Boolean

'criteria' @ [307:64] ==> value-parameter criteria: QueryCriteria.VaultCustomQueryCriteria<L> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'expression' @ [307:73] ==> public final val expression: CriteriaExpression<L, Boolean> defined in net.corda.core.node.services.vault.QueryCriteria.VaultCustomQueryCriteria[DeserializedPropertyDescriptor]

'criteriaQuery' @ [310:30] ==> public final val criteriaQuery: CriteriaQuery<Tuple> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'from' @ [310:44] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(L..L?)>..Class<(L..L?)>?)): (Root<(L..L?)>..Root<(L..L?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (L..L?)

'entityClass' @ [310:49] ==> val entityClass: Class<L> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'rootEntities' @ [311:13] ==> private final val rootEntities: MutableMap<Class<out PersistentState>, Root<*>> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'putIfAbsent' @ [311:26] ==> public open fun putIfAbsent(p0: Class<out PersistentState>, p1: Root<*>): Root<*>? defined in kotlin.collections.MutableMap[JavaMethodDescriptor]

'entityClass' @ [311:38] ==> val entityClass: Class<L> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'entityRoot' @ [311:51] ==> val entityRoot: (Root<(L..L?)>..Root<(L..L?)>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'criteriaBuilder' @ [313:33] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'equal' @ [313:49] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Expression<*>..Expression<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [313:55] ==> public final val vaultStates: Root<VaultSchemaV1.VaultStates> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'get' @ [313:67] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(PersistentStateRef..PersistentStateRef?)>..Path<(PersistentStateRef..PersistentStateRef?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> PersistentStateRef

'entityRoot' @ [313:104] ==> val entityRoot: (Root<(L..L?)>..Root<(L..L?)>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'get' @ [313:115] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(PersistentStateRef..PersistentStateRef?)>..Path<(PersistentStateRef..PersistentStateRef?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> PersistentStateRef

'joinPredicates' @ [314:13] ==> private final val joinPredicates: MutableList<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'add' @ [314:28] ==> public abstract fun add(element: Predicate): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'joinPredicate' @ [314:32] ==> val joinPredicate: (Predicate..Predicate?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'parseExpression' @ [317:13] ==> private final fun <O> parseExpression(entityRoot: Root<(L..L?)>, expression: CriteriaExpression<(L..L?), Boolean>, predicateSet: MutableSet<Predicate>): Unit defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> (L..L?)

'entityRoot' @ [317:29] ==> val entityRoot: (Root<(L..L?)>..Root<(L..L?)>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'criteria' @ [317:41] ==> value-parameter criteria: QueryCriteria.VaultCustomQueryCriteria<L> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'expression' @ [317:50] ==> public final val expression: CriteriaExpression<L, Boolean> defined in net.corda.core.node.services.vault.QueryCriteria.VaultCustomQueryCriteria[DeserializedPropertyDescriptor]

'predicateSet' @ [317:62] ==> val predicateSet: MutableSet<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'e' @ [320:13] ==> val e: Exception /* = Exception */ defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'message' @ [320:15] ==> public open val message: String? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'let' @ [320:24] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Unit

'message' @ [321:21] ==> value-parameter message: String defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>[ValueParameterDescriptorImpl]

'contains' @ [321:29] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'VaultQueryException' @ [322:27] ==> public constructor VaultQueryException(description: String) defined in net.corda.core.node.services.VaultQueryException[DeserializedClassConstructorDescriptor]

'entityClass' @ [323:51] ==> val entityClass: Class<L> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'name' @ [323:63] ==> public final val <T : (Any..Any?)> Class<L>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> L

'substringBefore' @ [323:68] ==> public fun String.substringBefore(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'VaultQueryException' @ [327:19] ==> public constructor VaultQueryException(description: String) defined in net.corda.core.node.services.VaultQueryException[DeserializedClassConstructorDescriptor]

'e' @ [327:57] ==> val e: Exception /* = Exception */ defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'message' @ [327:59] ==> public open val message: String? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'predicateSet' @ [329:16] ==> val predicateSet: MutableSet<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'log' @ [333:9] ==> public final val log: Logger defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.Companion[PropertyDescriptorImpl]

'trace' @ [333:13] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'left' @ [333:61] ==> value-parameter left: QueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseOr[ValueParameterDescriptorImpl]

'right' @ [333:70] ==> value-parameter right: QueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseOr[ValueParameterDescriptorImpl]

'mutableSetOf' @ [335:28] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<Predicate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Predicate

'parse' @ [336:30] ==> public open fun parse(criteria: QueryCriteria, sorting: Sort?): Collection<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[SimpleFunctionDescriptorImpl]

'left' @ [336:36] ==> value-parameter left: QueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseOr[ValueParameterDescriptorImpl]

'parse' @ [337:31] ==> public open fun parse(criteria: QueryCriteria, sorting: Sort?): Collection<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[SimpleFunctionDescriptorImpl]

'right' @ [337:37] ==> value-parameter right: QueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseOr[ValueParameterDescriptorImpl]

'criteriaBuilder' @ [339:27] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'or' @ [339:43] ==> public abstract fun or(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'leftPredicates' @ [339:47] ==> val leftPredicates: Collection<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseOr[LocalVariableDescriptor]

'toTypedArray' @ [339:62] ==> public inline fun <reified T> Collection<Predicate>.toTypedArray(): Array<Predicate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Predicate

'rightPredicates' @ [339:79] ==> val rightPredicates: Collection<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseOr[LocalVariableDescriptor]

'toTypedArray' @ [339:95] ==> public inline fun <reified T> Collection<Predicate>.toTypedArray(): Array<Predicate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Predicate

'predicateSet' @ [340:9] ==> val predicateSet: MutableSet<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseOr[LocalVariableDescriptor]

'add' @ [340:22] ==> public abstract fun add(element: Predicate): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'orPredicate' @ [340:26] ==> val orPredicate: (Predicate..Predicate?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseOr[LocalVariableDescriptor]

'predicateSet' @ [342:16] ==> val predicateSet: MutableSet<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseOr[LocalVariableDescriptor]

'log' @ [346:9] ==> public final val log: Logger defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.Companion[PropertyDescriptorImpl]

'trace' @ [346:13] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'left' @ [346:62] ==> value-parameter left: QueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAnd[ValueParameterDescriptorImpl]

'right' @ [346:72] ==> value-parameter right: QueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAnd[ValueParameterDescriptorImpl]

'mutableSetOf' @ [348:28] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<Predicate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Predicate

'parse' @ [349:30] ==> public open fun parse(criteria: QueryCriteria, sorting: Sort?): Collection<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[SimpleFunctionDescriptorImpl]

'left' @ [349:36] ==> value-parameter left: QueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAnd[ValueParameterDescriptorImpl]

'parse' @ [350:31] ==> public open fun parse(criteria: QueryCriteria, sorting: Sort?): Collection<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[SimpleFunctionDescriptorImpl]

'right' @ [350:37] ==> value-parameter right: QueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAnd[ValueParameterDescriptorImpl]

'criteriaBuilder' @ [352:28] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'and' @ [352:44] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'leftPredicates' @ [352:49] ==> val leftPredicates: Collection<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAnd[LocalVariableDescriptor]

'toTypedArray' @ [352:64] ==> public inline fun <reified T> Collection<Predicate>.toTypedArray(): Array<Predicate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Predicate

'rightPredicates' @ [352:81] ==> val rightPredicates: Collection<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAnd[LocalVariableDescriptor]

'toTypedArray' @ [352:97] ==> public inline fun <reified T> Collection<Predicate>.toTypedArray(): Array<Predicate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Predicate

'predicateSet' @ [353:9] ==> val predicateSet: MutableSet<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAnd[LocalVariableDescriptor]

'add' @ [353:22] ==> public abstract fun add(element: Predicate): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'andPredicate' @ [353:26] ==> val andPredicate: (Predicate..Predicate?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAnd[LocalVariableDescriptor]

'predicateSet' @ [355:16] ==> val predicateSet: MutableSet<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseAnd[LocalVariableDescriptor]

'criteria' @ [359:28] ==> value-parameter criteria: QueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse[ValueParameterDescriptorImpl]

'visit' @ [359:37] ==> public abstract fun visit(parser: IQueryCriteriaParser): Collection<Predicate> defined in net.corda.core.node.services.vault.QueryCriteria[DeserializedSimpleFunctionDescriptor]

'this' @ [359:43] ==> <this> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[LazyClassReceiverParameterDescriptor]

'sorting' @ [361:9] ==> value-parameter sorting: Sort? defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse[ValueParameterDescriptorImpl]

'let' @ [361:18] ==> @InlineOnly public inline fun <T, R> Sort.let(block: (Sort) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Sort
    <R> -> Unit

'sorting' @ [362:17] ==> value-parameter sorting: Sort? defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse[ValueParameterDescriptorImpl]

'columns' @ [362:25] ==> public final val columns: Collection<Sort.SortColumn> defined in net.corda.core.node.services.vault.Sort[DeserializedPropertyDescriptor]

'isNotEmpty' @ [362:33] ==> @InlineOnly public inline fun <T> Collection<Sort.SortColumn>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SortColumn

'parse' @ [363:17] ==> private final fun parse(sorting: Sort): Unit defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[SimpleFunctionDescriptorImpl]

'sorting' @ [363:23] ==> value-parameter sorting: Sort? defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse[ValueParameterDescriptorImpl]

'if (aggregateExpressions.isEmpty())
                    rootEntities.map { it.value }
                else
                    aggregateExpressions' @ [367:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<Expression<*>>, elseBranch: List<Expression<*>>): List<Expression<*>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<Expression<*>>

'aggregateExpressions' @ [367:21] ==> private final val aggregateExpressions: MutableList<Expression<*>> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'isEmpty' @ [367:42] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'rootEntities' @ [368:21] ==> private final val rootEntities: MutableMap<Class<out PersistentState>, Root<*>> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'map' @ [368:34] ==> public inline fun <K, V, R> Map<out Class<out PersistentState>, Root<*>>.map(transform: (Map.Entry<Class<out PersistentState>, Root<*>>) -> Root<*>): List<Root<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Class<out PersistentState>
    <V> -> Root<*>
    <R> -> Root<*>

'it' @ [368:40] ==> value-parameter it: Map.Entry<Class<out PersistentState>, Root<*>> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [368:43] ==> public abstract val value: Root<*> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'aggregateExpressions' @ [370:21] ==> private final val aggregateExpressions: MutableList<Expression<*>> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'criteriaQuery' @ [371:9] ==> public final val criteriaQuery: CriteriaQuery<Tuple> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'multiselect' @ [371:23] ==> public abstract fun multiselect(p0: (MutableList<(Selection<*>..Selection<*>?)>..List<(Selection<*>..Selection<*>?)>?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'selections' @ [371:35] ==> val selections: List<Expression<*>> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse[LocalVariableDescriptor]

'joinPredicates' @ [372:34] ==> private final val joinPredicates: MutableList<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'plus' @ [372:49] ==> public operator fun <T> Collection<Predicate>.plus(elements: Iterable<Predicate>): List<Predicate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Predicate

'predicateSet' @ [372:54] ==> val predicateSet: Collection<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse[LocalVariableDescriptor]

'plus' @ [372:68] ==> public operator fun <T> Collection<Predicate>.plus(elements: Iterable<Predicate>): List<Predicate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Predicate

'commonPredicates' @ [372:73] ==> private final val commonPredicates: MutableMap<Pair<String, Operator>, Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'values' @ [372:90] ==> public abstract val values: MutableCollection<Predicate> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'criteriaQuery' @ [373:9] ==> public final val criteriaQuery: CriteriaQuery<Tuple> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'where' @ [373:23] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'combinedPredicates' @ [373:30] ==> val combinedPredicates: List<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse[LocalVariableDescriptor]

'toTypedArray' @ [373:49] ==> public inline fun <reified T> Collection<Predicate>.toTypedArray(): Array<Predicate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Predicate

'predicateSet' @ [375:16] ==> val predicateSet: Collection<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse[LocalVariableDescriptor]

'log' @ [379:9] ==> public final val log: Logger defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.Companion[PropertyDescriptorImpl]

'trace' @ [379:13] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'criteria' @ [379:52] ==> value-parameter criteria: QueryCriteria.CommonQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'stateTypes' @ [382:9] ==> public final var stateTypes: Vault.StateStatus defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'criteria' @ [382:22] ==> value-parameter criteria: QueryCriteria.CommonQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'status' @ [382:31] ==> public abstract val status: Vault.StateStatus defined in net.corda.core.node.services.vault.QueryCriteria.CommonQueryCriteria[DeserializedPropertyDescriptor]

'criteria' @ [383:13] ==> value-parameter criteria: QueryCriteria.CommonQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'status' @ [383:22] ==> public abstract val status: Vault.StateStatus defined in net.corda.core.node.services.vault.QueryCriteria.CommonQueryCriteria[DeserializedPropertyDescriptor]

'ALL' @ [383:50] ==> enum entry ALL defined in net.corda.core.node.services.Vault.StateStatus[FakeCallableDescriptorForObject]

'Pair' @ [384:31] ==> public constructor Pair<out A, out B>(first: String, second: EqualityComparisonOperator) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> EqualityComparisonOperator

'VaultSchemaV1' @ [384:36] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [384:50] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'stateStatus' @ [384:63] ==> @Column public final var stateStatus: Vault.StateStatus defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [384:75] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'EQUAL' @ [384:108] ==> enum entry EQUAL defined in net.corda.core.node.services.vault.EqualityComparisonOperator[FakeCallableDescriptorForObject]

'if (commonPredicates.containsKey(predicateID)) {
                val existingStatus = ((commonPredicates[predicateID] as ComparisonPredicate).rightHandOperand as LiteralExpression).literal
                if (existingStatus != criteria.status) {
                    log.warn("Overriding previous attribute [${VaultSchemaV1.VaultStates::stateStatus.name}] value $existingStatus with ${criteria.status}")
                    commonPredicates.replace(predicateID, criteriaBuilder.equal(vaultStates.get<Vault.StateStatus>(VaultSchemaV1.VaultStates::stateStatus.name), criteria.status))
                }
            }
            else {
                commonPredicates.put(predicateID, criteriaBuilder.equal(vaultStates.get<Vault.StateStatus>(VaultSchemaV1.VaultStates::stateStatus.name), criteria.status))
            }' @ [385:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'commonPredicates' @ [385:17] ==> private final val commonPredicates: MutableMap<Pair<String, Operator>, Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'containsKey' @ [385:34] ==> public abstract fun containsKey(key: Pair<String, Operator>): Boolean defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'predicateID' @ [385:46] ==> val predicateID: Pair<String, EqualityComparisonOperator> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'commonPredicates' @ [386:40] ==> private final val commonPredicates: MutableMap<Pair<String, Operator>, Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'predicateID' @ [386:57] ==> val predicateID: Pair<String, EqualityComparisonOperator> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'rightHandOperand' @ [386:94] ==> public final val ComparisonPredicate.rightHandOperand: raw (Expression<(Any..Any?)>..Expression<*>?)[MyPropertyDescriptor]

'literal' @ [386:133] ==> public final val <T : (Any..Any?)> LiteralExpression<(Any..Any?)>.literal: (Any..Any?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'existingStatus' @ [387:21] ==> val existingStatus: (Any..Any?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'criteria' @ [387:39] ==> value-parameter criteria: QueryCriteria.CommonQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'status' @ [387:48] ==> public abstract val status: Vault.StateStatus defined in net.corda.core.node.services.vault.QueryCriteria.CommonQueryCriteria[DeserializedPropertyDescriptor]

'log' @ [388:21] ==> public final val log: Logger defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.Companion[PropertyDescriptorImpl]

'warn' @ [388:25] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'VaultSchemaV1' @ [388:64] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [388:78] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'stateStatus' @ [388:91] ==> @Column public final var stateStatus: Vault.StateStatus defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [388:103] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'existingStatus' @ [388:117] ==> val existingStatus: (Any..Any?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'criteria' @ [388:139] ==> value-parameter criteria: QueryCriteria.CommonQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'status' @ [388:148] ==> public abstract val status: Vault.StateStatus defined in net.corda.core.node.services.vault.QueryCriteria.CommonQueryCriteria[DeserializedPropertyDescriptor]

'commonPredicates' @ [389:21] ==> private final val commonPredicates: MutableMap<Pair<String, Operator>, Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'replace' @ [389:38] ==> public open fun replace(p0: Pair<String, Operator>, p1: Predicate): Predicate? defined in kotlin.collections.MutableMap[JavaMethodDescriptor]

'predicateID' @ [389:46] ==> val predicateID: Pair<String, EqualityComparisonOperator> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'criteriaBuilder' @ [389:59] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'equal' @ [389:75] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [389:81] ==> public final val vaultStates: Root<VaultSchemaV1.VaultStates> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'get' @ [389:93] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Vault.StateStatus..Vault.StateStatus?)>..Path<(Vault.StateStatus..Vault.StateStatus?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> StateStatus

'VaultSchemaV1' @ [389:116] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [389:130] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'stateStatus' @ [389:143] ==> @Column public final var stateStatus: Vault.StateStatus defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [389:155] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'criteria' @ [389:162] ==> value-parameter criteria: QueryCriteria.CommonQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'status' @ [389:171] ==> public abstract val status: Vault.StateStatus defined in net.corda.core.node.services.vault.QueryCriteria.CommonQueryCriteria[DeserializedPropertyDescriptor]

'commonPredicates' @ [393:17] ==> private final val commonPredicates: MutableMap<Pair<String, Operator>, Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'put' @ [393:34] ==> public abstract fun put(key: Pair<String, Operator>, value: Predicate): Predicate? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'predicateID' @ [393:38] ==> val predicateID: Pair<String, EqualityComparisonOperator> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'criteriaBuilder' @ [393:51] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'equal' @ [393:67] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [393:73] ==> public final val vaultStates: Root<VaultSchemaV1.VaultStates> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'get' @ [393:85] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Vault.StateStatus..Vault.StateStatus?)>..Path<(Vault.StateStatus..Vault.StateStatus?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> StateStatus

'VaultSchemaV1' @ [393:108] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [393:122] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'stateStatus' @ [393:135] ==> @Column public final var stateStatus: Vault.StateStatus defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [393:147] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'criteria' @ [393:154] ==> value-parameter criteria: QueryCriteria.CommonQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'status' @ [393:163] ==> public abstract val status: Vault.StateStatus defined in net.corda.core.node.services.vault.QueryCriteria.CommonQueryCriteria[DeserializedPropertyDescriptor]

'deriveContractTypes' @ [398:29] ==> private final fun deriveContractTypes(contractStateTypes: Set<Class<out ContractState>>? = ...): Set<String> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[SimpleFunctionDescriptorImpl]

'criteria' @ [398:49] ==> value-parameter criteria: QueryCriteria.CommonQueryCriteria defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[ValueParameterDescriptorImpl]

'contractStateTypes' @ [398:58] ==> public abstract val contractStateTypes: Set<Class<out ContractState>>? defined in net.corda.core.node.services.vault.QueryCriteria.CommonQueryCriteria[DeserializedPropertyDescriptor]

'contractTypes' @ [399:13] ==> val contractTypes: Set<String> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'isNotEmpty' @ [399:27] ==> @InlineOnly public inline fun <T> Collection<String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Pair' @ [400:31] ==> public constructor Pair<out A, out B>(first: String, second: CollectionOperator) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> CollectionOperator

'VaultSchemaV1' @ [400:36] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [400:50] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'contractStateClassName' @ [400:63] ==> @Column public final var contractStateClassName: String defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [400:86] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'IN' @ [400:111] ==> enum entry IN defined in net.corda.core.node.services.vault.CollectionOperator[FakeCallableDescriptorForObject]

'if (commonPredicates.containsKey(predicateID)) {
                val existingTypes = (commonPredicates[predicateID]!!.expressions[0] as InPredicate<*>).values.map { (it as LiteralExpression).literal }.toSet()
                if (existingTypes != contractTypes) {
                    log.warn("Enriching previous attribute [${VaultSchemaV1.VaultStates::contractStateClassName.name}] values [$existingTypes] with [$contractTypes]")
                    commonPredicates.replace(predicateID, criteriaBuilder.and(vaultStates.get<String>(VaultSchemaV1.VaultStates::contractStateClassName.name).`in`(contractTypes.plus(existingTypes))))
                }
            } else {
                commonPredicates.put(predicateID, criteriaBuilder.and(vaultStates.get<String>(VaultSchemaV1.VaultStates::contractStateClassName.name).`in`(contractTypes)))
            }' @ [401:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'commonPredicates' @ [401:17] ==> private final val commonPredicates: MutableMap<Pair<String, Operator>, Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'containsKey' @ [401:34] ==> public abstract fun containsKey(key: Pair<String, Operator>): Boolean defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'predicateID' @ [401:46] ==> val predicateID: Pair<String, CollectionOperator> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'commonPredicates' @ [402:38] ==> private final val commonPredicates: MutableMap<Pair<String, Operator>, Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'predicateID' @ [402:55] ==> val predicateID: Pair<String, CollectionOperator> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'expressions' @ [402:70] ==> public final val Predicate.expressions: (MutableList<(Expression<(Boolean..Boolean?)>..Expression<(Boolean..Boolean?)>?)>..List<(Expression<(Boolean..Boolean?)>..Expression<(Boolean..Boolean?)>?)>?)[MyPropertyDescriptor]

'values' @ [402:104] ==> public final val <T : (Any..Any?)> InPredicate<out (Any..Any?)>.values: (MutableList<out (Expression<out (Any..Any?)>..Expression<out (Any..Any?)>?)>..List<(Expression<out (Any..Any?)>..Expression<out (Any..Any?)>?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'map' @ [402:111] ==> public inline fun <T, R> Iterable<(Expression<out (Any..Any?)>..Expression<out (Any..Any?)>?)>.map(transform: ((Expression<out (Any..Any?)>..Expression<out (Any..Any?)>?)) -> (Any..Any?)): List<(Any..Any?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.persistence.criteria.Expression<out (kotlin.Any..kotlin.Any?)>..javax.persistence.criteria.Expression<out (kotlin.Any..kotlin.Any?)>?)
    <R> -> (kotlin.Any..kotlin.Any?)

'it' @ [402:118] ==> value-parameter it: (Expression<out (Any..Any?)>..Expression<out (Any..Any?)>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria.<anonymous>[ValueParameterDescriptorImpl]

'literal' @ [402:143] ==> public final val <T : (Any..Any?)> LiteralExpression<out (Any..Any?)>.literal: (Any..Any?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out (kotlin.Any..kotlin.Any?))

'toSet' @ [402:153] ==> public fun <T> Iterable<(Any..Any?)>.toSet(): Set<(Any..Any?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)

'existingTypes' @ [403:21] ==> val existingTypes: Set<(Any..Any?)> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'contractTypes' @ [403:38] ==> val contractTypes: Set<String> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'log' @ [404:21] ==> public final val log: Logger defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.Companion[PropertyDescriptorImpl]

'warn' @ [404:25] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'VaultSchemaV1' @ [404:63] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [404:77] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'contractStateClassName' @ [404:90] ==> @Column public final var contractStateClassName: String defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [404:113] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'existingTypes' @ [404:129] ==> val existingTypes: Set<(Any..Any?)> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'contractTypes' @ [404:151] ==> val contractTypes: Set<String> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'commonPredicates' @ [405:21] ==> private final val commonPredicates: MutableMap<Pair<String, Operator>, Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'replace' @ [405:38] ==> public open fun replace(p0: Pair<String, Operator>, p1: Predicate): Predicate? defined in kotlin.collections.MutableMap[JavaMethodDescriptor]

'predicateID' @ [405:46] ==> val predicateID: Pair<String, CollectionOperator> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'criteriaBuilder' @ [405:59] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'and' @ [405:75] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [405:79] ==> public final val vaultStates: Root<VaultSchemaV1.VaultStates> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'get' @ [405:91] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'VaultSchemaV1' @ [405:103] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [405:117] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'contractStateClassName' @ [405:130] ==> @Column public final var contractStateClassName: String defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [405:153] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'`in`' @ [405:159] ==> public abstract fun `in`(p0: (MutableCollection<*>..Collection<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.Path[JavaMethodDescriptor]

'contractTypes' @ [405:164] ==> val contractTypes: Set<String> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'plus' @ [405:178] ==> public operator fun <T> Set<(Any..Any?)>.plus(elements: Iterable<(Any..Any?)>): Set<(Any..Any?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)

'existingTypes' @ [405:183] ==> val existingTypes: Set<(Any..Any?)> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'commonPredicates' @ [408:17] ==> private final val commonPredicates: MutableMap<Pair<String, Operator>, Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'put' @ [408:34] ==> public abstract fun put(key: Pair<String, Operator>, value: Predicate): Predicate? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'predicateID' @ [408:38] ==> val predicateID: Pair<String, CollectionOperator> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'criteriaBuilder' @ [408:51] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'and' @ [408:67] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [408:71] ==> public final val vaultStates: Root<VaultSchemaV1.VaultStates> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'get' @ [408:83] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'VaultSchemaV1' @ [408:95] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [408:109] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'contractStateClassName' @ [408:122] ==> @Column public final var contractStateClassName: String defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [408:145] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'`in`' @ [408:151] ==> public abstract fun `in`(p0: (MutableCollection<*>..Collection<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.Path[JavaMethodDescriptor]

'contractTypes' @ [408:156] ==> val contractTypes: Set<String> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parseCriteria[LocalVariableDescriptor]

'emptySet' @ [412:16] ==> public fun <T> emptySet(): Set<Predicate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Predicate

'log' @ [416:9] ==> public final val log: Logger defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.Companion[PropertyDescriptorImpl]

'trace' @ [416:13] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'sorting' @ [416:54] ==> value-parameter sorting: Sort defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse[ValueParameterDescriptorImpl]

'mutableListOf' @ [418:29] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Order> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Order

'sorting' @ [420:9] ==> value-parameter sorting: Sort defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse[ValueParameterDescriptorImpl]

'columns' @ [420:17] ==> public final val columns: Collection<Sort.SortColumn> defined in net.corda.core.node.services.vault.Sort[DeserializedPropertyDescriptor]

'map' @ [420:25] ==> public inline fun <T, R> Iterable<Sort.SortColumn>.map(transform: (Sort.SortColumn) -> Boolean): List<Boolean> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SortColumn
    <R> -> Boolean

'component1' @ [420:32] ==> public final operator fun component1(): SortAttribute defined in net.corda.core.node.services.vault.Sort.SortColumn[DeserializedSimpleFunctionDescriptor]

'component2' @ [420:47] ==> public final operator fun component2(): Sort.Direction defined in net.corda.core.node.services.vault.Sort.SortColumn[DeserializedSimpleFunctionDescriptor]

'component1' @ [421:18] ==> public final operator fun component1(): Class<out PersistentState> defined in kotlin.Triple[DeserializedSimpleFunctionDescriptor]

'component2' @ [421:36] ==> public final operator fun component2(): String defined in kotlin.Triple[DeserializedSimpleFunctionDescriptor]

'component3' @ [421:64] ==> public final operator fun component3(): String? defined in kotlin.Triple[DeserializedSimpleFunctionDescriptor]

'when(sortAttribute) {
                        is SortAttribute.Standard -> parse(sortAttribute.attribute)
                        is SortAttribute.Custom -> Triple(sortAttribute.entityStateClass, sortAttribute.entityStateColumnName, null)
                    }' @ [422:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Triple<Class<out PersistentState>, String, String?>, entry1: Triple<Class<out PersistentState>, String, String?>): Triple<Class<out PersistentState>, String, String?>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Triple<Class<out PersistentState>, String, String?>

'sortAttribute' @ [422:26] ==> val sortAttribute: SortAttribute defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse.<anonymous>[LocalVariableDescriptor]

'parse' @ [423:54] ==> private final fun parse(sortAttribute: Sort.Attribute): Triple<Class<out PersistentState>, String, String?> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[SimpleFunctionDescriptorImpl]

'sortAttribute' @ [423:60] ==> val sortAttribute: SortAttribute defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse.<anonymous>[LocalVariableDescriptor]

'attribute' @ [423:74] ==> public final val attribute: Sort.Attribute defined in net.corda.core.node.services.vault.SortAttribute.Standard[DeserializedPropertyDescriptor]

'Triple' @ [424:52] ==> public constructor Triple<out A, out B, out C>(first: Class<out PersistentState>, second: String, third: Nothing?) defined in kotlin.Triple[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Class<out PersistentState>
    <out B> -> String
    <out C> -> Nothing?

'sortAttribute' @ [424:59] ==> val sortAttribute: SortAttribute defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse.<anonymous>[LocalVariableDescriptor]

'entityStateClass' @ [424:73] ==> public final val entityStateClass: Class<out PersistentState> defined in net.corda.core.node.services.vault.SortAttribute.Custom[DeserializedPropertyDescriptor]

'sortAttribute' @ [424:91] ==> val sortAttribute: SortAttribute defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse.<anonymous>[LocalVariableDescriptor]

'entityStateColumnName' @ [424:105] ==> public final val entityStateColumnName: String defined in net.corda.core.node.services.vault.SortAttribute.Custom[DeserializedPropertyDescriptor]

'rootEntities' @ [427:21] ==> private final val rootEntities: MutableMap<Class<out PersistentState>, Root<*>> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'getOrElse' @ [427:34] ==> @InlineOnly public inline fun <K, V> Map<Class<out PersistentState>, (Root<out (Any..Any?)>..Root<out (Any..Any?)>?)>.getOrElse(key: Class<out PersistentState>, defaultValue: () -> (Root<out (Any..Any?)>..Root<out (Any..Any?)>?)): (Root<out (Any..Any?)>..Root<out (Any..Any?)>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Class<out PersistentState>
    <V> -> (javax.persistence.criteria.Root<out (kotlin.Any..kotlin.Any?)>..javax.persistence.criteria.Root<out (kotlin.Any..kotlin.Any?)>?)

'entityStateClass' @ [427:44] ==> val entityStateClass: Class<out PersistentState> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse.<anonymous>[LocalVariableDescriptor]

'criteriaQuery' @ [429:42] ==> public final val criteriaQuery: CriteriaQuery<Tuple> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'from' @ [429:56] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<out PersistentState>..Class<out PersistentState>?)): (Root<out (PersistentState..PersistentState?)>..Root<out (PersistentState..PersistentState?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> Captured(out PersistentState)

'entityStateClass' @ [429:61] ==> val entityStateClass: Class<out PersistentState> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse.<anonymous>[LocalVariableDescriptor]

'rootEntities' @ [430:25] ==> private final val rootEntities: MutableMap<Class<out PersistentState>, Root<*>> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'put' @ [430:38] ==> public abstract fun put(key: Class<out PersistentState>, value: Root<*>): Root<*>? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'entityStateClass' @ [430:42] ==> val entityStateClass: Class<out PersistentState> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse.<anonymous>[LocalVariableDescriptor]

'entityRoot' @ [430:60] ==> val entityRoot: (Root<out (PersistentState..PersistentState?)>..Root<out (PersistentState..PersistentState?)>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse.<anonymous>.<anonymous>[LocalVariableDescriptor]

'criteriaBuilder' @ [431:45] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'equal' @ [431:61] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Expression<*>..Expression<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [431:67] ==> public final val vaultStates: Root<VaultSchemaV1.VaultStates> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'get' @ [431:79] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(PersistentStateRef..PersistentStateRef?)>..Path<(PersistentStateRef..PersistentStateRef?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> PersistentStateRef

'entityRoot' @ [431:116] ==> val entityRoot: (Root<out (PersistentState..PersistentState?)>..Root<out (PersistentState..PersistentState?)>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse.<anonymous>.<anonymous>[LocalVariableDescriptor]

'get' @ [431:127] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(PersistentStateRef..PersistentStateRef?)>..Path<(PersistentStateRef..PersistentStateRef?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> PersistentStateRef

'joinPredicates' @ [432:25] ==> private final val joinPredicates: MutableList<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'add' @ [432:40] ==> public abstract fun add(element: Predicate): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'joinPredicate' @ [432:44] ==> val joinPredicate: (Predicate..Predicate?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse.<anonymous>.<anonymous>[LocalVariableDescriptor]

'entityRoot' @ [433:25] ==> val entityRoot: (Root<out (PersistentState..PersistentState?)>..Root<out (PersistentState..PersistentState?)>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse.<anonymous>.<anonymous>[LocalVariableDescriptor]

'when (direction) {
                Sort.Direction.ASC -> {
                    if (entityStateAttributeChild != null)
                        orderCriteria.add(criteriaBuilder.asc(sortEntityRoot.get<String>(entityStateAttributeParent).get<String>(entityStateAttributeChild)))
                    else
                        orderCriteria.add(criteriaBuilder.asc(sortEntityRoot.get<String>(entityStateAttributeParent)))
                }
                Sort.Direction.DESC ->
                    if (entityStateAttributeChild != null)
                        orderCriteria.add(criteriaBuilder.desc(sortEntityRoot.get<String>(entityStateAttributeParent).get<String>(entityStateAttributeChild)))
                    else
                        orderCriteria.add(criteriaBuilder.desc(sortEntityRoot.get<String>(entityStateAttributeParent)))
            }' @ [435:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'direction' @ [435:19] ==> val direction: Sort.Direction defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse.<anonymous>[LocalVariableDescriptor]

'ASC' @ [436:32] ==> enum entry ASC defined in net.corda.core.node.services.vault.Sort.Direction[FakeCallableDescriptorForObject]

'if (entityStateAttributeChild != null)
                        orderCriteria.add(criteriaBuilder.asc(sortEntityRoot.get<String>(entityStateAttributeParent).get<String>(entityStateAttributeChild)))
                    else
                        orderCriteria.add(criteriaBuilder.asc(sortEntityRoot.get<String>(entityStateAttributeParent)))' @ [437:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'entityStateAttributeChild' @ [437:25] ==> val entityStateAttributeChild: String? defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse.<anonymous>[LocalVariableDescriptor]

'orderCriteria' @ [438:25] ==> val orderCriteria: MutableList<Order> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse[LocalVariableDescriptor]

'add' @ [438:39] ==> public abstract fun add(element: Order): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'criteriaBuilder' @ [438:43] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'asc' @ [438:59] ==> public abstract fun asc(p0: (Expression<*>..Expression<*>?)): (Order..Order?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'sortEntityRoot' @ [438:63] ==> val sortEntityRoot: (Root<out (Any..Any?)>..Root<out (Any..Any?)>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse.<anonymous>[LocalVariableDescriptor]

'get' @ [438:78] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'entityStateAttributeParent' @ [438:90] ==> val entityStateAttributeParent: String defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse.<anonymous>[LocalVariableDescriptor]

'get' @ [438:118] ==> public abstract operator fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Path[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'entityStateAttributeChild' @ [438:130] ==> val entityStateAttributeChild: String? defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse.<anonymous>[LocalVariableDescriptor]

'orderCriteria' @ [440:25] ==> val orderCriteria: MutableList<Order> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse[LocalVariableDescriptor]

'add' @ [440:39] ==> public abstract fun add(element: Order): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'criteriaBuilder' @ [440:43] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'asc' @ [440:59] ==> public abstract fun asc(p0: (Expression<*>..Expression<*>?)): (Order..Order?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'sortEntityRoot' @ [440:63] ==> val sortEntityRoot: (Root<out (Any..Any?)>..Root<out (Any..Any?)>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse.<anonymous>[LocalVariableDescriptor]

'get' @ [440:78] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'entityStateAttributeParent' @ [440:90] ==> val entityStateAttributeParent: String defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse.<anonymous>[LocalVariableDescriptor]

'DESC' @ [442:32] ==> enum entry DESC defined in net.corda.core.node.services.vault.Sort.Direction[FakeCallableDescriptorForObject]

'if (entityStateAttributeChild != null)
                        orderCriteria.add(criteriaBuilder.desc(sortEntityRoot.get<String>(entityStateAttributeParent).get<String>(entityStateAttributeChild)))
                    else
                        orderCriteria.add(criteriaBuilder.desc(sortEntityRoot.get<String>(entityStateAttributeParent)))' @ [443:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'entityStateAttributeChild' @ [443:25] ==> val entityStateAttributeChild: String? defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse.<anonymous>[LocalVariableDescriptor]

'orderCriteria' @ [444:25] ==> val orderCriteria: MutableList<Order> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse[LocalVariableDescriptor]

'add' @ [444:39] ==> public abstract fun add(element: Order): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'criteriaBuilder' @ [444:43] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'desc' @ [444:59] ==> public abstract fun desc(p0: (Expression<*>..Expression<*>?)): (Order..Order?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'sortEntityRoot' @ [444:64] ==> val sortEntityRoot: (Root<out (Any..Any?)>..Root<out (Any..Any?)>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse.<anonymous>[LocalVariableDescriptor]

'get' @ [444:79] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'entityStateAttributeParent' @ [444:91] ==> val entityStateAttributeParent: String defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse.<anonymous>[LocalVariableDescriptor]

'get' @ [444:119] ==> public abstract operator fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Path[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'entityStateAttributeChild' @ [444:131] ==> val entityStateAttributeChild: String? defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse.<anonymous>[LocalVariableDescriptor]

'orderCriteria' @ [446:25] ==> val orderCriteria: MutableList<Order> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse[LocalVariableDescriptor]

'add' @ [446:39] ==> public abstract fun add(element: Order): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'criteriaBuilder' @ [446:43] ==> public final val criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'desc' @ [446:59] ==> public abstract fun desc(p0: (Expression<*>..Expression<*>?)): (Order..Order?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'sortEntityRoot' @ [446:64] ==> val sortEntityRoot: (Root<out (Any..Any?)>..Root<out (Any..Any?)>?) defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse.<anonymous>[LocalVariableDescriptor]

'get' @ [446:79] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'entityStateAttributeParent' @ [446:91] ==> val entityStateAttributeParent: String defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse.<anonymous>[LocalVariableDescriptor]

'orderCriteria' @ [449:13] ==> val orderCriteria: MutableList<Order> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse[LocalVariableDescriptor]

'isNotEmpty' @ [449:27] ==> @InlineOnly public inline fun <T> Collection<Order>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Order

'criteriaQuery' @ [450:13] ==> public final val criteriaQuery: CriteriaQuery<Tuple> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'orderBy' @ [450:27] ==> public abstract fun orderBy(p0: (MutableList<(Order..Order?)>..List<(Order..Order?)>?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'orderCriteria' @ [450:35] ==> val orderCriteria: MutableList<Order> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse[LocalVariableDescriptor]

'criteriaQuery' @ [451:13] ==> public final val criteriaQuery: CriteriaQuery<Tuple> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'where' @ [451:27] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'joinPredicates' @ [451:34] ==> private final val joinPredicates: MutableList<Predicate> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser[PropertyDescriptorImpl]

'toTypedArray' @ [451:49] ==> public inline fun <reified T> Collection<Predicate>.toTypedArray(): Array<Predicate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Predicate

'when(sortAttribute) {
                    is Sort.CommonStateAttribute -> {
                        Triple(VaultSchemaV1.VaultStates::class.java, sortAttribute.attributeParent, sortAttribute.attributeChild)
                    }
                    is Sort.VaultStateAttribute -> {
                        Triple(VaultSchemaV1.VaultStates::class.java, sortAttribute.attributeName, null)
                    }
                    is Sort.LinearStateAttribute -> {
                        Triple(VaultSchemaV1.VaultLinearStates::class.java, sortAttribute.attributeName, null)
                    }
                    is Sort.FungibleStateAttribute -> {
                        Triple(VaultSchemaV1.VaultFungibleStates::class.java, sortAttribute.attributeName, null)
                    }
                    else -> throw VaultQueryException("Invalid sort attribute: $sortAttribute")
                }' @ [457:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Triple<Class<out PersistentState>, String, String?>, entry1: Triple<Class<out PersistentState>, String, String?>, entry2: Triple<Class<out PersistentState>, String, String?>, entry3: Triple<Class<out PersistentState>, String, String?>, entry4: Triple<Class<out PersistentState>, String, String?>): Triple<Class<out PersistentState>, String, String?>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Triple<Class<out PersistentState>, String, String?>

'sortAttribute' @ [457:22] ==> value-parameter sortAttribute: Sort.Attribute defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse[ValueParameterDescriptorImpl]

'Triple' @ [459:25] ==> public constructor Triple<out A, out B, out C>(first: Class<VaultSchemaV1.VaultStates>, second: String, third: String?) defined in kotlin.Triple[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Class<VaultStates>
    <out B> -> String
    <out C> -> String?

'VaultSchemaV1' @ [459:32] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [459:46] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'java' @ [459:65] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'sortAttribute' @ [459:71] ==> value-parameter sortAttribute: Sort.Attribute defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse[ValueParameterDescriptorImpl]

'attributeParent' @ [459:85] ==> public final val attributeParent: String defined in net.corda.core.node.services.vault.Sort.CommonStateAttribute[DeserializedPropertyDescriptor]

'sortAttribute' @ [459:102] ==> value-parameter sortAttribute: Sort.Attribute defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse[ValueParameterDescriptorImpl]

'attributeChild' @ [459:116] ==> public final val attributeChild: String? defined in net.corda.core.node.services.vault.Sort.CommonStateAttribute[DeserializedPropertyDescriptor]

'Triple' @ [462:25] ==> public constructor Triple<out A, out B, out C>(first: Class<VaultSchemaV1.VaultStates>, second: String, third: Nothing?) defined in kotlin.Triple[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Class<VaultStates>
    <out B> -> String
    <out C> -> Nothing?

'VaultSchemaV1' @ [462:32] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [462:46] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'java' @ [462:65] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'sortAttribute' @ [462:71] ==> value-parameter sortAttribute: Sort.Attribute defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse[ValueParameterDescriptorImpl]

'attributeName' @ [462:85] ==> public final val attributeName: String defined in net.corda.core.node.services.vault.Sort.VaultStateAttribute[DeserializedPropertyDescriptor]

'Triple' @ [465:25] ==> public constructor Triple<out A, out B, out C>(first: Class<VaultSchemaV1.VaultLinearStates>, second: String, third: Nothing?) defined in kotlin.Triple[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Class<VaultLinearStates>
    <out B> -> String
    <out C> -> Nothing?

'VaultSchemaV1' @ [465:32] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'java' @ [465:71] ==> public val <T> KClass<VaultSchemaV1.VaultLinearStates>.java: Class<VaultSchemaV1.VaultLinearStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultLinearStates

'sortAttribute' @ [465:77] ==> value-parameter sortAttribute: Sort.Attribute defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse[ValueParameterDescriptorImpl]

'attributeName' @ [465:91] ==> public final val attributeName: String defined in net.corda.core.node.services.vault.Sort.LinearStateAttribute[DeserializedPropertyDescriptor]

'Triple' @ [468:25] ==> public constructor Triple<out A, out B, out C>(first: Class<VaultSchemaV1.VaultFungibleStates>, second: String, third: Nothing?) defined in kotlin.Triple[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Class<VaultFungibleStates>
    <out B> -> String
    <out C> -> Nothing?

'VaultSchemaV1' @ [468:32] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'java' @ [468:73] ==> public val <T> KClass<VaultSchemaV1.VaultFungibleStates>.java: Class<VaultSchemaV1.VaultFungibleStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultFungibleStates

'sortAttribute' @ [468:79] ==> value-parameter sortAttribute: Sort.Attribute defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse[ValueParameterDescriptorImpl]

'attributeName' @ [468:93] ==> public final val attributeName: String defined in net.corda.core.node.services.vault.Sort.FungibleStateAttribute[DeserializedPropertyDescriptor]

'VaultQueryException' @ [470:35] ==> public constructor VaultQueryException(description: String) defined in net.corda.core.node.services.VaultQueryException[DeserializedClassConstructorDescriptor]

'sortAttribute' @ [470:81] ==> value-parameter sortAttribute: Sort.Attribute defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse[ValueParameterDescriptorImpl]

'entityClassAndColumnName' @ [472:16] ==> val entityClassAndColumnName: Triple<Class<out PersistentState>, String, String?> defined in net.corda.node.services.vault.HibernateQueryCriteriaParser.parse[LocalVariableDescriptor]

