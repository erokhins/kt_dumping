'ThreadSafe' @ [22:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'SingletonSerializeAsToken' @ [23:58] ==> public constructor SingletonSerializeAsToken() defined in net.corda.core.serialization.SingletonSerializeAsToken[DeserializedClassConstructorDescriptor]

'MappedSuperclass' @ [25:5] ==> public constructor MappedSuperclass() defined in javax.persistence.MappedSuperclass[JavaClassConstructorDescriptor]

'EmbeddedId' @ [27:13] ==> public constructor EmbeddedId() defined in javax.persistence.EmbeddedId[JavaClassConstructorDescriptor]

'PersistentStateRef' @ [28:42] ==> public constructor PersistentStateRef(txId: String? = ..., index: Int? = ...) defined in net.corda.core.schemas.PersistentStateRef[DeserializedClassConstructorDescriptor]

'Column' @ [30:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'Column' @ [33:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'Embedded' @ [36:13] ==> public constructor Embedded() defined in javax.persistence.Embedded[JavaClassConstructorDescriptor]

'PersistentParty' @ [37:42] ==> public constructor PersistentParty(name: String = ..., owningKey: String = ...) defined in net.corda.node.services.transactions.PersistentUniquenessProvider.PersistentParty[ClassConstructorDescriptorImpl]

'Embeddable' @ [40:5] ==> public constructor Embeddable() defined in javax.persistence.Embeddable[JavaClassConstructorDescriptor]

'Column' @ [42:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'Column' @ [45:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'Entity' @ [49:5] ==> public constructor Entity(name: String = ...) defined in javax.persistence.Entity[JavaClassConstructorDescriptor]

'javax.persistence.Table' @ [50:5] ==> public constructor Table(name: String = ..., catalog: String = ..., schema: String = ..., uniqueConstraints: Array<UniqueConstraint> = ..., indexes: Array<Index> = ...) defined in javax.persistence.Table[JavaClassConstructorDescriptor]

'NODE_DATABASE_PREFIX' @ [50:40] ==> public const val NODE_DATABASE_PREFIX: String defined in net.corda.node.utilities in file CordaPersistence.kt[PropertyDescriptorImpl]

'PersistentUniqueness' @ [52:13] ==> public constructor PersistentUniqueness(id: PersistentStateRef = ..., consumingTxHash: String = ..., consumingIndex: Int = ..., party: PersistentUniquenessProvider.PersistentParty = ...) defined in net.corda.node.services.transactions.PersistentUniquenessProvider.PersistentUniqueness[ClassConstructorDescriptorImpl]

'id' @ [52:34] ==> value-parameter id: PersistentStateRef defined in net.corda.node.services.transactions.PersistentUniquenessProvider.PersistentNotaryCommit.<init>[ValueParameterDescriptorImpl]

'consumingTxHash' @ [52:38] ==> value-parameter consumingTxHash: String defined in net.corda.node.services.transactions.PersistentUniquenessProvider.PersistentNotaryCommit.<init>[ValueParameterDescriptorImpl]

'consumingIndex' @ [52:55] ==> value-parameter consumingIndex: Int defined in net.corda.node.services.transactions.PersistentUniquenessProvider.PersistentNotaryCommit.<init>[ValueParameterDescriptorImpl]

'party' @ [52:71] ==> value-parameter party: PersistentUniquenessProvider.PersistentParty defined in net.corda.node.services.transactions.PersistentUniquenessProvider.PersistentNotaryCommit.<init>[ValueParameterDescriptorImpl]

'createMap' @ [56:31] ==> public final fun createMap(): AppendOnlyPersistentMap<StateRef, UniquenessProvider.ConsumingTx, PersistentUniquenessProvider.PersistentNotaryCommit, PersistentStateRef> defined in net.corda.node.services.transactions.PersistentUniquenessProvider.Companion[SimpleFunctionDescriptorImpl]

'ThreadBox' @ [59:25] ==> public constructor ThreadBox<out T>(content: PersistentUniquenessProvider.InnerState, lock: ReentrantLock = ...) defined in net.corda.core.internal.ThreadBox[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> InnerState

'InnerState' @ [59:35] ==> public constructor InnerState() defined in net.corda.node.services.transactions.PersistentUniquenessProvider.InnerState[ClassConstructorDescriptorImpl]

'loggerFor' @ [62:27] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> PersistentUniquenessProvider

'AppendOnlyPersistentMap' @ [65:17] ==> public constructor AppendOnlyPersistentMap<K, V, E, out EK>(toPersistentEntityKey: (StateRef) -> PersistentStateRef, fromPersistentEntity: (PersistentUniquenessProvider.PersistentNotaryCommit) -> Pair<StateRef, UniquenessProvider.ConsumingTx>, toPersistentEntity: (StateRef, UniquenessProvider.ConsumingTx) -> PersistentUniquenessProvider.PersistentNotaryCommit, persistentEntityClass: Class<PersistentUniquenessProvider.PersistentNotaryCommit>, cacheBound: Long = ...) defined in net.corda.node.utilities.AppendOnlyPersistentMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> StateRef
    <V> -> ConsumingTx
    <E> -> PersistentNotaryCommit
    <out EK> -> PersistentStateRef

'PersistentStateRef' @ [66:51] ==> public constructor PersistentStateRef(txId: String? = ..., index: Int? = ...) defined in net.corda.core.schemas.PersistentStateRef[DeserializedClassConstructorDescriptor]

'it' @ [66:70] ==> value-parameter it: StateRef defined in net.corda.node.services.transactions.PersistentUniquenessProvider.Companion.createMap.<anonymous>[ValueParameterDescriptorImpl]

'txhash' @ [66:73] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'toString' @ [66:80] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'it' @ [66:92] ==> value-parameter it: StateRef defined in net.corda.node.services.transactions.PersistentUniquenessProvider.Companion.createMap.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [66:95] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'it' @ [69:40] ==> value-parameter it: PersistentUniquenessProvider.PersistentNotaryCommit defined in net.corda.node.services.transactions.PersistentUniquenessProvider.Companion.createMap.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [69:43] ==> @EmbeddedId public final var id: PersistentStateRef defined in net.corda.node.services.transactions.PersistentUniquenessProvider.PersistentNotaryCommit[PropertyDescriptorImpl]

'txId' @ [69:46] ==> @field:Column public final var txId: String? defined in net.corda.core.schemas.PersistentStateRef[DeserializedPropertyDescriptor]

'IllegalStateException' @ [69:60] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'it' @ [70:41] ==> value-parameter it: PersistentUniquenessProvider.PersistentNotaryCommit defined in net.corda.node.services.transactions.PersistentUniquenessProvider.Companion.createMap.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [70:44] ==> @EmbeddedId public final var id: PersistentStateRef defined in net.corda.node.services.transactions.PersistentUniquenessProvider.PersistentNotaryCommit[PropertyDescriptorImpl]

'index' @ [70:47] ==> @field:Column public final var index: Int? defined in net.corda.core.schemas.PersistentStateRef[DeserializedPropertyDescriptor]

'IllegalStateException' @ [70:62] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'Pair' @ [71:29] ==> public constructor Pair<out A, out B>(first: StateRef, second: UniquenessProvider.ConsumingTx) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> StateRef
    <out B> -> ConsumingTx

'StateRef' @ [71:34] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[DeserializedClassConstructorDescriptor]

'SecureHash' @ [71:52] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'parse' @ [71:63] ==> @JvmStatic public final fun parse(str: String): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'txId' @ [71:69] ==> var txId: String defined in net.corda.node.services.transactions.PersistentUniquenessProvider.Companion.createMap.<anonymous>[LocalVariableDescriptor]

'index' @ [71:84] ==> var index: Int defined in net.corda.node.services.transactions.PersistentUniquenessProvider.Companion.createMap.<anonymous>[LocalVariableDescriptor]

'ConsumingTx' @ [72:56] ==> public constructor ConsumingTx(id: SecureHash, inputIndex: Int, requestingParty: Party) defined in net.corda.core.node.services.UniquenessProvider.ConsumingTx[DeserializedClassConstructorDescriptor]

'SecureHash' @ [73:50] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'parse' @ [73:61] ==> @JvmStatic public final fun parse(str: String): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [73:67] ==> value-parameter it: PersistentUniquenessProvider.PersistentNotaryCommit defined in net.corda.node.services.transactions.PersistentUniquenessProvider.Companion.createMap.<anonymous>[ValueParameterDescriptorImpl]

'consumingTxHash' @ [73:70] ==> @Column public final var consumingTxHash: String defined in net.corda.node.services.transactions.PersistentUniquenessProvider.PersistentNotaryCommit[PropertyDescriptorImpl]

'it' @ [74:58] ==> value-parameter it: PersistentUniquenessProvider.PersistentNotaryCommit defined in net.corda.node.services.transactions.PersistentUniquenessProvider.Companion.createMap.<anonymous>[ValueParameterDescriptorImpl]

'consumingIndex' @ [74:61] ==> @Column public final var consumingIndex: Int defined in net.corda.node.services.transactions.PersistentUniquenessProvider.PersistentNotaryCommit[PropertyDescriptorImpl]

'Party' @ [75:63] ==> public constructor Party(name: X500Name, owningKey: PublicKey) defined in net.corda.core.identity.Party[DeserializedClassConstructorDescriptor]

'X500Name' @ [76:60] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'it' @ [76:69] ==> value-parameter it: PersistentUniquenessProvider.PersistentNotaryCommit defined in net.corda.node.services.transactions.PersistentUniquenessProvider.Companion.createMap.<anonymous>[ValueParameterDescriptorImpl]

'party' @ [76:72] ==> @Embedded public final var party: PersistentUniquenessProvider.PersistentParty defined in net.corda.node.services.transactions.PersistentUniquenessProvider.PersistentNotaryCommit[PropertyDescriptorImpl]

'name' @ [76:78] ==> @Column public final var name: String defined in net.corda.node.services.transactions.PersistentUniquenessProvider.PersistentParty[PropertyDescriptorImpl]

'parsePublicKeyBase58' @ [77:65] ==> public fun parsePublicKeyBase58(base58String: String): PublicKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'it' @ [77:86] ==> value-parameter it: PersistentUniquenessProvider.PersistentNotaryCommit defined in net.corda.node.services.transactions.PersistentUniquenessProvider.Companion.createMap.<anonymous>[ValueParameterDescriptorImpl]

'party' @ [77:89] ==> @Embedded public final var party: PersistentUniquenessProvider.PersistentParty defined in net.corda.node.services.transactions.PersistentUniquenessProvider.PersistentNotaryCommit[PropertyDescriptorImpl]

'owningKey' @ [77:95] ==> @Column public final var owningKey: String defined in net.corda.node.services.transactions.PersistentUniquenessProvider.PersistentParty[PropertyDescriptorImpl]

'component1' @ [79:49] ==> public final operator fun component1(): SecureHash defined in net.corda.core.contracts.StateRef[DeserializedSimpleFunctionDescriptor]

'component2' @ [79:57] ==> public final operator fun component2(): Int defined in net.corda.core.contracts.StateRef[DeserializedSimpleFunctionDescriptor]

'component1' @ [79:77] ==> public final operator fun component1(): SecureHash defined in net.corda.core.node.services.UniquenessProvider.ConsumingTx[DeserializedSimpleFunctionDescriptor]

'component2' @ [79:81] ==> public final operator fun component2(): Int defined in net.corda.core.node.services.UniquenessProvider.ConsumingTx[DeserializedSimpleFunctionDescriptor]

'component3' @ [79:93] ==> public final operator fun component3(): Party defined in net.corda.core.node.services.UniquenessProvider.ConsumingTx[DeserializedSimpleFunctionDescriptor]

'PersistentNotaryCommit' @ [80:29] ==> public constructor PersistentNotaryCommit(id: PersistentStateRef, consumingTxHash: String, consumingIndex: Int, party: PersistentUniquenessProvider.PersistentParty) defined in net.corda.node.services.transactions.PersistentUniquenessProvider.PersistentNotaryCommit[ClassConstructorDescriptorImpl]

'PersistentStateRef' @ [81:42] ==> public constructor PersistentStateRef(txId: String? = ..., index: Int? = ...) defined in net.corda.core.schemas.PersistentStateRef[DeserializedClassConstructorDescriptor]

'txHash' @ [81:61] ==> val txHash: SecureHash defined in net.corda.node.services.transactions.PersistentUniquenessProvider.Companion.createMap.<anonymous>[LocalVariableDescriptor]

'toString' @ [81:68] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'index' @ [81:80] ==> val index: Int defined in net.corda.node.services.transactions.PersistentUniquenessProvider.Companion.createMap.<anonymous>[LocalVariableDescriptor]

'id' @ [82:55] ==> val id: SecureHash defined in net.corda.node.services.transactions.PersistentUniquenessProvider.Companion.createMap.<anonymous>[LocalVariableDescriptor]

'toString' @ [82:58] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'inputIndex' @ [83:54] ==> val inputIndex: Int defined in net.corda.node.services.transactions.PersistentUniquenessProvider.Companion.createMap.<anonymous>[LocalVariableDescriptor]

'PersistentParty' @ [84:45] ==> public constructor PersistentParty(name: String = ..., owningKey: String = ...) defined in net.corda.node.services.transactions.PersistentUniquenessProvider.PersistentParty[ClassConstructorDescriptorImpl]

'requestingParty' @ [84:61] ==> val requestingParty: Party defined in net.corda.node.services.transactions.PersistentUniquenessProvider.Companion.createMap.<anonymous>[LocalVariableDescriptor]

'name' @ [84:77] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'toString' @ [84:82] ==> public open fun toString(): String defined in org.bouncycastle.asn1.x500.X500Name[JavaMethodDescriptor]

'requestingParty' @ [84:94] ==> val requestingParty: Party defined in net.corda.node.services.transactions.PersistentUniquenessProvider.Companion.createMap.<anonymous>[LocalVariableDescriptor]

'owningKey' @ [84:110] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'toBase58String' @ [84:120] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'PersistentNotaryCommit' @ [87:45] ==> public constructor PersistentNotaryCommit(id: PersistentStateRef, consumingTxHash: String, consumingIndex: Int, party: PersistentUniquenessProvider.PersistentParty) defined in net.corda.node.services.transactions.PersistentUniquenessProvider.PersistentNotaryCommit[ClassConstructorDescriptorImpl]

'java' @ [87:75] ==> public val <T> KClass<PersistentUniquenessProvider.PersistentNotaryCommit>.java: Class<PersistentUniquenessProvider.PersistentNotaryCommit> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PersistentNotaryCommit

'mutex' @ [93:24] ==> private final val mutex: ThreadBox<PersistentUniquenessProvider.InnerState> defined in net.corda.node.services.transactions.PersistentUniquenessProvider[PropertyDescriptorImpl]

'locked' @ [93:30] ==> public final inline fun <R> locked(body: PersistentUniquenessProvider.InnerState.() -> UniquenessProvider.Conflict?): UniquenessProvider.Conflict? defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Conflict?

'LinkedHashMap' @ [94:45] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> StateRef
    <V : (Any..Any?)> -> ConsumingTx

'states' @ [95:40] ==> value-parameter states: List<StateRef> defined in net.corda.node.services.transactions.PersistentUniquenessProvider.commit[ValueParameterDescriptorImpl]

'committedStates' @ [96:43] ==> public final val committedStates: AppendOnlyPersistentMap<StateRef, UniquenessProvider.ConsumingTx, PersistentUniquenessProvider.PersistentNotaryCommit, PersistentStateRef> defined in net.corda.node.services.transactions.PersistentUniquenessProvider.InnerState[PropertyDescriptorImpl]

'get' @ [96:59] ==> public final operator fun get(key: StateRef): UniquenessProvider.ConsumingTx? defined in net.corda.node.utilities.AppendOnlyPersistentMap[SimpleFunctionDescriptorImpl]

'inputState' @ [96:63] ==> val inputState: StateRef defined in net.corda.node.services.transactions.PersistentUniquenessProvider.commit.<anonymous>[LocalVariableDescriptor]

'consumingTx' @ [97:29] ==> val consumingTx: UniquenessProvider.ConsumingTx? defined in net.corda.node.services.transactions.PersistentUniquenessProvider.commit.<anonymous>[LocalVariableDescriptor]

'conflictingStates' @ [97:50] ==> val conflictingStates: LinkedHashMap<StateRef, UniquenessProvider.ConsumingTx> defined in net.corda.node.services.transactions.PersistentUniquenessProvider.commit.<anonymous>[LocalVariableDescriptor]

'inputState' @ [97:68] ==> val inputState: StateRef defined in net.corda.node.services.transactions.PersistentUniquenessProvider.commit.<anonymous>[LocalVariableDescriptor]

'consumingTx' @ [97:82] ==> val consumingTx: UniquenessProvider.ConsumingTx? defined in net.corda.node.services.transactions.PersistentUniquenessProvider.commit.<anonymous>[LocalVariableDescriptor]

'if (conflictingStates.isNotEmpty()) {
                        log.debug("Failure, input states already committed: ${conflictingStates.keys}")
                        UniquenessProvider.Conflict(conflictingStates)
                    } else {
                        states.forEachIndexed { i, stateRef ->
                            committedStates[stateRef] = UniquenessProvider.ConsumingTx(txId, i, callerIdentity)
                        }
                        log.debug("Successfully committed all input states: $states")
                        null
                    }' @ [99:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UniquenessProvider.Conflict?, elseBranch: UniquenessProvider.Conflict?): UniquenessProvider.Conflict?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Conflict?

'conflictingStates' @ [99:25] ==> val conflictingStates: LinkedHashMap<StateRef, UniquenessProvider.ConsumingTx> defined in net.corda.node.services.transactions.PersistentUniquenessProvider.commit.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [99:43] ==> @InlineOnly public inline fun <K, V> Map<out StateRef, UniquenessProvider.ConsumingTx>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> StateRef
    <V> -> ConsumingTx

'log' @ [100:25] ==> private final val log: Logger defined in net.corda.node.services.transactions.PersistentUniquenessProvider.Companion[PropertyDescriptorImpl]

'debug' @ [100:29] ==> public abstract fun debug(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'conflictingStates' @ [100:79] ==> val conflictingStates: LinkedHashMap<StateRef, UniquenessProvider.ConsumingTx> defined in net.corda.node.services.transactions.PersistentUniquenessProvider.commit.<anonymous>[LocalVariableDescriptor]

'keys' @ [100:97] ==> public open val keys: MutableSet<StateRef> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'Conflict' @ [101:44] ==> public constructor Conflict(stateHistory: Map<StateRef, UniquenessProvider.ConsumingTx>) defined in net.corda.core.node.services.UniquenessProvider.Conflict[DeserializedClassConstructorDescriptor]

'conflictingStates' @ [101:53] ==> val conflictingStates: LinkedHashMap<StateRef, UniquenessProvider.ConsumingTx> defined in net.corda.node.services.transactions.PersistentUniquenessProvider.commit.<anonymous>[LocalVariableDescriptor]

'states' @ [103:25] ==> value-parameter states: List<StateRef> defined in net.corda.node.services.transactions.PersistentUniquenessProvider.commit[ValueParameterDescriptorImpl]

'forEachIndexed' @ [103:32] ==> public inline fun <T> Iterable<StateRef>.forEachIndexed(action: (index: Int, StateRef) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'committedStates' @ [104:29] ==> public final val committedStates: AppendOnlyPersistentMap<StateRef, UniquenessProvider.ConsumingTx, PersistentUniquenessProvider.PersistentNotaryCommit, PersistentStateRef> defined in net.corda.node.services.transactions.PersistentUniquenessProvider.InnerState[PropertyDescriptorImpl]

'stateRef' @ [104:45] ==> value-parameter stateRef: StateRef defined in net.corda.node.services.transactions.PersistentUniquenessProvider.commit.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ConsumingTx' @ [104:76] ==> public constructor ConsumingTx(id: SecureHash, inputIndex: Int, requestingParty: Party) defined in net.corda.core.node.services.UniquenessProvider.ConsumingTx[DeserializedClassConstructorDescriptor]

'txId' @ [104:88] ==> value-parameter txId: SecureHash defined in net.corda.node.services.transactions.PersistentUniquenessProvider.commit[ValueParameterDescriptorImpl]

'i' @ [104:94] ==> value-parameter i: Int defined in net.corda.node.services.transactions.PersistentUniquenessProvider.commit.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'callerIdentity' @ [104:97] ==> value-parameter callerIdentity: Party defined in net.corda.node.services.transactions.PersistentUniquenessProvider.commit[ValueParameterDescriptorImpl]

'log' @ [106:25] ==> private final val log: Logger defined in net.corda.node.services.transactions.PersistentUniquenessProvider.Companion[PropertyDescriptorImpl]

'debug' @ [106:29] ==> public abstract fun debug(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'states' @ [106:78] ==> value-parameter states: List<StateRef> defined in net.corda.node.services.transactions.PersistentUniquenessProvider.commit[ValueParameterDescriptorImpl]

'conflict' @ [111:13] ==> val conflict: UniquenessProvider.Conflict? defined in net.corda.node.services.transactions.PersistentUniquenessProvider.commit[LocalVariableDescriptor]

'UniquenessException' @ [111:37] ==> public constructor UniquenessException(error: UniquenessProvider.Conflict) defined in net.corda.core.node.services.UniquenessException[DeserializedClassConstructorDescriptor]

'conflict' @ [111:57] ==> val conflict: UniquenessProvider.Conflict? defined in net.corda.node.services.transactions.PersistentUniquenessProvider.commit[LocalVariableDescriptor]

