'module' @ [47:9] ==> public abstract val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.context.MutableModuleContext[PropertyDescriptorImpl]

'setDependencies' @ [47:16] ==> public final fun setDependencies(vararg descriptors: ModuleDescriptorImpl): Unit defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]

'dependencies' @ [47:33] ==> value-parameter vararg dependencies: ModuleDescriptorImpl defined in org.jetbrains.kotlin.context.MutableModuleContext.setDependencies[ValueParameterDescriptorImpl]

'module' @ [51:9] ==> public abstract val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.context.MutableModuleContext[PropertyDescriptorImpl]

'setDependencies' @ [51:16] ==> public final fun setDependencies(descriptors: List<ModuleDescriptorImpl>): Unit defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]

'dependencies' @ [51:32] ==> value-parameter dependencies: List<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.context.MutableModuleContext.setDependencies[ValueParameterDescriptorImpl]

'module' @ [55:9] ==> public abstract val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.context.MutableModuleContext[PropertyDescriptorImpl]

'initialize' @ [55:16] ==> public final fun initialize(providerForModuleContent: PackageFragmentProvider): Unit defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]

'packageFragmentProvider' @ [55:27] ==> value-parameter packageFragmentProvider: PackageFragmentProvider defined in org.jetbrains.kotlin.context.MutableModuleContext.initializeModuleContents[ValueParameterDescriptorImpl]

'SimpleGlobalContext' @ [67:5] ==> public constructor SimpleGlobalContext(storageManager: StorageManager, exceptionTracker: ExceptionTracker) defined in org.jetbrains.kotlin.context.SimpleGlobalContext[ClassConstructorDescriptorImpl]

'storageManager' @ [67:25] ==> value-parameter storageManager: LockBasedStorageManager defined in org.jetbrains.kotlin.context.GlobalContextImpl.<init>[ValueParameterDescriptorImpl]

'exceptionTracker' @ [67:41] ==> value-parameter exceptionTracker: ExceptionTracker defined in org.jetbrains.kotlin.context.GlobalContextImpl.<init>[ValueParameterDescriptorImpl]

'super' @ [68:60] ==> <this> defined in org.jetbrains.kotlin.context.GlobalContextImpl[LazyClassReceiverParameterDescriptor]

'storageManager' @ [68:66] ==> public open val storageManager: StorageManager defined in org.jetbrains.kotlin.context.SimpleGlobalContext[PropertyDescriptorImpl]

'globalContext' @ [74:38] ==> value-parameter globalContext: GlobalContext defined in org.jetbrains.kotlin.context.ProjectContextImpl.<init>[ValueParameterDescriptorImpl]

'projectContext' @ [79:38] ==> value-parameter projectContext: ProjectContext defined in org.jetbrains.kotlin.context.ModuleContextImpl.<init>[ValueParameterDescriptorImpl]

'projectContext' @ [84:45] ==> value-parameter projectContext: ProjectContext defined in org.jetbrains.kotlin.context.MutableModuleContextImpl.<init>[ValueParameterDescriptorImpl]

'ExceptionTracker' @ [87:19] ==> public constructor ExceptionTracker() defined in org.jetbrains.kotlin.storage.ExceptionTracker[ClassConstructorDescriptorImpl]

'GlobalContextImpl' @ [88:12] ==> public constructor GlobalContextImpl(storageManager: LockBasedStorageManager, exceptionTracker: ExceptionTracker) defined in org.jetbrains.kotlin.context.GlobalContextImpl[ClassConstructorDescriptorImpl]

'createWithExceptionHandling' @ [88:54] ==> @NotNull public open fun createWithExceptionHandling(@NotNull p0: LockBasedStorageManager.ExceptionHandlingStrategy): LockBasedStorageManager defined in org.jetbrains.kotlin.storage.LockBasedStorageManager[JavaMethodDescriptor]

'tracker' @ [88:82] ==> val tracker: ExceptionTracker defined in org.jetbrains.kotlin.context.GlobalContext[LocalVariableDescriptor]

'tracker' @ [88:92] ==> val tracker: ExceptionTracker defined in org.jetbrains.kotlin.context.GlobalContext[LocalVariableDescriptor]

'ProjectContextImpl' @ [91:56] ==> public constructor ProjectContextImpl(project: Project, globalContext: GlobalContext) defined in org.jetbrains.kotlin.context.ProjectContextImpl[ClassConstructorDescriptorImpl]

'project' @ [91:75] ==> value-parameter project: Project defined in org.jetbrains.kotlin.context.ProjectContext[ValueParameterDescriptorImpl]

'GlobalContext' @ [91:84] ==> public fun GlobalContext(): GlobalContextImpl defined in org.jetbrains.kotlin.context in file context.kt[SimpleFunctionDescriptorImpl]

'ModuleContextImpl' @ [93:9] ==> public constructor ModuleContextImpl(module: ModuleDescriptor, projectContext: ProjectContext) defined in org.jetbrains.kotlin.context.ModuleContextImpl[ClassConstructorDescriptorImpl]

'module' @ [93:27] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.context.ModuleContext[ValueParameterDescriptorImpl]

'ProjectContext' @ [93:35] ==> public fun ProjectContext(project: Project): ProjectContext defined in org.jetbrains.kotlin.context in file context.kt[SimpleFunctionDescriptorImpl]

'project' @ [93:50] ==> value-parameter project: Project defined in org.jetbrains.kotlin.context.ModuleContext[ValueParameterDescriptorImpl]

'ProjectContextImpl' @ [95:67] ==> public constructor ProjectContextImpl(project: Project, globalContext: GlobalContext) defined in org.jetbrains.kotlin.context.ProjectContextImpl[ClassConstructorDescriptorImpl]

'project' @ [95:86] ==> value-parameter project: Project defined in org.jetbrains.kotlin.context.withProject[ValueParameterDescriptorImpl]

'this' @ [95:95] ==> <this> defined in org.jetbrains.kotlin.context.withProject[ReceiverParameterDescriptorImpl]

'ModuleContextImpl' @ [96:74] ==> public constructor ModuleContextImpl(module: ModuleDescriptor, projectContext: ProjectContext) defined in org.jetbrains.kotlin.context.ModuleContextImpl[ClassConstructorDescriptorImpl]

'module' @ [96:92] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.context.withModule[ValueParameterDescriptorImpl]

'this' @ [96:100] ==> <this> defined in org.jetbrains.kotlin.context.withModule[ReceiverParameterDescriptorImpl]

'ModuleDescriptorImpl' @ [104:18] ==> @JvmOverloads public constructor ModuleDescriptorImpl(moduleName: Name, storageManager: StorageManager, builtIns: KotlinBuiltIns, multiTargetPlatform: MultiTargetPlatform? = ..., capabilities: Map<ModuleDescriptor.Capability<*>, Any?> = ...) defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedClassConstructorDescriptor]

'moduleName' @ [104:39] ==> value-parameter moduleName: Name defined in org.jetbrains.kotlin.context.ContextForNewModule[ValueParameterDescriptorImpl]

'projectContext' @ [104:51] ==> value-parameter projectContext: ProjectContext defined in org.jetbrains.kotlin.context.ContextForNewModule[ValueParameterDescriptorImpl]

'storageManager' @ [104:66] ==> public abstract val storageManager: StorageManager defined in org.jetbrains.kotlin.context.ProjectContext[PropertyDescriptorImpl]

'builtIns' @ [104:82] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.context.ContextForNewModule[ValueParameterDescriptorImpl]

'multiTargetPlatform' @ [104:92] ==> value-parameter multiTargetPlatform: MultiTargetPlatform? defined in org.jetbrains.kotlin.context.ContextForNewModule[ValueParameterDescriptorImpl]

'MutableModuleContextImpl' @ [105:12] ==> public constructor MutableModuleContextImpl(module: ModuleDescriptorImpl, projectContext: ProjectContext) defined in org.jetbrains.kotlin.context.MutableModuleContextImpl[ClassConstructorDescriptorImpl]

'module' @ [105:37] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.context.ContextForNewModule[LocalVariableDescriptor]

'projectContext' @ [105:45] ==> value-parameter projectContext: ProjectContext defined in org.jetbrains.kotlin.context.ContextForNewModule[ValueParameterDescriptorImpl]

