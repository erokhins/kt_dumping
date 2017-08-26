'RequestHint' @ [34:45] ==> public constructor RequestHint(p0: (ThreadReferenceProxyImpl..ThreadReferenceProxyImpl?), p1: (SuspendContextImpl..SuspendContextImpl?), @NotNull p2: MethodFilter) defined in com.intellij.debugger.engine.RequestHint[JavaClassConstructorDescriptor]

'stepThread' @ [34:57] ==> value-parameter stepThread: ThreadReferenceProxyImpl defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinStepOverInlinedLinesHint.<init>[ValueParameterDescriptorImpl]

'suspendContext' @ [34:69] ==> value-parameter suspendContext: SuspendContextImpl defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinStepOverInlinedLinesHint.<init>[ValueParameterDescriptorImpl]

'methodFilter' @ [34:85] ==> value-parameter methodFilter: KotlinMethodFilter defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinStepOverInlinedLinesHint.<init>[ValueParameterDescriptorImpl]

'getInstance' @ [36:30] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'KotlinStepOverInlinedLinesHint' @ [36:42] ==> public constructor KotlinStepOverInlinedLinesHint(stepThread: ThreadReferenceProxyImpl, suspendContext: SuspendContextImpl, methodFilter: KotlinMethodFilter) defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinStepOverInlinedLinesHint[ClassConstructorDescriptorImpl]

'java' @ [36:80] ==> public val <T> KClass<KotlinStepOverInlinedLinesHint>.java: Class<KotlinStepOverInlinedLinesHint> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinStepOverInlinedLinesHint

'methodFilter' @ [38:26] ==> value-parameter methodFilter: KotlinMethodFilter defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinStepOverInlinedLinesHint.<init>[ValueParameterDescriptorImpl]

'STEP_OVER' @ [40:48] ==> public const final val STEP_OVER: Int defined in com.sun.jdi.request.StepRequest[JavaPropertyDescriptor]

'context' @ [44:30] ==> value-parameter context: SuspendContextImpl defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinStepOverInlinedLinesHint.getNextStepDepth[ValueParameterDescriptorImpl]

'frameProxy' @ [44:38] ==> public final val SuspendContextImpl.frameProxy: StackFrameProxyImpl?[MyPropertyDescriptor]

'frameProxy' @ [45:17] ==> val frameProxy: StackFrameProxyImpl? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinStepOverInlinedLinesHint.getNextStepDepth[LocalVariableDescriptor]

'isTheSameFrame' @ [46:21] ==> protected/*protected and package*/ open fun isTheSameFrame(p0: (SuspendContextImpl..SuspendContextImpl?)): Boolean defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinStepOverInlinedLinesHint[JavaMethodDescriptor]

'context' @ [46:36] ==> value-parameter context: SuspendContextImpl defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinStepOverInlinedLinesHint.getNextStepDepth[ValueParameterDescriptorImpl]

'if (filter.locationMatches(context, frameProxy.location())) {
                        STOP
                    }
                    else {
                        StepRequest.STEP_OVER
                    }' @ [47:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'filter' @ [47:32] ==> private final val filter: KotlinMethodFilter defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinStepOverInlinedLinesHint[PropertyDescriptorImpl]

'locationMatches' @ [47:39] ==> public abstract fun locationMatches(context: SuspendContextImpl, location: Location): Boolean defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinMethodFilter[SimpleFunctionDescriptorImpl]

'context' @ [47:55] ==> value-parameter context: SuspendContextImpl defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinStepOverInlinedLinesHint.getNextStepDepth[ValueParameterDescriptorImpl]

'frameProxy' @ [47:64] ==> val frameProxy: StackFrameProxyImpl? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinStepOverInlinedLinesHint.getNextStepDepth[LocalVariableDescriptor]

'location' @ [47:75] ==> public open fun location(): (Location..Location?) defined in com.intellij.debugger.jdi.StackFrameProxyImpl[JavaMethodDescriptor]

'STOP' @ [48:25] ==> public const final val STOP: Int defined in com.intellij.debugger.engine.RequestHint[JavaPropertyDescriptor]

'STEP_OVER' @ [51:37] ==> public const final val STEP_OVER: Int defined in com.sun.jdi.request.StepRequest[JavaPropertyDescriptor]

'isSteppedOut' @ [55:21] ==> protected/*protected and package*/ for synthetic extension final val KotlinStepOverInlinedLinesHint.isSteppedOut: Boolean[MyPropertyDescriptor]

'STOP' @ [56:28] ==> public const final val STOP: Int defined in com.intellij.debugger.engine.RequestHint[JavaPropertyDescriptor]

'STEP_OUT' @ [59:36] ==> public const final val STEP_OUT: Int defined in com.sun.jdi.request.StepRequest[JavaPropertyDescriptor]

'LOG' @ [65:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinStepOverInlinedLinesHint[PropertyDescriptorImpl]

'error' @ [65:17] ==> public open fun error(@NotNull p0: Throwable): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'e' @ [65:23] ==> val e: EvaluateException defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinStepOverInlinedLinesHint.getNextStepDepth[LocalVariableDescriptor]

'STOP' @ [68:16] ==> public const final val STOP: Int defined in com.intellij.debugger.engine.RequestHint[JavaPropertyDescriptor]

