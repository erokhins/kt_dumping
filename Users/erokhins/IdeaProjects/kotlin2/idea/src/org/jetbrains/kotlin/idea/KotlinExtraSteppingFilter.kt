'context' @ [32:13] ==> value-parameter context: SuspendContext? defined in org.jetbrains.kotlin.idea.KotlinExtraSteppingFilter.isApplicable[ValueParameterDescriptorImpl]

'context' @ [36:28] ==> value-parameter context: SuspendContext? defined in org.jetbrains.kotlin.idea.KotlinExtraSteppingFilter.isApplicable[ValueParameterDescriptorImpl]

'debugProcess' @ [36:36] ==> public final val SuspendContext.debugProcess: DebugProcess?[MyPropertyDescriptor]

'KotlinPositionManager' @ [37:31] ==> public constructor KotlinPositionManager(myDebugProcess: DebugProcess) defined in org.jetbrains.kotlin.idea.debugger.KotlinPositionManager[ClassConstructorDescriptorImpl]

'debugProcess' @ [37:53] ==> val debugProcess: DebugProcess defined in org.jetbrains.kotlin.idea.KotlinExtraSteppingFilter.isApplicable[LocalVariableDescriptor]

'context' @ [38:24] ==> value-parameter context: SuspendContext? defined in org.jetbrains.kotlin.idea.KotlinExtraSteppingFilter.isApplicable[ValueParameterDescriptorImpl]

'frameProxy' @ [38:32] ==> public final val SuspendContext.frameProxy: StackFrameProxy?[MyPropertyDescriptor]

'location' @ [38:44] ==> public abstract fun location(): (Location..Location?) defined in com.intellij.debugger.engine.jdi.StackFrameProxy[JavaMethodDescriptor]

'runReadAction' @ [39:16] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'shouldFilter' @ [40:13] ==> private final fun shouldFilter(positionManager: KotlinPositionManager, location: Location): Boolean defined in org.jetbrains.kotlin.idea.KotlinExtraSteppingFilter[SimpleFunctionDescriptorImpl]

'positionManager' @ [40:26] ==> val positionManager: KotlinPositionManager defined in org.jetbrains.kotlin.idea.KotlinExtraSteppingFilter.isApplicable[LocalVariableDescriptor]

'location' @ [40:43] ==> val location: Location defined in org.jetbrains.kotlin.idea.KotlinExtraSteppingFilter.isApplicable[LocalVariableDescriptor]

'location' @ [46:29] ==> value-parameter location: Location defined in org.jetbrains.kotlin.idea.KotlinExtraSteppingFilter.shouldFilter[ValueParameterDescriptorImpl]

'declaringType' @ [46:38] ==> public abstract fun declaringType(): (ReferenceType..ReferenceType?) defined in com.sun.jdi.Location[JavaMethodDescriptor]

'defaultStratum' @ [46:55] ==> public abstract fun defaultStratum(): (String..String?) defined in com.sun.jdi.ReferenceType[JavaMethodDescriptor]

'!=' @ [47:13] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'defaultStrata' @ [47:25] ==> val defaultStrata: String? defined in org.jetbrains.kotlin.idea.KotlinExtraSteppingFilter.shouldFilter[LocalVariableDescriptor]

'?:' @ [52:17] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: SourcePosition?, right: SourcePosition): SourcePosition[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> SourcePosition

'positionManager' @ [53:21] ==> value-parameter positionManager: KotlinPositionManager defined in org.jetbrains.kotlin.idea.KotlinExtraSteppingFilter.shouldFilter[ValueParameterDescriptorImpl]

'getSourcePosition' @ [53:37] ==> public open fun getSourcePosition(location: Location?): SourcePosition? defined in org.jetbrains.kotlin.idea.debugger.KotlinPositionManager[SimpleFunctionDescriptorImpl]

'location' @ [53:55] ==> value-parameter location: Location defined in org.jetbrains.kotlin.idea.KotlinExtraSteppingFilter.shouldFilter[ValueParameterDescriptorImpl]

'isOnSuspendReturnOrReenter' @ [59:13] ==> public fun isOnSuspendReturnOrReenter(location: Location): Boolean defined in org.jetbrains.kotlin.idea.debugger in file debuggerUtil.kt[SimpleFunctionDescriptorImpl]

'location' @ [59:40] ==> value-parameter location: Location defined in org.jetbrains.kotlin.idea.KotlinExtraSteppingFilter.shouldFilter[ValueParameterDescriptorImpl]

'!' @ [59:53] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isOneLineMethod' @ [59:54] ==> public fun isOneLineMethod(location: Location): Boolean defined in org.jetbrains.kotlin.idea.debugger in file debuggerUtil.kt[SimpleFunctionDescriptorImpl]

'location' @ [59:70] ==> value-parameter location: Location defined in org.jetbrains.kotlin.idea.KotlinExtraSteppingFilter.shouldFilter[ValueParameterDescriptorImpl]

'getInstance' @ [63:41] ==> public open fun getInstance(): (DebuggerSettings..DebuggerSettings?) defined in com.intellij.debugger.settings.DebuggerSettings[JavaMethodDescriptor]

'settings' @ [64:13] ==> val settings: (DebuggerSettings..DebuggerSettings?) defined in org.jetbrains.kotlin.idea.KotlinExtraSteppingFilter.shouldFilter[LocalVariableDescriptor]

'TRACING_FILTERS_ENABLED' @ [64:22] ==> public final var TRACING_FILTERS_ENABLED: Boolean defined in com.intellij.debugger.settings.DebuggerSettings[JavaPropertyDescriptor]

'positionManager' @ [65:30] ==> value-parameter positionManager: KotlinPositionManager defined in org.jetbrains.kotlin.idea.KotlinExtraSteppingFilter.shouldFilter[ValueParameterDescriptorImpl]

'originalClassNamesForPosition' @ [65:46] ==> public final fun originalClassNamesForPosition(position: SourcePosition): List<String> defined in org.jetbrains.kotlin.idea.debugger.KotlinPositionManager[SimpleFunctionDescriptorImpl]

'sourcePosition' @ [65:76] ==> val sourcePosition: SourcePosition defined in org.jetbrains.kotlin.idea.KotlinExtraSteppingFilter.shouldFilter[LocalVariableDescriptor]

'map' @ [65:92] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [65:98] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.KotlinExtraSteppingFilter.shouldFilter.<anonymous>[ValueParameterDescriptorImpl]

'replace' @ [65:101] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'classNames' @ [66:17] ==> val classNames: List<String> defined in org.jetbrains.kotlin.idea.KotlinExtraSteppingFilter.shouldFilter[LocalVariableDescriptor]

'isEmpty' @ [66:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'classNames' @ [70:31] ==> val classNames: List<String> defined in org.jetbrains.kotlin.idea.KotlinExtraSteppingFilter.shouldFilter[LocalVariableDescriptor]

'settings' @ [71:32] ==> val settings: (DebuggerSettings..DebuggerSettings?) defined in org.jetbrains.kotlin.idea.KotlinExtraSteppingFilter.shouldFilter[LocalVariableDescriptor]

'steppingFilters' @ [71:41] ==> public final var DebuggerSettings.steppingFilters: (Array<(ClassFilter..ClassFilter?)>..Array<out (ClassFilter..ClassFilter?)>?)[MyPropertyDescriptor]

'filter' @ [72:25] ==> val filter: (ClassFilter..ClassFilter?) defined in org.jetbrains.kotlin.idea.KotlinExtraSteppingFilter.shouldFilter[LocalVariableDescriptor]

'isEnabled' @ [72:32] ==> public final var ClassFilter.isEnabled: Boolean[MyPropertyDescriptor]

'filter' @ [73:29] ==> val filter: (ClassFilter..ClassFilter?) defined in org.jetbrains.kotlin.idea.KotlinExtraSteppingFilter.shouldFilter[LocalVariableDescriptor]

'matches' @ [73:36] ==> public open fun matches(p0: (String..String?)): Boolean defined in com.intellij.ui.classFilter.ClassFilter[JavaMethodDescriptor]

'className' @ [73:44] ==> val className: String defined in org.jetbrains.kotlin.idea.KotlinExtraSteppingFilter.shouldFilter[LocalVariableDescriptor]

'STEP_INTO' @ [85:28] ==> public const final val STEP_INTO: Int defined in com.sun.jdi.request.StepRequest[JavaPropertyDescriptor]

