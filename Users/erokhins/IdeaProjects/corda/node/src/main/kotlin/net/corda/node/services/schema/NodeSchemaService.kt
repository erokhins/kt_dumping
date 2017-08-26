'emptySet' @ [33:60] ==> public fun <T> emptySet(): Set<MappedSchema> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MappedSchema

'SingletonSerializeAsToken' @ [33:89] ==> public constructor SingletonSerializeAsToken() defined in net.corda.core.serialization.SingletonSerializeAsToken[DeserializedClassConstructorDescriptor]

'MappedSchema' @ [38:29] ==> public constructor MappedSchema(schemaFamily: Class<*>, version: Int, mappedTypes: Iterable<Class<*>>) defined in net.corda.core.schemas.MappedSchema[DeserializedClassConstructorDescriptor]

'NodeServices' @ [38:57] ==> public object NodeServices defined in net.corda.node.services.schema.NodeSchemaService[FakeCallableDescriptorForObject]

'javaClass' @ [38:70] ==> public val <T : Any> NodeSchemaService.NodeServices.javaClass: Class<NodeSchemaService.NodeServices> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> NodeServices

'listOf' @ [39:27] ==> public fun <T> listOf(vararg elements: Class<out Any>): List<Class<out Any>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out Any>

'DBCheckpoint' @ [39:54] ==> public constructor DBCheckpoint(checkpointId: String = ..., checkpoint: ByteArray = ...) defined in net.corda.node.services.persistence.DBCheckpointStorage.DBCheckpoint[ClassConstructorDescriptorImpl]

'java' @ [39:74] ==> public val <T> KClass<DBCheckpointStorage.DBCheckpoint>.java: Class<DBCheckpointStorage.DBCheckpoint> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DBCheckpoint

'DBTransactionStorage' @ [40:21] ==> private companion object defined in net.corda.node.services.persistence.DBTransactionStorage[FakeCallableDescriptorForObject]

'DBTransaction' @ [40:42] ==> public constructor DBTransaction(txId: String = ..., transaction: ByteArray = ...) defined in net.corda.node.services.persistence.DBTransactionStorage.DBTransaction[ClassConstructorDescriptorImpl]

'java' @ [40:63] ==> public val <T> KClass<DBTransactionStorage.DBTransaction>.java: Class<DBTransactionStorage.DBTransaction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DBTransaction

'DBTransactionMappingStorage' @ [41:21] ==> private companion object defined in net.corda.node.services.persistence.DBTransactionMappingStorage[FakeCallableDescriptorForObject]

'DBTransactionMapping' @ [41:49] ==> public constructor DBTransactionMapping(txId: String = ..., stateMachineRunId: String = ...) defined in net.corda.node.services.persistence.DBTransactionMappingStorage.DBTransactionMapping[ClassConstructorDescriptorImpl]

'java' @ [41:77] ==> public val <T> KClass<DBTransactionMappingStorage.DBTransactionMapping>.java: Class<DBTransactionMappingStorage.DBTransactionMapping> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DBTransactionMapping

'PersistentKeyManagementService' @ [42:21] ==> private companion object defined in net.corda.node.services.keys.PersistentKeyManagementService[FakeCallableDescriptorForObject]

'PersistentKey' @ [42:52] ==> public constructor PersistentKey(publicKey: String = ..., privateKey: ByteArray = ...) defined in net.corda.node.services.keys.PersistentKeyManagementService.PersistentKey[ClassConstructorDescriptorImpl]

'java' @ [42:73] ==> public val <T> KClass<PersistentKeyManagementService.PersistentKey>.java: Class<PersistentKeyManagementService.PersistentKey> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PersistentKey

'PersistentUniquenessProvider' @ [43:21] ==> public companion object defined in net.corda.node.services.transactions.PersistentUniquenessProvider[FakeCallableDescriptorForObject]

'PersistentUniqueness' @ [43:50] ==> public constructor PersistentUniqueness(id: PersistentStateRef = ..., consumingTxHash: String = ..., consumingIndex: Int = ..., party: PersistentUniquenessProvider.PersistentParty = ...) defined in net.corda.node.services.transactions.PersistentUniquenessProvider.PersistentUniqueness[ClassConstructorDescriptorImpl]

'java' @ [43:78] ==> public val <T> KClass<PersistentUniquenessProvider.PersistentUniqueness>.java: Class<PersistentUniquenessProvider.PersistentUniqueness> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PersistentUniqueness

'PersistentUniquenessProvider' @ [44:21] ==> public companion object defined in net.corda.node.services.transactions.PersistentUniquenessProvider[FakeCallableDescriptorForObject]

'PersistentNotaryCommit' @ [44:50] ==> public constructor PersistentNotaryCommit(id: PersistentStateRef, consumingTxHash: String, consumingIndex: Int, party: PersistentUniquenessProvider.PersistentParty) defined in net.corda.node.services.transactions.PersistentUniquenessProvider.PersistentNotaryCommit[ClassConstructorDescriptorImpl]

'java' @ [44:80] ==> public val <T> KClass<PersistentUniquenessProvider.PersistentNotaryCommit>.java: Class<PersistentUniquenessProvider.PersistentNotaryCommit> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PersistentNotaryCommit

'NodeSchedulerService' @ [45:21] ==> public companion object defined in net.corda.node.services.events.NodeSchedulerService[FakeCallableDescriptorForObject]

'PersistentScheduledState' @ [45:42] ==> public constructor PersistentScheduledState(output: PersistentStateRef = ..., scheduledAt: Instant = ...) defined in net.corda.node.services.events.NodeSchedulerService.PersistentScheduledState[ClassConstructorDescriptorImpl]

'java' @ [45:74] ==> public val <T> KClass<NodeSchedulerService.PersistentScheduledState>.java: Class<NodeSchedulerService.PersistentScheduledState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PersistentScheduledState

'NodeAttachmentService' @ [46:21] ==> public companion object defined in net.corda.node.services.persistence.NodeAttachmentService[FakeCallableDescriptorForObject]

'DBAttachment' @ [46:43] ==> public constructor DBAttachment(attId: String, content: ByteArray) defined in net.corda.node.services.persistence.NodeAttachmentService.DBAttachment[ClassConstructorDescriptorImpl]

'java' @ [46:63] ==> public val <T> KClass<NodeAttachmentService.DBAttachment>.java: Class<NodeAttachmentService.DBAttachment> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DBAttachment

'PersistentNetworkMapService' @ [47:21] ==> private companion object defined in net.corda.node.services.network.PersistentNetworkMapService[FakeCallableDescriptorForObject]

'NetworkNode' @ [47:49] ==> public constructor NetworkNode(publicKey: String = ..., nodeParty: PersistentNetworkMapService.NodeParty = ..., registrationInfo: ByteArray = ...) defined in net.corda.node.services.network.PersistentNetworkMapService.NetworkNode[ClassConstructorDescriptorImpl]

'java' @ [47:68] ==> public val <T> KClass<PersistentNetworkMapService.NetworkNode>.java: Class<PersistentNetworkMapService.NetworkNode> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NetworkNode

'PersistentNetworkMapService' @ [48:21] ==> private companion object defined in net.corda.node.services.network.PersistentNetworkMapService[FakeCallableDescriptorForObject]

'NetworkSubscriber' @ [48:49] ==> public constructor NetworkSubscriber(id: String = ..., key: ByteArray = ..., value: ByteArray = ...) defined in net.corda.node.services.network.PersistentNetworkMapService.NetworkSubscriber[ClassConstructorDescriptorImpl]

'java' @ [48:74] ==> public val <T> KClass<PersistentNetworkMapService.NetworkSubscriber>.java: Class<PersistentNetworkMapService.NetworkSubscriber> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NetworkSubscriber

'NodeMessagingClient' @ [49:21] ==> public companion object defined in net.corda.node.services.messaging.NodeMessagingClient[FakeCallableDescriptorForObject]

'ProcessedMessage' @ [49:41] ==> public constructor ProcessedMessage(uuid: String = ..., insertionTime: Instant = ...) defined in net.corda.node.services.messaging.NodeMessagingClient.ProcessedMessage[ClassConstructorDescriptorImpl]

'java' @ [49:65] ==> public val <T> KClass<NodeMessagingClient.ProcessedMessage>.java: Class<NodeMessagingClient.ProcessedMessage> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ProcessedMessage

'NodeMessagingClient' @ [50:21] ==> public companion object defined in net.corda.node.services.messaging.NodeMessagingClient[FakeCallableDescriptorForObject]

'RetryMessage' @ [50:41] ==> public constructor RetryMessage(key: Long = ..., message: ByteArray = ..., recipients: ByteArray = ...) defined in net.corda.node.services.messaging.NodeMessagingClient.RetryMessage[ClassConstructorDescriptorImpl]

'java' @ [50:61] ==> public val <T> KClass<NodeMessagingClient.RetryMessage>.java: Class<NodeMessagingClient.RetryMessage> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> RetryMessage

'NodeAttachmentService' @ [51:21] ==> public companion object defined in net.corda.node.services.persistence.NodeAttachmentService[FakeCallableDescriptorForObject]

'DBAttachment' @ [51:43] ==> public constructor DBAttachment(attId: String, content: ByteArray) defined in net.corda.node.services.persistence.NodeAttachmentService.DBAttachment[ClassConstructorDescriptorImpl]

'java' @ [51:63] ==> public val <T> KClass<NodeAttachmentService.DBAttachment>.java: Class<NodeAttachmentService.DBAttachment> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DBAttachment

'RaftUniquenessProvider' @ [52:21] ==> public companion object defined in net.corda.node.services.transactions.RaftUniquenessProvider[FakeCallableDescriptorForObject]

'RaftState' @ [52:44] ==> public constructor RaftState(key: String = ..., value: ByteArray = ...) defined in net.corda.node.services.transactions.RaftUniquenessProvider.RaftState[ClassConstructorDescriptorImpl]

'java' @ [52:61] ==> public val <T> KClass<RaftUniquenessProvider.RaftState>.java: Class<RaftUniquenessProvider.RaftState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> RaftState

'BFTNonValidatingNotaryService' @ [53:21] ==> public companion object defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService[FakeCallableDescriptorForObject]

'PersistedCommittedState' @ [53:51] ==> public constructor PersistedCommittedState(id: PersistentStateRef, consumingTxHash: String, consumingIndex: Int, party: PersistentUniquenessProvider.PersistentParty) defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.PersistedCommittedState[ClassConstructorDescriptorImpl]

'java' @ [53:82] ==> public val <T> KClass<BFTNonValidatingNotaryService.PersistedCommittedState>.java: Class<BFTNonValidatingNotaryService.PersistedCommittedState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PersistedCommittedState

'mapOf' @ [59:13] ==> public fun <K, V> mapOf(vararg pairs: Pair<MappedSchema, SchemaService.SchemaOptions>): Map<MappedSchema, SchemaService.SchemaOptions> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> MappedSchema
    <V> -> SchemaOptions

'Pair' @ [59:19] ==> public constructor Pair<out A, out B>(first: CommonSchemaV1, second: SchemaService.SchemaOptions) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> CommonSchemaV1
    <out B> -> SchemaOptions

'CommonSchemaV1' @ [59:24] ==> public object CommonSchemaV1 : MappedSchema defined in net.corda.core.schemas[FakeCallableDescriptorForObject]

'SchemaOptions' @ [59:54] ==> public constructor SchemaOptions(databaseSchema: String? = ..., tablePrefix: String? = ...) defined in net.corda.node.services.api.SchemaService.SchemaOptions[ClassConstructorDescriptorImpl]

'Pair' @ [60:19] ==> public constructor Pair<out A, out B>(first: VaultSchemaV1, second: SchemaService.SchemaOptions) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> VaultSchemaV1
    <out B> -> SchemaOptions

'VaultSchemaV1' @ [60:24] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'SchemaOptions' @ [60:53] ==> public constructor SchemaOptions(databaseSchema: String? = ..., tablePrefix: String? = ...) defined in net.corda.node.services.api.SchemaService.SchemaOptions[ClassConstructorDescriptorImpl]

'Pair' @ [61:19] ==> public constructor Pair<out A, out B>(first: NodeSchemaService.NodeServicesV1, second: SchemaService.SchemaOptions) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> NodeServicesV1
    <out B> -> SchemaOptions

'NodeServicesV1' @ [61:24] ==> public object NodeServicesV1 : MappedSchema defined in net.corda.node.services.schema.NodeSchemaService[FakeCallableDescriptorForObject]

'SchemaOptions' @ [61:54] ==> public constructor SchemaOptions(databaseSchema: String? = ..., tablePrefix: String? = ...) defined in net.corda.node.services.api.SchemaService.SchemaOptions[ClassConstructorDescriptorImpl]

'requiredSchemas' @ [63:82] ==> public final val requiredSchemas: Map<MappedSchema, SchemaService.SchemaOptions> defined in net.corda.node.services.schema.NodeSchemaService[PropertyDescriptorImpl]

'plus' @ [63:98] ==> public operator fun <K, V> Map<out MappedSchema, SchemaService.SchemaOptions>.plus(pairs: Iterable<Pair<MappedSchema, SchemaService.SchemaOptions>>): Map<MappedSchema, SchemaService.SchemaOptions> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> MappedSchema
    <V> -> SchemaOptions

'customSchemas' @ [63:103] ==> value-parameter customSchemas: Set<MappedSchema> = ... defined in net.corda.node.services.schema.NodeSchemaService.<init>[ValueParameterDescriptorImpl]

'map' @ [63:117] ==> public inline fun <T, R> Iterable<MappedSchema>.map(transform: (MappedSchema) -> Pair<MappedSchema, SchemaService.SchemaOptions>): List<Pair<MappedSchema, SchemaService.SchemaOptions>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MappedSchema
    <R> -> Pair<MappedSchema, SchemaOptions>

'Pair' @ [64:25] ==> public constructor Pair<out A, out B>(first: MappedSchema, second: SchemaService.SchemaOptions) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> MappedSchema
    <out B> -> SchemaOptions

'mappedSchema' @ [64:30] ==> value-parameter mappedSchema: MappedSchema defined in net.corda.node.services.schema.NodeSchemaService.schemaOptions.<anonymous>[ValueParameterDescriptorImpl]

'SchemaOptions' @ [64:58] ==> public constructor SchemaOptions(databaseSchema: String? = ..., tablePrefix: String? = ...) defined in net.corda.node.services.api.SchemaService.SchemaOptions[ClassConstructorDescriptorImpl]

'mutableSetOf' @ [69:23] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<MappedSchema> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MappedSchema

'state' @ [70:13] ==> value-parameter state: ContractState defined in net.corda.node.services.schema.NodeSchemaService.selectSchemas[ValueParameterDescriptorImpl]

'schemas' @ [71:13] ==> val schemas: MutableSet<MappedSchema> defined in net.corda.node.services.schema.NodeSchemaService.selectSchemas[LocalVariableDescriptor]

'state' @ [71:24] ==> value-parameter state: ContractState defined in net.corda.node.services.schema.NodeSchemaService.selectSchemas[ValueParameterDescriptorImpl]

'supportedSchemas' @ [71:30] ==> public abstract fun supportedSchemas(): Iterable<MappedSchema> defined in net.corda.core.schemas.QueryableState[DeserializedSimpleFunctionDescriptor]

'state' @ [72:13] ==> value-parameter state: ContractState defined in net.corda.node.services.schema.NodeSchemaService.selectSchemas[ValueParameterDescriptorImpl]

'schemas' @ [73:13] ==> val schemas: MutableSet<MappedSchema> defined in net.corda.node.services.schema.NodeSchemaService.selectSchemas[LocalVariableDescriptor]

'VaultSchemaV1' @ [73:24] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'state' @ [74:13] ==> value-parameter state: ContractState defined in net.corda.node.services.schema.NodeSchemaService.selectSchemas[ValueParameterDescriptorImpl]

'schemas' @ [75:13] ==> val schemas: MutableSet<MappedSchema> defined in net.corda.node.services.schema.NodeSchemaService.selectSchemas[LocalVariableDescriptor]

'VaultSchemaV1' @ [75:24] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'schemas' @ [77:16] ==> val schemas: MutableSet<MappedSchema> defined in net.corda.node.services.schema.NodeSchemaService.selectSchemas[LocalVariableDescriptor]

'schema' @ [82:14] ==> value-parameter schema: MappedSchema defined in net.corda.node.services.schema.NodeSchemaService.generateMappedObject[ValueParameterDescriptorImpl]

'state' @ [82:43] ==> value-parameter state: ContractState defined in net.corda.node.services.schema.NodeSchemaService.generateMappedObject[ValueParameterDescriptorImpl]

'VaultSchemaV1' @ [83:20] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultLinearStates' @ [83:34] ==> public constructor VaultLinearStates(uid: UniqueIdentifier, _participants: List<AbstractParty>) defined in net.corda.node.services.vault.VaultSchemaV1.VaultLinearStates[ClassConstructorDescriptorImpl]

'state' @ [83:52] ==> value-parameter state: ContractState defined in net.corda.node.services.schema.NodeSchemaService.generateMappedObject[ValueParameterDescriptorImpl]

'linearId' @ [83:58] ==> public abstract val linearId: UniqueIdentifier defined in net.corda.core.contracts.LinearState[DeserializedPropertyDescriptor]

'state' @ [83:68] ==> value-parameter state: ContractState defined in net.corda.node.services.schema.NodeSchemaService.generateMappedObject[ValueParameterDescriptorImpl]

'participants' @ [83:74] ==> public abstract val participants: List<AbstractParty> defined in net.corda.core.contracts.ContractState[DeserializedPropertyDescriptor]

'schema' @ [84:14] ==> value-parameter schema: MappedSchema defined in net.corda.node.services.schema.NodeSchemaService.generateMappedObject[ValueParameterDescriptorImpl]

'state' @ [84:43] ==> value-parameter state: ContractState defined in net.corda.node.services.schema.NodeSchemaService.generateMappedObject[ValueParameterDescriptorImpl]

'VaultSchemaV1' @ [85:20] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultFungibleStates' @ [85:34] ==> public constructor VaultFungibleStates(_owner: AbstractParty, _quantity: Long, _issuerParty: AbstractParty, _issuerRef: OpaqueBytes, _participants: List<AbstractParty>) defined in net.corda.node.services.vault.VaultSchemaV1.VaultFungibleStates[ClassConstructorDescriptorImpl]

'state' @ [85:54] ==> value-parameter state: ContractState defined in net.corda.node.services.schema.NodeSchemaService.generateMappedObject[ValueParameterDescriptorImpl]

'owner' @ [85:60] ==> public abstract val owner: AbstractParty defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'state' @ [85:67] ==> value-parameter state: ContractState defined in net.corda.node.services.schema.NodeSchemaService.generateMappedObject[ValueParameterDescriptorImpl]

'amount' @ [85:73] ==> public abstract val amount: Amount<out Issued<Any>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'quantity' @ [85:80] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'state' @ [85:90] ==> value-parameter state: ContractState defined in net.corda.node.services.schema.NodeSchemaService.generateMappedObject[ValueParameterDescriptorImpl]

'amount' @ [85:96] ==> public abstract val amount: Amount<out Issued<Any>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'token' @ [85:103] ==> public final val token: Issued<Any> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [85:109] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'party' @ [85:116] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'state' @ [85:123] ==> value-parameter state: ContractState defined in net.corda.node.services.schema.NodeSchemaService.generateMappedObject[ValueParameterDescriptorImpl]

'amount' @ [85:129] ==> public abstract val amount: Amount<out Issued<Any>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'token' @ [85:136] ==> public final val token: Issued<Any> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [85:142] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'reference' @ [85:149] ==> public final val reference: OpaqueBytes defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'state' @ [85:160] ==> value-parameter state: ContractState defined in net.corda.node.services.schema.NodeSchemaService.generateMappedObject[ValueParameterDescriptorImpl]

'participants' @ [85:166] ==> public abstract val participants: List<AbstractParty> defined in net.corda.core.contracts.ContractState[DeserializedPropertyDescriptor]

'state' @ [86:17] ==> value-parameter state: ContractState defined in net.corda.node.services.schema.NodeSchemaService.generateMappedObject[ValueParameterDescriptorImpl]

'generateMappedObject' @ [86:42] ==> public abstract fun generateMappedObject(schema: MappedSchema): PersistentState defined in net.corda.core.schemas.QueryableState[DeserializedSimpleFunctionDescriptor]

'schema' @ [86:63] ==> value-parameter schema: MappedSchema defined in net.corda.node.services.schema.NodeSchemaService.generateMappedObject[ValueParameterDescriptorImpl]

