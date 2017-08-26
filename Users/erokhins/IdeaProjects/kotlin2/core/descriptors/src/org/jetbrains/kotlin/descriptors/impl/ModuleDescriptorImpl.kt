'JvmOverloads' @ [31:28] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'emptyMap' @ [37:67] ==> public fun <K, V> emptyMap(): Map<ModuleDescriptor.Capability<*>, Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Capability<*>
    <V> -> Any?

'DeclarationDescriptorImpl' @ [38:5] ==> public constructor DeclarationDescriptorImpl(@NotNull annotations: Annotations, @NotNull name: Name) defined in org.jetbrains.kotlin.descriptors.impl.DeclarationDescriptorImpl[JavaClassConstructorDescriptor]

'EMPTY' @ [38:43] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[PropertyDescriptorImpl]

'moduleName' @ [38:50] ==> value-parameter moduleName: Name defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.<init>[ValueParameterDescriptorImpl]

'!' @ [40:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'moduleName' @ [40:14] ==> value-parameter moduleName: Name defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.<init>[ValueParameterDescriptorImpl]

'isSpecial' @ [40:25] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'IllegalArgumentException' @ [41:19] ==> public constructor IllegalArgumentException(p0: (String..String?)) defined in java.lang.IllegalArgumentException[JavaClassConstructorDescriptor]

'moduleName' @ [41:75] ==> value-parameter moduleName: Name defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.<init>[ValueParameterDescriptorImpl]

'capabilities' @ [45:32] ==> value-parameter capabilities: Map<ModuleDescriptor.Capability<*>, Any?> = ... defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.<init>[ValueParameterDescriptorImpl]

'multiTargetPlatform' @ [45:48] ==> value-parameter multiTargetPlatform: MultiTargetPlatform? = ... defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.<init>[ValueParameterDescriptorImpl]

'let' @ [45:69] ==> @InlineOnly public inline fun <T, R> MultiTargetPlatform.let(block: (MultiTargetPlatform) -> Map<ModuleDescriptor.Capability<MultiTargetPlatform>, MultiTargetPlatform>): Map<ModuleDescriptor.Capability<MultiTargetPlatform>, MultiTargetPlatform> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MultiTargetPlatform
    <R> -> Map<Capability<MultiTargetPlatform>, MultiTargetPlatform>

'mapOf' @ [45:75] ==> public fun <K, V> mapOf(pair: Pair<ModuleDescriptor.Capability<MultiTargetPlatform>, MultiTargetPlatform>): Map<ModuleDescriptor.Capability<MultiTargetPlatform>, MultiTargetPlatform> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Capability<MultiTargetPlatform>
    <V> -> MultiTargetPlatform

'MultiTargetPlatform' @ [45:81] ==> public companion object defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[FakeCallableDescriptorForObject]

'CAPABILITY' @ [45:101] ==> @JvmField public final val CAPABILITY: ModuleDescriptor.Capability<MultiTargetPlatform> defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform.Companion[PropertyDescriptorImpl]

'it' @ [45:115] ==> value-parameter it: MultiTargetPlatform defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.capabilities.<anonymous>[ValueParameterDescriptorImpl]

'emptyMap' @ [45:124] ==> public fun <K, V> emptyMap(): Map<ModuleDescriptor.Capability<out Any?>, Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Capability<out Any?>
    <V> -> Any?

'field' @ [52:13] ==> var field: Boolean defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.<set-isValid>[SyntheticFieldDescriptor]

'value' @ [52:21] ==> value-parameter value: Boolean defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.<set-isValid>[ValueParameterDescriptorImpl]

'!' @ [56:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isValid' @ [56:14] ==> public open var isValid: Boolean defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[PropertyDescriptorImpl]

'IllegalStateException' @ [57:19] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'this' @ [57:79] ==> <this> defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[LazyClassReceiverParameterDescriptor]

'storageManager' @ [61:28] ==> private final val storageManager: StorageManager defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[PropertyDescriptorImpl]

'createMemoizedFunction' @ [61:43] ==> public abstract fun <K, V : Any> createMemoizedFunction(compute: (FqName) -> PackageViewDescriptor): MemoizedFunctionToNotNull<FqName, PackageViewDescriptor> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FqName
    <V : Any> -> PackageViewDescriptor

'LazyPackageViewDescriptorImpl' @ [62:27] ==> public constructor LazyPackageViewDescriptorImpl(module: ModuleDescriptorImpl, fqName: FqName, storageManager: StorageManager) defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl[ClassConstructorDescriptorImpl]

'this' @ [62:57] ==> <this> defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[LazyClassReceiverParameterDescriptor]

'fqName' @ [62:63] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.packages.<anonymous>[ValueParameterDescriptorImpl]

'storageManager' @ [62:71] ==> private final val storageManager: StorageManager defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[PropertyDescriptorImpl]

'Deprecated' @ [65:5] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'this' @ [66:74] ==> <this> defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[LazyClassReceiverParameterDescriptor]

'dependencies' @ [66:79] ==> private final var dependencies: ModuleDependencies? defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[PropertyDescriptorImpl]

'allDependencies' @ [66:94] ==> public abstract val allDependencies: List<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.descriptors.impl.ModuleDependencies[PropertyDescriptorImpl]

'this' @ [69:17] ==> <this> defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[LazyClassReceiverParameterDescriptor]

'dependencies' @ [69:22] ==> private final var dependencies: ModuleDependencies? defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[PropertyDescriptorImpl]

'sure' @ [69:35] ==> public inline fun <T : Any> ModuleDependencies?.sure(message: () -> String): ModuleDependencies defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ModuleDependencies

'id' @ [69:67] ==> private final val id: String defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[PropertyDescriptorImpl]

'allDependencies' @ [69:86] ==> public abstract val allDependencies: List<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.descriptors.impl.ModuleDependencies[PropertyDescriptorImpl]

'filter' @ [69:102] ==> public inline fun <T> Iterable<ModuleDescriptorImpl>.filter(predicate: (ModuleDescriptorImpl) -> Boolean): List<ModuleDescriptorImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleDescriptorImpl

'it' @ [69:111] ==> value-parameter it: ModuleDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.<get-allDependencyModules>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [69:117] ==> <this> defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[LazyClassReceiverParameterDescriptor]

'this' @ [72:17] ==> <this> defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[LazyClassReceiverParameterDescriptor]

'dependencies' @ [72:22] ==> private final var dependencies: ModuleDependencies? defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[PropertyDescriptorImpl]

'sure' @ [72:35] ==> public inline fun <T : Any> ModuleDependencies?.sure(message: () -> String): ModuleDependencies defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ModuleDependencies

'id' @ [72:67] ==> private final val id: String defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[PropertyDescriptorImpl]

'allImplementingModules' @ [72:86] ==> public abstract val allImplementingModules: Set<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.descriptors.impl.ModuleDependencies[PropertyDescriptorImpl]

'assertValid' @ [75:9] ==> public open fun assertValid(): Unit defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[SimpleFunctionDescriptorImpl]

'invoke' @ [76:16] ==> public abstract fun invoke(p1: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNotNull[FunctionInvokeDescriptor]

'fqName' @ [76:25] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.getPackage[ValueParameterDescriptorImpl]

'assertValid' @ [80:9] ==> public open fun assertValid(): Unit defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[SimpleFunctionDescriptorImpl]

'packageFragmentProvider' @ [81:16] ==> public final val packageFragmentProvider: PackageFragmentProvider defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[PropertyDescriptorImpl]

'getSubPackagesOf' @ [81:40] ==> public abstract fun getSubPackagesOf(fqName: FqName, nameFilter: (Name) -> Boolean): Collection<FqName> defined in org.jetbrains.kotlin.descriptors.PackageFragmentProvider[SimpleFunctionDescriptorImpl]

'fqName' @ [81:57] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.getSubPackagesOf[ValueParameterDescriptorImpl]

'nameFilter' @ [81:65] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.getSubPackagesOf[ValueParameterDescriptorImpl]

'getValue' @ [84:74] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'dependencies' @ [85:34] ==> private final var dependencies: ModuleDependencies? defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[PropertyDescriptorImpl]

'sure' @ [85:47] ==> public inline fun <T : Any> ModuleDependencies?.sure(message: () -> String): ModuleDependencies defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ModuleDependencies

'id' @ [85:79] ==> private final val id: String defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[PropertyDescriptorImpl]

'moduleDependencies' @ [86:39] ==> val moduleDependencies: ModuleDependencies defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.packageFragmentProviderForWholeModuleWithDependencies.<anonymous>[LocalVariableDescriptor]

'allDependencies' @ [86:58] ==> public abstract val allDependencies: List<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.descriptors.impl.ModuleDependencies[PropertyDescriptorImpl]

'assert' @ [87:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'this' @ [87:16] ==> <this> defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[LazyClassReceiverParameterDescriptor]

'dependenciesDescriptors' @ [87:24] ==> val dependenciesDescriptors: List<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.packageFragmentProviderForWholeModuleWithDependencies.<anonymous>[LocalVariableDescriptor]

'id' @ [87:60] ==> private final val id: String defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[PropertyDescriptorImpl]

'dependenciesDescriptors' @ [88:9] ==> val dependenciesDescriptors: List<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.packageFragmentProviderForWholeModuleWithDependencies.<anonymous>[LocalVariableDescriptor]

'forEach' @ [88:33] ==> @HidesMembers public inline fun <T> Iterable<ModuleDescriptorImpl>.forEach(action: (ModuleDescriptorImpl) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleDescriptorImpl

'assert' @ [90:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'dependency' @ [90:20] ==> value-parameter dependency: ModuleDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.packageFragmentProviderForWholeModuleWithDependencies.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isInitialized' @ [90:31] ==> private final val isInitialized: Boolean defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[PropertyDescriptorImpl]

'dependency' @ [91:38] ==> value-parameter dependency: ModuleDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.packageFragmentProviderForWholeModuleWithDependencies.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [91:49] ==> private final val id: String defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[PropertyDescriptorImpl]

'this' @ [91:116] ==> <this> defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[LazyClassReceiverParameterDescriptor]

'id' @ [91:121] ==> private final val id: String defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[PropertyDescriptorImpl]

'CompositePackageFragmentProvider' @ [94:9] ==> public constructor CompositePackageFragmentProvider(providers: List<PackageFragmentProvider>) defined in org.jetbrains.kotlin.descriptors.impl.CompositePackageFragmentProvider[ClassConstructorDescriptorImpl]

'dependenciesDescriptors' @ [94:42] ==> val dependenciesDescriptors: List<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.packageFragmentProviderForWholeModuleWithDependencies.<anonymous>[LocalVariableDescriptor]

'map' @ [94:66] ==> public inline fun <T, R> Iterable<ModuleDescriptorImpl>.map(transform: (ModuleDescriptorImpl) -> PackageFragmentProvider): List<PackageFragmentProvider> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleDescriptorImpl
    <R> -> PackageFragmentProvider

'it' @ [95:13] ==> value-parameter it: ModuleDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.packageFragmentProviderForWholeModuleWithDependencies.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'packageFragmentProviderForModuleContent' @ [95:16] ==> private final var packageFragmentProviderForModuleContent: PackageFragmentProvider? defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[PropertyDescriptorImpl]

'packageFragmentProviderForModuleContent' @ [100:17] ==> private final var packageFragmentProviderForModuleContent: PackageFragmentProvider? defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[PropertyDescriptorImpl]

'assert' @ [103:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'this' @ [103:16] ==> <this> defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[LazyClassReceiverParameterDescriptor]

'dependencies' @ [103:21] ==> private final var dependencies: ModuleDependencies? defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[PropertyDescriptorImpl]

'id' @ [103:63] ==> private final val id: String defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[PropertyDescriptorImpl]

'this' @ [104:9] ==> <this> defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[LazyClassReceiverParameterDescriptor]

'dependencies' @ [104:14] ==> private final var dependencies: ModuleDependencies? defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[PropertyDescriptorImpl]

'dependencies' @ [104:29] ==> value-parameter dependencies: ModuleDependencies defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.setDependencies[ValueParameterDescriptorImpl]

'setDependencies' @ [108:9] ==> public final fun setDependencies(descriptors: List<ModuleDescriptorImpl>): Unit defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[SimpleFunctionDescriptorImpl]

'descriptors' @ [108:25] ==> value-parameter vararg descriptors: ModuleDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.setDependencies[ValueParameterDescriptorImpl]

'toList' @ [108:37] ==> public fun <T> Array<out ModuleDescriptorImpl>.toList(): List<ModuleDescriptorImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleDescriptorImpl

'setDependencies' @ [112:9] ==> public final fun setDependencies(dependencies: ModuleDependencies): Unit defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[SimpleFunctionDescriptorImpl]

'ModuleDependenciesImpl' @ [112:25] ==> public constructor ModuleDependenciesImpl(allDependencies: List<ModuleDescriptorImpl>, modulesWhoseInternalsAreVisible: Set<ModuleDescriptorImpl>) defined in org.jetbrains.kotlin.descriptors.impl.ModuleDependenciesImpl[ClassConstructorDescriptorImpl]

'descriptors' @ [112:48] ==> value-parameter descriptors: List<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.setDependencies[ValueParameterDescriptorImpl]

'emptySet' @ [112:61] ==> public fun <T> emptySet(): Set<ModuleDescriptorImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleDescriptorImpl

'setDependencies' @ [116:9] ==> public final fun setDependencies(dependencies: ModuleDependencies): Unit defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[SimpleFunctionDescriptorImpl]

'ModuleDependenciesImpl' @ [116:25] ==> public constructor ModuleDependenciesImpl(allDependencies: List<ModuleDescriptorImpl>, modulesWhoseInternalsAreVisible: Set<ModuleDescriptorImpl>) defined in org.jetbrains.kotlin.descriptors.impl.ModuleDependenciesImpl[ClassConstructorDescriptorImpl]

'descriptors' @ [116:48] ==> value-parameter descriptors: List<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.setDependencies[ValueParameterDescriptorImpl]

'friends' @ [116:61] ==> value-parameter friends: Set<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.setDependencies[ValueParameterDescriptorImpl]

'this' @ [120:16] ==> <this> defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[LazyClassReceiverParameterDescriptor]

'targetModule' @ [120:24] ==> value-parameter targetModule: ModuleDescriptor defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.shouldSeeInternalsOf[ValueParameterDescriptorImpl]

'targetModule' @ [120:40] ==> value-parameter targetModule: ModuleDescriptor defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.shouldSeeInternalsOf[ValueParameterDescriptorImpl]

'dependencies' @ [120:56] ==> private final var dependencies: ModuleDependencies? defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[PropertyDescriptorImpl]

'modulesWhoseInternalsAreVisible' @ [120:71] ==> public abstract val modulesWhoseInternalsAreVisible: Set<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.descriptors.impl.ModuleDependencies[PropertyDescriptorImpl]

'name' @ [124:17] ==> public final val ModuleDescriptorImpl.name: Name[MyPropertyDescriptor]

'toString' @ [124:22] ==> @Override public open fun toString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'assert' @ [130:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [130:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInitialized' @ [130:17] ==> private final val isInitialized: Boolean defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[PropertyDescriptorImpl]

'id' @ [130:65] ==> private final val id: String defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[PropertyDescriptorImpl]

'this' @ [131:9] ==> <this> defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[LazyClassReceiverParameterDescriptor]

'packageFragmentProviderForModuleContent' @ [131:14] ==> private final var packageFragmentProviderForModuleContent: PackageFragmentProvider? defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[PropertyDescriptorImpl]

'providerForModuleContent' @ [131:56] ==> value-parameter providerForModuleContent: PackageFragmentProvider defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.initialize[ValueParameterDescriptorImpl]

'assertValid' @ [136:13] ==> public open fun assertValid(): Unit defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[SimpleFunctionDescriptorImpl]

'packageFragmentProviderForWholeModuleWithDependencies' @ [137:20] ==> private final val packageFragmentProviderForWholeModuleWithDependencies: CompositePackageFragmentProvider defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[PropertyDescriptorImpl]

'Suppress' @ [140:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'capabilities' @ [141:82] ==> private final val capabilities: Map<ModuleDescriptor.Capability<out Any?>, Any?> defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[PropertyDescriptorImpl]

'capability' @ [141:95] ==> value-parameter capability: ModuleDescriptor.Capability<T> defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl.getCapability[ValueParameterDescriptorImpl]

'emptySet' @ [154:70] ==> public fun <T> emptySet(): Set<ModuleDescriptorImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleDescriptorImpl

