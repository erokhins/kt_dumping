'BindingTraceFilter' @ [33:50] ==> public companion object defined in org.jetbrains.kotlin.resolve.BindingTraceFilter[FakeCallableDescriptorForObject]

'ACCEPT_ALL' @ [33:69] ==> public final val ACCEPT_ALL: BindingTraceFilter defined in org.jetbrains.kotlin.resolve.BindingTraceFilter.Companion[PropertyDescriptorImpl]

'if (BindingTraceContext.TRACK_REWRITES && !allowSliceRewrite)
        TrackingSlicedMap(BindingTraceContext.TRACK_WITH_STACK_TRACES)
    else
        SlicedMapImpl(allowSliceRewrite)' @ [37:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SlicedMapImpl, elseBranch: SlicedMapImpl): SlicedMapImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SlicedMapImpl

'TRACK_REWRITES' @ [37:47] ==> public/*package*/ const final val TRACK_REWRITES: Boolean defined in org.jetbrains.kotlin.resolve.BindingTraceContext[JavaPropertyDescriptor]

'!' @ [37:65] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'allowSliceRewrite' @ [37:66] ==> value-parameter allowSliceRewrite: Boolean = ... defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.<init>[ValueParameterDescriptorImpl]

'TrackingSlicedMap' @ [38:9] ==> public constructor TrackingSlicedMap(trackWithStackTraces: Boolean) defined in org.jetbrains.kotlin.util.slicedMap.TrackingSlicedMap[JavaClassConstructorDescriptor]

'TRACK_WITH_STACK_TRACES' @ [38:47] ==> public/*package*/ const final val TRACK_WITH_STACK_TRACES: Boolean defined in org.jetbrains.kotlin.resolve.BindingTraceContext[JavaPropertyDescriptor]

'SlicedMapImpl' @ [40:9] ==> public constructor SlicedMapImpl(alwaysAllowRewrite: Boolean) defined in org.jetbrains.kotlin.util.slicedMap.SlicedMapImpl[JavaClassConstructorDescriptor]

'allowSliceRewrite' @ [40:23] ==> value-parameter allowSliceRewrite: Boolean = ... defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.<init>[ValueParameterDescriptorImpl]

'mutableDiagnostics' @ [45:54] ==> private final val mutableDiagnostics: MutableDiagnosticsWithSuppression? defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[PropertyDescriptorImpl]

'EMPTY' @ [45:88] ==> public final val EMPTY: Diagnostics defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics.Companion[PropertyDescriptorImpl]

'this@DelegatingBindingTrace' @ [48:20] ==> <this> defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[LazyClassReceiverParameterDescriptor]

'get' @ [48:48] ==> public open fun <K, V> get(slice: ReadOnlySlice<K, V>, key: K): V? defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'slice' @ [48:52] ==> value-parameter slice: ReadOnlySlice<K, V> defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.MyBindingContext.get[ValueParameterDescriptorImpl]

'key' @ [48:59] ==> value-parameter key: K defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.MyBindingContext.get[ValueParameterDescriptorImpl]

'this@DelegatingBindingTrace' @ [52:20] ==> <this> defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[LazyClassReceiverParameterDescriptor]

'getType' @ [52:48] ==> public open fun getType(expression: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[SimpleFunctionDescriptorImpl]

'expression' @ [52:56] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.MyBindingContext.getType[ValueParameterDescriptorImpl]

'this@DelegatingBindingTrace' @ [56:20] ==> <this> defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[LazyClassReceiverParameterDescriptor]

'getKeys' @ [56:48] ==> public open fun <K, V> getKeys(slice: WritableSlice<K, V>): Collection<K> defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'slice' @ [56:56] ==> value-parameter slice: WritableSlice<K, V> defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.MyBindingContext.getKeys[ValueParameterDescriptorImpl]

'addOwnDataTo' @ [60:33] ==> public/*package*/ open fun addOwnDataTo(@NotNull trace: BindingTrace, @Nullable filter: TraceEntryFilter?, commitDiagnostics: Boolean, @NotNull map: MutableSlicedMap, diagnostics: (MutableDiagnosticsWithSuppression..MutableDiagnosticsWithSuppression?)): Unit defined in org.jetbrains.kotlin.resolve.BindingContextUtils[JavaMethodDescriptor]

'trace' @ [60:46] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.MyBindingContext.addOwnDataTo[ValueParameterDescriptorImpl]

'commitDiagnostics' @ [60:59] ==> value-parameter commitDiagnostics: Boolean defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.MyBindingContext.addOwnDataTo[ValueParameterDescriptorImpl]

'map' @ [60:78] ==> private final val map: SlicedMapImpl defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[PropertyDescriptorImpl]

'mutableDiagnostics' @ [60:83] ==> private final val mutableDiagnostics: MutableDiagnosticsWithSuppression? defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[PropertyDescriptorImpl]

'TestOnly' @ [63:9] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'copyOf' @ [65:33] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> copyOf(p0: (MutableMap<out (K..K?), out (V..V?)>..Map<out (K..K?), (V..V?)>?)): (ImmutableMap<(K..K?), (V..V?)>..ImmutableMap<(K..K?), (V..V?)>?) defined in com.google.common.collect.ImmutableMap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (K..K?)
    <V : (Any..Any?)> -> (V..V?)

'parentContext' @ [65:40] ==> private final val parentContext: BindingContext defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[PropertyDescriptorImpl]

'getSliceContents' @ [65:54] ==> @TestOnly @NotNull public abstract fun <K : (Any..Any?), V : (Any..Any?)> getSliceContents(@NotNull slice: ReadOnlySlice<(K..K?), (V..V?)>): ImmutableMap<(K..K?), (V..V?)> defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (K..K?)
    <V : (Any..Any?)> -> (V..V?)

'slice' @ [65:71] ==> value-parameter slice: ReadOnlySlice<K, V> defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.MyBindingContext.getSliceContents[ValueParameterDescriptorImpl]

'map' @ [65:80] ==> private final val map: SlicedMapImpl defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[PropertyDescriptorImpl]

'getSliceContents' @ [65:84] ==> @NotNull @Override public open fun <K : (Any..Any?), V : (Any..Any?)> getSliceContents(@NotNull slice: ReadOnlySlice<(K..K?), (V..V?)>): ImmutableMap<(K..K?), (V..V?)> defined in org.jetbrains.kotlin.util.slicedMap.SlicedMapImpl[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (K..K?)
    <V : (Any..Any?)> -> (V..V?)

'slice' @ [65:101] ==> value-parameter slice: ReadOnlySlice<K, V> defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.MyBindingContext.getSliceContents[ValueParameterDescriptorImpl]

'MyBindingContext' @ [69:34] ==> public constructor MyBindingContext() defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.MyBindingContext[ClassConstructorDescriptorImpl]

'this' @ [72:9] ==> <this> defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[LazyClassReceiverParameterDescriptor]

'mutableDiagnostics' @ [72:14] ==> private final val mutableDiagnostics: MutableDiagnosticsWithSuppression? defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[PropertyDescriptorImpl]

'when {
            filter.ignoreDiagnostics -> null
            withParentDiagnostics -> MutableDiagnosticsWithSuppression(bindingContext, parentContext.diagnostics)
            else -> MutableDiagnosticsWithSuppression(bindingContext)
        }' @ [72:35] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: MutableDiagnosticsWithSuppression?, entry1: MutableDiagnosticsWithSuppression?, entry2: MutableDiagnosticsWithSuppression?): MutableDiagnosticsWithSuppression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> MutableDiagnosticsWithSuppression?

'filter' @ [73:13] ==> private final val filter: BindingTraceFilter defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[PropertyDescriptorImpl]

'ignoreDiagnostics' @ [73:20] ==> public final val ignoreDiagnostics: Boolean defined in org.jetbrains.kotlin.resolve.BindingTraceFilter[PropertyDescriptorImpl]

'withParentDiagnostics' @ [74:13] ==> value-parameter withParentDiagnostics: Boolean = ... defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.<init>[ValueParameterDescriptorImpl]

'MutableDiagnosticsWithSuppression' @ [74:38] ==> @JvmOverloads public constructor MutableDiagnosticsWithSuppression(bindingContext: BindingContext, delegateDiagnostics: Diagnostics = ...) defined in org.jetbrains.kotlin.resolve.diagnostics.MutableDiagnosticsWithSuppression[ClassConstructorDescriptorImpl]

'bindingContext' @ [74:72] ==> private final val bindingContext: DelegatingBindingTrace.MyBindingContext defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[PropertyDescriptorImpl]

'parentContext' @ [74:88] ==> private final val parentContext: BindingContext defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[PropertyDescriptorImpl]

'diagnostics' @ [74:102] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'MutableDiagnosticsWithSuppression' @ [75:21] ==> @JvmOverloads public constructor MutableDiagnosticsWithSuppression(bindingContext: BindingContext, delegateDiagnostics: Diagnostics = ...) defined in org.jetbrains.kotlin.resolve.diagnostics.MutableDiagnosticsWithSuppression[ClassConstructorDescriptorImpl]

'bindingContext' @ [75:55] ==> private final val bindingContext: DelegatingBindingTrace.MyBindingContext defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[PropertyDescriptorImpl]

'BindingTraceFilter' @ [82:46] ==> public companion object defined in org.jetbrains.kotlin.resolve.BindingTraceFilter[FakeCallableDescriptorForObject]

'ACCEPT_ALL' @ [82:65] ==> public final val ACCEPT_ALL: BindingTraceFilter defined in org.jetbrains.kotlin.resolve.BindingTraceFilter.Companion[PropertyDescriptorImpl]

'this' @ [84:9] ==> public constructor DelegatingBindingTrace(parentContext: BindingContext, name: String, withParentDiagnostics: Boolean = ..., filter: BindingTraceFilter = ..., allowSliceRewrite: Boolean = ...) defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[ClassConstructorDescriptorImpl]

'parentContext' @ [84:14] ==> value-parameter parentContext: BindingContext defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.<init>[ValueParameterDescriptorImpl]

'formDebugNameForBindingTrace' @ [85:29] ==> public open fun formDebugNameForBindingTrace(@NotNull debugName: String, @Nullable resolutionSubjectForMessage: Any?): (String..String?) defined in org.jetbrains.kotlin.resolve.AnalyzingUtils[JavaMethodDescriptor]

'debugName' @ [85:58] ==> value-parameter debugName: String defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.<init>[ValueParameterDescriptorImpl]

'resolutionSubjectForMessage' @ [85:69] ==> value-parameter resolutionSubjectForMessage: Any? defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.<init>[ValueParameterDescriptorImpl]

'filter' @ [86:23] ==> value-parameter filter: BindingTraceFilter = ... defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.<init>[ValueParameterDescriptorImpl]

'allowSliceRewrite' @ [87:34] ==> value-parameter allowSliceRewrite: Boolean = ... defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.<init>[ValueParameterDescriptorImpl]

'bindingContext' @ [89:56] ==> private final val bindingContext: DelegatingBindingTrace.MyBindingContext defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[PropertyDescriptorImpl]

'map' @ [92:9] ==> private final val map: SlicedMapImpl defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[PropertyDescriptorImpl]

'put' @ [92:13] ==> @Override public open fun <K : (Any..Any?), V : (Any..Any?)> put(slice: (WritableSlice<(K..K?), (V..V?)>..WritableSlice<(K..K?), (V..V?)>?), key: (K..K?), value: (V..V?)): Unit defined in org.jetbrains.kotlin.util.slicedMap.SlicedMapImpl[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (K..K?)
    <V : (Any..Any?)> -> (V..V?)

'slice' @ [92:17] ==> value-parameter slice: WritableSlice<K, V> defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.record[ValueParameterDescriptorImpl]

'key' @ [92:24] ==> value-parameter key: K defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.record[ValueParameterDescriptorImpl]

'value' @ [92:29] ==> value-parameter value: V defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.record[ValueParameterDescriptorImpl]

'record' @ [96:9] ==> public open fun <K, V> record(slice: WritableSlice<K, Boolean>, key: K, value: Boolean): Unit defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> Boolean

'slice' @ [96:16] ==> value-parameter slice: WritableSlice<K, Boolean> defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.record[ValueParameterDescriptorImpl]

'key' @ [96:23] ==> value-parameter key: K defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.record[ValueParameterDescriptorImpl]

'map' @ [100:21] ==> private final val map: SlicedMapImpl defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[PropertyDescriptorImpl]

'get' @ [100:25] ==> @Override public open fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(K..K?), (V..V?)>..ReadOnlySlice<(K..K?), (V..V?)>?), key: (K..K?)): (V..V?) defined in org.jetbrains.kotlin.util.slicedMap.SlicedMapImpl[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (K..K?)
    <V : (Any..Any?)> -> (V..V?)

'slice' @ [100:29] ==> value-parameter slice: ReadOnlySlice<K, V> defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.get[ValueParameterDescriptorImpl]

'key' @ [100:36] ==> value-parameter key: K defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.get[ValueParameterDescriptorImpl]

'if (slice is SetSlice<*>) {
            assert(value != null)
            if (value != SetSlice.DEFAULT) return value
        }
        else if (value != null) {
            return value
        }' @ [101:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'slice' @ [101:13] ==> value-parameter slice: ReadOnlySlice<K, V> defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.get[ValueParameterDescriptorImpl]

'assert' @ [102:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'value' @ [102:20] ==> val value: (V..V?) defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.get[LocalVariableDescriptor]

'value' @ [103:17] ==> val value: (V..V?) defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.get[LocalVariableDescriptor]

'DEFAULT' @ [103:35] ==> @JvmField public final val DEFAULT: Boolean defined in org.jetbrains.kotlin.util.slicedMap.SetSlice.Companion[PropertyDescriptorImpl]

'value' @ [103:51] ==> val value: (V..V?) defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.get[LocalVariableDescriptor]

'value' @ [105:18] ==> val value: (V..V?) defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.get[LocalVariableDescriptor]

'value' @ [106:20] ==> val value: (V..V?) defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.get[LocalVariableDescriptor]

'parentContext' @ [109:16] ==> private final val parentContext: BindingContext defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[PropertyDescriptorImpl]

'get' @ [109:30] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(K..K?), (V..V?)>..ReadOnlySlice<(K..K?), (V..V?)>?), key: (K..K?)): V? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (K..K?)
    <V : (Any..Any?)> -> (V..V?)

'slice' @ [109:34] ==> value-parameter slice: ReadOnlySlice<K, V> defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.get[ValueParameterDescriptorImpl]

'key' @ [109:41] ==> value-parameter key: K defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.get[ValueParameterDescriptorImpl]

'map' @ [113:20] ==> private final val map: SlicedMapImpl defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[PropertyDescriptorImpl]

'getKeys' @ [113:24] ==> @Override @SuppressWarnings public open fun <K : (Any..Any?), V : (Any..Any?)> getKeys(slice: (WritableSlice<(K..K?), (V..V?)>..WritableSlice<(K..K?), (V..V?)>?)): (MutableCollection<(K..K?)>..Collection<(K..K?)>?) defined in org.jetbrains.kotlin.util.slicedMap.SlicedMapImpl[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (K..K?)
    <V : (Any..Any?)> -> (V..V?)

'slice' @ [113:32] ==> value-parameter slice: WritableSlice<K, V> defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.getKeys[ValueParameterDescriptorImpl]

'parentContext' @ [114:26] ==> private final val parentContext: BindingContext defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[PropertyDescriptorImpl]

'getKeys' @ [114:40] ==> @NotNull @ReadOnly public abstract fun <K : (Any..Any?), V : (Any..Any?)> getKeys(slice: (WritableSlice<(K..K?), (V..V?)>..WritableSlice<(K..K?), (V..V?)>?)): Collection<(K..K?)> defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (K..K?)
    <V : (Any..Any?)> -> (V..V?)

'slice' @ [114:48] ==> value-parameter slice: WritableSlice<K, V> defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.getKeys[ValueParameterDescriptorImpl]

'keys' @ [115:13] ==> val keys: (MutableCollection<(K..K?)>..Collection<(K..K?)>?) defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.getKeys[LocalVariableDescriptor]

'isEmpty' @ [115:18] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'fromParent' @ [115:36] ==> val fromParent: Collection<(K..K?)> defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.getKeys[LocalVariableDescriptor]

'fromParent' @ [116:13] ==> val fromParent: Collection<(K..K?)> defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.getKeys[LocalVariableDescriptor]

'isEmpty' @ [116:24] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'keys' @ [116:42] ==> val keys: (MutableCollection<(K..K?)>..Collection<(K..K?)>?) defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.getKeys[LocalVariableDescriptor]

'keys' @ [118:16] ==> val keys: (MutableCollection<(K..K?)>..Collection<(K..K?)>?) defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.getKeys[LocalVariableDescriptor]

'fromParent' @ [118:23] ==> val fromParent: Collection<(K..K?)> defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.getKeys[LocalVariableDescriptor]

'get' @ [122:24] ==> public open fun <K, V> get(slice: ReadOnlySlice<(KtExpression..KtExpression?), (KotlinTypeInfo..KotlinTypeInfo?)>, key: (KtExpression..KtExpression?)): KotlinTypeInfo? defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <V> -> (org.jetbrains.kotlin.types.expressions.KotlinTypeInfo..org.jetbrains.kotlin.types.expressions.KotlinTypeInfo?)

'EXPRESSION_TYPE_INFO' @ [122:43] ==> public final val EXPRESSION_TYPE_INFO: (WritableSlice<(KtExpression..KtExpression?), (KotlinTypeInfo..KotlinTypeInfo?)>..WritableSlice<(KtExpression..KtExpression?), (KotlinTypeInfo..KotlinTypeInfo?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [122:65] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.getType[ValueParameterDescriptorImpl]

'typeInfo' @ [123:16] ==> val typeInfo: KotlinTypeInfo? defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.getType[LocalVariableDescriptor]

'type' @ [123:26] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'get' @ [127:24] ==> public open fun <K, V> get(slice: ReadOnlySlice<(KtExpression..KtExpression?), (KotlinTypeInfo..KotlinTypeInfo?)>, key: (KtExpression..KtExpression?)): KotlinTypeInfo? defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <V> -> (org.jetbrains.kotlin.types.expressions.KotlinTypeInfo..org.jetbrains.kotlin.types.expressions.KotlinTypeInfo?)

'EXPRESSION_TYPE_INFO' @ [127:43] ==> public final val EXPRESSION_TYPE_INFO: (WritableSlice<(KtExpression..KtExpression?), (KotlinTypeInfo..KotlinTypeInfo?)>..WritableSlice<(KtExpression..KtExpression?), (KotlinTypeInfo..KotlinTypeInfo?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [127:65] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.recordType[ValueParameterDescriptorImpl]

'if (typeInfo == null) {
            typeInfo = createTypeInfo(type)
        }
        else {
            typeInfo = typeInfo.replaceType(type)
        }' @ [128:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'typeInfo' @ [128:13] ==> var typeInfo: KotlinTypeInfo? defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.recordType[LocalVariableDescriptor]

'typeInfo' @ [129:13] ==> var typeInfo: KotlinTypeInfo? defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.recordType[LocalVariableDescriptor]

'createTypeInfo' @ [129:24] ==> public fun createTypeInfo(type: KotlinType?): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.typeInfoFactory in file TypeInfoFactory.kt[SimpleFunctionDescriptorImpl]

'type' @ [129:39] ==> value-parameter type: KotlinType? defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.recordType[ValueParameterDescriptorImpl]

'typeInfo' @ [132:13] ==> var typeInfo: KotlinTypeInfo? defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.recordType[LocalVariableDescriptor]

'typeInfo' @ [132:24] ==> var typeInfo: KotlinTypeInfo? defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.recordType[LocalVariableDescriptor]

'replaceType' @ [132:33] ==> public final fun replaceType(type: KotlinType?): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[SimpleFunctionDescriptorImpl]

'type' @ [132:45] ==> value-parameter type: KotlinType? defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.recordType[ValueParameterDescriptorImpl]

'record' @ [134:9] ==> public open fun <K, V> record(slice: WritableSlice<(KtExpression..KtExpression?), (KotlinTypeInfo..KotlinTypeInfo?)>, key: (KtExpression..KtExpression?), value: (KotlinTypeInfo..KotlinTypeInfo?)): Unit defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <V> -> (org.jetbrains.kotlin.types.expressions.KotlinTypeInfo..org.jetbrains.kotlin.types.expressions.KotlinTypeInfo?)

'EXPRESSION_TYPE_INFO' @ [134:31] ==> public final val EXPRESSION_TYPE_INFO: (WritableSlice<(KtExpression..KtExpression?), (KotlinTypeInfo..KotlinTypeInfo?)>..WritableSlice<(KtExpression..KtExpression?), (KotlinTypeInfo..KotlinTypeInfo?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [134:53] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.recordType[ValueParameterDescriptorImpl]

'typeInfo' @ [134:65] ==> var typeInfo: KotlinTypeInfo? defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.recordType[LocalVariableDescriptor]

'addOwnDataTo' @ [138:9] ==> @JvmOverloads public final fun addOwnDataTo(trace: BindingTrace, filter: TraceEntryFilter? = ..., commitDiagnostics: Boolean = ...): Unit defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[SimpleFunctionDescriptorImpl]

'trace' @ [138:22] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.moveAllMyDataTo[ValueParameterDescriptorImpl]

'clear' @ [139:9] ==> public final fun clear(): Unit defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[SimpleFunctionDescriptorImpl]

'JvmOverloads' @ [142:5] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'addOwnDataTo' @ [143:29] ==> public/*package*/ open fun addOwnDataTo(@NotNull trace: BindingTrace, @Nullable filter: TraceEntryFilter?, commitDiagnostics: Boolean, @NotNull map: MutableSlicedMap, diagnostics: (MutableDiagnosticsWithSuppression..MutableDiagnosticsWithSuppression?)): Unit defined in org.jetbrains.kotlin.resolve.BindingContextUtils[JavaMethodDescriptor]

'trace' @ [143:42] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.addOwnDataTo[ValueParameterDescriptorImpl]

'filter' @ [143:49] ==> value-parameter filter: TraceEntryFilter? = ... defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.addOwnDataTo[ValueParameterDescriptorImpl]

'commitDiagnostics' @ [143:57] ==> value-parameter commitDiagnostics: Boolean = ... defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.addOwnDataTo[ValueParameterDescriptorImpl]

'map' @ [143:76] ==> private final val map: SlicedMapImpl defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[PropertyDescriptorImpl]

'mutableDiagnostics' @ [143:81] ==> private final val mutableDiagnostics: MutableDiagnosticsWithSuppression? defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[PropertyDescriptorImpl]

'map' @ [147:9] ==> private final val map: SlicedMapImpl defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[PropertyDescriptorImpl]

'clear' @ [147:13] ==> @Override public open fun clear(): Unit defined in org.jetbrains.kotlin.util.slicedMap.SlicedMapImpl[JavaMethodDescriptor]

'mutableDiagnostics' @ [148:9] ==> private final val mutableDiagnostics: MutableDiagnosticsWithSuppression? defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[PropertyDescriptorImpl]

'clear' @ [148:29] ==> public final fun clear(): Unit defined in org.jetbrains.kotlin.resolve.diagnostics.MutableDiagnosticsWithSuppression[SimpleFunctionDescriptorImpl]

'mutableDiagnostics' @ [152:13] ==> private final val mutableDiagnostics: MutableDiagnosticsWithSuppression? defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[PropertyDescriptorImpl]

'mutableDiagnostics' @ [155:9] ==> private final val mutableDiagnostics: MutableDiagnosticsWithSuppression? defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[PropertyDescriptorImpl]

'report' @ [155:28] ==> public final fun report(diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.diagnostics.MutableDiagnosticsWithSuppression[SimpleFunctionDescriptorImpl]

'diagnostic' @ [155:35] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace.report[ValueParameterDescriptorImpl]

'mutableDiagnostics' @ [158:48] ==> private final val mutableDiagnostics: MutableDiagnosticsWithSuppression? defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[PropertyDescriptorImpl]

'name' @ [160:39] ==> private final val name: String defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[PropertyDescriptorImpl]

