'delegates' @ [34:16] ==> private final val delegates: LinkedHashSet<BindingContext> defined in org.jetbrains.kotlin.resolve.CompositeBindingContext[PropertyDescriptorImpl]

'asSequence' @ [34:26] ==> public fun <T> Iterable<BindingContext>.asSequence(): Sequence<BindingContext> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BindingContext

'map' @ [34:39] ==> public fun <T, R> Sequence<BindingContext>.map(transform: (BindingContext) -> KotlinType?): Sequence<KotlinType?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BindingContext
    <R> -> KotlinType?

'it' @ [34:45] ==> value-parameter it: BindingContext defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.getType.<anonymous>[ValueParameterDescriptorImpl]

'getType' @ [34:48] ==> @Nullable public abstract fun getType(@NotNull expression: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'expression' @ [34:56] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.getType[ValueParameterDescriptorImpl]

'firstOrNull' @ [34:70] ==> public inline fun <T> Sequence<KotlinType?>.firstOrNull(predicate: (KotlinType?) -> Boolean): KotlinType? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType?

'it' @ [34:84] ==> value-parameter it: KotlinType? defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.getType.<anonymous>[ValueParameterDescriptorImpl]

'delegates' @ [39:17] ==> value-parameter delegates: List<BindingContext> defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.Companion.create[ValueParameterDescriptorImpl]

'isEmpty' @ [39:27] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'EMPTY' @ [39:60] ==> public final val EMPTY: (BindingContext..BindingContext?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'LinkedHashSet' @ [40:32] ==> public constructor LinkedHashSet<E : (Any..Any?)>(p0: (MutableCollection<out (BindingContext..BindingContext?)>..Collection<(BindingContext..BindingContext?)>?)) defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (org.jetbrains.kotlin.resolve.BindingContext..org.jetbrains.kotlin.resolve.BindingContext?)

'delegates' @ [40:46] ==> value-parameter delegates: List<BindingContext> defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.Companion.create[ValueParameterDescriptorImpl]

'delegatesSet' @ [41:17] ==> val delegatesSet: LinkedHashSet<(BindingContext..BindingContext?)> defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.Companion.create[LocalVariableDescriptor]

'size' @ [41:30] ==> public open val size: Int defined in java.util.LinkedHashSet[JavaPropertyDescriptor]

'delegates' @ [41:48] ==> value-parameter delegates: List<BindingContext> defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.Companion.create[ValueParameterDescriptorImpl]

'first' @ [41:58] ==> public fun <T> List<BindingContext>.first(): BindingContext defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BindingContext

'CompositeBindingContext' @ [42:20] ==> private constructor CompositeBindingContext(delegates: LinkedHashSet<BindingContext>) defined in org.jetbrains.kotlin.resolve.CompositeBindingContext[ClassConstructorDescriptorImpl]

'delegatesSet' @ [42:44] ==> val delegatesSet: LinkedHashSet<(BindingContext..BindingContext?)> defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.Companion.create[LocalVariableDescriptor]

'delegates' @ [47:16] ==> private final val delegates: LinkedHashSet<BindingContext> defined in org.jetbrains.kotlin.resolve.CompositeBindingContext[PropertyDescriptorImpl]

'asSequence' @ [47:26] ==> public fun <T> Iterable<BindingContext>.asSequence(): Sequence<BindingContext> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BindingContext

'map' @ [47:39] ==> public fun <T, R> Sequence<BindingContext>.map(transform: (BindingContext) -> V?): Sequence<V?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BindingContext
    <R> -> V?

'it' @ [47:45] ==> value-parameter it: BindingContext defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.get.<anonymous>[ValueParameterDescriptorImpl]

'slice' @ [47:48] ==> value-parameter slice: ReadOnlySlice<K, V>? defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.get[ValueParameterDescriptorImpl]

'key' @ [47:55] ==> value-parameter key: K? defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.get[ValueParameterDescriptorImpl]

'firstOrNull' @ [47:62] ==> public inline fun <T> Sequence<V?>.firstOrNull(predicate: (V?) -> Boolean): V? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> V?

'it' @ [47:76] ==> value-parameter it: V? defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.get.<anonymous>[ValueParameterDescriptorImpl]

'delegates' @ [51:16] ==> private final val delegates: LinkedHashSet<BindingContext> defined in org.jetbrains.kotlin.resolve.CompositeBindingContext[PropertyDescriptorImpl]

'flatMap' @ [51:26] ==> public inline fun <T, R> Iterable<BindingContext>.flatMap(transform: (BindingContext) -> Iterable<(K..K?)>): List<(K..K?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BindingContext
    <R> -> (K..K?)

'it' @ [51:36] ==> value-parameter it: BindingContext defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.getKeys.<anonymous>[ValueParameterDescriptorImpl]

'getKeys' @ [51:39] ==> @NotNull @ReadOnly public abstract fun <K : (Any..Any?), V : (Any..Any?)> getKeys(slice: (WritableSlice<(K..K?), (V..V?)>..WritableSlice<(K..K?), (V..V?)>?)): Collection<(K..K?)> defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (K..K?)
    <V : (Any..Any?)> -> (V..V?)

'slice' @ [51:47] ==> value-parameter slice: WritableSlice<K, V>? defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.getKeys[ValueParameterDescriptorImpl]

'hashMapOf' @ [56:19] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<K, V> /* = HashMap<K, V> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> K
    <V> -> V

'delegates' @ [57:9] ==> private final val delegates: LinkedHashSet<BindingContext> defined in org.jetbrains.kotlin.resolve.CompositeBindingContext[PropertyDescriptorImpl]

'forEach' @ [57:19] ==> @HidesMembers public inline fun <T> Iterable<BindingContext>.forEach(action: (BindingContext) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BindingContext

'map' @ [57:29] ==> val map: HashMap<K, V> /* = HashMap<K, V> */ defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.getSliceContents[LocalVariableDescriptor]

'putAll' @ [57:33] ==> public open fun putAll(from: Map<out K, V>): Unit defined in java.util.HashMap[JavaMethodDescriptor]

'it' @ [57:40] ==> value-parameter it: BindingContext defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.getSliceContents.<anonymous>[ValueParameterDescriptorImpl]

'getSliceContents' @ [57:43] ==> @TestOnly @NotNull public abstract fun <K : (Any..Any?), V : (Any..Any?)> getSliceContents(@NotNull slice: ReadOnlySlice<(K..K?), (V..V?)>): ImmutableMap<(K..K?), (V..V?)> defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (K..K?)
    <V : (Any..Any?)> -> (V..V?)

'slice' @ [57:60] ==> value-parameter slice: ReadOnlySlice<K, V> defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.getSliceContents[ValueParameterDescriptorImpl]

'builder' @ [58:29] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> builder(): (ImmutableMap.Builder<(K..K?), (V..V?)>..ImmutableMap.Builder<(K..K?), (V..V?)>?) defined in com.google.common.collect.ImmutableMap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> V

'putAll' @ [58:45] ==> @CanIgnoreReturnValue public open fun putAll(p0: (MutableMap<out (K..K?), out (V..V?)>..Map<out (K..K?), (V..V?)>?)): (ImmutableMap.Builder<(K..K?), (V..V?)>..ImmutableMap.Builder<(K..K?), (V..V?)>?) defined in com.google.common.collect.ImmutableMap.Builder[JavaMethodDescriptor]

'map' @ [58:52] ==> val map: HashMap<K, V> /* = HashMap<K, V> */ defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.getSliceContents[LocalVariableDescriptor]

'build' @ [58:57] ==> public open fun build(): (ImmutableMap<(K..K?), (V..V?)>..ImmutableMap<(K..K?), (V..V?)>?) defined in com.google.common.collect.ImmutableMap.Builder[JavaMethodDescriptor]

'CompositeDiagnostics' @ [62:16] ==> public constructor CompositeDiagnostics(delegates: List<Diagnostics>) defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.CompositeDiagnostics[ClassConstructorDescriptorImpl]

'delegates' @ [62:37] ==> private final val delegates: LinkedHashSet<BindingContext> defined in org.jetbrains.kotlin.resolve.CompositeBindingContext[PropertyDescriptorImpl]

'map' @ [62:47] ==> public inline fun <T, R> Iterable<BindingContext>.map(transform: (BindingContext) -> Diagnostics): List<Diagnostics> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BindingContext
    <R> -> Diagnostics

'it' @ [62:53] ==> value-parameter it: BindingContext defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.getDiagnostics.<anonymous>[ValueParameterDescriptorImpl]

'diagnostics' @ [62:56] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'delegates' @ [74:20] ==> private final val delegates: List<Diagnostics> defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.CompositeDiagnostics[PropertyDescriptorImpl]

'fold' @ [74:30] ==> public inline fun <T, R> Iterable<Diagnostics>.fold(initial: Sequence<Diagnostic>, operation: (acc: Sequence<Diagnostic>, Diagnostics) -> Sequence<Diagnostic>): Sequence<Diagnostic> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostics
    <R> -> Sequence<Diagnostic>

'emptySequence' @ [74:35] ==> public fun <T> emptySequence(): Sequence<Diagnostic> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'r' @ [74:74] ==> value-parameter r: Sequence<Diagnostic> defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.CompositeDiagnostics.iterator.<anonymous>[ValueParameterDescriptorImpl]

't' @ [74:78] ==> value-parameter t: Diagnostics defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.CompositeDiagnostics.iterator.<anonymous>[ValueParameterDescriptorImpl]

'asSequence' @ [74:80] ==> public fun <T> Iterable<Diagnostic>.asSequence(): Sequence<Diagnostic> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'iterator' @ [74:96] ==> public abstract operator fun iterator(): Iterator<Diagnostic> defined in kotlin.sequences.Sequence[DeserializedSimpleFunctionDescriptor]

'ModificationTracker' @ [77:44] ==> public fun ModificationTracker(function: () -> Long): ModificationTracker defined in com.intellij.openapi.util[SamConstructorDescriptorImpl]

'delegates' @ [78:13] ==> private final val delegates: List<Diagnostics> defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.CompositeDiagnostics[PropertyDescriptorImpl]

'fold' @ [78:23] ==> public inline fun <T, R> Iterable<Diagnostics>.fold(initial: Long, operation: (acc: Long, Diagnostics) -> Long): Long defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostics
    <R> -> Long

'r' @ [78:42] ==> value-parameter r: Long defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.CompositeDiagnostics.modificationTracker.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

't' @ [78:46] ==> value-parameter t: Diagnostics defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.CompositeDiagnostics.modificationTracker.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'modificationTracker' @ [78:48] ==> public open val modificationTracker: ModificationTracker defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[PropertyDescriptorImpl]

'modificationCount' @ [78:68] ==> public final val ModificationTracker.modificationCount: Long[MyPropertyDescriptor]

'delegates' @ [82:20] ==> private final val delegates: List<Diagnostics> defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.CompositeDiagnostics[PropertyDescriptorImpl]

'flatMap' @ [82:30] ==> public inline fun <T, R> Iterable<Diagnostics>.flatMap(transform: (Diagnostics) -> Iterable<Diagnostic>): List<Diagnostic> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostics
    <R> -> Diagnostic

'it' @ [82:40] ==> value-parameter it: Diagnostics defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.CompositeDiagnostics.all.<anonymous>[ValueParameterDescriptorImpl]

'all' @ [82:43] ==> public abstract fun all(): Collection<Diagnostic> defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[SimpleFunctionDescriptorImpl]

'delegates' @ [86:20] ==> private final val delegates: List<Diagnostics> defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.CompositeDiagnostics[PropertyDescriptorImpl]

'flatMap' @ [86:30] ==> public inline fun <T, R> Iterable<Diagnostics>.flatMap(transform: (Diagnostics) -> Iterable<Diagnostic>): List<Diagnostic> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostics
    <R> -> Diagnostic

'it' @ [86:40] ==> value-parameter it: Diagnostics defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.CompositeDiagnostics.forElement.<anonymous>[ValueParameterDescriptorImpl]

'forElement' @ [86:43] ==> public abstract fun forElement(psiElement: PsiElement): Collection<Diagnostic> defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[SimpleFunctionDescriptorImpl]

'psiElement' @ [86:54] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.CompositeDiagnostics.forElement[ValueParameterDescriptorImpl]

'delegates' @ [90:20] ==> private final val delegates: List<Diagnostics> defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.CompositeDiagnostics[PropertyDescriptorImpl]

'all' @ [90:30] ==> public inline fun <T> Iterable<Diagnostics>.all(predicate: (Diagnostics) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostics

'it' @ [90:36] ==> value-parameter it: Diagnostics defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.CompositeDiagnostics.isEmpty.<anonymous>[ValueParameterDescriptorImpl]

'isEmpty' @ [90:39] ==> public open fun isEmpty(): Boolean defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[SimpleFunctionDescriptorImpl]

'CompositeDiagnostics' @ [94:20] ==> public constructor CompositeDiagnostics(delegates: List<Diagnostics>) defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.CompositeDiagnostics[ClassConstructorDescriptorImpl]

'delegates' @ [94:41] ==> private final val delegates: List<Diagnostics> defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.CompositeDiagnostics[PropertyDescriptorImpl]

'map' @ [94:51] ==> public inline fun <T, R> Iterable<Diagnostics>.map(transform: (Diagnostics) -> Diagnostics): List<Diagnostics> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostics
    <R> -> Diagnostics

'it' @ [94:57] ==> value-parameter it: Diagnostics defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.CompositeDiagnostics.noSuppression.<anonymous>[ValueParameterDescriptorImpl]

'noSuppression' @ [94:60] ==> public abstract fun noSuppression(): Diagnostics defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[SimpleFunctionDescriptorImpl]

