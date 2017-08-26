'HashMap' @ [47:24] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Call
    <V : (Any..Any?)> -> CachedData

'data' @ [56:9] ==> private final val data: HashMap<Call, ResolutionResultsCache.CachedData> defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionResultsCacheImpl[PropertyDescriptorImpl]

'call' @ [56:14] ==> value-parameter call: Call defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionResultsCacheImpl.record[ValueParameterDescriptorImpl]

'CachedData' @ [56:22] ==> public constructor CachedData(resolutionResults: OverloadResolutionResultsImpl<*>, deferredComputation: BasicCallResolutionContext, tracing: TracingStrategy, resolutionTrace: DelegatingBindingTrace) defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionResultsCache.CachedData[ClassConstructorDescriptorImpl]

'results' @ [56:33] ==> value-parameter results: OverloadResolutionResultsImpl<out CallableDescriptor?> defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionResultsCacheImpl.record[ValueParameterDescriptorImpl]

'deferredComputation' @ [56:42] ==> value-parameter deferredComputation: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionResultsCacheImpl.record[ValueParameterDescriptorImpl]

'tracing' @ [56:63] ==> value-parameter tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionResultsCacheImpl.record[ValueParameterDescriptorImpl]

'resolutionTrace' @ [56:72] ==> value-parameter resolutionTrace: DelegatingBindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionResultsCacheImpl.record[ValueParameterDescriptorImpl]

'data' @ [59:49] ==> private final val data: HashMap<Call, ResolutionResultsCache.CachedData> defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionResultsCacheImpl[PropertyDescriptorImpl]

'call' @ [59:54] ==> value-parameter call: Call defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionResultsCacheImpl.get[ValueParameterDescriptorImpl]

'data' @ [62:9] ==> private final val data: HashMap<Call, ResolutionResultsCache.CachedData> defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionResultsCacheImpl[PropertyDescriptorImpl]

'putAll' @ [62:14] ==> public open fun putAll(from: Map<out Call, ResolutionResultsCache.CachedData>): Unit defined in java.util.HashMap[JavaMethodDescriptor]

'cache' @ [62:21] ==> value-parameter cache: ResolutionResultsCacheImpl defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionResultsCacheImpl.addData[ValueParameterDescriptorImpl]

'data' @ [62:27] ==> private final val data: HashMap<Call, ResolutionResultsCache.CachedData> defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionResultsCacheImpl[PropertyDescriptorImpl]

'ResolutionResultsCacheImpl' @ [67:30] ==> public constructor ResolutionResultsCacheImpl() defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionResultsCacheImpl[ClassConstructorDescriptorImpl]

'innerCache' @ [76:9] ==> private final val innerCache: ResolutionResultsCacheImpl defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryResolutionResultsCache[PropertyDescriptorImpl]

'record' @ [76:20] ==> public open fun record(call: Call, results: OverloadResolutionResultsImpl<out CallableDescriptor?>, deferredComputation: BasicCallResolutionContext, tracing: TracingStrategy, resolutionTrace: DelegatingBindingTrace): Unit defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionResultsCacheImpl[SimpleFunctionDescriptorImpl]

'call' @ [76:27] ==> value-parameter call: Call defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryResolutionResultsCache.record[ValueParameterDescriptorImpl]

'results' @ [76:33] ==> value-parameter results: OverloadResolutionResultsImpl<out CallableDescriptor?> defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryResolutionResultsCache.record[ValueParameterDescriptorImpl]

'deferredComputation' @ [76:42] ==> value-parameter deferredComputation: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryResolutionResultsCache.record[ValueParameterDescriptorImpl]

'tracing' @ [76:63] ==> value-parameter tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryResolutionResultsCache.record[ValueParameterDescriptorImpl]

'resolutionTrace' @ [76:72] ==> value-parameter resolutionTrace: DelegatingBindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryResolutionResultsCache.record[ValueParameterDescriptorImpl]

'innerCache' @ [79:49] ==> private final val innerCache: ResolutionResultsCacheImpl defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryResolutionResultsCache[PropertyDescriptorImpl]

'call' @ [79:60] ==> value-parameter call: Call defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryResolutionResultsCache.get[ValueParameterDescriptorImpl]

'parentCache' @ [79:69] ==> private final val parentCache: ResolutionResultsCache defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryResolutionResultsCache[PropertyDescriptorImpl]

'call' @ [79:81] ==> value-parameter call: Call defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryResolutionResultsCache.get[ValueParameterDescriptorImpl]

'when (parentCache) {
            is ResolutionResultsCacheImpl -> parentCache.addData(innerCache)
            is TemporaryResolutionResultsCache -> parentCache.innerCache.addData(innerCache)
        }' @ [82:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'parentCache' @ [82:15] ==> private final val parentCache: ResolutionResultsCache defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryResolutionResultsCache[PropertyDescriptorImpl]

'parentCache' @ [83:46] ==> private final val parentCache: ResolutionResultsCache defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryResolutionResultsCache[PropertyDescriptorImpl]

'addData' @ [83:58] ==> public final fun addData(cache: ResolutionResultsCacheImpl): Unit defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionResultsCacheImpl[SimpleFunctionDescriptorImpl]

'innerCache' @ [83:66] ==> private final val innerCache: ResolutionResultsCacheImpl defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryResolutionResultsCache[PropertyDescriptorImpl]

'parentCache' @ [84:51] ==> private final val parentCache: ResolutionResultsCache defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryResolutionResultsCache[PropertyDescriptorImpl]

'innerCache' @ [84:63] ==> private final val innerCache: ResolutionResultsCacheImpl defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryResolutionResultsCache[PropertyDescriptorImpl]

'addData' @ [84:74] ==> public final fun addData(cache: ResolutionResultsCacheImpl): Unit defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionResultsCacheImpl[SimpleFunctionDescriptorImpl]

'innerCache' @ [84:82] ==> private final val innerCache: ResolutionResultsCacheImpl defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryResolutionResultsCache[PropertyDescriptorImpl]

