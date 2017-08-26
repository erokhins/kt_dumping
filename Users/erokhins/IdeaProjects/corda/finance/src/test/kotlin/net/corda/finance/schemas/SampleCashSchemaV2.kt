'MappedSchema' @ [15:29] ==> public constructor MappedSchema(schemaFamily: Class<*>, version: Int, mappedTypes: Iterable<Class<*>>) defined in net.corda.core.schemas.MappedSchema[DeserializedClassConstructorDescriptor]

'CashSchema' @ [15:57] ==> public object CashSchema defined in net.corda.finance.schemas in file SampleCashSchemaV1.kt[FakeCallableDescriptorForObject]

'javaClass' @ [15:68] ==> public val <T : Any> CashSchema.javaClass: Class<CashSchema> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> CashSchema

'listOf' @ [16:50] ==> public fun <T> listOf(element: Class<SampleCashSchemaV2.PersistentCashState>): List<Class<SampleCashSchemaV2.PersistentCashState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<PersistentCashState>

'PersistentCashState' @ [16:57] ==> public constructor PersistentCashState(currency: String, _participants: Set<AbstractParty>, _owner: AbstractParty, _quantity: Long, _issuerParty: AbstractParty, _issuerRef: ByteArray) defined in net.corda.finance.schemas.SampleCashSchemaV2.PersistentCashState[ClassConstructorDescriptorImpl]

'java' @ [16:84] ==> public val <T> KClass<SampleCashSchemaV2.PersistentCashState>.java: Class<SampleCashSchemaV2.PersistentCashState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PersistentCashState

'Entity' @ [17:5] ==> public constructor Entity(name: String = ...) defined in javax.persistence.Entity[JavaClassConstructorDescriptor]

'Table' @ [18:5] ==> public constructor Table(name: String = ..., catalog: String = ..., schema: String = ..., uniqueConstraints: Array<UniqueConstraint> = ..., indexes: Array<Index> = ...) defined in javax.persistence.Table[JavaClassConstructorDescriptor]

'arrayOf' @ [19:22] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Index): Array<Index> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Index

'Index' @ [19:30] ==> public constructor Index(name: String = ..., columnList: String, unique: Boolean = ...) defined in javax.persistence.Index[JavaClassConstructorDescriptor]

'Column' @ [22:9] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'Transient' @ [26:9] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'Transient' @ [28:9] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'Transient' @ [30:9] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'Transient' @ [32:9] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'Transient' @ [34:9] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'CommonSchemaV1.FungibleState' @ [36:9] ==> public constructor FungibleState(participants: MutableSet<AbstractParty>? = ..., owner: AbstractParty, quantity: Long, issuer: AbstractParty, issuerRef: ByteArray) defined in net.corda.core.schemas.CommonSchemaV1.FungibleState[DeserializedClassConstructorDescriptor]

'_participants' @ [36:38] ==> value-parameter _participants: Set<AbstractParty> defined in net.corda.finance.schemas.SampleCashSchemaV2.PersistentCashState.<init>[ValueParameterDescriptorImpl]

'toMutableSet' @ [36:52] ==> public fun <T> Iterable<AbstractParty>.toMutableSet(): MutableSet<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'_owner' @ [36:68] ==> value-parameter _owner: AbstractParty defined in net.corda.finance.schemas.SampleCashSchemaV2.PersistentCashState.<init>[ValueParameterDescriptorImpl]

'_quantity' @ [36:76] ==> value-parameter _quantity: Long defined in net.corda.finance.schemas.SampleCashSchemaV2.PersistentCashState.<init>[ValueParameterDescriptorImpl]

'_issuerParty' @ [36:87] ==> value-parameter _issuerParty: AbstractParty defined in net.corda.finance.schemas.SampleCashSchemaV2.PersistentCashState.<init>[ValueParameterDescriptorImpl]

'_issuerRef' @ [36:101] ==> value-parameter _issuerRef: ByteArray defined in net.corda.finance.schemas.SampleCashSchemaV2.PersistentCashState.<init>[ValueParameterDescriptorImpl]

