'MappedSchema' @ [16:40] ==> public constructor MappedSchema(schemaFamily: Class<*>, version: Int, mappedTypes: Iterable<Class<*>>) defined in net.corda.core.schemas.MappedSchema[DeserializedClassConstructorDescriptor]

'CommercialPaperSchema' @ [16:68] ==> public object CommercialPaperSchema defined in net.corda.finance.schemas in file SampleCommercialPaperSchemaV1.kt[FakeCallableDescriptorForObject]

'javaClass' @ [16:90] ==> public val <T : Any> CommercialPaperSchema.javaClass: Class<CommercialPaperSchema> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> CommercialPaperSchema

'listOf' @ [17:67] ==> public fun <T> listOf(element: Class<SampleCommercialPaperSchemaV2.PersistentCommercialPaperState>): List<Class<SampleCommercialPaperSchemaV2.PersistentCommercialPaperState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<PersistentCommercialPaperState>

'PersistentCommercialPaperState' @ [17:74] ==> public constructor PersistentCommercialPaperState(maturity: Instant, currency: String, faceValueIssuerParty: String, faceValueIssuerRef: ByteArray, _participants: Set<AbstractParty>, _owner: AbstractParty, _quantity: Long, _issuerParty: AbstractParty, _issuerRef: ByteArray) defined in net.corda.finance.schemas.SampleCommercialPaperSchemaV2.PersistentCommercialPaperState[ClassConstructorDescriptorImpl]

'java' @ [17:112] ==> public val <T> KClass<SampleCommercialPaperSchemaV2.PersistentCommercialPaperState>.java: Class<SampleCommercialPaperSchemaV2.PersistentCommercialPaperState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PersistentCommercialPaperState

'Entity' @ [18:5] ==> public constructor Entity(name: String = ...) defined in javax.persistence.Entity[JavaClassConstructorDescriptor]

'Table' @ [19:5] ==> public constructor Table(name: String = ..., catalog: String = ..., schema: String = ..., uniqueConstraints: Array<UniqueConstraint> = ..., indexes: Array<Index> = ...) defined in javax.persistence.Table[JavaClassConstructorDescriptor]

'arrayOf' @ [20:22] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Index): Array<Index> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Index

'Index' @ [20:30] ==> public constructor Index(name: String = ..., columnList: String, unique: Boolean = ...) defined in javax.persistence.Index[JavaClassConstructorDescriptor]

'Index' @ [21:30] ==> public constructor Index(name: String = ..., columnList: String, unique: Boolean = ...) defined in javax.persistence.Index[JavaClassConstructorDescriptor]

'Column' @ [23:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'Column' @ [26:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'Column' @ [29:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'Column' @ [32:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'Transient' @ [36:13] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'Transient' @ [38:13] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'Transient' @ [40:13] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'Transient' @ [43:13] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'Transient' @ [45:13] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'CommonSchemaV1.FungibleState' @ [47:9] ==> public constructor FungibleState(participants: MutableSet<AbstractParty>? = ..., owner: AbstractParty, quantity: Long, issuer: AbstractParty, issuerRef: ByteArray) defined in net.corda.core.schemas.CommonSchemaV1.FungibleState[DeserializedClassConstructorDescriptor]

'_participants' @ [47:38] ==> value-parameter _participants: Set<AbstractParty> defined in net.corda.finance.schemas.SampleCommercialPaperSchemaV2.PersistentCommercialPaperState.<init>[ValueParameterDescriptorImpl]

'toMutableSet' @ [47:52] ==> public fun <T> Iterable<AbstractParty>.toMutableSet(): MutableSet<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'_owner' @ [47:68] ==> value-parameter _owner: AbstractParty defined in net.corda.finance.schemas.SampleCommercialPaperSchemaV2.PersistentCommercialPaperState.<init>[ValueParameterDescriptorImpl]

'_quantity' @ [47:76] ==> value-parameter _quantity: Long defined in net.corda.finance.schemas.SampleCommercialPaperSchemaV2.PersistentCommercialPaperState.<init>[ValueParameterDescriptorImpl]

'_issuerParty' @ [47:87] ==> value-parameter _issuerParty: AbstractParty defined in net.corda.finance.schemas.SampleCommercialPaperSchemaV2.PersistentCommercialPaperState.<init>[ValueParameterDescriptorImpl]

'_issuerRef' @ [47:101] ==> value-parameter _issuerRef: ByteArray defined in net.corda.finance.schemas.SampleCommercialPaperSchemaV2.PersistentCommercialPaperState.<init>[ValueParameterDescriptorImpl]

