'DummyProfiler' @ [29:130] ==> public constructor DummyProfiler() defined in org.jetbrains.kotlin.daemon.common.DummyProfiler[DeserializedClassConstructorDescriptor]

'profiler' @ [30:31] ==> public final val profiler: Profiler defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient[PropertyDescriptorImpl]

'withMeasure' @ [30:40] ==> public abstract fun <R> withMeasure(obj: Any?, body: () -> Boolean): Boolean defined in org.jetbrains.kotlin.daemon.common.Profiler[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Boolean

'this' @ [30:52] ==> <this> defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient[LazyClassReceiverParameterDescriptor]

'facade' @ [30:60] ==> public final val facade: CompilerCallbackServicesFacade defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient[PropertyDescriptorImpl]

'lookupTracker_isDoNothing' @ [30:67] ==> public abstract fun lookupTracker_isDoNothing(): Boolean defined in org.jetbrains.kotlin.daemon.common.CompilerCallbackServicesFacade[DeserializedSimpleFunctionDescriptor]

'hashSetOf' @ [32:27] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<LookupInfo> /* = HashSet<LookupInfo> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupInfo

'StringInterner' @ [33:28] ==> public constructor StringInterner() defined in com.intellij.util.containers.StringInterner[JavaClassConstructorDescriptor]

'profiler' @ [35:46] ==> public final val profiler: Profiler defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient[PropertyDescriptorImpl]

'withMeasure' @ [35:55] ==> public abstract fun <R> withMeasure(obj: Any?, body: () -> Boolean): Boolean defined in org.jetbrains.kotlin.daemon.common.Profiler[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Boolean

'this' @ [35:67] ==> <this> defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient[LazyClassReceiverParameterDescriptor]

'facade' @ [35:75] ==> public final val facade: CompilerCallbackServicesFacade defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient[PropertyDescriptorImpl]

'lookupTracker_requiresPosition' @ [35:82] ==> public abstract fun lookupTracker_requiresPosition(): Boolean defined in org.jetbrains.kotlin.daemon.common.CompilerCallbackServicesFacade[DeserializedSimpleFunctionDescriptor]

'isDoNothing' @ [38:13] ==> private final val isDoNothing: Boolean defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient[PropertyDescriptorImpl]

'interner' @ [40:32] ==> private final val interner: StringInterner defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient[PropertyDescriptorImpl]

'intern' @ [40:41] ==> @NotNull public open fun intern(@NotNull p0: String): String defined in com.intellij.util.containers.StringInterner[JavaMethodDescriptor]

'filePath' @ [40:48] ==> value-parameter filePath: String defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient.record[ValueParameterDescriptorImpl]

'interner' @ [41:35] ==> private final val interner: StringInterner defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient[PropertyDescriptorImpl]

'intern' @ [41:44] ==> @NotNull public open fun intern(@NotNull p0: String): String defined in com.intellij.util.containers.StringInterner[JavaMethodDescriptor]

'scopeFqName' @ [41:51] ==> value-parameter scopeFqName: String defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient.record[ValueParameterDescriptorImpl]

'interner' @ [42:28] ==> private final val interner: StringInterner defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient[PropertyDescriptorImpl]

'intern' @ [42:37] ==> @NotNull public open fun intern(@NotNull p0: String): String defined in com.intellij.util.containers.StringInterner[JavaMethodDescriptor]

'name' @ [42:44] ==> value-parameter name: String defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient.record[ValueParameterDescriptorImpl]

'lookups' @ [44:9] ==> private final val lookups: HashSet<LookupInfo> /* = HashSet<LookupInfo> */ defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient[PropertyDescriptorImpl]

'add' @ [44:17] ==> public open fun add(element: LookupInfo): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'LookupInfo' @ [44:21] ==> public constructor LookupInfo(filePath: String, position: Position, scopeFqName: String, scopeKind: ScopeKind, name: String) defined in org.jetbrains.kotlin.incremental.components.LookupInfo[DeserializedClassConstructorDescriptor]

'internedFilePath' @ [44:32] ==> val internedFilePath: String defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient.record[LocalVariableDescriptor]

'position' @ [44:50] ==> value-parameter position: Position defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient.record[ValueParameterDescriptorImpl]

'internedScopeFqName' @ [44:60] ==> val internedScopeFqName: String defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient.record[LocalVariableDescriptor]

'scopeKind' @ [44:81] ==> value-parameter scopeKind: ScopeKind defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient.record[ValueParameterDescriptorImpl]

'internedName' @ [44:92] ==> val internedName: String defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient.record[LocalVariableDescriptor]

'eventManager' @ [48:9] ==> value-parameter eventManager: EventManager defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient.<init>[ValueParameterDescriptorImpl]

'onCompilationFinished' @ [48:22] ==> public abstract fun onCompilationFinished(f: () -> Unit): Unit defined in org.jetbrains.kotlin.daemon.EventManager[SimpleFunctionDescriptorImpl]

'flush' @ [48:46] ==> private final fun flush(): Unit defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient[SimpleFunctionDescriptorImpl]

'isDoNothing' @ [52:13] ==> private final val isDoNothing: Boolean defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient[PropertyDescriptorImpl]

'lookups' @ [52:28] ==> private final val lookups: HashSet<LookupInfo> /* = HashSet<LookupInfo> */ defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient[PropertyDescriptorImpl]

'isEmpty' @ [52:36] ==> public open fun isEmpty(): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'profiler' @ [54:9] ==> public final val profiler: Profiler defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient[PropertyDescriptorImpl]

'withMeasure' @ [54:18] ==> public abstract fun <R> withMeasure(obj: Any?, body: () -> Unit): Unit defined in org.jetbrains.kotlin.daemon.common.Profiler[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'this' @ [54:30] ==> <this> defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient[LazyClassReceiverParameterDescriptor]

'facade' @ [55:13] ==> public final val facade: CompilerCallbackServicesFacade defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient[PropertyDescriptorImpl]

'lookupTracker_record' @ [55:20] ==> public abstract fun lookupTracker_record(lookups: Collection<LookupInfo>): Unit defined in org.jetbrains.kotlin.daemon.common.CompilerCallbackServicesFacade[DeserializedSimpleFunctionDescriptor]

'lookups' @ [55:41] ==> private final val lookups: HashSet<LookupInfo> /* = HashSet<LookupInfo> */ defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient[PropertyDescriptorImpl]

'lookups' @ [58:9] ==> private final val lookups: HashSet<LookupInfo> /* = HashSet<LookupInfo> */ defined in org.jetbrains.kotlin.daemon.RemoteLookupTrackerClient[PropertyDescriptorImpl]

'clear' @ [58:17] ==> public open fun clear(): Unit defined in java.util.HashSet[JavaMethodDescriptor]

