'storageManager' @ [31:105] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [33:9] ==> private final val storageManager: StorageManager defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager[PropertyDescriptorImpl]

'createMemoizedFunction' @ [33:24] ==> public abstract fun <K, V : Any> createMemoizedFunction(compute: (K) -> V, map: ConcurrentMap<K, Any>): MemoizedFunctionToNotNull<K, V> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> K
    <V : Any> -> V

'compute' @ [33:53] ==> value-parameter compute: (K) -> V defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.createSoftlyRetainedMemoizedFunction[ValueParameterDescriptorImpl]

'createConcurrentSoftValueMap' @ [33:76] ==> @NotNull @Contract public open fun <K : (Any..Any?), V : (Any..Any?)> createConcurrentSoftValueMap(): ConcurrentMap<(K..K?), (Any..Any?)> defined in com.intellij.util.containers.ContainerUtil[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> Any

'storageManager' @ [36:9] ==> private final val storageManager: StorageManager defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager[PropertyDescriptorImpl]

'createMemoizedFunctionWithNullableValues' @ [36:24] ==> public abstract fun <K, V : Any> createMemoizedFunctionWithNullableValues(compute: (K) -> V, map: ConcurrentMap<K, Any>): MemoizedFunctionToNullable<K, V> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> K
    <V : Any> -> V

'compute' @ [36:71] ==> value-parameter compute: (K) -> V defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.createSoftlyRetainedMemoizedFunctionWithNullableValues[ValueParameterDescriptorImpl]

'createConcurrentSoftValueMap' @ [36:94] ==> @NotNull @Contract public open fun <K : (Any..Any?), V : (Any..Any?)> createConcurrentSoftValueMap(): ConcurrentMap<(K..K?), (Any..Any?)> defined in com.intellij.util.containers.ContainerUtil[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> Any

'LockProtectedTrace' @ [39:13] ==> public constructor LockProtectedTrace(storageManager: StorageManager, trace: BindingTrace) defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace[ClassConstructorDescriptorImpl]

'storageManager' @ [39:32] ==> private final val storageManager: StorageManager defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager[PropertyDescriptorImpl]

'originalTrace' @ [39:48] ==> value-parameter originalTrace: BindingTrace defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.createSafeTrace[ValueParameterDescriptorImpl]

'storageManager' @ [42:71] ==> private final val storageManager: StorageManager defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedContext[PropertyDescriptorImpl]

'compute' @ [42:86] ==> public abstract fun <T> compute(computable: () -> KotlinType?): KotlinType? defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType?

'context' @ [42:96] ==> private final val context: BindingContext defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedContext[PropertyDescriptorImpl]

'getType' @ [42:104] ==> @Nullable public abstract fun getType(@NotNull expression: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'expression' @ [42:112] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedContext.getType[ValueParameterDescriptorImpl]

'storageManager' @ [44:54] ==> private final val storageManager: StorageManager defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedContext[PropertyDescriptorImpl]

'compute' @ [44:69] ==> public abstract fun <T> compute(computable: () -> Diagnostics): Diagnostics defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostics

'context' @ [44:79] ==> private final val context: BindingContext defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedContext[PropertyDescriptorImpl]

'diagnostics' @ [44:87] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'storageManager' @ [46:71] ==> private final val storageManager: StorageManager defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedContext[PropertyDescriptorImpl]

'compute' @ [46:86] ==> public abstract fun <T> compute(computable: () -> V?): V? defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> V?

'context' @ [46:96] ==> private final val context: BindingContext defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedContext[PropertyDescriptorImpl]

'get' @ [46:104] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(K..K?), (V..V?)>..ReadOnlySlice<(K..K?), (V..V?)>?), key: (K..K?)): V? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> V

'slice' @ [46:114] ==> value-parameter slice: ReadOnlySlice<K, V> defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedContext.get[ValueParameterDescriptorImpl]

'key' @ [46:121] ==> value-parameter key: K defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedContext.get[ValueParameterDescriptorImpl]

'storageManager' @ [48:67] ==> private final val storageManager: StorageManager defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedContext[PropertyDescriptorImpl]

'compute' @ [48:82] ==> public abstract fun <T> compute(computable: () -> Collection<(K..K?)>): Collection<(K..K?)> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<(K..K?)>

'context' @ [48:92] ==> private final val context: BindingContext defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedContext[PropertyDescriptorImpl]

'getKeys' @ [48:100] ==> @NotNull @ReadOnly public abstract fun <K : (Any..Any?), V : (Any..Any?)> getKeys(slice: (WritableSlice<(K..K?), (V..V?)>..WritableSlice<(K..K?), (V..V?)>?)): Collection<(K..K?)> defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> V

'slice' @ [48:114] ==> value-parameter slice: WritableSlice<K, V> defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedContext.getKeys[ValueParameterDescriptorImpl]

'storageManager' @ [51:13] ==> private final val storageManager: StorageManager defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedContext[PropertyDescriptorImpl]

'compute' @ [51:28] ==> public abstract fun <T> compute(computable: () -> Unit): Unit defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'context' @ [51:38] ==> private final val context: BindingContext defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedContext[PropertyDescriptorImpl]

'addOwnDataTo' @ [51:46] ==> public abstract fun addOwnDataTo(@NotNull trace: BindingTrace, commitDiagnostics: Boolean): Unit defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'trace' @ [51:59] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedContext.addOwnDataTo[ValueParameterDescriptorImpl]

'commitDiagnostics' @ [51:66] ==> value-parameter commitDiagnostics: Boolean defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedContext.addOwnDataTo[ValueParameterDescriptorImpl]

'TestOnly' @ [54:9] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'storageManager' @ [55:76] ==> private final val storageManager: StorageManager defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedContext[PropertyDescriptorImpl]

'compute' @ [55:91] ==> public abstract fun <T> compute(computable: () -> ImmutableMap<(K..K?), (V..V?)>): ImmutableMap<(K..K?), (V..V?)> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImmutableMap<(K..K?), (V..V?)>

'context' @ [55:101] ==> private final val context: BindingContext defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedContext[PropertyDescriptorImpl]

'getSliceContents' @ [55:109] ==> @TestOnly @NotNull public abstract fun <K : (Any..Any?), V : (Any..Any?)> getSliceContents(@NotNull slice: ReadOnlySlice<(K..K?), (V..V?)>): ImmutableMap<(K..K?), (V..V?)> defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> V

'slice' @ [55:132] ==> value-parameter slice: ReadOnlySlice<K, V> defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedContext.getSliceContents[ValueParameterDescriptorImpl]

'storageManager' @ [60:13] ==> private final val storageManager: StorageManager defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace[PropertyDescriptorImpl]

'compute' @ [60:28] ==> public abstract fun <T> compute(computable: () -> Unit): Unit defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'trace' @ [60:38] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace[PropertyDescriptorImpl]

'recordType' @ [60:44] ==> public abstract fun recordType(@NotNull expression: KtExpression, @Nullable type: KotlinType?): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'expression' @ [60:55] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace.recordType[ValueParameterDescriptorImpl]

'type' @ [60:67] ==> value-parameter type: KotlinType? defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace.recordType[ValueParameterDescriptorImpl]

'storageManager' @ [63:71] ==> private final val storageManager: StorageManager defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace[PropertyDescriptorImpl]

'compute' @ [63:86] ==> public abstract fun <T> compute(computable: () -> KotlinType?): KotlinType? defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType?

'trace' @ [63:96] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace[PropertyDescriptorImpl]

'getType' @ [63:102] ==> @Nullable public abstract fun getType(@NotNull expression: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'expression' @ [63:110] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace.getType[ValueParameterDescriptorImpl]

'LockProtectedContext' @ [65:47] ==> public constructor LockProtectedContext(storageManager: StorageManager, context: BindingContext) defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedContext[ClassConstructorDescriptorImpl]

'storageManager' @ [65:68] ==> private final val storageManager: StorageManager defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace[PropertyDescriptorImpl]

'trace' @ [65:84] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace[PropertyDescriptorImpl]

'bindingContext' @ [65:90] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'context' @ [67:44] ==> private final val context: BindingContext defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace[PropertyDescriptorImpl]

'storageManager' @ [70:13] ==> private final val storageManager: StorageManager defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace[PropertyDescriptorImpl]

'compute' @ [70:28] ==> public abstract fun <T> compute(computable: () -> Unit): Unit defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'trace' @ [70:38] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace[PropertyDescriptorImpl]

'record' @ [70:44] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(K..K?), (V..V?)>..WritableSlice<(K..K?), (V..V?)>?), key: (K..K?), value: (V..V?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> V

'slice' @ [70:57] ==> value-parameter slice: WritableSlice<K, V> defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace.record[ValueParameterDescriptorImpl]

'key' @ [70:64] ==> value-parameter key: K defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace.record[ValueParameterDescriptorImpl]

'value' @ [70:69] ==> value-parameter value: V defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace.record[ValueParameterDescriptorImpl]

'storageManager' @ [74:13] ==> private final val storageManager: StorageManager defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace[PropertyDescriptorImpl]

'compute' @ [74:28] ==> public abstract fun <T> compute(computable: () -> Unit): Unit defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'trace' @ [74:38] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace[PropertyDescriptorImpl]

'record' @ [74:44] ==> public abstract fun <K : (Any..Any?)> record(slice: (WritableSlice<(K..K?), (Boolean..Boolean?)>..WritableSlice<(K..K?), (Boolean..Boolean?)>?), key: (K..K?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K

'slice' @ [74:54] ==> value-parameter slice: WritableSlice<K, Boolean> defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace.record[ValueParameterDescriptorImpl]

'key' @ [74:61] ==> value-parameter key: K defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace.record[ValueParameterDescriptorImpl]

'storageManager' @ [77:75] ==> private final val storageManager: StorageManager defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace[PropertyDescriptorImpl]

'compute' @ [77:90] ==> public abstract fun <T> compute(computable: () -> V?): V? defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> V?

'trace' @ [77:100] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace[PropertyDescriptorImpl]

'get' @ [77:106] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(K..K?), (V..V?)>..ReadOnlySlice<(K..K?), (V..V?)>?), key: (K..K?)): V? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> V

'slice' @ [77:116] ==> value-parameter slice: ReadOnlySlice<K, V> defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace.get[ValueParameterDescriptorImpl]

'key' @ [77:123] ==> value-parameter key: K defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace.get[ValueParameterDescriptorImpl]

'storageManager' @ [79:82] ==> private final val storageManager: StorageManager defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace[PropertyDescriptorImpl]

'compute' @ [79:97] ==> public abstract fun <T> compute(computable: () -> (MutableCollection<(K..K?)>..Collection<(K..K?)>)): (MutableCollection<(K..K?)>..Collection<(K..K?)>) defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.MutableCollection<(K..K?)>..kotlin.collections.Collection<(K..K?)>)

'trace' @ [79:107] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace[PropertyDescriptorImpl]

'getKeys' @ [79:113] ==> @NotNull public abstract fun <K : (Any..Any?), V : (Any..Any?)> getKeys(slice: (WritableSlice<(K..K?), (V..V?)>..WritableSlice<(K..K?), (V..V?)>?)): (MutableCollection<(K..K?)>..Collection<(K..K?)>) defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> V

'slice' @ [79:127] ==> value-parameter slice: WritableSlice<K, V> defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace.getKeys[ValueParameterDescriptorImpl]

'storageManager' @ [82:13] ==> private final val storageManager: StorageManager defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace[PropertyDescriptorImpl]

'compute' @ [82:28] ==> public abstract fun <T> compute(computable: () -> Unit): Unit defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'trace' @ [82:38] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace[PropertyDescriptorImpl]

'report' @ [82:44] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'diagnostic' @ [82:51] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace.report[ValueParameterDescriptorImpl]

'trace' @ [85:43] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.storage.LockBasedLazyResolveStorageManager.LockProtectedTrace[PropertyDescriptorImpl]

'wantsDiagnostics' @ [85:49] ==> public abstract fun wantsDiagnostics(): Boolean defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

