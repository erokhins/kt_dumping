'Range' @ [39:61] ==> public constructor Range<T : (Comparable<(Int..Int?)>..Comparable<(Int..Int?)>?)>(@NotNull p0: Int, @NotNull p1: Int) defined in com.intellij.util.Range[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Comparable<(T..T?)>..Comparable<(T..T?)>?)> -> Int

'line' @ [39:67] ==> private final val line: Int defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSuspendCallStepOverFilter[PropertyDescriptorImpl]

'line' @ [39:73] ==> private final val line: Int defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSuspendCallStepOverFilter[PropertyDescriptorImpl]

'location' @ [42:16] ==> value-parameter location: Location? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSuspendCallStepOverFilter.locationMatches[ValueParameterDescriptorImpl]

'isOnSuspendReturnOrReenter' @ [42:36] ==> public fun isOnSuspendReturnOrReenter(location: Location): Boolean defined in org.jetbrains.kotlin.idea.debugger in file debuggerUtil.kt[SimpleFunctionDescriptorImpl]

'location' @ [42:63] ==> value-parameter location: Location? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSuspendCallStepOverFilter.locationMatches[ValueParameterDescriptorImpl]

'context' @ [46:24] ==> value-parameter context: SuspendContextImpl defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSuspendCallStepOverFilter.onReached[ValueParameterDescriptorImpl]

'frameProxy' @ [46:32] ==> public final val SuspendContextImpl.frameProxy: StackFrameProxyImpl?[MyPropertyDescriptor]

'location' @ [46:44] ==> public open fun location(): (Location..Location?) defined in com.intellij.debugger.jdi.StackFrameProxyImpl[JavaMethodDescriptor]

'STOP' @ [46:77] ==> public const final val STOP: Int defined in com.intellij.debugger.engine.RequestHint[JavaPropertyDescriptor]

'suspendFunctionFirstLineLocation' @ [47:38] ==> public fun suspendFunctionFirstLineLocation(location: Location): Int? defined in org.jetbrains.kotlin.idea.debugger in file debuggerUtil.kt[SimpleFunctionDescriptorImpl]

'location' @ [47:71] ==> val location: Location defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSuspendCallStepOverFilter.onReached[LocalVariableDescriptor]

'STOP' @ [47:103] ==> public const final val STOP: Int defined in com.intellij.debugger.engine.RequestHint[JavaPropertyDescriptor]

'context' @ [49:28] ==> value-parameter context: SuspendContextImpl defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSuspendCallStepOverFilter.onReached[ValueParameterDescriptorImpl]

'debugProcess' @ [49:36] ==> public final val SuspendContextImpl.debugProcess: DebugProcessImpl[MyPropertyDescriptor]

'getInstanceEx' @ [50:51] ==> public open fun getInstanceEx(p0: (Project..Project?)): (DebuggerManagerEx..DebuggerManagerEx?) defined in com.intellij.debugger.DebuggerManagerEx[JavaMethodDescriptor]

'debugProcess' @ [50:65] ==> val debugProcess: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSuspendCallStepOverFilter.onReached[LocalVariableDescriptor]

'project' @ [50:78] ==> public final val DebugProcessImpl.project: Project[MyPropertyDescriptor]

'breakpointManager' @ [50:87] ==> public final val DebuggerManagerEx.breakpointManager: BreakpointManager[MyPropertyDescriptor]

'breakpointManager' @ [51:9] ==> val breakpointManager: BreakpointManager defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSuspendCallStepOverFilter.onReached[LocalVariableDescriptor]

'applyThreadFilter' @ [51:27] ==> public open fun applyThreadFilter(@NotNull p0: DebugProcessImpl, @Nullable p1: ThreadReference?): Unit defined in com.intellij.debugger.ui.breakpoints.BreakpointManager[JavaMethodDescriptor]

'debugProcess' @ [51:45] ==> val debugProcess: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSuspendCallStepOverFilter.onReached[LocalVariableDescriptor]

'createRunToCursorBreakpoint' @ [53:9] ==> private fun createRunToCursorBreakpoint(context: SuspendContextImpl, line: Int, file: PsiFile, ignoreBreakpoints: Boolean): Unit defined in org.jetbrains.kotlin.idea.debugger.stepping in file KotlinSuspendCallStepOverFilter.kt[SimpleFunctionDescriptorImpl]

'context' @ [53:37] ==> value-parameter context: SuspendContextImpl defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSuspendCallStepOverFilter.onReached[ValueParameterDescriptorImpl]

'suspendStartLineNumber' @ [53:46] ==> val suspendStartLineNumber: Int defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSuspendCallStepOverFilter.onReached[LocalVariableDescriptor]

'file' @ [53:74] ==> private final val file: PsiFile defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSuspendCallStepOverFilter[PropertyDescriptorImpl]

'ignoreBreakpoints' @ [53:80] ==> private final val ignoreBreakpoints: Boolean defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSuspendCallStepOverFilter[PropertyDescriptorImpl]

'RESUME' @ [54:28] ==> public const final val RESUME: Int defined in com.intellij.debugger.engine.RequestHint[JavaPropertyDescriptor]

'?:' @ [59:20] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: XSourcePositionImpl?, right: XSourcePositionImpl): XSourcePositionImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> XSourcePositionImpl

'create' @ [59:40] ==> @Nullable public open fun create(@Nullable p0: VirtualFile?, p1: Int): XSourcePositionImpl? defined in com.intellij.xdebugger.impl.XSourcePositionImpl[JavaMethodDescriptor]

'file' @ [59:47] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.debugger.stepping.createRunToCursorBreakpoint[ValueParameterDescriptorImpl]

'virtualFile' @ [59:52] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'line' @ [59:65] ==> value-parameter line: Int defined in org.jetbrains.kotlin.idea.debugger.stepping.createRunToCursorBreakpoint[ValueParameterDescriptorImpl]

'context' @ [60:19] ==> value-parameter context: SuspendContextImpl defined in org.jetbrains.kotlin.idea.debugger.stepping.createRunToCursorBreakpoint[ValueParameterDescriptorImpl]

'debugProcess' @ [60:27] ==> public final val SuspendContextImpl.debugProcess: DebugProcessImpl[MyPropertyDescriptor]

'process' @ [61:5] ==> val process: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.stepping.createRunToCursorBreakpoint[LocalVariableDescriptor]

'showStatusText' @ [61:13] ==> public open fun showStatusText(p0: (String..String?)): Unit defined in com.intellij.debugger.engine.DebugProcessImpl[JavaMethodDescriptor]

'message' @ [61:43] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.debugger.DebuggerBundle[JavaMethodDescriptor]

'process' @ [62:5] ==> val process: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.stepping.createRunToCursorBreakpoint[LocalVariableDescriptor]

'cancelRunToCursorBreakpoint' @ [62:13] ==> public open fun cancelRunToCursorBreakpoint(): Unit defined in com.intellij.debugger.engine.DebugProcessImpl[JavaMethodDescriptor]

'ignoreBreakpoints' @ [64:9] ==> value-parameter ignoreBreakpoints: Boolean defined in org.jetbrains.kotlin.idea.debugger.stepping.createRunToCursorBreakpoint[ValueParameterDescriptorImpl]

'getInstanceEx' @ [65:27] ==> public open fun getInstanceEx(p0: (Project..Project?)): (DebuggerManagerEx..DebuggerManagerEx?) defined in com.intellij.debugger.DebuggerManagerEx[JavaMethodDescriptor]

'process' @ [65:41] ==> val process: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.stepping.createRunToCursorBreakpoint[LocalVariableDescriptor]

'project' @ [65:49] ==> public final val DebugProcessImpl.project: Project[MyPropertyDescriptor]

'breakpointManager' @ [65:58] ==> public final val DebuggerManagerEx.breakpointManager: BreakpointManager[MyPropertyDescriptor]

'disableBreakpoints' @ [65:76] ==> public open fun disableBreakpoints(@NotNull p0: DebugProcessImpl): Unit defined in com.intellij.debugger.ui.breakpoints.BreakpointManager[JavaMethodDescriptor]

'process' @ [65:95] ==> val process: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.stepping.createRunToCursorBreakpoint[LocalVariableDescriptor]

'runReadAction' @ [69:13] ==> public fun <T> runReadAction(action: () -> RunToCursorBreakpoint?): RunToCursorBreakpoint? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RunToCursorBreakpoint?

'getInstanceEx' @ [70:35] ==> public open fun getInstanceEx(p0: (Project..Project?)): (DebuggerManagerEx..DebuggerManagerEx?) defined in com.intellij.debugger.DebuggerManagerEx[JavaMethodDescriptor]

'process' @ [70:49] ==> val process: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.stepping.createRunToCursorBreakpoint[LocalVariableDescriptor]

'project' @ [70:57] ==> public final val DebugProcessImpl.project: Project[MyPropertyDescriptor]

'breakpointManager' @ [70:66] ==> public final val DebuggerManagerEx.breakpointManager: BreakpointManager[MyPropertyDescriptor]

'addRunToCursorBreakpoint' @ [70:84] ==> @Nullable public open fun addRunToCursorBreakpoint(@NotNull p0: XSourcePosition, p1: Boolean): RunToCursorBreakpoint? defined in com.intellij.debugger.ui.breakpoints.BreakpointManager[JavaMethodDescriptor]

'position' @ [70:109] ==> val position: XSourcePositionImpl defined in org.jetbrains.kotlin.idea.debugger.stepping.createRunToCursorBreakpoint[LocalVariableDescriptor]

'ignoreBreakpoints' @ [70:119] ==> value-parameter ignoreBreakpoints: Boolean defined in org.jetbrains.kotlin.idea.debugger.stepping.createRunToCursorBreakpoint[ValueParameterDescriptorImpl]

'runToCursorBreakpoint' @ [74:5] ==> val runToCursorBreakpoint: RunToCursorBreakpoint defined in org.jetbrains.kotlin.idea.debugger.stepping.createRunToCursorBreakpoint[LocalVariableDescriptor]

'suspendPolicy' @ [74:27] ==> public final var RunToCursorBreakpoint.suspendPolicy: (String..String?)[MyPropertyDescriptor]

'when {
        context.suspendPolicy == EventRequest.SUSPEND_EVENT_THREAD -> DebuggerSettings.SUSPEND_THREAD
        else -> DebuggerSettings.SUSPEND_ALL
    }' @ [74:43] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (String..String?), entry1: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'context' @ [75:9] ==> value-parameter context: SuspendContextImpl defined in org.jetbrains.kotlin.idea.debugger.stepping.createRunToCursorBreakpoint[ValueParameterDescriptorImpl]

'suspendPolicy' @ [75:17] ==> public final val SuspendContextImpl.suspendPolicy: Int[MyPropertyDescriptor]

'SUSPEND_EVENT_THREAD' @ [75:47] ==> public const final val SUSPEND_EVENT_THREAD: Int defined in com.sun.jdi.request.EventRequest[JavaPropertyDescriptor]

'SUSPEND_THREAD' @ [75:88] ==> @NonNls public const final val SUSPEND_THREAD: String defined in com.intellij.debugger.settings.DebuggerSettings[JavaPropertyDescriptor]

'SUSPEND_ALL' @ [76:34] ==> @NonNls public const final val SUSPEND_ALL: String defined in com.intellij.debugger.settings.DebuggerSettings[JavaPropertyDescriptor]

'runToCursorBreakpoint' @ [79:5] ==> val runToCursorBreakpoint: RunToCursorBreakpoint defined in org.jetbrains.kotlin.idea.debugger.stepping.createRunToCursorBreakpoint[LocalVariableDescriptor]

'createRequest' @ [79:27] ==> public open fun createRequest(@NotNull p0: DebugProcessImpl): Unit defined in com.intellij.debugger.ui.breakpoints.RunToCursorBreakpoint[JavaMethodDescriptor]

'process' @ [79:41] ==> val process: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.stepping.createRunToCursorBreakpoint[LocalVariableDescriptor]

'process' @ [80:5] ==> val process: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.stepping.createRunToCursorBreakpoint[LocalVariableDescriptor]

'setRunToCursorBreakpoint' @ [80:13] ==> public open fun setRunToCursorBreakpoint(@Nullable p0: RunToCursorBreakpoint?): Unit defined in com.intellij.debugger.engine.DebugProcessImpl[JavaMethodDescriptor]

'runToCursorBreakpoint' @ [80:38] ==> val runToCursorBreakpoint: RunToCursorBreakpoint defined in org.jetbrains.kotlin.idea.debugger.stepping.createRunToCursorBreakpoint[LocalVariableDescriptor]

