'loggerFor' @ [23:22] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> HibernateObserver

'vaultUpdates' @ [27:9] ==> value-parameter vaultUpdates: Observable<Vault.Update<ContractState>> defined in net.corda.node.services.schema.HibernateObserver.<init>[ValueParameterDescriptorImpl]

'subscribe' @ [27:22] ==> public final fun subscribe(p0: (((Vault.Update<ContractState>..Vault.Update<ContractState>?)) -> Unit..(((Vault.Update<ContractState>..Vault.Update<ContractState>?)) -> Unit)?)): (Subscription..Subscription?) defined in rx.Observable[MyFunctionDescriptor]

'persist' @ [27:34] ==> private final fun persist(produced: Set<StateAndRef<ContractState>>): Unit defined in net.corda.node.services.schema.HibernateObserver[SimpleFunctionDescriptorImpl]

'it' @ [27:42] ==> value-parameter it: (Vault.Update<ContractState>..Vault.Update<ContractState>?) defined in net.corda.node.services.schema.HibernateObserver.<init>.<anonymous>[ValueParameterDescriptorImpl]

'produced' @ [27:45] ==> public final val produced: Set<StateAndRef<ContractState>> defined in net.corda.core.node.services.Vault.Update[DeserializedPropertyDescriptor]

'produced' @ [31:9] ==> value-parameter produced: Set<StateAndRef<ContractState>> defined in net.corda.node.services.schema.HibernateObserver.persist[ValueParameterDescriptorImpl]

'forEach' @ [31:18] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<ContractState>>.forEach(action: (StateAndRef<ContractState>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'persistState' @ [31:28] ==> private final fun persistState(stateAndRef: StateAndRef<ContractState>): Unit defined in net.corda.node.services.schema.HibernateObserver[SimpleFunctionDescriptorImpl]

'it' @ [31:41] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.node.services.schema.HibernateObserver.persist.<anonymous>[ValueParameterDescriptorImpl]

'stateAndRef' @ [35:21] ==> value-parameter stateAndRef: StateAndRef<ContractState> defined in net.corda.node.services.schema.HibernateObserver.persistState[ValueParameterDescriptorImpl]

'state' @ [35:33] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [35:39] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'logger' @ [36:9] ==> public final val logger: Logger defined in net.corda.node.services.schema.HibernateObserver.Companion[PropertyDescriptorImpl]

'debug' @ [36:16] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'stateAndRef' @ [36:50] ==> value-parameter stateAndRef: StateAndRef<ContractState> defined in net.corda.node.services.schema.HibernateObserver.persistState[ValueParameterDescriptorImpl]

'ref' @ [36:62] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'config' @ [37:9] ==> public final val config: HibernateConfiguration defined in net.corda.node.services.schema.HibernateObserver[PropertyDescriptorImpl]

'schemaService' @ [37:16] ==> public final var schemaService: SchemaService defined in net.corda.node.services.database.HibernateConfiguration[PropertyDescriptorImpl]

'selectSchemas' @ [37:30] ==> public abstract fun selectSchemas(state: ContractState): Iterable<MappedSchema> defined in net.corda.node.services.api.SchemaService[SimpleFunctionDescriptorImpl]

'state' @ [37:44] ==> val state: ContractState defined in net.corda.node.services.schema.HibernateObserver.persistState[LocalVariableDescriptor]

'forEach' @ [37:51] ==> @HidesMembers public inline fun <T> Iterable<MappedSchema>.forEach(action: (MappedSchema) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MappedSchema

'persistStateWithSchema' @ [37:61] ==> public final fun persistStateWithSchema(state: ContractState, stateRef: StateRef, schema: MappedSchema): Unit defined in net.corda.node.services.schema.HibernateObserver[SimpleFunctionDescriptorImpl]

'state' @ [37:84] ==> val state: ContractState defined in net.corda.node.services.schema.HibernateObserver.persistState[LocalVariableDescriptor]

'stateAndRef' @ [37:91] ==> value-parameter stateAndRef: StateAndRef<ContractState> defined in net.corda.node.services.schema.HibernateObserver.persistState[ValueParameterDescriptorImpl]

'ref' @ [37:103] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'it' @ [37:108] ==> value-parameter it: MappedSchema defined in net.corda.node.services.schema.HibernateObserver.persistState.<anonymous>[ValueParameterDescriptorImpl]

'config' @ [41:30] ==> public final val config: HibernateConfiguration defined in net.corda.node.services.schema.HibernateObserver[PropertyDescriptorImpl]

'sessionFactoryForSchema' @ [41:37] ==> public final fun sessionFactoryForSchema(schema: MappedSchema): SessionFactory defined in net.corda.node.services.database.HibernateConfiguration[SimpleFunctionDescriptorImpl]

'schema' @ [41:61] ==> value-parameter schema: MappedSchema defined in net.corda.node.services.schema.HibernateObserver.persistStateWithSchema[ValueParameterDescriptorImpl]

'sessionFactory' @ [42:23] ==> val sessionFactory: SessionFactory defined in net.corda.node.services.schema.HibernateObserver.persistStateWithSchema[LocalVariableDescriptor]

'withOptions' @ [42:38] ==> public abstract fun withOptions(): raw (SessionBuilder<(SessionBuilder<*>..SessionBuilder<*>?)>..SessionBuilder<out (SessionBuilder<*>..SessionBuilder<*>?)>?) defined in org.hibernate.SessionFactory[JavaMethodDescriptor]

'connection' @ [43:17] ==> public abstract fun connection(p0: (Connection..Connection?)): raw (SessionBuilder<(SessionBuilder<*>..SessionBuilder<*>?)>..SessionBuilder<out (SessionBuilder<*>..SessionBuilder<*>?)>?) defined in org.hibernate.SessionBuilder[JavaMethodDescriptor]

'DatabaseTransactionManager' @ [43:28] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [43:55] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'connection' @ [43:65] ==> public final val connection: Connection defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'flushMode' @ [44:17] ==> public abstract fun flushMode(p0: (FlushMode..FlushMode?)): raw (SessionBuilder<(SessionBuilder<*>..SessionBuilder<*>?)>..SessionBuilder<out (SessionBuilder<*>..SessionBuilder<*>?)>?) defined in org.hibernate.SessionBuilder[JavaMethodDescriptor]

'MANUAL' @ [44:37] ==> enum entry MANUAL defined in org.hibernate.FlushMode[FakeCallableDescriptorForObject]

'openSession' @ [45:17] ==> public abstract fun openSession(): (Session..Session?) defined in org.hibernate.SessionBuilder[JavaMethodDescriptor]

'session' @ [46:9] ==> val session: (Session..Session?) defined in net.corda.node.services.schema.HibernateObserver.persistStateWithSchema[LocalVariableDescriptor]

'use' @ [46:17] ==> @SinceKotlin @InlineOnly public inline fun <T : AutoCloseable?, R> (Session..Session?).use(block: ((Session..Session?)) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : AutoCloseable?> -> (org.hibernate.Session..org.hibernate.Session?)
    <R> -> Unit

'config' @ [47:32] ==> public final val config: HibernateConfiguration defined in net.corda.node.services.schema.HibernateObserver[PropertyDescriptorImpl]

'schemaService' @ [47:39] ==> public final var schemaService: SchemaService defined in net.corda.node.services.database.HibernateConfiguration[PropertyDescriptorImpl]

'generateMappedObject' @ [47:53] ==> public abstract fun generateMappedObject(state: ContractState, schema: MappedSchema): PersistentState defined in net.corda.node.services.api.SchemaService[SimpleFunctionDescriptorImpl]

'state' @ [47:74] ==> value-parameter state: ContractState defined in net.corda.node.services.schema.HibernateObserver.persistStateWithSchema[ValueParameterDescriptorImpl]

'schema' @ [47:81] ==> value-parameter schema: MappedSchema defined in net.corda.node.services.schema.HibernateObserver.persistStateWithSchema[ValueParameterDescriptorImpl]

'mappedObject' @ [48:13] ==> val mappedObject: PersistentState defined in net.corda.node.services.schema.HibernateObserver.persistStateWithSchema.<anonymous>[LocalVariableDescriptor]

'stateRef' @ [48:26] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.core.schemas.PersistentState[DeserializedPropertyDescriptor]

'PersistentStateRef' @ [48:37] ==> public constructor PersistentStateRef(stateRef: StateRef) defined in net.corda.core.schemas.PersistentStateRef[DeserializedClassConstructorDescriptor]

'stateRef' @ [48:56] ==> value-parameter stateRef: StateRef defined in net.corda.node.services.schema.HibernateObserver.persistStateWithSchema[ValueParameterDescriptorImpl]

'it' @ [49:13] ==> value-parameter it: (Session..Session?) defined in net.corda.node.services.schema.HibernateObserver.persistStateWithSchema.<anonymous>[ValueParameterDescriptorImpl]

'persist' @ [49:16] ==> public abstract fun persist(p0: (Any..Any?)): Unit defined in org.hibernate.Session[JavaMethodDescriptor]

'mappedObject' @ [49:24] ==> val mappedObject: PersistentState defined in net.corda.node.services.schema.HibernateObserver.persistStateWithSchema.<anonymous>[LocalVariableDescriptor]

'it' @ [50:13] ==> value-parameter it: (Session..Session?) defined in net.corda.node.services.schema.HibernateObserver.persistStateWithSchema.<anonymous>[ValueParameterDescriptorImpl]

'flush' @ [50:16] ==> public abstract fun flush(): Unit defined in org.hibernate.Session[JavaMethodDescriptor]

