'loggerFor' @ [25:22] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> HibernateConfiguration

'ConcurrentHashMap' @ [29:36] ==> public constructor ConcurrentHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.concurrent.ConcurrentHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Set<MappedSchema>
    <V : (Any..Any?)> -> SessionFactory

'parserTransactionIsolationLevel' @ [31:45] ==> public fun parserTransactionIsolationLevel(property: String?): Int defined in net.corda.node.utilities in file CordaPersistence.kt[SimpleFunctionDescriptorImpl]

'databaseProperties' @ [31:77] ==> private final val databaseProperties: Properties defined in net.corda.node.services.database.HibernateConfiguration[PropertyDescriptorImpl]

'getProperty' @ [31:96] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.util.Properties[JavaMethodDescriptor]

'invoke' @ [32:25] ==> public abstract operator fun invoke(): SchemaService defined in kotlin.Function0[FunctionInvokeDescriptor]

'logger' @ [35:9] ==> public final val logger: Logger defined in net.corda.node.services.database.HibernateConfiguration.Companion[PropertyDescriptorImpl]

'info' @ [35:16] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'schemaService' @ [35:65] ==> public final var schemaService: SchemaService defined in net.corda.node.services.database.HibernateConfiguration[PropertyDescriptorImpl]

'schemaOptions' @ [35:79] ==> public abstract val schemaOptions: Map<MappedSchema, SchemaService.SchemaOptions> defined in net.corda.node.services.api.SchemaService[PropertyDescriptorImpl]

'keys' @ [35:93] ==> public abstract val keys: Set<MappedSchema> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'sessionFactoryForRegisteredSchemas' @ [36:9] ==> public final fun sessionFactoryForRegisteredSchemas(): SessionFactory defined in net.corda.node.services.database.HibernateConfiguration[SimpleFunctionDescriptorImpl]

'sessionFactoryForSchemas' @ [40:16] ==> public final fun sessionFactoryForSchemas(vararg schemas: MappedSchema): SessionFactory defined in net.corda.node.services.database.HibernateConfiguration[SimpleFunctionDescriptorImpl]

'schemaService' @ [40:42] ==> public final var schemaService: SchemaService defined in net.corda.node.services.database.HibernateConfiguration[PropertyDescriptorImpl]

'schemaOptions' @ [40:56] ==> public abstract val schemaOptions: Map<MappedSchema, SchemaService.SchemaOptions> defined in net.corda.node.services.api.SchemaService[PropertyDescriptorImpl]

'keys' @ [40:70] ==> public abstract val keys: Set<MappedSchema> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'toTypedArray' @ [40:75] ==> public inline fun <reified T> Collection<MappedSchema>.toTypedArray(): Array<MappedSchema> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> MappedSchema

'sessionFactoryForSchemas' @ [44:16] ==> public final fun sessionFactoryForSchemas(vararg schemas: MappedSchema): SessionFactory defined in net.corda.node.services.database.HibernateConfiguration[SimpleFunctionDescriptorImpl]

'schema' @ [44:41] ==> value-parameter schema: MappedSchema defined in net.corda.node.services.database.HibernateConfiguration.sessionFactoryForSchema[ValueParameterDescriptorImpl]

'schemas' @ [49:44] ==> value-parameter vararg schemas: MappedSchema defined in net.corda.node.services.database.HibernateConfiguration.sessionFactoryForSchemas[ValueParameterDescriptorImpl]

'toSet' @ [49:52] ==> public fun <T> Array<out MappedSchema>.toSet(): Set<MappedSchema> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MappedSchema

'sessionFactories' @ [50:16] ==> private final val sessionFactories: ConcurrentHashMap<Set<MappedSchema>, SessionFactory> defined in net.corda.node.services.database.HibernateConfiguration[PropertyDescriptorImpl]

'computeIfAbsent' @ [50:33] ==> public final fun computeIfAbsent(p0: Set<MappedSchema>, p1: (Set<MappedSchema>) -> SessionFactory): SessionFactory defined in java.util.concurrent.ConcurrentHashMap[MyFunctionDescriptor]

'schemaSet' @ [50:49] ==> val schemaSet: Set<MappedSchema> defined in net.corda.node.services.database.HibernateConfiguration.sessionFactoryForSchemas[LocalVariableDescriptor]

'makeSessionFactoryForSchemas' @ [50:62] ==> private final fun makeSessionFactoryForSchemas(schemas: Set<MappedSchema>): SessionFactory defined in net.corda.node.services.database.HibernateConfiguration[SimpleFunctionDescriptorImpl]

'schemaSet' @ [50:91] ==> val schemaSet: Set<MappedSchema> defined in net.corda.node.services.database.HibernateConfiguration.sessionFactoryForSchemas[LocalVariableDescriptor]

'logger' @ [54:9] ==> public final val logger: Logger defined in net.corda.node.services.database.HibernateConfiguration.Companion[PropertyDescriptorImpl]

'info' @ [54:16] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'schemas' @ [54:61] ==> value-parameter schemas: Set<MappedSchema> defined in net.corda.node.services.database.HibernateConfiguration.makeSessionFactoryForSchemas[ValueParameterDescriptorImpl]

'BootstrapServiceRegistryBuilder' @ [55:31] ==> public constructor BootstrapServiceRegistryBuilder() defined in org.hibernate.boot.registry.BootstrapServiceRegistryBuilder[JavaClassConstructorDescriptor]

'build' @ [55:65] ==> public open fun build(): (BootstrapServiceRegistry..BootstrapServiceRegistry?) defined in org.hibernate.boot.registry.BootstrapServiceRegistryBuilder[JavaMethodDescriptor]

'MetadataSources' @ [56:31] ==> public constructor MetadataSources(p0: (ServiceRegistry..ServiceRegistry?)) defined in org.hibernate.boot.MetadataSources[JavaClassConstructorDescriptor]

'serviceRegistry' @ [56:47] ==> val serviceRegistry: (BootstrapServiceRegistry..BootstrapServiceRegistry?) defined in net.corda.node.services.database.HibernateConfiguration.makeSessionFactoryForSchemas[LocalVariableDescriptor]

'Configuration' @ [60:22] ==> public constructor Configuration(p0: (MetadataSources..MetadataSources?)) defined in org.hibernate.cfg.Configuration[JavaClassConstructorDescriptor]

'metadataSources' @ [60:36] ==> val metadataSources: MetadataSources defined in net.corda.node.services.database.HibernateConfiguration.makeSessionFactoryForSchemas[LocalVariableDescriptor]

'setProperty' @ [60:53] ==> public open fun setProperty(p0: (String..String?), p1: (String..String?)): (Configuration..Configuration?) defined in org.hibernate.cfg.Configuration[JavaMethodDescriptor]

'HibernateConfiguration' @ [60:104] ==> public companion object defined in net.corda.node.services.database.HibernateConfiguration[FakeCallableDescriptorForObject]

'NodeDatabaseConnectionProvider' @ [60:127] ==> public constructor NodeDatabaseConnectionProvider() defined in net.corda.node.services.database.HibernateConfiguration.NodeDatabaseConnectionProvider[ClassConstructorDescriptorImpl]

'java' @ [60:165] ==> public val <T> KClass<HibernateConfiguration.NodeDatabaseConnectionProvider>.java: Class<HibernateConfiguration.NodeDatabaseConnectionProvider> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NodeDatabaseConnectionProvider

'name' @ [60:170] ==> public final val <T : (Any..Any?)> Class<HibernateConfiguration.NodeDatabaseConnectionProvider>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> NodeDatabaseConnectionProvider

'setProperty' @ [61:18] ==> public open fun setProperty(p0: (String..String?), p1: (String..String?)): (Configuration..Configuration?) defined in org.hibernate.cfg.Configuration[JavaMethodDescriptor]

'if (databaseProperties.getProperty("initDatabase","true") == "true") "update" else "validate"' @ [61:56] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'databaseProperties' @ [61:60] ==> private final val databaseProperties: Properties defined in net.corda.node.services.database.HibernateConfiguration[PropertyDescriptorImpl]

'getProperty' @ [61:79] ==> public open fun getProperty(p0: (String..String?), p1: (String..String?)): (String..String?) defined in java.util.Properties[JavaMethodDescriptor]

'setProperty' @ [62:18] ==> public open fun setProperty(p0: (String..String?), p1: (String..String?)): (Configuration..Configuration?) defined in org.hibernate.cfg.Configuration[JavaMethodDescriptor]

'setProperty' @ [63:18] ==> public open fun setProperty(p0: (String..String?), p1: (String..String?)): (Configuration..Configuration?) defined in org.hibernate.cfg.Configuration[JavaMethodDescriptor]

'transactionIsolationLevel' @ [63:64] ==> private final val transactionIsolationLevel: Int defined in net.corda.node.services.database.HibernateConfiguration[PropertyDescriptorImpl]

'toString' @ [63:90] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'schemas' @ [65:9] ==> value-parameter schemas: Set<MappedSchema> defined in net.corda.node.services.database.HibernateConfiguration.makeSessionFactoryForSchemas[ValueParameterDescriptorImpl]

'forEach' @ [65:17] ==> @HidesMembers public inline fun <T> Iterable<MappedSchema>.forEach(action: (MappedSchema) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MappedSchema

'schema' @ [67:13] ==> value-parameter schema: MappedSchema defined in net.corda.node.services.database.HibernateConfiguration.makeSessionFactoryForSchemas.<anonymous>[ValueParameterDescriptorImpl]

'mappedTypes' @ [67:20] ==> public final val mappedTypes: Iterable<Class<*>> defined in net.corda.core.schemas.MappedSchema[DeserializedPropertyDescriptor]

'forEach' @ [67:32] ==> @HidesMembers public inline fun <T> Iterable<Class<*>>.forEach(action: (Class<*>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<*>

'config' @ [67:42] ==> val config: (Configuration..Configuration?) defined in net.corda.node.services.database.HibernateConfiguration.makeSessionFactoryForSchemas[LocalVariableDescriptor]

'addAnnotatedClass' @ [67:49] ==> public open fun addAnnotatedClass(p0: raw (Class<(Any..Any?)>..Class<*>?)): (Configuration..Configuration?) defined in org.hibernate.cfg.Configuration[JavaMethodDescriptor]

'it' @ [67:67] ==> value-parameter it: Class<*> defined in net.corda.node.services.database.HibernateConfiguration.makeSessionFactoryForSchemas.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'buildSessionFactory' @ [70:30] ==> private final fun buildSessionFactory(config: Configuration, metadataSources: MetadataSources, tablePrefix: String): SessionFactory defined in net.corda.node.services.database.HibernateConfiguration[SimpleFunctionDescriptorImpl]

'config' @ [70:50] ==> val config: (Configuration..Configuration?) defined in net.corda.node.services.database.HibernateConfiguration.makeSessionFactoryForSchemas[LocalVariableDescriptor]

'metadataSources' @ [70:58] ==> val metadataSources: MetadataSources defined in net.corda.node.services.database.HibernateConfiguration.makeSessionFactoryForSchemas[LocalVariableDescriptor]

'databaseProperties' @ [70:75] ==> private final val databaseProperties: Properties defined in net.corda.node.services.database.HibernateConfiguration[PropertyDescriptorImpl]

'getProperty' @ [70:94] ==> public open fun getProperty(p0: (String..String?), p1: (String..String?)): (String..String?) defined in java.util.Properties[JavaMethodDescriptor]

'logger' @ [71:9] ==> public final val logger: Logger defined in net.corda.node.services.database.HibernateConfiguration.Companion[PropertyDescriptorImpl]

'info' @ [71:16] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'schemas' @ [71:60] ==> value-parameter schemas: Set<MappedSchema> defined in net.corda.node.services.database.HibernateConfiguration.makeSessionFactoryForSchemas[ValueParameterDescriptorImpl]

'sessionFactory' @ [72:16] ==> val sessionFactory: SessionFactory defined in net.corda.node.services.database.HibernateConfiguration.makeSessionFactoryForSchemas[LocalVariableDescriptor]

'config' @ [76:9] ==> value-parameter config: Configuration defined in net.corda.node.services.database.HibernateConfiguration.buildSessionFactory[ValueParameterDescriptorImpl]

'standardServiceRegistryBuilder' @ [76:16] ==> public final val Configuration.standardServiceRegistryBuilder: (StandardServiceRegistryBuilder..StandardServiceRegistryBuilder?)[MyPropertyDescriptor]

'applySettings' @ [76:47] ==> public open fun applySettings(p0: raw (MutableMap<Any?, Any?>..Map<*, *>?)): (StandardServiceRegistryBuilder..StandardServiceRegistryBuilder?) defined in org.hibernate.boot.registry.StandardServiceRegistryBuilder[JavaMethodDescriptor]

'config' @ [76:61] ==> value-parameter config: Configuration defined in net.corda.node.services.database.HibernateConfiguration.buildSessionFactory[ValueParameterDescriptorImpl]

'properties' @ [76:68] ==> public final var Configuration.properties: (Properties..Properties?)[MyPropertyDescriptor]

'metadataSources' @ [77:24] ==> value-parameter metadataSources: MetadataSources defined in net.corda.node.services.database.HibernateConfiguration.buildSessionFactory[ValueParameterDescriptorImpl]

'getMetadataBuilder' @ [77:40] ==> public open fun getMetadataBuilder(p0: (StandardServiceRegistry..StandardServiceRegistry?)): (MetadataBuilder..MetadataBuilder?) defined in org.hibernate.boot.MetadataSources[JavaMethodDescriptor]

'config' @ [77:59] ==> value-parameter config: Configuration defined in net.corda.node.services.database.HibernateConfiguration.buildSessionFactory[ValueParameterDescriptorImpl]

'standardServiceRegistryBuilder' @ [77:66] ==> public final val Configuration.standardServiceRegistryBuilder: (StandardServiceRegistryBuilder..StandardServiceRegistryBuilder?)[MyPropertyDescriptor]

'build' @ [77:97] ==> public open fun build(): (StandardServiceRegistry..StandardServiceRegistry?) defined in org.hibernate.boot.registry.StandardServiceRegistryBuilder[JavaMethodDescriptor]

'run' @ [77:106] ==> @InlineOnly public inline fun <T, R> (MetadataBuilder..MetadataBuilder?).run(block: (MetadataBuilder..MetadataBuilder?).() -> (Metadata..Metadata?)): (Metadata..Metadata?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.hibernate.boot.MetadataBuilder..org.hibernate.boot.MetadataBuilder?)
    <R> -> (org.hibernate.boot.Metadata..org.hibernate.boot.Metadata?)

'applyPhysicalNamingStrategy' @ [78:13] ==> public abstract fun applyPhysicalNamingStrategy(p0: (PhysicalNamingStrategy..PhysicalNamingStrategy?)): (MetadataBuilder..MetadataBuilder?) defined in org.hibernate.boot.MetadataBuilder[JavaMethodDescriptor]

'PhysicalNamingStrategyStandardImpl' @ [78:50] ==> public constructor PhysicalNamingStrategyStandardImpl() defined in org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl[JavaClassConstructorDescriptor]

'super' @ [80:35] ==> <this> defined in net.corda.node.services.database.HibernateConfiguration.buildSessionFactory.<anonymous>.<no name provided>[LazyClassReceiverParameterDescriptor]

'toPhysicalTableName' @ [80:41] ==> public open fun toPhysicalTableName(p0: (Identifier..Identifier?), p1: (JdbcEnvironment..JdbcEnvironment?)): (Identifier..Identifier?) defined in org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl[JavaMethodDescriptor]

'name' @ [80:61] ==> value-parameter name: Identifier? defined in net.corda.node.services.database.HibernateConfiguration.buildSessionFactory.<anonymous>.<no name provided>.toPhysicalTableName[ValueParameterDescriptorImpl]

'context' @ [80:67] ==> value-parameter context: JdbcEnvironment? defined in net.corda.node.services.database.HibernateConfiguration.buildSessionFactory.<anonymous>.<no name provided>.toPhysicalTableName[ValueParameterDescriptorImpl]

'toIdentifier' @ [81:39] ==> public open fun toIdentifier(p0: (String..String?), p1: Boolean): (Identifier..Identifier?) defined in org.hibernate.boot.model.naming.Identifier[JavaMethodDescriptor]

'tablePrefix' @ [81:52] ==> value-parameter tablePrefix: String defined in net.corda.node.services.database.HibernateConfiguration.buildSessionFactory[ValueParameterDescriptorImpl]

'default' @ [81:66] ==> val default: (Identifier..Identifier?) defined in net.corda.node.services.database.HibernateConfiguration.buildSessionFactory.<anonymous>.<no name provided>.toPhysicalTableName[LocalVariableDescriptor]

'text' @ [81:74] ==> public final val Identifier.text: (String..String?)[MyPropertyDescriptor]

'default' @ [81:80] ==> val default: (Identifier..Identifier?) defined in net.corda.node.services.database.HibernateConfiguration.buildSessionFactory.<anonymous>.<no name provided>.toPhysicalTableName[LocalVariableDescriptor]

'isQuoted' @ [81:88] ==> public final val Identifier.isQuoted: Boolean[MyPropertyDescriptor]

'applyAttributeConverter' @ [85:13] ==> public abstract fun applyAttributeConverter(p0: raw (AttributeConverter<(Any..Any?), (Any..Any?)>..AttributeConverter<*, *>?)): (MetadataBuilder..MetadataBuilder?) defined in org.hibernate.boot.MetadataBuilder[JavaMethodDescriptor]

'AbstractPartyToX500NameAsStringConverter' @ [85:37] ==> public constructor AbstractPartyToX500NameAsStringConverter(identitySvc: () -> IdentityService) defined in net.corda.core.schemas.converters.AbstractPartyToX500NameAsStringConverter[DeserializedClassConstructorDescriptor]

'createIdentityScervice' @ [85:78] ==> private final val createIdentityScervice: () -> IdentityService defined in net.corda.node.services.database.HibernateConfiguration[PropertyDescriptorImpl]

'build' @ [87:13] ==> public abstract fun build(): (Metadata..Metadata?) defined in org.hibernate.boot.MetadataBuilder[JavaMethodDescriptor]

'metadata' @ [90:16] ==> val metadata: (Metadata..Metadata?) defined in net.corda.node.services.database.HibernateConfiguration.buildSessionFactory[LocalVariableDescriptor]

'sessionFactoryBuilder' @ [90:25] ==> public final val Metadata.sessionFactoryBuilder: (SessionFactoryBuilder..SessionFactoryBuilder?)[MyPropertyDescriptor]

'run' @ [90:47] ==> @InlineOnly public inline fun <T, R> (SessionFactoryBuilder..SessionFactoryBuilder?).run(block: (SessionFactoryBuilder..SessionFactoryBuilder?).() -> (SessionFactory..SessionFactory?)): (SessionFactory..SessionFactory?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.hibernate.boot.SessionFactoryBuilder..org.hibernate.boot.SessionFactoryBuilder?)
    <R> -> (org.hibernate.SessionFactory..org.hibernate.SessionFactory?)

'allowOutOfTransactionUpdateOperations' @ [91:13] ==> public abstract fun allowOutOfTransactionUpdateOperations(p0: Boolean): (SessionFactoryBuilder..SessionFactoryBuilder?) defined in org.hibernate.boot.SessionFactoryBuilder[JavaMethodDescriptor]

'applySecondLevelCacheSupport' @ [92:13] ==> public abstract fun applySecondLevelCacheSupport(p0: Boolean): (SessionFactoryBuilder..SessionFactoryBuilder?) defined in org.hibernate.boot.SessionFactoryBuilder[JavaMethodDescriptor]

'applyQueryCacheSupport' @ [93:13] ==> public abstract fun applyQueryCacheSupport(p0: Boolean): (SessionFactoryBuilder..SessionFactoryBuilder?) defined in org.hibernate.boot.SessionFactoryBuilder[JavaMethodDescriptor]

'enableReleaseResourcesOnCloseEnabled' @ [94:13] ==> public abstract fun enableReleaseResourcesOnCloseEnabled(p0: Boolean): (SessionFactoryBuilder..SessionFactoryBuilder?) defined in org.hibernate.boot.SessionFactoryBuilder[JavaMethodDescriptor]

'build' @ [95:13] ==> public abstract fun build(): (SessionFactory..SessionFactory?) defined in org.hibernate.boot.SessionFactoryBuilder[JavaMethodDescriptor]

'DatabaseTransactionManager' @ [103:22] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [103:49] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'tx' @ [104:13] ==> val tx: DatabaseTransaction defined in net.corda.node.services.database.HibernateConfiguration.NodeDatabaseConnectionProvider.closeConnection[LocalVariableDescriptor]

'commit' @ [104:16] ==> public final fun commit(): Unit defined in net.corda.node.utilities.DatabaseTransaction[SimpleFunctionDescriptorImpl]

'tx' @ [105:13] ==> val tx: DatabaseTransaction defined in net.corda.node.services.database.HibernateConfiguration.NodeDatabaseConnectionProvider.closeConnection[LocalVariableDescriptor]

'close' @ [105:16] ==> public final fun close(): Unit defined in net.corda.node.utilities.DatabaseTransaction[SimpleFunctionDescriptorImpl]

'DatabaseTransactionManager' @ [111:20] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'newTransaction' @ [111:47] ==> public final fun newTransaction(isolation: Int = ...): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'connection' @ [111:64] ==> public final val connection: Connection defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'unwrapType' @ [115:20] ==> value-parameter unwrapType: Class<T> defined in net.corda.node.services.database.HibernateConfiguration.NodeDatabaseConnectionProvider.unwrap[ValueParameterDescriptorImpl]

'castIfPossible' @ [115:31] ==> public fun <T> Class<T>.castIfPossible(obj: Any): T? defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'this' @ [115:46] ==> <this> defined in net.corda.node.services.database.HibernateConfiguration.NodeDatabaseConnectionProvider[LazyClassReceiverParameterDescriptor]

'UnknownUnwrapTypeException' @ [115:61] ==> public constructor UnknownUnwrapTypeException(p0: raw (Class<(Any..Any?)>..Class<*>?)) defined in org.hibernate.service.UnknownUnwrapTypeException[JavaClassConstructorDescriptor]

'unwrapType' @ [115:88] ==> value-parameter unwrapType: Class<T> defined in net.corda.node.services.database.HibernateConfiguration.NodeDatabaseConnectionProvider.unwrap[ValueParameterDescriptorImpl]

'unwrapType' @ [118:72] ==> value-parameter unwrapType: Class<*>? defined in net.corda.node.services.database.HibernateConfiguration.NodeDatabaseConnectionProvider.isUnwrappableAs[ValueParameterDescriptorImpl]

'NodeDatabaseConnectionProvider' @ [118:86] ==> public constructor NodeDatabaseConnectionProvider() defined in net.corda.node.services.database.HibernateConfiguration.NodeDatabaseConnectionProvider[ClassConstructorDescriptorImpl]

'java' @ [118:124] ==> public val <T> KClass<HibernateConfiguration.NodeDatabaseConnectionProvider>.java: Class<HibernateConfiguration.NodeDatabaseConnectionProvider> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NodeDatabaseConnectionProvider

